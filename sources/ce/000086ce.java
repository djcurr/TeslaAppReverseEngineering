package mh;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class j implements Comparable<j>, Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final int f38604a;

    /* renamed from: b  reason: collision with root package name */
    private final int f38605b;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<j> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public j createFromParcel(Parcel parcel) {
            return new j(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public j[] newArray(int i11) {
            return new j[i11];
        }
    }

    public j(int i11, int i12) {
        this.f38604a = i11;
        this.f38605b = i12;
    }

    public static j d(String str) {
        int indexOf = str.indexOf(120);
        if (indexOf != -1) {
            try {
                return new j(Integer.parseInt(str.substring(0, indexOf)), Integer.parseInt(str.substring(indexOf + 1)));
            } catch (NumberFormatException e11) {
                throw new IllegalArgumentException("Malformed size: " + str, e11);
            }
        }
        throw new IllegalArgumentException("Malformed size: " + str);
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(j jVar) {
        return (this.f38604a * this.f38605b) - (jVar.f38604a * jVar.f38605b);
    }

    public int b() {
        return this.f38605b;
    }

    public int c() {
        return this.f38604a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return this.f38604a == jVar.f38604a && this.f38605b == jVar.f38605b;
        }
        return false;
    }

    public int hashCode() {
        int i11 = this.f38605b;
        int i12 = this.f38604a;
        return i11 ^ ((i12 >>> 16) | (i12 << 16));
    }

    public String toString() {
        return this.f38604a + "x" + this.f38605b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f38604a);
        parcel.writeInt(this.f38605b);
    }
}