package mh;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
public class a implements Comparable<a>, Parcelable {

    /* renamed from: a  reason: collision with root package name */
    private final int f38494a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38495b;

    /* renamed from: c  reason: collision with root package name */
    private static final androidx.collection.h<androidx.collection.h<a>> f38493c = new androidx.collection.h<>(16);
    public static final Parcelable.Creator<a> CREATOR = new C0742a();

    /* renamed from: mh.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0742a implements Parcelable.Creator<a> {
        C0742a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return a.g(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    private a(int i11, int i12) {
        this.f38494a = i11;
        this.f38495b = i12;
    }

    private static int b(int i11, int i12) {
        while (true) {
            int i13 = i12;
            int i14 = i11;
            i11 = i13;
            if (i11 == 0) {
                return i14;
            }
            i12 = i14 % i11;
        }
    }

    public static a g(int i11, int i12) {
        int b11 = b(i11, i12);
        int i13 = i11 / b11;
        int i14 = i12 / b11;
        androidx.collection.h<androidx.collection.h<a>> hVar = f38493c;
        androidx.collection.h<a> g11 = hVar.g(i13);
        if (g11 == null) {
            a aVar = new a(i13, i14);
            androidx.collection.h<a> hVar2 = new androidx.collection.h<>();
            hVar2.l(i14, aVar);
            hVar.l(i13, hVar2);
            return aVar;
        }
        a g12 = g11.g(i14);
        if (g12 == null) {
            a aVar2 = new a(i13, i14);
            g11.l(i14, aVar2);
            return aVar2;
        }
        return g12;
    }

    public static a h(String str) {
        int indexOf = str.indexOf(58);
        if (indexOf != -1) {
            try {
                return g(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException("Malformed aspect ratio: " + str, e11);
            }
        }
        throw new IllegalArgumentException("Malformed aspect ratio: " + str);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(a aVar) {
        if (equals(aVar)) {
            return 0;
        }
        return i() - aVar.i() > BitmapDescriptorFactory.HUE_RED ? 1 : -1;
    }

    public int c() {
        return this.f38494a;
    }

    public int d() {
        return this.f38495b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public a e() {
        return g(this.f38495b, this.f38494a);
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            return this.f38494a == aVar.f38494a && this.f38495b == aVar.f38495b;
        }
        return false;
    }

    public boolean f(j jVar) {
        int b11 = b(jVar.c(), jVar.b());
        return this.f38494a == jVar.c() / b11 && this.f38495b == jVar.b() / b11;
    }

    public int hashCode() {
        int i11 = this.f38495b;
        int i12 = this.f38494a;
        return i11 ^ ((i12 >>> 16) | (i12 << 16));
    }

    public float i() {
        return this.f38494a / this.f38495b;
    }

    public String toString() {
        return this.f38494a + ":" + this.f38495b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f38494a);
        parcel.writeInt(this.f38495b);
    }
}