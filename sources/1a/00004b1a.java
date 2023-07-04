package com.stripe.android;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;

@f(c = "com.stripe.android.CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1", f = "CustomerSession.kt", l = {61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ EphemeralKey $ephemeralKey;
    final /* synthetic */ EphemeralOperation $operation;
    int label;
    final /* synthetic */ CustomerSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1(CustomerSession customerSession, EphemeralKey ephemeralKey, EphemeralOperation ephemeralOperation, zz.d<? super CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1> dVar) {
        super(2, dVar);
        this.this$0 = customerSession;
        this.$ephemeralKey = ephemeralKey;
        this.$operation = ephemeralOperation;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1(this.this$0, this.$ephemeralKey, this.$operation, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((CustomerSession$ephemeralKeyManager$1$onKeyUpdate$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        CustomerSessionOperationExecutor customerSessionOperationExecutor;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            customerSessionOperationExecutor = this.this$0.operationExecutor;
            EphemeralKey ephemeralKey = this.$ephemeralKey;
            EphemeralOperation ephemeralOperation = this.$operation;
            this.label = 1;
            if (customerSessionOperationExecutor.execute$payments_core_release(ephemeralKey, ephemeralOperation, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return b0.f54756a;
    }
}