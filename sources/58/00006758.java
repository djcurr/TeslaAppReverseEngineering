package e50;

import java.io.IOException;

/* loaded from: classes5.dex */
public class u extends e40.c {
    public static final org.bouncycastle.asn1.k A;
    public static final org.bouncycastle.asn1.k B;

    /* renamed from: d  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24781d;

    /* renamed from: e  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24782e;

    /* renamed from: f  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24783f;

    /* renamed from: g  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24784g;

    /* renamed from: h  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24785h;

    /* renamed from: i  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24786i;

    /* renamed from: j  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24787j;

    /* renamed from: k  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24788k;

    /* renamed from: l  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24789l;

    /* renamed from: m  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24790m;

    /* renamed from: n  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24791n;

    /* renamed from: o  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24792o;

    /* renamed from: p  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24793p;

    /* renamed from: q  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24794q;

    /* renamed from: t  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24795t;

    /* renamed from: w  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24796w;

    /* renamed from: x  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24797x;

    /* renamed from: y  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24798y;

    /* renamed from: z  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24799z;

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.k f24800a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f24801b;

    /* renamed from: c  reason: collision with root package name */
    private org.bouncycastle.asn1.l f24802c;

    static {
        new org.bouncycastle.asn1.k("2.5.29.9").w();
        new org.bouncycastle.asn1.k("2.5.29.14").w();
        f24781d = new org.bouncycastle.asn1.k("2.5.29.15").w();
        new org.bouncycastle.asn1.k("2.5.29.16").w();
        f24782e = new org.bouncycastle.asn1.k("2.5.29.17").w();
        f24783f = new org.bouncycastle.asn1.k("2.5.29.18").w();
        f24784g = new org.bouncycastle.asn1.k("2.5.29.19").w();
        f24785h = new org.bouncycastle.asn1.k("2.5.29.20").w();
        f24786i = new org.bouncycastle.asn1.k("2.5.29.21").w();
        new org.bouncycastle.asn1.k("2.5.29.23").w();
        new org.bouncycastle.asn1.k("2.5.29.24").w();
        f24787j = new org.bouncycastle.asn1.k("2.5.29.27").w();
        f24788k = new org.bouncycastle.asn1.k("2.5.29.28").w();
        f24789l = new org.bouncycastle.asn1.k("2.5.29.29").w();
        f24790m = new org.bouncycastle.asn1.k("2.5.29.30").w();
        f24791n = new org.bouncycastle.asn1.k("2.5.29.31").w();
        f24792o = new org.bouncycastle.asn1.k("2.5.29.32").w();
        f24793p = new org.bouncycastle.asn1.k("2.5.29.33").w();
        f24794q = new org.bouncycastle.asn1.k("2.5.29.35").w();
        f24795t = new org.bouncycastle.asn1.k("2.5.29.36").w();
        f24796w = new org.bouncycastle.asn1.k("2.5.29.37").w();
        f24797x = new org.bouncycastle.asn1.k("2.5.29.46").w();
        f24798y = new org.bouncycastle.asn1.k("2.5.29.54").w();
        f24799z = new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.1").w();
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.11").w();
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.12").w();
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.2").w();
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.3").w();
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.4").w();
        A = new org.bouncycastle.asn1.k("2.5.29.56").w();
        B = new org.bouncycastle.asn1.k("2.5.29.55").w();
        new org.bouncycastle.asn1.k("2.5.29.60").w();
    }

    public u(org.bouncycastle.asn1.k kVar, boolean z11, org.bouncycastle.asn1.l lVar) {
        this.f24800a = kVar;
        this.f24801b = z11;
        this.f24802c = lVar;
    }

    public u(org.bouncycastle.asn1.k kVar, boolean z11, byte[] bArr) {
        this(kVar, z11, new org.bouncycastle.asn1.s0(bArr));
    }

    private u(org.bouncycastle.asn1.p pVar) {
        e40.b r11;
        if (pVar.size() == 2) {
            this.f24800a = org.bouncycastle.asn1.k.u(pVar.r(0));
            this.f24801b = false;
            r11 = pVar.r(1);
        } else if (pVar.size() != 3) {
            throw new IllegalArgumentException("Bad sequence size: " + pVar.size());
        } else {
            this.f24800a = org.bouncycastle.asn1.k.u(pVar.r(0));
            this.f24801b = org.bouncycastle.asn1.c.q(pVar.r(1)).t();
            r11 = pVar.r(2);
        }
        this.f24802c = org.bouncycastle.asn1.l.p(r11);
    }

    private static org.bouncycastle.asn1.n e(u uVar) {
        try {
            return org.bouncycastle.asn1.n.k(uVar.h().r());
        } catch (IOException e11) {
            throw new IllegalArgumentException("can't convert extension: " + e11);
        }
    }

    public static u i(Object obj) {
        if (obj instanceof u) {
            return (u) obj;
        }
        if (obj != null) {
            return new u(org.bouncycastle.asn1.p.p(obj));
        }
        return null;
    }

    @Override // e40.c
    public boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            return uVar.f().j(f()) && uVar.h().j(h()) && uVar.k() == k();
        }
        return false;
    }

    public org.bouncycastle.asn1.k f() {
        return this.f24800a;
    }

    public org.bouncycastle.asn1.l h() {
        return this.f24802c;
    }

    @Override // e40.c
    public int hashCode() {
        return k() ? h().hashCode() ^ f().hashCode() : ~(h().hashCode() ^ f().hashCode());
    }

    public e40.b j() {
        return e(this);
    }

    public boolean k() {
        return this.f24801b;
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        org.bouncycastle.asn1.d dVar = new org.bouncycastle.asn1.d(3);
        dVar.a(this.f24800a);
        if (this.f24801b) {
            dVar.a(org.bouncycastle.asn1.c.s(true));
        }
        dVar.a(this.f24802c);
        return new org.bouncycastle.asn1.w0(dVar);
    }
}