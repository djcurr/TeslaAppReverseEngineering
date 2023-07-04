package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class f extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.i f55696a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.k f55697b;

    /* renamed from: c  reason: collision with root package name */
    private byte[][] f55698c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f55699d;

    /* renamed from: e  reason: collision with root package name */
    private byte[][] f55700e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f55701f;

    /* renamed from: g  reason: collision with root package name */
    private byte[] f55702g;

    /* renamed from: h  reason: collision with root package name */
    private b70.a[] f55703h;

    private f(p pVar) {
        int i11 = 0;
        if (pVar.r(0) instanceof org.bouncycastle.asn1.i) {
            this.f55696a = org.bouncycastle.asn1.i.p(pVar.r(0));
        } else {
            this.f55697b = org.bouncycastle.asn1.k.u(pVar.r(0));
        }
        p pVar2 = (p) pVar.r(1);
        this.f55698c = new byte[pVar2.size()];
        for (int i12 = 0; i12 < pVar2.size(); i12++) {
            this.f55698c[i12] = ((org.bouncycastle.asn1.l) pVar2.r(i12)).r();
        }
        this.f55699d = ((org.bouncycastle.asn1.l) ((p) pVar.r(2)).r(0)).r();
        p pVar3 = (p) pVar.r(3);
        this.f55700e = new byte[pVar3.size()];
        for (int i13 = 0; i13 < pVar3.size(); i13++) {
            this.f55700e[i13] = ((org.bouncycastle.asn1.l) pVar3.r(i13)).r();
        }
        this.f55701f = ((org.bouncycastle.asn1.l) ((p) pVar.r(4)).r(0)).r();
        this.f55702g = ((org.bouncycastle.asn1.l) ((p) pVar.r(5)).r(0)).r();
        p pVar4 = (p) pVar.r(6);
        byte[][][][] bArr = new byte[pVar4.size()][][];
        byte[][][][] bArr2 = new byte[pVar4.size()][][];
        byte[][][] bArr3 = new byte[pVar4.size()][];
        byte[][] bArr4 = new byte[pVar4.size()];
        int i14 = 0;
        while (i14 < pVar4.size()) {
            p pVar5 = (p) pVar4.r(i14);
            p pVar6 = (p) pVar5.r(i11);
            bArr[i14] = new byte[pVar6.size()][];
            for (int i15 = i11; i15 < pVar6.size(); i15++) {
                p pVar7 = (p) pVar6.r(i15);
                bArr[i14][i15] = new byte[pVar7.size()];
                for (int i16 = 0; i16 < pVar7.size(); i16++) {
                    bArr[i14][i15][i16] = ((org.bouncycastle.asn1.l) pVar7.r(i16)).r();
                }
            }
            p pVar8 = (p) pVar5.r(1);
            bArr2[i14] = new byte[pVar8.size()][];
            for (int i17 = 0; i17 < pVar8.size(); i17++) {
                p pVar9 = (p) pVar8.r(i17);
                bArr2[i14][i17] = new byte[pVar9.size()];
                for (int i18 = 0; i18 < pVar9.size(); i18++) {
                    bArr2[i14][i17][i18] = ((org.bouncycastle.asn1.l) pVar9.r(i18)).r();
                }
            }
            p pVar10 = (p) pVar5.r(2);
            bArr3[i14] = new byte[pVar10.size()];
            for (int i19 = 0; i19 < pVar10.size(); i19++) {
                bArr3[i14][i19] = ((org.bouncycastle.asn1.l) pVar10.r(i19)).r();
            }
            bArr4[i14] = ((org.bouncycastle.asn1.l) pVar5.r(3)).r();
            i14++;
            i11 = 0;
        }
        int length = this.f55702g.length - 1;
        this.f55703h = new b70.a[length];
        int i21 = 0;
        while (i21 < length) {
            byte[] bArr5 = this.f55702g;
            int i22 = i21 + 1;
            this.f55703h[i21] = new b70.a(bArr5[i21], bArr5[i22], c70.a.f(bArr[i21]), c70.a.f(bArr2[i21]), c70.a.d(bArr3[i21]), c70.a.b(bArr4[i21]));
            i21 = i22;
        }
    }

    public f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, b70.a[] aVarArr) {
        this.f55696a = new org.bouncycastle.asn1.i(1L);
        this.f55698c = c70.a.c(sArr);
        this.f55699d = c70.a.a(sArr2);
        this.f55700e = c70.a.c(sArr3);
        this.f55701f = c70.a.a(sArr4);
        this.f55702g = c70.a.h(iArr);
        this.f55703h = aVarArr;
    }

    public static f h(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj != null) {
            return new f(p.p(obj));
        }
        return null;
    }

    public short[] e() {
        return c70.a.b(this.f55699d);
    }

    public short[] f() {
        return c70.a.b(this.f55701f);
    }

    public short[][] i() {
        return c70.a.d(this.f55698c);
    }

    public short[][] j() {
        return c70.a.d(this.f55700e);
    }

    public b70.a[] k() {
        return this.f55703h;
    }

    public int[] m() {
        return c70.a.g(this.f55702g);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        e40.b bVar = this.f55696a;
        if (bVar == null) {
            bVar = this.f55697b;
        }
        dVar.a(bVar);
        org.bouncycastle.asn1.d dVar2 = new org.bouncycastle.asn1.d();
        int i11 = 0;
        while (true) {
            byte[][] bArr = this.f55698c;
            if (i11 >= bArr.length) {
                break;
            }
            dVar2.a(new s0(bArr[i11]));
            i11++;
        }
        dVar.a(new w0(dVar2));
        org.bouncycastle.asn1.d dVar3 = new org.bouncycastle.asn1.d();
        dVar3.a(new s0(this.f55699d));
        dVar.a(new w0(dVar3));
        org.bouncycastle.asn1.d dVar4 = new org.bouncycastle.asn1.d();
        int i12 = 0;
        while (true) {
            byte[][] bArr2 = this.f55700e;
            if (i12 >= bArr2.length) {
                break;
            }
            dVar4.a(new s0(bArr2[i12]));
            i12++;
        }
        dVar.a(new w0(dVar4));
        org.bouncycastle.asn1.d dVar5 = new org.bouncycastle.asn1.d();
        dVar5.a(new s0(this.f55701f));
        dVar.a(new w0(dVar5));
        org.bouncycastle.asn1.d dVar6 = new org.bouncycastle.asn1.d();
        dVar6.a(new s0(this.f55702g));
        dVar.a(new w0(dVar6));
        org.bouncycastle.asn1.d dVar7 = new org.bouncycastle.asn1.d();
        for (int i13 = 0; i13 < this.f55703h.length; i13++) {
            org.bouncycastle.asn1.d dVar8 = new org.bouncycastle.asn1.d();
            byte[][][] e11 = c70.a.e(this.f55703h[i13].a());
            org.bouncycastle.asn1.d dVar9 = new org.bouncycastle.asn1.d();
            for (int i14 = 0; i14 < e11.length; i14++) {
                org.bouncycastle.asn1.d dVar10 = new org.bouncycastle.asn1.d();
                for (int i15 = 0; i15 < e11[i14].length; i15++) {
                    dVar10.a(new s0(e11[i14][i15]));
                }
                dVar9.a(new w0(dVar10));
            }
            dVar8.a(new w0(dVar9));
            byte[][][] e12 = c70.a.e(this.f55703h[i13].b());
            org.bouncycastle.asn1.d dVar11 = new org.bouncycastle.asn1.d();
            for (int i16 = 0; i16 < e12.length; i16++) {
                org.bouncycastle.asn1.d dVar12 = new org.bouncycastle.asn1.d();
                for (int i17 = 0; i17 < e12[i16].length; i17++) {
                    dVar12.a(new s0(e12[i16][i17]));
                }
                dVar11.a(new w0(dVar12));
            }
            dVar8.a(new w0(dVar11));
            byte[][] c11 = c70.a.c(this.f55703h[i13].d());
            org.bouncycastle.asn1.d dVar13 = new org.bouncycastle.asn1.d();
            for (byte[] bArr3 : c11) {
                dVar13.a(new s0(bArr3));
            }
            dVar8.a(new w0(dVar13));
            dVar8.a(new s0(c70.a.a(this.f55703h[i13].c())));
            dVar7.a(new w0(dVar8));
        }
        dVar.a(new w0(dVar7));
        return new w0(dVar);
    }
}