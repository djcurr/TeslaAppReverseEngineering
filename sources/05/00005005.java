package com.stripe.android.link.ui.paymentmethod;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.ui.platform.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.R;
import com.stripe.android.link.theme.ColorKt;
import com.stripe.android.link.ui.CommonKt;
import com.stripe.android.link.ui.ErrorMessage;
import com.stripe.android.link.ui.PrimaryButtonKt;
import com.stripe.android.link.ui.PrimaryButtonState;
import h00.a;
import h00.p;
import h00.q;
import j1.c;
import k2.e;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import o1.f;
import p0.e0;
import p0.i;
import vz.b0;
import w2.d;
import x2.g;
import y0.h0;
import y0.o1;

/* loaded from: classes6.dex */
final class PaymentMethodScreenKt$PaymentMethodBody$5 extends u implements q<i, c1.i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ ErrorMessage $errorMessage;
    final /* synthetic */ q<i, c1.i, Integer, b0> $formContent;
    final /* synthetic */ boolean $isProcessing;
    final /* synthetic */ a<b0> $onPayAnotherWayClick;
    final /* synthetic */ a<b0> $onPrimaryButtonClick;
    final /* synthetic */ boolean $primaryButtonEnabled;
    final /* synthetic */ String $primaryButtonLabel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.stripe.android.link.ui.paymentmethod.PaymentMethodScreenKt$PaymentMethodBody$5$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends u implements p<c1.i, Integer, b0> {
        final /* synthetic */ int $$dirty;
        final /* synthetic */ int $$dirty$1;
        final /* synthetic */ q<i, c1.i, Integer, b0> $formContent;
        final /* synthetic */ i $this_ScrollableTopLevelColumn;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(q<? super i, ? super c1.i, ? super Integer, b0> qVar, i iVar, int i11, int i12) {
            super(2);
            this.$formContent = qVar;
            this.$this_ScrollableTopLevelColumn = iVar;
            this.$$dirty = i11;
            this.$$dirty$1 = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
            } else {
                this.$formContent.invoke(this.$this_ScrollableTopLevelColumn, iVar, Integer.valueOf((this.$$dirty & 14) | ((this.$$dirty$1 >> 15) & 112)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodScreenKt$PaymentMethodBody$5(ErrorMessage errorMessage, String str, boolean z11, boolean z12, a<b0> aVar, int i11, a<b0> aVar2, q<? super i, ? super c1.i, ? super Integer, b0> qVar) {
        super(3);
        this.$errorMessage = errorMessage;
        this.$primaryButtonLabel = str;
        this.$isProcessing = z11;
        this.$primaryButtonEnabled = z12;
        this.$onPrimaryButtonClick = aVar;
        this.$$dirty = i11;
        this.$onPayAnotherWayClick = aVar2;
        this.$formContent = qVar;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, c1.i iVar2, Integer num) {
        invoke(iVar, iVar2, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i ScrollableTopLevelColumn, c1.i iVar, int i11) {
        int i12;
        int i13;
        PrimaryButtonState primaryButtonState;
        s.g(ScrollableTopLevelColumn, "$this$ScrollableTopLevelColumn");
        if ((i11 & 14) == 0) {
            i12 = i11 | (iVar.O(ScrollableTopLevelColumn) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (((i12 & 91) ^ 18) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        String b11 = e.b(R.string.pm_add_new_card, iVar, 0);
        f.a aVar = f.f42062f1;
        f l11 = p0.u.l(aVar, BitmapDescriptorFactory.HUE_RED, g.f(4), BitmapDescriptorFactory.HUE_RED, g.f(32), 5, null);
        int a11 = d.f55400b.a();
        h0 h0Var = h0.f58131a;
        o1.b(b11, l11, h0Var.a(iVar, 8).g(), 0L, null, null, null, 0L, null, d.g(a11), 0L, 0, false, 0, null, h0Var.c(iVar, 8).g(), iVar, 48, 0, 32248);
        ColorKt.PaymentsThemeForLink(c.b(iVar, -819894135, true, new AnonymousClass1(this.$formContent, ScrollableTopLevelColumn, i12, this.$$dirty)), iVar, 6);
        p0.h0.a(e0.o(aVar, g.f(8)), iVar, 6);
        ErrorMessage errorMessage = this.$errorMessage;
        iVar.x(-774879156);
        if (errorMessage == null) {
            i13 = 0;
        } else {
            Resources resources = ((Context) iVar.A(z.g())).getResources();
            s.f(resources, "LocalContext.current.resources");
            i13 = 0;
            CommonKt.ErrorText(errorMessage.getMessage(resources), iVar, 0);
        }
        iVar.N();
        String str = this.$primaryButtonLabel;
        if (this.$isProcessing) {
            primaryButtonState = PrimaryButtonState.Processing;
        } else {
            primaryButtonState = this.$primaryButtonEnabled ? PrimaryButtonState.Enabled : PrimaryButtonState.Disabled;
        }
        Integer valueOf = Integer.valueOf(R.drawable.stripe_ic_lock);
        a<b0> aVar2 = this.$onPrimaryButtonClick;
        int i14 = this.$$dirty;
        PrimaryButtonKt.PrimaryButton(str, primaryButtonState, valueOf, aVar2, iVar, ((i14 >> 3) & 14) | ((i14 >> 3) & 7168), 0);
        PrimaryButtonKt.SecondaryButton(!this.$isProcessing, e.b(R.string.wallet_pay_another_way, iVar, i13), this.$onPayAnotherWayClick, iVar, (this.$$dirty >> 9) & 896);
    }
}