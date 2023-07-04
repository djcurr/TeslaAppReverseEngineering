package ch.qos.logback.core.net.ssl;

import java.net.InetAddress;
import java.net.ServerSocket;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLServerSocket;
import javax.net.ssl.SSLServerSocketFactory;

/* loaded from: classes.dex */
public class ConfigurableSSLServerSocketFactory extends ServerSocketFactory {
    private final SSLServerSocketFactory delegate;
    private final SSLParametersConfiguration parameters;

    public ConfigurableSSLServerSocketFactory(SSLParametersConfiguration sSLParametersConfiguration, SSLServerSocketFactory sSLServerSocketFactory) {
        this.parameters = sSLParametersConfiguration;
        this.delegate = sSLServerSocketFactory;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i11) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.delegate.createServerSocket(i11);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i11, int i12) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.delegate.createServerSocket(i11, i12);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }

    @Override // javax.net.ServerSocketFactory
    public ServerSocket createServerSocket(int i11, int i12, InetAddress inetAddress) {
        SSLServerSocket sSLServerSocket = (SSLServerSocket) this.delegate.createServerSocket(i11, i12, inetAddress);
        this.parameters.configure(new SSLConfigurableServerSocket(sSLServerSocket));
        return sSLServerSocket;
    }
}