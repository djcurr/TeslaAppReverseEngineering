package bk;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f7718a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7719b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7720c;

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f7721d;

    /* renamed from: e  reason: collision with root package name */
    private int f7722e;

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

    public b(int i11, int i12, int i13, byte[] bArr) {
        this.f7718a = i11;
        this.f7719b = i12;
        this.f7720c = i13;
        this.f7721d = bArr;
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
        return this.f7718a == bVar.f7718a && this.f7719b == bVar.f7719b && this.f7720c == bVar.f7720c && Arrays.equals(this.f7721d, bVar.f7721d);
    }

    public int hashCode() {
        if (this.f7722e == 0) {
            this.f7722e = ((((((527 + this.f7718a) * 31) + this.f7719b) * 31) + this.f7720c) * 31) + Arrays.hashCode(this.f7721d);
        }
        return this.f7722e;
    }

    public String toString() {
        int i11 = this.f7718a;
        int i12 = this.f7719b;
        int i13 = this.f7720c;
        boolean z11 = this.f7721d != null;
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("ColorInfo(");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(i13);
        sb2.append(", ");
        sb2.append(z11);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f7718a);
        parcel.writeInt(this.f7719b);
        parcel.writeInt(this.f7720c);
        k0.V0(parcel, this.f7721d != null);
        byte[] bArr = this.f7721d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    b(Parcel parcel) {
        this.f7718a = parcel.readInt();
        this.f7719b = parcel.readInt();
        this.f7720c = parcel.readInt();
        this.f7721d = k0.G0(parcel) ? parcel.createByteArray() : null;
    }
}