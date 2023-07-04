package bj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0151a();

    /* renamed from: b  reason: collision with root package name */
    public final String f7668b;

    /* renamed from: c  reason: collision with root package name */
    public final String f7669c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7670d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f7671e;

    /* renamed from: bj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0151a implements Parcelable.Creator<a> {
        C0151a() {
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

    public a(String str, String str2, int i11, byte[] bArr) {
        super("APIC");
        this.f7668b = str;
        this.f7669c = str2;
        this.f7670d = i11;
        this.f7671e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7670d == aVar.f7670d && k0.c(this.f7668b, aVar.f7668b) && k0.c(this.f7669c, aVar.f7669c) && Arrays.equals(this.f7671e, aVar.f7671e);
    }

    public int hashCode() {
        int i11 = (527 + this.f7670d) * 31;
        String str = this.f7668b;
        int hashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7669c;
        return ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f7671e);
    }

    @Override // bj.i
    public String toString() {
        String str = this.f7697a;
        String str2 = this.f7668b;
        String str3 = this.f7669c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb2.append(str);
        sb2.append(": mimeType=");
        sb2.append(str2);
        sb2.append(", description=");
        sb2.append(str3);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f7668b);
        parcel.writeString(this.f7669c);
        parcel.writeInt(this.f7670d);
        parcel.writeByteArray(this.f7671e);
    }

    a(Parcel parcel) {
        super("APIC");
        this.f7668b = (String) k0.j(parcel.readString());
        this.f7669c = parcel.readString();
        this.f7670d = parcel.readInt();
        this.f7671e = (byte[]) k0.j(parcel.createByteArray());
    }
}