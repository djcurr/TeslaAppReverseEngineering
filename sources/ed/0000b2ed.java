package sv;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f50675a;

    /* renamed from: b  reason: collision with root package name */
    private String f50676b;

    /* renamed from: c  reason: collision with root package name */
    private String f50677c;

    /* renamed from: d  reason: collision with root package name */
    private String f50678d;

    /* renamed from: e  reason: collision with root package name */
    private String f50679e;

    /* renamed from: f  reason: collision with root package name */
    private String f50680f;

    /* renamed from: g  reason: collision with root package name */
    private String f50681g;

    /* renamed from: h  reason: collision with root package name */
    private String f50682h;

    /* renamed from: i  reason: collision with root package name */
    private String f50683i;

    /* renamed from: j  reason: collision with root package name */
    private String f50684j;

    /* renamed from: k  reason: collision with root package name */
    private String f50685k;

    /* renamed from: l  reason: collision with root package name */
    private String f50686l;

    /* loaded from: classes6.dex */
    public static final class a implements Parcelable.Creator<b> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final b createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new b(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final b[] newArray(int i11) {
            return new b[i11];
        }
    }

    public b(String countryCode, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        s.g(countryCode, "countryCode");
        this.f50675a = countryCode;
        this.f50676b = str;
        this.f50677c = str2;
        this.f50678d = str3;
        this.f50679e = str4;
        this.f50680f = str5;
        this.f50681g = str6;
        this.f50682h = str7;
        this.f50683i = str8;
        this.f50684j = str9;
        this.f50685k = str10;
        this.f50686l = str11;
    }

    public final b a(String countryCode, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        s.g(countryCode, "countryCode");
        return new b(countryCode, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11);
    }

    public final String c() {
        return this.f50676b;
    }

    public final String d() {
        return this.f50682h;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String e() {
        return this.f50675a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return s.c(this.f50675a, bVar.f50675a) && s.c(this.f50676b, bVar.f50676b) && s.c(this.f50677c, bVar.f50677c) && s.c(this.f50678d, bVar.f50678d) && s.c(this.f50679e, bVar.f50679e) && s.c(this.f50680f, bVar.f50680f) && s.c(this.f50681g, bVar.f50681g) && s.c(this.f50682h, bVar.f50682h) && s.c(this.f50683i, bVar.f50683i) && s.c(this.f50684j, bVar.f50684j) && s.c(this.f50685k, bVar.f50685k) && s.c(this.f50686l, bVar.f50686l);
        }
        return false;
    }

    public final String f() {
        return this.f50677c;
    }

    public final String g() {
        return this.f50685k;
    }

    public final String h() {
        return this.f50679e;
    }

    public int hashCode() {
        int hashCode = this.f50675a.hashCode() * 31;
        String str = this.f50676b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f50677c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f50678d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f50679e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f50680f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f50681g;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f50682h;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f50683i;
        int hashCode9 = (hashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f50684j;
        int hashCode10 = (hashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f50685k;
        int hashCode11 = (hashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f50686l;
        return hashCode11 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String i() {
        return this.f50678d;
    }

    public final String j() {
        return this.f50686l;
    }

    public final String k() {
        return this.f50684j;
    }

    public final String l() {
        return this.f50680f;
    }

    public final String m() {
        return this.f50681g;
    }

    public final String n() {
        return this.f50683i;
    }

    public String toString() {
        return "DatabaseForm(countryCode=" + this.f50675a + ", birthdate=" + ((Object) this.f50676b) + ", firstName=" + ((Object) this.f50677c) + ", middleName=" + ((Object) this.f50678d) + ", lastName=" + ((Object) this.f50679e) + ", street1=" + ((Object) this.f50680f) + ", street2=" + ((Object) this.f50681g) + ", city=" + ((Object) this.f50682h) + ", subdivision=" + ((Object) this.f50683i) + ", postalCode=" + ((Object) this.f50684j) + ", idNumber=" + ((Object) this.f50685k) + ", phoneNumber=" + ((Object) this.f50686l) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f50675a);
        out.writeString(this.f50676b);
        out.writeString(this.f50677c);
        out.writeString(this.f50678d);
        out.writeString(this.f50679e);
        out.writeString(this.f50680f);
        out.writeString(this.f50681g);
        out.writeString(this.f50682h);
        out.writeString(this.f50683i);
        out.writeString(this.f50684j);
        out.writeString(this.f50685k);
        out.writeString(this.f50686l);
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : str3, (i11 & 8) != 0 ? null : str4, (i11 & 16) != 0 ? null : str5, (i11 & 32) != 0 ? null : str6, (i11 & 64) != 0 ? null : str7, (i11 & 128) != 0 ? null : str8, (i11 & 256) != 0 ? null : str9, (i11 & 512) != 0 ? null : str10, (i11 & 1024) != 0 ? null : str11, (i11 & 2048) == 0 ? str12 : null);
    }
}