package androidx.compose.ui.window;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class p {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f3322a;

        static {
            int[] iArr = new int[o.values().length];
            iArr[o.SecureOff.ordinal()] = 1;
            iArr[o.SecureOn.ordinal()] = 2;
            iArr[o.Inherit.ordinal()] = 3;
            f3322a = iArr;
        }
    }

    public static final boolean a(o oVar, boolean z11) {
        s.g(oVar, "<this>");
        int i11 = a.f3322a[oVar.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    return z11;
                }
                throw new NoWhenBranchMatchedException();
            }
            return true;
        }
        return false;
    }
}