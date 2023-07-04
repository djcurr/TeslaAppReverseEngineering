package xi;

import android.os.Parcel;
import android.os.Parcelable;
import wi.a;

/* loaded from: classes3.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C1304a();

    /* renamed from: a  reason: collision with root package name */
    public final int f57449a;

    /* renamed from: b  reason: collision with root package name */
    public final String f57450b;

    /* renamed from: xi.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C1304a implements Parcelable.Creator<a> {
        C1304a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel.readInt(), (String) ak.a.e(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    public a(int i11, String str) {
        this.f57449a = i11;
        this.f57450b = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        int i11 = this.f57449a;
        String str = this.f57450b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 33);
        sb2.append("Ait(controlCode=");
        sb2.append(i11);
        sb2.append(",url=");
        sb2.append(str);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f57450b);
        parcel.writeInt(this.f57449a);
    }
}