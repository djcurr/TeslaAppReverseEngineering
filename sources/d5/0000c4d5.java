package zi;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import wi.a;

/* loaded from: classes3.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f60420a;

    /* renamed from: b  reason: collision with root package name */
    public final String f60421b;

    /* loaded from: classes3.dex */
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

    public b(String str, String str2) {
        this.f60420a = str;
        this.f60421b = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f60420a.equals(bVar.f60420a) && this.f60421b.equals(bVar.f60421b);
    }

    public int hashCode() {
        return ((527 + this.f60420a.hashCode()) * 31) + this.f60421b.hashCode();
    }

    public String toString() {
        String str = this.f60420a;
        String str2 = this.f60421b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb2.append("VC: ");
        sb2.append(str);
        sb2.append("=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f60420a);
        parcel.writeString(this.f60421b);
    }

    b(Parcel parcel) {
        this.f60420a = (String) k0.j(parcel.readString());
        this.f60421b = (String) k0.j(parcel.readString());
    }
}