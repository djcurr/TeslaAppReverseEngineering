package bj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class f extends i {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f7687b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7688c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7689d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f7690e;

    /* loaded from: classes3.dex */
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

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f7687b = str;
        this.f7688c = str2;
        this.f7689d = str3;
        this.f7690e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return k0.c(this.f7687b, fVar.f7687b) && k0.c(this.f7688c, fVar.f7688c) && k0.c(this.f7689d, fVar.f7689d) && Arrays.equals(this.f7690e, fVar.f7690e);
    }

    public int hashCode() {
        String str = this.f7687b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7688c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f7689d;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f7690e);
    }

    @Override // bj.i
    public String toString() {
        String str = this.f7697a;
        String str2 = this.f7687b;
        String str3 = this.f7688c;
        String str4 = this.f7689d;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", filename=");
        sb2.append(str3);
        sb2.append(", description=");
        sb2.append(str4);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f7687b);
        parcel.writeString(this.f7688c);
        parcel.writeString(this.f7689d);
        parcel.writeByteArray(this.f7690e);
    }

    f(Parcel parcel) {
        super("GEOB");
        this.f7687b = (String) k0.j(parcel.readString());
        this.f7688c = (String) k0.j(parcel.readString());
        this.f7689d = (String) k0.j(parcel.readString());
        this.f7690e = (byte[]) k0.j(parcel.createByteArray());
    }
}