package b0;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class b implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private static volatile b f7149a;

    b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Executor a() {
        if (f7149a != null) {
            return f7149a;
        }
        synchronized (b.class) {
            if (f7149a == null) {
                f7149a = new b();
            }
        }
        return f7149a;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }
}