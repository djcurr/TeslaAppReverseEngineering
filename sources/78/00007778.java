package io.grpc.okhttp.internal;

import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: e  reason: collision with root package name */
    private static final io.grpc.okhttp.internal.a[] f31524e;

    /* renamed from: f  reason: collision with root package name */
    public static final b f31525f;

    /* renamed from: a  reason: collision with root package name */
    final boolean f31526a;

    /* renamed from: b  reason: collision with root package name */
    private final String[] f31527b;

    /* renamed from: c  reason: collision with root package name */
    private final String[] f31528c;

    /* renamed from: d  reason: collision with root package name */
    final boolean f31529d;

    static {
        io.grpc.okhttp.internal.a[] aVarArr = {io.grpc.okhttp.internal.a.TLS_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA, io.grpc.okhttp.internal.a.TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_128_GCM_SHA256, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_256_GCM_SHA384, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_128_CBC_SHA, io.grpc.okhttp.internal.a.TLS_RSA_WITH_AES_256_CBC_SHA, io.grpc.okhttp.internal.a.TLS_RSA_WITH_3DES_EDE_CBC_SHA};
        f31524e = aVarArr;
        C0593b f11 = new C0593b(true).f(aVarArr);
        k kVar = k.TLS_1_3;
        k kVar2 = k.TLS_1_2;
        b e11 = f11.i(kVar, kVar2).h(true).e();
        f31525f = e11;
        new C0593b(e11).i(kVar, kVar2, k.TLS_1_1, k.TLS_1_0).h(true).e();
        new C0593b(false).e();
    }

    private b e(SSLSocket sSLSocket, boolean z11) {
        String[] strArr;
        if (this.f31527b != null) {
            strArr = (String[]) l.c(String.class, this.f31527b, sSLSocket.getEnabledCipherSuites());
        } else {
            strArr = null;
        }
        if (z11 && Arrays.asList(sSLSocket.getSupportedCipherSuites()).contains("TLS_FALLBACK_SCSV")) {
            if (strArr == null) {
                strArr = sSLSocket.getEnabledCipherSuites();
            }
            int length = strArr.length + 1;
            String[] strArr2 = new String[length];
            System.arraycopy(strArr, 0, strArr2, 0, strArr.length);
            strArr2[length - 1] = "TLS_FALLBACK_SCSV";
            strArr = strArr2;
        }
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        return new C0593b(this).g(strArr).j((String[]) l.c(String.class, this.f31528c, enabledProtocols)).e();
    }

    public void c(SSLSocket sSLSocket, boolean z11) {
        b e11 = e(sSLSocket, z11);
        sSLSocket.setEnabledProtocols(e11.f31528c);
        String[] strArr = e11.f31527b;
        if (strArr != null) {
            sSLSocket.setEnabledCipherSuites(strArr);
        }
    }

    public List<io.grpc.okhttp.internal.a> d() {
        String[] strArr = this.f31527b;
        if (strArr == null) {
            return null;
        }
        io.grpc.okhttp.internal.a[] aVarArr = new io.grpc.okhttp.internal.a[strArr.length];
        int i11 = 0;
        while (true) {
            String[] strArr2 = this.f31527b;
            if (i11 < strArr2.length) {
                aVarArr[i11] = io.grpc.okhttp.internal.a.forJavaName(strArr2[i11]);
                i11++;
            } else {
                return l.a(aVarArr);
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof b) {
            if (obj == this) {
                return true;
            }
            b bVar = (b) obj;
            boolean z11 = this.f31526a;
            if (z11 != bVar.f31526a) {
                return false;
            }
            return !z11 || (Arrays.equals(this.f31527b, bVar.f31527b) && Arrays.equals(this.f31528c, bVar.f31528c) && this.f31529d == bVar.f31529d);
        }
        return false;
    }

    public boolean f() {
        return this.f31529d;
    }

    public List<k> g() {
        k[] kVarArr = new k[this.f31528c.length];
        int i11 = 0;
        while (true) {
            String[] strArr = this.f31528c;
            if (i11 < strArr.length) {
                kVarArr[i11] = k.forJavaName(strArr[i11]);
                i11++;
            } else {
                return l.a(kVarArr);
            }
        }
    }

    public int hashCode() {
        if (this.f31526a) {
            return ((((527 + Arrays.hashCode(this.f31527b)) * 31) + Arrays.hashCode(this.f31528c)) * 31) + (!this.f31529d ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (this.f31526a) {
            List<io.grpc.okhttp.internal.a> d11 = d();
            String obj = d11 == null ? "[use default]" : d11.toString();
            return "ConnectionSpec(cipherSuites=" + obj + ", tlsVersions=" + g() + ", supportsTlsExtensions=" + this.f31529d + ")";
        }
        return "ConnectionSpec()";
    }

    /* renamed from: io.grpc.okhttp.internal.b$b  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C0593b {

        /* renamed from: a  reason: collision with root package name */
        private boolean f31530a;

        /* renamed from: b  reason: collision with root package name */
        private String[] f31531b;

        /* renamed from: c  reason: collision with root package name */
        private String[] f31532c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f31533d;

        public C0593b(boolean z11) {
            this.f31530a = z11;
        }

        public b e() {
            return new b(this);
        }

        public C0593b f(io.grpc.okhttp.internal.a... aVarArr) {
            if (this.f31530a) {
                String[] strArr = new String[aVarArr.length];
                for (int i11 = 0; i11 < aVarArr.length; i11++) {
                    strArr[i11] = aVarArr[i11].javaName;
                }
                this.f31531b = strArr;
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public C0593b g(String... strArr) {
            if (this.f31530a) {
                if (strArr == null) {
                    this.f31531b = null;
                } else {
                    this.f31531b = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public C0593b h(boolean z11) {
            if (this.f31530a) {
                this.f31533d = z11;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public C0593b i(k... kVarArr) {
            if (this.f31530a) {
                if (kVarArr.length != 0) {
                    String[] strArr = new String[kVarArr.length];
                    for (int i11 = 0; i11 < kVarArr.length; i11++) {
                        strArr[i11] = kVarArr[i11].javaName;
                    }
                    this.f31532c = strArr;
                    return this;
                }
                throw new IllegalArgumentException("At least one TlsVersion is required");
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public C0593b j(String... strArr) {
            if (this.f31530a) {
                if (strArr == null) {
                    this.f31532c = null;
                } else {
                    this.f31532c = (String[]) strArr.clone();
                }
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public C0593b(b bVar) {
            this.f31530a = bVar.f31526a;
            this.f31531b = bVar.f31527b;
            this.f31532c = bVar.f31528c;
            this.f31533d = bVar.f31529d;
        }
    }

    private b(C0593b c0593b) {
        this.f31526a = c0593b.f31530a;
        this.f31527b = c0593b.f31531b;
        this.f31528c = c0593b.f31532c;
        this.f31529d = c0593b.f31533d;
    }
}