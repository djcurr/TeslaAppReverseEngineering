package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f963a;

    /* renamed from: b  reason: collision with root package name */
    private final float f964b;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<RatingCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public RatingCompat[] newArray(int i11) {
            return new RatingCompat[i11];
        }
    }

    RatingCompat(int i11, float f11) {
        this.f963a = i11;
        this.f964b = f11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f963a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Rating:style=");
        sb2.append(this.f963a);
        sb2.append(" rating=");
        float f11 = this.f964b;
        sb2.append(f11 < BitmapDescriptorFactory.HUE_RED ? "unrated" : String.valueOf(f11));
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f963a);
        parcel.writeFloat(this.f964b);
    }
}