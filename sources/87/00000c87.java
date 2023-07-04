package bj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class e extends i {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f7684b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7685c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7686d;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<e> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public e[] newArray(int i11) {
            return new e[i11];
        }
    }

    public e(String str, String str2, String str3) {
        super("COMM");
        this.f7684b = str;
        this.f7685c = str2;
        this.f7686d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return k0.c(this.f7685c, eVar.f7685c) && k0.c(this.f7684b, eVar.f7684b) && k0.c(this.f7686d, eVar.f7686d);
    }

    public int hashCode() {
        String str = this.f7684b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7685c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7686d;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // bj.i
    public String toString() {
        String str = this.f7697a;
        String str2 = this.f7684b;
        String str3 = this.f7685c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": language=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f7697a);
        parcel.writeString(this.f7684b);
        parcel.writeString(this.f7686d);
    }

    e(Parcel parcel) {
        super("COMM");
        this.f7684b = (String) k0.j(parcel.readString());
        this.f7685c = (String) k0.j(parcel.readString());
        this.f7686d = (String) k0.j(parcel.readString());
    }
}