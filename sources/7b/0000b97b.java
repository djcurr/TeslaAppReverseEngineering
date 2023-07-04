package v6;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public abstract class t implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final List<Integer> f54213a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f54214b;

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
    }

    private t(List<Integer> list, boolean z11) {
        this.f54213a = list;
        this.f54214b = z11;
    }

    public /* synthetic */ t(List list, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, z11);
    }

    public boolean a() {
        return this.f54214b;
    }

    public List<Integer> b() {
        return this.f54213a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i11) {
        kotlin.jvm.internal.s.g(dest, "dest");
        dest.writeList(b());
        q7.c.b(dest, a());
    }

    /* loaded from: classes.dex */
    public static final class c extends t {
        public static final Parcelable.Creator<c> CREATOR;

        /* renamed from: c  reason: collision with root package name */
        private final List<Integer> f54218c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f54219d;

        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel source) {
                kotlin.jvm.internal.s.g(source, "source");
                return new c(source, (DefaultConstructorMarker) null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public c[] newArray(int i11) {
                return new c[i11];
            }
        }

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
            CREATOR = new a();
        }

        public /* synthetic */ c(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<Integer> values, boolean z11) {
            super(values, z11, null);
            kotlin.jvm.internal.s.g(values, "values");
            this.f54218c = values;
            this.f54219d = z11;
        }

        @Override // v6.t
        public boolean a() {
            return this.f54219d;
        }

        @Override // v6.t
        public List<Integer> b() {
            return this.f54218c;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof c) {
                c cVar = (c) obj;
                return kotlin.jvm.internal.s.c(b(), cVar.b()) && a() == cVar.a();
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        public int hashCode() {
            int hashCode = b().hashCode() * 31;
            boolean a11 = a();
            ?? r12 = a11;
            if (a11) {
                r12 = 1;
            }
            return hashCode + r12;
        }

        public String toString() {
            return "DefaultInstallmentOptions(values=" + b() + ", includeRevolving=" + a() + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // v6.t, android.os.Parcelable
        public void writeToParcel(Parcel dest, int i11) {
            kotlin.jvm.internal.s.g(dest, "dest");
            super.writeToParcel(dest, i11);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private c(android.os.Parcel r3) {
            /*
                r2 = this;
                java.lang.Class r0 = java.lang.Integer.TYPE
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.util.ArrayList r0 = r3.readArrayList(r0)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>"
                java.util.Objects.requireNonNull(r0, r1)
                boolean r3 = q7.c.a(r3)
                r2.<init>(r0, r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v6.t.c.<init>(android.os.Parcel):void");
        }
    }

    /* loaded from: classes.dex */
    public static final class a extends t {
        public static final Parcelable.Creator<a> CREATOR;

        /* renamed from: c  reason: collision with root package name */
        private final List<Integer> f54215c;

        /* renamed from: d  reason: collision with root package name */
        private final boolean f54216d;

        /* renamed from: e  reason: collision with root package name */
        private final x6.a f54217e;

        /* renamed from: v6.t$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1221a implements Parcelable.Creator<a> {
            C1221a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public a createFromParcel(Parcel source) {
                kotlin.jvm.internal.s.g(source, "source");
                return new a(source, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public a[] newArray(int i11) {
                return new a[i11];
            }
        }

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
            CREATOR = new C1221a();
        }

        public /* synthetic */ a(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
            this(parcel);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Integer> values, boolean z11, x6.a cardType) {
            super(values, z11, null);
            kotlin.jvm.internal.s.g(values, "values");
            kotlin.jvm.internal.s.g(cardType, "cardType");
            this.f54215c = values;
            this.f54216d = z11;
            this.f54217e = cardType;
        }

        @Override // v6.t
        public boolean a() {
            return this.f54216d;
        }

        @Override // v6.t
        public List<Integer> b() {
            return this.f54215c;
        }

        public final x6.a c() {
            return this.f54217e;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(b(), aVar.b()) && a() == aVar.a() && this.f54217e == aVar.f54217e;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        public int hashCode() {
            int hashCode = b().hashCode() * 31;
            boolean a11 = a();
            ?? r12 = a11;
            if (a11) {
                r12 = 1;
            }
            return ((hashCode + r12) * 31) + this.f54217e.hashCode();
        }

        public String toString() {
            return "CardBasedInstallmentOptions(values=" + b() + ", includeRevolving=" + a() + ", cardType=" + this.f54217e + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // v6.t, android.os.Parcelable
        public void writeToParcel(Parcel dest, int i11) {
            kotlin.jvm.internal.s.g(dest, "dest");
            super.writeToParcel(dest, i11);
            dest.writeSerializable(this.f54217e);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private a(android.os.Parcel r4) {
            /*
                r3 = this;
                java.lang.Class r0 = java.lang.Integer.TYPE
                java.lang.ClassLoader r0 = r0.getClassLoader()
                java.util.ArrayList r0 = r4.readArrayList(r0)
                java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>"
                java.util.Objects.requireNonNull(r0, r1)
                boolean r1 = q7.c.a(r4)
                java.io.Serializable r4 = r4.readSerializable()
                java.lang.String r2 = "null cannot be cast to non-null type com.adyen.checkout.card.data.CardType"
                java.util.Objects.requireNonNull(r4, r2)
                x6.a r4 = (x6.a) r4
                r3.<init>(r0, r1, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v6.t.a.<init>(android.os.Parcel):void");
        }
    }
}