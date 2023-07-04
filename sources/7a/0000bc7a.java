package w60;

import org.bouncycastle.asn1.p;
import org.bouncycastle.asn1.s;
import org.bouncycastle.asn1.s0;
import org.bouncycastle.asn1.w0;
import org.bouncycastle.asn1.z0;

/* loaded from: classes5.dex */
public class k extends e40.c {

    /* renamed from: a  reason: collision with root package name */
    private final int f55719a;

    /* renamed from: b  reason: collision with root package name */
    private final long f55720b;

    /* renamed from: c  reason: collision with root package name */
    private final long f55721c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f55722d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f55723e;

    /* renamed from: f  reason: collision with root package name */
    private final byte[] f55724f;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f55725g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f55726h;

    public k(long j11, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f55719a = 0;
        this.f55720b = j11;
        this.f55722d = org.bouncycastle.util.a.h(bArr);
        this.f55723e = org.bouncycastle.util.a.h(bArr2);
        this.f55724f = org.bouncycastle.util.a.h(bArr3);
        this.f55725g = org.bouncycastle.util.a.h(bArr4);
        this.f55726h = org.bouncycastle.util.a.h(bArr5);
        this.f55721c = -1L;
    }

    public k(long j11, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j12) {
        this.f55719a = 1;
        this.f55720b = j11;
        this.f55722d = org.bouncycastle.util.a.h(bArr);
        this.f55723e = org.bouncycastle.util.a.h(bArr2);
        this.f55724f = org.bouncycastle.util.a.h(bArr3);
        this.f55725g = org.bouncycastle.util.a.h(bArr4);
        this.f55726h = org.bouncycastle.util.a.h(bArr5);
        this.f55721c = j12;
    }

    private k(p pVar) {
        long j11;
        org.bouncycastle.asn1.i p11 = org.bouncycastle.asn1.i.p(pVar.r(0));
        if (!p11.t(0) && !p11.t(1)) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        this.f55719a = p11.x();
        if (pVar.size() != 2 && pVar.size() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        p p12 = p.p(pVar.r(1));
        this.f55720b = org.bouncycastle.asn1.i.p(p12.r(0)).A();
        this.f55722d = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.p(p12.r(1)).r());
        this.f55723e = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.p(p12.r(2)).r());
        this.f55724f = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.p(p12.r(3)).r());
        this.f55725g = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.p(p12.r(4)).r());
        if (p12.size() == 6) {
            s p13 = s.p(p12.r(5));
            if (p13.s() != 0) {
                throw new IllegalArgumentException("unknown tag in XMSSPrivateKey");
            }
            j11 = org.bouncycastle.asn1.i.q(p13, false).A();
        } else if (p12.size() != 5) {
            throw new IllegalArgumentException("keySeq should be 5 or 6 in length");
        } else {
            j11 = -1;
        }
        this.f55721c = j11;
        if (pVar.size() == 3) {
            this.f55726h = org.bouncycastle.util.a.h(org.bouncycastle.asn1.l.q(s.p(pVar.r(2)), true).r());
        } else {
            this.f55726h = null;
        }
    }

    public static k h(Object obj) {
        if (obj instanceof k) {
            return (k) obj;
        }
        if (obj != null) {
            return new k(p.p(obj));
        }
        return null;
    }

    public byte[] e() {
        return org.bouncycastle.util.a.h(this.f55726h);
    }

    public long f() {
        return this.f55720b;
    }

    public long i() {
        return this.f55721c;
    }

    public byte[] j() {
        return org.bouncycastle.util.a.h(this.f55724f);
    }

    public byte[] k() {
        return org.bouncycastle.util.a.h(this.f55725g);
    }

    public byte[] m() {
        return org.bouncycastle.util.a.h(this.f55723e);
    }

    public byte[] n() {
        return org.bouncycastle.util.a.h(this.f55722d);
    }

    public int o() {
        return this.f55719a;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d();
        dVar.a(this.f55721c >= 0 ? new org.bouncycastle.asn1.i(1L) : new org.bouncycastle.asn1.i(0L));
        org.bouncycastle.asn1.d dVar2 = new org.bouncycastle.asn1.d();
        dVar2.a(new org.bouncycastle.asn1.i(this.f55720b));
        dVar2.a(new s0(this.f55722d));
        dVar2.a(new s0(this.f55723e));
        dVar2.a(new s0(this.f55724f));
        dVar2.a(new s0(this.f55725g));
        long j11 = this.f55721c;
        if (j11 >= 0) {
            dVar2.a(new z0(false, 0, new org.bouncycastle.asn1.i(j11)));
        }
        dVar.a(new w0(dVar2));
        dVar.a(new z0(true, 0, new s0(this.f55726h)));
        return new w0(dVar);
    }
}