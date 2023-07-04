package mx;

import com.google.common.base.u;
import io.grpc.internal.q0;
import io.grpc.okhttp.internal.h;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public class j {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f39606b = Logger.getLogger(j.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final io.grpc.okhttp.internal.h f39607c = io.grpc.okhttp.internal.h.e();

    /* renamed from: d  reason: collision with root package name */
    private static j f39608d = d(j.class.getClassLoader());

    /* renamed from: a  reason: collision with root package name */
    protected final io.grpc.okhttp.internal.h f39609a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends j {

        /* renamed from: e  reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f39610e;

        /* renamed from: f  reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f39611f;

        /* renamed from: g  reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f39612g;

        /* renamed from: h  reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f39613h;

        /* renamed from: i  reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f39614i;

        /* renamed from: j  reason: collision with root package name */
        private static final io.grpc.okhttp.internal.g<Socket> f39615j;

        /* renamed from: k  reason: collision with root package name */
        private static final Method f39616k;

        /* renamed from: l  reason: collision with root package name */
        private static final Method f39617l;

        /* renamed from: m  reason: collision with root package name */
        private static final Method f39618m;

        /* renamed from: n  reason: collision with root package name */
        private static final Method f39619n;

        /* renamed from: o  reason: collision with root package name */
        private static final Method f39620o;

        /* renamed from: p  reason: collision with root package name */
        private static final Method f39621p;

        /* renamed from: q  reason: collision with root package name */
        private static final Constructor<?> f39622q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            Method method6;
            Class<?> cls = Boolean.TYPE;
            Constructor<?> constructor = null;
            f39610e = new io.grpc.okhttp.internal.g<>(null, "setUseSessionTickets", cls);
            f39611f = new io.grpc.okhttp.internal.g<>(null, "setHostname", String.class);
            f39612g = new io.grpc.okhttp.internal.g<>(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f39613h = new io.grpc.okhttp.internal.g<>(null, "setAlpnProtocols", byte[].class);
            f39614i = new io.grpc.okhttp.internal.g<>(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f39615j = new io.grpc.okhttp.internal.g<>(null, "setNpnProtocols", byte[].class);
            try {
                method2 = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
                try {
                    method = SSLParameters.class.getMethod("getApplicationProtocols", new Class[0]);
                } catch (ClassNotFoundException e11) {
                    e = e11;
                    method = null;
                    method3 = null;
                } catch (NoSuchMethodException e12) {
                    e = e12;
                    method = null;
                    method3 = null;
                }
            } catch (ClassNotFoundException e13) {
                e = e13;
                method = null;
                method2 = null;
                method3 = null;
            } catch (NoSuchMethodException e14) {
                e = e14;
                method = null;
                method2 = null;
                method3 = null;
            }
            try {
                method3 = SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
                try {
                    Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                    method4 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                    try {
                        method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                    } catch (ClassNotFoundException e15) {
                        e = e15;
                        j.f39606b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f39618m = method2;
                        f39619n = method;
                        f39620o = method3;
                        f39616k = method4;
                        f39617l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        try {
                            constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        } catch (ClassNotFoundException e16) {
                            e = e16;
                            j.f39606b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                            f39621p = method6;
                            f39622q = constructor;
                        } catch (NoSuchMethodException e17) {
                            e = e17;
                            j.f39606b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e);
                            f39621p = method6;
                            f39622q = constructor;
                        }
                        f39621p = method6;
                        f39622q = constructor;
                    } catch (NoSuchMethodException e18) {
                        e = e18;
                        j.f39606b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                        f39618m = method2;
                        f39619n = method;
                        f39620o = method3;
                        f39616k = method4;
                        f39617l = method5;
                        method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                        constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                        f39621p = method6;
                        f39622q = constructor;
                    }
                } catch (ClassNotFoundException e19) {
                    e = e19;
                    method4 = null;
                } catch (NoSuchMethodException e21) {
                    e = e21;
                    method4 = null;
                }
            } catch (ClassNotFoundException e22) {
                e = e22;
                method3 = null;
                method4 = method3;
                j.f39606b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f39618m = method2;
                f39619n = method;
                f39620o = method3;
                f39616k = method4;
                f39617l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f39621p = method6;
                f39622q = constructor;
            } catch (NoSuchMethodException e23) {
                e = e23;
                method3 = null;
                method4 = method3;
                j.f39606b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f39618m = method2;
                f39619n = method;
                f39620o = method3;
                f39616k = method4;
                f39617l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f39621p = method6;
                f39622q = constructor;
            }
            f39618m = method2;
            f39619n = method;
            f39620o = method3;
            f39616k = method4;
            f39617l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e24) {
                e = e24;
                method6 = null;
            } catch (NoSuchMethodException e25) {
                e = e25;
                method6 = null;
            }
            f39621p = method6;
            f39622q = constructor;
        }

        a(io.grpc.okhttp.internal.h hVar) {
            super(hVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ce  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
        @Override // mx.j
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        protected void c(javax.net.ssl.SSLSocket r9, java.lang.String r10, java.util.List<io.grpc.okhttp.internal.i> r11) {
            /*
                Method dump skipped, instructions count: 241
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mx.j.a.c(javax.net.ssl.SSLSocket, java.lang.String, java.util.List):void");
        }

        @Override // mx.j
        public String f(SSLSocket sSLSocket) {
            Method method = f39620o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, new Object[0]);
                } catch (IllegalAccessException e11) {
                    throw new RuntimeException(e11);
                } catch (InvocationTargetException e12) {
                    if (e12.getTargetException() instanceof UnsupportedOperationException) {
                        j.f39606b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                    } else {
                        throw new RuntimeException(e12);
                    }
                }
            }
            if (this.f39609a.i() == h.EnumC0594h.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f39612g.f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, io.grpc.okhttp.internal.l.f31571b);
                    }
                } catch (Exception e13) {
                    j.f39606b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e13);
                }
            }
            if (this.f39609a.i() != h.EnumC0594h.NONE) {
                try {
                    byte[] bArr2 = (byte[]) f39614i.f(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, io.grpc.okhttp.internal.l.f31571b);
                    }
                    return null;
                } catch (Exception e14) {
                    j.f39606b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e14);
                    return null;
                }
            }
            return null;
        }

        @Override // mx.j
        public String h(SSLSocket sSLSocket, String str, List<io.grpc.okhttp.internal.i> list) {
            String f11 = f(sSLSocket);
            return f11 == null ? super.h(sSLSocket, str, list) : f11;
        }
    }

    j(io.grpc.okhttp.internal.h hVar) {
        this.f39609a = (io.grpc.okhttp.internal.h) u.p(hVar, "platform");
    }

    static j d(ClassLoader classLoader) {
        boolean z11;
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e11) {
            f39606b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e11);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e12) {
                f39606b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e12);
                z11 = false;
            }
        }
        z11 = true;
        if (z11) {
            return new a(f39607c);
        }
        return new j(f39607c);
    }

    public static j e() {
        return f39608d;
    }

    static boolean g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            q0.c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] i(List<io.grpc.okhttp.internal.i> list) {
        ArrayList arrayList = new ArrayList();
        for (io.grpc.okhttp.internal.i iVar : list) {
            arrayList.add(iVar.toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    protected void c(SSLSocket sSLSocket, String str, List<io.grpc.okhttp.internal.i> list) {
        this.f39609a.c(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        return this.f39609a.h(sSLSocket);
    }

    public String h(SSLSocket sSLSocket, String str, List<io.grpc.okhttp.internal.i> list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String f11 = f(sSLSocket);
            if (f11 != null) {
                return f11;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f39609a.a(sSLSocket);
        }
    }
}