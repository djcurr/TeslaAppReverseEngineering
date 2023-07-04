package kotlinx.coroutines.scheduling;

import v20.s0;

/* loaded from: classes5.dex */
public final class k extends h {

    /* renamed from: c  reason: collision with root package name */
    public final Runnable f35563c;

    public k(Runnable runnable, long j11, i iVar) {
        super(j11, iVar);
        this.f35563c = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f35563c.run();
        } finally {
            this.f35561b.a();
        }
    }

    public String toString() {
        return "Task[" + s0.a(this.f35563c) + '@' + s0.b(this.f35563c) + ", " + this.f35560a + ", " + this.f35561b + ']';
    }
}