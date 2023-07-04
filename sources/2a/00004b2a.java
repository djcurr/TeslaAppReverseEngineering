package com.stripe.android;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.DefaultFraudDetectionDataRepository$refresh$1", f = "FraudDetectionDataRepository.kt", l = {64}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class DefaultFraudDetectionDataRepository$refresh$1 extends l implements p<o0, zz.d<? super b0>, Object> {
    int label;
    final /* synthetic */ DefaultFraudDetectionDataRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataRepository$refresh$1(DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository, zz.d<? super DefaultFraudDetectionDataRepository$refresh$1> dVar) {
        super(2, dVar);
        this.this$0 = defaultFraudDetectionDataRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
        return new DefaultFraudDetectionDataRepository$refresh$1(this.this$0, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super b0> dVar) {
        return ((DefaultFraudDetectionDataRepository$refresh$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            DefaultFraudDetectionDataRepository defaultFraudDetectionDataRepository = this.this$0;
            this.label = 1;
            if (defaultFraudDetectionDataRepository.getLatest(this) == d11) {
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