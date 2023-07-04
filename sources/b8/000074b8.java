package i50;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import l50.z0;
import org.bouncycastle.crypto.OutputLengthException;
import u50.p1;

/* loaded from: classes5.dex */
public class f0 implements r70.h {

    /* renamed from: j  reason: collision with root package name */
    private static final Hashtable f30002j = new Hashtable();

    /* renamed from: a  reason: collision with root package name */
    final z0 f30003a;

    /* renamed from: b  reason: collision with root package name */
    private final int f30004b;

    /* renamed from: c  reason: collision with root package name */
    long[] f30005c;

    /* renamed from: d  reason: collision with root package name */
    private long[] f30006d;

    /* renamed from: e  reason: collision with root package name */
    private byte[] f30007e;

    /* renamed from: f  reason: collision with root package name */
    private b[] f30008f;

    /* renamed from: g  reason: collision with root package name */
    private b[] f30009g;

    /* renamed from: h  reason: collision with root package name */
    private final c f30010h;

    /* renamed from: i  reason: collision with root package name */
    private final byte[] f30011i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private byte[] f30012a;

        public a(long j11) {
            byte[] bArr = new byte[32];
            this.f30012a = bArr;
            bArr[0] = 83;
            bArr[1] = 72;
            bArr[2] = 65;
            bArr[3] = 51;
            bArr[4] = 1;
            bArr[5] = 0;
            z0.k(j11, bArr, 8);
        }

