package dj;

import ak.g0;
import ak.v;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f24184a;

    /* renamed from: b  reason: collision with root package name */
    public final long f24185b;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public g[] newArray(int i11) {
            return new g[i11];
        }
    }

    /* synthetic */ g(long j11, long j12, a aVar) {
        this(j11, j12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g a(v vVar, long j11, g0 g0Var) {
        long b11 = b(vVar, j11);
        return new g(b11, g0Var.b(b11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long b(v vVar, long j11) {
        long C = vVar.C();
        if ((128 & C) != 0) {
            return 8589934591L & ((((C & 1) << 32) | vVar.E()) + j11);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f24184a);
        parcel.writeLong(this.f24185b);
    }

    private g(long j11, long j12) {
        this.f24184a = j11;
        this.f24185b = j12;
    }
}