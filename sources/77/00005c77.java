package com.stripe.android.view;

@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1$1$emit$2", f = "CardNumberEditText.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CardNumberEditText$onAttachedToWindow$1$1$emit$2 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {
    final /* synthetic */ boolean $it;
    int label;
    final /* synthetic */ CardNumberEditText this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText$onAttachedToWindow$1$1$emit$2(CardNumberEditText cardNumberEditText, boolean z11, zz.d<? super CardNumberEditText$onAttachedToWindow$1$1$emit$2> dVar) {
        super(2, dVar);
        this.this$0 = cardNumberEditText;
        this.$it = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new CardNumberEditText$onAttachedToWindow$1$1$emit$2(this.this$0, this.$it, dVar);
    }

    @Override // h00.p
    public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return ((CardNumberEditText$onAttachedToWindow$1$1$emit$2) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            vz.r.b(obj);
            this.this$0.isLoadingCallback$payments_core_release().invoke(kotlin.coroutines.jvm.internal.b.a(this.$it));
            return vz.b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}