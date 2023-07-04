package ip;

import com.google.zxing.ChecksumException;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final b f32738a = b.f32739f;

    private int[] b(c cVar) {
        int d11 = cVar.d();
        int[] iArr = new int[d11];
        int i11 = 0;
        for (int i12 = 1; i12 < this.f32738a.e() && i11 < d11; i12++) {
            if (cVar.b(i12) == 0) {
                iArr[i11] = this.f32738a.g(i12);
                i11++;
            }
        }
        if (i11 == d11) {
            return iArr;
        }
        throw ChecksumException.a();
    }

    private int[] c(c cVar, c cVar2, int[] iArr) {
        int d11 = cVar2.d();
        int[] iArr2 = new int[d11];
        for (int i11 = 1; i11 <= d11; i11++) {
            iArr2[d11 - i11] = this.f32738a.i(i11, cVar2.c(i11));
        }
        c cVar3 = new c(this.f32738a, iArr2);
        int length = iArr.length;
        int[] iArr3 = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            int g11 = this.f32738a.g(iArr[i12]);
            iArr3[i12] = this.f32738a.i(this.f32738a.j(0, cVar.b(g11)), this.f32738a.g(cVar3.b(g11)));
        }
        return iArr3;
    }

    private c[] d(c cVar, c cVar2, int i11) {
        if (cVar.d() < cVar2.d()) {
            cVar2 = cVar;
            cVar = cVar2;
        }
        c f11 = this.f32738a.f();
        c d11 = this.f32738a.d();
        while (true) {
            c cVar3 = cVar2;
            cVar2 = cVar;
            cVar = cVar3;
            c cVar4 = d11;
            c cVar5 = f11;
            f11 = cVar4;
            if (cVar.d() >= i11 / 2) {
                if (!cVar.e()) {
                    c f12 = this.f32738a.f();
                    int g11 = this.f32738a.g(cVar.c(cVar.d()));
                    while (cVar2.d() >= cVar.d() && !cVar2.e()) {
                        int d12 = cVar2.d() - cVar.d();
                        int i12 = this.f32738a.i(cVar2.c(cVar2.d()), g11);
                        f12 = f12.a(this.f32738a.b(d12, i12));
                        cVar2 = cVar2.j(cVar.h(d12, i12));
                    }
                    d11 = f12.g(f11).j(cVar5).i();
                } else {
                    throw ChecksumException.a();
                }
            } else {
                int c11 = f11.c(0);
                if (c11 != 0) {
                    int g12 = this.f32738a.g(c11);
                    return new c[]{f11.f(g12), cVar.f(g12)};
                }
                throw ChecksumException.a();
            }
        }
    }

    public int a(int[] iArr, int i11, int[] iArr2) {
        c cVar = new c(this.f32738a, iArr);
        int[] iArr3 = new int[i11];
        boolean z11 = false;
        for (int i12 = i11; i12 > 0; i12--) {
            int b11 = cVar.b(this.f32738a.c(i12));
            iArr3[i11 - i12] = b11;
            if (b11 != 0) {
                z11 = true;
            }
        }
        if (z11) {
            c d11 = this.f32738a.d();
            if (iArr2 != null) {
                for (int i13 : iArr2) {
                    int c11 = this.f32738a.c((iArr.length - 1) - i13);
                    b bVar = this.f32738a;
                    d11 = d11.g(new c(bVar, new int[]{bVar.j(0, c11), 1}));
                }
            }
            c[] d12 = d(this.f32738a.b(i11, 1), new c(this.f32738a, iArr3), i11);
            c cVar2 = d12[0];
            c cVar3 = d12[1];
            int[] b12 = b(cVar2);
            int[] c12 = c(cVar3, cVar2, b12);
            for (int i14 = 0; i14 < b12.length; i14++) {
                int length = (iArr.length - 1) - this.f32738a.h(b12[i14]);
                if (length >= 0) {
                    iArr[length] = this.f32738a.j(iArr[length], c12[i14]);
                } else {
                    throw ChecksumException.a();
                }
            }
            return b12.length;
        }
        return 0;
    }
}