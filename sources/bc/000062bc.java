package com.withpersona.sdk.inquiry.governmentid;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private final String f22400a;

    /* renamed from: b  reason: collision with root package name */
    private final c f22401b;

    /* renamed from: c  reason: collision with root package name */
    private final com.withpersona.sdk.inquiry.governmentid.network.b f22402c;

    /* renamed from: d  reason: collision with root package name */
    private final EnumC0413a f22403d;

    /* renamed from: e  reason: collision with root package name */
    private final RawExtraction f22404e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: com.withpersona.sdk.inquiry.governmentid.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class EnumC0413a {
        public static final EnumC0413a AUTO = new C0414a("AUTO", 0);
        public static final EnumC0413a MANUAL = new b("MANUAL", 1);
        private static final /* synthetic */ EnumC0413a[] $VALUES = $values();

        /* renamed from: com.withpersona.sdk.inquiry.governmentid.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        static final class C0414a extends EnumC0413a {
            C0414a(String str, int i11) {
                super(str, i11, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "auto";
            }
        }

        /* renamed from: com.withpersona.sdk.inquiry.governmentid.a$a$b */
        /* loaded from: classes6.dex */
        static final class b extends EnumC0413a {
            b(String str, int i11) {
                super(str, i11, null);
            }

            @Override // java.lang.Enum
            public String toString() {
                return "manual";
            }
        }

        private static final /* synthetic */ EnumC0413a[] $values() {
            return new EnumC0413a[]{AUTO, MANUAL};
        }

        private EnumC0413a(String str, int i11) {
        }

        public /* synthetic */ EnumC0413a(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i11);
        }

        public static EnumC0413a valueOf(String str) {
            return (EnumC0413a) Enum.valueOf(EnumC0413a.class, str);
        }

        public static EnumC0413a[] values() {
            return (EnumC0413a[]) $VALUES.clone();
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements Parcelable.Creator<a> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final a createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new a(parcel.readString(), c.valueOf(parcel.readString()), com.withpersona.sdk.inquiry.governmentid.network.b.valueOf(parcel.readString()), EnumC0413a.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : RawExtraction.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* loaded from: classes6.dex */
    public enum c {
        FRONT,
        BACK
    }

    public a(String absoluteFilePath, c side, com.withpersona.sdk.inquiry.governmentid.network.b idClass, EnumC0413a captureMethod, RawExtraction rawExtraction) {
        s.g(absoluteFilePath, "absoluteFilePath");
        s.g(side, "side");
        s.g(idClass, "idClass");
        s.g(captureMethod, "captureMethod");
        this.f22400a = absoluteFilePath;
        this.f22401b = side;
        this.f22402c = idClass;
        this.f22403d = captureMethod;
        this.f22404e = rawExtraction;
    }

    public final String a() {
        return this.f22400a;
    }

    public final EnumC0413a b() {
        return this.f22403d;
    }

    public final com.withpersona.sdk.inquiry.governmentid.network.b c() {
        return this.f22402c;
    }

    public final RawExtraction d() {
        return this.f22404e;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final c e() {
        return this.f22401b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return s.c(this.f22400a, aVar.f22400a) && this.f22401b == aVar.f22401b && this.f22402c == aVar.f22402c && this.f22403d == aVar.f22403d && s.c(this.f22404e, aVar.f22404e);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((this.f22400a.hashCode() * 31) + this.f22401b.hashCode()) * 31) + this.f22402c.hashCode()) * 31) + this.f22403d.hashCode()) * 31;
        RawExtraction rawExtraction = this.f22404e;
        return hashCode + (rawExtraction == null ? 0 : rawExtraction.hashCode());
    }

    public String toString() {
        return "GovernmentId(absoluteFilePath=" + this.f22400a + ", side=" + this.f22401b + ", idClass=" + this.f22402c + ", captureMethod=" + this.f22403d + ", rawExtraction=" + this.f22404e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f22400a);
        out.writeString(this.f22401b.name());
        out.writeString(this.f22402c.name());
        out.writeString(this.f22403d.name());
        RawExtraction rawExtraction = this.f22404e;
        if (rawExtraction == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        rawExtraction.writeToParcel(out, i11);
    }

    public /* synthetic */ a(String str, c cVar, com.withpersona.sdk.inquiry.governmentid.network.b bVar, EnumC0413a enumC0413a, RawExtraction rawExtraction, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, bVar, enumC0413a, (i11 & 16) != 0 ? null : rawExtraction);
    }
}