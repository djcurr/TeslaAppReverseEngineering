package com.stripe.android.paymentsheet.ui;

import com.stripe.android.link.LinkPaymentLauncher;
import com.stripe.android.link.ui.verification.VerificationDialogKt;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class BaseSheetActivity$onCreate$6$1 extends u implements h00.p<c1.i, Integer, b0> {
    final /* synthetic */ Boolean $show;
    final /* synthetic */ BaseSheetActivity<ResultType> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetActivity$onCreate$6$1(Boolean bool, BaseSheetActivity<ResultType> baseSheetActivity) {
        super(2);
        this.$show = bool;
        this.this$0 = baseSheetActivity;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        h00.l<Boolean, b0> linkVerificationCallback;
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        Boolean show = this.$show;
        s.f(show, "show");
        if (!show.booleanValue() || (linkVerificationCallback = this.this$0.getViewModel().getLinkVerificationCallback()) == null) {
            return;
        }
        VerificationDialogKt.LinkVerificationDialog(this.this$0.getViewModel().getLinkLauncher(), linkVerificationCallback, iVar, LinkPaymentLauncher.$stable);
    }
}