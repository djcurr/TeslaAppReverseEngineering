package ci;

import ak.k0;
import ak.r;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class i implements Parcelable {
    public static final Parcelable.Creator<i> CREATOR = new a();
    public final int A;
    public final bk.b B;
    public final int C;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int K;
    public final Class<? extends hi.m> L;
    private int O;

    /* renamed from: a  reason: collision with root package name */
    public final String f9194a;

    /* renamed from: b  reason: collision with root package name */
    public final String f9195b;

    /* renamed from: c  reason: collision with root package name */
    public final String f9196c;

    /* renamed from: d  reason: collision with root package name */
    public final int f9197d;

    /* renamed from: e  reason: collision with root package name */
    public final int f9198e;

    /* renamed from: f  reason: collision with root package name */
    public final int f9199f;

    /* renamed from: g  reason: collision with root package name */
    public final int f9200g;

    /* renamed from: h  reason: collision with root package name */
    public final int f9201h;

    /* renamed from: i  reason: collision with root package name */
    public final String f9202i;

    /* renamed from: j  reason: collision with root package name */
    public final wi.a f9203j;

    /* renamed from: k  reason: collision with root package name */
    public final String f9204k;

    /* renamed from: l  reason: collision with root package name */
    public final String f9205l;

    /* renamed from: m  reason: collision with root package name */
    public final int f9206m;

    /* renamed from: n  reason: collision with root package name */
    public final List<byte[]> f9207n;

    /* renamed from: o  reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.e f9208o;

    /* renamed from: p  reason: collision with root package name */
    public final long f9209p;

    /* renamed from: q  reason: collision with root package name */
    public final int f9210q;

    /* renamed from: t  reason: collision with root package name */
    public final int f9211t;

    /* renamed from: w  reason: collision with root package name */
    public final float f9212w;

    /* renamed from: x  reason: collision with root package name */
    public final int f9213x;

    /* renamed from: y  reason: collision with root package name */
    public final float f9214y;

    /* renamed from: z  reason: collision with root package name */
    public final byte[] f9215z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Parcelable.Creator<i> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public i createFromParcel(Parcel parcel) {
            return new i(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b */
        public i[] newArray(int i11) {
            return new i[i11];
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {
        private int A;
        private int B;
        private int C;
        private Class<? extends hi.m> D;

        /* renamed from: a  reason: collision with root package name */
        private String f9216a;

        /* renamed from: b  reason: collision with root package name */
        private String f9217b;

        /* renamed from: c  reason: collision with root package name */
        private String f9218c;

        /* renamed from: d  reason: collision with root package name */
        private int f9219d;

        /* renamed from: e  reason: collision with root package name */
        private int f9220e;

        /* renamed from: f  reason: collision with root package name */
        private int f9221f;

        /* renamed from: g  reason: collision with root package name */
        private int f9222g;

        /* renamed from: h  reason: collision with root package name */
        private String f9223h;

        /* renamed from: i  reason: collision with root package name */
        private wi.a f9224i;

        /* renamed from: j  reason: collision with root package name */
        private String f9225j;

        /* renamed from: k  reason: collision with root package name */
        private String f9226k;

        /* renamed from: l  reason: collision with root package name */
        private int f9227l;

        /* renamed from: m  reason: collision with root package name */
        private List<byte[]> f9228m;

        /* renamed from: n  reason: collision with root package name */
        private com.google.android.exoplayer2.drm.e f9229n;

        /* renamed from: o  reason: collision with root package name */
        private long f9230o;

        /* renamed from: p  reason: collision with root package name */
        private int f9231p;

        /* renamed from: q  reason: collision with root package name */
        private int f9232q;

        /* renamed from: r  reason: collision with root package name */
        private float f9233r;

        /* renamed from: s  reason: collision with root package name */
        private int f9234s;

        /* renamed from: t  reason: collision with root package name */
        private float f9235t;

        /* renamed from: u  reason: collision with root package name */
        private byte[] f9236u;

        /* renamed from: v  reason: collision with root package name */
        private int f9237v;

        /* renamed from: w  reason: collision with root package name */
        private bk.b f9238w;

        /* renamed from: x  reason: collision with root package name */
        private int f9239x;

        /* renamed from: y  reason: collision with root package name */
        private int f9240y;

        /* renamed from: z  reason: collision with root package name */
        private int f9241z;

        /* synthetic */ b(i iVar, a aVar) {
            this(iVar);
        }

        public i E() {
            return new i(this, null);
        }

        public b F(int i11) {
            this.C = i11;
            return this;
        }

        public b G(int i11) {
            this.f9221f = i11;
            return this;
        }

        public b H(int i11) {
            this.f9239x = i11;
            return this;
        }

        public b I(String str) {
            this.f9223h = str;
            return this;
        }

        public b J(bk.b bVar) {
            this.f9238w = bVar;
            return this;
        }

        public b K(String str) {
            this.f9225j = str;
            return this;
        }

        public b L(com.google.android.exoplayer2.drm.e eVar) {
            this.f9229n = eVar;
            return this;
        }

        public b M(int i11) {
            this.A = i11;
            return this;
        }

        public b N(int i11) {
            this.B = i11;
            return this;
        }

        public b O(Class<? extends hi.m> cls) {
            this.D = cls;
            return this;
        }

        public b P(float f11) {
            this.f9233r = f11;
            return this;
        }

        public b Q(int i11) {
            this.f9232q = i11;
            return this;
        }

        public b R(int i11) {
            this.f9216a = Integer.toString(i11);
            return this;
        }

        public b S(String str) {
            this.f9216a = str;
            return this;
        }

        public b T(List<byte[]> list) {
            this.f9228m = list;
            return this;
        }

        public b U(String str) {
            this.f9217b = str;
            return this;
        }

        public b V(String str) {
            this.f9218c = str;
            return this;
        }

        public b W(int i11) {
            this.f9227l = i11;
            return this;
        }

        public b X(wi.a aVar) {
            this.f9224i = aVar;
            return this;
        }

        public b Y(int i11) {
            this.f9241z = i11;
            return this;
        }

        public b Z(int i11) {
            this.f9222g = i11;
            return this;
        }

        public b a0(float f11) {
            this.f9235t = f11;
            return this;
        }

        public b b0(byte[] bArr) {
            this.f9236u = bArr;
            return this;
        }

        public b c0(int i11) {
            this.f9220e = i11;
            return this;
        }

        public b d0(int i11) {
            this.f9234s = i11;
            return this;
        }

        public b e0(String str) {
            this.f9226k = str;
            return this;
        }

        public b f0(int i11) {
            this.f9240y = i11;
            return this;
        }

        public b g0(int i11) {
            this.f9219d = i11;
            return this;
        }

        public b h0(int i11) {
            this.f9237v = i11;
            return this;
        }

        public b i0(long j11) {
            this.f9230o = j11;
            return this;
        }

        public b j0(int i11) {
            this.f9231p = i11;
            return this;
        }

        public b() {
            this.f9221f = -1;
            this.f9222g = -1;
            this.f9227l = -1;
            this.f9230o = Long.MAX_VALUE;
            this.f9231p = -1;
            this.f9232q = -1;
            this.f9233r = -1.0f;
            this.f9235t = 1.0f;
            this.f9237v = -1;
            this.f9239x = -1;
            this.f9240y = -1;
            this.f9241z = -1;
            this.C = -1;
        }

        private b(i iVar) {
            this.f9216a = iVar.f9194a;
            this.f9217b = iVar.f9195b;
            this.f9218c = iVar.f9196c;
            this.f9219d = iVar.f9197d;
            this.f9220e = iVar.f9198e;
            this.f9221f = iVar.f9199f;
            this.f9222g = iVar.f9200g;
            this.f9223h = iVar.f9202i;
            this.f9224i = iVar.f9203j;
            this.f9225j = iVar.f9204k;
            this.f9226k = iVar.f9205l;
            this.f9227l = iVar.f9206m;
            this.f9228m = iVar.f9207n;
            this.f9229n = iVar.f9208o;
            this.f9230o = iVar.f9209p;
            this.f9231p = iVar.f9210q;
            this.f9232q = iVar.f9211t;
            this.f9233r = iVar.f9212w;
            this.f9234s = iVar.f9213x;
            this.f9235t = iVar.f9214y;
            this.f9236u = iVar.f9215z;
            this.f9237v = iVar.A;
            this.f9238w = iVar.B;
            this.f9239x = iVar.C;
            this.f9240y = iVar.E;
            this.f9241z = iVar.F;
            this.A = iVar.G;
            this.B = iVar.H;
            this.C = iVar.K;
            this.D = iVar.L;
        }
    }

    /* synthetic */ i(b bVar, a aVar) {
        this(bVar);
    }

    @Deprecated
    public static i c(String str, String str2, int i11, String str3) {
        return new b().S(str).V(str3).g0(i11).e0(str2).E();
    }

    public b a() {
        return new b(this, null);
    }

    public i b(Class<? extends hi.m> cls) {
        return a().O(cls).E();
    }

    public int d() {
        int i11;
        int i12 = this.f9210q;
        if (i12 == -1 || (i11 = this.f9211t) == -1) {
            return -1;
        }
        return i12 * i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e(i iVar) {
        if (this.f9207n.size() != iVar.f9207n.size()) {
            return false;
        }
        for (int i11 = 0; i11 < this.f9207n.size(); i11++) {
            if (!Arrays.equals(this.f9207n.get(i11), iVar.f9207n.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        int i11;
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        int i12 = this.O;
        if (i12 == 0 || (i11 = iVar.O) == 0 || i12 == i11) {
            return this.f9197d == iVar.f9197d && this.f9198e == iVar.f9198e && this.f9199f == iVar.f9199f && this.f9200g == iVar.f9200g && this.f9206m == iVar.f9206m && this.f9209p == iVar.f9209p && this.f9210q == iVar.f9210q && this.f9211t == iVar.f9211t && this.f9213x == iVar.f9213x && this.A == iVar.A && this.C == iVar.C && this.E == iVar.E && this.F == iVar.F && this.G == iVar.G && this.H == iVar.H && this.K == iVar.K && Float.compare(this.f9212w, iVar.f9212w) == 0 && Float.compare(this.f9214y, iVar.f9214y) == 0 && k0.c(this.L, iVar.L) && k0.c(this.f9194a, iVar.f9194a) && k0.c(this.f9195b, iVar.f9195b) && k0.c(this.f9202i, iVar.f9202i) && k0.c(this.f9204k, iVar.f9204k) && k0.c(this.f9205l, iVar.f9205l) && k0.c(this.f9196c, iVar.f9196c) && Arrays.equals(this.f9215z, iVar.f9215z) && k0.c(this.f9203j, iVar.f9203j) && k0.c(this.B, iVar.B) && k0.c(this.f9208o, iVar.f9208o) && e(iVar);
        }
        return false;
    }

    public i f(i iVar) {
        String str;
        wi.a b11;
        if (this == iVar) {
            return this;
        }
        int l11 = r.l(this.f9205l);
        String str2 = iVar.f9194a;
        String str3 = iVar.f9195b;
        if (str3 == null) {
            str3 = this.f9195b;
        }
        String str4 = this.f9196c;
        if ((l11 == 3 || l11 == 1) && (str = iVar.f9196c) != null) {
            str4 = str;
        }
        int i11 = this.f9199f;
        if (i11 == -1) {
            i11 = iVar.f9199f;
        }
        int i12 = this.f9200g;
        if (i12 == -1) {
            i12 = iVar.f9200g;
        }
        String str5 = this.f9202i;
        if (str5 == null) {
            String K = k0.K(iVar.f9202i, l11);
            if (k0.N0(K).length == 1) {
                str5 = K;
            }
        }
        wi.a aVar = this.f9203j;
        if (aVar == null) {
            b11 = iVar.f9203j;
        } else {
            b11 = aVar.b(iVar.f9203j);
        }
        float f11 = this.f9212w;
        if (f11 == -1.0f && l11 == 2) {
            f11 = iVar.f9212w;
        }
        int i13 = this.f9197d | iVar.f9197d;
        return a().S(str2).U(str3).V(str4).g0(i13).c0(this.f9198e | iVar.f9198e).G(i11).Z(i12).I(str5).X(b11).L(com.google.android.exoplayer2.drm.e.f(iVar.f9208o, this.f9208o)).P(f11).E();
    }

    public int hashCode() {
        if (this.O == 0) {
            String str = this.f9194a;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f9195b;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f9196c;
            int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.f9197d) * 31) + this.f9198e) * 31) + this.f9199f) * 31) + this.f9200g) * 31;
            String str4 = this.f9202i;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            wi.a aVar = this.f9203j;
            int hashCode5 = (hashCode4 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            String str5 = this.f9204k;
            int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.f9205l;
            int hashCode7 = (((((((((((((((((((((((((((((hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31) + this.f9206m) * 31) + ((int) this.f9209p)) * 31) + this.f9210q) * 31) + this.f9211t) * 31) + Float.floatToIntBits(this.f9212w)) * 31) + this.f9213x) * 31) + Float.floatToIntBits(this.f9214y)) * 31) + this.A) * 31) + this.C) * 31) + this.E) * 31) + this.F) * 31) + this.G) * 31) + this.H) * 31) + this.K) * 31;
            Class<? extends hi.m> cls = this.L;
            this.O = hashCode7 + (cls != null ? cls.hashCode() : 0);
        }
        return this.O;
    }

    public String toString() {
        String str = this.f9194a;
        String str2 = this.f9195b;
        String str3 = this.f9204k;
        String str4 = this.f9205l;
        String str5 = this.f9202i;
        int i11 = this.f9201h;
        String str6 = this.f9196c;
        int i12 = this.f9210q;
        int i13 = this.f9211t;
        float f11 = this.f9212w;
        int i14 = this.C;
        int i15 = this.E;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 104 + String.valueOf(str2).length() + String.valueOf(str3).length() + String.valueOf(str4).length() + String.valueOf(str5).length() + String.valueOf(str6).length());
        sb2.append("Format(");
        sb2.append(str);
        sb2.append(", ");
        sb2.append(str2);
        sb2.append(", ");
        sb2.append(str3);
        sb2.append(", ");
        sb2.append(str4);
        sb2.append(", ");
        sb2.append(str5);
        sb2.append(", ");
        sb2.append(i11);
        sb2.append(", ");
        sb2.append(str6);
        sb2.append(", [");
        sb2.append(i12);
        sb2.append(", ");
        sb2.append(i13);
        sb2.append(", ");
        sb2.append(f11);
        sb2.append("], [");
        sb2.append(i14);
        sb2.append(", ");
        sb2.append(i15);
        sb2.append("])");
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        parcel.writeString(this.f9194a);
        parcel.writeString(this.f9195b);
        parcel.writeString(this.f9196c);
        parcel.writeInt(this.f9197d);
        parcel.writeInt(this.f9198e);
        parcel.writeInt(this.f9199f);
        parcel.writeInt(this.f9200g);
        parcel.writeString(this.f9202i);
        parcel.writeParcelable(this.f9203j, 0);
        parcel.writeString(this.f9204k);
        parcel.writeString(this.f9205l);
        parcel.writeInt(this.f9206m);
        int size = this.f9207n.size();
        parcel.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            parcel.writeByteArray(this.f9207n.get(i12));
        }
        parcel.writeParcelable(this.f9208o, 0);
        parcel.writeLong(this.f9209p);
        parcel.writeInt(this.f9210q);
        parcel.writeInt(this.f9211t);
        parcel.writeFloat(this.f9212w);
        parcel.writeInt(this.f9213x);
        parcel.writeFloat(this.f9214y);
        k0.V0(parcel, this.f9215z != null);
        byte[] bArr = this.f9215z;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.A);
        parcel.writeParcelable(this.B, i11);
        parcel.writeInt(this.C);
        parcel.writeInt(this.E);
        parcel.writeInt(this.F);
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeInt(this.K);
    }

    private i(b bVar) {
        this.f9194a = bVar.f9216a;
        this.f9195b = bVar.f9217b;
        this.f9196c = k0.y0(bVar.f9218c);
        this.f9197d = bVar.f9219d;
        this.f9198e = bVar.f9220e;
        int i11 = bVar.f9221f;
        this.f9199f = i11;
        int i12 = bVar.f9222g;
        this.f9200g = i12;
        this.f9201h = i12 != -1 ? i12 : i11;
        this.f9202i = bVar.f9223h;
        this.f9203j = bVar.f9224i;
        this.f9204k = bVar.f9225j;
        this.f9205l = bVar.f9226k;
        this.f9206m = bVar.f9227l;
        this.f9207n = bVar.f9228m == null ? Collections.emptyList() : bVar.f9228m;
        com.google.android.exoplayer2.drm.e eVar = bVar.f9229n;
        this.f9208o = eVar;
        this.f9209p = bVar.f9230o;
        this.f9210q = bVar.f9231p;
        this.f9211t = bVar.f9232q;
        this.f9212w = bVar.f9233r;
        this.f9213x = bVar.f9234s == -1 ? 0 : bVar.f9234s;
        this.f9214y = bVar.f9235t == -1.0f ? 1.0f : bVar.f9235t;
        this.f9215z = bVar.f9236u;
        this.A = bVar.f9237v;
        this.B = bVar.f9238w;
        this.C = bVar.f9239x;
        this.E = bVar.f9240y;
        this.F = bVar.f9241z;
        this.G = bVar.A == -1 ? 0 : bVar.A;
        this.H = bVar.B != -1 ? bVar.B : 0;
        this.K = bVar.C;
        if (bVar.D != null || eVar == null) {
            this.L = bVar.D;
        } else {
            this.L = hi.q.class;
        }
    }

    i(Parcel parcel) {
        this.f9194a = parcel.readString();
        this.f9195b = parcel.readString();
        this.f9196c = parcel.readString();
        this.f9197d = parcel.readInt();
        this.f9198e = parcel.readInt();
        int readInt = parcel.readInt();
        this.f9199f = readInt;
        int readInt2 = parcel.readInt();
        this.f9200g = readInt2;
        this.f9201h = readInt2 != -1 ? readInt2 : readInt;
        this.f9202i = parcel.readString();
        this.f9203j = (wi.a) parcel.readParcelable(wi.a.class.getClassLoader());
        this.f9204k = parcel.readString();
        this.f9205l = parcel.readString();
        this.f9206m = parcel.readInt();
        int readInt3 = parcel.readInt();
        this.f9207n = new ArrayList(readInt3);
        for (int i11 = 0; i11 < readInt3; i11++) {
            this.f9207n.add((byte[]) ak.a.e(parcel.createByteArray()));
        }
        com.google.android.exoplayer2.drm.e eVar = (com.google.android.exoplayer2.drm.e) parcel.readParcelable(com.google.android.exoplayer2.drm.e.class.getClassLoader());
        this.f9208o = eVar;
        this.f9209p = parcel.readLong();
        this.f9210q = parcel.readInt();
        this.f9211t = parcel.readInt();
        this.f9212w = parcel.readFloat();
        this.f9213x = parcel.readInt();
        this.f9214y = parcel.readFloat();
        this.f9215z = k0.G0(parcel) ? parcel.createByteArray() : null;
        this.A = parcel.readInt();
        this.B = (bk.b) parcel.readParcelable(bk.b.class.getClassLoader());
        this.C = parcel.readInt();
        this.E = parcel.readInt();
        this.F = parcel.readInt();
        this.G = parcel.readInt();
        this.H = parcel.readInt();
        this.K = parcel.readInt();
        this.L = eVar != null ? hi.q.class : null;
    }
}