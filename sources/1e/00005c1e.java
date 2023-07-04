package com.stripe.android.view;

import android.content.Context;
import android.view.LayoutInflater;
import com.stripe.android.databinding.BecsDebitWidgetBinding;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class BecsDebitWidget$viewBinding$2 extends kotlin.jvm.internal.u implements h00.a<BecsDebitWidgetBinding> {
    final /* synthetic */ Context $context;
    final /* synthetic */ BecsDebitWidget this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BecsDebitWidget$viewBinding$2(Context context, BecsDebitWidget becsDebitWidget) {
        super(0);
        this.$context = context;
        this.this$0 = becsDebitWidget;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final BecsDebitWidgetBinding invoke() {
        BecsDebitWidgetBinding inflate = BecsDebitWidgetBinding.inflate(LayoutInflater.from(this.$context), this.this$0);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n            Lay…           this\n        )");
        return inflate;
    }
}