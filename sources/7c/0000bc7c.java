package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class m extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f55729a;

    /* renamed from: b  reason: collision with root package name */
    private final int f55730b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f55731c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f55732d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f55733e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f55734f;

    /* renamed from: g  reason: collision with root package name */
    private final int f55735g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f55736h;

    public m(int i11, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f55729a = 0;
        this.f55730b = i11;
        this.f55731c = org.bouncycastle.util.a.h(bArr);
        this.f55732d = org.bouncycastle.util.a.h(bArr2);
        this.f55733e = org.bouncycastle.util.a.h(bArr3);
        this.f55734f = org.bouncycastle.util.a.h(bArr4);
        this.f55736h = org.bouncycastle.util.a.h(bArr5);
        this.f55735g = -1;
    }

    public m(int i11, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, int i12) {
        this.f55729a = 1;
        this.f55730b = i11;
        this.f55731c = org.bouncycastle.util.a.h(bArr);
        this.f55732d = org.bouncycastle.util.a.h(bArr2);
        this.f55733e = org.bouncycastle.util.a.h(bArr3);
        this.f55734f = org.bouncycastle.util.a.h(bArr4);
        this.f55736h = org.bouncycastle.util.a.h(bArr5);
        this.f55735g = i12;
    }

    private m(p pVar) {
        int i11;
        org.bouncycastle.asn1.i p11 = org.bouncycastle.asn1.i.p(pVar.r(0));
        if (!p11.t(0) && !p11.t(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f55729a = p11.x();
        if (pVar.size() != 2 && pVar.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        p p12 = p.p(pVar.r(1));
        this.f55730b = org.bouncycastle.asn1.i.p(p12.r(0)).x();
        this.f55731c = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.p(p12.r(1)).r());
        this.f55732d = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.p(p12.r(2)).r());
        this.f55733e = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.p(p12.r(3)).r());
        this.f55734f = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.p(p12.r(4)).r());
        if (p12.size() == 6) {
            s p13 = s.p(p12.r(5));
            if (p13.s() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            i11 = org.bouncycastle.asn1.i.q(p13, false).x();
        } else if (p12.size() != 5) {
            throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
        } else {
            i11 = -1;
        }
        this.f55735g = i11;
        if (pVar.size() == 3) {
            this.f55736h = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.q(s.p(pVar.r(2)), true).r());
        } else {
            this.f55736h = null;
        }
    }

    public static m h(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(p.p(obj));
        }
        return null;
    }

    public byte[] e() {
        return org.bouncycastle.util.a.h(this.f55736h);
    }

    public int f() {
        return this.f55730b;
    }

    public int i() {
        return this.f55735g;
    }

    public byte[] j() {
        return org.bouncycastle.util.a.h(this.f55733e);
    }

    public byte[] k() {
        return org.bouncycastle.util.a.h(this.f55734f);
    }

    public byte[] m() {
        return org.bouncycastle.util.a.h(this.f55732d);
    }

    public byte[] n() {
        return org.bouncycastle.util.a.h(this.f55731c);
    }

    public int o() {
        return this.f55729a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        dVar.a(this.f55735g >= 0 ? new org.bouncycastle.asn1.i(1L) : new org.bouncycastle.asn1.i(0L));
        org.bouncycastle.asn1.d dVar2 = new org.bouncycastle.asn1.d();
        dVar2.a(new org.bouncycastle.asn1.i(this.f55730b));
        dVar2.a(new s0(this.f55731c));
        dVar2.a(new s0(this.f55732d));
        dVar2.a(new s0(this.f55733e));
        dVar2.a(new s0(this.f55734f));
        int i11 = this.f55735g;
        if (i11 >= 0) {
            dVar2.a(new z0(false, 0, new org.bouncycastle.asn1.i(i11)));
        }
        dVar.a(new w0(dVar2));
        dVar.a(new z0(true, 0, new s0(this.f55736h)));
        return new w0(dVar);
    }
}