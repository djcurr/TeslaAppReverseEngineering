package bj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class l extends i {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f7706b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f7707c;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public l[] newArray(int i11) {
            return new l[i11];
        }
    }

    public l(String str, byte[] bArr) {
        super("PRIV");
        this.f7706b = str;
        this.f7707c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return k0.c(this.f7706b, lVar.f7706b) && Arrays.equals(this.f7707c, lVar.f7707c);
    }

    public int hashCode() {
        String str = this.f7706b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f7707c);
    }

    @Override // bj.i
    public String toString() {
        String str = this.f7697a;
        String str2 = this.f7706b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 8 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(": owner=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f7706b);
        parcel.writeByteArray(this.f7707c);
    }

    l(Parcel parcel) {
        super("PRIV");
        this.f7706b = (String) k0.j(parcel.readString());
        this.f7707c = (byte[]) k0.j(parcel.createByteArray());
    }
}