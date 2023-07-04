package v6;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class a implements Parcelable {

    /* loaded from: classes.dex */
    public static final class b extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f54087a = new b();
        public static final Parcelable.Creator<b> CREATOR = new C1216a();

        /* renamed from: v6.a$b$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1216a implements Parcelable.Creator<b> {
            C1216a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return b.f54087a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i11) {
                return new b[i11];
            }
        }

        private b() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f54088a = new c();
        public static final Parcelable.Creator<c> CREATOR = new C1217a();

        /* renamed from: v6.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1217a implements Parcelable.Creator<c> {
            C1217a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                return c.f54088a;
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public c[] newArray(int i11) {
                return new c[i11];
            }
        }

        private c() {
            super(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
        }
    }

    private a() {
    }

    public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: v6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1214a extends a {
        public static final Parcelable.Creator<C1214a> CREATOR;

        /* renamed from: a  reason: collision with root package name */
        private final String f54085a;

        /* renamed from: b  reason: collision with root package name */
        private final List<String> f54086b;

        /* renamed from: v6.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1215a implements Parcelable.Creator<C1214a> {
            C1215a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1214a createFromParcel(Parcel source) {
                kotlin.jvm.internal.s.g(source, "source");
                String readString = source.readString();
                ArrayList readArrayList = source.readArrayList(String.class.getClassLoader());
                Objects.requireNonNull(readArrayList, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                return new C1214a(readString, readArrayList);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1214a[] newArray(int i11) {
                return new C1214a[i11];
            }
        }

        /* renamed from: v6.a$a$b */
        /* loaded from: classes.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new b(null);
            CREATOR = new C1215a();
        }

        public C1214a() {
            this(null, null, 3, null);
        }

        public /* synthetic */ C1214a(String str, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? wz.w.i() : list);
        }

        public final String a() {
            return this.f54085a;
        }

        public final List<String> b() {
            return this.f54086b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1214a) {
                C1214a c1214a = (C1214a) obj;
                return kotlin.jvm.internal.s.c(this.f54085a, c1214a.f54085a) && kotlin.jvm.internal.s.c(this.f54086b, c1214a.f54086b);
            }
            return false;
        }

        public int hashCode() {
            String str = this.f54085a;
            return ((str == null ? 0 : str.hashCode()) * 31) + this.f54086b.hashCode();
        }

        public String toString() {
            return "FullAddress(defaultCountryCode=" + ((Object) this.f54085a) + ", supportedCountryCodes=" + this.f54086b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i11) {
            kotlin.jvm.internal.s.g(dest, "dest");
            dest.writeString(this.f54085a);
            dest.writeList(this.f54086b);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1214a(String str, List<String> supportedCountryCodes) {
            super(null);
            kotlin.jvm.internal.s.g(supportedCountryCodes, "supportedCountryCodes");
            this.f54085a = str;
            this.f54086b = supportedCountryCodes;
        }
    }
}