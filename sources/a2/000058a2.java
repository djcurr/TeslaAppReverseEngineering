package com.stripe.android.stripe3ds2.transaction;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.e1;
import v20.i;
import v20.l2;
import v20.o0;
import v20.y0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer$start$2", f = "TransactionTimer.kt", l = {39, 41}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class DefaultTransactionTimer$start$2 extends l implements p<o0, d<? super b0>, Object> {
    int label;
    final /* synthetic */ DefaultTransactionTimer this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer$start$2$1", f = "TransactionTimer.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.stripe3ds2.transaction.DefaultTransactionTimer$start$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super b0>, Object> {
        int label;
        final /* synthetic */ DefaultTransactionTimer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(DefaultTransactionTimer defaultTransactionTimer, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = defaultTransactionTimer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.label == 0) {
                r.b(obj);
                this.this$0.onTimeout$3ds2sdk_release();
                return b0.f54756a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTransactionTimer$start$2(DefaultTransactionTimer defaultTransactionTimer, d<? super DefaultTransactionTimer$start$2> dVar) {
        super(2, dVar);
        this.this$0 = defaultTransactionTimer;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new DefaultTransactionTimer$start$2(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((DefaultTransactionTimer$start$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        long j11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            j11 = this.this$0.timeoutMillis;
            this.label = 1;
            if (y0.b(j11, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return b0.f54756a;
        } else {
            r.b(obj);
        }
        l2 c11 = e1.c();
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, null);
        this.label = 2;
        if (i.g(c11, anonymousClass1, this) == d11) {
            return d11;
        }
        return b0.f54756a;
    }
}