package q40;

import java.math.BigInteger;
import org.bouncycastle.asn1.i;
import org.bouncycastle.asn1.l;
import org.bouncycastle.asn1.n;
import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;

/* loaded from: classes5.dex */
public class f extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f47481a;

    /* renamed from: b  reason: collision with root package name */
    private final BigInteger f47482b;

    /* renamed from: c  reason: collision with root package name */
    private final BigInteger f47483c;

    /* renamed from: d  reason: collision with root package name */
    private final BigInteger f47484d;

    /* renamed from: e  reason: collision with root package name */
    private final BigInteger f47485e;

    private f(p pVar) {
        if (pVar.size() != 4 && pVar.size() != 5) {
            throw new IllegalArgumentException("invalid sequence: size = " + pVar.size());
        }
        this.f47481a = org.bouncycastle.util.a.h(l.p(pVar.r(0)).r());
        this.f47482b = i.p(pVar.r(1)).s();
        this.f47483c = i.p(pVar.r(2)).s();
        this.f47484d = i.p(pVar.r(3)).s();
        this.f47485e = pVar.size() == 5 ? i.p(pVar.r(4)).s() : null;
    }

    public f(byte[] bArr, int i11, int i12, int i13, int i14) {
        this(bArr, BigInteger.valueOf(i11), BigInteger.valueOf(i12), BigInteger.valueOf(i13), BigInteger.valueOf(i14));
    }

    public f(byte[] bArr, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.f47481a = org.bouncycastle.util.a.h(bArr);
        this.f47482b = bigInteger;
        this.f47483c = bigInteger2;
        this.f47484d = bigInteger3;
        this.f47485e = bigInteger4;
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

    public BigInteger e() {
        return this.f47483c;
    }

    public BigInteger f() {
        return this.f47482b;
    }

    public BigInteger i() {
        return this.f47485e;
    }

    public BigInteger j() {
        return this.f47484d;
    }

    public byte[] k() {
        return org.bouncycastle.util.a.h(this.f47481a);
    }

    @Override // e40.c, e40.b
    public n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(5);
        dVar.a(new s0(this.f47481a));
        dVar.a(new i(this.f47482b));
        dVar.a(new i(this.f47483c));
        dVar.a(new i(this.f47484d));
        BigInteger bigInteger = this.f47485e;
        if (bigInteger != null) {
            dVar.a(new i(bigInteger));
        }
        return new w0(dVar);
    }
}