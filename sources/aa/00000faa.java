package c6;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: a  reason: collision with root package name */
    public static final b f8890a = new b();
    public static final Parcelable.Creator CREATOR = new a();

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in2) {
            s.g(in2, "in");
            if (in2.readInt() != 0) {
                return b.f8890a;
            }
            return null;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i11) {
            return new b[i11];
        }
    }

    private b() {
        super(null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "coil.size.OriginalSize";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        parcel.writeInt(1);
    }
}