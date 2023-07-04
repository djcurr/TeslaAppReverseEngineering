package w40;

import java.math.BigInteger;
import java.util.Enumeration;
import org.bouncycastle.asn1.q0;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class l extends e40.c {

    /* renamed from: e  reason: collision with root package name */
    private static final e50.b f55517e = new e50.b(n.f55524a2, q0.f43085a);

    /* renamed from: a  reason: collision with root package name */
    private final org.bouncycastle.asn1.l f55518a;

    /* renamed from: b  reason: collision with root package name */
    private final org.bouncycastle.asn1.i f55519b;

    /* renamed from: c  reason: collision with root package name */
    private final org.bouncycastle.asn1.i f55520c;

    /* renamed from: d  reason: collision with root package name */
    private final e50.b f55521d;

    private l(org.bouncycastle.asn1.p pVar) {
        Enumeration s11 = pVar.s();
        this.f55518a = (org.bouncycastle.asn1.l) s11.nextElement();
        this.f55519b = (org.bouncycastle.asn1.i) s11.nextElement();
        if (s11.hasMoreElements()) {
            Object nextElement = s11.nextElement();
            if (nextElement instanceof org.bouncycastle.asn1.i) {
                this.f55520c = org.bouncycastle.asn1.i.p(nextElement);
                nextElement = s11.hasMoreElements() ? s11.nextElement() : null;
            } else {
                this.f55520c = null;
            }
            if (nextElement != null) {
                this.f55521d = e50.b.f(nextElement);
                return;
            }
        } else {
            this.f55520c = null;
        }
        this.f55521d = null;
    }

    public l(byte[] bArr, int i11) {
        this(bArr, i11, 0);
    }

    public l(byte[] bArr, int i11, int i12) {
        this(bArr, i11, i12, null);
    }

    public l(byte[] bArr, int i11, int i12, e50.b bVar) {
        this.f55518a = new s0(org.bouncycastle.util.a.h(bArr));
        this.f55519b = new org.bouncycastle.asn1.i(i11);
        this.f55520c = i12 > 0 ? new org.bouncycastle.asn1.i(i12) : null;
        this.f55521d = bVar;
    }

    public static l e(Object obj) {
        if (obj instanceof l) {
            return (l) obj;
        }
        if (obj != null) {
            return new l(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    public BigInteger f() {
        return this.f55519b.s();
    }

    public BigInteger h() {
        org.bouncycastle.asn1.i iVar = this.f55520c;
        if (iVar != null) {
            return iVar.s();
        }
        return null;
    }

    public e50.b i() {
        e50.b bVar = this.f55521d;
        return bVar != null ? bVar : f55517e;
    }

    public byte[] j() {
        return this.f55518a.r();
    }

    public boolean k() {
        e50.b bVar = this.f55521d;
        return bVar == null || bVar.equals(f55517e);
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(4);
        dVar.a(this.f55518a);
        dVar.a(this.f55519b);
        org.bouncycastle.asn1.i iVar = this.f55520c;
        if (iVar != null) {
            dVar.a(iVar);
        }
        e50.b bVar = this.f55521d;
        if (bVar != null && !bVar.equals(f55517e)) {
            dVar.a(this.f55521d);
        }
        return new w0(dVar);
    }
}