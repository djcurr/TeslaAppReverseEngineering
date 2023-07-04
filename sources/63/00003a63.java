package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.internal.Preconditions;
import java.io.Closeable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
final class k0 implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ o f17253a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ k0(o oVar, j0 j0Var) {
        AtomicReference atomicReference;
        this.f17253a = oVar;
        atomicReference = oVar.f17272d;
        Preconditions.checkState(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicReference atomicReference;
        atomicReference = this.f17253a.f17272d;
        atomicReference.set(null);
        this.f17253a.d();
    }
}