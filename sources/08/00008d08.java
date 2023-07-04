package nv;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.classic.spi.CallerData;
import com.teslamotors.plugins.ble.Peripheral;

/* loaded from: classes6.dex */
public class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public String f41894a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f41895b;

    /* renamed from: c  reason: collision with root package name */
    public String f41896c;

    /* renamed from: d  reason: collision with root package name */
    public int f41897d;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d[] newArray(int i11) {
            return new d[i11];
        }
    }

    protected d(Parcel parcel) {
        this.f41894a = parcel.readString();
        this.f41895b = parcel.readByte() != 0;
        this.f41896c = parcel.readString();
        this.f41897d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f41894a);
        parcel.writeByte(this.f41895b ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f41896c);
        parcel.writeInt(this.f41897d);
    }

    public d(Peripheral peripheral) {
        this.f41894a = CallerData.NA;
        this.f41895b = peripheral.isConnected();
        this.f41896c = peripheral.getIdentifier();
        this.f41897d = peripheral.getRssi();
    }

    public d(String str, boolean z11, String str2, int i11) {
        this.f41894a = str;
        this.f41895b = z11;
        this.f41896c = str2;
        this.f41897d = i11;
    }
}