package com.stripe.android.paymentsheet;

import v20.o0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.LazyListEnabableKt$reenableScrolling$1", f = "LazyListEnabable.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class LazyListEnabableKt$reenableScrolling$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super vz.b0>, Object> {
    final /* synthetic */ q0.h $this_reenableScrolling;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.LazyListEnabableKt$reenableScrolling$1$1", f = "LazyListEnabable.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.paymentsheet.LazyListEnabableKt$reenableScrolling$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements h00.p<n0.c0, zz.d<? super vz.b0>, Object> {
        int label;

        AnonymousClass1(zz.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            return new AnonymousClass1(dVar);
        }

        @Override // h00.p
        public final Object invoke(n0.c0 c0Var, zz.d<? super vz.b0> dVar) {
            return ((AnonymousClass1) create(c0Var, dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.label == 0) {
                r.b(obj);
                return vz.b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyListEnabableKt$reenableScrolling$1(q0.h hVar, zz.d<? super LazyListEnabableKt$reenableScrolling$1> dVar) {
        super(2, dVar);
        this.$this_reenableScrolling = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new LazyListEnabableKt$reenableScrolling$1(this.$this_reenableScrolling, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super vz.b0> dVar) {
        return ((LazyListEnabableKt$reenableScrolling$1) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            q0.h hVar = this.$this_reenableScrolling;
            m0.v vVar = m0.v.PreventUserInput;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.label = 1;
            if (hVar.a(vVar, anonymousClass1, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return vz.b0.f54756a;
    }
}