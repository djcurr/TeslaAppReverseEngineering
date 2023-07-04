package yi;

import ak.k0;
import android.os.Parcel;
import android.os.Parcelable;
import ci.i;
import java.util.Arrays;
import wi.a;

/* loaded from: classes3.dex */
public final class a implements a.b {

    /* renamed from: a  reason: collision with root package name */
    public final String f59592a;

    /* renamed from: b  reason: collision with root package name */
    public final String f59593b;

    /* renamed from: c  reason: collision with root package name */
    public final long f59594c;

    /* renamed from: d  reason: collision with root package name */
    public final long f59595d;

    /* renamed from: e  reason: collision with root package name */
    public final byte[] f59596e;

    /* renamed from: f  reason: collision with root package name */
    private int f59597f;

    /* renamed from: g  reason: collision with root package name */
    private static final i f59590g = new i.b().e0("application/id3").E();

    /* renamed from: h  reason: collision with root package name */
    private static final i f59591h = new i.b().e0("application/x-scte35").E();
    public static final Parcelable.Creator<a> CREATOR = new C1357a();

    /* renamed from: yi.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C1357a implements Parcelable.Creator<a> {
        C1357a() {
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

    public a(String str, String str2, long j11, long j12, byte[] bArr) {
        this.f59592a = str;
        this.f59593b = str2;
        this.f59594c = j11;
        this.f59595d = j12;
        this.f59596e = bArr;
    }

    @Override // wi.a.b
    public i D() {
        String str = this.f59592a;
        str.hashCode();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c11 = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        switch (c11) {
            case 0:
                return f59591h;
            case 1:
            case 2:
                return f59590g;
            default:
                return null;
        }
    }

    @Override // wi.a.b
    public byte[] D1() {
        if (D() != null) {
            return this.f59596e;
        }
        return null;
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
        a aVar = (a) obj;
        return this.f59594c == aVar.f59594c && this.f59595d == aVar.f59595d && k0.c(this.f59592a, aVar.f59592a) && k0.c(this.f59593b, aVar.f59593b) && Arrays.equals(this.f59596e, aVar.f59596e);
    }

    public int hashCode() {
        if (this.f59597f == 0) {
            String str = this.f59592a;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f59593b;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j11 = this.f59594c;
            long j12 = this.f59595d;
            this.f59597f = ((((((hashCode + hashCode2) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + Arrays.hashCode(this.f59596e);
        }
        return this.f59597f;
    }

    public String toString() {
        String str = this.f59592a;
        long j11 = this.f59595d;
        long j12 = this.f59594c;
        String str2 = this.f59593b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb2.append("EMSG: scheme=");
        sb2.append(str);
        sb2.append(", id=");
        sb2.append(j11);
        sb2.append(", durationMs=");
        sb2.append(j12);
        sb2.append(", value=");
        sb2.append(str2);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f59592a);
        parcel.writeString(this.f59593b);
        parcel.writeLong(this.f59594c);
        parcel.writeLong(this.f59595d);
        parcel.writeByteArray(this.f59596e);
    }

    a(Parcel parcel) {
        this.f59592a = (String) k0.j(parcel.readString());
        this.f59593b = (String) k0.j(parcel.readString());
        this.f59594c = parcel.readLong();
        this.f59595d = parcel.readLong();
        this.f59596e = (byte[]) k0.j(parcel.createByteArray());
    }
}