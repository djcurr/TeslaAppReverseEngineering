package v20;

import java.util.concurrent.locks.LockSupport;
import v20.l1;

/* loaded from: classes5.dex */
public abstract class m1 extends k1 {
    protected abstract Thread F1();

    /* JADX INFO: Access modifiers changed from: protected */
    public void K1(long j11, l1.c cVar) {
        t0.f54000g.V1(j11, cVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void L1() {
        Thread F1 = F1();
        if (Thread.currentThread() != F1) {
            c.a();
            LockSupport.unpark(F1);
        }
    }
}