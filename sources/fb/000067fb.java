package ej;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class c implements Comparable<c>, Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f25187a;

    /* renamed from: b  reason: collision with root package name */
    public final int f25188b;

    /* renamed from: c  reason: collision with root package name */
    public final int f25189c;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c(int i11, int i12, int i13) {
        this.f25187a = i11;
        this.f25188b = i12;
        this.f25189c = i13;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(c cVar) {
        int i11 = this.f25187a - cVar.f25187a;
        if (i11 == 0) {
            int i12 = this.f25188b - cVar.f25188b;
            return i12 == 0 ? this.f25189c - cVar.f25189c : i12;
        }
        return i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f25187a == cVar.f25187a && this.f25188b == cVar.f25188b && this.f25189c == cVar.f25189c;
    }

    public int hashCode() {
        return (((this.f25187a * 31) + this.f25188b) * 31) + this.f25189c;
    }

    public String toString() {
        int i11 = this.f25187a;
        int i12 = this.f25188b;
        int i13 = this.f25189c;
        StringBuilder sb2 = new StringBuilder(35);
        sb2.append(i11);
        sb2.append(".");
        sb2.append(i12);
        sb2.append(".");
        sb2.append(i13);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f25187a);
        parcel.writeInt(this.f25188b);
        parcel.writeInt(this.f25189c);
    }

    c(Parcel parcel) {
        this.f25187a = parcel.readInt();
        this.f25188b = parcel.readInt();
        this.f25189c = parcel.readInt();
    }
}