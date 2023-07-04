package qv;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.text.v;
import qv.l;
import qv.m;
import vz.b0;
import wz.x;

/* loaded from: classes6.dex */
public abstract class j implements Parcelable {

    /* loaded from: classes6.dex */
    public static final class a extends j {

        /* renamed from: a  reason: collision with root package name */
        public static final a f48536a = new a();
        public static final Parcelable.Creator<a> CREATOR = new C1040a();

        /* renamed from: qv.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1040a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                parcel.readInt();
                return a.f48536a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        private a() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeInt(1);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends j {

        /* renamed from: a  reason: collision with root package name */
        private final String f48538a;

        /* renamed from: b  reason: collision with root package name */
        private final c.d f48539b;

        /* renamed from: c  reason: collision with root package name */
        private final c.a f48540c;

        /* renamed from: d  reason: collision with root package name */
        private final c.C1043b f48541d;

        /* renamed from: e  reason: collision with root package name */
        private final c.C1044c f48542e;

        /* renamed from: f  reason: collision with root package name */
        private c.e f48543f;

        /* renamed from: g  reason: collision with root package name */
        private final List<String> f48544g;

        /* renamed from: h  reason: collision with root package name */
        private final boolean f48545h;

        /* renamed from: i  reason: collision with root package name */
        private final boolean f48546i;

        /* renamed from: j  reason: collision with root package name */
        public static final a f48537j = new a(null);
        public static final Parcelable.Creator<b> CREATOR = new C1041b();

        /* loaded from: classes6.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final b a(Set<String> inputFields, String countryCode, m.a.C1050a prefill) {
                boolean w11;
                kotlin.jvm.internal.s.g(inputFields, "inputFields");
                kotlin.jvm.internal.s.g(countryCode, "countryCode");
                kotlin.jvm.internal.s.g(prefill, "prefill");
                ArrayList arrayList = new ArrayList();
                c.d dVar = null;
                c.a aVar = null;
                c.C1043b c1043b = null;
                c.C1044c c1044c = null;
                c.e eVar = null;
                for (String str : inputFields) {
                    switch (str.hashCode()) {
                        case -1209078547:
                            if (str.equals("birthdate")) {
                                c1043b = new c.C1043b(prefill.g());
                                String o11 = m0.b(c.C1043b.class).o();
                                if (o11 == null) {
                                    break;
                                } else {
                                    arrayList.add(o11);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -1147692044:
                            if (str.equals("address")) {
                                String c11 = prefill.c();
                                String d11 = prefill.d();
                                String a11 = prefill.a();
                                String f11 = prefill.f();
                                w11 = v.w(f11);
                                if (w11) {
                                    f11 = prefill.e();
                                }
                                aVar = new c.a(c11, d11, a11, f11, prefill.b());
                                String o12 = m0.b(c.a.class).o();
                                if (o12 == null) {
                                    break;
                                } else {
                                    arrayList.add(o12);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -612351174:
                            if (str.equals("phone_number")) {
                                eVar = new c.e(prefill.k());
                                String o13 = m0.b(c.e.class).o();
                                if (o13 == null) {
                                    break;
                                } else {
                                    arrayList.add(o13);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -98987986:
                            if (str.equals("identification_number_full_9")) {
                                c1044c = new c.C1044c(l.c.b.SSN_FULL, null, 2, null);
                                String o14 = m0.b(c.C1044c.class).o();
                                if (o14 == null) {
                                    break;
                                } else {
                                    arrayList.add(o14);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 3373707:
                            if (str.equals("name")) {
                                dVar = new c.d(prefill.h(), prefill.j(), prefill.i());
                                String o15 = m0.b(c.d.class).o();
                                if (o15 == null) {
                                    break;
                                } else {
                                    arrayList.add(o15);
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 54532720:
                            if (str.equals("identification_number_last_4")) {
                                c1044c = new c.C1044c(l.c.b.SSN_LAST_4, null, 2, null);
                                String o16 = m0.b(c.C1044c.class).o();
                                if (o16 == null) {
                                    break;
                                } else {
                                    arrayList.add(o16);
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                }
                return new b(countryCode, dVar, aVar, c1043b, c1044c, eVar, arrayList, false, false, 384, null);
            }
        }

        /* renamed from: qv.j$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1041b implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new b(parcel.readString(), parcel.readInt() == 0 ? null : c.d.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.a.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.C1043b.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : c.C1044c.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? c.e.CREATOR.createFromParcel(parcel) : null, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* loaded from: classes6.dex */
        public static abstract class c implements Parcelable {

