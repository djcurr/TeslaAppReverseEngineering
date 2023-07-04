package n;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: c  reason: collision with root package name */
    private static volatile a f39662c;

    /* renamed from: d  reason: collision with root package name */
    private static final Executor f39663d;

    /* renamed from: a  reason: collision with root package name */
    private c f39664a;

    /* renamed from: b  reason: collision with root package name */
    private c f39665b;

    /* renamed from: n.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class ExecutorC0766a implements Executor {
        ExecutorC0766a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().c(runnable);
        }
    }

    /* loaded from: classes.dex */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            a.e().a(runnable);
        }
    }

    static {
        new ExecutorC0766a();
        f39663d = new b();
    }

    private a() {
        n.b bVar = new n.b();
        this.f39665b = bVar;
        this.f39664a = bVar;
    }

    public static Executor d() {
        return f39663d;
    }

    public static a e() {
        if (f39662c != null) {
            return f39662c;
        }
        synchronized (a.class) {
            if (f39662c == null) {
                f39662c = new a();
            }
        }
        return f39662c;
    }

    @Override // n.c
    public void a(Runnable runnable) {
        this.f39664a.a(runnable);
    }

    @Override // n.c
    public boolean b() {
        return this.f39664a.b();
    }

    @Override // n.c
    public void c(Runnable runnable) {
        this.f39664a.c(runnable);
    }
}