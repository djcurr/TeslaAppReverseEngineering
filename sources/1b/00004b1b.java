package com.stripe.android;

import com.stripe.android.model.Customer;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class CustomerSession$operationExecutor$1 extends u implements l<Customer, b0> {
    final /* synthetic */ CustomerSession this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomerSession$operationExecutor$1(CustomerSession customerSession) {
        super(1);
        this.this$0 = customerSession;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(Customer customer) {
        invoke2(customer);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Customer customer) {
        h00.a aVar;
        s.g(customer, "customer");
        this.this$0.setCustomer$payments_core_release(customer);
        CustomerSession customerSession = this.this$0;
        aVar = customerSession.timeSupplier;
        customerSession.setCustomerCacheTime$payments_core_release(((Number) aVar.invoke()).longValue());
    }
}