package nv;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class f implements Parcelable {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    String f41899a;

    /* renamed from: b  reason: collision with root package name */
    byte[] f41900b;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public f[] newArray(int i11) {
            return new f[i11];
        }
    }

    protected f(Parcel parcel) {
        this.f41899a = parcel.readString();
        this.f41900b = parcel.createByteArray();
    }

    public byte[] a() {
        return this.f41900b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f41899a);
        parcel.writeByteArray(this.f41900b);
    }

    public f(String str, byte[] bArr) {
        this.f41899a = str;
        this.f41900b = bArr;
    }
}