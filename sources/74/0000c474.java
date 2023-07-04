package z5;

import android.graphics.Bitmap;
import z5.o;

/* loaded from: classes.dex */
public interface s {

    /* renamed from: a  reason: collision with root package name */
    public static final a f60316a = a.f60317a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f60317a = new a();

        private a() {
        }

        public final s a(w weakMemoryCache, t5.d referenceCounter, int i11, g6.k kVar) {
            kotlin.jvm.internal.s.g(weakMemoryCache, "weakMemoryCache");
            kotlin.jvm.internal.s.g(referenceCounter, "referenceCounter");
            if (i11 > 0) {
                return new p(weakMemoryCache, referenceCounter, i11, kVar);
            }
            return weakMemoryCache instanceof q ? new e(weakMemoryCache) : b.f60221b;
        }
    }

    void a(int i11);

    o.a b(l lVar);

    void c(l lVar, Bitmap bitmap, boolean z11);
}