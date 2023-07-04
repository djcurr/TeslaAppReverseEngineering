package l5;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class g implements Executor {

    /* renamed from: b  reason: collision with root package name */
    private final Executor f36605b;

    /* renamed from: d  reason: collision with root package name */
    private volatile Runnable f36607d;

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<a> f36604a = new ArrayDeque<>();

    /* renamed from: c  reason: collision with root package name */
    private final Object f36606c = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final g f36608a;

        /* renamed from: b  reason: collision with root package name */
        final Runnable f36609b;

        a(g gVar, Runnable runnable) {
            this.f36608a = gVar;
            this.f36609b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f36609b.run();
            } finally {
                this.f36608a.b();
            }
        }
    }

    public g(Executor executor) {
        this.f36605b = executor;
    }

    public boolean a() {
        boolean z11;
        synchronized (this.f36606c) {
            z11 = !this.f36604a.isEmpty();
        }
        return z11;
    }

    void b() {
        synchronized (this.f36606c) {
            a poll = this.f36604a.poll();
            this.f36607d = poll;
            if (poll != null) {
                this.f36605b.execute(this.f36607d);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f36606c) {
            this.f36604a.add(new a(this, runnable));
            if (this.f36607d == null) {
                b();
            }
        }
    }
}