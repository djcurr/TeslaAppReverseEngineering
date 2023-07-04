package v6;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private String f54107a;

    /* renamed from: b  reason: collision with root package name */
    private String f54108b;

    /* renamed from: c  reason: collision with root package name */
    private String f54109c;

    /* renamed from: d  reason: collision with root package name */
    private String f54110d;

    /* renamed from: e  reason: collision with root package name */
    private String f54111e;

    /* renamed from: f  reason: collision with root package name */
    private String f54112f;

    /* renamed from: g  reason: collision with root package name */
    private String f54113g;

    public d() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public d(String postalCode, String street, String stateOrProvince, String houseNumberOrName, String apartmentSuite, String city, String country) {
        kotlin.jvm.internal.s.g(postalCode, "postalCode");
        kotlin.jvm.internal.s.g(street, "street");
        kotlin.jvm.internal.s.g(stateOrProvince, "stateOrProvince");
        kotlin.jvm.internal.s.g(houseNumberOrName, "houseNumberOrName");
        kotlin.jvm.internal.s.g(apartmentSuite, "apartmentSuite");
        kotlin.jvm.internal.s.g(city, "city");
        kotlin.jvm.internal.s.g(country, "country");
        this.f54107a = postalCode;
        this.f54108b = street;
        this.f54109c = stateOrProvince;
        this.f54110d = houseNumberOrName;
        this.f54111e = apartmentSuite;
        this.f54112f = city;
        this.f54113g = country;
    }

    public final String a() {
        return this.f54111e;
    }

    public final String b() {
        return this.f54112f;
    }

    public final String c() {
        return this.f54113g;
    }

    public final String d() {
        return this.f54110d;
    }

    public final String e() {
        return this.f54107a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            return kotlin.jvm.internal.s.c(this.f54107a, dVar.f54107a) && kotlin.jvm.internal.s.c(this.f54108b, dVar.f54108b) && kotlin.jvm.internal.s.c(this.f54109c, dVar.f54109c) && kotlin.jvm.internal.s.c(this.f54110d, dVar.f54110d) && kotlin.jvm.internal.s.c(this.f54111e, dVar.f54111e) && kotlin.jvm.internal.s.c(this.f54112f, dVar.f54112f) && kotlin.jvm.internal.s.c(this.f54113g, dVar.f54113g);
        }
        return false;
    }

    public final String f() {
        return this.f54109c;
    }

    public final String g() {
        return this.f54108b;
    }

    public final void h() {
        this.f54107a = "";
        this.f54108b = "";
        this.f54109c = "";
        this.f54110d = "";
        this.f54111e = "";
        this.f54112f = "";
    }

    public int hashCode() {
        return (((((((((((this.f54107a.hashCode() * 31) + this.f54108b.hashCode()) * 31) + this.f54109c.hashCode()) * 31) + this.f54110d.hashCode()) * 31) + this.f54111e.hashCode()) * 31) + this.f54112f.hashCode()) * 31) + this.f54113g.hashCode();
    }

    public final void i(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f54111e = str;
    }

    public final void j(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f54112f = str;
    }

    public final void k(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f54113g = str;
    }

    public final void l(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f54110d = str;
    }

    public final void m(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f54107a = str;
    }

    public final void n(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f54109c = str;
    }

    public final void o(String str) {
        kotlin.jvm.internal.s.g(str, "<set-?>");
        this.f54108b = str;
    }

    public String toString() {
        return "AddressInputModel(postalCode=" + this.f54107a + ", street=" + this.f54108b + ", stateOrProvince=" + this.f54109c + ", houseNumberOrName=" + this.f54110d + ", apartmentSuite=" + this.f54111e + ", city=" + this.f54112f + ", country=" + this.f54113g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5, (i11 & 32) != 0 ? "" : str6, (i11 & 64) != 0 ? "" : str7);
    }
}