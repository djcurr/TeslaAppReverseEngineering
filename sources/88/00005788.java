package com.stripe.android.paymentsheet.ui;

import com.stripe.android.ui.core.PaymentsThemeKt;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class BaseSheetActivity$setupHeader$1$1 extends u implements h00.p<c1.i, Integer, b0> {
    final /* synthetic */ BaseSheetActivity<ResultType> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetActivity$setupHeader$1$1(BaseSheetActivity<ResultType> baseSheetActivity) {
        super(2);
        this.this$0 = baseSheetActivity;
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
            return;
        }
        String str = (String) k1.b.a(this.this$0.getViewModel().getHeaderText$paymentsheet_release(), iVar, 8).getValue();
        if (str == null) {
            return;
        }
        PaymentsThemeKt.PaymentsTheme(null, null, null, j1.c.b(iVar, -819902821, true, new BaseSheetActivity$setupHeader$1$1$1$1(str)), iVar, 3072, 7);
    }
}