package androidx.work;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class b0 {
    public static b0 i(Context context) {
        return d5.i.r(context);
    }

    public static void k(Context context, b bVar) {
        d5.i.k(context, bVar);
    }

    public final z a(String str, h hVar, s sVar) {
        return b(str, hVar, Collections.singletonList(sVar));
    }

    public abstract z b(String str, h hVar, List<s> list);

    public abstract t c(String str);

    public final t d(c0 c0Var) {
        return e(Collections.singletonList(c0Var));
    }

    public abstract t e(List<? extends c0> list);

    public abstract t f(String str, g gVar, v vVar);

    public t g(String str, h hVar, s sVar) {
        return h(str, hVar, Collections.singletonList(sVar));
    }

    public abstract t h(String str, h hVar, List<s> list);

    public abstract com.google.common.util.concurrent.c<List<a0>> j(String str);
}