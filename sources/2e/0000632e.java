package com.withpersona.sdk.inquiry.internal;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class c implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final String f22577a;

    /* renamed from: b  reason: collision with root package name */
    private final f f22578b;

    /* loaded from: classes6.dex */
    public static final class a extends c {
        public static final Parcelable.Creator<a> CREATOR = new C0433a();

        /* renamed from: c  reason: collision with root package name */
        private final String f22579c;

        /* renamed from: d  reason: collision with root package name */
        private final f f22580d;

        /* renamed from: com.withpersona.sdk.inquiry.internal.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C0433a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new a(parcel.readString(), f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String id2, f status) {
            super(id2, status, null);
            s.g(id2, "id");
            s.g(status, "status");
            this.f22579c = id2;
            this.f22580d = status;
        }

        @Override // com.withpersona.sdk.inquiry.internal.c
        public f a() {
            return this.f22580d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk.inquiry.internal.c
        public String getId() {
            return this.f22579c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.f22579c);
            out.writeString(this.f22580d.name());
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends c {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        private final String f22581c;

        /* renamed from: d  reason: collision with root package name */
        private final f f22582d;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new b(parcel.readString(), f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String id2, f status) {
            super(id2, status, null);
            s.g(id2, "id");
            s.g(status, "status");
            this.f22581c = id2;
            this.f22582d = status;
        }

        @Override // com.withpersona.sdk.inquiry.internal.c
        public f a() {
            return this.f22582d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk.inquiry.internal.c
        public String getId() {
            return this.f22581c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.f22581c);
            out.writeString(this.f22582d.name());
        }
    }

    /* renamed from: com.withpersona.sdk.inquiry.internal.c$c  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C0434c extends c {
        public static final Parcelable.Creator<C0434c> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        private final String f22583c;

        /* renamed from: d  reason: collision with root package name */
        private final f f22584d;

        /* renamed from: com.withpersona.sdk.inquiry.internal.c$c$a */
        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<C0434c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final C0434c createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new C0434c(parcel.readString(), f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final C0434c[] newArray(int i11) {
                return new C0434c[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0434c(String id2, f status) {
            super(id2, status, null);
            s.g(id2, "id");
            s.g(status, "status");
            this.f22583c = id2;
            this.f22584d = status;
        }

        @Override // com.withpersona.sdk.inquiry.internal.c
        public f a() {
            return this.f22584d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk.inquiry.internal.c
        public String getId() {
            return this.f22583c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.f22583c);
            out.writeString(this.f22584d.name());
        }
    }

    /* loaded from: classes6.dex */
    public static final class d extends c {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        private final String f22585c;

        /* renamed from: d  reason: collision with root package name */
        private final f f22586d;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<d> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final d createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new d(parcel.readString(), f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final d[] newArray(int i11) {
                return new d[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String id2, f status) {
            super(id2, status, null);
            s.g(id2, "id");
            s.g(status, "status");
            this.f22585c = id2;
            this.f22586d = status;
        }

        @Override // com.withpersona.sdk.inquiry.internal.c
        public f a() {
            return this.f22586d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk.inquiry.internal.c
        public String getId() {
            return this.f22585c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.f22585c);
            out.writeString(this.f22586d.name());
        }
    }

    /* loaded from: classes6.dex */
    public static final class e extends c {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: c  reason: collision with root package name */
        private final String f22587c;

        /* renamed from: d  reason: collision with root package name */
        private final f f22588d;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<e> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new e(parcel.readString(), f.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final e[] newArray(int i11) {
                return new e[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String id2, f status) {
            super(id2, status, null);
            s.g(id2, "id");
            s.g(status, "status");
            this.f22587c = id2;
            this.f22588d = status;
        }

        @Override // com.withpersona.sdk.inquiry.internal.c
        public f a() {
            return this.f22588d;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.withpersona.sdk.inquiry.internal.c
        public String getId() {
            return this.f22587c;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            out.writeString(this.f22587c);
            out.writeString(this.f22588d.name());
        }
    }

    /* loaded from: classes6.dex */
    public enum f {
        INITIATED,
        PASSED,
        REQUIRES_RETRY,
        FAILED,
        CANCELED
    }

    private c(String str, f fVar) {
        this.f22577a = str;
        this.f22578b = fVar;
    }

    public /* synthetic */ c(String str, f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, fVar);
    }

    public f a() {
        return this.f22578b;
    }

    public String getId() {
        return this.f22577a;
    }
}