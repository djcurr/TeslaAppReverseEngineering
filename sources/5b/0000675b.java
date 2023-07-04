package e50;

import java.io.IOException;

/* loaded from: classes5.dex */
public class v0 {

    /* renamed from: c  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24808c;

    /* renamed from: d  reason: collision with root package name */
    public static final org.bouncycastle.asn1.k f24809d;

    /* renamed from: a  reason: collision with root package name */
    boolean f24810a;

    /* renamed from: b  reason: collision with root package name */
    org.bouncycastle.asn1.l f24811b;

    static {
        new org.bouncycastle.asn1.k("2.5.29.9");
        new org.bouncycastle.asn1.k("2.5.29.14");
        new org.bouncycastle.asn1.k("2.5.29.15");
        new org.bouncycastle.asn1.k("2.5.29.16");
        new org.bouncycastle.asn1.k("2.5.29.17");
        new org.bouncycastle.asn1.k("2.5.29.18");
        new org.bouncycastle.asn1.k("2.5.29.19");
        new org.bouncycastle.asn1.k("2.5.29.20");
        f24808c = new org.bouncycastle.asn1.k("2.5.29.21");
        new org.bouncycastle.asn1.k("2.5.29.23");
        new org.bouncycastle.asn1.k("2.5.29.24");
        new org.bouncycastle.asn1.k("2.5.29.27");
        new org.bouncycastle.asn1.k("2.5.29.28");
        f24809d = new org.bouncycastle.asn1.k("2.5.29.29");
        new org.bouncycastle.asn1.k("2.5.29.30");
        new org.bouncycastle.asn1.k("2.5.29.31");
        new org.bouncycastle.asn1.k("2.5.29.32");
        new org.bouncycastle.asn1.k("2.5.29.33");
        new org.bouncycastle.asn1.k("2.5.29.35");
        new org.bouncycastle.asn1.k("2.5.29.36");
        new org.bouncycastle.asn1.k("2.5.29.37");
        new org.bouncycastle.asn1.k("2.5.29.46");
        new org.bouncycastle.asn1.k("2.5.29.54");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.1");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.11");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.12");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.2");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.3");
        new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.1.4");
        new org.bouncycastle.asn1.k("2.5.29.56");
        new org.bouncycastle.asn1.k("2.5.29.55");
    }

    public v0(org.bouncycastle.asn1.c cVar, org.bouncycastle.asn1.l lVar) {
        this.f24810a = cVar.t();
        this.f24811b = lVar;
    }

    public v0(boolean z11, org.bouncycastle.asn1.l lVar) {
        this.f24810a = z11;
        this.f24811b = lVar;
    }

    public static org.bouncycastle.asn1.n a(v0 v0Var) {
        try {
            return org.bouncycastle.asn1.n.k(v0Var.b().r());
        } catch (IOException e11) {
            throw new IllegalArgumentException("can't convert extension: " + e11);
        }
    }

    public org.bouncycastle.asn1.l b() {
        return this.f24811b;
    }

    public boolean c() {
        return this.f24810a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof v0) {
            v0 v0Var = (v0) obj;
            return v0Var.b().j(b()) && v0Var.c() == c();
        }
        return false;
    }

    public int hashCode() {
        return c() ? b().hashCode() : ~b().hashCode();
    }
}