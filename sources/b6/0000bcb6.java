package wi;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import ci.i;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C1270a();

    /* renamed from: a  reason: collision with root package name */
    private final b[] f55901a;

    /* renamed from: wi.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C1270a implements Parcelable.Creator<a> {
        C1270a() {
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

    /* loaded from: classes3.dex */
    public interface b extends Parcelable {
        default i D() {
            return null;
        }

        default byte[] D1() {
            return null;
        }
    }

    public a(b... bVarArr) {
        this.f55901a = bVarArr;
    }

    public a a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new a((b[]) k0.A0(this.f55901a, bVarArr));
    }

    public a b(a aVar) {
        return aVar == null ? this : a(aVar.f55901a);
    }

    public b c(int i11) {
        return this.f55901a[i11];
    }

    public int d() {
        return this.f55901a.length;
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
        return Arrays.equals(this.f55901a, ((a) obj).f55901a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f55901a);
    }

    public String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f55901a));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f55901a.length);
        for (b bVar : this.f55901a) {
            parcel.writeParcelable(bVar, 0);
        }
    }

    public a(List<? extends b> list) {
        this.f55901a = (b[]) list.toArray(new b[0]);
    }

    a(Parcel parcel) {
        this.f55901a = new b[parcel.readInt()];
        int i11 = 0;
        while (true) {
            b[] bVarArr = this.f55901a;
            if (i11 >= bVarArr.length) {
                return;
            }
            bVarArr[i11] = (b) parcel.readParcelable(b.class.getClassLoader());
            i11++;
        }
    }
}