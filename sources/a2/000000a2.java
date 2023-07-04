package aj;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import wi.a;

/* loaded from: classes3.dex */
public final class b implements a.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final int f418a;

    /* renamed from: b  reason: collision with root package name */
    public final String f419b;

    /* renamed from: c  reason: collision with root package name */
    public final String f420c;

    /* renamed from: d  reason: collision with root package name */
    public final String f421d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f422e;

    /* renamed from: f  reason: collision with root package name */
    public final int f423f;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public b[] newArray(int i11) {
            return new b[i11];
        }
    }

    public b(int i11, String str, String str2, String str3, boolean z11, int i12) {
        ak.a.a(i12 == -1 || i12 > 0);
        this.f418a = i11;
        this.f419b = str;
        this.f420c = str2;
        this.f421d = str3;
        this.f422e = z11;
        this.f423f = i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static aj.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.b.a(java.util.Map):aj.b");
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
        return this.f418a == bVar.f418a && k0.c(this.f419b, bVar.f419b) && k0.c(this.f420c, bVar.f420c) && k0.c(this.f421d, bVar.f421d) && this.f422e == bVar.f422e && this.f423f == bVar.f423f;
    }

    public int hashCode() {
        int i11 = (527 + this.f418a) * 31;
        String str = this.f419b;
        int hashCode = (i11 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f420c;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f421d;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f422e ? 1 : 0)) * 31) + this.f423f;
    }

    public String toString() {
        String str = this.f420c;
        String str2 = this.f419b;
        int i11 = this.f418a;
        int i12 = this.f423f;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 80 + String.valueOf(str2).length());
        sb2.append("IcyHeaders: name=\"");
        sb2.append(str);
        sb2.append("\", genre=\"");
        sb2.append(str2);
        sb2.append("\", bitrate=");
        sb2.append(i11);
        sb2.append(", metadataInterval=");
        sb2.append(i12);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeInt(this.f418a);
        parcel.writeString(this.f419b);
        parcel.writeString(this.f420c);
        parcel.writeString(this.f421d);
        k0.V0(parcel, this.f422e);
        parcel.writeInt(this.f423f);
    }

    b(Parcel parcel) {
        this.f418a = parcel.readInt();
        this.f419b = parcel.readString();
        this.f420c = parcel.readString();
        this.f421d = parcel.readString();
        this.f422e = k0.G0(parcel);
        this.f423f = parcel.readInt();
    }
}