package ri;

import ak.v;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import ji.z;
import ri.i;

/* loaded from: classes3.dex */
final class j extends i {

    /* renamed from: n  reason: collision with root package name */
    private a f49618n;

    /* renamed from: o  reason: collision with root package name */
    private int f49619o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f49620p;

    /* renamed from: q  reason: collision with root package name */
    private z.d f49621q;

    /* renamed from: r  reason: collision with root package name */
    private z.b f49622r;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final z.d f49623a;

        /* renamed from: b  reason: collision with root package name */
        public final byte[] f49624b;

        /* renamed from: c  reason: collision with root package name */
        public final z.c[] f49625c;

        /* renamed from: d  reason: collision with root package name */
        public final int f49626d;

        public a(z.d dVar, z.b bVar, byte[] bArr, z.c[] cVarArr, int i11) {
            this.f49623a = dVar;
            this.f49624b = bArr;
            this.f49625c = cVarArr;
            this.f49626d = i11;
        }
    }

    static void n(v vVar, long j11) {
        if (vVar.b() < vVar.f() + 4) {
            vVar.L(Arrays.copyOf(vVar.d(), vVar.f() + 4));
        } else {
            vVar.N(vVar.f() + 4);
        }
        byte[] d11 = vVar.d();
        d11[vVar.f() - 4] = (byte) (j11 & 255);
        d11[vVar.f() - 3] = (byte) ((j11 >>> 8) & 255);
        d11[vVar.f() - 2] = (byte) ((j11 >>> 16) & 255);
        d11[vVar.f() - 1] = (byte) ((j11 >>> 24) & 255);
    }

    private static int o(byte b11, a aVar) {
        if (!aVar.f49625c[p(b11, aVar.f49626d, 1)].f33787a) {
            return aVar.f49623a.f33792e;
        }
        return aVar.f49623a.f33793f;
    }

    static int p(byte b11, int i11, int i12) {
        return (b11 >> i12) & (255 >>> (8 - i11));
    }

    public static boolean r(v vVar) {
        try {
            return z.l(1, vVar, true);
        } catch (ParserException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ri.i
    public void e(long j11) {
        super.e(j11);
        this.f49620p = j11 != 0;
        z.d dVar = this.f49621q;
        this.f49619o = dVar != null ? dVar.f33792e : 0;
    }

    @Override // ri.i
    protected long f(v vVar) {
        if ((vVar.d()[0] & 1) == 1) {
            return -1L;
        }
        int o11 = o(vVar.d()[0], (a) ak.a.h(this.f49618n));
        long j11 = this.f49620p ? (this.f49619o + o11) / 4 : 0;
        n(vVar, j11);
        this.f49620p = true;
        this.f49619o = o11;
        return j11;
    }

    @Override // ri.i
    protected boolean h(v vVar, long j11, i.b bVar) {
        if (this.f49618n != null) {
            ak.a.e(bVar.f49616a);
            return false;
        }
        a q11 = q(vVar);
        this.f49618n = q11;
        if (q11 == null) {
            return true;
        }
        z.d dVar = q11.f49623a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(dVar.f33794g);
        arrayList.add(q11.f49624b);
        bVar.f49616a = new i.b().e0("audio/vorbis").G(dVar.f33791d).Z(dVar.f33790c).H(dVar.f33788a).f0(dVar.f33789b).T(arrayList).E();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ri.i
    public void l(boolean z11) {
        super.l(z11);
        if (z11) {
            this.f49618n = null;
            this.f49621q = null;
            this.f49622r = null;
        }
        this.f49619o = 0;
        this.f49620p = false;
    }

    a q(v vVar) {
        z.d dVar = this.f49621q;
        if (dVar == null) {
            this.f49621q = z.j(vVar);
            return null;
        }
        z.b bVar = this.f49622r;
        if (bVar == null) {
            this.f49622r = z.h(vVar);
            return null;
        }
        byte[] bArr = new byte[vVar.f()];
        System.arraycopy(vVar.d(), 0, bArr, 0, vVar.f());
        z.c[] k11 = z.k(vVar, dVar.f33788a);
        return new a(dVar, bVar, bArr, k11, z.a(k11.length - 1));
    }
}