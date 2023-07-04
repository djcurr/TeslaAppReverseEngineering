package ch.qos.logback.classic.net;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.net.server.HardenedLoggingEventInputStream;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.net.DefaultSocketConnector;
import ch.qos.logback.core.net.SocketConnector;
import ch.qos.logback.core.util.CloseUtil;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public class SocketReceiver extends ReceiverBase implements Runnable, SocketConnector.ExceptionHandler {
    private static final int DEFAULT_ACCEPT_CONNECTION_DELAY = 5000;
    private int acceptConnectionTimeout = 5000;
    private InetAddress address;
    private Future<Socket> connectorTask;
    private int port;
    private String receiverId;
    private int reconnectionDelay;
    private String remoteHost;
    private volatile Socket socket;

    private Future<Socket> activateConnector(SocketConnector socketConnector) {
        try {
            return getContext().getScheduledExecutorService().submit(socketConnector);
        } catch (RejectedExecutionException unused) {
            return null;
        }
    }

    private SocketConnector createConnector(InetAddress inetAddress, int i11, int i12, int i13) {
        SocketConnector newConnector = newConnector(inetAddress, i11, i12, i13);
        newConnector.setExceptionHandler(this);
        newConnector.setSocketFactory(getSocketFactory());
        return newConnector;
    }

    private void dispatchEvents(LoggerContext loggerContext) {
        HardenedLoggingEventInputStream hardenedLoggingEventInputStream;
        StringBuilder sb2;
        try {
            try {
                this.socket.setSoTimeout(this.acceptConnectionTimeout);
                hardenedLoggingEventInputStream = new HardenedLoggingEventInputStream(this.socket.getInputStream());
            } catch (EOFException unused) {
                hardenedLoggingEventInputStream = null;
            } catch (IOException e11) {
                e = e11;
                hardenedLoggingEventInputStream = null;
            } catch (ClassNotFoundException e12) {
                e = e12;
                hardenedLoggingEventInputStream = null;
            } catch (Throwable th2) {
                th = th2;
                CloseUtil.closeQuietly((Closeable) null);
                CloseUtil.closeQuietly(this.socket);
                this.socket = null;
                addInfo(this.receiverId + "connection closed");
                throw th;
            }
            try {
                this.socket.setSoTimeout(0);
                addInfo(this.receiverId + "connection established");
                while (true) {
                    ILoggingEvent iLoggingEvent = (ILoggingEvent) hardenedLoggingEventInputStream.readObject();
                    Logger logger = loggerContext.getLogger(iLoggingEvent.getLoggerName());
                    if (logger.isEnabledFor(iLoggingEvent.getLevel())) {
                        logger.callAppenders(iLoggingEvent);
                    }
                }
            } catch (EOFException unused2) {
                addInfo(this.receiverId + "end-of-stream detected");
                CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                CloseUtil.closeQuietly(this.socket);
                this.socket = null;
                sb2 = new StringBuilder();
                sb2.append(this.receiverId);
                sb2.append("connection closed");
                addInfo(sb2.toString());
            } catch (IOException e13) {
                e = e13;
                addInfo(this.receiverId + "connection failed: " + e);
                CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                CloseUtil.closeQuietly(this.socket);
                this.socket = null;
                sb2 = new StringBuilder();
                sb2.append(this.receiverId);
                sb2.append("connection closed");
                addInfo(sb2.toString());
            } catch (ClassNotFoundException e14) {
                e = e14;
                addInfo(this.receiverId + "unknown event class: " + e);
                CloseUtil.closeQuietly(hardenedLoggingEventInputStream);
                CloseUtil.closeQuietly(this.socket);
                this.socket = null;
                sb2 = new StringBuilder();
                sb2.append(this.receiverId);
                sb2.append("connection closed");
                addInfo(sb2.toString());
            }
        } catch (Throwable th3) {
            th = th3;
            CloseUtil.closeQuietly((Closeable) null);
            CloseUtil.closeQuietly(this.socket);
            this.socket = null;
            addInfo(this.receiverId + "connection closed");
            throw th;
        }
    }

    private Socket waitForConnectorToReturnASocket() {
        try {
            Socket socket = this.connectorTask.get();
            this.connectorTask = null;
            return socket;
        } catch (ExecutionException unused) {
            return null;
        }
    }

    @Override // ch.qos.logback.core.net.SocketConnector.ExceptionHandler
    public void connectionFailed(SocketConnector socketConnector, Exception exc) {
        StringBuilder sb2;
        String str;
        String sb3;
        if (exc instanceof InterruptedException) {
            sb3 = "connector interrupted";
        } else {
            if (exc instanceof ConnectException) {
                sb2 = new StringBuilder();
                sb2.append(this.receiverId);
                str = "connection refused";
            } else {
                sb2 = new StringBuilder();
                sb2.append(this.receiverId);
                str = "unspecified error";
            }
            sb2.append(str);
            sb3 = sb2.toString();
        }
        addWarn(sb3, exc);
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    protected Runnable getRunnableTask() {
        return this;
    }

    protected SocketFactory getSocketFactory() {
        return SocketFactory.getDefault();
    }

    protected SocketConnector newConnector(InetAddress inetAddress, int i11, int i12, int i13) {
        return new DefaultSocketConnector(inetAddress, i11, i12, i13);
    }

    @Override // ch.qos.logback.classic.net.ReceiverBase
    protected void onStop() {
        if (this.socket != null) {
            CloseUtil.closeQuietly(this.socket);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            LoggerContext loggerContext = (LoggerContext) getContext();
            while (!Thread.currentThread().isInterrupted()) {
                Future<Socket> activateConnector = activateConnector(createConnector(this.address, this.port, 0, this.reconnectionDelay));
                this.connectorTask = activateConnector;
                if (activateConnector == null) {
                    break;
                }
                this.socket = waitForConnectorToReturnASocket();
                if (this.socket == null) {
                    break;
                }
                dispatchEvents(loggerContext);
            }
        } catch (InterruptedException unused) {
        }
        addInfo("shutting down");
    }

    public void setAcceptConnectionTimeout(int i11) {
        this.acceptConnectionTimeout = i11;
    }

    public void setPort(int i11) {
        this.port = i11;
    }

    public void setReconnectionDelay(int i11) {
        this.reconnectionDelay = i11;
    }

    public void setRemoteHost(String str) {
        this.remoteHost = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ch.qos.logback.classic.net.ReceiverBase
    public boolean shouldStart() {
        int i11;
        if (this.port == 0) {
            addError("No port was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_port");
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (this.remoteHost == null) {
            i11++;
            addError("No host name or address was configured for receiver. For more information, please visit http://logback.qos.ch/codes.html#receiver_no_host");
        }
        if (this.reconnectionDelay == 0) {
            this.reconnectionDelay = 30000;
        }
        if (i11 == 0) {
            try {
                this.address = InetAddress.getByName(this.remoteHost);
            } catch (UnknownHostException unused) {
                addError("unknown host: " + this.remoteHost);
                i11++;
            }
        }
        if (i11 == 0) {
            this.receiverId = "receiver " + this.remoteHost + ":" + this.port + ": ";
        }
        return i11 == 0;
    }
}