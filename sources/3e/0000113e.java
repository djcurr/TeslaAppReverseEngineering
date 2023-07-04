package ch.qos.logback.core.net.ssl;

import java.net.InetAddress;
import java.net.Socket;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes.dex */
public class ConfigurableSSLSocketFactory extends SocketFactory {
    private final SSLSocketFactory delegate;
    private final SSLParametersConfiguration parameters;

    public ConfigurableSSLSocketFactory(SSLParametersConfiguration sSLParametersConfiguration, SSLSocketFactory sSLSocketFactory) {
        this.parameters = sSLParametersConfiguration;
        this.delegate = sSLSocketFactory;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(str, i11);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(String str, int i11, InetAddress inetAddress, int i12) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(str, i11, inetAddress, i12);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(inetAddress, i11);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }

    @Override // javax.net.SocketFactory
    public Socket createSocket(InetAddress inetAddress, int i11, InetAddress inetAddress2, int i12) {
        SSLSocket sSLSocket = (SSLSocket) this.delegate.createSocket(inetAddress, i11, inetAddress2, i12);
        this.parameters.configure(new SSLConfigurableSocket(sSLSocket));
        return sSLSocket;
    }
}