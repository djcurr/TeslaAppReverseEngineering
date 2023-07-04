package x20;

import java.util.concurrent.CancellationException;
import v20.p1;

/* loaded from: classes5.dex */
final /* synthetic */ class l {
    public static final void a(t<?> tVar, Throwable th2) {
        if (th2 != null) {
            r0 = th2 instanceof CancellationException ? (CancellationException) th2 : null;
            if (r0 == null) {
                r0 = p1.a("Channel was consumed, consumer had failed", th2);
            }
        }
        tVar.j(r0);
    }
}