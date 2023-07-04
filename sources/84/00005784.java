package com.stripe.android.paymentsheet.ui;

import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class BaseSheetActivity$bottomSheetBehavior$2 extends u implements h00.a<BottomSheetBehavior<ViewGroup>> {
    final /* synthetic */ BaseSheetActivity<ResultType> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetActivity$bottomSheetBehavior$2(BaseSheetActivity<ResultType> baseSheetActivity) {
        super(0);
        this.this$0 = baseSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final BottomSheetBehavior<ViewGroup> invoke() {
        return BottomSheetBehavior.c0(this.this$0.getBottomSheet());
    }
}