            /* loaded from: classes6.dex */
            public static final class a extends c {
                public static final Parcelable.Creator<a> CREATOR = new C1042a();

                /* renamed from: a  reason: collision with root package name */
                private final String f48547a;

                /* renamed from: b  reason: collision with root package name */
                private final String f48548b;

                /* renamed from: c  reason: collision with root package name */
                private final String f48549c;

                /* renamed from: d  reason: collision with root package name */
                private final String f48550d;

                /* renamed from: e  reason: collision with root package name */
                private final String f48551e;

                /* renamed from: qv.j$b$c$a$a  reason: collision with other inner class name */
                /* loaded from: classes6.dex */
                public static final class C1042a implements Parcelable.Creator<a> {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final a createFromParcel(Parcel parcel) {
                        kotlin.jvm.internal.s.g(parcel, "parcel");
                        return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b */
                    public final a[] newArray(int i11) {
                        return new a[i11];
                    }
                }

                public a() {
                    this(null, null, null, null, null, 31, null);
                }

                public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3, (i11 & 8) != 0 ? "" : str4, (i11 & 16) != 0 ? "" : str5);
                }

                public static /* synthetic */ a c(a aVar, String str, String str2, String str3, String str4, String str5, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = aVar.f48547a;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = aVar.f48548b;
                    }
                    String str6 = str2;
                    if ((i11 & 4) != 0) {
                        str3 = aVar.f48549c;
                    }
                    String str7 = str3;
                    if ((i11 & 8) != 0) {
                        str4 = aVar.f48550d;
                    }
                    String str8 = str4;
                    if ((i11 & 16) != 0) {
                        str5 = aVar.f48551e;
                    }
                    return aVar.b(str, str6, str7, str8, str5);
                }

                @Override // qv.j.b.c
                public boolean a() {
                    return this.f48547a.length() > 0;
                }

                public final a b(String street1, String street2, String city, String subdivision, String postalCode) {
                    kotlin.jvm.internal.s.g(street1, "street1");
                    kotlin.jvm.internal.s.g(street2, "street2");
                    kotlin.jvm.internal.s.g(city, "city");
                    kotlin.jvm.internal.s.g(subdivision, "subdivision");
                    kotlin.jvm.internal.s.g(postalCode, "postalCode");
                    return new a(street1, street2, city, subdivision, postalCode);
                }

                public final String d() {
                    return this.f48549c;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final String e() {
                    return this.f48551e;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof a) {
                        a aVar = (a) obj;
                        return kotlin.jvm.internal.s.c(this.f48547a, aVar.f48547a) && kotlin.jvm.internal.s.c(this.f48548b, aVar.f48548b) && kotlin.jvm.internal.s.c(this.f48549c, aVar.f48549c) && kotlin.jvm.internal.s.c(this.f48550d, aVar.f48550d) && kotlin.jvm.internal.s.c(this.f48551e, aVar.f48551e);
                    }
                    return false;
                }

                public final String f() {
                    return this.f48547a;
                }

                public final String g() {
                    return this.f48548b;
                }

                public final String h() {
                    return this.f48550d;
                }

                public int hashCode() {
                    return (((((((this.f48547a.hashCode() * 31) + this.f48548b.hashCode()) * 31) + this.f48549c.hashCode()) * 31) + this.f48550d.hashCode()) * 31) + this.f48551e.hashCode();
                }

