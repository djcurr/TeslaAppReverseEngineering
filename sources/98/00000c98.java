package bj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class n extends i {
    public static final Parcelable.Creator<n> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f7710b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7711c;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<n> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public n createFromParcel(Parcel parcel) {
            return new n(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public n[] newArray(int i11) {
            return new n[i11];
        }
    }

    public n(String str, String str2, String str3) {
        super(str);
        this.f7710b = str2;
        this.f7711c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || n.class != obj.getClass()) {
            return false;
        }
        n nVar = (n) obj;
        return this.f7697a.equals(nVar.f7697a) && k0.c(this.f7710b, nVar.f7710b) && k0.c(this.f7711c, nVar.f7711c);
    }

    public int hashCode() {
        int hashCode = (527 + this.f7697a.hashCode()) * 31;
        String str = this.f7710b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7711c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // bj.i
    public String toString() {
        String str = this.f7697a;
        String str2 = this.f7711c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": url=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f7697a);
        parcel.writeString(this.f7710b);
        parcel.writeString(this.f7711c);
    }

    n(Parcel parcel) {
        super((String) k0.j(parcel.readString()));
        this.f7710b = parcel.readString();
        this.f7711c = (String) k0.j(parcel.readString());
    }
}