package zi;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import wi.a;

/* loaded from: classes3.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C1383a();

    /* renamed from: a  reason: collision with root package name */
    public final int f60412a;

    /* renamed from: b  reason: collision with root package name */
    public final String f60413b;

    /* renamed from: c  reason: collision with root package name */
    public final String f60414c;

    /* renamed from: d  reason: collision with root package name */
    public final int f60415d;

    /* renamed from: e  reason: collision with root package name */
    public final int f60416e;

    /* renamed from: f  reason: collision with root package name */
    public final int f60417f;

    /* renamed from: g  reason: collision with root package name */
    public final int f60418g;

    /* renamed from: h  reason: collision with root package name */
    public final byte[] f60419h;

    /* renamed from: zi.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C1383a implements Parcelable.Creator<a> {
        C1383a() {
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

    public a(int i11, String str, String str2, int i12, int i13, int i14, int i15, byte[] bArr) {
        this.f60412a = i11;
        this.f60413b = str;
        this.f60414c = str2;
        this.f60415d = i12;
        this.f60416e = i13;
        this.f60417f = i14;
        this.f60418g = i15;
        this.f60419h = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f60412a == aVar.f60412a && this.f60413b.equals(aVar.f60413b) && this.f60414c.equals(aVar.f60414c) && this.f60415d == aVar.f60415d && this.f60416e == aVar.f60416e && this.f60417f == aVar.f60417f && this.f60418g == aVar.f60418g && Arrays.equals(this.f60419h, aVar.f60419h);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f60412a) * 31) + this.f60413b.hashCode()) * 31) + this.f60414c.hashCode()) * 31) + this.f60415d) * 31) + this.f60416e) * 31) + this.f60417f) * 31) + this.f60418g) * 31) + Arrays.hashCode(this.f60419h);
    }

    public String toString() {
        String str = this.f60413b;
        String str2 = this.f60414c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 32 + String.valueOf(str2).length());
        sb2.append("Picture: mimeType=");
        sb2.append(str);
        sb2.append(", description=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f60412a);
        parcel.writeString(this.f60413b);
        parcel.writeString(this.f60414c);
        parcel.writeInt(this.f60415d);
        parcel.writeInt(this.f60416e);
        parcel.writeInt(this.f60417f);
        parcel.writeInt(this.f60418g);
        parcel.writeByteArray(this.f60419h);
    }

    a(Parcel parcel) {
        this.f60412a = parcel.readInt();
        this.f60413b = (String) k0.j(parcel.readString());
        this.f60414c = (String) k0.j(parcel.readString());
        this.f60415d = parcel.readInt();
        this.f60416e = parcel.readInt();
        this.f60417f = parcel.readInt();
        this.f60418g = parcel.readInt();
        this.f60419h = (byte[]) k0.j(parcel.createByteArray());
    }
}