                public String toString() {
                    return "AddressForm(street1=" + this.f48547a + ", street2=" + this.f48548b + ", city=" + this.f48549c + ", subdivision=" + this.f48550d + ", postalCode=" + this.f48551e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    kotlin.jvm.internal.s.g(out, "out");
                    out.writeString(this.f48547a);
                    out.writeString(this.f48548b);
                    out.writeString(this.f48549c);
                    out.writeString(this.f48550d);
                    out.writeString(this.f48551e);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(String street1, String street2, String city, String subdivision, String postalCode) {
                    super(null);
                    kotlin.jvm.internal.s.g(street1, "street1");
                    kotlin.jvm.internal.s.g(street2, "street2");
                    kotlin.jvm.internal.s.g(city, "city");
                    kotlin.jvm.internal.s.g(subdivision, "subdivision");
                    kotlin.jvm.internal.s.g(postalCode, "postalCode");
                    this.f48547a = street1;
                    this.f48548b = street2;
                    this.f48549c = city;
                    this.f48550d = subdivision;
                    this.f48551e = postalCode;
                }
            }

            /* renamed from: qv.j$b$c$b  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1043b extends c {
                public static final Parcelable.Creator<C1043b> CREATOR = new a();

                /* renamed from: a  reason: collision with root package name */
                private final String f48552a;

                /* renamed from: qv.j$b$c$b$a */
                /* loaded from: classes6.dex */
                public static final class a implements Parcelable.Creator<C1043b> {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final C1043b createFromParcel(Parcel parcel) {
                        kotlin.jvm.internal.s.g(parcel, "parcel");
                        return new C1043b(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b */
                    public final C1043b[] newArray(int i11) {
                        return new C1043b[i11];
                    }
                }

                public C1043b() {
                    this(null, 1, null);
                }

                public /* synthetic */ C1043b(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? "" : str);
                }

                @Override // qv.j.b.c
                public boolean a() {
                    return (this.f48552a.length() > 0) && l.b.f48568a.e(this.f48552a);
                }

                public final C1043b b(String birthdate) {
                    kotlin.jvm.internal.s.g(birthdate, "birthdate");
                    return new C1043b(birthdate);
                }

                public final String c() {
                    return this.f48552a;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C1043b) && kotlin.jvm.internal.s.c(this.f48552a, ((C1043b) obj).f48552a);
                }

                public int hashCode() {
                    return this.f48552a.hashCode();
                }

                public String toString() {
                    return "BirthdateForm(birthdate=" + this.f48552a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    kotlin.jvm.internal.s.g(out, "out");
                    out.writeString(this.f48552a);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1043b(String birthdate) {
                    super(null);
                    kotlin.jvm.internal.s.g(birthdate, "birthdate");
                    this.f48552a = birthdate;
                }
            }

            /* renamed from: qv.j$b$c$c  reason: collision with other inner class name */
            /* loaded from: classes6.dex */
            public static final class C1044c extends c {
                public static final Parcelable.Creator<C1044c> CREATOR = new a();

                /* renamed from: a  reason: collision with root package name */
                private final l.c.b f48553a;

                /* renamed from: b  reason: collision with root package name */
                private final String f48554b;

                /* renamed from: qv.j$b$c$c$a */
                /* loaded from: classes6.dex */
                public static final class a implements Parcelable.Creator<C1044c> {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final C1044c createFromParcel(Parcel parcel) {
                        kotlin.jvm.internal.s.g(parcel, "parcel");
                        return new C1044c(l.c.b.valueOf(parcel.readString()), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b */
                    public final C1044c[] newArray(int i11) {
                        return new C1044c[i11];
                    }
                }

                public /* synthetic */ C1044c(l.c.b bVar, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this(bVar, (i11 & 2) != 0 ? "" : str);
                }

                public static /* synthetic */ C1044c c(C1044c c1044c, l.c.b bVar, String str, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        bVar = c1044c.f48553a;
                    }
                    if ((i11 & 2) != 0) {
                        str = c1044c.f48554b;
                    }
                    return c1044c.b(bVar, str);
                }

