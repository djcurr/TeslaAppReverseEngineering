package zv;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;

/* loaded from: classes6.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new b();

    /* renamed from: a  reason: collision with root package name */
    private final c f60980a;

    /* renamed from: b  reason: collision with root package name */
    private final Date f60981b;

    /* renamed from: c  reason: collision with root package name */
    private final a f60982c;

    /* loaded from: classes6.dex */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C1402a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60983a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60984b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60985c;

        /* renamed from: d  reason: collision with root package name */
        private final String f60986d;

        /* renamed from: e  reason: collision with root package name */
        private final String f60987e;

        /* renamed from: f  reason: collision with root package name */
        private final String f60988f;

        /* renamed from: g  reason: collision with root package name */
        private final String f60989g;

        /* renamed from: zv.j$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1402a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new a(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f60983a = str;
            this.f60984b = str2;
            this.f60985c = str3;
            this.f60986d = str4;
            this.f60987e = str5;
            this.f60988f = str6;
            this.f60989g = str7;
        }

        public final String a() {
            return this.f60985c;
        }

        public final String b() {
            return this.f60989g;
        }

        public final String c() {
            return this.f60988f;
        }

        public final String d() {
            return this.f60983a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final String e() {
            return this.f60984b;
        }

        public final String f() {
            return this.f60986d;
        }

        public final String g() {
            return this.f60987e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60983a);
            out.writeString(this.f60984b);
            out.writeString(this.f60985c);
            out.writeString(this.f60986d);
            out.writeString(this.f60987e);
            out.writeString(this.f60988f);
            out.writeString(this.f60989g);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b implements Parcelable.Creator<j> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public final j createFromParcel(Parcel parcel) {
            kotlin.jvm.internal.s.g(parcel, "parcel");
            return new j(parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel), (Date) parcel.readSerializable(), parcel.readInt() != 0 ? a.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public final j[] newArray(int i11) {
            return new j[i11];
        }
    }

    /* loaded from: classes6.dex */
    public static final class c implements Parcelable {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f60990a;

        /* renamed from: b  reason: collision with root package name */
        private final String f60991b;

        /* renamed from: c  reason: collision with root package name */
        private final String f60992c;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new c(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        public c(String str, String str2, String str3) {
            this.f60990a = str;
            this.f60991b = str2;
            this.f60992c = str3;
        }

        public final String a() {
            return this.f60990a;
        }

        public final String b() {
            return this.f60992c;
        }

        public final String c() {
            return this.f60991b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f60990a);
            out.writeString(this.f60991b);
            out.writeString(this.f60992c);
        }
    }

    public j(c cVar, Date date, a aVar) {
        this.f60980a = cVar;
        this.f60981b = date;
        this.f60982c = aVar;
    }

    public final a a() {
        return this.f60982c;
    }

    public final Date b() {
        return this.f60981b;
    }

    public final c c() {
        return this.f60980a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        kotlin.jvm.internal.s.g(out, "out");
        c cVar = this.f60980a;
        if (cVar == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            cVar.writeToParcel(out, i11);
        }
        out.writeSerializable(this.f60981b);
        a aVar = this.f60982c;
        if (aVar == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        aVar.writeToParcel(out, i11);
    }
}