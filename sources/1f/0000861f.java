package m20;

import k20.k1;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes5.dex */
public final class p {

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f38361a;

        static {
            int[] iArr = new int[k1.values().length];
            iArr[k1.INVARIANT.ordinal()] = 1;
            iArr[k1.IN_VARIANCE.ordinal()] = 2;
            iArr[k1.OUT_VARIANCE.ordinal()] = 3;
            f38361a = iArr;
        }
    }

    public static final t a(k1 k1Var) {
        kotlin.jvm.internal.s.g(k1Var, "<this>");
        int i11 = a.f38361a[k1Var.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return t.OUT;
                }
                throw new NoWhenBranchMatchedException();
            }
            return t.IN;
        }
        return t.INV;
    }
}