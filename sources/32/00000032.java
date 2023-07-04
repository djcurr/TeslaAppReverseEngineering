package a10;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.s;
import kotlin.text.v;

/* loaded from: classes5.dex */
public final class h {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String b(u10.b bVar) {
        String C;
        String b11 = bVar.i().b();
        s.f(b11, "relativeClassName.asString()");
        C = v.C(b11, CoreConstants.DOT, CoreConstants.DOLLAR, false, 4, null);
        if (bVar.h().d()) {
            return C;
        }
        return bVar.h() + CoreConstants.DOT + C;
    }
}