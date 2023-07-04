package bj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class k extends i {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final int f7701b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7702c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7703d;

    /* renamed from: e  reason: collision with root package name */
    public final int[] f7704e;

    /* renamed from: f  reason: collision with root package name */
    public final int[] f7705f;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<k> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public k[] newArray(int i11) {
            return new k[i11];
        }
    }

    public k(int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f7701b = i11;
        this.f7702c = i12;
        this.f7703d = i13;
        this.f7704e = iArr;
        this.f7705f = iArr2;
    }

    @Override // bj.i, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k.class != obj.getClass()) {
            return false;
        }
        k kVar = (k) obj;
        return this.f7701b == kVar.f7701b && this.f7702c == kVar.f7702c && this.f7703d == kVar.f7703d && Arrays.equals(this.f7704e, kVar.f7704e) && Arrays.equals(this.f7705f, kVar.f7705f);
    }

    public int hashCode() {
        return ((((((((527 + this.f7701b) * 31) + this.f7702c) * 31) + this.f7703d) * 31) + Arrays.hashCode(this.f7704e)) * 31) + Arrays.hashCode(this.f7705f);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f7701b);
        parcel.writeInt(this.f7702c);
        parcel.writeInt(this.f7703d);
        parcel.writeIntArray(this.f7704e);
        parcel.writeIntArray(this.f7705f);
    }

    k(Parcel parcel) {
        super("MLLT");
        this.f7701b = parcel.readInt();
        this.f7702c = parcel.readInt();
        this.f7703d = parcel.readInt();
        this.f7704e = (int[]) k0.j(parcel.createIntArray());
        this.f7705f = (int[]) k0.j(parcel.createIntArray());
    }
}