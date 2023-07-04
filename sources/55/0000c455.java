package z5;

import android.graphics.Bitmap;
import z5.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class e implements s {

    /* renamed from: b  reason: collision with root package name */
    private final w f60224b;

    public e(w weakMemoryCache) {
        kotlin.jvm.internal.s.g(weakMemoryCache, "weakMemoryCache");
        this.f60224b = weakMemoryCache;
    }

    @Override // z5.s
    public void a(int i11) {
    }

    @Override // z5.s
    public o.a b(l key) {
        kotlin.jvm.internal.s.g(key, "key");
        return null;
    }

    @Override // z5.s
    public void c(l key, Bitmap bitmap, boolean z11) {
        kotlin.jvm.internal.s.g(key, "key");
        kotlin.jvm.internal.s.g(bitmap, "bitmap");
        this.f60224b.d(key, bitmap, z11, g6.a.a(bitmap));
    }
}