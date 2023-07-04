package yo;

import com.google.zxing.FormatException;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: h  reason: collision with root package name */
    private static final e[] f59659h = a();

    /* renamed from: a  reason: collision with root package name */
    private final int f59660a;

    /* renamed from: b  reason: collision with root package name */
    private final int f59661b;

    /* renamed from: c  reason: collision with root package name */
    private final int f59662c;

    /* renamed from: d  reason: collision with root package name */
    private final int f59663d;

    /* renamed from: e  reason: collision with root package name */
    private final int f59664e;

    /* renamed from: f  reason: collision with root package name */
    private final c f59665f;

    /* renamed from: g  reason: collision with root package name */
    private final int f59666g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final int f59667a;

        /* renamed from: b  reason: collision with root package name */
        private final int f59668b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public int a() {
            return this.f59667a;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f59668b;
        }

        private b(int i11, int i12) {
            this.f59667a = i11;
            this.f59668b = i12;
        }
    }

    private e(int i11, int i12, int i13, int i14, int i15, c cVar) {
        b[] a11;
        this.f59660a = i11;
        this.f59661b = i12;
        this.f59662c = i13;
        this.f59663d = i14;
        this.f59664e = i15;
        this.f59665f = cVar;
        int b11 = cVar.b();
        int i16 = 0;
        for (b bVar : cVar.a()) {
            i16 += bVar.a() * (bVar.b() + b11);
        }
        this.f59666g = i16;
    }

    private static e[] a() {
        return new e[]{new e(1, 10, 10, 8, 8, new c(5, new b(1, 3))), new e(2, 12, 12, 10, 10, new c(7, new b(1, 5))), new e(3, 14, 14, 12, 12, new c(10, new b(1, 8))), new e(4, 16, 16, 14, 14, new c(12, new b(1, 12))), new e(5, 18, 18, 16, 16, new c(14, new b(1, 18))), new e(6, 20, 20, 18, 18, new c(18, new b(1, 22))), new e(7, 22, 22, 20, 20, new c(20, new b(1, 30))), new e(8, 24, 24, 22, 22, new c(24, new b(1, 36))), new e(9, 26, 26, 24, 24, new c(28, new b(1, 44))), new e(10, 32, 32, 14, 14, new c(36, new b(1, 62))), new e(11, 36, 36, 16, 16, new c(42, new b(1, 86))), new e(12, 40, 40, 18, 18, new c(48, new b(1, 114))), new e(13, 44, 44, 20, 20, new c(56, new b(1, 144))), new e(14, 48, 48, 22, 22, new c(68, new b(1, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256))), new e(15, 52, 52, 24, 24, new c(42, new b(2, 102))), new e(16, 64, 64, 14, 14, new c(56, new b(2, 140))), new e(17, 72, 72, 16, 16, new c(36, new b(4, 92))), new e(18, 80, 80, 18, 18, new c(48, new b(4, 114))), new e(19, 88, 88, 20, 20, new c(56, new b(4, 144))), new e(20, 96, 96, 22, 22, new c(68, new b(4, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256))), new e(21, 104, 104, 24, 24, new c(56, new b(6, 136))), new e(22, 120, 120, 18, 18, new c(68, new b(6, CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384))), new e(23, 132, 132, 20, 20, new c(62, new b(8, CipherSuite.TLS_DHE_DSS_WITH_AES_256_GCM_SHA384))), new e(24, 144, 144, 22, 22, new c(62, new b(8, 156), new b(2, 155))), new e(25, 8, 18, 6, 16, new c(7, new b(1, 5))), new e(26, 8, 32, 6, 14, new c(11, new b(1, 10))), new e(27, 12, 26, 10, 24, new c(14, new b(1, 16))), new e(28, 12, 36, 10, 16, new c(18, new b(1, 22))), new e(29, 16, 36, 14, 16, new c(24, new b(1, 32))), new e(30, 16, 48, 14, 22, new c(28, new b(1, 49)))};
    }

    public static e h(int i11, int i12) {
        e[] eVarArr;
        if ((i11 & 1) == 0 && (i12 & 1) == 0) {
            for (e eVar : f59659h) {
                if (eVar.f59661b == i11 && eVar.f59662c == i12) {
                    return eVar;
                }
            }
            throw FormatException.a();
        }
        throw FormatException.a();
    }

    public int b() {
        return this.f59664e;
    }

    public int c() {
        return this.f59663d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c d() {
        return this.f59665f;
    }

    public int e() {
        return this.f59662c;
    }

    public int f() {
        return this.f59661b;
    }

    public int g() {
        return this.f59666g;
    }

    public int i() {
        return this.f59660a;
    }

    public String toString() {
        return String.valueOf(this.f59660a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final int f59669a;

        /* renamed from: b  reason: collision with root package name */
        private final b[] f59670b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b[] a() {
            return this.f59670b;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public int b() {
            return this.f59669a;
        }

        private c(int i11, b bVar) {
            this.f59669a = i11;
            this.f59670b = new b[]{bVar};
        }

        private c(int i11, b bVar, b bVar2) {
            this.f59669a = i11;
            this.f59670b = new b[]{bVar, bVar2};
        }
    }
}