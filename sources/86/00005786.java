package com.stripe.android.paymentsheet.ui;

import com.stripe.android.view.KeyboardController;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class BaseSheetActivity$keyboardController$2 extends u implements h00.a<KeyboardController> {
    final /* synthetic */ BaseSheetActivity<ResultType> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetActivity$keyboardController$2(BaseSheetActivity<ResultType> baseSheetActivity) {
        super(0);
        this.this$0 = baseSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final KeyboardController invoke() {
        return new KeyboardController(this.this$0);
    }
}