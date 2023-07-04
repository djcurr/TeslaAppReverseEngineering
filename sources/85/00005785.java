package com.stripe.android.paymentsheet.ui;

import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.stripe.android.paymentsheet.BottomSheetController;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class BaseSheetActivity$bottomSheetController$2 extends u implements h00.a<BottomSheetController> {
    final /* synthetic */ BaseSheetActivity<ResultType> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetActivity$bottomSheetController$2(BaseSheetActivity<ResultType> baseSheetActivity) {
        super(0);
        this.this$0 = baseSheetActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final BottomSheetController invoke() {
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior = this.this$0.getBottomSheetBehavior$paymentsheet_release();
        s.f(bottomSheetBehavior, "bottomSheetBehavior");
        return new BottomSheetController(bottomSheetBehavior);
    }
}