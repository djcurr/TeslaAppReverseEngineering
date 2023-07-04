package bj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class d extends i {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: b  reason: collision with root package name */
    public final String f7679b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7680c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f7681d;

    /* renamed from: e  reason: collision with root package name */
    public final String[] f7682e;

    /* renamed from: f  reason: collision with root package name */
    private final i[] f7683f;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d[] newArray(int i11) {
            return new d[i11];
        }
    }

    public d(String str, boolean z11, boolean z12, String[] strArr, i[] iVarArr) {
        super("CTOC");
        this.f7679b = str;
        this.f7680c = z11;
        this.f7681d = z12;
        this.f7682e = strArr;
        this.f7683f = iVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f7680c == dVar.f7680c && this.f7681d == dVar.f7681d && k0.c(this.f7679b, dVar.f7679b) && Arrays.equals(this.f7682e, dVar.f7682e) && Arrays.equals(this.f7683f, dVar.f7683f);
    }

    public int hashCode() {
        int i11 = (((527 + (this.f7680c ? 1 : 0)) * 31) + (this.f7681d ? 1 : 0)) * 31;
        String str = this.f7679b;
        return i11 + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f7679b);
        parcel.writeByte(this.f7680c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f7681d ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f7682e);
        parcel.writeInt(this.f7683f.length);
        for (i iVar : this.f7683f) {
            parcel.writeParcelable(iVar, 0);
        }
    }

    d(Parcel parcel) {
        super("CTOC");
        this.f7679b = (String) k0.j(parcel.readString());
        this.f7680c = parcel.readByte() != 0;
        this.f7681d = parcel.readByte() != 0;
        this.f7682e = (String[]) k0.j(parcel.createStringArray());
        int readInt = parcel.readInt();
        this.f7683f = new i[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            this.f7683f[i11] = (i) parcel.readParcelable(i.class.getClassLoader());
        }
    }
}