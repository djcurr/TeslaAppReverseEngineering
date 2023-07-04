package v6;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public final class e implements e7.j {

    /* renamed from: a  reason: collision with root package name */
    private final j7.a<String> f54115a;

    /* renamed from: b  reason: collision with root package name */
    private final j7.a<String> f54116b;

    /* renamed from: c  reason: collision with root package name */
    private final j7.a<String> f54117c;

    /* renamed from: d  reason: collision with root package name */
    private final j7.a<String> f54118d;

    /* renamed from: e  reason: collision with root package name */
    private final j7.a<String> f54119e;

    /* renamed from: f  reason: collision with root package name */
    private final j7.a<String> f54120f;

    /* renamed from: g  reason: collision with root package name */
    private final j7.a<String> f54121g;

    public e(j7.a<String> postalCode, j7.a<String> street, j7.a<String> stateOrProvince, j7.a<String> houseNumberOrName, j7.a<String> apartmentSuite, j7.a<String> city, j7.a<String> country) {
        kotlin.jvm.internal.s.g(postalCode, "postalCode");
        kotlin.jvm.internal.s.g(street, "street");
        kotlin.jvm.internal.s.g(stateOrProvince, "stateOrProvince");
        kotlin.jvm.internal.s.g(houseNumberOrName, "houseNumberOrName");
        kotlin.jvm.internal.s.g(apartmentSuite, "apartmentSuite");
        kotlin.jvm.internal.s.g(city, "city");
        kotlin.jvm.internal.s.g(country, "country");
        this.f54115a = postalCode;
        this.f54116b = street;
        this.f54117c = stateOrProvince;
        this.f54118d = houseNumberOrName;
        this.f54119e = apartmentSuite;
        this.f54120f = city;
        this.f54121g = country;
    }

    public final j7.a<String> a() {
        return this.f54119e;
    }

    public final j7.a<String> b() {
        return this.f54120f;
    }

    public final j7.a<String> c() {
        return this.f54121g;
    }

    public final j7.a<String> d() {
        return this.f54118d;
    }

    public final j7.a<String> e() {
        return this.f54115a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            return kotlin.jvm.internal.s.c(this.f54115a, eVar.f54115a) && kotlin.jvm.internal.s.c(this.f54116b, eVar.f54116b) && kotlin.jvm.internal.s.c(this.f54117c, eVar.f54117c) && kotlin.jvm.internal.s.c(this.f54118d, eVar.f54118d) && kotlin.jvm.internal.s.c(this.f54119e, eVar.f54119e) && kotlin.jvm.internal.s.c(this.f54120f, eVar.f54120f) && kotlin.jvm.internal.s.c(this.f54121g, eVar.f54121g);
        }
        return false;
    }

    public final j7.a<String> f() {
        return this.f54117c;
    }

    public final j7.a<String> g() {
        return this.f54116b;
    }

    public boolean h() {
        return this.f54115a.a().a() && this.f54116b.a().a() && this.f54117c.a().a() && this.f54118d.a().a() && this.f54119e.a().a() && this.f54120f.a().a() && this.f54121g.a().a();
    }

    public int hashCode() {
        return (((((((((((this.f54115a.hashCode() * 31) + this.f54116b.hashCode()) * 31) + this.f54117c.hashCode()) * 31) + this.f54118d.hashCode()) * 31) + this.f54119e.hashCode()) * 31) + this.f54120f.hashCode()) * 31) + this.f54121g.hashCode();
    }

    public String toString() {
        return "AddressOutputData(postalCode=" + this.f54115a + ", street=" + this.f54116b + ", stateOrProvince=" + this.f54117c + ", houseNumberOrName=" + this.f54118d + ", apartmentSuite=" + this.f54119e + ", city=" + this.f54120f + ", country=" + this.f54121g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}