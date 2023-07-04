package com.stripe.android.view;

import com.stripe.android.core.networking.ApiRequest;
import com.stripe.android.model.BankStatuses;
import com.stripe.android.networking.StripeRepository;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.view.FpxViewModel$getFpxBankStatues$1", f = "FpxViewModel.kt", l = {25, 23}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class FpxViewModel$getFpxBankStatues$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<androidx.lifecycle.b0<BankStatuses>, zz.d<? super vz.b0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ FpxViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FpxViewModel$getFpxBankStatues$1(FpxViewModel fpxViewModel, zz.d<? super FpxViewModel$getFpxBankStatues$1> dVar) {
        super(2, dVar);
        this.this$0 = fpxViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        FpxViewModel$getFpxBankStatues$1 fpxViewModel$getFpxBankStatues$1 = new FpxViewModel$getFpxBankStatues$1(this.this$0, dVar);
        fpxViewModel$getFpxBankStatues$1.L$0 = obj;
        return fpxViewModel$getFpxBankStatues$1;
    }

    @Override // h00.p
    public final Object invoke(androidx.lifecycle.b0<BankStatuses> b0Var, zz.d<? super vz.b0> dVar) {
        return ((FpxViewModel$getFpxBankStatues$1) create(b0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [androidx.lifecycle.b0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.lifecycle.b0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.lifecycle.b0] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object b11;
        ?? r12;
        StripeRepository stripeRepository;
        String str;
        d11 = a00.d.d();
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            q.a aVar = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
            r12 = i11;
        }
        if (i11 == 0) {
            vz.r.b(obj);
            ?? r13 = (androidx.lifecycle.b0) this.L$0;
            FpxViewModel fpxViewModel = this.this$0;
            q.a aVar2 = vz.q.f54772b;
            stripeRepository = fpxViewModel.stripeRepository;
            str = fpxViewModel.publishableKey;
            ApiRequest.Options options = new ApiRequest.Options(str, null, null, 6, null);
            this.L$0 = r13;
            this.label = 1;
            obj = stripeRepository.getFpxBankStatus$payments_core_release(options, this);
            i11 = r13;
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vz.r.b(obj);
            return vz.b0.f54756a;
        } else {
            ?? r14 = (androidx.lifecycle.b0) this.L$0;
            vz.r.b(obj);
            i11 = r14;
        }
        b11 = vz.q.b((BankStatuses) obj);
        r12 = i11;
        BankStatuses bankStatuses = new BankStatuses(null, 1, null);
        boolean g11 = vz.q.g(b11);
        BankStatuses bankStatuses2 = b11;
        if (g11) {
            bankStatuses2 = bankStatuses;
        }
        this.L$0 = null;
        this.label = 2;
        if (r12.emit(bankStatuses2, this) == d11) {
            return d11;
        }
        return vz.b0.f54756a;
    }
}