                @Override // qv.j.b.c
                public boolean a() {
                    return (this.f48554b.length() > 0) && l.c.f48577a.c(this.f48554b, this.f48553a);
                }

                public final C1044c b(l.c.b type, String idNumber) {
                    kotlin.jvm.internal.s.g(type, "type");
                    kotlin.jvm.internal.s.g(idNumber, "idNumber");
                    return new C1044c(type, idNumber);
                }

                public final String d() {
                    return this.f48554b;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final l.c.b e() {
                    return this.f48553a;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof C1044c) {
                        C1044c c1044c = (C1044c) obj;
                        return this.f48553a == c1044c.f48553a && kotlin.jvm.internal.s.c(this.f48554b, c1044c.f48554b);
                    }
                    return false;
                }

                public int hashCode() {
                    return (this.f48553a.hashCode() * 31) + this.f48554b.hashCode();
                }

                public String toString() {
                    return "IdNumberForm(type=" + this.f48553a + ", idNumber=" + this.f48554b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    kotlin.jvm.internal.s.g(out, "out");
                    out.writeString(this.f48553a.name());
                    out.writeString(this.f48554b);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C1044c(l.c.b type, String idNumber) {
                    super(null);
                    kotlin.jvm.internal.s.g(type, "type");
                    kotlin.jvm.internal.s.g(idNumber, "idNumber");
                    this.f48553a = type;
                    this.f48554b = idNumber;
                }
            }

            /* loaded from: classes6.dex */
            public static final class d extends c {
                public static final Parcelable.Creator<d> CREATOR = new a();

                /* renamed from: a  reason: collision with root package name */
                private final String f48555a;

                /* renamed from: b  reason: collision with root package name */
                private final String f48556b;

                /* renamed from: c  reason: collision with root package name */
                private final String f48557c;

                /* loaded from: classes6.dex */
                public static final class a implements Parcelable.Creator<d> {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final d createFromParcel(Parcel parcel) {
                        kotlin.jvm.internal.s.g(parcel, "parcel");
                        return new d(parcel.readString(), parcel.readString(), parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b */
                    public final d[] newArray(int i11) {
                        return new d[i11];
                    }
                }

                public d() {
                    this(null, null, null, 7, null);
                }

                public /* synthetic */ d(String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? "" : str, (i11 & 2) != 0 ? "" : str2, (i11 & 4) != 0 ? "" : str3);
                }

                public static /* synthetic */ d c(d dVar, String str, String str2, String str3, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        str = dVar.f48555a;
                    }
                    if ((i11 & 2) != 0) {
                        str2 = dVar.f48556b;
                    }
                    if ((i11 & 4) != 0) {
                        str3 = dVar.f48557c;
                    }
                    return dVar.b(str, str2, str3);
                }

                @Override // qv.j.b.c
                public boolean a() {
                    return this.f48555a.length() > 0;
                }

                public final d b(String firstName, String middleName, String lastName) {
                    kotlin.jvm.internal.s.g(firstName, "firstName");
                    kotlin.jvm.internal.s.g(middleName, "middleName");
                    kotlin.jvm.internal.s.g(lastName, "lastName");
                    return new d(firstName, middleName, lastName);
                }

