package or;

import kotlin.jvm.internal.s;
import nr.p;

/* loaded from: classes2.dex */
public final class l {
    public static final <W extends p<? super I, ? extends O, ? extends R>, I, O, R> k a(W w11, String key) {
        s.g(w11, "<this>");
        s.g(key, "key");
        return new k(w11, key);
    }

    public static /* synthetic */ k b(p pVar, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = "";
        }
        return a(pVar, str);
    }
}