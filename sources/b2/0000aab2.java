package ph;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
class m implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f46517a;

    /* loaded from: classes3.dex */
    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f46518a;

        a(Runnable runnable) {
            this.f46518a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f46518a.run();
            } catch (Exception e11) {
                uh.a.c("Executor", "Background execution failure.", e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public m(Executor executor) {
        this.f46517a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f46517a.execute(new a(runnable));
    }
}