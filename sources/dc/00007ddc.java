package kd;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class g<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicInteger f34571a = new AtomicInteger(0);

    public void a() {
        if (this.f34571a.compareAndSet(0, 2)) {
            d();
        }
    }

    protected abstract void b(T t11);

    protected abstract T c();

    protected abstract void d();

    protected abstract void e(Exception exc);

    protected abstract void f(T t11);

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f34571a.compareAndSet(0, 1)) {
            try {
                T c11 = c();
                this.f34571a.set(3);
                try {
                    f(c11);
                } finally {
                    b(c11);
                }
            } catch (Exception e11) {
                this.f34571a.set(4);
                e(e11);
            }
        }
    }
}