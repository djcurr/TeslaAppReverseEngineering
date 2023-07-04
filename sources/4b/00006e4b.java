package fj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class u implements Parcelable {
    public static final Parcelable.Creator<u> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f26350a;

    /* renamed from: b  reason: collision with root package name */
    private final ci.i[] f26351b;

    /* renamed from: c  reason: collision with root package name */
    private int f26352c;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<u> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public u createFromParcel(Parcel parcel) {
            return new u(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public u[] newArray(int i11) {
            return new u[i11];
        }
    }

    public u(ci.i... iVarArr) {
        ak.a.f(iVarArr.length > 0);
        this.f26351b = iVarArr;
        this.f26350a = iVarArr.length;
    }

    public ci.i a(int i11) {
        return this.f26351b[i11];
    }

    public int b(ci.i iVar) {
        int i11 = 0;
        while (true) {
            ci.i[] iVarArr = this.f26351b;
            if (i11 >= iVarArr.length) {
                return -1;
            }
            if (iVar == iVarArr[i11]) {
                return i11;
            }
            i11++;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return this.f26350a == uVar.f26350a && Arrays.equals(this.f26351b, uVar.f26351b);
    }

    public int hashCode() {
        if (this.f26352c == 0) {
            this.f26352c = 527 + Arrays.hashCode(this.f26351b);
        }
        return this.f26352c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f26350a);
        for (int i12 = 0; i12 < this.f26350a; i12++) {
            parcel.writeParcelable(this.f26351b[i12], 0);
        }
    }

    u(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f26350a = readInt;
        this.f26351b = new ci.i[readInt];
        for (int i11 = 0; i11 < this.f26350a; i11++) {
            this.f26351b[i11] = (ci.i) parcel.readParcelable(ci.i.class.getClassLoader());
        }
    }
}