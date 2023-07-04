package dp;

import com.google.zxing.NotFoundException;
import cp.k;

/* loaded from: classes2.dex */
public abstract class a extends k {

    /* renamed from: b  reason: collision with root package name */
    private final int[] f24213b;

    /* renamed from: e  reason: collision with root package name */
    private final int[] f24216e;

    /* renamed from: f  reason: collision with root package name */
    private final int[] f24217f;

    /* renamed from: a  reason: collision with root package name */
    private final int[] f24212a = new int[4];

    /* renamed from: c  reason: collision with root package name */
    private final float[] f24214c = new float[4];

    /* renamed from: d  reason: collision with root package name */
    private final float[] f24215d = new float[4];

    /* JADX INFO: Access modifiers changed from: protected */
    public a() {
        int[] iArr = new int[8];
        this.f24213b = iArr;
        this.f24216e = new int[iArr.length / 2];
        this.f24217f = new int[iArr.length / 2];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void g(int[] iArr, float[] fArr) {
        int i11 = 0;
        float f11 = fArr[0];
        for (int i12 = 1; i12 < iArr.length; i12++) {
            if (fArr[i12] < f11) {
                f11 = fArr[i12];
                i11 = i12;
            }
        }
        iArr[i11] = iArr[i11] - 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static void n(int[] iArr, float[] fArr) {
        int i11 = 0;
        float f11 = fArr[0];
        for (int i12 = 1; i12 < iArr.length; i12++) {
            if (fArr[i12] > f11) {
                f11 = fArr[i12];
                i11 = i12;
            }
        }
        iArr[i11] = iArr[i11] + 1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean o(int[] iArr) {
        int i11;
        float f11 = (iArr[0] + iArr[1]) / ((iArr[2] + i11) + iArr[3]);
        if (f11 >= 0.7916667f && f11 <= 0.89285713f) {
            int i12 = Integer.MAX_VALUE;
            int i13 = Integer.MIN_VALUE;
            for (int i14 : iArr) {
                if (i14 > i13) {
                    i13 = i14;
                }
                if (i14 < i12) {
                    i12 = i14;
                }
            }
            if (i13 < i12 * 10) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static int p(int[] iArr, int[][] iArr2) {
        for (int i11 = 0; i11 < iArr2.length; i11++) {
            if (k.d(iArr, iArr2[i11], 0.45f) < 0.2f) {
                return i11;
            }
        }
        throw NotFoundException.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] h() {
        return this.f24213b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] i() {
        return this.f24212a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] j() {
        return this.f24217f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float[] k() {
        return this.f24215d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int[] l() {
        return this.f24216e;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final float[] m() {
        return this.f24214c;
    }
}