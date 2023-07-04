package bj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class j extends i {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f7698b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7699c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7700d;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public j[] newArray(int i11) {
            return new j[i11];
        }
    }

    public j(String str, String str2, String str3) {
        super("----");
        this.f7698b = str;
        this.f7699c = str2;
        this.f7700d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return k0.c(this.f7699c, jVar.f7699c) && k0.c(this.f7698b, jVar.f7698b) && k0.c(this.f7700d, jVar.f7700d);
    }

    public int hashCode() {
        String str = this.f7698b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7699c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7700d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // bj.i
    public String toString() {
        String str = this.f7697a;
        String str2 = this.f7698b;
        String str3 = this.f7699c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": domain=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f7697a);
        parcel.writeString(this.f7698b);
        parcel.writeString(this.f7700d);
    }

    j(Parcel parcel) {
        super("----");
        this.f7698b = (String) k0.j(parcel.readString());
        this.f7699c = (String) k0.j(parcel.readString());
        this.f7700d = (String) k0.j(parcel.readString());
    }
}