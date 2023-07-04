package com.stripe.android.paymentsheet.repositories;

import com.stripe.android.model.PaymentMethod;
import com.stripe.android.paymentsheet.PaymentSheet;
import h00.p;
import java.util.List;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import v20.y2;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2", f = "CustomerApiRepository.kt", l = {37}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CustomerApiRepository$getPaymentMethods$2 extends l implements p<o0, d<? super List<? extends PaymentMethod>>, Object> {
    final /* synthetic */ PaymentSheet.CustomerConfiguration $customerConfig;
    final /* synthetic */ List<PaymentMethod.Type> $types;
    int label;
    final /* synthetic */ CustomerApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2$1", f = "CustomerApiRepository.kt", l = {55}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends l implements p<o0, d<? super List<? extends PaymentMethod>>, Object> {
        final /* synthetic */ PaymentSheet.CustomerConfiguration $customerConfig;
        final /* synthetic */ List<PaymentMethod.Type> $types;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ CustomerApiRepository this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(List<? extends PaymentMethod.Type> list, CustomerApiRepository customerApiRepository, PaymentSheet.CustomerConfiguration customerConfiguration, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$types = list;
            this.this$0 = customerApiRepository;
            this.$customerConfig = customerConfiguration;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$types, this.this$0, this.$customerConfig, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super List<? extends PaymentMethod>> dVar) {
            return invoke2(o0Var, (d<? super List<PaymentMethod>>) dVar);
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final Object invoke2(o0 o0Var, d<? super List<PaymentMethod>> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(11:4|(3:5|6|7)|8|9|10|(1:12)|13|(1:15)|16|17|(4:19|20|21|(1:23)(10:25|8|9|10|(0)|13|(0)|16|17|(2:30|31)(0)))(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
            r14 = th;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00f7  */
        /* JADX WARN: Type inference failed for: r1v14, types: [java.util.Collection] */
        /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Collection] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00ad -> B:42:0x00b5). Please submit an issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00c7 -> B:31:0x00d1). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                Method dump skipped, instructions count: 254
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.paymentsheet.repositories.CustomerApiRepository$getPaymentMethods$2.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CustomerApiRepository$getPaymentMethods$2(List<? extends PaymentMethod.Type> list, CustomerApiRepository customerApiRepository, PaymentSheet.CustomerConfiguration customerConfiguration, d<? super CustomerApiRepository$getPaymentMethods$2> dVar) {
        super(2, dVar);
        this.$types = list;
        this.this$0 = customerApiRepository;
        this.$customerConfig = customerConfiguration;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CustomerApiRepository$getPaymentMethods$2(this.$types, this.this$0, this.$customerConfig, dVar);
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, d<? super List<? extends PaymentMethod>> dVar) {
        return invoke2(o0Var, (d<? super List<PaymentMethod>>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, d<? super List<PaymentMethod>> dVar) {
        return ((CustomerApiRepository$getPaymentMethods$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$types, this.this$0, this.$customerConfig, null);
            this.label = 1;
            obj = y2.c(anonymousClass1, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return obj;
    }
}