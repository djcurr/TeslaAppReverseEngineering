package zv;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.withpersona.sdk.inquiry.document.DocumentDescription;
import com.withpersona.sdk.inquiry.governmentid.network.Id;
import com.withpersona.sdk.inquiry.internal.network.NextStep;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import qv.m;

/* loaded from: classes6.dex */
public abstract class i0 implements Parcelable {

    /* loaded from: classes6.dex */
    public static final class a extends i0 {
        public static final Parcelable.Creator<a> CREATOR = new C1401a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60900a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60901b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f60902c;

        /* renamed from: zv.i0$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1401a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String inquiryId, String sessionToken, boolean z11) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            this.f60900a = inquiryId;
            this.f60901b = sessionToken;
            this.f60902c = z11;
        }

        public final String a() {
            return this.f60900a;
        }

        public final String b() {
            return this.f60901b;
        }

        public final boolean c() {
            return this.f60902c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(this.f60900a, aVar.f60900a) && kotlin.jvm.internal.s.c(this.f60901b, aVar.f60901b) && this.f60902c == aVar.f60902c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f60900a.hashCode() * 31) + this.f60901b.hashCode()) * 31;
            boolean z11 = this.f60902c;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        public String toString() {
            return "AcceptStartScreen(inquiryId=" + this.f60900a + ", sessionToken=" + this.f60901b + ", useBiometricDisclaimer=" + this.f60902c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60900a);
            out.writeString(this.f60901b);
            out.writeInt(this.f60902c ? 1 : 0);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends i0 {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60903a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60904b;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new b(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String inquiryId, String sessionToken) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            this.f60903a = inquiryId;
            this.f60904b = sessionToken;
        }

        public final String a() {
            return this.f60903a;
        }

        public final String b() {
            return this.f60904b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(this.f60903a, bVar.f60903a) && kotlin.jvm.internal.s.c(this.f60904b, bVar.f60904b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f60903a.hashCode() * 31) + this.f60904b.hashCode();
        }

        public String toString() {
            return "CheckNextVerification(inquiryId=" + this.f60903a + ", sessionToken=" + this.f60904b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60903a);
            out.writeString(this.f60904b);
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends i0 {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60905a;

        /* renamed from: b  reason: collision with root package name */
        private final zv.j f60906b;

        /* renamed from: c  reason: collision with root package name */
        private final e0 f60907c;

        /* renamed from: d  reason: collision with root package name */
        private final NextStep.b f60908d;

        /* renamed from: e  reason: collision with root package name */
        private final NextStep.Completed.CustomTranslations f60909e;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new c(parcel.readString(), zv.j.CREATOR.createFromParcel(parcel), e0.CREATOR.createFromParcel(parcel), NextStep.b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : NextStep.Completed.CustomTranslations.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String inquiryId, zv.j inquiryAttributes, e0 inquiryRelationships, NextStep.b pictograph, NextStep.Completed.CustomTranslations customTranslations) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(inquiryAttributes, "inquiryAttributes");
            kotlin.jvm.internal.s.g(inquiryRelationships, "inquiryRelationships");
            kotlin.jvm.internal.s.g(pictograph, "pictograph");
            this.f60905a = inquiryId;
            this.f60906b = inquiryAttributes;
            this.f60907c = inquiryRelationships;
            this.f60908d = pictograph;
            this.f60909e = customTranslations;
        }

        public final NextStep.Completed.CustomTranslations a() {
            return this.f60909e;
        }

        public final zv.j b() {
            return this.f60906b;
        }

        public final String c() {
            return this.f60905a;
        }

        public final e0 d() {
            return this.f60907c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final NextStep.b e() {
            return this.f60908d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(this.f60905a, cVar.f60905a) && kotlin.jvm.internal.s.c(this.f60906b, cVar.f60906b) && kotlin.jvm.internal.s.c(this.f60907c, cVar.f60907c) && this.f60908d == cVar.f60908d && kotlin.jvm.internal.s.c(this.f60909e, cVar.f60909e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((((this.f60905a.hashCode() * 31) + this.f60906b.hashCode()) * 31) + this.f60907c.hashCode()) * 31) + this.f60908d.hashCode()) * 31;
            NextStep.Completed.CustomTranslations customTranslations = this.f60909e;
            return hashCode + (customTranslations == null ? 0 : customTranslations.hashCode());
        }

