package io.grpc.okhttp.internal;

import com.google.android.gms.security.ProviderInstaller;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.AccessController;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: b  reason: collision with root package name */
    public static final Logger f31548b = Logger.getLogger(h.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final String[] f31549c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* renamed from: d  reason: collision with root package name */
    private static final h f31550d = d();

    /* renamed from: a  reason: collision with root package name */
    private final Provider f31551a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements PrivilegedExceptionAction<Method> {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() {
            return SSLEngine.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class b implements PrivilegedExceptionAction<Method> {
        b() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() {
            return SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class c implements PrivilegedExceptionAction<Method> {
        c() {
        }

        @Override // java.security.PrivilegedExceptionAction
        /* renamed from: a */
        public Method run() {
            return SSLSocket.class.getMethod("getApplicationProtocol", new Class[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class d extends h {

        /* renamed from: e  reason: collision with root package name */
        private final io.grpc.okhttp.internal.g<Socket> f31552e;

        /* renamed from: f  reason: collision with root package name */
        private final io.grpc.okhttp.internal.g<Socket> f31553f;

        /* renamed from: g  reason: collision with root package name */
        private final io.grpc.okhttp.internal.g<Socket> f31554g;

        /* renamed from: h  reason: collision with root package name */
        private final io.grpc.okhttp.internal.g<Socket> f31555h;

        /* renamed from: i  reason: collision with root package name */
        private final EnumC0594h f31556i;

        public d(io.grpc.okhttp.internal.g<Socket> gVar, io.grpc.okhttp.internal.g<Socket> gVar2, Method method, Method method2, io.grpc.okhttp.internal.g<Socket> gVar3, io.grpc.okhttp.internal.g<Socket> gVar4, Provider provider, EnumC0594h enumC0594h) {
            super(provider);
            this.f31552e = gVar;
            this.f31553f = gVar2;
            this.f31554g = gVar3;
            this.f31555h = gVar4;
            this.f31556i = enumC0594h;
        }

        @Override // io.grpc.okhttp.internal.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            if (str != null) {
                this.f31552e.e(sSLSocket, Boolean.TRUE);
                this.f31553f.e(sSLSocket, str);
            }
            if (this.f31555h.g(sSLSocket)) {
                this.f31555h.f(sSLSocket, h.b(list));
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public String h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f31554g.g(sSLSocket) && (bArr = (byte[]) this.f31554g.f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, l.f31571b);
            }
            return null;
        }

        @Override // io.grpc.okhttp.internal.h
        public EnumC0594h i() {
            return this.f31556i;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class e extends h {

        /* renamed from: e  reason: collision with root package name */
        private final Method f31557e;

        /* renamed from: f  reason: collision with root package name */
        private final Method f31558f;

        /* synthetic */ e(Provider provider, Method method, Method method2, a aVar) {
            this(provider, method, method2);
        }

        @Override // io.grpc.okhttp.internal.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            for (i iVar : list) {
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f31557e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public String h(SSLSocket sSLSocket) {
            try {
                return (String) this.f31558f.invoke(sSLSocket, new Object[0]);
            } catch (IllegalAccessException e11) {
                throw new RuntimeException(e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException(e12);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public EnumC0594h i() {
            return EnumC0594h.ALPN_AND_NPN;
        }

        private e(Provider provider, Method method, Method method2) {
            super(provider);
            this.f31557e = method;
            this.f31558f = method2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class f extends h {

        /* renamed from: e  reason: collision with root package name */
        private final Method f31559e;

        /* renamed from: f  reason: collision with root package name */
        private final Method f31560f;

        /* renamed from: g  reason: collision with root package name */
        private final Method f31561g;

        /* renamed from: h  reason: collision with root package name */
        private final Class<?> f31562h;

        /* renamed from: i  reason: collision with root package name */
        private final Class<?> f31563i;

        public f(Method method, Method method2, Method method3, Class<?> cls, Class<?> cls2, Provider provider) {
            super(provider);
            this.f31559e = method;
            this.f31560f = method2;
            this.f31561g = method3;
            this.f31562h = cls;
            this.f31563i = cls2;
        }

        @Override // io.grpc.okhttp.internal.h
        public void a(SSLSocket sSLSocket) {
            try {
                this.f31561g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e11) {
                h.f31548b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e11);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public void c(SSLSocket sSLSocket, String str, List<i> list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                i iVar = list.get(i11);
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f31559e.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f31562h, this.f31563i}, new g(arrayList)));
            } catch (IllegalAccessException e11) {
                throw new AssertionError(e11);
            } catch (InvocationTargetException e12) {
                throw new AssertionError(e12);
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public String h(SSLSocket sSLSocket) {
            try {
                g gVar = (g) Proxy.getInvocationHandler(this.f31560f.invoke(null, sSLSocket));
                if (gVar.f31565b || gVar.f31566c != null) {
                    if (gVar.f31565b) {
                        return null;
                    }
                    return gVar.f31566c;
                }
                h.f31548b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                return null;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // io.grpc.okhttp.internal.h
        public EnumC0594h i() {
            return EnumC0594h.ALPN_AND_NPN;
        }
    }

    /* loaded from: classes5.dex */
    private static class g implements InvocationHandler {

        /* renamed from: a  reason: collision with root package name */
        private final List<String> f31564a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f31565b;

        /* renamed from: c  reason: collision with root package name */
        private String f31566c;

        public g(List<String> list) {
            this.f31564a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = l.f31570a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f31565b = true;
                return null;
            } else if (name.equals("protocols") && objArr.length == 0) {
                return this.f31564a;
            } else {
                if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1 && (objArr[0] instanceof List)) {
                    List list = (List) objArr[0];
                    int size = list.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        if (this.f31564a.contains(list.get(i11))) {
                            String str = (String) list.get(i11);
                            this.f31566c = str;
                            return str;
                        }
                    }
                    String str2 = this.f31564a.get(0);
                    this.f31566c = str2;
                    return str2;
                } else if ((name.equals("protocolSelected") || name.equals("selected")) && objArr.length == 1) {
                    this.f31566c = (String) objArr[0];
                    return null;
                } else {
                    return method.invoke(this, objArr);
                }
            }
        }
    }

    /* renamed from: io.grpc.okhttp.internal.h$h  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public enum EnumC0594h {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public h(Provider provider) {
        this.f31551a = provider;
    }

    public static byte[] b(List<i> list) {
        okio.f fVar = new okio.f();
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            i iVar = list.get(i11);
            if (iVar != i.HTTP_1_0) {
                fVar.O0(iVar.toString().length());
                fVar.T(iVar.toString());
            }
        }
        return fVar.K0();
    }

    private static h d() {
        Method method;
        Method method2;
        EnumC0594h enumC0594h;
        Class<?> cls;
        Provider f11 = f();
        if (f11 != null) {
            io.grpc.okhttp.internal.g gVar = new io.grpc.okhttp.internal.g(null, "setUseSessionTickets", Boolean.TYPE);
            io.grpc.okhttp.internal.g gVar2 = new io.grpc.okhttp.internal.g(null, "setHostname", String.class);
            io.grpc.okhttp.internal.g gVar3 = new io.grpc.okhttp.internal.g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            io.grpc.okhttp.internal.g gVar4 = new io.grpc.okhttp.internal.g(null, "setAlpnProtocols", byte[].class);
            try {
                cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                method = null;
            }
            try {
                method2 = cls.getMethod("untagSocket", Socket.class);
            } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                method2 = null;
                if (f11.getName().equals(ProviderInstaller.PROVIDER_NAME)) {
                }
                enumC0594h = EnumC0594h.ALPN_AND_NPN;
                return new d(gVar, gVar2, method, method2, gVar3, gVar4, f11, enumC0594h);
            }
            if (f11.getName().equals(ProviderInstaller.PROVIDER_NAME) && !f11.getName().equals("Conscrypt") && !f11.getName().equals("Ssl_Guard")) {
                if (k()) {
                    enumC0594h = EnumC0594h.ALPN_AND_NPN;
                } else if (j()) {
                    enumC0594h = EnumC0594h.NPN;
                } else {
                    enumC0594h = EnumC0594h.NONE;
                }
            } else {
                enumC0594h = EnumC0594h.ALPN_AND_NPN;
            }
            return new d(gVar, gVar2, method, method2, gVar3, gVar4, f11, enumC0594h);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                sSLContext.init(null, null, null);
                ((Method) AccessController.doPrivileged(new a())).invoke(sSLContext.createSSLEngine(), new Object[0]);
                return new e(provider, (Method) AccessController.doPrivileged(new b()), (Method) AccessController.doPrivileged(new c()), null);
            } catch (IllegalAccessException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException | PrivilegedActionException unused3) {
                try {
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                    Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                    return new f(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    return new h(provider);
                }
            }
        } catch (NoSuchAlgorithmException e11) {
            throw new RuntimeException(e11);
        }
    }

    public static h e() {
        return f31550d;
    }

    private static Provider f() {
        Provider[] providers;
        String[] strArr;
        for (Provider provider : Security.getProviders()) {
            for (String str : f31549c) {
                if (str.equals(provider.getClass().getName())) {
                    f31548b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        f31548b.log(Level.WARNING, "Unable to find Conscrypt");
        return null;
    }

    private static boolean j() {
        try {
            h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e11) {
            f31548b.log(Level.FINE, "Can't find class", (Throwable) e11);
            return false;
        }
    }

    private static boolean k() {
        try {
            h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e11) {
            f31548b.log(Level.FINE, "Can't find class", (Throwable) e11);
            return false;
        }
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List<i> list) {
    }

    public Provider g() {
        return this.f31551a;
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public EnumC0594h i() {
        return EnumC0594h.NONE;
    }
}