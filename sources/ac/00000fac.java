package c6;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class c extends g {
    public static final Parcelable.Creator CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f8891a;

    /* renamed from: b  reason: collision with root package name */
    private final int f8892b;

    /* loaded from: classes.dex */
    public static class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel in2) {
            s.g(in2, "in");
            return new c(in2.readInt(), in2.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c(int i11, int i12) {
        super(null);
        this.f8891a = i11;
        this.f8892b = i12;
        if (!(i11 > 0 && i12 > 0)) {
            throw new IllegalArgumentException("Width and height must be > 0.".toString());
        }
    }

    public final int a() {
        return this.f8891a;
    }

    public final int b() {
        return this.f8892b;
    }

    public final int c() {
        return this.f8892b;
    }

    public final int d() {
        return this.f8891a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                return this.f8891a == cVar.f8891a && this.f8892b == cVar.f8892b;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f8891a) * 31) + Integer.hashCode(this.f8892b);
    }

    public String toString() {
        return "PixelSize(width=" + this.f8891a + ", height=" + this.f8892b + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        s.g(parcel, "parcel");
        parcel.writeInt(this.f8891a);
        parcel.writeInt(this.f8892b);
    }
}