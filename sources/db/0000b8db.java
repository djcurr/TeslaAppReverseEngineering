package v20;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* loaded from: classes5.dex */
public final class l0 {
    public static final void a(zz.g gVar, Throwable th2) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) gVar.get(CoroutineExceptionHandler.f35225e1);
            if (coroutineExceptionHandler == null) {
                k0.a(gVar, th2);
            } else {
                coroutineExceptionHandler.handleException(gVar, th2);
            }
        } catch (Throwable th3) {
            k0.a(gVar, b(th2, th3));
        }
    }

    public static final Throwable b(Throwable th2, Throwable th3) {
        if (th2 == th3) {
            return th2;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th3);
        vz.f.a(runtimeException, th2);
        return runtimeException;
    }
}