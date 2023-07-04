package zu;

import android.content.Context;
import android.os.Build;

/* loaded from: classes6.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public static final r f60786a = new r();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f60787b;

    static {
        f60787b = Build.VERSION.SDK_INT >= 31;
    }

    private r() {
    }

    public static final boolean a(Context context) {
        kotlin.jvm.internal.s.g(context, "context");
        return e.f60767a.b(context);
    }

    public static final boolean b() {
        return !w.f60792a.a();
    }

    public static final boolean c() {
        return f60787b;
    }
}