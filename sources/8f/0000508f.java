package com.stripe.android.link.ui.wallet;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.z;
import c1.o0;
import com.stripe.android.link.R;
import com.stripe.android.link.ui.CommonKt;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.PrimaryButtonState;
import com.stripe.android.model.ConsumerPaymentDetails;
import h00.a;
import h00.l;
import h00.q;
import java.util.List;
import k2.e;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l1.b;
import o1.f;
import p0.e0;
import p0.h0;
import p0.i;
import vz.b0;
import x2.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class WalletScreenKt$WalletBody$9 extends u implements q<i, c1.i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ o0<ConsumerPaymentDetails.Card> $cardBeingRemoved$delegate;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ o0<Boolean> $isWalletExpanded$delegate;
    final /* synthetic */ a<b0> $onAddNewPaymentMethodClick;
    final /* synthetic */ l<ConsumerPaymentDetails.PaymentDetails, b0> $onEditPaymentMethod;
    final /* synthetic */ a<b0> $onPayAnotherWayClick;
    final /* synthetic */ l<ConsumerPaymentDetails.PaymentDetails, b0> $onPrimaryButtonClick;
    final /* synthetic */ List<ConsumerPaymentDetails.PaymentDetails> $paymentDetails;
    final /* synthetic */ String $primaryButtonLabel;
    final /* synthetic */ l<q<? super i, ? super c1.i, ? super Integer, b0>, b0> $showBottomSheetContent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.wallet.WalletScreenKt$WalletBody$9$6  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass6 extends u implements a<b0> {
        final /* synthetic */ l<ConsumerPaymentDetails.PaymentDetails, b0> $onPrimaryButtonClick;
        final /* synthetic */ List<ConsumerPaymentDetails.PaymentDetails> $paymentDetails;
        final /* synthetic */ o0<Integer> $selectedIndex$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass6(l<? super ConsumerPaymentDetails.PaymentDetails, b0> lVar, List<? extends ConsumerPaymentDetails.PaymentDetails> list, o0<Integer> o0Var) {
            super(0);
            this.$onPrimaryButtonClick = lVar;
            this.$paymentDetails = list;
            this.$selectedIndex$delegate = o0Var;
        }

        @Override // h00.a
        public /* bridge */ /* synthetic */ b0 invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.$onPrimaryButtonClick.invoke(this.$paymentDetails.get(WalletScreenKt$WalletBody$9.m263invoke$lambda0(this.$selectedIndex$delegate)));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WalletScreenKt$WalletBody$9(List<? extends ConsumerPaymentDetails.PaymentDetails> list, boolean z11, l<? super q<? super i, ? super c1.i, ? super Integer, b0>, b0> lVar, l<? super ConsumerPaymentDetails.PaymentDetails, b0> lVar2, o0<ConsumerPaymentDetails.Card> o0Var, int i11, a<b0> aVar, o0<Boolean> o0Var2, ErrorMessage errorMessage, String str, a<b0> aVar2, l<? super ConsumerPaymentDetails.PaymentDetails, b0> lVar3) {
        super(3);
        this.$paymentDetails = list;
        this.$isProcessing = z11;
        this.$showBottomSheetContent = lVar;
        this.$onEditPaymentMethod = lVar2;
        this.$cardBeingRemoved$delegate = o0Var;
        this.$$dirty = i11;
        this.$onAddNewPaymentMethodClick = aVar;
        this.$isWalletExpanded$delegate = o0Var2;
        this.$errorMessage = errorMessage;
        this.$primaryButtonLabel = str;
        this.$onPayAnotherWayClick = aVar2;
        this.$onPrimaryButtonClick = lVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-0  reason: not valid java name */
    public static final int m263invoke$lambda0(o0<Integer> o0Var) {
        return o0Var.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invoke$lambda-1  reason: not valid java name */
    public static final void m264invoke$lambda1(o0<Integer> o0Var, int i11) {
        o0Var.setValue(Integer.valueOf(i11));
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
        invoke(iVar, iVar2, num.intValue());
        return b0.f54756a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r19v0, types: [c1.i] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final void invoke(i ScrollableTopLevelColumn, c1.i iVar, int i11) {
        boolean m252WalletBody$lambda3;
        PrimaryButtonState primaryButtonState;
        s.g(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
        if (((i11 & 81) ^ 16) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        f.a aVar = f.f42062f1;
        h0.a(e0.o(aVar, g.f(12)), iVar, 6);
        o0 o0Var = (o0) b.b(new Object[0], null, null, new WalletScreenKt$WalletBody$9$selectedIndex$2(this.$paymentDetails), iVar, 8, 6);
        m252WalletBody$lambda3 = WalletScreenKt.m252WalletBody$lambda3(this.$isWalletExpanded$delegate);
        if (m252WalletBody$lambda3) {
            iVar.x(-494981652);
            List<ConsumerPaymentDetails.PaymentDetails> list = this.$paymentDetails;
            int m263invoke$lambda0 = m263invoke$lambda0(o0Var);
            boolean z11 = !this.$isProcessing;
            iVar.x(-3686930);
            boolean O = iVar.O(o0Var);
            Object y11 = iVar.y();
            if (O || y11 == c1.i.f8486a.a()) {
                y11 = new WalletScreenKt$WalletBody$9$1$1(o0Var);
                iVar.p(y11);
            }
            iVar.N();
            l lVar = y11;
            l<q<? super i, ? super c1.i, ? super Integer, b0>, b0> lVar2 = this.$showBottomSheetContent;
            l<ConsumerPaymentDetails.PaymentDetails, b0> lVar3 = this.$onEditPaymentMethod;
            o0<ConsumerPaymentDetails.Card> o0Var2 = this.$cardBeingRemoved$delegate;
            int i12 = this.$$dirty;
            iVar.x(-3686095);
            boolean O2 = iVar.O(lVar2) | iVar.O(lVar3) | iVar.O(o0Var2);
            Object y12 = iVar.y();
            if (O2 || y12 == c1.i.f8486a.a()) {
                y12 = new WalletScreenKt$WalletBody$9$2$1(lVar2, i12, lVar3, o0Var2);
                iVar.p(y12);
            }
            iVar.N();
            l lVar4 = y12;
            a<b0> aVar2 = this.$onAddNewPaymentMethodClick;
            o0<Boolean> o0Var3 = this.$isWalletExpanded$delegate;
            iVar.x(-3686930);
            boolean O3 = iVar.O(o0Var3);
            Object y13 = iVar.y();
            if (O3 || y13 == c1.i.f8486a.a()) {
                y13 = new WalletScreenKt$WalletBody$9$3$1(o0Var3);
                iVar.p(y13);
            }
            iVar.N();
            WalletScreenKt.ExpandedPaymentDetails(list, m263invoke$lambda0, z11, lVar, lVar4, aVar2, y13, iVar, (458752 & (this.$$dirty << 3)) | 8);
            iVar.N();
        } else {
            iVar.x(-494980346);
            ConsumerPaymentDetails.PaymentDetails paymentDetails = this.$paymentDetails.get(m263invoke$lambda0(o0Var));
            boolean z12 = !this.$isProcessing;
            o0<Boolean> o0Var4 = this.$isWalletExpanded$delegate;
            iVar.x(-3686930);
            boolean O4 = iVar.O(o0Var4);
            Object y14 = iVar.y();
            if (O4 || y14 == c1.i.f8486a.a()) {
                y14 = new WalletScreenKt$WalletBody$9$4$1(o0Var4);
                iVar.p(y14);
            }
            iVar.N();
            WalletScreenKt.CollapsedPaymentDetails(paymentDetails, z12, (a) y14, iVar, ConsumerPaymentDetails.PaymentDetails.$stable);
            iVar.N();
        }
        h0.a(e0.o(aVar, g.f(20)), iVar, 6);
        ErrorMessage errorMessage = this.$errorMessage;
        iVar.x(-494979969);
        if (errorMessage != null) {
            Resources resources = ((Context) iVar.A(z.g())).getResources();
            s.f(resources, "LocalContext.current.resources");
            CommonKt.ErrorText(errorMessage.getMessage(resources), iVar, 0);
        }
        iVar.N();
        String str = this.$primaryButtonLabel;
        if (this.$isProcessing) {
            primaryButtonState = PrimaryButtonState.Processing;
        } else {
            primaryButtonState = PrimaryButtonState.Enabled;
        }
        PrimaryButtonKt.PrimaryButton(str, primaryButtonState, Integer.valueOf(R.drawable.stripe_ic_lock), new AnonymousClass6(this.$onPrimaryButtonClick, this.$paymentDetails, o0Var), iVar, (this.$$dirty >> 6) & 14, 0);
        PrimaryButtonKt.SecondaryButton(!this.$isProcessing, e.b(R.string.wallet_pay_another_way, iVar, 0), this.$onPayAnotherWayClick, iVar, (this.$$dirty >> 18) & 896);
    }
}