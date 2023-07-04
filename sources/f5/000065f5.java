package dj;

import ak.v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class f extends dj.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f24170a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public f[] newArray(int i11) {
            return new f[i11];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f24171a;

        /* renamed from: b  reason: collision with root package name */
        public final long f24172b;

        /* synthetic */ b(int i11, long j11, a aVar) {
            this(i11, j11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f24171a);
            parcel.writeLong(this.f24172b);
        }

        private b(int i11, long j11) {
            this.f24171a = i11;
            this.f24172b = j11;
        }
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f a(v vVar) {
        int C = vVar.C();
        ArrayList arrayList = new ArrayList(C);
        for (int i11 = 0; i11 < C; i11++) {
            arrayList.add(c.e(vVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int size = this.f24170a.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            this.f24170a.get(i12).f(parcel);
        }
    }

    private f(List<c> list) {
        this.f24170a = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(c.d(parcel));
        }
        this.f24170a = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes3.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final long f24173a;

        /* renamed from: b  reason: collision with root package name */
        public final boolean f24174b;

        /* renamed from: c  reason: collision with root package name */
        public final boolean f24175c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f24176d;

        /* renamed from: e  reason: collision with root package name */
        public final long f24177e;

        /* renamed from: f  reason: collision with root package name */
        public final List<b> f24178f;

        /* renamed from: g  reason: collision with root package name */
        public final boolean f24179g;

        /* renamed from: h  reason: collision with root package name */
        public final long f24180h;

        /* renamed from: i  reason: collision with root package name */
        public final int f24181i;

        /* renamed from: j  reason: collision with root package name */
        public final int f24182j;

        /* renamed from: k  reason: collision with root package name */
        public final int f24183k;

        private c(long j11, boolean z11, boolean z12, boolean z13, List<b> list, long j12, boolean z14, long j13, int i11, int i12, int i13) {
            this.f24173a = j11;
            this.f24174b = z11;
            this.f24175c = z12;
            this.f24176d = z13;
            this.f24178f = Collections.unmodifiableList(list);
            this.f24177e = j12;
            this.f24179g = z14;
            this.f24180h = j13;
            this.f24181i = i11;
            this.f24182j = i12;
            this.f24183k = i13;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(v vVar) {
            ArrayList arrayList;
            boolean z11;
            long j11;
            boolean z12;
            long j12;
            int i11;
            int i12;
            int i13;
            boolean z13;
            boolean z14;
            long j13;
            long E = vVar.E();
            boolean z15 = (vVar.C() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z15) {
                arrayList = arrayList2;
                z11 = false;
                j11 = -9223372036854775807L;
                z12 = false;
                j12 = -9223372036854775807L;
                i11 = 0;
                i12 = 0;
                i13 = 0;
                z13 = false;
            } else {
                int C = vVar.C();
                boolean z16 = (C & 128) != 0;
                boolean z17 = (C & 64) != 0;
                boolean z18 = (C & 32) != 0;
                long E2 = z17 ? vVar.E() : -9223372036854775807L;
                if (!z17) {
                    int C2 = vVar.C();
                    ArrayList arrayList3 = new ArrayList(C2);
                    for (int i14 = 0; i14 < C2; i14++) {
                        arrayList3.add(new b(vVar.C(), vVar.E(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z18) {
                    long C3 = vVar.C();
                    boolean z19 = (128 & C3) != 0;
                    j13 = ((((C3 & 1) << 32) | vVar.E()) * 1000) / 90;
                    z14 = z19;
                } else {
                    z14 = false;
                    j13 = -9223372036854775807L;
                }
                int I = vVar.I();
                int C4 = vVar.C();
                z13 = z17;
                i13 = vVar.C();
                j12 = j13;
                arrayList = arrayList2;
                long j14 = E2;
                i11 = I;
                i12 = C4;
                j11 = j14;
                boolean z21 = z16;
                z12 = z14;
                z11 = z21;
            }
            return new c(E, z15, z11, z13, arrayList, j11, z12, j12, i11, i12, i13);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f24173a);
            parcel.writeByte(this.f24174b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f24175c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f24176d ? (byte) 1 : (byte) 0);
            int size = this.f24178f.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                this.f24178f.get(i11).d(parcel);
            }
            parcel.writeLong(this.f24177e);
            parcel.writeByte(this.f24179g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f24180h);
            parcel.writeInt(this.f24181i);
            parcel.writeInt(this.f24182j);
            parcel.writeInt(this.f24183k);
        }

        private c(Parcel parcel) {
            this.f24173a = parcel.readLong();
            this.f24174b = parcel.readByte() == 1;
            this.f24175c = parcel.readByte() == 1;
            this.f24176d = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i11 = 0; i11 < readInt; i11++) {
                arrayList.add(b.c(parcel));
            }
            this.f24178f = Collections.unmodifiableList(arrayList);
            this.f24177e = parcel.readLong();
            this.f24179g = parcel.readByte() == 1;
            this.f24180h = parcel.readLong();
            this.f24181i = parcel.readInt();
            this.f24182j = parcel.readInt();
            this.f24183k = parcel.readInt();
        }
    }
}