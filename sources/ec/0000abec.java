package q0;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR;

    /* renamed from: a  reason: collision with root package name */
    private final int f47035a;

    /* renamed from: q0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1009a implements Parcelable.Creator<a> {
        C1009a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new a(parcel.readInt());
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
        CREATOR = new C1009a();
    }

    public a(int i11) {
        this.f47035a = i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f47035a == ((a) obj).f47035a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f47035a);
    }

    public String toString() {
        return "DefaultLazyKey(index=" + this.f47035a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        parcel.writeInt(this.f47035a);
    }
}