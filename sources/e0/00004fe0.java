package com.stripe.android.link.ui.inline;

import androidx.lifecycle.q0;
import h00.l;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v20.k;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class InlineSignupViewModel$watchUserInput$2 extends u implements l<String, b0> {
    final /* synthetic */ InlineSignupViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$2$1", f = "InlineSignupViewModel.kt", l = {94}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.link.ui.inline.InlineSignupViewModel$watchUserInput$2$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements p<o0, d<? super b0>, Object> {
        final /* synthetic */ String $it;
        int label;
        final /* synthetic */ InlineSignupViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InlineSignupViewModel inlineSignupViewModel, String str, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = inlineSignupViewModel;
            this.$it = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<b0> create(Object obj, d<?> dVar) {
            return new AnonymousClass1(this.this$0, this.$it, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, d<? super b0> dVar) {
            return ((AnonymousClass1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            Object lookupConsumerEmail;
            d11 = a00.d.d();
            int i11 = this.label;
            if (i11 == 0) {
                r.b(obj);
                InlineSignupViewModel inlineSignupViewModel = this.this$0;
                String str = this.$it;
                this.label = 1;
                lookupConsumerEmail = inlineSignupViewModel.lookupConsumerEmail(str, this);
                if (lookupConsumerEmail == d11) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InlineSignupViewModel$watchUserInput$2(InlineSignupViewModel inlineSignupViewModel) {
        super(1);
        this.this$0 = inlineSignupViewModel;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(String str) {
        invoke2(str);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String it2) {
        s.g(it2, "it");
        k.d(q0.a(this.this$0), null, null, new AnonymousClass1(this.this$0, it2, null), 3, null);
    }
}