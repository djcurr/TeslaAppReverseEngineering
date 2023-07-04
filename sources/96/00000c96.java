package bj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f7708b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7709c;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public m[] newArray(int i11) {
            return new m[i11];
        }
    }

    public m(String str, String str2, String str3) {
        super(str);
        this.f7708b = str2;
        this.f7709c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f7697a.equals(mVar.f7697a) && k0.c(this.f7708b, mVar.f7708b) && k0.c(this.f7709c, mVar.f7709c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f7697a.hashCode()) * 31;
        String str = this.f7708b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7709c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // bj.i
    public String toString() {
        String str = this.f7697a;
        String str2 = this.f7708b;
        String str3 = this.f7709c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": description=");
        sb2.append(str2);
        sb2.append(": value=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f7697a);
        parcel.writeString(this.f7708b);
        parcel.writeString(this.f7709c);
    }

    m(Parcel parcel) {
        super((String) k0.j(parcel.readString()));
        this.f7708b = parcel.readString();
        this.f7709c = (String) k0.j(parcel.readString());
    }
}