package r2;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g {
    public static final d a(int i11, l weight, int i12) {
        s.g(weight, "weight");
        return new p(i11, weight, i12, null);
    }

    public static /* synthetic */ d b(int i11, l lVar, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            lVar = l.f49091b.d();
        }
        if ((i13 & 4) != 0) {
            i12 = j.f49081b.b();
        }
        return a(i11, lVar, i12);
    }
}