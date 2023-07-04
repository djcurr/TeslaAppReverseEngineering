package lp;

import com.google.zxing.NotFoundException;
import com.google.zxing.m;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final uo.b f37254a;

    /* renamed from: c  reason: collision with root package name */
    private final int f37256c;

    /* renamed from: d  reason: collision with root package name */
    private final int f37257d;

    /* renamed from: e  reason: collision with root package name */
    private final int f37258e;

    /* renamed from: f  reason: collision with root package name */
    private final int f37259f;

    /* renamed from: g  reason: collision with root package name */
    private final float f37260g;

    /* renamed from: i  reason: collision with root package name */
    private final m f37262i;

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f37255b = new ArrayList(5);

    /* renamed from: h  reason: collision with root package name */
    private final int[] f37261h = new int[3];

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(uo.b bVar, int i11, int i12, int i13, int i14, float f11, m mVar) {
        this.f37254a = bVar;
        this.f37256c = i11;
        this.f37257d = i12;
        this.f37258e = i13;
        this.f37259f = i14;
        this.f37260g = f11;
        this.f37262i = mVar;
    }

    private static float a(int[] iArr, int i11) {
        return (i11 - iArr[2]) - (iArr[1] / 2.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0062, code lost:
        if (r2[1] <= r12) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
        if (r10 >= r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
        if (r0.d(r11, r10) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006f, code lost:
        if (r2[2] > r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
        r2[2] = r2[2] + 1;
        r10 = r10 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x007b, code lost:
        if (r2[2] <= r12) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007d, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008e, code lost:
        if ((java.lang.Math.abs(((r2[0] + r2[1]) + r2[2]) - r13) * 5) < (r13 * 2)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0090, code lost:
        return Float.NaN;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0095, code lost:
        if (d(r2) == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x009b, code lost:
        return a(r2, r10);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private float b(int r10, int r11, int r12, int r13) {
        /*
            r9 = this;
            uo.b r0 = r9.f37254a
            int r1 = r0.g()
            int[] r2 = r9.f37261h
            r3 = 0
            r2[r3] = r3
            r4 = 1
            r2[r4] = r3
            r5 = 2
            r2[r5] = r3
            r6 = r10
        L12:
            if (r6 < 0) goto L26
            boolean r7 = r0.d(r11, r6)
            if (r7 == 0) goto L26
            r7 = r2[r4]
            if (r7 > r12) goto L26
            r7 = r2[r4]
            int r7 = r7 + r4
            r2[r4] = r7
            int r6 = r6 + (-1)
            goto L12
        L26:
            r7 = 2143289344(0x7fc00000, float:NaN)
            if (r6 < 0) goto L9c
            r8 = r2[r4]
            if (r8 <= r12) goto L30
            goto L9c
        L30:
            if (r6 < 0) goto L44
            boolean r8 = r0.d(r11, r6)
            if (r8 != 0) goto L44
            r8 = r2[r3]
            if (r8 > r12) goto L44
            r8 = r2[r3]
            int r8 = r8 + r4
            r2[r3] = r8
            int r6 = r6 + (-1)
            goto L30
        L44:
            r6 = r2[r3]
            if (r6 <= r12) goto L49
            return r7
        L49:
            int r10 = r10 + r4
        L4a:
            if (r10 >= r1) goto L5e
            boolean r6 = r0.d(r11, r10)
            if (r6 == 0) goto L5e
            r6 = r2[r4]
            if (r6 > r12) goto L5e
            r6 = r2[r4]
            int r6 = r6 + r4
            r2[r4] = r6
            int r10 = r10 + 1
            goto L4a
        L5e:
            if (r10 == r1) goto L9c
            r6 = r2[r4]
            if (r6 <= r12) goto L65
            goto L9c
        L65:
            if (r10 >= r1) goto L79
            boolean r6 = r0.d(r11, r10)
            if (r6 != 0) goto L79
            r6 = r2[r5]
            if (r6 > r12) goto L79
            r6 = r2[r5]
            int r6 = r6 + r4
            r2[r5] = r6
            int r10 = r10 + 1
            goto L65
        L79:
            r11 = r2[r5]
            if (r11 <= r12) goto L7e
            return r7
        L7e:
            r11 = r2[r3]
            r12 = r2[r4]
            int r11 = r11 + r12
            r12 = r2[r5]
            int r11 = r11 + r12
            int r11 = r11 - r13
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 * 5
            int r13 = r13 * r5
            if (r11 < r13) goto L91
            return r7
        L91:
            boolean r11 = r9.d(r2)
            if (r11 == 0) goto L9c
            float r10 = a(r2, r10)
            return r10
        L9c:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: lp.b.b(int, int, int, int):float");
    }

    private boolean d(int[] iArr) {
        float f11 = this.f37260g;
        float f12 = f11 / 2.0f;
        for (int i11 = 0; i11 < 3; i11++) {
            if (Math.abs(f11 - iArr[i11]) >= f12) {
                return false;
            }
        }
        return true;
    }

    private a e(int[] iArr, int i11, int i12) {
        int i13 = iArr[0] + iArr[1] + iArr[2];
        float a11 = a(iArr, i12);
        float b11 = b(i11, (int) a11, iArr[1] * 2, i13);
        if (Float.isNaN(b11)) {
            return null;
        }
        float f11 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        for (a aVar : this.f37255b) {
            if (aVar.f(f11, b11, a11)) {
                return aVar.g(b11, a11, f11);
            }
        }
        a aVar2 = new a(a11, b11, f11);
        this.f37255b.add(aVar2);
        m mVar = this.f37262i;
        if (mVar != null) {
            mVar.a(aVar2);
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a c() {
        a e11;
        a e12;
        int i11 = this.f37256c;
        int i12 = this.f37259f;
        int i13 = this.f37258e + i11;
        int i14 = this.f37257d + (i12 / 2);
        int[] iArr = new int[3];
        for (int i15 = 0; i15 < i12; i15++) {
            int i16 = ((i15 & 1) == 0 ? (i15 + 1) / 2 : -((i15 + 1) / 2)) + i14;
            iArr[0] = 0;
            iArr[1] = 0;
            iArr[2] = 0;
            int i17 = i11;
            while (i17 < i13 && !this.f37254a.d(i17, i16)) {
                i17++;
            }
            int i18 = 0;
            while (i17 < i13) {
                if (!this.f37254a.d(i17, i16)) {
                    if (i18 == 1) {
                        i18++;
                    }
                    iArr[i18] = iArr[i18] + 1;
                } else if (i18 == 1) {
                    iArr[1] = iArr[1] + 1;
                } else if (i18 == 2) {
                    if (d(iArr) && (e12 = e(iArr, i16, i17)) != null) {
                        return e12;
                    }
                    iArr[0] = iArr[2];
                    iArr[1] = 1;
                    iArr[2] = 0;
                    i18 = 1;
                } else {
                    i18++;
                    iArr[i18] = iArr[i18] + 1;
                }
                i17++;
            }
            if (d(iArr) && (e11 = e(iArr, i16, i13)) != null) {
                return e11;
            }
        }
        if (!this.f37255b.isEmpty()) {
            return this.f37255b.get(0);
        }
        throw NotFoundException.a();
    }
}