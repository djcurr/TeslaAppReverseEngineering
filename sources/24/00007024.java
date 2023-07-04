package g6;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.s;
import okhttp3.Cache;

/* loaded from: classes.dex */
public final class i {
    static {
        new i();
    }

    private i() {
    }

    public static final Cache a(Context context) {
        s.g(context, "context");
        m mVar = m.f27804a;
        File g11 = mVar.g(context);
        return new Cache(g11, mVar.c(g11));
    }
}