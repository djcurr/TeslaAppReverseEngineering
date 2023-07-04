package cj;

import android.os.Parcel;
import android.os.Parcelable;
import wi.a;

/* loaded from: classes3.dex */
public final class d implements a.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final float f9267a;

    /* renamed from: b  reason: collision with root package name */
    public final int f9268b;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d[] newArray(int i11) {
            return new d[i11];
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
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
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f9267a == dVar.f9267a && this.f9268b == dVar.f9268b;
    }

    public int hashCode() {
        return ((527 + fl.b.a(this.f9267a)) * 31) + this.f9268b;
    }

    public String toString() {
        float f11 = this.f9267a;
        int i11 = this.f9268b;
        StringBuilder sb2 = new StringBuilder(73);
        sb2.append("smta: captureFrameRate=");
        sb2.append(f11);
        sb2.append(", svcTemporalLayerCount=");
        sb2.append(i11);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeFloat(this.f9267a);
        parcel.writeInt(this.f9268b);
    }

    public d(float f11, int i11) {
        this.f9267a = f11;
        this.f9268b = i11;
    }

    private d(Parcel parcel) {
        this.f9267a = parcel.readFloat();
        this.f9268b = parcel.readInt();
    }
}