                public final String d() {
                    return this.f48555a;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public final String e() {
                    return this.f48557c;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (obj instanceof d) {
                        d dVar = (d) obj;
                        return kotlin.jvm.internal.s.c(this.f48555a, dVar.f48555a) && kotlin.jvm.internal.s.c(this.f48556b, dVar.f48556b) && kotlin.jvm.internal.s.c(this.f48557c, dVar.f48557c);
                    }
                    return false;
                }

                public int hashCode() {
                    return (((this.f48555a.hashCode() * 31) + this.f48556b.hashCode()) * 31) + this.f48557c.hashCode();
                }

                public String toString() {
                    return "NameForm(firstName=" + this.f48555a + ", middleName=" + this.f48556b + ", lastName=" + this.f48557c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    kotlin.jvm.internal.s.g(out, "out");
                    out.writeString(this.f48555a);
                    out.writeString(this.f48556b);
                    out.writeString(this.f48557c);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(String firstName, String middleName, String lastName) {
                    super(null);
                    kotlin.jvm.internal.s.g(firstName, "firstName");
                    kotlin.jvm.internal.s.g(middleName, "middleName");
                    kotlin.jvm.internal.s.g(lastName, "lastName");
                    this.f48555a = firstName;
                    this.f48556b = middleName;
                    this.f48557c = lastName;
                }
            }

            /* loaded from: classes6.dex */
            public static final class e extends c {
                public static final Parcelable.Creator<e> CREATOR = new a();

                /* renamed from: a  reason: collision with root package name */
                private final String f48558a;

                /* loaded from: classes6.dex */
                public static final class a implements Parcelable.Creator<e> {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a */
                    public final e createFromParcel(Parcel parcel) {
                        kotlin.jvm.internal.s.g(parcel, "parcel");
                        return new e(parcel.readString());
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b */
                    public final e[] newArray(int i11) {
                        return new e[i11];
                    }
                }

                public e() {
                    this(null, 1, null);
                }

                public /* synthetic */ e(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? "" : str);
                }

                @Override // qv.j.b.c
                public boolean a() {
                    return this.f48558a.length() > 0;
                }

                public final e b(String phoneNumber) {
                    kotlin.jvm.internal.s.g(phoneNumber, "phoneNumber");
                    return new e(phoneNumber);
                }

                public final String c() {
                    return this.f48558a;
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof e) && kotlin.jvm.internal.s.c(this.f48558a, ((e) obj).f48558a);
                }

                public int hashCode() {
                    return this.f48558a.hashCode();
                }

                public String toString() {
                    return "PhoneNumberForm(phoneNumber=" + this.f48558a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel out, int i11) {
                    kotlin.jvm.internal.s.g(out, "out");
                    out.writeString(this.f48558a);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(String phoneNumber) {
                    super(null);
                    kotlin.jvm.internal.s.g(phoneNumber, "phoneNumber");
                    this.f48558a = phoneNumber;
                }
            }

            private c() {
            }

            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public boolean a() {
                return false;
            }
        }

        public /* synthetic */ b(String str, c.d dVar, c.a aVar, c.C1043b c1043b, c.C1044c c1044c, c.e eVar, List list, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, dVar, aVar, c1043b, c1044c, eVar, list, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? false : z12);
        }

        public final b a(String countryCode, c.d dVar, c.a aVar, c.C1043b c1043b, c.C1044c c1044c, c.e eVar, List<String> ordering, boolean z11, boolean z12) {
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            kotlin.jvm.internal.s.g(ordering, "ordering");
            return new b(countryCode, dVar, aVar, c1043b, c1044c, eVar, ordering, z11, z12);
        }