        public String toString() {
            return "Complete(inquiryId=" + this.f60905a + ", inquiryAttributes=" + this.f60906b + ", inquiryRelationships=" + this.f60907c + ", pictograph=" + this.f60908d + ", customTranslations=" + this.f60909e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60905a);
            this.f60906b.writeToParcel(out, i11);
            this.f60907c.writeToParcel(out, i11);
            out.writeString(this.f60908d.name());
            NextStep.Completed.CustomTranslations customTranslations = this.f60909e;
            if (customTranslations == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            customTranslations.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends i0 {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60910a;

        /* renamed from: b  reason: collision with root package name */
        private final zv.j f60911b;

        /* renamed from: c  reason: collision with root package name */
        private final e0 f60912c;

        /* renamed from: d  reason: collision with root package name */
        private final String f60913d;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new d(parcel.readString(), zv.j.CREATOR.createFromParcel(parcel), e0.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String inquiryId, zv.j inquiryAttributes, e0 inquiryRelationships, String sessionToken) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(inquiryAttributes, "inquiryAttributes");
            kotlin.jvm.internal.s.g(inquiryRelationships, "inquiryRelationships");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            this.f60910a = inquiryId;
            this.f60911b = inquiryAttributes;
            this.f60912c = inquiryRelationships;
            this.f60913d = sessionToken;
        }

        public final zv.j a() {
            return this.f60911b;
        }

        public final String b() {
            return this.f60910a;
        }

        public final e0 c() {
            return this.f60912c;
        }

        public final String d() {
            return this.f60913d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                d dVar = (d) obj;
                return kotlin.jvm.internal.s.c(this.f60910a, dVar.f60910a) && kotlin.jvm.internal.s.c(this.f60911b, dVar.f60911b) && kotlin.jvm.internal.s.c(this.f60912c, dVar.f60912c) && kotlin.jvm.internal.s.c(this.f60913d, dVar.f60913d);
            }
            return false;
        }

        public int hashCode() {
            return (((((this.f60910a.hashCode() * 31) + this.f60911b.hashCode()) * 31) + this.f60912c.hashCode()) * 31) + this.f60913d.hashCode();
        }

        public String toString() {
            return "ContactSupport(inquiryId=" + this.f60910a + ", inquiryAttributes=" + this.f60911b + ", inquiryRelationships=" + this.f60912c + ", sessionToken=" + this.f60913d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60910a);
            this.f60911b.writeToParcel(out, i11);
            this.f60912c.writeToParcel(out, i11);
            out.writeString(this.f60913d);
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends i0 {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60914a;

        /* renamed from: b  reason: collision with root package name */
        private final zv.j f60915b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60916c;

        /* renamed from: d  reason: collision with root package name */
        private final String f60917d;

        /* renamed from: e  reason: collision with root package name */
        private final String f60918e;

        /* renamed from: f  reason: collision with root package name */
        private final String f60919f;

        /* renamed from: g  reason: collision with root package name */
        private final e0 f60920g;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new e(parcel.readString(), zv.j.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), e0.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final e[] newArray(int i11) {
                return new e[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String inquiryId, zv.j inquiryAttributes, String sessionToken, String individualName, String individualEmailAddress, String individualComment, e0 inquiryRelationships) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(inquiryAttributes, "inquiryAttributes");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(individualName, "individualName");
            kotlin.jvm.internal.s.g(individualEmailAddress, "individualEmailAddress");
            kotlin.jvm.internal.s.g(individualComment, "individualComment");
            kotlin.jvm.internal.s.g(inquiryRelationships, "inquiryRelationships");
            this.f60914a = inquiryId;
            this.f60915b = inquiryAttributes;
            this.f60916c = sessionToken;
            this.f60917d = individualName;
            this.f60918e = individualEmailAddress;
            this.f60919f = individualComment;
            this.f60920g = inquiryRelationships;
        }

        public final String a() {
            return this.f60919f;
        }

        public final String b() {
            return this.f60918e;
        }

        public final String c() {
            return this.f60917d;
        }

        public final zv.j d() {
            return this.f60915b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f60914a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                e eVar = (e) obj;
                return kotlin.jvm.internal.s.c(this.f60914a, eVar.f60914a) && kotlin.jvm.internal.s.c(this.f60915b, eVar.f60915b) && kotlin.jvm.internal.s.c(this.f60916c, eVar.f60916c) && kotlin.jvm.internal.s.c(this.f60917d, eVar.f60917d) && kotlin.jvm.internal.s.c(this.f60918e, eVar.f60918e) && kotlin.jvm.internal.s.c(this.f60919f, eVar.f60919f) && kotlin.jvm.internal.s.c(this.f60920g, eVar.f60920g);
            }
            return false;
        }

        public final e0 f() {
            return this.f60920g;
        }

        public final String g() {
            return this.f60916c;
        }

        public int hashCode() {
            return (((((((((((this.f60914a.hashCode() * 31) + this.f60915b.hashCode()) * 31) + this.f60916c.hashCode()) * 31) + this.f60917d.hashCode()) * 31) + this.f60918e.hashCode()) * 31) + this.f60919f.hashCode()) * 31) + this.f60920g.hashCode();
        }