        public byte[] a() {
            return this.f30012a;
        }
    }

    /* loaded from: classes5.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f30013a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f30014b;

        public b(int i11, byte[] bArr) {
            this.f30013a = i11;
            this.f30014b = bArr;
        }

        public int a() {
            return this.f30013a;
        }

        public byte[] b() {
            return this.f30014b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public class c {

        /* renamed from: a  reason: collision with root package name */
        private final d f30015a = new d();

        /* renamed from: b  reason: collision with root package name */
        private byte[] f30016b;

        /* renamed from: c  reason: collision with root package name */
        private int f30017c;

        /* renamed from: d  reason: collision with root package name */
        private long[] f30018d;

        public c(int i11) {
            byte[] bArr = new byte[i11];
            this.f30016b = bArr;
            this.f30018d = new long[bArr.length / 8];
        }

        private void b(long[] jArr) {
            long[] jArr2;
            f0 f0Var = f0.this;
            f0Var.f30003a.f(true, f0Var.f30005c, this.f30015a.c());
            int i11 = 0;
            while (true) {
                jArr2 = this.f30018d;
                if (i11 >= jArr2.length) {
                    break;
                }
                jArr2[i11] = z0.e(this.f30016b, i11 * 8);
                i11++;
            }
            f0.this.f30003a.g(jArr2, jArr);
            for (int i12 = 0; i12 < jArr.length; i12++) {
                jArr[i12] = jArr[i12] ^ this.f30018d[i12];
            }
        }

        public void a(long[] jArr) {
            int i11 = this.f30017c;
            while (true) {
                byte[] bArr = this.f30016b;
                if (i11 >= bArr.length) {
                    this.f30015a.h(true);
                    b(jArr);
                    return;
                }
                bArr[i11] = 0;
                i11++;
            }
        }

        public void c(int i11) {
            this.f30015a.f();
            this.f30015a.j(i11);
            this.f30017c = 0;
        }

        public void d(c cVar) {
            this.f30016b = org.bouncycastle.util.a.i(cVar.f30016b, this.f30016b);
            this.f30017c = cVar.f30017c;
            this.f30018d = org.bouncycastle.util.a.m(cVar.f30018d, this.f30018d);
            this.f30015a.g(cVar.f30015a);
        }

        public void e(byte[] bArr, int i11, int i12, long[] jArr) {
            int i13 = 0;
            while (i12 > i13) {
                if (this.f30017c == this.f30016b.length) {
                    b(jArr);
                    this.f30015a.i(false);
                    this.f30017c = 0;
                }
                int min = Math.min(i12 - i13, this.f30016b.length - this.f30017c);
                System.arraycopy(bArr, i11 + i13, this.f30016b, this.f30017c, min);
                i13 += min;
                this.f30017c += min;
                this.f30015a.a(min);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private long[] f30020a = new long[2];

        /* renamed from: b  reason: collision with root package name */
        private boolean f30021b;

        public d() {
            f();
        }

        public void a(int i11) {
            if (!this.f30021b) {
                long[] jArr = this.f30020a;
                long j11 = jArr[0] + i11;
                jArr[0] = j11;
                if (j11 > 9223372034707292160L) {
                    this.f30021b = true;
                    return;
                }
                return;
            }
            long[] jArr2 = new long[3];
            long[] jArr3 = this.f30020a;
            jArr2[0] = jArr3[0] & 4294967295L;
            jArr2[1] = (jArr3[0] >>> 32) & 4294967295L;
            jArr2[2] = jArr3[1] & 4294967295L;
            long j12 = i11;
            for (int i12 = 0; i12 < 3; i12++) {
                long j13 = j12 + jArr2[i12];
                jArr2[i12] = j13;
                j12 = j13 >>> 32;
            }
            long[] jArr4 = this.f30020a;
            jArr4[0] = ((jArr2[1] & 4294967295L) << 32) | (jArr2[0] & 4294967295L);
            jArr4[1] = (jArr2[2] & 4294967295L) | (jArr4[1] & (-4294967296L));
        }

        public int b() {
            return (int) ((this.f30020a[1] >>> 56) & 63);
        }

        public long[] c() {
            return this.f30020a;
        }

        public boolean d() {
            return (this.f30020a[1] & Long.MIN_VALUE) != 0;
        }

        public boolean e() {
            return (this.f30020a[1] & 4611686018427387904L) != 0;
        }

        public void f() {
            long[] jArr = this.f30020a;
            jArr[0] = 0;
            jArr[1] = 0;
            this.f30021b = false;
            i(true);
        }

        public void g(d dVar) {
            this.f30020a = org.bouncycastle.util.a.m(dVar.f30020a, this.f30020a);
            this.f30021b = dVar.f30021b;
        }

        public void h(boolean z11) {
            if (z11) {
                long[] jArr = this.f30020a;
                jArr[1] = jArr[1] | Long.MIN_VALUE;
                return;
            }
            long[] jArr2 = this.f30020a;
            jArr2[1] = jArr2[1] & Long.MAX_VALUE;
        }

        public void i(boolean z11) {
            if (z11) {
                long[] jArr = this.f30020a;
                jArr[1] = jArr[1] | 4611686018427387904L;
                return;
            }
            long[] jArr2 = this.f30020a;
            jArr2[1] = jArr2[1] & (-4611686018427387905L);
        }

        public void j(int i11) {
            long[] jArr = this.f30020a;
            jArr[1] = (jArr[1] & (-274877906944L)) | ((i11 & 63) << 56);
        }

        public String toString() {
            return b() + " first: " + e() + ", final: " + d();
        }
    }

    static {
        k(256, 128, new long[]{-2228972824489528736L, -8629553674646093540L, 1155188648486244218L, -3677226592081559102L});
        k(256, 160, new long[]{1450197650740764312L, 3081844928540042640L, -3136097061834271170L, 3301952811952417661L});
        k(256, 224, new long[]{-4176654842910610933L, -8688192972455077604L, -7364642305011795836L, 4056579644589979102L});
        k(256, 256, new long[]{-243853671043386295L, 3443677322885453875L, -5531612722399640561L, 7662005193972177513L});
        k(512, 128, new long[]{-6288014694233956526L, 2204638249859346602L, 3502419045458743507L, -4829063503441264548L, 983504137758028059L, 1880512238245786339L, -6715892782214108542L, 7602827311880509485L});
        k(512, 160, new long[]{2934123928682216849L, -4399710721982728305L, 1684584802963255058L, 5744138295201861711L, 2444857010922934358L, -2807833639722848072L, -5121587834665610502L, 118355523173251694L});
        k(512, 224, new long[]{-3688341020067007964L, -3772225436291745297L, -8300862168937575580L, 4146387520469897396L, 1106145742801415120L, 7455425944880474941L, -7351063101234211863L, -7048981346965512457L});
        k(512, 384, new long[]{-6631894876634615969L, -5692838220127733084L, -7099962856338682626L, -2911352911530754598L, 2000907093792408677L, 9140007292425499655L, 6093301768906360022L, 2769176472213098488L});
        k(512, 512, new long[]{5261240102383538638L, 978932832955457283L, -8083517948103779378L, -7339365279355032399L, 6752626034097301424L, -1531723821829733388L, -7417126464950782685L, -5901786942805128141L});
    }

    public f0(int i11, int i12) {
        this.f30011i = new byte[1];
        if (i12 % 8 != 0) {
            throw new IllegalArgumentException("Output size must be a multiple of 8 bits. :" + i12);
        }
        this.f30004b = i12 / 8;
        z0 z0Var = new z0(i11);
        this.f30003a = z0Var;
        this.f30010h = new c(z0Var.getBlockSize());
    }

    public f0(f0 f0Var) {
        this(f0Var.g() * 8, f0Var.h() * 8);
        d(f0Var);
    }

    private void b() {
        if (this.f30010h == null) {
            throw new IllegalArgumentException("Skein engine is not initialised.");
        }
    }

    private static b[] c(b[] bVarArr, b[] bVarArr2) {
        if (bVarArr == null) {
            return null;
        }
        if (bVarArr2 == null || bVarArr2.length != bVarArr.length) {
            bVarArr2 = new b[bVarArr.length];
        }
        System.arraycopy(bVarArr, 0, bVarArr2, 0, bVarArr2.length);
        return bVarArr2;
    }

    private void d(f0 f0Var) {
        this.f30010h.d(f0Var.f30010h);
        this.f30005c = org.bouncycastle.util.a.m(f0Var.f30005c, this.f30005c);
        this.f30006d = org.bouncycastle.util.a.m(f0Var.f30006d, this.f30006d);
        this.f30007e = org.bouncycastle.util.a.i(f0Var.f30007e, this.f30007e);
        this.f30008f = c(f0Var.f30008f, this.f30008f);
        this.f30009g = c(f0Var.f30009g, this.f30009g);
    }

    private void e() {
        long[] jArr = (long[]) f30002j.get(t(g(), h()));
        int i11 = 0;
        if (this.f30007e != null || jArr == null) {
            this.f30005c = new long[g() / 8];
            byte[] bArr = this.f30007e;
            if (bArr != null) {
                o(0, bArr);
            }
            o(4, new a(this.f30004b * 8).a());
        } else {
            this.f30005c = org.bouncycastle.util.a.l(jArr);
        }
        if (this.f30008f != null) {
            while (true) {
                b[] bVarArr = this.f30008f;
                if (i11 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i11];
                o(bVar.a(), bVar.b());
                i11++;
            }
        }
        this.f30006d = org.bouncycastle.util.a.l(this.f30005c);
    }

    private void j(Hashtable hashtable) {
        Enumeration keys = hashtable.keys();
        Vector vector = new Vector();
        Vector vector2 = new Vector();
        while (keys.hasMoreElements()) {
            Integer num = (Integer) keys.nextElement();
            byte[] bArr = (byte[]) hashtable.get(num);
            if (num.intValue() == 0) {
                this.f30007e = bArr;
            } else if (num.intValue() < 48) {
                vector.addElement(new b(num.intValue(), bArr));
            } else {
                vector2.addElement(new b(num.intValue(), bArr));
            }
        }
        b[] bVarArr = new b[vector.size()];
        this.f30008f = bVarArr;
        vector.copyInto(bVarArr);
        n(this.f30008f);
        b[] bVarArr2 = new b[vector2.size()];
        this.f30009g = bVarArr2;
        vector2.copyInto(bVarArr2);
        n(this.f30009g);
    }

    private static void k(int i11, int i12, long[] jArr) {
        f30002j.put(t(i11 / 8, i12 / 8), jArr);
    }

    private void l(long j11, byte[] bArr, int i11, int i12) {
        byte[] bArr2 = new byte[8];
        z0.k(j11, bArr2, 0);
        long[] jArr = new long[this.f30005c.length];
        q(63);
        this.f30010h.e(bArr2, 0, 8, jArr);
        this.f30010h.a(jArr);
        int i13 = ((i12 + 8) - 1) / 8;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i14 * 8;
            int min = Math.min(8, i12 - i15);
            if (min == 8) {
                z0.k(jArr[i14], bArr, i15 + i11);
            } else {
                z0.k(jArr[i14], bArr2, 0);
                System.arraycopy(bArr2, 0, bArr, i15 + i11, min);
            }
        }
    }

    private static void n(b[] bVarArr) {
        if (bVarArr == null) {
            return;
        }
        for (int i11 = 1; i11 < bVarArr.length; i11++) {
            b bVar = bVarArr[i11];
            int i12 = i11;
            while (i12 > 0) {
                int i13 = i12 - 1;
                if (bVar.a() < bVarArr[i13].a()) {
                    bVarArr[i12] = bVarArr[i13];
                    i12 = i13;
                }
            }
            bVarArr[i12] = bVar;
        }
    }

    private void o(int i11, byte[] bArr) {
        q(i11);
        this.f30010h.e(bArr, 0, bArr.length, this.f30005c);
        p();
    }

    private void p() {
        this.f30010h.a(this.f30005c);
    }

    private void q(int i11) {
        this.f30010h.c(i11);
    }

    private static Integer t(int i11, int i12) {
        return r70.f.d(i11 | (i12 << 16));
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        f0 f0Var = (f0) hVar;
        if (g() != f0Var.g() || this.f30004b != f0Var.f30004b) {
            throw new IllegalArgumentException("Incompatible parameters in provided SkeinEngine.");
        }
        d(f0Var);
    }

    @Override // r70.h
    public r70.h copy() {
        return new f0(this);
    }

    public int f(byte[] bArr, int i11) {
        b();
        if (bArr.length >= this.f30004b + i11) {
            p();
            if (this.f30009g != null) {
                int i12 = 0;
                while (true) {
                    b[] bVarArr = this.f30009g;
                    if (i12 >= bVarArr.length) {
                        break;
                    }
                    b bVar = bVarArr[i12];
                    o(bVar.a(), bVar.b());
                    i12++;
                }
            }
            int g11 = g();
            int i13 = ((this.f30004b + g11) - 1) / g11;
            for (int i14 = 0; i14 < i13; i14++) {
                int i15 = i14 * g11;
                l(i14, bArr, i11 + i15, Math.min(g11, this.f30004b - i15));
            }
            m();
            return this.f30004b;
        }
        throw new OutputLengthException("Output buffer is too short to hold output");
    }

    public int g() {
        return this.f30003a.getBlockSize();
    }

    public int h() {
        return this.f30004b;
    }

    public void i(p1 p1Var) {
        this.f30005c = null;
        this.f30007e = null;
        this.f30008f = null;
        this.f30009g = null;
        if (p1Var != null) {
            if (p1Var.a().length < 16) {
                throw new IllegalArgumentException("Skein key must be at least 128 bits.");
            }
            j(p1Var.b());
        }
        e();
        q(48);
    }

    public void m() {
        long[] jArr = this.f30006d;
        long[] jArr2 = this.f30005c;
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        q(48);
    }

    public void r(byte b11) {
        byte[] bArr = this.f30011i;
        bArr[0] = b11;
        s(bArr, 0, 1);
    }

    public void s(byte[] bArr, int i11, int i12) {
        b();
        this.f30010h.e(bArr, i11, i12, this.f30005c);
    }
}