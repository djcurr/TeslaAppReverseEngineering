package androidx.work;

import java.util.concurrent.CancellationException;
import vz.q;

/* loaded from: classes.dex */
public final class o implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ v20.o<Object> f6693a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ com.google.common.util.concurrent.c<Object> f6694b;

    public o(v20.o<Object> oVar, com.google.common.util.concurrent.c<Object> cVar) {
        this.f6693a = oVar;
        this.f6694b = cVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            v20.o<Object> oVar = this.f6693a;
            Object obj = this.f6694b.get();
            q.a aVar = vz.q.f54772b;
            oVar.resumeWith(vz.q.b(obj));
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                cause = th2;
            }
            if (th2 instanceof CancellationException) {
                this.f6693a.u(cause);
                return;
            }
            v20.o<Object> oVar2 = this.f6693a;
            q.a aVar2 = vz.q.f54772b;
            oVar2.resumeWith(vz.q.b(vz.r.a(cause)));
        }
    }
}