package ch.qos.logback.core.net.server;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.util.CloseUtil;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.BlockingQueue;

/* loaded from: classes.dex */
class RemoteReceiverStreamClient extends ContextAwareBase implements RemoteReceiverClient {
    private final String clientId;
    private final OutputStream outputStream;
    private BlockingQueue<Serializable> queue;
    private final Socket socket;

    RemoteReceiverStreamClient(String str, OutputStream outputStream) {
        this.clientId = "client " + str + ": ";
        this.socket = null;
        this.outputStream = outputStream;
    }

    public RemoteReceiverStreamClient(String str, Socket socket) {
        this.clientId = "client " + str + ": ";
        this.socket = socket;
        this.outputStream = null;
    }

    private ObjectOutputStream createObjectOutputStream() {
        return this.socket == null ? new ObjectOutputStream(this.outputStream) : new ObjectOutputStream(this.socket.getOutputStream());
    }

    @Override // ch.qos.logback.core.net.server.Client, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Socket socket = this.socket;
        if (socket == null) {
            return;
        }
        CloseUtil.closeQuietly(socket);
    }

    @Override // ch.qos.logback.core.net.server.RemoteReceiverClient
    public boolean offer(Serializable serializable) {
        BlockingQueue<Serializable> blockingQueue = this.queue;
        if (blockingQueue != null) {
            return blockingQueue.offer(serializable);
        }
        throw new IllegalStateException("client has no event queue");
    }

    @Override // java.lang.Runnable
    public void run() {
        StringBuilder sb2;
        addInfo(this.clientId + "connected");
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                try {
                    try {
                        objectOutputStream = createObjectOutputStream();
                        loop0: while (true) {
                            int i11 = 0;
                            while (!Thread.currentThread().isInterrupted()) {
                                try {
                                    objectOutputStream.writeObject(this.queue.take());
                                    objectOutputStream.flush();
                                    i11++;
                                } catch (InterruptedException unused) {
                                }
                                if (i11 >= 70) {
                                    try {
                                        objectOutputStream.reset();
                                        break;
                                    } catch (InterruptedException unused2) {
                                        i11 = 0;
                                        Thread.currentThread().interrupt();
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                        if (objectOutputStream != null) {
                            CloseUtil.closeQuietly(objectOutputStream);
                        }
                        close();
                        sb2 = new StringBuilder();
                    } catch (IOException e11) {
                        addError(this.clientId + e11);
                        if (objectOutputStream != null) {
                            CloseUtil.closeQuietly(objectOutputStream);
                        }
                        close();
                        sb2 = new StringBuilder();
                    }
                } catch (RuntimeException e12) {
                    addError(this.clientId + e12);
                    if (objectOutputStream != null) {
                        CloseUtil.closeQuietly(objectOutputStream);
                    }
                    close();
                    sb2 = new StringBuilder();
                }
            } catch (SocketException e13) {
                addInfo(this.clientId + e13);
                if (objectOutputStream != null) {
                    CloseUtil.closeQuietly(objectOutputStream);
                }
                close();
                sb2 = new StringBuilder();
            }
            sb2.append(this.clientId);
            sb2.append("connection closed");
            addInfo(sb2.toString());
        } catch (Throwable th2) {
            if (objectOutputStream != null) {
                CloseUtil.closeQuietly(objectOutputStream);
            }
            close();
            addInfo(this.clientId + "connection closed");
            throw th2;
        }
    }

    @Override // ch.qos.logback.core.net.server.RemoteReceiverClient
    public void setQueue(BlockingQueue<Serializable> blockingQueue) {
        this.queue = blockingQueue;
    }
}