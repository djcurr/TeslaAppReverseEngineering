package com.stripe.android.paymentsheet;

import android.content.res.Resources;
import com.stripe.android.paymentsheet.PaymentOptionsAdapter;

/* loaded from: classes6.dex */
final class PaymentOptionsAdapter$LinkViewHolder$bind$1 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ boolean $isSelected;
    final /* synthetic */ PaymentOptionsAdapter.LinkViewHolder this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAdapter$LinkViewHolder$bind$1(PaymentOptionsAdapter.LinkViewHolder linkViewHolder, boolean z11, boolean z12) {
        super(2);
        this.this$0 = linkViewHolder;
        this.$isSelected = z11;
        this.$isEnabled = z12;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        float f11;
        h00.a aVar;
        if (((i11 & 11) ^ 2) != 0 || !iVar.i()) {
            f11 = this.this$0.width;
            int i12 = R.drawable.stripe_link_mark;
            Resources resources = this.this$0.itemView.getResources();
            int i13 = R.string.link;
            String string = resources.getString(i13);
            String string2 = this.this$0.itemView.getResources().getString(i13);
            aVar = this.this$0.onItemSelectedListener;
            boolean z11 = this.$isSelected;
            boolean z12 = this.$isEnabled;
            kotlin.jvm.internal.s.f(string, "getString(R.string.link)");
            kotlin.jvm.internal.s.f(string2, "getString(R.string.link)");
            PaymentOptionsAdapterKt.m310PaymentOptionUiWtlUe4I(f11, z11, false, z12, i12, null, string, null, string2, null, null, aVar, iVar, 384, 0, 1696);
            return;
        }
        iVar.G();
    }
}