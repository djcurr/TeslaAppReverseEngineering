package com.stripe.android.paymentsheet;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentOptionsAdapterKt$PaymentOptionUi$3 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ int $$changed1;
    final /* synthetic */ int $$default;
    final /* synthetic */ String $description;
    final /* synthetic */ int $iconRes;
    final /* synthetic */ boolean $isEditing;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ Integer $labelIcon;
    final /* synthetic */ String $labelText;
    final /* synthetic */ h00.a<vz.b0> $onItemSelectedListener;
    final /* synthetic */ String $onRemoveAccessibilityDescription;
    final /* synthetic */ h00.a<vz.b0> $onRemoveListener;
    final /* synthetic */ String $removePmDialogTitle;
    final /* synthetic */ float $viewWidth;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAdapterKt$PaymentOptionUi$3(float f11, boolean z11, boolean z12, boolean z13, int i11, Integer num, String str, String str2, String str3, h00.a<vz.b0> aVar, String str4, h00.a<vz.b0> aVar2, int i12, int i13, int i14) {
        super(2);
        this.$viewWidth = f11;
        this.$isSelected = z11;
        this.$isEditing = z12;
        this.$isEnabled = z13;
        this.$iconRes = i11;
        this.$labelIcon = num;
        this.$labelText = str;
        this.$removePmDialogTitle = str2;
        this.$description = str3;
        this.$onRemoveListener = aVar;
        this.$onRemoveAccessibilityDescription = str4;
        this.$onItemSelectedListener = aVar2;
        this.$$changed = i12;
        this.$$changed1 = i13;
        this.$$default = i14;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        PaymentOptionsAdapterKt.m310PaymentOptionUiWtlUe4I(this.$viewWidth, this.$isSelected, this.$isEditing, this.$isEnabled, this.$iconRes, this.$labelIcon, this.$labelText, this.$removePmDialogTitle, this.$description, this.$onRemoveListener, this.$onRemoveAccessibilityDescription, this.$onItemSelectedListener, iVar, this.$$changed | 1, this.$$changed1, this.$$default);
    }
}