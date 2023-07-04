package r3;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    private static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f49117a;

        a(Handler handler) {
            this.f49117a = (Handler) v3.h.f(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f49117a.post((Runnable) v3.h.f(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f49117a + " is shutting down");
        }
    }

    public static Executor a(Handler handler) {
        return new a(handler);
    }
}