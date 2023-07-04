package com.stripe.android.paymentsheet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentMethodsUIKt$PaymentMethodUI$2 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$default;
    final /* synthetic */ int $iconRes;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ int $itemIndex;
    final /* synthetic */ o1.f $modifier;
    final /* synthetic */ h00.l<Integer, vz.b0> $onItemSelectedListener;
    final /* synthetic */ boolean $tintOnSelected;
    final /* synthetic */ String $title;
    final /* synthetic */ float $viewWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PaymentMethodsUIKt$PaymentMethodUI$2(float f11, int i11, String str, boolean z11, boolean z12, boolean z13, int i12, o1.f fVar, h00.l<? super Integer, vz.b0> lVar, int i13, int i14) {
        super(2);
        this.$viewWidth = f11;
        this.$iconRes = i11;
        this.$title = str;
        this.$isSelected = z11;
        this.$isEnabled = z12;
        this.$tintOnSelected = z13;
        this.$itemIndex = i12;
        this.$modifier = fVar;
        this.$onItemSelectedListener = lVar;
        this.$$changed = i13;
        this.$$default = i14;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        PaymentMethodsUIKt.m297PaymentMethodUIZ3Oy47U(this.$viewWidth, this.$iconRes, this.$title, this.$isSelected, this.$isEnabled, this.$tintOnSelected, this.$itemIndex, this.$modifier, this.$onItemSelectedListener, iVar, this.$$changed | 1, this.$$default);
    }
}