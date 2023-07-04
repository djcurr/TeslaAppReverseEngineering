package com.stripe.android.link.ui.wallet;

import com.stripe.android.link.repositories.LinkRepository;
import com.stripe.android.model.ConsumerPaymentDetails;
import h00.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.u;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.wallet.WalletViewModel$loadPaymentDetails$1", f = "WalletViewModel.kt", l = {143}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class WalletViewModel$loadPaymentDetails$1 extends l implements p<o0, d<? super b0>, Object> {
    int label;
    final /* synthetic */ WalletViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WalletViewModel$loadPaymentDetails$1(WalletViewModel walletViewModel, d<? super WalletViewModel$loadPaymentDetails$1> dVar) {
        super(2, dVar);
        this.this$0 = walletViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new WalletViewModel$loadPaymentDetails$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((WalletViewModel$loadPaymentDetails$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        LinkRepository linkRepository;
        Object mo168listPaymentDetailsgIAlus;
        u uVar;
        u uVar2;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            linkRepository = this.this$0.linkRepository;
            String clientSecret = this.this$0.getLinkAccount().getClientSecret();
            this.label = 1;
            mo168listPaymentDetailsgIAlus = linkRepository.mo168listPaymentDetailsgIAlus(clientSecret, this);
            if (mo168listPaymentDetailsgIAlus == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
            mo168listPaymentDetailsgIAlus = ((q) obj).j();
        }
        WalletViewModel walletViewModel = this.this$0;
        Throwable e11 = q.e(mo168listPaymentDetailsgIAlus);
        if (e11 != null) {
            walletViewModel.onError(e11);
        } else {
            List<ConsumerPaymentDetails.PaymentDetails> paymentDetails = ((ConsumerPaymentDetails) mo168listPaymentDetailsgIAlus).getPaymentDetails();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : paymentDetails) {
                if (obj2 instanceof ConsumerPaymentDetails.Card) {
                    arrayList.add(obj2);
                }
            }
            b0 b0Var = null;
            if (!(!arrayList.isEmpty())) {
                arrayList = null;
            }
            if (arrayList != null) {
                uVar = walletViewModel._paymentDetails;
                uVar.setValue(arrayList);
                uVar2 = walletViewModel._isProcessing;
                uVar2.setValue(b.a(false));
                b0Var = b0.f54756a;
            }
            if (b0Var == null) {
                walletViewModel.addNewPaymentMethod(true);
            }
        }
        return b0.f54756a;
    }
}