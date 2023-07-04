package w50;

import java.security.SecureRandom;
import org.bouncycastle.crypto.p;
import org.bouncycastle.crypto.v;

/* loaded from: classes5.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final SecureRandom f55641a;

    /* renamed from: b  reason: collision with root package name */
    private final d f55642b;

    /* renamed from: c  reason: collision with root package name */
    private byte[] f55643c;

    /* renamed from: d  reason: collision with root package name */
    private int f55644d;

    /* renamed from: e  reason: collision with root package name */
    private int f55645e;

    /* loaded from: classes5.dex */
    private static class a implements w50.b {

        /* renamed from: a  reason: collision with root package name */
        private final v f55646a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f55647b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f55648c;

        /* renamed from: d  reason: collision with root package name */
        private final int f55649d;

        public a(v vVar, byte[] bArr, byte[] bArr2, int i11) {
            this.f55646a = vVar;
            this.f55647b = bArr;
            this.f55648c = bArr2;
            this.f55649d = i11;
        }

        @Override // w50.b
        public x50.c a(c cVar) {
            return new x50.a(this.f55646a, this.f55649d, cVar, this.f55648c, this.f55647b);
        }

        @Override // w50.b
        public String getAlgorithm() {
            StringBuilder sb2;
            String algorithmName;
            if (this.f55646a instanceof p50.g) {
                sb2 = new StringBuilder();
                sb2.append("HMAC-DRBG-");
                algorithmName = g.d(((p50.g) this.f55646a).b());
            } else {
                sb2 = new StringBuilder();
                sb2.append("HMAC-DRBG-");
                algorithmName = this.f55646a.getAlgorithmName();
            }
            sb2.append(algorithmName);
            return sb2.toString();
        }
    }

    /* loaded from: classes5.dex */
    private static class b implements w50.b {

        /* renamed from: a  reason: collision with root package name */
        private final p f55650a;

        /* renamed from: b  reason: collision with root package name */
        private final byte[] f55651b;

        /* renamed from: c  reason: collision with root package name */
        private final byte[] f55652c;

        /* renamed from: d  reason: collision with root package name */
        private final int f55653d;

        public b(p pVar, byte[] bArr, byte[] bArr2, int i11) {
            this.f55650a = pVar;
            this.f55651b = bArr;
            this.f55652c = bArr2;
            this.f55653d = i11;
        }

        @Override // w50.b
        public x50.c a(c cVar) {
            return new x50.b(this.f55650a, this.f55653d, cVar, this.f55652c, this.f55651b);
        }

        @Override // w50.b
        public String getAlgorithm() {
            return "HASH-DRBG-" + g.d(this.f55650a);
        }
    }

    public g(SecureRandom secureRandom, boolean z11) {
        this.f55644d = 256;
        this.f55645e = 256;
        this.f55641a = secureRandom;
        this.f55642b = new w50.a(secureRandom, z11);
    }

    public g(d dVar) {
        this.f55644d = 256;
        this.f55645e = 256;
        this.f55641a = null;
        this.f55642b = dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(p pVar) {
        String algorithmName = pVar.getAlgorithmName();
        int indexOf = algorithmName.indexOf(45);
        if (indexOf <= 0 || algorithmName.startsWith("SHA3")) {
            return algorithmName;
        }
        return algorithmName.substring(0, indexOf) + algorithmName.substring(indexOf + 1);
    }

    public f b(v vVar, byte[] bArr, boolean z11) {
        return new f(this.f55641a, this.f55642b.get(this.f55645e), new a(vVar, bArr, this.f55643c, this.f55644d), z11);
    }

    public f c(p pVar, byte[] bArr, boolean z11) {
        return new f(this.f55641a, this.f55642b.get(this.f55645e), new b(pVar, bArr, this.f55643c, this.f55644d), z11);
    }

    public g e(byte[] bArr) {
        this.f55643c = org.bouncycastle.util.a.h(bArr);
        return this;
    }
}