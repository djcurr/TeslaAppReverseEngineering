package fj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class v implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public final int f26354a;

    /* renamed from: b  reason: collision with root package name */
    private final u[] f26355b;

    /* renamed from: c  reason: collision with root package name */
    private int f26356c;

    /* renamed from: d  reason: collision with root package name */
    public static final v f26353d = new v(new u[0]);
    public static final Parcelable.Creator<v> CREATOR = new a();

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<v> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public v createFromParcel(Parcel parcel) {
            return new v(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public v[] newArray(int i11) {
            return new v[i11];
        }
    }

    public v(u... uVarArr) {
        this.f26355b = uVarArr;
        this.f26354a = uVarArr.length;
    }

    public u a(int i11) {
        return this.f26355b[i11];
    }

    public int b(u uVar) {
        for (int i11 = 0; i11 < this.f26354a; i11++) {
            if (this.f26355b[i11] == uVar) {
                return i11;
            }
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return this.f26354a == vVar.f26354a && Arrays.equals(this.f26355b, vVar.f26355b);
    }

    public int hashCode() {
        if (this.f26356c == 0) {
            this.f26356c = Arrays.hashCode(this.f26355b);
        }
        return this.f26356c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f26354a);
        for (int i12 = 0; i12 < this.f26354a; i12++) {
            parcel.writeParcelable(this.f26355b[i12], 0);
        }
    }

    v(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f26354a = readInt;
        this.f26355b = new u[readInt];
        for (int i11 = 0; i11 < this.f26354a; i11++) {
            this.f26355b[i11] = (u) parcel.readParcelable(u.class.getClassLoader());
        }
    }
}