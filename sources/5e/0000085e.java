package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
class b1 implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f5743a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<Runnable> f5744b = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private Runnable f5745c;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f5746a;

        a(Runnable runnable) {
            this.f5746a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f5746a.run();
            } finally {
                b1.this.a();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b1(Executor executor) {
        this.f5743a = executor;
    }

    synchronized void a() {
        Runnable poll = this.f5744b.poll();
        this.f5745c = poll;
        if (poll != null) {
            this.f5743a.execute(poll);
        }
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f5744b.offer(new a(runnable));
        if (this.f5745c == null) {
            a();
        }
    }
}