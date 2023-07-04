package com.stripe.android.view;

import com.stripe.android.cards.CardAccountRangeRepository;
import org.spongycastle.crypto.tls.CipherSuite;
import v20.e1;

@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1", f = "CardNumberEditText.kt", l = {CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CardNumberEditText$onAttachedToWindow$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {
    int label;
    final /* synthetic */ CardNumberEditText this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardNumberEditText$onAttachedToWindow$1(CardNumberEditText cardNumberEditText, zz.d<? super CardNumberEditText$onAttachedToWindow$1> dVar) {
        super(2, dVar);
        this.this$0 = cardNumberEditText;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new CardNumberEditText$onAttachedToWindow$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return ((CardNumberEditText$onAttachedToWindow$1) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        CardAccountRangeRepository cardAccountRangeRepository;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            vz.r.b(obj);
            cardAccountRangeRepository = this.this$0.cardAccountRangeRepository;
            kotlinx.coroutines.flow.e<Boolean> loading = cardAccountRangeRepository.getLoading();
            final CardNumberEditText cardNumberEditText = this.this$0;
            kotlinx.coroutines.flow.f<Boolean> fVar = new kotlinx.coroutines.flow.f<Boolean>() { // from class: com.stripe.android.view.CardNumberEditText$onAttachedToWindow$1.1
                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Boolean bool, zz.d dVar) {
                    return emit(bool.booleanValue(), dVar);
                }

                public final Object emit(boolean z11, zz.d<? super vz.b0> dVar) {
                    Object d12;
                    Object g11 = v20.i.g(e1.c(), new CardNumberEditText$onAttachedToWindow$1$1$emit$2(CardNumberEditText.this, z11, null), dVar);
                    d12 = a00.d.d();
                    return g11 == d12 ? g11 : vz.b0.f54756a;
                }
            };
            this.label = 1;
            if (loading.collect(fVar, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        return vz.b0.f54756a;
    }
}