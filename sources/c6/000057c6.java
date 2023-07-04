package com.stripe.android.paymentsheet.viewmodels;

import com.stripe.android.paymentsheet.PrefsRepository;
import com.stripe.android.paymentsheet.model.SavedSelection;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel$1$savedSelection$1", f = "BaseSheetViewModel.kt", l = {239, 239}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class BaseSheetViewModel$1$savedSelection$1 extends l implements p<o0, d<? super SavedSelection>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ BaseSheetViewModel<TransitionTargetType> this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetViewModel$1$savedSelection$1(BaseSheetViewModel<TransitionTargetType> baseSheetViewModel, d<? super BaseSheetViewModel$1$savedSelection$1> dVar) {
        super(2, dVar);
        this.this$0 = baseSheetViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new BaseSheetViewModel$1$savedSelection$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super SavedSelection> dVar) {
        return ((BaseSheetViewModel$1$savedSelection$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        PrefsRepository prefsRepository;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            prefsRepository = this.this$0.getPrefsRepository();
            e a11 = androidx.lifecycle.l.a(this.this$0.isGooglePayReady$paymentsheet_release());
            this.L$0 = prefsRepository;
            this.label = 1;
            obj = g.r(a11, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
        } else {
            prefsRepository = (PrefsRepository) this.L$0;
            r.b(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        this.L$0 = null;
        this.label = 2;
        obj = prefsRepository.getSavedSelection(booleanValue, this);
        return obj == d11 ? d11 : obj;
    }
}