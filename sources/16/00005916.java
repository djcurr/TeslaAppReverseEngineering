package com.stripe.android.stripe3ds2.views;

import androidx.lifecycle.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1", f = "ChallengeActivityViewModel.kt", l = {61, 60}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class ChallengeActivityViewModel$getTimeout$1 extends kotlin.coroutines.jvm.internal.l implements h00.p<b0<Boolean>, zz.d<? super vz.b0>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChallengeActivityViewModel this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1$1", f = "ChallengeActivityViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.stripe.android.stripe3ds2.views.ChallengeActivityViewModel$getTimeout$1$1  reason: invalid class name */
    /* loaded from: classes6.dex */
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.l implements h00.p<Boolean, zz.d<? super Boolean>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass1(zz.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(dVar);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, zz.d<? super Boolean> dVar) {
            return invoke(bool.booleanValue(), dVar);
        }

        public final Object invoke(boolean z11, zz.d<? super Boolean> dVar) {
            return ((AnonymousClass1) create(Boolean.valueOf(z11), dVar)).invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.label == 0) {
                r.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.Z$0);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChallengeActivityViewModel$getTimeout$1(ChallengeActivityViewModel challengeActivityViewModel, zz.d<? super ChallengeActivityViewModel$getTimeout$1> dVar) {
        super(2, dVar);
        this.this$0 = challengeActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        ChallengeActivityViewModel$getTimeout$1 challengeActivityViewModel$getTimeout$1 = new ChallengeActivityViewModel$getTimeout$1(this.this$0, dVar);
        challengeActivityViewModel$getTimeout$1.L$0 = obj;
        return challengeActivityViewModel$getTimeout$1;
    }

    @Override // h00.p
    public final Object invoke(b0<Boolean> b0Var, zz.d<? super vz.b0> dVar) {
        return ((ChallengeActivityViewModel$getTimeout$1) create(b0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        b0 b0Var;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            b0Var = (b0) this.L$0;
            kotlinx.coroutines.flow.e<Boolean> timeout = this.this$0.transactionTimer.getTimeout();
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
            this.L$0 = b0Var;
            this.label = 1;
            obj = kotlinx.coroutines.flow.g.s(timeout, anonymousClass1, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return vz.b0.f54756a;
        } else {
            b0Var = (b0) this.L$0;
            r.b(obj);
        }
        this.L$0 = null;
        this.label = 2;
        if (b0Var.emit(obj, this) == d11) {
            return d11;
        }
        return vz.b0.f54756a;
    }
}