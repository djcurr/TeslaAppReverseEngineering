package mq;

import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes2.dex */
public class r {

    /* renamed from: n  reason: collision with root package name */
    static final r f38819n = new r();

    /* renamed from: a  reason: collision with root package name */
    short f38820a;

    /* renamed from: b  reason: collision with root package name */
    private short f38821b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f38822c;

    /* renamed from: d  reason: collision with root package name */
    int f38823d;

    /* renamed from: e  reason: collision with root package name */
    private int[] f38824e;

    /* renamed from: f  reason: collision with root package name */
    short f38825f;

    /* renamed from: g  reason: collision with root package name */
    short f38826g;

    /* renamed from: h  reason: collision with root package name */
    short f38827h;

    /* renamed from: i  reason: collision with root package name */
    short f38828i;

    /* renamed from: j  reason: collision with root package name */
    o f38829j;

    /* renamed from: k  reason: collision with root package name */
    r f38830k;

    /* renamed from: l  reason: collision with root package name */
    l f38831l;

    /* renamed from: m  reason: collision with root package name */
    r f38832m;

    private void b(int i11, int i12, int i13) {
        if (this.f38824e == null) {
            this.f38824e = new int[6];
        }
        int[] iArr = this.f38824e;
        int i14 = iArr[0];
        if (i14 + 2 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 6];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f38824e = iArr2;
        }
        int[] iArr3 = this.f38824e;
        int i15 = i14 + 1;
        iArr3[i15] = i11;
        int i16 = i15 + 1;
        iArr3[i16] = i12 | i13;
        iArr3[0] = i16;
    }

    private r g(r rVar) {
        l lVar = this.f38831l;
        while (lVar != null) {
            if (!((this.f38820a & 16) != 0 && lVar == this.f38831l.f38786c)) {
                r rVar2 = lVar.f38785b;
                if (rVar2.f38832m == null) {
                    rVar2.f38832m = rVar;
                    rVar = rVar2;
                }
            }
            lVar = lVar.f38786c;
        }
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(s sVar, boolean z11) {
        short s11;
        sVar.o(this);
        if (!z11 || (s11 = this.f38821b) == 0) {
            return;
        }
        sVar.q(s11 & 65535, this);
        if (this.f38822c == null) {
            return;
        }
        int i11 = 1;
        while (true) {
            int[] iArr = this.f38822c;
            if (i11 > iArr[0]) {
                return;
            }
            sVar.q(iArr[i11], this);
            i11++;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(int i11) {
        if (this.f38821b == 0) {
            this.f38821b = (short) i11;
            return;
        }
        if (this.f38822c == null) {
            this.f38822c = new int[4];
        }
        int[] iArr = this.f38822c;
        int i12 = iArr[0] + 1;
        iArr[0] = i12;
        if (i12 >= iArr.length) {
            int[] iArr2 = new int[iArr.length + 4];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.f38822c = iArr2;
        }
        this.f38822c[i12] = i11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(r rVar) {
        r rVar2 = f38819n;
        this.f38832m = rVar2;
        r rVar3 = rVar2;
        r rVar4 = this;
        while (rVar4 != f38819n) {
            r rVar5 = rVar4.f38832m;
            rVar4.f38832m = rVar3;
            if ((rVar4.f38820a & 64) != 0 && rVar4.f38828i != rVar.f38828i) {
                rVar4.f38831l = new l(rVar4.f38826g, rVar.f38831l.f38785b, rVar4.f38831l);
            }
            rVar3 = rVar4;
            rVar4 = rVar4.g(rVar5);
        }
        while (rVar3 != f38819n) {
            r rVar6 = rVar3.f38832m;
            rVar3.f38832m = null;
            rVar3 = rVar6;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final r e() {
        o oVar = this.f38829j;
        return oVar == null ? this : oVar.f38799a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(short s11) {
        this.f38832m = f38819n;
        r rVar = this;
        while (rVar != f38819n) {
            r rVar2 = rVar.f38832m;
            rVar.f38832m = null;
            if (rVar.f38828i == 0) {
                rVar.f38828i = s11;
                rVar = rVar.g(rVar2);
            } else {
                rVar = rVar2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(d dVar, int i11, boolean z11) {
        if ((this.f38820a & 4) != 0) {
            if (z11) {
                dVar.i(this.f38823d - i11);
            } else {
                dVar.k(this.f38823d - i11);
            }
        } else if (z11) {
            b(i11, PKIFailureInfo.duplicateCertReq, dVar.f38727b);
            dVar.i(-1);
        } else {
            b(i11, 268435456, dVar.f38727b);
            dVar.k(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean i(byte[] bArr, int i11) {
        this.f38820a = (short) (this.f38820a | 4);
        this.f38823d = i11;
        int[] iArr = this.f38824e;
        boolean z11 = false;
        if (iArr == null) {
            return false;
        }
        for (int i12 = iArr[0]; i12 > 0; i12 -= 2) {
            int[] iArr2 = this.f38824e;
            int i13 = iArr2[i12 - 1];
            int i14 = iArr2[i12];
            int i15 = i11 - i13;
            int i16 = 268435455 & i14;
            if ((i14 & (-268435456)) == 268435456) {
                if (i15 < -32768 || i15 > 32767) {
                    int i17 = bArr[i13] & 255;
                    if (i17 < 198) {
                        bArr[i13] = (byte) (i17 + 49);
                    } else {
                        bArr[i13] = (byte) (i17 + 20);
                    }
                    z11 = true;
                }
                bArr[i16] = (byte) (i15 >>> 8);
                bArr[i16 + 1] = (byte) i15;
            } else {
                int i18 = i16 + 1;
                bArr[i16] = (byte) (i15 >>> 24);
                int i19 = i18 + 1;
                bArr[i18] = (byte) (i15 >>> 16);
                bArr[i19] = (byte) (i15 >>> 8);
                bArr[i19 + 1] = (byte) i15;
            }
        }
        return z11;
    }

    public String toString() {
        return "L" + System.identityHashCode(this);
    }
}