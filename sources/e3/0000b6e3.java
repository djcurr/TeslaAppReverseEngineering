package u2;

import java.util.List;
import n2.a;
import n2.a0;
import n2.p;
import n2.s;
import r2.d;
import w2.d;

/* loaded from: classes.dex */
public final class f {
    public static final n2.h a(String text, a0 style, List<a.b<s>> spanStyles, List<a.b<p>> placeholders, int i11, boolean z11, float f11, x2.d density, d.a resourceLoader) {
        kotlin.jvm.internal.s.g(text, "text");
        kotlin.jvm.internal.s.g(style, "style");
        kotlin.jvm.internal.s.g(spanStyles, "spanStyles");
        kotlin.jvm.internal.s.g(placeholders, "placeholders");
        kotlin.jvm.internal.s.g(density, "density");
        kotlin.jvm.internal.s.g(resourceLoader, "resourceLoader");
        return new b(new d(text, style, spanStyles, placeholders, new j(null, resourceLoader, 1, null), density), i11, z11, f11);
    }

    public static final n2.h b(n2.k paragraphIntrinsics, int i11, boolean z11, float f11) {
        kotlin.jvm.internal.s.g(paragraphIntrinsics, "paragraphIntrinsics");
        return new b((d) paragraphIntrinsics, i11, z11, f11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(w2.d dVar) {
        d.a aVar = w2.d.f55400b;
        if (dVar == null ? false : w2.d.j(dVar.m(), aVar.d())) {
            return 3;
        }
        if (dVar == null ? false : w2.d.j(dVar.m(), aVar.e())) {
            return 4;
        }
        if (dVar == null ? false : w2.d.j(dVar.m(), aVar.a())) {
            return 2;
        }
        if (dVar == null ? false : w2.d.j(dVar.m(), aVar.f())) {
            return 0;
        }
        return dVar == null ? false : w2.d.j(dVar.m(), aVar.b()) ? 1 : 0;
    }
}