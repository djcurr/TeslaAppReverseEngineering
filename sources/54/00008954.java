package n2;

import java.util.List;
import n2.a;
import r2.d;

/* loaded from: classes.dex */
public final class m {
    public static final h a(String text, a0 style, List<a.b<s>> spanStyles, List<a.b<p>> placeholders, int i11, boolean z11, float f11, x2.d density, d.a resourceLoader) {
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(spanStyles, "spanStyles");
        kotlin.jvm.internal.s.g(placeholders, "placeholders");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        return u2.f.a(text, style, spanStyles, placeholders, i11, z11, f11, density, resourceLoader);
    }

    public static final h b(k paragraphIntrinsics, int i11, boolean z11, float f11) {
        kotlin.jvm.internal.s.g(paragraphIntrinsics, "paragraphIntrinsics");
        return u2.f.b(paragraphIntrinsics, i11, z11, f11);
    }

    public static /* synthetic */ h c(String str, a0 a0Var, List list, List list2, int i11, boolean z11, float f11, x2.d dVar, d.a aVar, int i12, Object obj) {
        List list3;
        List list4;
        List i13;
        List i14;
        if ((i12 & 4) != 0) {
            i14 = wz.w.i();
            list3 = i14;
        } else {
            list3 = list;
        }
        if ((i12 & 8) != 0) {
            i13 = wz.w.i();
            list4 = i13;
        } else {
            list4 = list2;
        }
        return a(str, a0Var, list3, list4, (i12 & 16) != 0 ? Integer.MAX_VALUE : i11, (i12 & 32) != 0 ? false : z11, f11, dVar, aVar);
    }
}