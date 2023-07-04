package xj;

import ak.k0;
import android.content.Context;
import android.graphics.Point;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import ci.o;
import com.google.android.exoplayer2.RendererConfiguration;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.z0;
import com.google.common.collect.l0;
import com.google.common.collect.r;
import com.stripe.android.core.networking.RequestHeadersFactory;
import fj.u;
import fj.v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import xj.a;
import xj.g;
import xj.i;
import xj.l;

/* loaded from: classes3.dex */
public class f extends i {

    /* renamed from: f */
    private static final int[] f57481f = new int[0];

    /* renamed from: g */
    private static final l0<Integer> f57482g = l0.a(new Comparator() { // from class: xj.e
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return f.l((Integer) obj, (Integer) obj2);
        }
    });

    /* renamed from: h */
    private static final l0<Integer> f57483h = l0.a(new Comparator() { // from class: xj.d
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return f.k((Integer) obj, (Integer) obj2);
        }
    });

    /* renamed from: d */
    private final g.b f57484d;

    /* renamed from: e */
    private final AtomicReference<d> f57485e;

    /* loaded from: classes3.dex */
    public static final class b implements Comparable<b> {

        /* renamed from: a */
        public final boolean f57486a;

        /* renamed from: b */
        private final String f57487b;

        /* renamed from: c */
        private final d f57488c;

        /* renamed from: d */
        private final boolean f57489d;

        /* renamed from: e */
        private final int f57490e;

        /* renamed from: f */
        private final int f57491f;

        /* renamed from: g */
        private final int f57492g;

        /* renamed from: h */
        private final int f57493h;

        /* renamed from: i */
        private final int f57494i;

        /* renamed from: j */
        private final boolean f57495j;

        /* renamed from: k */
        private final int f57496k;

        /* renamed from: l */
        private final int f57497l;

        /* renamed from: m */
        private final int f57498m;

        /* renamed from: n */
        private final int f57499n;

        public b(ci.i iVar, d dVar, int i11) {
            int i12;
            int i13;
            int i14;
            this.f57488c = dVar;
            this.f57487b = f.D(iVar.f9196c);
            int i15 = 0;
            this.f57489d = f.x(i11, false);
            int i16 = 0;
            while (true) {
                i12 = Integer.MAX_VALUE;
                if (i16 >= dVar.f57574a.size()) {
                    i13 = 0;
                    i16 = Integer.MAX_VALUE;
                    break;
                }
                i13 = f.t(iVar, dVar.f57574a.get(i16), false);
                if (i13 > 0) {
                    break;
                }
                i16++;
            }
            this.f57491f = i16;
            this.f57490e = i13;
            this.f57492g = Integer.bitCount(iVar.f9198e & dVar.f57575b);
            boolean z11 = true;
            this.f57495j = (iVar.f9197d & 1) != 0;
            int i17 = iVar.C;
            this.f57496k = i17;
            this.f57497l = iVar.E;
            int i18 = iVar.f9201h;
            this.f57498m = i18;
            if ((i18 != -1 && i18 > dVar.B) || (i17 != -1 && i17 > dVar.A)) {
                z11 = false;
            }
            this.f57486a = z11;
            String[] g02 = k0.g0();
            int i19 = 0;
            while (true) {
                if (i19 >= g02.length) {
                    i14 = 0;
                    i19 = Integer.MAX_VALUE;
                    break;
                }
                i14 = f.t(iVar, g02[i19], false);
                if (i14 > 0) {
                    break;
                }
                i19++;
            }
            this.f57493h = i19;
            this.f57494i = i14;
            while (true) {
                if (i15 < dVar.H.size()) {
                    String str = iVar.f9205l;
                    if (str != null && str.equals(dVar.H.get(i15))) {
                        i12 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            this.f57499n = i12;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(b bVar) {
            l0 i11 = (this.f57486a && this.f57489d) ? f.f57482g : f.f57482g.i();
            com.google.common.collect.m e11 = com.google.common.collect.m.i().f(this.f57489d, bVar.f57489d).e(Integer.valueOf(this.f57491f), Integer.valueOf(bVar.f57491f), l0.c().i()).d(this.f57490e, bVar.f57490e).d(this.f57492g, bVar.f57492g).f(this.f57486a, bVar.f57486a).e(Integer.valueOf(this.f57499n), Integer.valueOf(bVar.f57499n), l0.c().i()).e(Integer.valueOf(this.f57498m), Integer.valueOf(bVar.f57498m), this.f57488c.K ? f.f57482g.i() : f.f57483h).f(this.f57495j, bVar.f57495j).e(Integer.valueOf(this.f57493h), Integer.valueOf(bVar.f57493h), l0.c().i()).d(this.f57494i, bVar.f57494i).e(Integer.valueOf(this.f57496k), Integer.valueOf(bVar.f57496k), i11).e(Integer.valueOf(this.f57497l), Integer.valueOf(bVar.f57497l), i11);
            Integer valueOf = Integer.valueOf(this.f57498m);
            Integer valueOf2 = Integer.valueOf(bVar.f57498m);
            if (!k0.c(this.f57487b, bVar.f57487b)) {
                i11 = f.f57483h;
            }
            return e11.e(valueOf, valueOf2, i11).h();
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements Comparable<c> {

        /* renamed from: a */
        private final boolean f57500a;

        /* renamed from: b */
        private final boolean f57501b;

        public c(ci.i iVar, int i11) {
            this.f57500a = (iVar.f9197d & 1) != 0;
            this.f57501b = f.x(i11, false);
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(c cVar) {
            return com.google.common.collect.m.i().f(this.f57501b, cVar.f57501b).f(this.f57500a, cVar.f57500a).h();
        }
    }

    /* loaded from: classes3.dex */
    public static final class e extends l.b {
        private boolean A;
        private r<String> B;
        private boolean C;
        private boolean D;
        private boolean E;
        private boolean F;
        private boolean G;
        private final SparseArray<Map<v, C1306f>> H;
        private final SparseBooleanArray I;

        /* renamed from: g */
        private int f57517g;

        /* renamed from: h */
        private int f57518h;

        /* renamed from: i */
        private int f57519i;

        /* renamed from: j */
        private int f57520j;

        /* renamed from: k */
        private int f57521k;

        /* renamed from: l */
        private int f57522l;

        /* renamed from: m */
        private int f57523m;

        /* renamed from: n */
        private int f57524n;

        /* renamed from: o */
        private boolean f57525o;

        /* renamed from: p */
        private boolean f57526p;

        /* renamed from: q */
        private boolean f57527q;

        /* renamed from: r */
        private int f57528r;

        /* renamed from: s */
        private int f57529s;

        /* renamed from: t */
        private boolean f57530t;

        /* renamed from: u */
        private r<String> f57531u;

        /* renamed from: v */
        private int f57532v;

        /* renamed from: w */
        private int f57533w;

        /* renamed from: x */
        private boolean f57534x;

        /* renamed from: y */
        private boolean f57535y;

        /* renamed from: z */
        private boolean f57536z;

        private static SparseArray<Map<v, C1306f>> e(SparseArray<Map<v, C1306f>> sparseArray) {
            SparseArray<Map<v, C1306f>> sparseArray2 = new SparseArray<>();
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                sparseArray2.put(sparseArray.keyAt(i11), new HashMap(sparseArray.valueAt(i11)));
            }
            return sparseArray2;
        }

        private void f() {
            this.f57517g = Integer.MAX_VALUE;
            this.f57518h = Integer.MAX_VALUE;
            this.f57519i = Integer.MAX_VALUE;
            this.f57520j = Integer.MAX_VALUE;
            this.f57525o = true;
            this.f57526p = false;
            this.f57527q = true;
            this.f57528r = Integer.MAX_VALUE;
            this.f57529s = Integer.MAX_VALUE;
            this.f57530t = true;
            this.f57531u = r.r();
            this.f57532v = Integer.MAX_VALUE;
            this.f57533w = Integer.MAX_VALUE;
            this.f57534x = true;
            this.f57535y = false;
            this.f57536z = false;
            this.A = false;
            this.B = r.r();
            this.C = false;
            this.D = false;
            this.E = true;
            this.F = false;
            this.G = true;
        }

        @Override // xj.l.b
        /* renamed from: d */
        public d a() {
            return new d(this.f57517g, this.f57518h, this.f57519i, this.f57520j, this.f57521k, this.f57522l, this.f57523m, this.f57524n, this.f57525o, this.f57526p, this.f57527q, this.f57528r, this.f57529s, this.f57530t, this.f57531u, this.f57580a, this.f57581b, this.f57532v, this.f57533w, this.f57534x, this.f57535y, this.f57536z, this.A, this.B, this.f57582c, this.f57583d, this.f57584e, this.f57585f, this.C, this.D, this.E, this.F, this.G, this.H, this.I);
        }

        public e g(int i11) {
            this.f57520j = i11;
            return this;
        }

        @Override // xj.l.b
        /* renamed from: h */
        public e b(Context context) {
            super.b(context);
            return this;
        }

        public final e i(int i11, boolean z11) {
            if (this.I.get(i11) == z11) {
                return this;
            }
            if (z11) {
                this.I.put(i11, true);
            } else {
                this.I.delete(i11);
            }
            return this;
        }

        public final e j(int i11, v vVar, C1306f c1306f) {
            Map<v, C1306f> map = this.H.get(i11);
            if (map == null) {
                map = new HashMap<>();
                this.H.put(i11, map);
            }
            if (map.containsKey(vVar) && k0.c(map.get(vVar), c1306f)) {
                return this;
            }
            map.put(vVar, c1306f);
            return this;
        }

        public e k(int i11, int i12, boolean z11) {
            this.f57528r = i11;
            this.f57529s = i12;
            this.f57530t = z11;
            return this;
        }

        public e l(Context context, boolean z11) {
            Point N = k0.N(context);
            return k(N.x, N.y, z11);
        }

        @Deprecated
        public e() {
            f();
            this.H = new SparseArray<>();
            this.I = new SparseBooleanArray();
        }

        public e(Context context) {
            super(context);
            f();
            this.H = new SparseArray<>();
            this.I = new SparseBooleanArray();
            l(context, true);
        }

        private e(d dVar) {
            super(dVar);
            this.f57517g = dVar.f57502h;
            this.f57518h = dVar.f57503i;
            this.f57519i = dVar.f57504j;
            this.f57520j = dVar.f57505k;
            this.f57521k = dVar.f57506l;
            this.f57522l = dVar.f57507m;
            this.f57523m = dVar.f57508n;
            this.f57524n = dVar.f57509o;
            this.f57525o = dVar.f57510p;
            this.f57526p = dVar.f57511q;
            this.f57527q = dVar.f57512t;
            this.f57528r = dVar.f57513w;
            this.f57529s = dVar.f57514x;
            this.f57530t = dVar.f57515y;
            this.f57531u = dVar.f57516z;
            this.f57532v = dVar.A;
            this.f57533w = dVar.B;
            this.f57534x = dVar.C;
            this.f57535y = dVar.E;
            this.f57536z = dVar.F;
            this.A = dVar.G;
            this.B = dVar.H;
            this.C = dVar.K;
            this.D = dVar.L;
            this.E = dVar.O;
            this.F = dVar.P;
            this.G = dVar.Q;
            this.H = e(dVar.R);
            this.I = dVar.T.clone();
        }
    }

    /* renamed from: xj.f$f */
    /* loaded from: classes3.dex */
    public static final class C1306f implements Parcelable {
        public static final Parcelable.Creator<C1306f> CREATOR = new a();

        /* renamed from: a */
        public final int f57537a;

        /* renamed from: b */
        public final int[] f57538b;

        /* renamed from: c */
        public final int f57539c;

        /* renamed from: d */
        public final int f57540d;

        /* renamed from: e */
        public final int f57541e;

        /* renamed from: xj.f$f$a */
        /* loaded from: classes3.dex */
        class a implements Parcelable.Creator<C1306f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C1306f createFromParcel(Parcel parcel) {
                return new C1306f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C1306f[] newArray(int i11) {
                return new C1306f[i11];
            }
        }

        public C1306f(int i11, int... iArr) {
            this(i11, iArr, 2, 0);
        }

        public boolean a(int i11) {
            for (int i12 : this.f57538b) {
                if (i12 == i11) {
                    return true;
                }
            }
            return false;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C1306f.class != obj.getClass()) {
                return false;
            }
            C1306f c1306f = (C1306f) obj;
            return this.f57537a == c1306f.f57537a && Arrays.equals(this.f57538b, c1306f.f57538b) && this.f57540d == c1306f.f57540d && this.f57541e == c1306f.f57541e;
        }

        public int hashCode() {
            return (((((this.f57537a * 31) + Arrays.hashCode(this.f57538b)) * 31) + this.f57540d) * 31) + this.f57541e;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeInt(this.f57537a);
            parcel.writeInt(this.f57538b.length);
            parcel.writeIntArray(this.f57538b);
            parcel.writeInt(this.f57540d);
            parcel.writeInt(this.f57541e);
        }

        public C1306f(int i11, int[] iArr, int i12, int i13) {
            this.f57537a = i11;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f57538b = copyOf;
            this.f57539c = iArr.length;
            this.f57540d = i12;
            this.f57541e = i13;
            Arrays.sort(copyOf);
        }

        C1306f(Parcel parcel) {
            this.f57537a = parcel.readInt();
            int readByte = parcel.readByte();
            this.f57539c = readByte;
            int[] iArr = new int[readByte];
            this.f57538b = iArr;
            parcel.readIntArray(iArr);
            this.f57540d = parcel.readInt();
            this.f57541e = parcel.readInt();
        }
    }

    /* loaded from: classes3.dex */
    public static final class g implements Comparable<g> {

        /* renamed from: a */
        public final boolean f57542a;

        /* renamed from: b */
        private final boolean f57543b;

        /* renamed from: c */
        private final boolean f57544c;

        /* renamed from: d */
        private final boolean f57545d;

        /* renamed from: e */
        private final int f57546e;

        /* renamed from: f */
        private final int f57547f;

        /* renamed from: g */
        private final int f57548g;

        /* renamed from: h */
        private final int f57549h;

        /* renamed from: i */
        private final boolean f57550i;

        public g(ci.i iVar, d dVar, int i11, String str) {
            r<String> rVar;
            int i12;
            boolean z11 = false;
            this.f57543b = f.x(i11, false);
            int i13 = iVar.f9197d & (~dVar.f57579f);
            this.f57544c = (i13 & 1) != 0;
            this.f57545d = (i13 & 2) != 0;
            int i14 = Integer.MAX_VALUE;
            if (dVar.f57576c.isEmpty()) {
                rVar = r.s("");
            } else {
                rVar = dVar.f57576c;
            }
            int i15 = 0;
            while (true) {
                if (i15 >= rVar.size()) {
                    i12 = 0;
                    break;
                }
                i12 = f.t(iVar, rVar.get(i15), dVar.f57578e);
                if (i12 > 0) {
                    i14 = i15;
                    break;
                }
                i15++;
            }
            this.f57546e = i14;
            this.f57547f = i12;
            int bitCount = Integer.bitCount(iVar.f9198e & dVar.f57577d);
            this.f57548g = bitCount;
            this.f57550i = (iVar.f9198e & 1088) != 0;
            int t11 = f.t(iVar, str, f.D(str) == null);
            this.f57549h = t11;
            if (i12 > 0 || ((dVar.f57576c.isEmpty() && bitCount > 0) || this.f57544c || (this.f57545d && t11 > 0))) {
                z11 = true;
            }
            this.f57542a = z11;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(g gVar) {
            com.google.common.collect.m d11 = com.google.common.collect.m.i().f(this.f57543b, gVar.f57543b).e(Integer.valueOf(this.f57546e), Integer.valueOf(gVar.f57546e), l0.c().i()).d(this.f57547f, gVar.f57547f).d(this.f57548g, gVar.f57548g).f(this.f57544c, gVar.f57544c).e(Boolean.valueOf(this.f57545d), Boolean.valueOf(gVar.f57545d), this.f57547f == 0 ? l0.c() : l0.c().i()).d(this.f57549h, gVar.f57549h);
            if (this.f57548g == 0) {
                d11 = d11.g(this.f57550i, gVar.f57550i);
            }
            return d11.h();
        }
    }

    /* loaded from: classes3.dex */
    public static final class h implements Comparable<h> {

        /* renamed from: a */
        public final boolean f57551a;

        /* renamed from: b */
        private final d f57552b;

        /* renamed from: c */
        private final boolean f57553c;

        /* renamed from: d */
        private final boolean f57554d;

        /* renamed from: e */
        private final int f57555e;

        /* renamed from: f */
        private final int f57556f;

        /* renamed from: g */
        private final int f57557g;

        /* JADX WARN: Code restructure failed: missing block: B:92:0x0053, code lost:
            if (r10 < r8.f57508n) goto L54;
         */
        /* JADX WARN: Code restructure failed: missing block: B:96:0x005b, code lost:
            if (r10 < r8.f57509o) goto L54;
         */
        /* JADX WARN: Removed duplicated region for block: B:102:0x007c  */
        /* JADX WARN: Removed duplicated region for block: B:110:0x0091 A[EDGE_INSN: B:110:0x0091->B:108:0x0091 ?: BREAK  , SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:91:0x004e  */
        /* JADX WARN: Removed duplicated region for block: B:95:0x0059  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public h(ci.i r7, xj.f.d r8, int r9, boolean r10) {
            /*
                r6 = this;
                r6.<init>()
                r6.f57552b = r8
                r0 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1 = 1
                r2 = 0
                r3 = -1
                if (r10 == 0) goto L33
                int r4 = r7.f9210q
                if (r4 == r3) goto L14
                int r5 = r8.f57502h
                if (r4 > r5) goto L33
            L14:
                int r4 = r7.f9211t
                if (r4 == r3) goto L1c
                int r5 = r8.f57503i
                if (r4 > r5) goto L33
            L1c:
                float r4 = r7.f9212w
                int r5 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r5 == 0) goto L29
                int r5 = r8.f57504j
                float r5 = (float) r5
                int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
                if (r4 > 0) goto L33
            L29:
                int r4 = r7.f9201h
                if (r4 == r3) goto L31
                int r5 = r8.f57505k
                if (r4 > r5) goto L33
            L31:
                r4 = r1
                goto L34
            L33:
                r4 = r2
            L34:
                r6.f57551a = r4
                if (r10 == 0) goto L5e
                int r10 = r7.f9210q
                if (r10 == r3) goto L40
                int r4 = r8.f57506l
                if (r10 < r4) goto L5e
            L40:
                int r10 = r7.f9211t
                if (r10 == r3) goto L48
                int r4 = r8.f57507m
                if (r10 < r4) goto L5e
            L48:
                float r10 = r7.f9212w
                int r0 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r0 == 0) goto L55
                int r0 = r8.f57508n
                float r0 = (float) r0
                int r10 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r10 < 0) goto L5e
            L55:
                int r10 = r7.f9201h
                if (r10 == r3) goto L5f
                int r0 = r8.f57509o
                if (r10 < r0) goto L5e
                goto L5f
            L5e:
                r1 = r2
            L5f:
                r6.f57553c = r1
                boolean r9 = xj.f.x(r9, r2)
                r6.f57554d = r9
                int r9 = r7.f9201h
                r6.f57555e = r9
                int r9 = r7.d()
                r6.f57556f = r9
                r9 = 2147483647(0x7fffffff, float:NaN)
            L74:
                com.google.common.collect.r<java.lang.String> r10 = r8.f57516z
                int r10 = r10.size()
                if (r2 >= r10) goto L91
                java.lang.String r10 = r7.f9205l
                if (r10 == 0) goto L8e
                com.google.common.collect.r<java.lang.String> r0 = r8.f57516z
                java.lang.Object r0 = r0.get(r2)
                boolean r10 = r10.equals(r0)
                if (r10 == 0) goto L8e
                r9 = r2
                goto L91
            L8e:
                int r2 = r2 + 1
                goto L74
            L91:
                r6.f57557g = r9
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xj.f.h.<init>(ci.i, xj.f$d, int, boolean):void");
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(h hVar) {
            l0 i11 = (this.f57551a && this.f57554d) ? f.f57482g : f.f57482g.i();
            return com.google.common.collect.m.i().f(this.f57554d, hVar.f57554d).f(this.f57551a, hVar.f57551a).f(this.f57553c, hVar.f57553c).e(Integer.valueOf(this.f57557g), Integer.valueOf(hVar.f57557g), l0.c().i()).e(Integer.valueOf(this.f57555e), Integer.valueOf(hVar.f57555e), this.f57552b.K ? f.f57482g.i() : f.f57483h).e(Integer.valueOf(this.f57556f), Integer.valueOf(hVar.f57556f), i11).e(Integer.valueOf(this.f57555e), Integer.valueOf(hVar.f57555e), i11).h();
        }
    }

    @Deprecated
    public f(g.b bVar) {
        this(d.Y, bVar);
    }

    public static /* synthetic */ int A(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            return num2.intValue() == -1 ? 0 : -1;
        } else if (num2.intValue() == -1) {
            return 1;
        } else {
            return num.intValue() - num2.intValue();
        }
    }

    public static /* synthetic */ int B(Integer num, Integer num2) {
        return 0;
    }

    private static void C(i.a aVar, int[][][] iArr, o[] oVarArr, xj.g[] gVarArr) {
        boolean z11;
        boolean z12 = false;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < aVar.c(); i13++) {
            int d11 = aVar.d(i13);
            xj.g gVar = gVarArr[i13];
            if ((d11 == 1 || d11 == 2) && gVar != null && E(iArr[i13], aVar.e(i13), gVar)) {
                if (d11 == 1) {
                    if (i12 != -1) {
                        z11 = false;
                        break;
                    }
                    i12 = i13;
                } else if (i11 != -1) {
                    z11 = false;
                    break;
                } else {
                    i11 = i13;
                }
            }
        }
        z11 = true;
        if (i12 != -1 && i11 != -1) {
            z12 = true;
        }
        if (z11 && z12) {
            o oVar = new o(true);
            oVarArr[i12] = oVar;
            oVarArr[i11] = oVar;
        }
    }

    protected static String D(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, RequestHeadersFactory.UNDETERMINED_LANGUAGE)) {
            return null;
        }
        return str;
    }

    private static boolean E(int[][] iArr, v vVar, xj.g gVar) {
        if (gVar == null) {
            return false;
        }
        int b11 = vVar.b(gVar.j());
        for (int i11 = 0; i11 < gVar.length(); i11++) {
            if (ci.n.i(iArr[b11][gVar.e(i11)]) != 32) {
                return false;
            }
        }
        return true;
    }

    private static g.a F(v vVar, int[][] iArr, int i11, d dVar) {
        v vVar2 = vVar;
        d dVar2 = dVar;
        int i12 = dVar2.f57512t ? 24 : 16;
        boolean z11 = dVar2.f57511q && (i11 & i12) != 0;
        int i13 = 0;
        while (i13 < vVar2.f26354a) {
            u a11 = vVar2.a(i13);
            int i14 = i13;
            int[] s11 = s(a11, iArr[i13], z11, i12, dVar2.f57502h, dVar2.f57503i, dVar2.f57504j, dVar2.f57505k, dVar2.f57506l, dVar2.f57507m, dVar2.f57508n, dVar2.f57509o, dVar2.f57513w, dVar2.f57514x, dVar2.f57515y);
            if (s11.length > 0) {
                return new g.a(a11, s11);
            }
            i13 = i14 + 1;
            vVar2 = vVar;
            dVar2 = dVar;
        }
        return null;
    }

    private static g.a I(v vVar, int[][] iArr, d dVar) {
        int i11 = -1;
        u uVar = null;
        h hVar = null;
        for (int i12 = 0; i12 < vVar.f26354a; i12++) {
            u a11 = vVar.a(i12);
            List<Integer> w11 = w(a11, dVar.f57513w, dVar.f57514x, dVar.f57515y);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < a11.f26350a; i13++) {
                ci.i a12 = a11.a(i13);
                if ((a12.f9198e & 16384) == 0 && x(iArr2[i13], dVar.O)) {
                    h hVar2 = new h(a12, dVar, iArr2[i13], w11.contains(Integer.valueOf(i13)));
                    if ((hVar2.f57551a || dVar.f57510p) && (hVar == null || hVar2.compareTo(hVar) > 0)) {
                        uVar = a11;
                        i11 = i13;
                        hVar = hVar2;
                    }
                }
            }
        }
        if (uVar == null) {
            return null;
        }
        return new g.a(uVar, i11);
    }

    public static /* synthetic */ int k(Integer num, Integer num2) {
        return B(num, num2);
    }

    public static /* synthetic */ int l(Integer num, Integer num2) {
        return A(num, num2);
    }

    private static void p(u uVar, int[] iArr, int i11, String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, List<Integer> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            int intValue = list.get(size).intValue();
            if (!z(uVar.a(intValue), str, iArr[intValue], i11, i12, i13, i14, i15, i16, i17, i18, i19)) {
                list.remove(size);
            }
        }
    }

    private static int[] q(u uVar, int[] iArr, int i11, int i12, boolean z11, boolean z12, boolean z13) {
        ci.i a11 = uVar.a(i11);
        int[] iArr2 = new int[uVar.f26350a];
        int i13 = 0;
        for (int i14 = 0; i14 < uVar.f26350a; i14++) {
            if (i14 == i11 || y(uVar.a(i14), iArr[i14], a11, i12, z11, z12, z13)) {
                iArr2[i13] = i14;
                i13++;
            }
        }
        return Arrays.copyOf(iArr2, i13);
    }

    private static int r(u uVar, int[] iArr, int i11, String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, List<Integer> list) {
        int i21 = 0;
        for (int i22 = 0; i22 < list.size(); i22++) {
            int intValue = list.get(i22).intValue();
            if (z(uVar.a(intValue), str, iArr[intValue], i11, i12, i13, i14, i15, i16, i17, i18, i19)) {
                i21++;
            }
        }
        return i21;
    }

    private static int[] s(u uVar, int[] iArr, boolean z11, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22, boolean z12) {
        String str;
        int i23;
        int i24;
        HashSet hashSet;
        if (uVar.f26350a < 2) {
            return f57481f;
        }
        List<Integer> w11 = w(uVar, i21, i22, z12);
        if (w11.size() < 2) {
            return f57481f;
        }
        if (z11) {
            str = null;
        } else {
            HashSet hashSet2 = new HashSet();
            String str2 = null;
            int i25 = 0;
            int i26 = 0;
            while (i26 < w11.size()) {
                String str3 = uVar.a(w11.get(i26).intValue()).f9205l;
                if (hashSet2.add(str3)) {
                    i23 = i25;
                    i24 = i26;
                    hashSet = hashSet2;
                    int r11 = r(uVar, iArr, i11, str3, i12, i13, i14, i15, i16, i17, i18, i19, w11);
                    if (r11 > i23) {
                        i25 = r11;
                        str2 = str3;
                        i26 = i24 + 1;
                        hashSet2 = hashSet;
                    }
                } else {
                    i23 = i25;
                    i24 = i26;
                    hashSet = hashSet2;
                }
                i25 = i23;
                i26 = i24 + 1;
                hashSet2 = hashSet;
            }
            str = str2;
        }
        p(uVar, iArr, i11, str, i12, i13, i14, i15, i16, i17, i18, i19, w11);
        return w11.size() < 2 ? f57481f : fl.d.k(w11);
    }

    protected static int t(ci.i iVar, String str, boolean z11) {
        if (TextUtils.isEmpty(str) || !str.equals(iVar.f9196c)) {
            String D = D(str);
            String D2 = D(iVar.f9196c);
            if (D2 == null || D == null) {
                return (z11 && D2 == null) ? 1 : 0;
            } else if (D2.startsWith(D) || D.startsWith(D2)) {
                return 3;
            } else {
                return k0.M0(D2, "-")[0].equals(k0.M0(D, "-")[0]) ? 2 : 0;
            }
        }
        return 4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x000d, code lost:
        if ((r6 > r7) != (r4 > r5)) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Point u(boolean r3, int r4, int r5, int r6, int r7) {
        /*
            if (r3 == 0) goto L10
            r3 = 1
            r0 = 0
            if (r6 <= r7) goto L8
            r1 = r3
            goto L9
        L8:
            r1 = r0
        L9:
            if (r4 <= r5) goto Lc
            goto Ld
        Lc:
            r3 = r0
        Ld:
            if (r1 == r3) goto L10
            goto L13
        L10:
            r2 = r5
            r5 = r4
            r4 = r2
        L13:
            int r3 = r6 * r4
            int r0 = r7 * r5
            if (r3 < r0) goto L23
            android.graphics.Point r3 = new android.graphics.Point
            int r4 = ak.k0.l(r0, r6)
            r3.<init>(r5, r4)
            return r3
        L23:
            android.graphics.Point r5 = new android.graphics.Point
            int r3 = ak.k0.l(r3, r7)
            r5.<init>(r3, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: xj.f.u(boolean, int, int, int, int):android.graphics.Point");
    }

    private static List<Integer> w(u uVar, int i11, int i12, boolean z11) {
        int i13;
        ArrayList arrayList = new ArrayList(uVar.f26350a);
        for (int i14 = 0; i14 < uVar.f26350a; i14++) {
            arrayList.add(Integer.valueOf(i14));
        }
        if (i11 != Integer.MAX_VALUE && i12 != Integer.MAX_VALUE) {
            int i15 = Integer.MAX_VALUE;
            for (int i16 = 0; i16 < uVar.f26350a; i16++) {
                ci.i a11 = uVar.a(i16);
                int i17 = a11.f9210q;
                if (i17 > 0 && (i13 = a11.f9211t) > 0) {
                    Point u11 = u(z11, i11, i12, i17, i13);
                    int i18 = a11.f9210q;
                    int i19 = a11.f9211t;
                    int i21 = i18 * i19;
                    if (i18 >= ((int) (u11.x * 0.98f)) && i19 >= ((int) (u11.y * 0.98f)) && i21 < i15) {
                        i15 = i21;
                    }
                }
            }
            if (i15 != Integer.MAX_VALUE) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    int d11 = uVar.a(((Integer) arrayList.get(size)).intValue()).d();
                    if (d11 == -1 || d11 > i15) {
                        arrayList.remove(size);
                    }
                }
            }
        }
        return arrayList;
    }

    protected static boolean x(int i11, boolean z11) {
        int z12 = ci.n.z(i11);
        return z12 == 4 || (z11 && z12 == 3);
    }

    private static boolean y(ci.i iVar, int i11, ci.i iVar2, int i12, boolean z11, boolean z12, boolean z13) {
        int i13;
        int i14;
        String str;
        int i15;
        if (!x(i11, false) || (i13 = iVar.f9201h) == -1 || i13 > i12) {
            return false;
        }
        if (z13 || ((i15 = iVar.C) != -1 && i15 == iVar2.C)) {
            if (z11 || ((str = iVar.f9205l) != null && TextUtils.equals(str, iVar2.f9205l))) {
                return z12 || ((i14 = iVar.E) != -1 && i14 == iVar2.E);
            }
            return false;
        }
        return false;
    }

    private static boolean z(ci.i iVar, String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21) {
        if ((iVar.f9198e & 16384) == 0 && x(i11, false) && (i11 & i12) != 0) {
            if (str == null || k0.c(iVar.f9205l, str)) {
                int i22 = iVar.f9210q;
                if (i22 == -1 || (i17 <= i22 && i22 <= i13)) {
                    int i23 = iVar.f9211t;
                    if (i23 == -1 || (i18 <= i23 && i23 <= i14)) {
                        float f11 = iVar.f9212w;
                        if (f11 == -1.0f || (i19 <= f11 && f11 <= i15)) {
                            int i24 = iVar.f9201h;
                            return i24 == -1 || (i21 <= i24 && i24 <= i16);
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    protected g.a[] G(i.a aVar, int[][][] iArr, int[] iArr2, d dVar) {
        int i11;
        String str;
        int i12;
        b bVar;
        String str2;
        int i13;
        int c11 = aVar.c();
        g.a[] aVarArr = new g.a[c11];
        int i14 = 0;
        boolean z11 = false;
        int i15 = 0;
        boolean z12 = false;
        while (true) {
            if (i15 >= c11) {
                break;
            }
            if (2 == aVar.d(i15)) {
                if (!z11) {
                    aVarArr[i15] = L(aVar.e(i15), iArr[i15], iArr2[i15], dVar, true);
                    z11 = aVarArr[i15] != null;
                }
                z12 |= aVar.e(i15).f26354a > 0;
            }
            i15++;
        }
        int i16 = 0;
        int i17 = -1;
        b bVar2 = null;
        String str3 = null;
        while (i16 < c11) {
            if (i11 == aVar.d(i16)) {
                int i18 = (dVar.Q || !z12) ? i11 : false;
                i12 = i17;
                bVar = bVar2;
                str2 = str3;
                i13 = i16;
                Pair<g.a, b> H = H(aVar.e(i16), iArr[i16], iArr2[i16], dVar, i18);
                if (H != null && (bVar == null || ((b) H.second).compareTo(bVar) > 0)) {
                    if (i12 != -1) {
                        aVarArr[i12] = null;
                    }
                    g.a aVar2 = (g.a) H.first;
                    aVarArr[i13] = aVar2;
                    str3 = aVar2.f57558a.a(aVar2.f57559b[0]).f9196c;
                    bVar2 = (b) H.second;
                    i17 = i13;
                    i16 = i13 + 1;
                    i11 = true;
                }
            } else {
                i12 = i17;
                bVar = bVar2;
                str2 = str3;
                i13 = i16;
            }
            i17 = i12;
            bVar2 = bVar;
            str3 = str2;
            i16 = i13 + 1;
            i11 = true;
        }
        String str4 = str3;
        int i19 = -1;
        g gVar = null;
        while (i14 < c11) {
            int d11 = aVar.d(i14);
            if (d11 != 1) {
                if (d11 != 2) {
                    if (d11 != 3) {
                        aVarArr[i14] = J(d11, aVar.e(i14), iArr[i14], dVar);
                    } else {
                        str = str4;
                        Pair<g.a, g> K = K(aVar.e(i14), iArr[i14], dVar, str);
                        if (K != null && (gVar == null || ((g) K.second).compareTo(gVar) > 0)) {
                            if (i19 != -1) {
                                aVarArr[i19] = null;
                            }
                            aVarArr[i14] = (g.a) K.first;
                            gVar = (g) K.second;
                            i19 = i14;
                        }
                    }
                }
                str = str4;
            } else {
                str = str4;
            }
            i14++;
            str4 = str;
        }
        return aVarArr;
    }

    protected Pair<g.a, b> H(v vVar, int[][] iArr, int i11, d dVar, boolean z11) {
        g.a aVar = null;
        b bVar = null;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < vVar.f26354a; i14++) {
            u a11 = vVar.a(i14);
            int[] iArr2 = iArr[i14];
            for (int i15 = 0; i15 < a11.f26350a; i15++) {
                if (x(iArr2[i15], dVar.O)) {
                    b bVar2 = new b(a11.a(i15), dVar, iArr2[i15]);
                    if ((bVar2.f57486a || dVar.C) && (bVar == null || bVar2.compareTo(bVar) > 0)) {
                        i12 = i14;
                        i13 = i15;
                        bVar = bVar2;
                    }
                }
            }
        }
        if (i12 == -1) {
            return null;
        }
        u a12 = vVar.a(i12);
        if (!dVar.L && !dVar.K && z11) {
            int[] q11 = q(a12, iArr[i12], i13, dVar.B, dVar.E, dVar.F, dVar.G);
            if (q11.length > 1) {
                aVar = new g.a(a12, q11);
            }
        }
        if (aVar == null) {
            aVar = new g.a(a12, i13);
        }
        return Pair.create(aVar, (b) ak.a.e(bVar));
    }

    protected g.a J(int i11, v vVar, int[][] iArr, d dVar) {
        u uVar = null;
        c cVar = null;
        int i12 = 0;
        for (int i13 = 0; i13 < vVar.f26354a; i13++) {
            u a11 = vVar.a(i13);
            int[] iArr2 = iArr[i13];
            for (int i14 = 0; i14 < a11.f26350a; i14++) {
                if (x(iArr2[i14], dVar.O)) {
                    c cVar2 = new c(a11.a(i14), iArr2[i14]);
                    if (cVar == null || cVar2.compareTo(cVar) > 0) {
                        uVar = a11;
                        i12 = i14;
                        cVar = cVar2;
                    }
                }
            }
        }
        if (uVar == null) {
            return null;
        }
        return new g.a(uVar, i12);
    }

    protected Pair<g.a, g> K(v vVar, int[][] iArr, d dVar, String str) {
        int i11 = -1;
        u uVar = null;
        g gVar = null;
        for (int i12 = 0; i12 < vVar.f26354a; i12++) {
            u a11 = vVar.a(i12);
            int[] iArr2 = iArr[i12];
            for (int i13 = 0; i13 < a11.f26350a; i13++) {
                if (x(iArr2[i13], dVar.O)) {
                    g gVar2 = new g(a11.a(i13), dVar, iArr2[i13], str);
                    if (gVar2.f57542a && (gVar == null || gVar2.compareTo(gVar) > 0)) {
                        uVar = a11;
                        i11 = i13;
                        gVar = gVar2;
                    }
                }
            }
        }
        if (uVar == null) {
            return null;
        }
        return Pair.create(new g.a(uVar, i11), (g) ak.a.e(gVar));
    }

    protected g.a L(v vVar, int[][] iArr, int i11, d dVar, boolean z11) {
        g.a F = (dVar.L || dVar.K || !z11) ? null : F(vVar, iArr, i11, dVar);
        return F == null ? I(vVar, iArr, dVar) : F;
    }

    public void M(d dVar) {
        ak.a.e(dVar);
        if (this.f57485e.getAndSet(dVar).equals(dVar)) {
            return;
        }
        c();
    }

    public void N(e eVar) {
        M(eVar.a());
    }

    @Override // xj.i
    protected final Pair<RendererConfiguration[], ExoTrackSelection[]> j(i.a aVar, int[][][] iArr, int[] iArr2, j.a aVar2, z0 z0Var) {
        d dVar = this.f57485e.get();
        int c11 = aVar.c();
        g.a[] G = G(aVar, iArr, iArr2, dVar);
        int i11 = 0;
        while (true) {
            if (i11 >= c11) {
                break;
            }
            if (dVar.h(i11)) {
                G[i11] = null;
            } else {
                v e11 = aVar.e(i11);
                if (dVar.j(i11, e11)) {
                    C1306f i12 = dVar.i(i11, e11);
                    G[i11] = i12 != null ? new g.a(e11.a(i12.f57537a), i12.f57538b, i12.f57540d, Integer.valueOf(i12.f57541e)) : null;
                }
            }
            i11++;
        }
        xj.g[] a11 = this.f57484d.a(G, a(), aVar2, z0Var);
        o[] oVarArr = new o[c11];
        for (int i13 = 0; i13 < c11; i13++) {
            oVarArr[i13] = !dVar.h(i13) && (aVar.d(i13) == 7 || a11[i13] != null) ? o.f9248b : null;
        }
        if (dVar.P) {
            C(aVar, iArr, oVarArr, a11);
        }
        return Pair.create(oVarArr, a11);
    }

    public e o() {
        return v().f();
    }

    public d v() {
        return this.f57485e.get();
    }

    public f(Context context) {
        this(context, new a.b());
    }

    public f(Context context, g.b bVar) {
        this(d.g(context), bVar);
    }

    public f(d dVar, g.b bVar) {
        this.f57484d = bVar;
        this.f57485e = new AtomicReference<>(dVar);
    }

    /* loaded from: classes3.dex */
    public static final class d extends l {
        public final int A;
        public final int B;
        public final boolean C;
        public final boolean E;
        public final boolean F;
        public final boolean G;
        public final r<String> H;
        public final boolean K;
        public final boolean L;
        public final boolean O;
        public final boolean P;
        public final boolean Q;
        private final SparseArray<Map<v, C1306f>> R;
        private final SparseBooleanArray T;

        /* renamed from: h */
        public final int f57502h;

        /* renamed from: i */
        public final int f57503i;

        /* renamed from: j */
        public final int f57504j;

        /* renamed from: k */
        public final int f57505k;

        /* renamed from: l */
        public final int f57506l;

        /* renamed from: m */
        public final int f57507m;

        /* renamed from: n */
        public final int f57508n;

        /* renamed from: o */
        public final int f57509o;

        /* renamed from: p */
        public final boolean f57510p;

        /* renamed from: q */
        public final boolean f57511q;

        /* renamed from: t */
        public final boolean f57512t;

        /* renamed from: w */
        public final int f57513w;

        /* renamed from: x */
        public final int f57514x;

        /* renamed from: y */
        public final boolean f57515y;

        /* renamed from: z */
        public final r<String> f57516z;
        public static final d Y = new e().a();
        public static final Parcelable.Creator<d> CREATOR = new a();

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

        d(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, boolean z12, boolean z13, int i19, int i21, boolean z14, r<String> rVar, r<String> rVar2, int i22, int i23, int i24, boolean z15, boolean z16, boolean z17, boolean z18, r<String> rVar3, r<String> rVar4, int i25, boolean z19, int i26, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, SparseArray<Map<v, C1306f>> sparseArray, SparseBooleanArray sparseBooleanArray) {
            super(rVar2, i22, rVar4, i25, z19, i26);
            this.f57502h = i11;
            this.f57503i = i12;
            this.f57504j = i13;
            this.f57505k = i14;
            this.f57506l = i15;
            this.f57507m = i16;
            this.f57508n = i17;
            this.f57509o = i18;
            this.f57510p = z11;
            this.f57511q = z12;
            this.f57512t = z13;
            this.f57513w = i19;
            this.f57514x = i21;
            this.f57515y = z14;
            this.f57516z = rVar;
            this.A = i23;
            this.B = i24;
            this.C = z15;
            this.E = z16;
            this.F = z17;
            this.G = z18;
            this.H = rVar3;
            this.K = z21;
            this.L = z22;
            this.O = z23;
            this.P = z24;
            this.Q = z25;
            this.R = sparseArray;
            this.T = sparseBooleanArray;
        }

        private static boolean c(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
            int size = sparseBooleanArray.size();
            if (sparseBooleanArray2.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i11)) < 0) {
                    return false;
                }
            }
            return true;
        }

        private static boolean d(SparseArray<Map<v, C1306f>> sparseArray, SparseArray<Map<v, C1306f>> sparseArray2) {
            int size = sparseArray.size();
            if (sparseArray2.size() != size) {
                return false;
            }
            for (int i11 = 0; i11 < size; i11++) {
                int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i11));
                if (indexOfKey < 0 || !e(sparseArray.valueAt(i11), sparseArray2.valueAt(indexOfKey))) {
                    return false;
                }
            }
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x001a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static boolean e(java.util.Map<fj.v, xj.f.C1306f> r4, java.util.Map<fj.v, xj.f.C1306f> r5) {
            /*
                int r0 = r4.size()
                int r1 = r5.size()
                r2 = 0
                if (r1 == r0) goto Lc
                return r2
            Lc:
                java.util.Set r4 = r4.entrySet()
                java.util.Iterator r4 = r4.iterator()
            L14:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L3b
                java.lang.Object r0 = r4.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getKey()
                fj.v r1 = (fj.v) r1
                boolean r3 = r5.containsKey(r1)
                if (r3 == 0) goto L3a
                java.lang.Object r0 = r0.getValue()
                java.lang.Object r1 = r5.get(r1)
                boolean r0 = ak.k0.c(r0, r1)
                if (r0 != 0) goto L14
            L3a:
                return r2
            L3b:
                r4 = 1
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: xj.f.d.e(java.util.Map, java.util.Map):boolean");
        }

        public static d g(Context context) {
            return new e(context).a();
        }

        private static SparseArray<Map<v, C1306f>> k(Parcel parcel) {
            int readInt = parcel.readInt();
            SparseArray<Map<v, C1306f>> sparseArray = new SparseArray<>(readInt);
            for (int i11 = 0; i11 < readInt; i11++) {
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                HashMap hashMap = new HashMap(readInt3);
                for (int i12 = 0; i12 < readInt3; i12++) {
                    hashMap.put((v) ak.a.e((v) parcel.readParcelable(v.class.getClassLoader())), (C1306f) parcel.readParcelable(C1306f.class.getClassLoader()));
                }
                sparseArray.put(readInt2, hashMap);
            }
            return sparseArray;
        }

        private static void l(Parcel parcel, SparseArray<Map<v, C1306f>> sparseArray) {
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i11 = 0; i11 < size; i11++) {
                int keyAt = sparseArray.keyAt(i11);
                Map<v, C1306f> valueAt = sparseArray.valueAt(i11);
                int size2 = valueAt.size();
                parcel.writeInt(keyAt);
                parcel.writeInt(size2);
                for (Map.Entry<v, C1306f> entry : valueAt.entrySet()) {
                    parcel.writeParcelable(entry.getKey(), 0);
                    parcel.writeParcelable(entry.getValue(), 0);
                }
            }
        }

        @Override // xj.l, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // xj.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return super.equals(obj) && this.f57502h == dVar.f57502h && this.f57503i == dVar.f57503i && this.f57504j == dVar.f57504j && this.f57505k == dVar.f57505k && this.f57506l == dVar.f57506l && this.f57507m == dVar.f57507m && this.f57508n == dVar.f57508n && this.f57509o == dVar.f57509o && this.f57510p == dVar.f57510p && this.f57511q == dVar.f57511q && this.f57512t == dVar.f57512t && this.f57515y == dVar.f57515y && this.f57513w == dVar.f57513w && this.f57514x == dVar.f57514x && this.f57516z.equals(dVar.f57516z) && this.A == dVar.A && this.B == dVar.B && this.C == dVar.C && this.E == dVar.E && this.F == dVar.F && this.G == dVar.G && this.H.equals(dVar.H) && this.K == dVar.K && this.L == dVar.L && this.O == dVar.O && this.P == dVar.P && this.Q == dVar.Q && c(this.T, dVar.T) && d(this.R, dVar.R);
        }

        public e f() {
            return new e(this);
        }

        public final boolean h(int i11) {
            return this.T.get(i11);
        }

        @Override // xj.l
        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.f57502h) * 31) + this.f57503i) * 31) + this.f57504j) * 31) + this.f57505k) * 31) + this.f57506l) * 31) + this.f57507m) * 31) + this.f57508n) * 31) + this.f57509o) * 31) + (this.f57510p ? 1 : 0)) * 31) + (this.f57511q ? 1 : 0)) * 31) + (this.f57512t ? 1 : 0)) * 31) + (this.f57515y ? 1 : 0)) * 31) + this.f57513w) * 31) + this.f57514x) * 31) + this.f57516z.hashCode()) * 31) + this.A) * 31) + this.B) * 31) + (this.C ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31) + this.H.hashCode()) * 31) + (this.K ? 1 : 0)) * 31) + (this.L ? 1 : 0)) * 31) + (this.O ? 1 : 0)) * 31) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0);
        }

        public final C1306f i(int i11, v vVar) {
            Map<v, C1306f> map = this.R.get(i11);
            if (map != null) {
                return map.get(vVar);
            }
            return null;
        }

        public final boolean j(int i11, v vVar) {
            Map<v, C1306f> map = this.R.get(i11);
            return map != null && map.containsKey(vVar);
        }

        @Override // xj.l, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeInt(this.f57502h);
            parcel.writeInt(this.f57503i);
            parcel.writeInt(this.f57504j);
            parcel.writeInt(this.f57505k);
            parcel.writeInt(this.f57506l);
            parcel.writeInt(this.f57507m);
            parcel.writeInt(this.f57508n);
            parcel.writeInt(this.f57509o);
            k0.V0(parcel, this.f57510p);
            k0.V0(parcel, this.f57511q);
            k0.V0(parcel, this.f57512t);
            parcel.writeInt(this.f57513w);
            parcel.writeInt(this.f57514x);
            k0.V0(parcel, this.f57515y);
            parcel.writeList(this.f57516z);
            parcel.writeInt(this.A);
            parcel.writeInt(this.B);
            k0.V0(parcel, this.C);
            k0.V0(parcel, this.E);
            k0.V0(parcel, this.F);
            k0.V0(parcel, this.G);
            parcel.writeList(this.H);
            k0.V0(parcel, this.K);
            k0.V0(parcel, this.L);
            k0.V0(parcel, this.O);
            k0.V0(parcel, this.P);
            k0.V0(parcel, this.Q);
            l(parcel, this.R);
            parcel.writeSparseBooleanArray(this.T);
        }

        d(Parcel parcel) {
            super(parcel);
            this.f57502h = parcel.readInt();
            this.f57503i = parcel.readInt();
            this.f57504j = parcel.readInt();
            this.f57505k = parcel.readInt();
            this.f57506l = parcel.readInt();
            this.f57507m = parcel.readInt();
            this.f57508n = parcel.readInt();
            this.f57509o = parcel.readInt();
            this.f57510p = k0.G0(parcel);
            this.f57511q = k0.G0(parcel);
            this.f57512t = k0.G0(parcel);
            this.f57513w = parcel.readInt();
            this.f57514x = parcel.readInt();
            this.f57515y = k0.G0(parcel);
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, null);
            this.f57516z = r.o(arrayList);
            this.A = parcel.readInt();
            this.B = parcel.readInt();
            this.C = k0.G0(parcel);
            this.E = k0.G0(parcel);
            this.F = k0.G0(parcel);
            this.G = k0.G0(parcel);
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, null);
            this.H = r.o(arrayList2);
            this.K = k0.G0(parcel);
            this.L = k0.G0(parcel);
            this.O = k0.G0(parcel);
            this.P = k0.G0(parcel);
            this.Q = k0.G0(parcel);
            this.R = k(parcel);
            this.T = (SparseBooleanArray) k0.j(parcel.readSparseBooleanArray());
        }
    }
}