package dj;

import ak.g0;
import ak.v;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class d extends dj.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    public final long f24154a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f24155b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f24156c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f24157d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f24158e;

    /* renamed from: f  reason: collision with root package name */
    public final long f24159f;

    /* renamed from: g  reason: collision with root package name */
    public final long f24160g;

    /* renamed from: h  reason: collision with root package name */
    public final List<b> f24161h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f24162i;

    /* renamed from: j  reason: collision with root package name */
    public final long f24163j;

    /* renamed from: k  reason: collision with root package name */
    public final int f24164k;

    /* renamed from: l  reason: collision with root package name */
    public final int f24165l;

    /* renamed from: m  reason: collision with root package name */
    public final int f24166m;

    /* loaded from: classes3.dex */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public d[] newArray(int i11) {
            return new d[i11];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final int f24167a;

        /* renamed from: b  reason: collision with root package name */
        public final long f24168b;

        /* renamed from: c  reason: collision with root package name */
        public final long f24169c;

        /* synthetic */ b(int i11, long j11, long j12, a aVar) {
            this(i11, j11, j12);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f24167a);
            parcel.writeLong(this.f24168b);
            parcel.writeLong(this.f24169c);
        }

        private b(int i11, long j11, long j12) {
            this.f24167a = i11;
            this.f24168b = j11;
            this.f24169c = j12;
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static d a(v vVar, long j11, g0 g0Var) {
        List list;
        boolean z11;
        boolean z12;
        long j12;
        boolean z13;
        long j13;
        int i11;
        int i12;
        int i13;
        boolean z14;
        boolean z15;
        long j14;
        long E = vVar.E();
        boolean z16 = (vVar.C() & 128) != 0;
        List emptyList = Collections.emptyList();
        if (z16) {
            list = emptyList;
            z11 = false;
            z12 = false;
            j12 = -9223372036854775807L;
            z13 = false;
            j13 = -9223372036854775807L;
            i11 = 0;
            i12 = 0;
            i13 = 0;
            z14 = false;
        } else {
            int C = vVar.C();
            boolean z17 = (C & 128) != 0;
            boolean z18 = (C & 64) != 0;
            boolean z19 = (C & 32) != 0;
            boolean z21 = (C & 16) != 0;
            long b11 = (!z18 || z21) ? -9223372036854775807L : g.b(vVar, j11);
            if (!z18) {
                int C2 = vVar.C();
                ArrayList arrayList = new ArrayList(C2);
                for (int i14 = 0; i14 < C2; i14++) {
                    int C3 = vVar.C();
                    long b12 = !z21 ? g.b(vVar, j11) : -9223372036854775807L;
                    arrayList.add(new b(C3, b12, g0Var.b(b12), null));
                }
                emptyList = arrayList;
            }
            if (z19) {
                long C4 = vVar.C();
                boolean z22 = (128 & C4) != 0;
                j14 = ((((C4 & 1) << 32) | vVar.E()) * 1000) / 90;
                z15 = z22;
            } else {
                z15 = false;
                j14 = -9223372036854775807L;
            }
            i11 = vVar.I();
            z14 = z18;
            i12 = vVar.C();
            i13 = vVar.C();
            list = emptyList;
            long j15 = b11;
            z13 = z15;
            j13 = j14;
            z12 = z21;
            z11 = z17;
            j12 = j15;
        }
        return new d(E, z16, z11, z14, z12, j12, g0Var.b(j12), list, z13, j13, i11, i12, i13);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeLong(this.f24154a);
        parcel.writeByte(this.f24155b ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24156c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24157d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f24158e ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f24159f);
        parcel.writeLong(this.f24160g);
        int size = this.f24161h.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            this.f24161h.get(i12).b(parcel);
        }
        parcel.writeByte(this.f24162i ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f24163j);
        parcel.writeInt(this.f24164k);
        parcel.writeInt(this.f24165l);
        parcel.writeInt(this.f24166m);
    }

    private d(long j11, boolean z11, boolean z12, boolean z13, boolean z14, long j12, long j13, List<b> list, boolean z15, long j14, int i11, int i12, int i13) {
        this.f24154a = j11;
        this.f24155b = z11;
        this.f24156c = z12;
        this.f24157d = z13;
        this.f24158e = z14;
        this.f24159f = j12;
        this.f24160g = j13;
        this.f24161h = Collections.unmodifiableList(list);
        this.f24162i = z15;
        this.f24163j = j14;
        this.f24164k = i11;
        this.f24165l = i12;
        this.f24166m = i13;
    }

    private d(Parcel parcel) {
        this.f24154a = parcel.readLong();
        this.f24155b = parcel.readByte() == 1;
        this.f24156c = parcel.readByte() == 1;
        this.f24157d = parcel.readByte() == 1;
        this.f24158e = parcel.readByte() == 1;
        this.f24159f = parcel.readLong();
        this.f24160g = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(b.a(parcel));
        }
        this.f24161h = Collections.unmodifiableList(arrayList);
        this.f24162i = parcel.readByte() == 1;
        this.f24163j = parcel.readLong();
        this.f24164k = parcel.readInt();
        this.f24165l = parcel.readInt();
        this.f24166m = parcel.readInt();
    }
}