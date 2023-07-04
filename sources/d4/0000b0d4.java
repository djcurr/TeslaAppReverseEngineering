package ri;

import ak.k0;
import java.util.Arrays;
import ji.m;
import ji.n;
import ji.o;
import ji.p;
import ji.v;
import ri.i;

/* loaded from: classes3.dex */
final class b extends i {

    /* renamed from: n  reason: collision with root package name */
    private p f49578n;

    /* renamed from: o  reason: collision with root package name */
    private a f49579o;

    /* loaded from: classes3.dex */
    private static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        private p f49580a;

        /* renamed from: b  reason: collision with root package name */
        private p.a f49581b;

        /* renamed from: c  reason: collision with root package name */
        private long f49582c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f49583d = -1;

        public a(p pVar, p.a aVar) {
            this.f49580a = pVar;
            this.f49581b = aVar;
        }

        @Override // ri.g
        public long a(ji.i iVar) {
            long j11 = this.f49583d;
            if (j11 >= 0) {
                long j12 = -(j11 + 2);
                this.f49583d = -1L;
                return j12;
            }
            return -1L;
        }

        @Override // ri.g
        public v b() {
            ak.a.f(this.f49582c != -1);
            return new o(this.f49580a, this.f49582c);
        }

        @Override // ri.g
        public void c(long j11) {
            long[] jArr = this.f49581b.f33759a;
            this.f49583d = jArr[k0.i(jArr, j11, true, true)];
        }

        public void d(long j11) {
            this.f49582c = j11;
        }
    }

    private int n(ak.v vVar) {
        int i11 = (vVar.d()[2] & 255) >> 4;
        if (i11 == 6 || i11 == 7) {
            vVar.P(4);
            vVar.J();
        }
        int j11 = m.j(vVar, i11);
        vVar.O(0);
        return j11;
    }

    private static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(ak.v vVar) {
        return vVar.a() >= 5 && vVar.C() == 127 && vVar.E() == 1179402563;
    }

    @Override // ri.i
    protected long f(ak.v vVar) {
        if (o(vVar.d())) {
            return n(vVar);
        }
        return -1L;
    }

    @Override // ri.i
    protected boolean h(ak.v vVar, long j11, i.b bVar) {
        byte[] d11 = vVar.d();
        p pVar = this.f49578n;
        if (pVar == null) {
            p pVar2 = new p(d11, 17);
            this.f49578n = pVar2;
            bVar.f49616a = pVar2.h(Arrays.copyOfRange(d11, 9, vVar.f()), null);
            return true;
        } else if ((d11[0] & Byte.MAX_VALUE) == 3) {
            p.a g11 = n.g(vVar);
            p c11 = pVar.c(g11);
            this.f49578n = c11;
            this.f49579o = new a(c11, g11);
            return true;
        } else if (o(d11)) {
            a aVar = this.f49579o;
            if (aVar != null) {
                aVar.d(j11);
                bVar.f49617b = this.f49579o;
            }
            ak.a.e(bVar.f49616a);
            return false;
        } else {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ri.i
    public void l(boolean z11) {
        super.l(z11);
        if (z11) {
            this.f49578n = null;
            this.f49579o = null;
        }
    }
}