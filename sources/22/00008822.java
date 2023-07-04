package mx;

import com.google.common.base.u;
import java.net.Socket;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* loaded from: classes5.dex */
final class m {

    /* renamed from: a  reason: collision with root package name */
    static final List<io.grpc.okhttp.internal.i> f39624a = Collections.unmodifiableList(Arrays.asList(io.grpc.okhttp.internal.i.HTTP_2));

    static String a(String str) {
        return (str.startsWith("[") && str.endsWith("]")) ? str.substring(1, str.length() - 1) : str;
    }

    public static SSLSocket b(SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, Socket socket, String str, int i11, io.grpc.okhttp.internal.b bVar) {
        u.p(sSLSocketFactory, "sslSocketFactory");
        u.p(socket, "socket");
        u.p(bVar, "spec");
        SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket, str, i11, true);
        bVar.c(sSLSocket, false);
        String h11 = j.e().h(sSLSocket, str, bVar.f() ? f39624a : null);
        List<io.grpc.okhttp.internal.i> list = f39624a;
        boolean contains = list.contains(io.grpc.okhttp.internal.i.get(h11));
        u.x(contains, "Only " + list + " are supported, but negotiated protocol is %s", h11);
        if (hostnameVerifier == null) {
            hostnameVerifier = io.grpc.okhttp.internal.f.f31543a;
        }
        if (hostnameVerifier.verify(a(str), sSLSocket.getSession())) {
            return sSLSocket;
        }
        throw new SSLPeerUnverifiedException("Cannot verify hostname: " + str);
    }
}