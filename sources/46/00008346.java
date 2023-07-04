package lp;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.zxing.NotFoundException;
import com.google.zxing.l;
import com.google.zxing.m;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    private final uo.b f37267a;

    /* renamed from: c  reason: collision with root package name */
    private boolean f37269c;

    /* renamed from: e  reason: collision with root package name */
    private final m f37271e;

    /* renamed from: b  reason: collision with root package name */
    private final List<d> f37268b = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    private final int[] f37270d = new int[5];

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class b implements Serializable, Comparator<d> {

        /* renamed from: a  reason: collision with root package name */
        private final float f37272a;

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            int compare = Integer.compare(dVar2.h(), dVar.h());
            return compare == 0 ? Float.compare(Math.abs(dVar.i() - this.f37272a), Math.abs(dVar2.i() - this.f37272a)) : compare;
        }

        private b(float f11) {
            this.f37272a = f11;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static final class c implements Serializable, Comparator<d> {

        /* renamed from: a  reason: collision with root package name */
        private final float f37273a;

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(d dVar, d dVar2) {
            return Float.compare(Math.abs(dVar2.i() - this.f37273a), Math.abs(dVar.i() - this.f37273a));
        }

        private c(float f11) {
            this.f37273a = f11;
        }
    }

    public e(uo.b bVar, m mVar) {
        this.f37267a = bVar;
        this.f37271e = mVar;
    }

    private static float a(int[] iArr, int i11) {
        return ((i11 - iArr[4]) - iArr[3]) - (iArr[2] / 2.0f);
    }

    private boolean c(int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int[] j11 = j();
        int i16 = 0;
        while (i11 >= i16 && i12 >= i16 && this.f37267a.d(i12 - i16, i11 - i16)) {
            j11[2] = j11[2] + 1;
            i16++;
        }
        if (j11[2] == 0) {
            return false;
        }
        while (i11 >= i16 && i12 >= i16 && !this.f37267a.d(i12 - i16, i11 - i16)) {
            j11[1] = j11[1] + 1;
            i16++;
        }
        if (j11[1] == 0) {
            return false;
        }
        while (i11 >= i16 && i12 >= i16 && this.f37267a.d(i12 - i16, i11 - i16)) {
            j11[0] = j11[0] + 1;
            i16++;
        }
        if (j11[0] == 0) {
            return false;
        }
        int g11 = this.f37267a.g();
        int j12 = this.f37267a.j();
        int i17 = 1;
        while (true) {
            int i18 = i11 + i17;
            if (i18 >= g11 || (i15 = i12 + i17) >= j12 || !this.f37267a.d(i15, i18)) {
                break;
            }
            j11[2] = j11[2] + 1;
            i17++;
        }
        while (true) {
            int i19 = i11 + i17;
            if (i19 >= g11 || (i14 = i12 + i17) >= j12 || this.f37267a.d(i14, i19)) {
                break;
            }
            j11[3] = j11[3] + 1;
            i17++;
        }
        if (j11[3] == 0) {
            return false;
        }
        while (true) {
            int i21 = i11 + i17;
            if (i21 >= g11 || (i13 = i12 + i17) >= j12 || !this.f37267a.d(i13, i21)) {
                break;
            }
            j11[4] = j11[4] + 1;
            i17++;
        }
        if (j11[4] == 0) {
            return false;
        }
        return i(j11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r2[1] <= r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r3 < 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r0.d(r3, r12) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r2[0] > r13) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        r2[0] = r2[0] + 1;
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r2[0] <= r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
        if (r11 >= r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
        if (r0.d(r11, r12) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        r2[2] = r2[2] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
        if (r11 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
        if (r11 >= r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        if (r0.d(r11, r12) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
        if (r2[3] >= r13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
        r2[3] = r2[3] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
        if (r11 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        if (r0.d(r11, r12) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        if (r2[4] >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        r2[4] = r2[4] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
        if (r2[4] < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a1, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b7, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r2[4]) - r14) * 5) < r14) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b9, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00be, code lost:
        if (h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c4, code lost:
        return a(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float d(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.e.d(int, int, int, int):float");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
        if (r2[1] <= r13) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
        if (r3 < 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
        if (r0.d(r12, r3) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0049, code lost:
        if (r2[0] > r13) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        r2[0] = r2[0] + 1;
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        if (r2[0] <= r13) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0057, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0058, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0059, code lost:
        if (r11 >= r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x005f, code lost:
        if (r0.d(r12, r11) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0061, code lost:
        r2[2] = r2[2] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0069, code lost:
        if (r11 != r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006b, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
        if (r11 >= r1) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0073, code lost:
        if (r0.d(r12, r11) != false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0077, code lost:
        if (r2[3] >= r13) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0079, code lost:
        r2[3] = r2[3] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0081, code lost:
        if (r11 == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
        if (r2[3] < r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
        if (r11 >= r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008f, code lost:
        if (r0.d(r12, r11) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0093, code lost:
        if (r2[4] >= r13) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0095, code lost:
        r2[4] = r2[4] + 1;
        r11 = r11 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x009f, code lost:
        if (r2[4] < r13) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00a1, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b8, code lost:
        if ((java.lang.Math.abs(((((r2[0] + r2[1]) + r2[2]) + r2[3]) + r2[4]) - r14) * 5) < (r14 * 2)) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ba, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00bf, code lost:
        if (h(r2) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00c5, code lost:
        return a(r2, r11);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float e(int r11, int r12, int r13, int r14) {
        /*
            Method dump skipped, instructions count: 199
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.e.e(int, int, int, int):float");
    }

    private int g() {
        if (this.f37268b.size() <= 1) {
            return 0;
        }
        d dVar = null;
        for (d dVar2 : this.f37268b) {
            if (dVar2.h() >= 2) {
                if (dVar != null) {
                    this.f37269c = true;
                    return ((int) (Math.abs(dVar.c() - dVar2.c()) - Math.abs(dVar.d() - dVar2.d()))) / 2;
                }
                dVar = dVar2;
            }
        }
        return 0;
    }

    protected static boolean h(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 5; i12++) {
            int i13 = iArr[i12];
            if (i13 == 0) {
                return false;
            }
            i11 += i13;
        }
        if (i11 < 7) {
            return false;
        }
        float f11 = i11 / 7.0f;
        float f12 = f11 / 2.0f;
        return Math.abs(f11 - ((float) iArr[0])) < f12 && Math.abs(f11 - ((float) iArr[1])) < f12 && Math.abs((f11 * 3.0f) - ((float) iArr[2])) < 3.0f * f12 && Math.abs(f11 - ((float) iArr[3])) < f12 && Math.abs(f11 - ((float) iArr[4])) < f12;
    }

    protected static boolean i(int[] iArr) {
        int i11 = 0;
        for (int i12 = 0; i12 < 5; i12++) {
            int i13 = iArr[i12];
            if (i13 == 0) {
                return false;
            }
            i11 += i13;
        }
        if (i11 < 7) {
            return false;
        }
        float f11 = i11 / 7.0f;
        float f12 = f11 / 1.333f;
        return Math.abs(f11 - ((float) iArr[0])) < f12 && Math.abs(f11 - ((float) iArr[1])) < f12 && Math.abs((f11 * 3.0f) - ((float) iArr[2])) < 3.0f * f12 && Math.abs(f11 - ((float) iArr[3])) < f12 && Math.abs(f11 - ((float) iArr[4])) < f12;
    }

    private int[] j() {
        b(this.f37270d);
        return this.f37270d;
    }

    private boolean l() {
        int size = this.f37268b.size();
        float f11 = BitmapDescriptorFactory.HUE_RED;
        float f12 = 0.0f;
        int i11 = 0;
        for (d dVar : this.f37268b) {
            if (dVar.h() >= 2) {
                i11++;
                f12 += dVar.i();
            }
        }
        if (i11 < 3) {
            return false;
        }
        float f13 = f12 / size;
        for (d dVar2 : this.f37268b) {
            f11 += Math.abs(dVar2.i() - f13);
        }
        return f11 <= f12 * 0.05f;
    }

    private d[] m() {
        float f11;
        int size = this.f37268b.size();
        if (size >= 3) {
            float f12 = BitmapDescriptorFactory.HUE_RED;
            if (size > 3) {
                float f13 = 0.0f;
                float f14 = 0.0f;
                for (d dVar : this.f37268b) {
                    float i11 = dVar.i();
                    f13 += i11;
                    f14 += i11 * i11;
                }
                float f15 = f13 / size;
                float sqrt = (float) Math.sqrt((f14 / f11) - (f15 * f15));
                Collections.sort(this.f37268b, new c(f15));
                float max = Math.max(0.2f * f15, sqrt);
                int i12 = 0;
                while (i12 < this.f37268b.size() && this.f37268b.size() > 3) {
                    if (Math.abs(this.f37268b.get(i12).i() - f15) > max) {
                        this.f37268b.remove(i12);
                        i12--;
                    }
                    i12++;
                }
            }
            if (this.f37268b.size() > 3) {
                for (d dVar2 : this.f37268b) {
                    f12 += dVar2.i();
                }
                Collections.sort(this.f37268b, new b(f12 / this.f37268b.size()));
                List<d> list = this.f37268b;
                list.subList(3, list.size()).clear();
            }
            return new d[]{this.f37268b.get(0), this.f37268b.get(1), this.f37268b.get(2)};
        }
        throw NotFoundException.a();
    }

    protected final void b(int[] iArr) {
        for (int i11 = 0; i11 < iArr.length; i11++) {
            iArr[i11] = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final f f(Map<com.google.zxing.d, ?> map) {
        boolean z11 = map != null && map.containsKey(com.google.zxing.d.TRY_HARDER);
        int g11 = this.f37267a.g();
        int j11 = this.f37267a.j();
        int i11 = (g11 * 3) / 388;
        if (i11 < 3 || z11) {
            i11 = 3;
        }
        int[] iArr = new int[5];
        int i12 = i11 - 1;
        boolean z12 = false;
        while (i12 < g11 && !z12) {
            b(iArr);
            int i13 = 0;
            int i14 = 0;
            while (i13 < j11) {
                if (this.f37267a.d(i13, i12)) {
                    if ((i14 & 1) == 1) {
                        i14++;
                    }
                    iArr[i14] = iArr[i14] + 1;
                } else if ((i14 & 1) != 0) {
                    iArr[i14] = iArr[i14] + 1;
                } else if (i14 == 4) {
                    if (h(iArr)) {
                        if (k(iArr, i12, i13)) {
                            if (this.f37269c) {
                                z12 = l();
                            } else {
                                int g12 = g();
                                if (g12 > iArr[2]) {
                                    i12 += (g12 - iArr[2]) - 2;
                                    i13 = j11 - 1;
                                }
                            }
                            b(iArr);
                            i14 = 0;
                            i11 = 2;
                        } else {
                            n(iArr);
                        }
                    } else {
                        n(iArr);
                    }
                    i14 = 3;
                } else {
                    i14++;
                    iArr[i14] = iArr[i14] + 1;
                }
                i13++;
            }
            if (h(iArr) && k(iArr, i12, j11)) {
                i11 = iArr[0];
                if (this.f37269c) {
                    z12 = l();
                }
            }
            i12 += i11;
        }
        d[] m11 = m();
        l.e(m11);
        return new f(m11);
    }

    protected final boolean k(int[] iArr, int i11, int i12) {
        boolean z11 = false;
        int i13 = iArr[0] + iArr[1] + iArr[2] + iArr[3] + iArr[4];
        int a11 = (int) a(iArr, i12);
        float e11 = e(i11, a11, iArr[2], i13);
        if (!Float.isNaN(e11)) {
            int i14 = (int) e11;
            float d11 = d(a11, i14, iArr[2], i13);
            if (!Float.isNaN(d11) && c(i14, (int) d11)) {
                float f11 = i13 / 7.0f;
                int i15 = 0;
                while (true) {
                    if (i15 >= this.f37268b.size()) {
                        break;
                    }
                    d dVar = this.f37268b.get(i15);
                    if (dVar.f(f11, e11, d11)) {
                        this.f37268b.set(i15, dVar.g(e11, d11, f11));
                        z11 = true;
                        break;
                    }
                    i15++;
                }
                if (!z11) {
                    d dVar2 = new d(d11, e11, f11);
                    this.f37268b.add(dVar2);
                    m mVar = this.f37271e;
                    if (mVar != null) {
                        mVar.a(dVar2);
                    }
                }
                return true;
            }
        }
        return false;
    }

    protected final void n(int[] iArr) {
        iArr[0] = iArr[2];
        iArr[1] = iArr[3];
        iArr[2] = iArr[4];
        iArr[3] = 1;
        iArr[4] = 0;
    }
}