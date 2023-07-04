package androidx.lifecycle;

import java.util.ArrayDeque;
import java.util.Queue;
import v20.e1;
import v20.l2;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: b  reason: collision with root package name */
    private boolean f5140b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f5141c;

    /* renamed from: a  reason: collision with root package name */
    private boolean f5139a = true;

    /* renamed from: d  reason: collision with root package name */
    private final Queue<Runnable> f5142d = new ArrayDeque();

    /* loaded from: classes.dex */
    static final class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Runnable f5144b;

        a(Runnable runnable) {
            this.f5144b = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            h.this.e(this.f5144b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(Runnable runnable) {
        if (this.f5142d.offer(runnable)) {
            d();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    public final boolean b() {
        return this.f5140b || !this.f5139a;
    }

    public final void c(zz.g context, Runnable runnable) {
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(runnable, "runnable");
        l2 R0 = e1.c().R0();
        if (!R0.P0(context) && !b()) {
            e(runnable);
        } else {
            R0.I0(context, new a(runnable));
        }
    }

    public final void d() {
        if (this.f5141c) {
            return;
        }
        try {
            this.f5141c = true;
            while ((!this.f5142d.isEmpty()) && b()) {
                Runnable poll = this.f5142d.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.f5141c = false;
        }
    }

    public final void f() {
        this.f5140b = true;
        d();
    }

    public final void g() {
        this.f5139a = true;
    }

    public final void h() {
        if (this.f5139a) {
            if (!this.f5140b) {
                this.f5139a = false;
                d();
                return;
            }
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
    }
}