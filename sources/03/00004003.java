package com.plaid.internal;

import com.plaid.internal.cc;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class cc<T> extends androidx.lifecycle.f0<T> {

    /* renamed from: a */
    public final AtomicBoolean f18264a = new AtomicBoolean(false);

    public static final void a(cc this$0, androidx.lifecycle.g0 observer, Object obj) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        kotlin.jvm.internal.s.g(observer, "$observer");
        if (this$0.f18264a.get()) {
            observer.onChanged(obj);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void observe(androidx.lifecycle.v owner, final androidx.lifecycle.g0<? super T> observer) {
        kotlin.jvm.internal.s.g(owner, "owner");
        kotlin.jvm.internal.s.g(observer, "observer");
        if (!hasActiveObservers()) {
            super.observe(owner, new androidx.lifecycle.g0() { // from class: qq.b
                {
                    cc.this = this;
                }

                @Override // androidx.lifecycle.g0
                public final void onChanged(Object obj) {
                    cc.a(cc.this, observer, obj);
                }
            });
            return;
        }
        throw new r5("Only one observer supported");
    }

    @Override // androidx.lifecycle.f0, androidx.lifecycle.LiveData
    public void setValue(T t11) {
        this.f18264a.set(true);
        super.setValue(t11);
    }
}