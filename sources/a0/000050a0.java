package com.stripe.android.link.ui.wallet;

import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.model.ConsumerPaymentDetails;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.wallet.WalletViewModel$deletePaymentMethod$1", f = "WalletViewModel.kt", l = {128}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class WalletViewModel$deletePaymentMethod$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ ConsumerPaymentDetails.PaymentDetails $paymentDetails;
    int label;
    final /* synthetic */ WalletViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$deletePaymentMethod$1(WalletViewModel walletViewModel, ConsumerPaymentDetails.PaymentDetails paymentDetails, d<? super WalletViewModel$deletePaymentMethod$1> dVar) {
        super(2, dVar);
        this.this$0 = walletViewModel;
        this.$paymentDetails = paymentDetails;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new WalletViewModel$deletePaymentMethod$1(this.this$0, this.$paymentDetails, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((WalletViewModel$deletePaymentMethod$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        LinkRepository linkRepository;
        Object mo167deletePaymentDetails0E7RQCE;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            linkRepository = this.this$0.linkRepository;
            String clientSecret = this.this$0.getLinkAccount().getClientSecret();
            String id2 = this.$paymentDetails.getId();
            this.label = 1;
            mo167deletePaymentDetails0E7RQCE = linkRepository.mo167deletePaymentDetails0E7RQCE(clientSecret, id2, this);
            if (mo167deletePaymentDetails0E7RQCE == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
            mo167deletePaymentDetails0E7RQCE = ((q) obj).j();
        }
        WalletViewModel walletViewModel = this.this$0;
        Throwable e11 = q.e(mo167deletePaymentDetails0E7RQCE);
        if (e11 == null) {
            b0 b0Var = (b0) mo167deletePaymentDetails0E7RQCE;
            walletViewModel.loadPaymentDetails();
        } else {
            walletViewModel.onError(e11);
        }
        return b0.f54756a;
    }
}