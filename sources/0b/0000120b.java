package cj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import wi.a;

/* loaded from: classes3.dex */
public final class a implements a.b {
    public static final Parcelable.Creator<a> CREATOR = new C0181a();

    /* renamed from: a  reason: collision with root package name */
    public final String f9254a;

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f9255b;

    /* renamed from: c  reason: collision with root package name */
    public final int f9256c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9257d;

    /* renamed from: cj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0181a implements Parcelable.Creator<a> {
        C0181a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* synthetic */ a(Parcel parcel, C0181a c0181a) {
        this(parcel);
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
        return this.f9254a.equals(aVar.f9254a) && Arrays.equals(this.f9255b, aVar.f9255b) && this.f9256c == aVar.f9256c && this.f9257d == aVar.f9257d;
    }

    public int hashCode() {
        return ((((((527 + this.f9254a.hashCode()) * 31) + Arrays.hashCode(this.f9255b)) * 31) + this.f9256c) * 31) + this.f9257d;
    }

    public String toString() {
        String valueOf = String.valueOf(this.f9254a);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f9254a);
        parcel.writeByteArray(this.f9255b);
        parcel.writeInt(this.f9256c);
        parcel.writeInt(this.f9257d);
    }

    public a(String str, byte[] bArr, int i11, int i12) {
        this.f9254a = str;
        this.f9255b = bArr;
        this.f9256c = i11;
        this.f9257d = i12;
    }

    private a(Parcel parcel) {
        this.f9254a = (String) k0.j(parcel.readString());
        this.f9255b = (byte[]) k0.j(parcel.createByteArray());
        this.f9256c = parcel.readInt();
        this.f9257d = parcel.readInt();
    }
}