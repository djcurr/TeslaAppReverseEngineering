package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class g extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.i f55704a;

    /* renamed from: b  reason: collision with root package name */
    private org.bouncycastle.asn1.k f55705b;

    /* renamed from: c  reason: collision with root package name */
    private org.bouncycastle.asn1.i f55706c;

    /* renamed from: d  reason: collision with root package name */
    private byte[][] f55707d;

    /* renamed from: e  reason: collision with root package name */
    private byte[][] f55708e;

    /* renamed from: f  reason: collision with root package name */
    private byte[] f55709f;

    public g(int i11, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f55704a = new org.bouncycastle.asn1.i(0L);
        this.f55706c = new org.bouncycastle.asn1.i(i11);
        this.f55707d = c70.a.c(sArr);
        this.f55708e = c70.a.c(sArr2);
        this.f55709f = c70.a.a(sArr3);
    }

    private g(p pVar) {
        if (pVar.r(0) instanceof org.bouncycastle.asn1.i) {
            this.f55704a = org.bouncycastle.asn1.i.p(pVar.r(0));
        } else {
            this.f55705b = org.bouncycastle.asn1.k.u(pVar.r(0));
        }
        this.f55706c = org.bouncycastle.asn1.i.p(pVar.r(1));
        p p11 = p.p(pVar.r(2));
        this.f55707d = new byte[p11.size()];
        for (int i11 = 0; i11 < p11.size(); i11++) {
            this.f55707d[i11] = org.bouncycastle.asn1.l.p(p11.r(i11)).r();
        }
        p pVar2 = (p) pVar.r(3);
        this.f55708e = new byte[pVar2.size()];
        for (int i12 = 0; i12 < pVar2.size(); i12++) {
            this.f55708e[i12] = org.bouncycastle.asn1.l.p(pVar2.r(i12)).r();
        }
        this.f55709f = org.bouncycastle.asn1.l.p(((p) pVar.r(4)).r(0)).r();
    }

    public static g j(Object obj) {
        if (obj instanceof g) {
            return (g) obj;
        }
        if (obj != null) {
            return new g(p.p(obj));
        }
        return null;
    }

    public short[][] e() {
        return c70.a.d(this.f55707d);
    }

    public short[] f() {
        return c70.a.b(this.f55709f);
    }

    public short[][] h() {
        return c70.a.d(this.f55708e);
    }

    public int i() {
        return this.f55706c.x();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        e40.b bVar = this.f55704a;
        if (bVar == null) {
            bVar = this.f55705b;
        }
        dVar.a(bVar);
        dVar.a(this.f55706c);
        org.bouncycastle.asn1.d dVar2 = new org.bouncycastle.asn1.d();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            byte[][] bArr = this.f55707d;
            if (i12 >= bArr.length) {
                break;
            }
            dVar2.a(new s0(bArr[i12]));
            i12++;
        }
        dVar.a(new w0(dVar2));
        org.bouncycastle.asn1.d dVar3 = new org.bouncycastle.asn1.d();
        while (true) {
            byte[][] bArr2 = this.f55708e;
            if (i11 >= bArr2.length) {
                dVar.a(new w0(dVar3));
                org.bouncycastle.asn1.d dVar4 = new org.bouncycastle.asn1.d();
                dVar4.a(new s0(this.f55709f));
                dVar.a(new w0(dVar4));
                return new w0(dVar);
            }
            dVar3.a(new s0(bArr2[i11]));
            i11++;
        }
    }
}