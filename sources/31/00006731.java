package e50;

/* loaded from: classes5.dex */
public class c0 extends e40.c {

    /* renamed from: b  reason: collision with root package name */
    private static final org.bouncycastle.asn1.k f24672b;

    /* renamed from: c  reason: collision with root package name */
    public static final c0 f24673c;

    /* renamed from: a  reason: collision with root package name */
    private org.bouncycastle.asn1.k f24674a;

    static {
        org.bouncycastle.asn1.k kVar = new org.bouncycastle.asn1.k("1.3.6.1.5.5.7.3");
        f24672b = kVar;
        new c0(u.f24796w.p("0"));
        new c0(kVar.p("1"));
        new c0(kVar.p("2"));
        new c0(kVar.p("3"));
        new c0(kVar.p("4"));
        new c0(kVar.p("5"));
        new c0(kVar.p("6"));
        new c0(kVar.p("7"));
        new c0(kVar.p("8"));
        f24673c = new c0(kVar.p("9"));
        new c0(kVar.p("10"));
        new c0(kVar.p("11"));
        new c0(kVar.p("12"));
        new c0(kVar.p("13"));
        new c0(kVar.p("14"));
        new c0(kVar.p("15"));
        new c0(kVar.p("16"));
        new c0(kVar.p("17"));
        new c0(kVar.p("18"));
        new c0(kVar.p("19"));
        new c0(new org.bouncycastle.asn1.k("1.3.6.1.4.1.311.20.2.2"));
        new c0(new org.bouncycastle.asn1.k("1.3.6.1.1.1.1.22"));
        new c0(new org.bouncycastle.asn1.k("1.3.6.1.4.1.311.10.3.3"));
        new c0(new org.bouncycastle.asn1.k("2.16.840.1.113730.4.1"));
    }

    private c0(org.bouncycastle.asn1.k kVar) {
        this.f24674a = kVar;
    }

    public String e() {
        return this.f24674a.t();
    }

    @Override // e40.c, e40.b
    public org.bouncycastle.asn1.n toASN1Primitive() {
        return this.f24674a;
    }

    public String toString() {
        return this.f24674a.toString();
    }
}