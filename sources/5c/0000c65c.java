package zv;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class z implements Parcelable {

    /* loaded from: classes6.dex */
    public static final class a extends z {
        public static final Parcelable.Creator<a> CREATOR = new C1411a();

        /* renamed from: a  reason: collision with root package name */
        private final boolean f61247a;

        /* renamed from: zv.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public static final class C1411a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new a(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final a[] newArray(int i11) {
                return new a[i11];
            }
        }

        public a(boolean z11) {
            super(null);
            this.f61247a = z11;
        }

        public final boolean a() {
            return this.f61247a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeInt(this.f61247a ? 1 : 0);
        }
    }

    /* loaded from: classes6.dex */
    public static final class b extends z {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final int f61248a;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<b> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final b createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new b(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(int i11) {
            super(null);
            this.f61248a = i11;
        }

        public final int a() {
            return this.f61248a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeInt(this.f61248a);
        }
    }

    /* loaded from: classes6.dex */
    public static final class c extends z {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        private final String f61249a;

        /* loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<c> {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public final c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.s.g(parcel, "parcel");
                return new c(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public final c[] newArray(int i11) {
                return new c[i11];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String value) {
            super(null);
            kotlin.jvm.internal.s.g(value, "value");
            this.f61249a = value;
        }

        public final String a() {
            return this.f61249a;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            kotlin.jvm.internal.s.g(out, "out");
            out.writeString(this.f61249a);
        }
    }

    private z() {
    }

    public /* synthetic */ z(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}