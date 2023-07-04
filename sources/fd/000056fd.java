package com.stripe.android.paymentsheet.paymentdatacollection;

import androidx.lifecycle.p;
import com.stripe.android.paymentsheet.forms.FormFieldValues;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import v20.o0;
import vz.b0;
import vz.k;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.paymentsheet.paymentdatacollection.ComposeFormDataCollectionFragment$onViewCreated$1", f = "ComposeFormDataCollectionFragment.kt", l = {104}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class ComposeFormDataCollectionFragment$onViewCreated$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ k<BaseSheetViewModel<? extends Object>> $sheetViewModel$delegate;
    int label;
    final /* synthetic */ ComposeFormDataCollectionFragment this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ComposeFormDataCollectionFragment$onViewCreated$1(ComposeFormDataCollectionFragment composeFormDataCollectionFragment, k<? extends BaseSheetViewModel<? extends Object>> kVar, d<? super ComposeFormDataCollectionFragment$onViewCreated$1> dVar) {
        super(2, dVar);
        this.this$0 = composeFormDataCollectionFragment;
        this.$sheetViewModel$delegate = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new ComposeFormDataCollectionFragment$onViewCreated$1(this.this$0, this.$sheetViewModel$delegate, dVar);
    }

    @Override // h00.p
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo160invoke(o0 o0Var, d<? super b0> dVar) {
        return ((ComposeFormDataCollectionFragment$onViewCreated$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            e<FormFieldValues> completeFormValues = this.this$0.getFormViewModel().getCompleteFormValues();
            androidx.lifecycle.p lifecycle = this.this$0.getLifecycle();
            s.f(lifecycle, "lifecycle");
            e k11 = g.k(androidx.lifecycle.k.a(completeFormValues, lifecycle, p.c.STARTED));
            final ComposeFormDataCollectionFragment composeFormDataCollectionFragment = this.this$0;
            final k<BaseSheetViewModel<? extends Object>> kVar = this.$sheetViewModel$delegate;
            kotlinx.coroutines.flow.f<FormFieldValues> fVar = new kotlinx.coroutines.flow.f<FormFieldValues>() { // from class: com.stripe.android.paymentsheet.paymentdatacollection.ComposeFormDataCollectionFragment$onViewCreated$1.1
                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(FormFieldValues formFieldValues, d dVar) {
                    return emit2(formFieldValues, (d<? super b0>) dVar);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(FormFieldValues formFieldValues, d<? super b0> dVar) {
                    BaseSheetViewModel m327onViewCreated$lambda1;
                    BaseSheetViewModel m327onViewCreated$lambda12;
                    m327onViewCreated$lambda1 = ComposeFormDataCollectionFragment.m327onViewCreated$lambda1(kVar);
                    ComposeFormDataCollectionFragment composeFormDataCollectionFragment2 = ComposeFormDataCollectionFragment.this;
                    m327onViewCreated$lambda12 = ComposeFormDataCollectionFragment.m327onViewCreated$lambda1(kVar);
                    m327onViewCreated$lambda1.updateSelection(composeFormDataCollectionFragment2.transformToPaymentSelection$paymentsheet_release(formFieldValues, m327onViewCreated$lambda12.getAddFragmentSelectedLPM$paymentsheet_release()));
                    return b0.f54756a;
                }
            };
            this.label = 1;
            if (k11.collect(fVar, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return b0.f54756a;
    }
}