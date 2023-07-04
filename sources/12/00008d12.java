package nv;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public boolean f41904a;

    /* renamed from: b  reason: collision with root package name */
    public String f41905b;

    /* renamed from: c  reason: collision with root package name */
    public int f41906c;

    /* renamed from: d  reason: collision with root package name */
    public e f41907d;

    /* loaded from: classes6.dex */
    class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public i[] newArray(int i11) {
            return new i[i11];
        }
    }

    public i(boolean z11, String str, int i11, e eVar) {
        this.f41904a = z11;
        this.f41905b = str;
        this.f41906c = i11;
        this.f41907d = eVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByte(this.f41904a ? (byte) 1 : (byte) 0);
        parcel.writeString(this.f41905b);
        parcel.writeInt(this.f41906c);
        parcel.writeParcelable(this.f41907d, i11);
    }

    protected i(Parcel parcel) {
        this.f41904a = parcel.readByte() != 0;
        this.f41905b = parcel.readString();
        this.f41906c = parcel.readInt();
        this.f41907d = (e) parcel.readParcelable(d.class.getClassLoader());
    }
}