package v20;

import java.util.List;
import java.util.ServiceLoader;
import kotlinx.coroutines.CoroutineExceptionHandler;
import vz.q;

/* loaded from: classes5.dex */
public final class k0 {

    /* renamed from: a  reason: collision with root package name */
    private static final List<CoroutineExceptionHandler> f53961a;

    static {
        u20.h c11;
        List<CoroutineExceptionHandler> I;
        c11 = u20.n.c(ServiceLoader.load(CoroutineExceptionHandler.class, CoroutineExceptionHandler.class.getClassLoader()).iterator());
        I = u20.p.I(c11);
        f53961a = I;
    }

    public static final void a(zz.g gVar, Throwable th2) {
        for (CoroutineExceptionHandler coroutineExceptionHandler : f53961a) {
            try {
                coroutineExceptionHandler.handleException(gVar, th2);
            } catch (Throwable th3) {
                Thread currentThread = Thread.currentThread();
                currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, l0.b(th2, th3));
            }
        }
        Thread currentThread2 = Thread.currentThread();
        try {
            q.a aVar = vz.q.f54772b;
            vz.f.a(th2, new z0(gVar));
            vz.q.b(vz.b0.f54756a);
        } catch (Throwable th4) {
            q.a aVar2 = vz.q.f54772b;
            vz.q.b(vz.r.a(th4));
        }
        currentThread2.getUncaughtExceptionHandler().uncaughtException(currentThread2, th2);
    }
}