package m1;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class j implements Iterable<Integer>, i00.a {

    /* renamed from: e  reason: collision with root package name */
    public static final a f38193e = new a(null);

    /* renamed from: f  reason: collision with root package name */
    private static final j f38194f = new j(0, 0, 0, null);

    /* renamed from: a  reason: collision with root package name */
    private final long f38195a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38196b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38197c;

    /* renamed from: d  reason: collision with root package name */
    private final int[] f38198d;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j a() {
            return j.f38194f;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.runtime.snapshots.SnapshotIdSet$iterator$1", f = "SnapshotIdSet.kt", l = {268, 273, 280}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    static final class b extends kotlin.coroutines.jvm.internal.k implements h00.p<u20.j<? super Integer>, zz.d<? super vz.b0>, Object> {

        /* renamed from: b  reason: collision with root package name */
        Object f38199b;

        /* renamed from: c  reason: collision with root package name */
        int f38200c;

        /* renamed from: d  reason: collision with root package name */
        int f38201d;

        /* renamed from: e  reason: collision with root package name */
        int f38202e;

        /* renamed from: f  reason: collision with root package name */
        private /* synthetic */ Object f38203f;

        b(zz.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            b bVar = new b(dVar);
            bVar.f38203f = obj;
            return bVar;
        }

        @Override // h00.p
        /* renamed from: e */
        public final Object invoke(u20.j<? super Integer> jVar, zz.d<? super vz.b0> dVar) {
            return ((b) create(jVar, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x0063  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0079 -> B:19:0x007c). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 252
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: m1.j.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    private j(long j11, long j12, int i11, int[] iArr) {
        this.f38195a = j11;
        this.f38196b = j12;
        this.f38197c = i11;
        this.f38198d = iArr;
    }

    public final j i(j bits) {
        kotlin.jvm.internal.s.g(bits, "bits");
        j jVar = f38194f;
        if (bits == jVar) {
            return this;
        }
        if (this == jVar) {
            return jVar;
        }
        int i11 = bits.f38197c;
        int i12 = this.f38197c;
        if (i11 == i12) {
            int[] iArr = bits.f38198d;
            int[] iArr2 = this.f38198d;
            if (iArr == iArr2) {
                return new j(this.f38195a & (~bits.f38195a), this.f38196b & (~bits.f38196b), i12, iArr2);
            }
        }
        Iterator<Integer> it2 = bits.iterator();
        j jVar2 = this;
        while (it2.hasNext()) {
            jVar2 = jVar2.j(it2.next().intValue());
        }
        return jVar2;
    }

    @Override // java.lang.Iterable
    public Iterator<Integer> iterator() {
        u20.h b11;
        b11 = u20.l.b(new b(null));
        return b11.iterator();
    }

    public final j j(int i11) {
        int[] iArr;
        int b11;
        int i12 = this.f38197c;
        int i13 = i11 - i12;
        if (i13 >= 0 && i13 < 64) {
            long j11 = 1 << i13;
            long j12 = this.f38196b;
            if ((j12 & j11) != 0) {
                return new j(this.f38195a, j12 & (~j11), i12, this.f38198d);
            }
        } else if (i13 >= 64 && i13 < 128) {
            long j13 = 1 << (i13 - 64);
            long j14 = this.f38195a;
            if ((j14 & j13) != 0) {
                return new j(j14 & (~j13), this.f38196b, i12, this.f38198d);
            }
        } else if (i13 < 0 && (iArr = this.f38198d) != null && (b11 = k.b(iArr, i11)) >= 0) {
            int length = iArr.length - 1;
            if (length == 0) {
                return new j(this.f38195a, this.f38196b, this.f38197c, null);
            }
            int[] iArr2 = new int[length];
            if (b11 > 0) {
                wz.o.i(iArr, iArr2, 0, 0, b11);
            }
            if (b11 < length) {
                wz.o.i(iArr, iArr2, b11, b11 + 1, length + 1);
            }
            return new j(this.f38195a, this.f38196b, this.f38197c, iArr2);
        }
        return this;
    }

    public final boolean k(int i11) {
        int[] iArr;
        int i12 = i11 - this.f38197c;
        if (i12 >= 0 && i12 < 64) {
            return ((1 << i12) & this.f38196b) != 0;
        } else if (i12 >= 64 && i12 < 128) {
            return ((1 << (i12 - 64)) & this.f38195a) != 0;
        } else if (i12 <= 0 && (iArr = this.f38198d) != null) {
            return k.b(iArr, i11) >= 0;
        } else {
            return false;
        }
    }

    public final int m(int i11) {
        int c11;
        int c12;
        int[] iArr = this.f38198d;
        if (iArr != null) {
            return iArr[0];
        }
        long j11 = this.f38196b;
        if (j11 != 0) {
            int i12 = this.f38197c;
            c12 = k.c(j11);
            return i12 + c12;
        }
        long j12 = this.f38195a;
        if (j12 != 0) {
            c11 = k.c(j12);
            return this.f38197c + 64 + c11;
        }
        return i11;
    }

    public final j n(j bits) {
        kotlin.jvm.internal.s.g(bits, "bits");
        j jVar = f38194f;
        if (bits == jVar) {
            return this;
        }
        if (this == jVar) {
            return bits;
        }
        int i11 = bits.f38197c;
        int i12 = this.f38197c;
        if (i11 == i12) {
            int[] iArr = bits.f38198d;
            int[] iArr2 = this.f38198d;
            if (iArr == iArr2) {
                return new j(this.f38195a | bits.f38195a, this.f38196b | bits.f38196b, i12, iArr2);
            }
        }
        if (this.f38198d == null) {
            Iterator<Integer> it2 = iterator();
            while (it2.hasNext()) {
                bits = bits.o(it2.next().intValue());
            }
            return bits;
        }
        Iterator<Integer> it3 = bits.iterator();
        j jVar2 = this;
        while (it3.hasNext()) {
            jVar2 = jVar2.o(it3.next().intValue());
        }
        return jVar2;
    }

    public final j o(int i11) {
        long j11;
        int i12 = this.f38197c;
        int i13 = i11 - i12;
        long j12 = 0;
        if (i13 >= 0 && i13 < 64) {
            long j13 = 1 << i13;
            long j14 = this.f38196b;
            if ((j14 & j13) == 0) {
                return new j(this.f38195a, j14 | j13, i12, this.f38198d);
            }
        } else if (i13 >= 64 && i13 < 128) {
            long j15 = 1 << (i13 - 64);
            long j16 = this.f38195a;
            if ((j16 & j15) == 0) {
                return new j(j16 | j15, this.f38196b, i12, this.f38198d);
            }
        } else if (i13 >= 128) {
            if (!k(i11)) {
                long j17 = this.f38195a;
                long j18 = this.f38196b;
                int i14 = this.f38197c;
                int i15 = ((i11 + 1) / 64) * 64;
                long j19 = j18;
                long j21 = j17;
                ArrayList arrayList = null;
                while (true) {
                    if (i14 >= i15) {
                        break;
                    }
                    if (j19 != j12) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            int[] iArr = this.f38198d;
                            if (iArr != null) {
                                int length = iArr.length;
                                int i16 = 0;
                                while (i16 < length) {
                                    int i17 = iArr[i16];
                                    i16++;
                                    arrayList.add(Integer.valueOf(i17));
                                }
                            }
                        }
                        int i18 = 0;
                        while (i18 < 64) {
                            int i19 = i18 + 1;
                            if (((1 << i18) & j19) != 0) {
                                arrayList.add(Integer.valueOf(i18 + i14));
                            }
                            i18 = i19;
                        }
                        j11 = 0;
                    } else {
                        j11 = j12;
                    }
                    if (j21 == j11) {
                        i14 = i15;
                        j19 = j11;
                        break;
                    }
                    i14 += 64;
                    j19 = j21;
                    j12 = j11;
                    j21 = j12;
                }
                int[] N0 = arrayList == null ? null : wz.e0.N0(arrayList);
                return new j(j21, j19, i14, N0 == null ? this.f38198d : N0).o(i11);
            }
        } else {
            int[] iArr2 = this.f38198d;
            if (iArr2 == null) {
                return new j(this.f38195a, this.f38196b, i12, new int[]{i11});
            }
            int b11 = k.b(iArr2, i11);
            if (b11 < 0) {
                int i21 = -(b11 + 1);
                int length2 = iArr2.length + 1;
                int[] iArr3 = new int[length2];
                wz.o.i(iArr2, iArr3, 0, 0, i21);
                wz.o.i(iArr2, iArr3, i21 + 1, i21, length2 - 1);
                iArr3[i21] = i11;
                return new j(this.f38195a, this.f38196b, this.f38197c, iArr3);
            }
        }
        return this;
    }

    public String toString() {
        int t11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        t11 = wz.x.t(this, 10);
        ArrayList arrayList = new ArrayList(t11);
        Iterator<Integer> it2 = iterator();
        while (it2.hasNext()) {
            arrayList.add(String.valueOf(it2.next().intValue()));
        }
        sb2.append(m1.b.d(arrayList, null, null, null, 0, null, null, 63, null));
        sb2.append(']');
        return sb2.toString();
    }
}