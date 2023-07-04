package ri;

import ak.v;
import ci.i;
import ei.t;
import java.util.Arrays;
import ri.i;

/* loaded from: classes3.dex */
final class h extends i {

    /* renamed from: o  reason: collision with root package name */
    private static final byte[] f49601o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n  reason: collision with root package name */
    private boolean f49602n;

    private long n(byte[] bArr) {
        int i11;
        int i12 = bArr[0] & 255;
        int i13 = i12 & 3;
        int i14 = 2;
        if (i13 == 0) {
            i14 = 1;
        } else if (i13 != 1 && i13 != 2) {
            i14 = bArr[1] & 63;
        }
        int i15 = i12 >> 3;
        return i14 * (i15 >= 16 ? 2500 << i11 : i15 >= 12 ? 10000 << (i11 & 1) : (i15 & 3) == 3 ? 60000 : 10000 << i11);
    }

    public static boolean o(v vVar) {
        int a11 = vVar.a();
        byte[] bArr = f49601o;
        if (a11 < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        vVar.j(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // ri.i
    protected long f(v vVar) {
        return c(n(vVar.d()));
    }

    @Override // ri.i
    protected boolean h(v vVar, long j11, i.b bVar) {
        if (!this.f49602n) {
            byte[] copyOf = Arrays.copyOf(vVar.d(), vVar.f());
            bVar.f49616a = new i.b().e0("audio/opus").H(t.c(copyOf)).f0(48000).T(t.a(copyOf)).E();
            this.f49602n = true;
            return true;
        }
        ak.a.e(bVar.f49616a);
        boolean z11 = vVar.m() == 1332770163;
        vVar.O(0);
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ri.i
    public void l(boolean z11) {
        super.l(z11);
        if (z11) {
            this.f49602n = false;
        }
    }
}