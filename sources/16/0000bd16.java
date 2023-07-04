package wo;

import com.google.zxing.common.reedsolomon.ReedSolomonException;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final a f56157a;

    public c(a aVar) {
        this.f56157a = aVar;
    }

    private int[] b(b bVar) {
        int d11 = bVar.d();
        int i11 = 0;
        if (d11 == 1) {
            return new int[]{bVar.c(1)};
        }
        int[] iArr = new int[d11];
        for (int i12 = 1; i12 < this.f56157a.f() && i11 < d11; i12++) {
            if (bVar.b(i12) == 0) {
                iArr[i11] = this.f56157a.h(i12);
                i11++;
            }
        }
        if (i11 == d11) {
            return iArr;
        }
        throw new ReedSolomonException("Error locator degree does not match number of roots");
    }

    private int[] c(b bVar, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            int h11 = this.f56157a.h(iArr[i11]);
            int i12 = 1;
            for (int i13 = 0; i13 < length; i13++) {
                if (i11 != i13) {
                    int j11 = this.f56157a.j(iArr[i13], h11);
                    i12 = this.f56157a.j(i12, (j11 & 1) == 0 ? j11 | 1 : j11 & (-2));
                }
            }
            iArr2[i11] = this.f56157a.j(bVar.b(h11), this.f56157a.h(i12));
            if (this.f56157a.d() != 0) {
                iArr2[i11] = this.f56157a.j(iArr2[i11], h11);
            }
        }
        return iArr2;
    }

    private b[] d(b bVar, b bVar2, int i11) {
        if (bVar.d() < bVar2.d()) {
            bVar2 = bVar;
            bVar = bVar2;
        }
        b g11 = this.f56157a.g();
        b e11 = this.f56157a.e();
        do {
            b bVar3 = bVar2;
            bVar2 = bVar;
            bVar = bVar3;
            b bVar4 = e11;
            b bVar5 = g11;
            g11 = bVar4;
            if (bVar.d() >= i11 / 2) {
                if (!bVar.e()) {
                    b g12 = this.f56157a.g();
                    int h11 = this.f56157a.h(bVar.c(bVar.d()));
                    while (bVar2.d() >= bVar.d() && !bVar2.e()) {
                        int d11 = bVar2.d() - bVar.d();
                        int j11 = this.f56157a.j(bVar2.c(bVar2.d()), h11);
                        g12 = g12.a(this.f56157a.b(d11, j11));
                        bVar2 = bVar2.a(bVar.h(d11, j11));
                    }
                    e11 = g12.g(g11).a(bVar5);
                } else {
                    throw new ReedSolomonException("r_{i-1} was zero");
                }
            } else {
                int c11 = g11.c(0);
                if (c11 != 0) {
                    int h12 = this.f56157a.h(c11);
                    return new b[]{g11.f(h12), bVar.f(h12)};
                }
                throw new ReedSolomonException("sigmaTilde(0) was zero");
            }
        } while (bVar2.d() < bVar.d());
        throw new IllegalStateException("Division algorithm failed to reduce polynomial?");
    }

    public void a(int[] iArr, int i11) {
        b bVar = new b(this.f56157a, iArr);
        int[] iArr2 = new int[i11];
        boolean z11 = true;
        for (int i12 = 0; i12 < i11; i12++) {
            a aVar = this.f56157a;
            int b11 = bVar.b(aVar.c(aVar.d() + i12));
            iArr2[(i11 - 1) - i12] = b11;
            if (b11 != 0) {
                z11 = false;
            }
        }
        if (z11) {
            return;
        }
        b[] d11 = d(this.f56157a.b(i11, 1), new b(this.f56157a, iArr2), i11);
        b bVar2 = d11[0];
        b bVar3 = d11[1];
        int[] b12 = b(bVar2);
        int[] c11 = c(bVar3, b12);
        for (int i13 = 0; i13 < b12.length; i13++) {
            int length = (iArr.length - 1) - this.f56157a.i(b12[i13]);
            if (length >= 0) {
                iArr[length] = a.a(iArr[length], c11[i13]);
            } else {
                throw new ReedSolomonException("Bad error location");
            }
        }
    }
}