package bj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c extends i {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f7673b;

    /* renamed from: c  reason: collision with root package name */
    public final int f7674c;

    /* renamed from: d  reason: collision with root package name */
    public final int f7675d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7676e;

    /* renamed from: f  reason: collision with root package name */
    public final long f7677f;

    /* renamed from: g  reason: collision with root package name */
    private final i[] f7678g;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<c> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public c[] newArray(int i11) {
            return new c[i11];
        }
    }

    public c(String str, int i11, int i12, long j11, long j12, i[] iVarArr) {
        super("CHAP");
        this.f7673b = str;
        this.f7674c = i11;
        this.f7675d = i12;
        this.f7676e = j11;
        this.f7677f = j12;
        this.f7678g = iVarArr;
    }

    @Override // bj.i, android.os.Parcelable
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
        c cVar = (c) obj;
        return this.f7674c == cVar.f7674c && this.f7675d == cVar.f7675d && this.f7676e == cVar.f7676e && this.f7677f == cVar.f7677f && k0.c(this.f7673b, cVar.f7673b) && Arrays.equals(this.f7678g, cVar.f7678g);
    }

    public int hashCode() {
        int i11 = (((((((527 + this.f7674c) * 31) + this.f7675d) * 31) + ((int) this.f7676e)) * 31) + ((int) this.f7677f)) * 31;
        String str = this.f7673b;
        return i11 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f7673b);
        parcel.writeInt(this.f7674c);
        parcel.writeInt(this.f7675d);
        parcel.writeLong(this.f7676e);
        parcel.writeLong(this.f7677f);
        parcel.writeInt(this.f7678g.length);
        for (i iVar : this.f7678g) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    c(Parcel parcel) {
        super("CHAP");
        this.f7673b = (String) k0.j(parcel.readString());
        this.f7674c = parcel.readInt();
        this.f7675d = parcel.readInt();
        this.f7676e = parcel.readLong();
        this.f7677f = parcel.readLong();
        int readInt = parcel.readInt();
        this.f7678g = new i[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f7678g[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}