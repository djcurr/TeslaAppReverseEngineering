package bj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final byte[] f7672b;

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

    public b(String str, byte[] bArr) {
        super(str);
        this.f7672b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7697a.equals(bVar.f7697a) && Arrays.equals(this.f7672b, bVar.f7672b);
    }

    public int hashCode() {
        return ((527 + this.f7697a.hashCode()) * 31) + Arrays.hashCode(this.f7672b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f7697a);
        parcel.writeByteArray(this.f7672b);
    }

    b(Parcel parcel) {
        super((String) k0.j(parcel.readString()));
        this.f7672b = (byte[]) k0.j(parcel.createByteArray());
    }
}