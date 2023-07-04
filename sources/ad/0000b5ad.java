package ts;

import android.util.LruCache;
import com.tesla.messagedecoding.CommandMessageDecoder;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class g0 {

    /* renamed from: a  reason: collision with root package name */
    public static final g0 f52488a = new g0();

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentHashMap<String, Boolean> f52489b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentHashMap<String, iy.b> f52490c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private static final LruCache<String, Boolean> f52491d = new LruCache<>(50);

    private g0() {
    }

    private final String a(String str, CommandMessageDecoder.Result result) {
        return str + " " + result;
    }

    public final boolean b(String requestId, CommandMessageDecoder.Result result) {
        kotlin.jvm.internal.s.g(requestId, "requestId");
        kotlin.jvm.internal.s.g(result, "result");
        return kotlin.jvm.internal.s.c(f52491d.get(a(requestId, result)), Boolean.TRUE);
    }

    public final void c(String requestId, CommandMessageDecoder.Result result) {
        kotlin.jvm.internal.s.g(requestId, "requestId");
        kotlin.jvm.internal.s.g(result, "result");
        f52491d.put(a(requestId, result), Boolean.TRUE);
    }

    public final void d(uu.h request, boolean z11) {
        kotlin.jvm.internal.s.g(request, "request");
        f52489b.put(request.P(), Boolean.valueOf(z11));
    }

    public final void e(uu.h request, iy.b disposable) {
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(disposable, "disposable");
        f(request);
        f52490c.put(request.n(), disposable);
    }

    public final void f(uu.h request) {
        kotlin.jvm.internal.s.g(request, "request");
        iy.b remove = f52490c.remove(request.n());
        if (remove == null) {
            return;
        }
        remove.dispose();
    }

    public final Boolean g(uu.h request) {
        kotlin.jvm.internal.s.g(request, "request");
        return f52489b.get(request.P());
    }
}