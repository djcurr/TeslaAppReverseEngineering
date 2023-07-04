package a50;

import java.math.BigInteger;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class b extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    BigInteger f237a;

    /* renamed from: b  reason: collision with root package name */
    a f238b;

    /* renamed from: c  reason: collision with root package name */
    i f239c;

    /* renamed from: d  reason: collision with root package name */
    l f240d;

    /* renamed from: e  reason: collision with root package name */
    i f241e;

    /* renamed from: f  reason: collision with root package name */
    l f242f;

    private b(p pVar) {
        this.f237a = BigInteger.valueOf(0L);
        int i11 = 0;
        if (pVar.r(0) instanceof s) {
            s sVar = (s) pVar.r(0);
            if (!sVar.t() || sVar.s() != 0) {
                throw new IllegalArgumentException("object parse error");
            }
            this.f237a = i.p(sVar.getLoadedObject()).s();
            i11 = 1;
        }
        this.f238b = a.e(pVar.r(i11));
        int i12 = i11 + 1;
        this.f239c = i.p(pVar.r(i12));
        int i13 = i12 + 1;
        this.f240d = l.p(pVar.r(i13));
        int i14 = i13 + 1;
        this.f241e = i.p(pVar.r(i14));
        this.f242f = l.p(pVar.r(i14 + 1));
    }

    public static b j(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj != null) {
            return new b(p.p(obj));
        }
        return null;
    }

    public BigInteger e() {
        return this.f239c.s();
    }

    public byte[] f() {
        return org.bouncycastle.util.a.h(this.f240d.r());
    }

    public a h() {
        return this.f238b;
    }

    public byte[] i() {
        return org.bouncycastle.util.a.h(this.f242f.r());
    }

    public BigInteger k() {
        return this.f241e.s();
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(6);
        if (this.f237a.compareTo(BigInteger.valueOf(0L)) != 0) {
            dVar.a(new z0(true, 0, new i(this.f237a)));
        }
        dVar.a(this.f238b);
        dVar.a(this.f239c);
        dVar.a(this.f240d);
        dVar.a(this.f241e);
        dVar.a(this.f242f);
        return new w0(dVar);
    }
}