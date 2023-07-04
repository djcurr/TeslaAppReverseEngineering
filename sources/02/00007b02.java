package j20;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes5.dex */
public final class c extends d {

    /* renamed from: c */
    private final Runnable f33119c;

    /* renamed from: d */
    private final h00.l<InterruptedException, b0> f33120d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public c(Lock lock, Runnable checkCancelled, h00.l<? super InterruptedException, b0> interruptedExceptionHandler) {
        super(lock);
        s.g(lock, "lock");
        s.g(checkCancelled, "checkCancelled");
        s.g(interruptedExceptionHandler, "interruptedExceptionHandler");
        this.f33119c = checkCancelled;
        this.f33120d = interruptedExceptionHandler;
    }

    @Override // j20.d, j20.k
    public void lock() {
        while (!a().tryLock(50L, TimeUnit.MILLISECONDS)) {
            try {
                this.f33119c.run();
            } catch (InterruptedException e11) {
                this.f33120d.invoke(e11);
                return;
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(Runnable checkCancelled, h00.l<? super InterruptedException, b0> interruptedExceptionHandler) {
        this(new ReentrantLock(), checkCancelled, interruptedExceptionHandler);
        s.g(checkCancelled, "checkCancelled");
        s.g(interruptedExceptionHandler, "interruptedExceptionHandler");
    }
}