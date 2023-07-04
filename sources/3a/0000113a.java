package ch.qos.logback.core.net.server;

import ch.qos.logback.core.AppenderBase;
import ch.qos.logback.core.net.AbstractSocketAppender;
import ch.qos.logback.core.spi.PreSerializationTransformer;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.util.concurrent.Executor;
import javax.net.ServerSocketFactory;

/* loaded from: classes.dex */
public abstract class ServerSocketAppenderBase<E> extends AppenderBase<E> {
    public static final int DEFAULT_BACKLOG = 50;
    public static final int DEFAULT_CLIENT_QUEUE_SIZE = 100;
    private String address;
    private ServerRunner<RemoteReceiverClient> runner;
    private int port = AbstractSocketAppender.DEFAULT_PORT;
    private int backlog = 50;
    private int clientQueueSize = 100;

    @Override // ch.qos.logback.core.AppenderBase
    protected void append(E e11) {
        if (e11 == null) {
            return;
        }
        postProcessEvent(e11);
        final Serializable transform = getPST().transform(e11);
        this.runner.accept(new ClientVisitor<RemoteReceiverClient>() { // from class: ch.qos.logback.core.net.server.ServerSocketAppenderBase.1
            @Override // ch.qos.logback.core.net.server.ClientVisitor
            public void visit(RemoteReceiverClient remoteReceiverClient) {
                remoteReceiverClient.offer(transform);
            }
        });
    }

    protected ServerListener<RemoteReceiverClient> createServerListener(ServerSocket serverSocket) {
        return new RemoteReceiverServerListener(serverSocket);
    }

    protected ServerRunner<RemoteReceiverClient> createServerRunner(ServerListener<RemoteReceiverClient> serverListener, Executor executor) {
        return new RemoteReceiverServerRunner(serverListener, executor, getClientQueueSize());
    }

    public String getAddress() {
        return this.address;
    }

    public Integer getBacklog() {
        return Integer.valueOf(this.backlog);
    }

    public int getClientQueueSize() {
        return this.clientQueueSize;
    }

    protected InetAddress getInetAddress() {
        if (getAddress() == null) {
            return null;
        }
        return InetAddress.getByName(getAddress());
    }

    protected abstract PreSerializationTransformer<E> getPST();

    public int getPort() {
        return this.port;
    }

    protected ServerSocketFactory getServerSocketFactory() {
        return ServerSocketFactory.getDefault();
    }

    protected abstract void postProcessEvent(E e11);

    public void setAddress(String str) {
        this.address = str;
    }

    public void setBacklog(Integer num) {
        this.backlog = num.intValue();
    }

    public void setClientQueueSize(int i11) {
        this.clientQueueSize = i11;
    }

    public void setPort(int i11) {
        this.port = i11;
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        if (isStarted()) {
            return;
        }
        try {
            ServerRunner<RemoteReceiverClient> createServerRunner = createServerRunner(createServerListener(getServerSocketFactory().createServerSocket(getPort(), getBacklog().intValue(), getInetAddress())), getContext().getScheduledExecutorService());
            this.runner = createServerRunner;
            createServerRunner.setContext(getContext());
            getContext().getScheduledExecutorService().execute(this.runner);
            super.start();
        } catch (Exception e11) {
            addError("server startup error: " + e11, e11);
        }
    }

    @Override // ch.qos.logback.core.AppenderBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        if (isStarted()) {
            try {
                this.runner.stop();
                super.stop();
            } catch (IOException e11) {
                addError("server shutdown error: " + e11, e11);
            }
        }
    }
}