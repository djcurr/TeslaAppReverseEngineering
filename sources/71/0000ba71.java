package vy;

/* loaded from: classes5.dex */
public final class k extends a implements Runnable {
    public k(Runnable runnable, boolean z11) {
        super(runnable, z11);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f54652c = Thread.currentThread();
        try {
            this.f54650a.run();
            this.f54652c = null;
        } catch (Throwable th2) {
            dispose();
            this.f54652c = null;
            az.a.r(th2);
            throw th2;
        }
    }
}