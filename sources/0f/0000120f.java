package cj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.base.q;
import java.util.ArrayList;
import java.util.List;
import wi.a;

/* loaded from: classes3.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<b> f9263a;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, b.class.getClassLoader());
            return new c(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        public final long f9264a;

        /* renamed from: b  reason: collision with root package name */
        public final long f9265b;

        /* renamed from: c  reason: collision with root package name */
        public final int f9266c;

        /* loaded from: classes3.dex */
        class a implements Parcelable.Creator<b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public b[] newArray(int i11) {
                return new b[i11];
            }
        }

        public b(long j11, long j12, int i11) {
            ak.a.a(j11 < j12);
            this.f9264a = j11;
            this.f9265b = j12;
            this.f9266c = i11;
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
            return this.f9264a == bVar.f9264a && this.f9265b == bVar.f9265b && this.f9266c == bVar.f9266c;
        }

        public int hashCode() {
            return q.b(Long.valueOf(this.f9264a), Long.valueOf(this.f9265b), Integer.valueOf(this.f9266c));
        }

        public String toString() {
            return k0.D("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f9264a), Long.valueOf(this.f9265b), Integer.valueOf(this.f9266c));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeLong(this.f9264a);
            parcel.writeLong(this.f9265b);
            parcel.writeInt(this.f9266c);
        }
    }

    public c(List<b> list) {
        this.f9263a = list;
        ak.a.a(!a(list));
    }

    private static boolean a(List<b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j11 = list.get(0).f9265b;
        for (int i11 = 1; i11 < list.size(); i11++) {
            if (list.get(i11).f9264a < j11) {
                return true;
            }
            j11 = list.get(i11).f9265b;
        }
        return false;
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
        return this.f9263a.equals(((c) obj).f9263a);
    }

    public int hashCode() {
        return this.f9263a.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f9263a);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + 21);
        sb2.append("SlowMotion: segments=");
        sb2.append(valueOf);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeList(this.f9263a);
    }
}