        public String toString() {
            return "ContactSupportSubmitting(inquiryId=" + this.f60914a + ", inquiryAttributes=" + this.f60915b + ", sessionToken=" + this.f60916c + ", individualName=" + this.f60917d + ", individualEmailAddress=" + this.f60918e + ", individualComment=" + this.f60919f + ", inquiryRelationships=" + this.f60920g + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60914a);
            this.f60915b.writeToParcel(out, i11);
            out.writeString(this.f60916c);
            out.writeString(this.f60917d);
            out.writeString(this.f60918e);
            out.writeString(this.f60919f);
            this.f60920g.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class f extends i0 {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60921a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60922b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60923c;

        /* renamed from: d  reason: collision with root package name */
        private final List<String> f60924d;

        /* renamed from: e  reason: collision with root package name */
        private final m.a.C1050a f60925e;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<f> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final f createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new f(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (m.a.C1050a) parcel.readParcelable(f.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final f[] newArray(int i11) {
                return new f[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String inquiryId, String sessionToken, String countryCode, List<String> inputFields, m.a.C1050a prefill) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            kotlin.jvm.internal.s.g(inputFields, "inputFields");
            kotlin.jvm.internal.s.g(prefill, "prefill");
            this.f60921a = inquiryId;
            this.f60922b = sessionToken;
            this.f60923c = countryCode;
            this.f60924d = inputFields;
            this.f60925e = prefill;
        }

        public final String a() {
            return this.f60923c;
        }

        public final List<String> b() {
            return this.f60924d;
        }

        public final String c() {
            return this.f60921a;
        }

        public final m.a.C1050a d() {
            return this.f60925e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f60922b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                f fVar = (f) obj;
                return kotlin.jvm.internal.s.c(this.f60921a, fVar.f60921a) && kotlin.jvm.internal.s.c(this.f60922b, fVar.f60922b) && kotlin.jvm.internal.s.c(this.f60923c, fVar.f60923c) && kotlin.jvm.internal.s.c(this.f60924d, fVar.f60924d) && kotlin.jvm.internal.s.c(this.f60925e, fVar.f60925e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f60921a.hashCode() * 31) + this.f60922b.hashCode()) * 31) + this.f60923c.hashCode()) * 31) + this.f60924d.hashCode()) * 31) + this.f60925e.hashCode();
        }

        public String toString() {
            return "CreateDatabaseVerification(inquiryId=" + this.f60921a + ", sessionToken=" + this.f60922b + ", countryCode=" + this.f60923c + ", inputFields=" + this.f60924d + ", prefill=" + this.f60925e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60921a);
            out.writeString(this.f60922b);
            out.writeString(this.f60923c);
            out.writeStringList(this.f60924d);
            out.writeParcelable(this.f60925e, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class g extends i0 {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60926a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60927b;

        /* renamed from: c  reason: collision with root package name */
        private final List<Id> f60928c;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<g> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final g createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(parcel.readParcelable(g.class.getClassLoader()));
                }
                return new g(readString, readString2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final g[] newArray(int i11) {
                return new g[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String inquiryId, String sessionToken, List<Id> enabledIdClasses) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(enabledIdClasses, "enabledIdClasses");
            this.f60926a = inquiryId;
            this.f60927b = sessionToken;
            this.f60928c = enabledIdClasses;
        }

        public final List<Id> a() {
            return this.f60928c;
        }

        public final String b() {
            return this.f60926a;
        }

        public final String c() {
            return this.f60927b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                g gVar = (g) obj;
                return kotlin.jvm.internal.s.c(this.f60926a, gVar.f60926a) && kotlin.jvm.internal.s.c(this.f60927b, gVar.f60927b) && kotlin.jvm.internal.s.c(this.f60928c, gVar.f60928c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f60926a.hashCode() * 31) + this.f60927b.hashCode()) * 31) + this.f60928c.hashCode();
        }

        public String toString() {
            return "CreateGovernmentIdVerification(inquiryId=" + this.f60926a + ", sessionToken=" + this.f60927b + ", enabledIdClasses=" + this.f60928c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60926a);
            out.writeString(this.f60927b);
            List<Id> list = this.f60928c;
            out.writeInt(list.size());
            for (Id id2 : list) {
                out.writeParcelable(id2, i11);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class h extends i0 {
        public static final Parcelable.Creator<h> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60929a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60930b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60931c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<String, z> f60932d;

        /* renamed from: e  reason: collision with root package name */
        private final String f60933e;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final h createFromParcel(Parcel parcel) {
                LinkedHashMap linkedHashMap;
                kotlin.jvm.internal.s.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() == 0) {
                    linkedHashMap = null;
                } else {
                    int readInt = parcel.readInt();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                    for (int i11 = 0; i11 != readInt; i11++) {
                        linkedHashMap2.put(parcel.readString(), parcel.readParcelable(h.class.getClassLoader()));
                    }
                    linkedHashMap = linkedHashMap2;
                }
                return new h(readString, readString2, readString3, linkedHashMap, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final h[] newArray(int i11) {
                return new h[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(String templateId, String str, String str2, Map<String, ? extends z> map, String str3) {
            super(null);
            kotlin.jvm.internal.s.g(templateId, "templateId");
            this.f60929a = templateId;
            this.f60930b = str;
            this.f60931c = str2;
            this.f60932d = map;
            this.f60933e = str3;
        }

        public final String a() {
            return this.f60930b;
        }

        public final Map<String, z> b() {
            return this.f60932d;
        }

        public final String c() {
            return this.f60933e;
        }

        public final String d() {
            return this.f60931c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f60929a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof h) {
                h hVar = (h) obj;
                return kotlin.jvm.internal.s.c(this.f60929a, hVar.f60929a) && kotlin.jvm.internal.s.c(this.f60930b, hVar.f60930b) && kotlin.jvm.internal.s.c(this.f60931c, hVar.f60931c) && kotlin.jvm.internal.s.c(this.f60932d, hVar.f60932d) && kotlin.jvm.internal.s.c(this.f60933e, hVar.f60933e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.f60929a.hashCode() * 31;
            String str = this.f60930b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f60931c;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Map<String, z> map = this.f60932d;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            String str3 = this.f60933e;
            return hashCode4 + (str3 != null ? str3.hashCode() : 0);
        }

        public String toString() {
            return "CreateInquiryFromTemplate(templateId=" + this.f60929a + ", accountId=" + ((Object) this.f60930b) + ", referenceId=" + ((Object) this.f60931c) + ", fields=" + this.f60932d + ", note=" + ((Object) this.f60933e) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60929a);
            out.writeString(this.f60930b);
            out.writeString(this.f60931c);
            Map<String, z> map = this.f60932d;
            if (map == null) {
                out.writeInt(0);
            } else {
                out.writeInt(1);
                out.writeInt(map.size());
                for (Map.Entry<String, z> entry : map.entrySet()) {
                    out.writeString(entry.getKey());
                    out.writeParcelable(entry.getValue(), i11);
                }
            }
            out.writeString(this.f60933e);
        }
    }

    /* loaded from: classes6.dex */
    public static final class i extends i0 {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60934a;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<i> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final i createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new i(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final i[] newArray(int i11) {
                return new i[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String inquiryId) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            this.f60934a = inquiryId;
        }

        public final String a() {
            return this.f60934a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && kotlin.jvm.internal.s.c(this.f60934a, ((i) obj).f60934a);
        }

        public int hashCode() {
            return this.f60934a.hashCode();
        }

        public String toString() {
            return "CreateInquirySession(inquiryId=" + this.f60934a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60934a);
        }
    }

    /* loaded from: classes6.dex */
    public static final class j extends i0 {
        public static final Parcelable.Creator<j> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60935a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60936b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60937c;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<j> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final j createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new j(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final j[] newArray(int i11) {
                return new j[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String inquiryId, String sessionToken, String str) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            this.f60935a = inquiryId;
            this.f60936b = sessionToken;
            this.f60937c = str;
        }

        public final String a() {
            return this.f60935a;
        }

        public final String b() {
            return this.f60937c;
        }

        public final String c() {
            return this.f60936b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof j) {
                j jVar = (j) obj;
                return kotlin.jvm.internal.s.c(this.f60935a, jVar.f60935a) && kotlin.jvm.internal.s.c(this.f60936b, jVar.f60936b) && kotlin.jvm.internal.s.c(this.f60937c, jVar.f60937c);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((this.f60935a.hashCode() * 31) + this.f60936b.hashCode()) * 31;
            String str = this.f60937c;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "CreatePhoneVerification(inquiryId=" + this.f60935a + ", sessionToken=" + this.f60936b + ", phonePrefill=" + ((Object) this.f60937c) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60935a);
            out.writeString(this.f60936b);
            out.writeString(this.f60937c);
        }
    }

    /* loaded from: classes6.dex */
    public static final class k extends i0 {
        public static final Parcelable.Creator<k> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60938a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60939b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f60940c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f60941d;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<k> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final k createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new k(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final k[] newArray(int i11) {
                return new k[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String inquiryId, String sessionToken, boolean z11, boolean z12) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            this.f60938a = inquiryId;
            this.f60939b = sessionToken;
            this.f60940c = z11;
            this.f60941d = z12;
        }

        public final boolean a() {
            return this.f60940c;
        }

        public final String b() {
            return this.f60938a;
        }

        public final String c() {
            return this.f60939b;
        }

        public final boolean d() {
            return this.f60941d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof k) {
                k kVar = (k) obj;
                return kotlin.jvm.internal.s.c(this.f60938a, kVar.f60938a) && kotlin.jvm.internal.s.c(this.f60939b, kVar.f60939b) && this.f60940c == kVar.f60940c && this.f60941d == kVar.f60941d;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f60938a.hashCode() * 31) + this.f60939b.hashCode()) * 31;
            boolean z11 = this.f60940c;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            boolean z12 = this.f60941d;
            return i12 + (z12 ? 1 : z12 ? 1 : 0);
        }

        public String toString() {
            return "CreateSelfieVerification(inquiryId=" + this.f60938a + ", sessionToken=" + this.f60939b + ", centerOnly=" + this.f60940c + ", skipStart=" + this.f60941d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60938a);
            out.writeString(this.f60939b);
            out.writeInt(this.f60940c ? 1 : 0);
            out.writeInt(this.f60941d ? 1 : 0);
        }
    }

    /* loaded from: classes6.dex */
    public static final class l extends i0 {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60942a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60943b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60944c;

        /* renamed from: d  reason: collision with root package name */
        private final String f60945d;

        /* renamed from: e  reason: collision with root package name */
        private final List<String> f60946e;

        /* renamed from: f  reason: collision with root package name */
        private final m.a.C1050a f60947f;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<l> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final l createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new l(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), (m.a.C1050a) parcel.readParcelable(l.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final l[] newArray(int i11) {
                return new l[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(String inquiryId, String sessionToken, String verificationToken, String countryCode, List<String> inputFields, m.a.C1050a prefill) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(verificationToken, "verificationToken");
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            kotlin.jvm.internal.s.g(inputFields, "inputFields");
            kotlin.jvm.internal.s.g(prefill, "prefill");
            this.f60942a = inquiryId;
            this.f60943b = sessionToken;
            this.f60944c = verificationToken;
            this.f60945d = countryCode;
            this.f60946e = inputFields;
            this.f60947f = prefill;
        }

        public final String a() {
            return this.f60945d;
        }

        public final List<String> b() {
            return this.f60946e;
        }

        public final String c() {
            return this.f60942a;
        }

        public final m.a.C1050a d() {
            return this.f60947f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f60943b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof l) {
                l lVar = (l) obj;
                return kotlin.jvm.internal.s.c(this.f60942a, lVar.f60942a) && kotlin.jvm.internal.s.c(this.f60943b, lVar.f60943b) && kotlin.jvm.internal.s.c(this.f60944c, lVar.f60944c) && kotlin.jvm.internal.s.c(this.f60945d, lVar.f60945d) && kotlin.jvm.internal.s.c(this.f60946e, lVar.f60946e) && kotlin.jvm.internal.s.c(this.f60947f, lVar.f60947f);
            }
            return false;
        }

        public final String f() {
            return this.f60944c;
        }

        public int hashCode() {
            return (((((((((this.f60942a.hashCode() * 31) + this.f60943b.hashCode()) * 31) + this.f60944c.hashCode()) * 31) + this.f60945d.hashCode()) * 31) + this.f60946e.hashCode()) * 31) + this.f60947f.hashCode();
        }

        public String toString() {
            return "DatabaseVerificationRunning(inquiryId=" + this.f60942a + ", sessionToken=" + this.f60943b + ", verificationToken=" + this.f60944c + ", countryCode=" + this.f60945d + ", inputFields=" + this.f60946e + ", prefill=" + this.f60947f + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60942a);
            out.writeString(this.f60943b);
            out.writeString(this.f60944c);
            out.writeString(this.f60945d);
            out.writeStringList(this.f60946e);
            out.writeParcelable(this.f60947f, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class m extends i0 {
        public static final Parcelable.Creator<m> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60948a;

        /* renamed from: b  reason: collision with root package name */
        private final zv.j f60949b;

        /* renamed from: c  reason: collision with root package name */
        private final e0 f60950c;

        /* renamed from: d  reason: collision with root package name */
        private final NextStep.b f60951d;

        /* renamed from: e  reason: collision with root package name */
        private final NextStep.Failed.CustomTranslations f60952e;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<m> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final m createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new m(parcel.readString(), zv.j.CREATOR.createFromParcel(parcel), e0.CREATOR.createFromParcel(parcel), NextStep.b.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : NextStep.Failed.CustomTranslations.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final m[] newArray(int i11) {
                return new m[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(String inquiryId, zv.j inquiryAttributes, e0 inquiryRelationships, NextStep.b pictograph, NextStep.Failed.CustomTranslations customTranslations) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(inquiryAttributes, "inquiryAttributes");
            kotlin.jvm.internal.s.g(inquiryRelationships, "inquiryRelationships");
            kotlin.jvm.internal.s.g(pictograph, "pictograph");
            this.f60948a = inquiryId;
            this.f60949b = inquiryAttributes;
            this.f60950c = inquiryRelationships;
            this.f60951d = pictograph;
            this.f60952e = customTranslations;
        }

        public final NextStep.Failed.CustomTranslations a() {
            return this.f60952e;
        }

        public final zv.j b() {
            return this.f60949b;
        }

        public final String c() {
            return this.f60948a;
        }

        public final e0 d() {
            return this.f60950c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final NextStep.b e() {
            return this.f60951d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof m) {
                m mVar = (m) obj;
                return kotlin.jvm.internal.s.c(this.f60948a, mVar.f60948a) && kotlin.jvm.internal.s.c(this.f60949b, mVar.f60949b) && kotlin.jvm.internal.s.c(this.f60950c, mVar.f60950c) && this.f60951d == mVar.f60951d && kotlin.jvm.internal.s.c(this.f60952e, mVar.f60952e);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((((this.f60948a.hashCode() * 31) + this.f60949b.hashCode()) * 31) + this.f60950c.hashCode()) * 31) + this.f60951d.hashCode()) * 31;
            NextStep.Failed.CustomTranslations customTranslations = this.f60952e;
            return hashCode + (customTranslations == null ? 0 : customTranslations.hashCode());
        }

        public String toString() {
            return "Fail(inquiryId=" + this.f60948a + ", inquiryAttributes=" + this.f60949b + ", inquiryRelationships=" + this.f60950c + ", pictograph=" + this.f60951d + ", customTranslations=" + this.f60952e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60948a);
            this.f60949b.writeToParcel(out, i11);
            this.f60950c.writeToParcel(out, i11);
            out.writeString(this.f60951d.name());
            NextStep.Failed.CustomTranslations customTranslations = this.f60952e;
            if (customTranslations == null) {
                out.writeInt(0);
                return;
            }
            out.writeInt(1);
            customTranslations.writeToParcel(out, i11);
        }
    }

    /* loaded from: classes6.dex */
    public static final class n extends i0 {
        public static final Parcelable.Creator<n> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60953a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60954b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60955c;

        /* renamed from: d  reason: collision with root package name */
        private final String f60956d;

        /* renamed from: e  reason: collision with root package name */
        private final List<Id> f60957e;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<n> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final n createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                String readString4 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(parcel.readParcelable(n.class.getClassLoader()));
                }
                return new n(readString, readString2, readString3, readString4, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final n[] newArray(int i11) {
                return new n[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String inquiryId, String sessionToken, String verificationToken, String countryCode, List<Id> enabledIdClasses) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(verificationToken, "verificationToken");
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            kotlin.jvm.internal.s.g(enabledIdClasses, "enabledIdClasses");
            this.f60953a = inquiryId;
            this.f60954b = sessionToken;
            this.f60955c = verificationToken;
            this.f60956d = countryCode;
            this.f60957e = enabledIdClasses;
        }

        public final String a() {
            return this.f60956d;
        }

        public final List<Id> b() {
            return this.f60957e;
        }

        public final String c() {
            return this.f60953a;
        }

        public final String d() {
            return this.f60954b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f60955c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof n) {
                n nVar = (n) obj;
                return kotlin.jvm.internal.s.c(this.f60953a, nVar.f60953a) && kotlin.jvm.internal.s.c(this.f60954b, nVar.f60954b) && kotlin.jvm.internal.s.c(this.f60955c, nVar.f60955c) && kotlin.jvm.internal.s.c(this.f60956d, nVar.f60956d) && kotlin.jvm.internal.s.c(this.f60957e, nVar.f60957e);
            }
            return false;
        }

        public int hashCode() {
            return (((((((this.f60953a.hashCode() * 31) + this.f60954b.hashCode()) * 31) + this.f60955c.hashCode()) * 31) + this.f60956d.hashCode()) * 31) + this.f60957e.hashCode();
        }

        public String toString() {
            return "GovernmentIdVerificationsRunning(inquiryId=" + this.f60953a + ", sessionToken=" + this.f60954b + ", verificationToken=" + this.f60955c + ", countryCode=" + this.f60956d + ", enabledIdClasses=" + this.f60957e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60953a);
            out.writeString(this.f60954b);
            out.writeString(this.f60955c);
            out.writeString(this.f60956d);
            List<Id> list = this.f60957e;
            out.writeInt(list.size());
            for (Id id2 : list) {
                out.writeParcelable(id2, i11);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class o extends i0 {
        public static final Parcelable.Creator<o> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60958a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60959b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60960c;

        /* renamed from: d  reason: collision with root package name */
        private final String f60961d;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<o> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final o createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new o(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final o[] newArray(int i11) {
                return new o[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String inquiryId, String sessionToken, String verificationToken, String str) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(verificationToken, "verificationToken");
            this.f60958a = inquiryId;
            this.f60959b = sessionToken;
            this.f60960c = verificationToken;
            this.f60961d = str;
        }

        public final String a() {
            return this.f60958a;
        }

        public final String b() {
            return this.f60961d;
        }

        public final String c() {
            return this.f60959b;
        }

        public final String d() {
            return this.f60960c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof o) {
                o oVar = (o) obj;
                return kotlin.jvm.internal.s.c(this.f60958a, oVar.f60958a) && kotlin.jvm.internal.s.c(this.f60959b, oVar.f60959b) && kotlin.jvm.internal.s.c(this.f60960c, oVar.f60960c) && kotlin.jvm.internal.s.c(this.f60961d, oVar.f60961d);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = ((((this.f60958a.hashCode() * 31) + this.f60959b.hashCode()) * 31) + this.f60960c.hashCode()) * 31;
            String str = this.f60961d;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "PhoneVerificationsRunning(inquiryId=" + this.f60958a + ", sessionToken=" + this.f60959b + ", verificationToken=" + this.f60960c + ", phonePrefill=" + ((Object) this.f60961d) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60958a);
            out.writeString(this.f60959b);
            out.writeString(this.f60960c);
            out.writeString(this.f60961d);
        }
    }

    /* loaded from: classes6.dex */
    public static final class p extends i0 {
        public static final Parcelable.Creator<p> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60962a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60963b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60964c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f60965d;

        /* renamed from: e  reason: collision with root package name */
        private final boolean f60966e;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<p> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final p createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new p(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final p[] newArray(int i11) {
                return new p[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String inquiryId, String sessionToken, String verificationToken, boolean z11, boolean z12) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(verificationToken, "verificationToken");
            this.f60962a = inquiryId;
            this.f60963b = sessionToken;
            this.f60964c = verificationToken;
            this.f60965d = z11;
            this.f60966e = z12;
        }

        public final boolean a() {
            return this.f60965d;
        }

        public final String b() {
            return this.f60962a;
        }

        public final String c() {
            return this.f60963b;
        }

        public final boolean d() {
            return this.f60966e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f60964c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                p pVar = (p) obj;
                return kotlin.jvm.internal.s.c(this.f60962a, pVar.f60962a) && kotlin.jvm.internal.s.c(this.f60963b, pVar.f60963b) && kotlin.jvm.internal.s.c(this.f60964c, pVar.f60964c) && this.f60965d == pVar.f60965d && this.f60966e == pVar.f60966e;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((((this.f60962a.hashCode() * 31) + this.f60963b.hashCode()) * 31) + this.f60964c.hashCode()) * 31;
            boolean z11 = this.f60965d;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            int i12 = (hashCode + i11) * 31;
            boolean z12 = this.f60966e;
            return i12 + (z12 ? 1 : z12 ? 1 : 0);
        }

        public String toString() {
            return "SelfieVerificationsRunning(inquiryId=" + this.f60962a + ", sessionToken=" + this.f60963b + ", verificationToken=" + this.f60964c + ", centerOnly=" + this.f60965d + ", skipStart=" + this.f60966e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60962a);
            out.writeString(this.f60963b);
            out.writeString(this.f60964c);
            out.writeInt(this.f60965d ? 1 : 0);
            out.writeInt(this.f60966e ? 1 : 0);
        }
    }

    /* loaded from: classes6.dex */
    public static final class q extends i0 {
        public static final Parcelable.Creator<q> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60967a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60968b;

        /* renamed from: c  reason: collision with root package name */
        private final List<DocumentDescription> f60969c;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<q> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final q createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i11 = 0; i11 != readInt; i11++) {
                    arrayList.add(parcel.readParcelable(q.class.getClassLoader()));
                }
                return new q(readString, readString2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final q[] newArray(int i11) {
                return new q[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(String inquiryId, String sessionToken, List<DocumentDescription> documentDescriptions) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(documentDescriptions, "documentDescriptions");
            this.f60967a = inquiryId;
            this.f60968b = sessionToken;
            this.f60969c = documentDescriptions;
        }

        public final List<DocumentDescription> a() {
            return this.f60969c;
        }

        public final String b() {
            return this.f60967a;
        }

        public final String c() {
            return this.f60968b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof q) {
                q qVar = (q) obj;
                return kotlin.jvm.internal.s.c(this.f60967a, qVar.f60967a) && kotlin.jvm.internal.s.c(this.f60968b, qVar.f60968b) && kotlin.jvm.internal.s.c(this.f60969c, qVar.f60969c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f60967a.hashCode() * 31) + this.f60968b.hashCode()) * 31) + this.f60969c.hashCode();
        }

        public String toString() {
            return "ShowDocumentsUpload(inquiryId=" + this.f60967a + ", sessionToken=" + this.f60968b + ", documentDescriptions=" + this.f60969c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60967a);
            out.writeString(this.f60968b);
            List<DocumentDescription> list = this.f60969c;
            out.writeInt(list.size());
            for (DocumentDescription documentDescription : list) {
                out.writeParcelable(documentDescription, i11);
            }
        }
    }

    /* loaded from: classes6.dex */
    public static final class r extends i0 {
        public static final Parcelable.Creator<r> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60970a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60971b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60972c;

        /* renamed from: d  reason: collision with root package name */
        private final List<String> f60973d;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<r> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final r createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new r(parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final r[] newArray(int i11) {
                return new r[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(String inquiryId, String sessionToken, String selectedCountryCode, List<String> enabledCountryCodes) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(selectedCountryCode, "selectedCountryCode");
            kotlin.jvm.internal.s.g(enabledCountryCodes, "enabledCountryCodes");
            this.f60970a = inquiryId;
            this.f60971b = sessionToken;
            this.f60972c = selectedCountryCode;
            this.f60973d = enabledCountryCodes;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ r b(r rVar, String str, String str2, String str3, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = rVar.f60970a;
            }
            if ((i11 & 2) != 0) {
                str2 = rVar.f60971b;
            }
            if ((i11 & 4) != 0) {
                str3 = rVar.f60972c;
            }
            if ((i11 & 8) != 0) {
                list = rVar.f60973d;
            }
            return rVar.a(str, str2, str3, list);
        }

        public final r a(String inquiryId, String sessionToken, String selectedCountryCode, List<String> enabledCountryCodes) {
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(selectedCountryCode, "selectedCountryCode");
            kotlin.jvm.internal.s.g(enabledCountryCodes, "enabledCountryCodes");
            return new r(inquiryId, sessionToken, selectedCountryCode, enabledCountryCodes);
        }

        public final List<String> c() {
            return this.f60973d;
        }

        public final String d() {
            return this.f60970a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f60972c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                return kotlin.jvm.internal.s.c(this.f60970a, rVar.f60970a) && kotlin.jvm.internal.s.c(this.f60971b, rVar.f60971b) && kotlin.jvm.internal.s.c(this.f60972c, rVar.f60972c) && kotlin.jvm.internal.s.c(this.f60973d, rVar.f60973d);
            }
            return false;
        }

        public final String f() {
            return this.f60971b;
        }

        public int hashCode() {
            return (((((this.f60970a.hashCode() * 31) + this.f60971b.hashCode()) * 31) + this.f60972c.hashCode()) * 31) + this.f60973d.hashCode();
        }

        public String toString() {
            return "ShowSelectCountry(inquiryId=" + this.f60970a + ", sessionToken=" + this.f60971b + ", selectedCountryCode=" + this.f60972c + ", enabledCountryCodes=" + this.f60973d + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60970a);
            out.writeString(this.f60971b);
            out.writeString(this.f60972c);
            out.writeStringList(this.f60973d);
        }
    }

    /* loaded from: classes6.dex */
    public static final class s extends i0 {
        public static final Parcelable.Creator<s> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60974a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60975b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f60976c;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<s> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final s createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new s(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final s[] newArray(int i11) {
                return new s[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(String inquiryId, String sessionToken, boolean z11) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            this.f60974a = inquiryId;
            this.f60975b = sessionToken;
            this.f60976c = z11;
        }

        public final String a() {
            return this.f60974a;
        }

        public final String b() {
            return this.f60975b;
        }

        public final boolean c() {
            return this.f60976c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                return kotlin.jvm.internal.s.c(this.f60974a, sVar.f60974a) && kotlin.jvm.internal.s.c(this.f60975b, sVar.f60975b) && this.f60976c == sVar.f60976c;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = ((this.f60974a.hashCode() * 31) + this.f60975b.hashCode()) * 31;
            boolean z11 = this.f60976c;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        public String toString() {
            return "ShowStartScreen(inquiryId=" + this.f60974a + ", sessionToken=" + this.f60975b + ", useBiometricDisclaimer=" + this.f60976c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60974a);
            out.writeString(this.f60975b);
            out.writeInt(this.f60976c ? 1 : 0);
        }
    }

    /* loaded from: classes6.dex */
    public static final class t extends i0 {
        public static final Parcelable.Creator<t> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60977a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60978b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60979c;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<t> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final t createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new t(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final t[] newArray(int i11) {
                return new t[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(String inquiryId, String sessionToken, String countryCode) {
            super(null);
            kotlin.jvm.internal.s.g(inquiryId, "inquiryId");
            kotlin.jvm.internal.s.g(sessionToken, "sessionToken");
            kotlin.jvm.internal.s.g(countryCode, "countryCode");
            this.f60977a = inquiryId;
            this.f60978b = sessionToken;
            this.f60979c = countryCode;
        }

        public final String a() {
            return this.f60979c;
        }

        public final String b() {
            return this.f60977a;
        }

        public final String c() {
            return this.f60978b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof t) {
                t tVar = (t) obj;
                return kotlin.jvm.internal.s.c(this.f60977a, tVar.f60977a) && kotlin.jvm.internal.s.c(this.f60978b, tVar.f60978b) && kotlin.jvm.internal.s.c(this.f60979c, tVar.f60979c);
            }
            return false;
        }

        public int hashCode() {
            return (((this.f60977a.hashCode() * 31) + this.f60978b.hashCode()) * 31) + this.f60979c.hashCode();
        }

        public String toString() {
            return "UpdateCountry(inquiryId=" + this.f60977a + ", sessionToken=" + this.f60978b + ", countryCode=" + this.f60979c + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60977a);
            out.writeString(this.f60978b);
            out.writeString(this.f60979c);
        }
    }

    private i0() {
    }

    public /* synthetic */ i0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}