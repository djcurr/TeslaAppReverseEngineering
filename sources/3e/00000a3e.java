package atd.a;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
final class k extends SSLSocketFactory {

    /* renamed from: a  reason: collision with root package name */
    private final SSLSocketFactory f6766a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f6767b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public k() {
        SSLContext sSLContext = SSLContext.getInstance(atd.s0.a.a(-101385661901376L));
        sSLContext.init(null, null, null);
        this.f6766a = sSLContext.getSocketFactory();
        this.f6767b = new String[]{atd.s0.a.a(-101402841770560L)};
    }

    private Socket a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(this.f6767b);
        }
        return socket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket() {
        return a(this.f6766a.createSocket());
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getDefaultCipherSuites() {
        return this.f6766a.getDefaultCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public String[] getSupportedCipherSuites() {
        return this.f6766a.getSupportedCipherSuites();
    }

    @Override // javax.net.ssl.SSLSocketFactory
    public Socket createSocket(Socket socket, String str, int i11, boolean z11) {
        return a(this.f6766a.createSocket(socket, str, i11, z11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11) {
        return a(this.f6766a.createSocket(str, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) {
        return a(this.f6766a.createSocket(str, i11, inetAddress, i12));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11) {
        return a(this.f6766a.createSocket(inetAddress, i11));
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) {
        return a(this.f6766a.createSocket(inetAddress, i11, inetAddress2, i12));
    }
}