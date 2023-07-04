package aj;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import wi.a;

/* loaded from: classes3.dex */
public final class c implements a.b {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f424a;

    /* renamed from: b  reason: collision with root package name */
    public final String f425b;

    /* renamed from: c  reason: collision with root package name */
    public final String f426c;

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

    public c(byte[] bArr, String str, String str2) {
        this.f424a = bArr;
        this.f425b = str;
        this.f426c = str2;
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
        return Arrays.equals(this.f424a, ((c) obj).f424a);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f424a);
    }

    public String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.f425b, this.f426c, Integer.valueOf(this.f424a.length));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeByteArray(this.f424a);
        parcel.writeString(this.f425b);
        parcel.writeString(this.f426c);
    }

    c(Parcel parcel) {
        this.f424a = (byte[]) ak.a.e(parcel.createByteArray());
        this.f425b = parcel.readString();
        this.f426c = parcel.readString();
    }
}