        public final List<c> c() {
            int t11;
            Object k11;
            List<String> list = this.f48544g;
            t11 = x.t(list, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (String str : list) {
                if (kotlin.jvm.internal.s.c(str, m0.b(c.d.class).o())) {
                    k11 = j();
                } else if (kotlin.jvm.internal.s.c(str, m0.b(c.a.class).o())) {
                    k11 = d();
                } else if (kotlin.jvm.internal.s.c(str, m0.b(c.C1043b.class).o())) {
                    k11 = e();
                } else if (kotlin.jvm.internal.s.c(str, m0.b(c.C1044c.class).o())) {
                    k11 = h();
                } else {
                    k11 = kotlin.jvm.internal.s.c(str, m0.b(c.e.class).o()) ? k() : b0.f54756a;
                }
                arrayList.add(k11);
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (obj instanceof c) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }

        public final c.a d() {
            return this.f48540c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final c.C1043b e() {
            return this.f48541d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(this.f48538a, bVar.f48538a) && kotlin.jvm.internal.s.c(this.f48539b, bVar.f48539b) && kotlin.jvm.internal.s.c(this.f48540c, bVar.f48540c) && kotlin.jvm.internal.s.c(this.f48541d, bVar.f48541d) && kotlin.jvm.internal.s.c(this.f48542e, bVar.f48542e) && kotlin.jvm.internal.s.c(this.f48543f, bVar.f48543f) && kotlin.jvm.internal.s.c(this.f48544g, bVar.f48544g) && this.f48545h == bVar.f48545h && this.f48546i == bVar.f48546i;
            }
            return false;
        }

        public final String f() {
            return this.f48538a;
        }

        public final boolean g() {
            return this.f48546i;
        }

        public final c.C1044c h() {
            return this.f48542e;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = this.f48538a.hashCode() * 31;
            c.d dVar = this.f48539b;
            int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
            c.a aVar = this.f48540c;
            int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            c.C1043b c1043b = this.f48541d;
            int hashCode4 = (hashCode3 + (c1043b == null ? 0 : c1043b.hashCode())) * 31;
            c.C1044c c1044c = this.f48542e;
            int hashCode5 = (hashCode4 + (c1044c == null ? 0 : c1044c.hashCode())) * 31;
            c.e eVar = this.f48543f;
            int hashCode6 = (((hashCode5 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.f48544g.hashCode()) * 31;
            boolean z11 = this.f48545h;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode6 + i11) * 31;
            boolean z12 = this.f48546i;
            return i12 + (z12 ? 1 : z12 ? 1 : 0);
        }

        public final boolean i() {
            return this.f48545h;
        }

        public final c.d j() {
            return this.f48539b;
        }

        public final c.e k() {
            return this.f48543f;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
            r0 = r16.a((r26 & 1) != 0 ? r16.f50675a : null, (r26 & 2) != 0 ? r16.f50676b : null, (r26 & 4) != 0 ? r16.f50677c : null, (r26 & 8) != 0 ? r16.f50678d : null, (r26 & 16) != 0 ? r16.f50679e : null, (r26 & 32) != 0 ? r16.f50680f : r0.f(), (r26 & 64) != 0 ? r16.f50681g : r0.g(), (r26 & 128) != 0 ? r16.f50682h : r0.d(), (r26 & 256) != 0 ? r16.f50683i : r0.h(), (r26 & 512) != 0 ? r16.f50684j : r0.e(), (r26 & 1024) != 0 ? r16.f50685k : null, (r26 & 2048) != 0 ? r15.f50686l : null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
            r0 = r16.a((r26 & 1) != 0 ? r16.f50675a : null, (r26 & 2) != 0 ? r16.f50676b : r0.c(), (r26 & 4) != 0 ? r16.f50677c : null, (r26 & 8) != 0 ? r16.f50678d : null, (r26 & 16) != 0 ? r16.f50679e : null, (r26 & 32) != 0 ? r16.f50680f : null, (r26 & 64) != 0 ? r16.f50681g : null, (r26 & 128) != 0 ? r16.f50682h : null, (r26 & 256) != 0 ? r16.f50683i : null, (r26 & 512) != 0 ? r16.f50684j : null, (r26 & 1024) != 0 ? r16.f50685k : null, (r26 & 2048) != 0 ? r15.f50686l : null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
            r0 = r16.a((r26 & 1) != 0 ? r16.f50675a : null, (r26 & 2) != 0 ? r16.f50676b : null, (r26 & 4) != 0 ? r16.f50677c : null, (r26 & 8) != 0 ? r16.f50678d : null, (r26 & 16) != 0 ? r16.f50679e : null, (r26 & 32) != 0 ? r16.f50680f : null, (r26 & 64) != 0 ? r16.f50681g : null, (r26 & 128) != 0 ? r16.f50682h : null, (r26 & 256) != 0 ? r16.f50683i : null, (r26 & 512) != 0 ? r16.f50684j : null, (r26 & 1024) != 0 ? r16.f50685k : r0.d(), (r26 & 2048) != 0 ? r15.f50686l : null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x00dc, code lost:
            r0 = r16.a((r26 & 1) != 0 ? r16.f50675a : null, (r26 & 2) != 0 ? r16.f50676b : null, (r26 & 4) != 0 ? r16.f50677c : null, (r26 & 8) != 0 ? r16.f50678d : null, (r26 & 16) != 0 ? r16.f50679e : null, (r26 & 32) != 0 ? r16.f50680f : null, (r26 & 64) != 0 ? r16.f50681g : null, (r26 & 128) != 0 ? r16.f50682h : null, (r26 & 256) != 0 ? r16.f50683i : null, (r26 & 512) != 0 ? r16.f50684j : null, (r26 & 1024) != 0 ? r16.f50685k : null, (r26 & 2048) != 0 ? r15.f50686l : r0.c());
         */
        /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
            r0 = r15.a((r26 & 1) != 0 ? r15.f50675a : null, (r26 & 2) != 0 ? r15.f50676b : null, (r26 & 4) != 0 ? r15.f50677c : r0.d(), (r26 & 8) != 0 ? r15.f50678d : null, (r26 & 16) != 0 ? r15.f50679e : r0.e(), (r26 & 32) != 0 ? r15.f50680f : null, (r26 & 64) != 0 ? r15.f50681g : null, (r26 & 128) != 0 ? r15.f50682h : null, (r26 & 256) != 0 ? r15.f50683i : null, (r26 & 512) != 0 ? r15.f50684j : null, (r26 & 1024) != 0 ? r15.f50685k : null, (r26 & 2048) != 0 ? r15.f50686l : null);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final sv.b l() {
            /*
                Method dump skipped, instructions count: 261
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: qv.j.b.l():sv.b");
        }

        public String toString() {
            return "EnteringDatabase(countryCode=" + this.f48538a + ", nameForm=" + this.f48539b + ", addressForm=" + this.f48540c + ", birthdateForm=" + this.f48541d + ", idNumberForm=" + this.f48542e + ", phoneNumberForm=" + this.f48543f + ", ordering=" + this.f48544g + ", idNumberVisible=" + this.f48545h + ", hasError=" + this.f48546i + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f48538a);
            c.d dVar = this.f48539b;
            if (dVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                dVar.writeToParcel(out, i11);
            }
            c.a aVar = this.f48540c;
            if (aVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                aVar.writeToParcel(out, i11);
            }
            c.C1043b c1043b = this.f48541d;
            if (c1043b == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c1043b.writeToParcel(out, i11);
            }
            c.C1044c c1044c = this.f48542e;
            if (c1044c == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                c1044c.writeToParcel(out, i11);
            }
            c.e eVar = this.f48543f;
            if (eVar == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                eVar.writeToParcel(out, i11);
            }
            out.writeStringList(this.f48544g);
            out.writeInt(this.f48545h ? 1 : 0);
            out.writeInt(this.f48546i ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String countryCode, c.d dVar, c.a aVar, c.C1043b c1043b, c.C1044c c1044c, c.e eVar, List<String> ordering, boolean z11, boolean z12) {
            super(null);
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            kotlin.jvm.internal.s.g(ordering, "ordering");
            this.f48538a = countryCode;
            this.f48539b = dVar;
            this.f48540c = aVar;
            this.f48541d = c1043b;
            this.f48542e = c1044c;
            this.f48543f = eVar;
            this.f48544g = ordering;
            this.f48545h = z11;
            this.f48546i = z12;
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends j {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final b f48559a;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new c(b.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b entrySnapshot) {
            super(null);
            kotlin.jvm.internal.s.g(entrySnapshot, "entrySnapshot");
            this.f48559a = entrySnapshot;
        }

        public final b a() {
            return this.f48559a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.s.c(this.f48559a, ((c) obj).f48559a);
        }

        public int hashCode() {
            return this.f48559a.hashCode();
        }

        public String toString() {
            return "UpdatingDatabase(entrySnapshot=" + this.f48559a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            this.f48559a.writeToParcel(out, i11);
        }
    }

    private j() {
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}