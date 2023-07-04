package com.stripe.android.link.ui.cardedit;

import c1.v1;
import com.stripe.android.ui.core.elements.IdentifierSpec;
import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.a;
import java.util.Map;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class CardEditScreenKt$CardEditBody$2$2 extends u implements a<b0> {
    final /* synthetic */ v1<Map<IdentifierSpec, FormFieldEntry>> $formValues$delegate;
    final /* synthetic */ CardEditViewModel $viewModel;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardEditScreenKt$CardEditBody$2$2(v1<? extends Map<IdentifierSpec, FormFieldEntry>> v1Var, CardEditViewModel cardEditViewModel) {
        super(0);
        this.$formValues$delegate = v1Var;
        this.$viewModel = cardEditViewModel;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        Map<IdentifierSpec, FormFieldEntry> m203CardEditBody$lambda6$lambda2;
        m203CardEditBody$lambda6$lambda2 = CardEditScreenKt.m203CardEditBody$lambda6$lambda2(this.$formValues$delegate);
        if (m203CardEditBody$lambda6$lambda2 == null) {
            return;
        }
        this.$viewModel.updateCard(m203CardEditBody$lambda6$lambda2);
    }
}