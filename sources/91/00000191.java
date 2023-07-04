package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public int f977a;

    /* renamed from: b  reason: collision with root package name */
    public int f978b;

    /* renamed from: c  reason: collision with root package name */
    public int f979c;

    /* renamed from: d  reason: collision with root package name */
    public int f980d;

    /* renamed from: e  reason: collision with root package name */
    public int f981e;

    /* loaded from: classes.dex */
    class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i11) {
            return new ParcelableVolumeInfo[i11];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f977a = parcel.readInt();
        this.f979c = parcel.readInt();
        this.f980d = parcel.readInt();
        this.f981e = parcel.readInt();
        this.f978b = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f977a);
        parcel.writeInt(this.f979c);
        parcel.writeInt(this.f980d);
        parcel.writeInt(this.f981e);
        parcel.writeInt(this.f978b);
    }
}