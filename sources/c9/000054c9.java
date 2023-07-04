package com.stripe.android.paymentsheet;

import androidx.compose.ui.platform.o1;
import com.stripe.android.ui.core.forms.resources.LpmRepository;
import h00.r;
import java.util.List;

/* loaded from: classes6.dex */
public final class PaymentMethodsUIKt$PaymentMethodsUI$3$1$1$invoke$$inlined$itemsIndexed$default$2 extends kotlin.jvm.internal.u implements r<q0.d, Integer, c1.i, Integer, vz.b0> {
    final /* synthetic */ int $$dirty$inlined;
    final /* synthetic */ boolean $isEnabled$inlined;
    final /* synthetic */ List $items;
    final /* synthetic */ h00.l $onItemSelectedListener$inlined;
    final /* synthetic */ List $paymentMethods$inlined;
    final /* synthetic */ int $selectedIndex$inlined;
    final /* synthetic */ float $viewWidth$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsUIKt$PaymentMethodsUI$3$1$1$invoke$$inlined$itemsIndexed$default$2(List list, int i11, float f11, boolean z11, int i12, h00.l lVar, List list2) {
        super(4);
        this.$items = list;
        this.$selectedIndex$inlined = i11;
        this.$viewWidth$inlined = f11;
        this.$isEnabled$inlined = z11;
        this.$$dirty$inlined = i12;
        this.$onItemSelectedListener$inlined = lVar;
        this.$paymentMethods$inlined = list2;
    }

    @Override // h00.r
    public /* bridge */ /* synthetic */ vz.b0 invoke(q0.d dVar, Integer num, c1.i iVar, Integer num2) {
        invoke(dVar, num.intValue(), iVar, num2.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(q0.d items, int i11, c1.i iVar, int i12) {
        int i13;
        int i14;
        kotlin.jvm.internal.s.g(items, "$this$items");
        if ((i12 & 14) == 0) {
            i13 = i12 | (iVar.O(items) ? 4 : 2);
        } else {
            i13 = i12;
        }
        if ((i12 & 112) == 0) {
            i13 |= iVar.d(i11) ? 32 : 16;
        }
        if (((i13 & 731) ^ 146) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        int i15 = (i13 & 112) | (i13 & 14);
        LpmRepository.SupportedPaymentMethod supportedPaymentMethod = (LpmRepository.SupportedPaymentMethod) this.$items.get(i11);
        if ((i15 & 112) == 0) {
            i14 = (iVar.d(i11) ? 32 : 16) | i15;
        } else {
            i14 = i15;
        }
        if ((i15 & 896) == 0) {
            i14 |= iVar.O(supportedPaymentMethod) ? 256 : 128;
        }
        if (((i14 & 5841) ^ 1168) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        o1.f a11 = o1.a(o1.f.f42062f1, kotlin.jvm.internal.s.p(PaymentMethodsUIKt.TEST_TAG_LIST, k2.e.b(supportedPaymentMethod.getDisplayNameResource(), iVar, 0)));
        PaymentMethodsUIKt.m297PaymentMethodUIZ3Oy47U(this.$viewWidth$inlined, supportedPaymentMethod.getIconResource(), k2.e.b(supportedPaymentMethod.getDisplayNameResource(), iVar, 0), i11 == this.$selectedIndex$inlined, this.$isEnabled$inlined, supportedPaymentMethod.getTintIconOnSelection(), i11, a11, new PaymentMethodsUIKt$PaymentMethodsUI$3$1$1$1$1(this.$onItemSelectedListener$inlined, this.$paymentMethods$inlined), iVar, (57344 & (this.$$dirty$inlined << 6)) | ((i14 << 15) & 3670016), 0);
    }
}