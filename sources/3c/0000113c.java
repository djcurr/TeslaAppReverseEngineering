package ch.qos.logback.core.net.server;

import ch.qos.logback.core.net.server.Client;
import ch.qos.logback.core.util.CloseUtil;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

/* loaded from: classes.dex */
public abstract class ServerSocketListener<T extends Client> implements ServerListener<T> {
    private final ServerSocket serverSocket;

    public ServerSocketListener(ServerSocket serverSocket) {
        this.serverSocket = serverSocket;
    }

    private String socketAddressToString(SocketAddress socketAddress) {
        String obj = socketAddress.toString();
        int indexOf = obj.indexOf("/");
        return indexOf >= 0 ? obj.substring(indexOf + 1) : obj;
    }

    @Override // ch.qos.logback.core.net.server.ServerListener
    public T acceptClient() {
        Socket accept = this.serverSocket.accept();
        return createClient(socketAddressToString(accept.getRemoteSocketAddress()), accept);
    }

    @Override // ch.qos.logback.core.net.server.ServerListener, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        CloseUtil.closeQuietly(this.serverSocket);
    }

    protected abstract T createClient(String str, Socket socket);

    public String toString() {
        return socketAddressToString(this.serverSocket.getLocalSocketAddress());
    }
}