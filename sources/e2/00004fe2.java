package com.stripe.android.link.ui.inline;

import h00.p;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlinx.coroutines.flow.h0;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$3", f = "InlineSignupViewModel.kt", l = {100}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class InlineSignupViewModel$watchUserInput$3 extends l implements p<o0, d<? super b0>, Object> {
    int label;
    final /* synthetic */ InlineSignupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineSignupViewModel$watchUserInput$3(InlineSignupViewModel inlineSignupViewModel, d<? super InlineSignupViewModel$watchUserInput$3> dVar) {
        super(2, dVar);
        this.this$0 = inlineSignupViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new InlineSignupViewModel$watchUserInput$3(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((InlineSignupViewModel$watchUserInput$3) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        h0 h0Var;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            h0Var = this.this$0.consumerPhoneNumber;
            final InlineSignupViewModel inlineSignupViewModel = this.this$0;
            kotlinx.coroutines.flow.f<String> fVar = new kotlinx.coroutines.flow.f<String>() { // from class: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$3.1
                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(String str, d dVar) {
                    return emit2(str, (d<? super b0>) dVar);
                }

                /* renamed from: emit  reason: avoid collision after fix types in other method */
                public final Object emit2(String str, d<? super b0> dVar) {
                    InlineSignupViewModel.this.onPhoneInput(str);
                    return b0.f54756a;
                }
            };
            this.label = 1;
            if (h0Var.collect(fVar, this) == d11) {
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