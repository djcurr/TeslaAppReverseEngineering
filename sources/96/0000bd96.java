package wx;

import android.location.Address;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C1283a();

    /* renamed from: a  reason: collision with root package name */
    private Location f56435a;

    /* renamed from: b  reason: collision with root package name */
    private Address f56436b;

    /* renamed from: wx.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    static class C1283a implements Parcelable.Creator {
        C1283a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(Address address) {
        this.f56436b = address;
        Location location = new Location(a.class.getCanonicalName());
        this.f56435a = location;
        location.setLatitude(address.getLatitude());
        this.f56435a.setLongitude(address.getLongitude());
    }

    public Location a() {
        return this.f56435a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeParcelable(this.f56435a, i11);
        parcel.writeParcelable(this.f56436b, i11);
    }

    public a(Parcel parcel) {
        this.f56435a = (Location) parcel.readParcelable(Location.class.getClassLoader());
        this.f56436b = (Address) parcel.readParcelable(Address.class.getClassLoader());
    }
}