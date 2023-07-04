package com.stripe.android;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.CustomerSessionOperationExecutor$execute$2", f = "CustomerSessionOperationExecutor.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class CustomerSessionOperationExecutor$execute$2 extends l implements p<o0, zz.d<? super b0>, Object> {
    final /* synthetic */ EphemeralOperation $operation;
    final /* synthetic */ Object $result;
    int label;
    final /* synthetic */ CustomerSessionOperationExecutor this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerSessionOperationExecutor$execute$2(CustomerSessionOperationExecutor customerSessionOperationExecutor, EphemeralOperation ephemeralOperation, Object obj, zz.d<? super CustomerSessionOperationExecutor$execute$2> dVar) {
        super(2, dVar);
        this.this$0 = customerSessionOperationExecutor;
        this.$operation = ephemeralOperation;
        this.$result = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new CustomerSessionOperationExecutor$execute$2(this.this$0, this.$operation, this.$result, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((CustomerSessionOperationExecutor$execute$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            this.this$0.onCustomerRetrieved(this.$operation, this.$result);
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}