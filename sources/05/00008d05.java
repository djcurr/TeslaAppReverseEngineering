package nv;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    byte[] f41893a;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<b> {
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

    protected b(Parcel parcel) {
        this.f41893a = parcel.createByteArray();
    }

    public byte[] a() {
        return this.f41893a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByteArray(this.f41893a);
    }

    public b(byte[] bArr) {
        this.f41893a = bArr;
    }
}