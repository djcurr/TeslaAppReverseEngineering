package c1;

import java.util.ArrayList;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class j1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean A(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 268435456) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean B(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(int[] iArr, int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, int i14) {
        int i15 = z11 ? 1073741824 : 0;
        int i16 = z12 ? PKIFailureInfo.duplicateCertReq : 0;
        int i17 = z13 ? 268435456 : 0;
        int i18 = i11 * 5;
        iArr[i18 + 0] = i12;
        iArr[i18 + 1] = i15 | i16 | i17;
        iArr[i18 + 2] = i13;
        iArr[i18 + 3] = 0;
        iArr[i18 + 4] = i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(int[] iArr, int i11) {
        return (iArr[(i11 * 5) + 1] & 1073741824) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int E(int[] iArr, int i11) {
        return iArr[i11 * 5];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int F(ArrayList<d> arrayList, int i11, int i12) {
        int K = K(arrayList, i11, i12);
        return K >= 0 ? K : -(K + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int G(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 1] & 134217727;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int H(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int I(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + w(iArr[i12 + 1] >> 30);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int J(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int K(ArrayList<d> arrayList, int i11, int i12) {
        int size = arrayList.size() - 1;
        int i13 = 0;
        while (i13 <= size) {
            int i14 = (i13 + size) >>> 1;
            int a11 = arrayList.get(i14).a();
            if (a11 < 0) {
                a11 += i12;
            }
            int i15 = kotlin.jvm.internal.s.i(a11, i11);
            if (i15 < 0) {
                i13 = i14 + 1;
            } else if (i15 <= 0) {
                return i14;
            } else {
                size = i14 - 1;
            }
        }
        return -(i13 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int L(int[] iArr, int i11) {
        int i12 = i11 * 5;
        return iArr[i12 + 4] + w(iArr[i12 + 1] >> 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(int[] iArr, int i11, int i12) {
        iArr[(i11 * 5) + 4] = i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(int[] iArr, int i11, int i12) {
        if (i12 >= 0) {
            iArr[(i11 * 5) + 3] = i12;
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(int[] iArr, int i11, int i12) {
        if (i12 >= 0 && i12 < 134217727) {
            int i13 = (i11 * 5) + 1;
            iArr[i13] = i12 | (iArr[i13] & (-134217728));
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(int[] iArr, int i11, int i12) {
        iArr[(i11 * 5) + 2] = i12;
    }

    public static final /* synthetic */ int b(int i11) {
        return w(i11);
    }

    public static final /* synthetic */ int c(int[] iArr, int i11) {
        return x(iArr, i11);
    }

    public static final /* synthetic */ int d(int[] iArr, int i11) {
        return y(iArr, i11);
    }

    public static final /* synthetic */ int e(int[] iArr, int i11) {
        return z(iArr, i11);
    }

    public static final /* synthetic */ boolean f(int[] iArr, int i11) {
        return A(iArr, i11);
    }

    public static final /* synthetic */ boolean g(int[] iArr, int i11) {
        return B(iArr, i11);
    }

    public static final /* synthetic */ void h(int[] iArr, int i11, int i12, boolean z11, boolean z12, boolean z13, int i13, int i14) {
        C(iArr, i11, i12, z11, z12, z13, i13, i14);
    }

    public static final /* synthetic */ boolean i(int[] iArr, int i11) {
        return D(iArr, i11);
    }

    public static final /* synthetic */ int j(int[] iArr, int i11) {
        return E(iArr, i11);
    }

    public static final /* synthetic */ int k(ArrayList arrayList, int i11, int i12) {
        return F(arrayList, i11, i12);
    }

    public static final /* synthetic */ int l(int[] iArr, int i11) {
        return G(iArr, i11);
    }

    public static final /* synthetic */ int n(int[] iArr, int i11) {
        return I(iArr, i11);
    }

    public static final /* synthetic */ int o(int[] iArr, int i11) {
        return J(iArr, i11);
    }

    public static final /* synthetic */ int p(ArrayList arrayList, int i11, int i12) {
        return K(arrayList, i11, i12);
    }

    public static final /* synthetic */ int q(int[] iArr, int i11) {
        return L(iArr, i11);
    }

    public static final /* synthetic */ void r(int[] iArr, int i11, int i12) {
        M(iArr, i11, i12);
    }

    public static final /* synthetic */ void s(int[] iArr, int i11, int i12) {
        N(iArr, i11, i12);
    }

    public static final /* synthetic */ void t(int[] iArr, int i11, int i12) {
        O(iArr, i11, i12);
    }

    public static final /* synthetic */ void u(int[] iArr, int i11, int i12) {
        P(iArr, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int v(int[] iArr, int i11) {
        int i12 = i11 * 5;
        if (i12 >= iArr.length) {
            return iArr.length;
        }
        return w(iArr[i12 + 1] >> 29) + iArr[i12 + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(int i11) {
        switch (i11) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int y(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 1];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int z(int[] iArr, int i11) {
        return iArr[(i11 * 5) + 3];
    }
}