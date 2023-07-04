package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

@KeepForSdk
/* loaded from: classes2.dex */
public class o {

    /* renamed from: b  reason: collision with root package name */
    private boolean f17270b;

    /* renamed from: a  reason: collision with root package name */
    private final Object f17269a = new Object();

    /* renamed from: c  reason: collision with root package name */
    private final Queue f17271c = new ArrayDeque();

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference f17272d = new AtomicReference();

    /* JADX INFO: Access modifiers changed from: private */
    public final void d() {
        synchronized (this.f17269a) {
            if (this.f17271c.isEmpty()) {
                this.f17270b = false;
                return;
            }
            i0 i0Var = (i0) this.f17271c.remove();
            e(i0Var.f17246a, i0Var.f17247b);
        }
    }

    private final void e(Executor executor, final Runnable runnable) {
        try {
            executor.execute(new Runnable() { // from class: com.google.mlkit.common.sdkinternal.g0
                @Override // java.lang.Runnable
                public final void run() {
                    o oVar = o.this;
                    Runnable runnable2 = runnable;
                    k0 k0Var = new k0(oVar, null);
                    try {
                        runnable2.run();
                        k0Var.close();
                    } catch (Throwable th2) {
                        try {
                            k0Var.close();
                        } catch (Throwable th3) {
                            try {
                                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th2, th3);
                            } catch (Exception unused) {
                            }
                        }
                        throw th2;
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
            d();
        }
    }

    @KeepForSdk
    public void a(Executor executor, Runnable runnable) {
        synchronized (this.f17269a) {
            if (this.f17270b) {
                this.f17271c.add(new i0(executor, runnable, null));
                return;
            }
            this.f17270b = true;
            e(executor, runnable);
        }
    }
}