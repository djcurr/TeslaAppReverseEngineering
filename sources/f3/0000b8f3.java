package v20;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public final class p1 {
    public static final CancellationException a(String str, Throwable th2) {
        CancellationException cancellationException = new CancellationException(str);
        cancellationException.initCause(th2);
        return cancellationException;
    }
}