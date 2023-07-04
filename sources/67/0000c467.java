package z5;

import android.graphics.Bitmap;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a  reason: collision with root package name */
    private final s f60292a;

    /* renamed from: b  reason: collision with root package name */
    private final w f60293b;

    /* renamed from: c  reason: collision with root package name */
    private final t5.d f60294c;

    /* loaded from: classes.dex */
    public interface a {
        boolean a();

        Bitmap b();
    }

    public o(s strongMemoryCache, w weakMemoryCache, t5.d referenceCounter) {
        kotlin.jvm.internal.s.g(strongMemoryCache, "strongMemoryCache");
        kotlin.jvm.internal.s.g(weakMemoryCache, "weakMemoryCache");
        kotlin.jvm.internal.s.g(referenceCounter, "referenceCounter");
        this.f60292a = strongMemoryCache;
        this.f60293b = weakMemoryCache;
        this.f60294c = referenceCounter;
    }
}