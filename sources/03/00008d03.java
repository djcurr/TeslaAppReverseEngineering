package nv;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0820a();

    /* renamed from: a  reason: collision with root package name */
    public lv.b f41889a;

    /* renamed from: b  reason: collision with root package name */
    public String f41890b;

    /* renamed from: c  reason: collision with root package name */
    public int f41891c;

    /* renamed from: d  reason: collision with root package name */
    public String f41892d;

    /* renamed from: nv.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    class C0820a implements Parcelable.Creator<a> {
        C0820a() {
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

    public a(lv.b bVar, String str, int i11) {
        this(bVar, str, i11, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeSerializable(this.f41889a);
        parcel.writeString(this.f41890b);
        parcel.writeInt(this.f41891c);
        parcel.writeString(this.f41892d);
    }

    public a(lv.b bVar, String str, int i11, String str2) {
        this.f41889a = bVar;
        this.f41890b = str;
        this.f41891c = i11;
        this.f41892d = str2;
    }

    protected a(Parcel parcel) {
        this.f41889a = (lv.b) parcel.readSerializable();
        this.f41890b = parcel.readString();
        this.f41891c = parcel.readInt();
        this.f41892d = parcel.readString();
    }
}