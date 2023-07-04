package dj;

import ak.k0;
import ak.v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0458a();

    /* renamed from: a  reason: collision with root package name */
    public final long f24148a;

    /* renamed from: b  reason: collision with root package name */
    public final long f24149b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f24150c;

    /* renamed from: dj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0458a implements Parcelable.Creator<a> {
        C0458a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public a[] newArray(int i11) {
            return new a[i11];
        }
    }

    /* synthetic */ a(Parcel parcel, C0458a c0458a) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(v vVar, int i11, long j11) {
        long E = vVar.E();
        int i12 = i11 - 4;
        byte[] bArr = new byte[i12];
        vVar.j(bArr, 0, i12);
        return new a(E, bArr, j11);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f24148a);
        parcel.writeLong(this.f24149b);
        parcel.writeByteArray(this.f24150c);
    }

    private a(long j11, byte[] bArr, long j12) {
        this.f24148a = j12;
        this.f24149b = j11;
        this.f24150c = bArr;
    }

    private a(Parcel parcel) {
        this.f24148a = parcel.readLong();
        this.f24149b = parcel.readLong();
        this.f24150c = (byte[]) k0.j(parcel.createByteArray());
    }
}