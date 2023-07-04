package al;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public long f553a;

    /* renamed from: b  reason: collision with root package name */
    public long f554b;

    /* renamed from: c  reason: collision with root package name */
    public long f555c;

    /* renamed from: d  reason: collision with root package name */
    public float f556d;

    /* loaded from: classes3.dex */
    static class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i11) {
            return new b[i11];
        }
    }

    public b(Parcel parcel) {
        this.f553a = parcel.readLong();
        this.f554b = parcel.readLong();
        this.f555c = parcel.readLong();
        this.f556d = parcel.readFloat();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f553a);
        parcel.writeLong(this.f554b);
        parcel.writeLong(this.f555c);
        parcel.writeFloat(this.f556d);
    }

    public b(long j11, long j12, long j13, float f11) {
        this.f553a = j11;
        this.f554b = j12;
        this.f555c = j13;
        this.f556d = f11;
    }
}