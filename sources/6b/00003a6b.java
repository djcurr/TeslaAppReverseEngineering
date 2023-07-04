package com.google.mlkit.common.sdkinternal;

import com.google.mlkit.common.sdkinternal.a;
import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.util.Set;

/* loaded from: classes2.dex */
final class s extends PhantomReference implements a.InterfaceC0312a {

    /* renamed from: a  reason: collision with root package name */
    private final Set f17276a;

    /* renamed from: b  reason: collision with root package name */
    private final Runnable f17277b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ s(Object obj, ReferenceQueue referenceQueue, Set set, Runnable runnable, r rVar) {
        super(obj, referenceQueue);
        this.f17276a = set;
        this.f17277b = runnable;
    }

    @Override // com.google.mlkit.common.sdkinternal.a.InterfaceC0312a
    public final void a() {
        if (this.f17276a.remove(this)) {
            clear();
            this.f17277b.run();
        }
    }
}