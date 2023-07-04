package gy;

import android.os.Handler;
import android.os.Looper;
import hy.l;
import java.util.concurrent.Callable;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a */
    private static final l f28514a = fy.a.d(new Callable() { // from class: gy.a
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return b.a();
        }
    });

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a */
        static final l f28515a = new c(new Handler(Looper.getMainLooper()), true);
    }

    public static /* synthetic */ l a() {
        return a.f28515a;
    }

    public static l c() {
        return fy.a.e(f28514a);
    }
}