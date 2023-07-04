package cj;

import android.os.Parcel;
import android.os.Parcelable;
import fl.f;
import wi.a;

/* loaded from: classes3.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f9258a;

    /* renamed from: b  reason: collision with root package name */
    public final long f9259b;

    /* renamed from: c  reason: collision with root package name */
    public final long f9260c;

    /* renamed from: d  reason: collision with root package name */
    public final long f9261d;

    /* renamed from: e  reason: collision with root package name */
    public final long f9262e;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i11) {
            return new b[i11];
        }
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
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
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f9258a == bVar.f9258a && this.f9259b == bVar.f9259b && this.f9260c == bVar.f9260c && this.f9261d == bVar.f9261d && this.f9262e == bVar.f9262e;
    }

    public int hashCode() {
        return ((((((((527 + f.a(this.f9258a)) * 31) + f.a(this.f9259b)) * 31) + f.a(this.f9260c)) * 31) + f.a(this.f9261d)) * 31) + f.a(this.f9262e);
    }

    public String toString() {
        long j11 = this.f9258a;
        long j12 = this.f9259b;
        long j13 = this.f9260c;
        long j14 = this.f9261d;
        long j15 = this.f9262e;
        StringBuilder sb2 = new StringBuilder(218);
        sb2.append("Motion photo metadata: photoStartPosition=");
        sb2.append(j11);
        sb2.append(", photoSize=");
        sb2.append(j12);
        sb2.append(", photoPresentationTimestampUs=");
        sb2.append(j13);
        sb2.append(", videoStartPosition=");
        sb2.append(j14);
        sb2.append(", videoSize=");
        sb2.append(j15);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f9258a);
        parcel.writeLong(this.f9259b);
        parcel.writeLong(this.f9260c);
        parcel.writeLong(this.f9261d);
        parcel.writeLong(this.f9262e);
    }

    public b(long j11, long j12, long j13, long j14, long j15) {
        this.f9258a = j11;
        this.f9259b = j12;
        this.f9260c = j13;
        this.f9261d = j14;
        this.f9262e = j15;
    }

    private b(Parcel parcel) {
        this.f9258a = parcel.readLong();
        this.f9259b = parcel.readLong();
        this.f9260c = parcel.readLong();
        this.f9261d = parcel.readLong();
        this.f9262e = parcel.readLong();
    }
}