package com.stripe.android.payments.bankaccount.ui;

import com.stripe.android.payments.bankaccount.ui.CollectBankAccountViewEffect;
import h00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.y;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$1", f = "CollectBankAccountActivity.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CollectBankAccountActivity$onCreate$1 extends l implements p<o0, d<? super b0>, Object> {
    int label;
    final /* synthetic */ CollectBankAccountActivity this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectBankAccountActivity$onCreate$1(CollectBankAccountActivity collectBankAccountActivity, d<? super CollectBankAccountActivity$onCreate$1> dVar) {
        super(2, dVar);
        this.this$0 = collectBankAccountActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CollectBankAccountActivity$onCreate$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((CollectBankAccountActivity$onCreate$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        CollectBankAccountViewModel viewModel;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            viewModel = this.this$0.getViewModel();
            y<CollectBankAccountViewEffect> viewEffect = viewModel.getViewEffect();
            final CollectBankAccountActivity collectBankAccountActivity = this.this$0;
            kotlinx.coroutines.flow.f<CollectBankAccountViewEffect> fVar = new kotlinx.coroutines.flow.f<CollectBankAccountViewEffect>() { // from class: com.stripe.android.payments.bankaccount.ui.CollectBankAccountActivity$onCreate$1.1
                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(CollectBankAccountViewEffect collectBankAccountViewEffect, d dVar) {
                    return emit2(collectBankAccountViewEffect, (d<? super b0>) dVar);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(CollectBankAccountViewEffect collectBankAccountViewEffect, d<? super b0> dVar) {
                    if (collectBankAccountViewEffect instanceof CollectBankAccountViewEffect.OpenConnectionsFlow) {
                        CollectBankAccountActivity.this.launch((CollectBankAccountViewEffect.OpenConnectionsFlow) collectBankAccountViewEffect);
                    } else if (collectBankAccountViewEffect instanceof CollectBankAccountViewEffect.FinishWithResult) {
                        CollectBankAccountActivity.this.launch((CollectBankAccountViewEffect.FinishWithResult) collectBankAccountViewEffect);
                    }
                    return b0.f54756a;
                }
            };
            this.label = 1;
            if (viewEffect.collect(fVar, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}