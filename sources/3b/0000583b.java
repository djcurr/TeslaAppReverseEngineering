package com.stripe.android.stripe3ds2.observability;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.q;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.stripe3ds2.observability.DefaultErrorReporter$reportError$1", f = "DefaultErrorReporter.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class DefaultErrorReporter$reportError$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ Throwable $t;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DefaultErrorReporter this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultErrorReporter$reportError$1(DefaultErrorReporter defaultErrorReporter, Throwable th2, d<? super DefaultErrorReporter$reportError$1> dVar) {
        super(2, dVar);
        this.this$0 = defaultErrorReporter;
        this.$t = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        DefaultErrorReporter$reportError$1 defaultErrorReporter$reportError$1 = new DefaultErrorReporter$reportError$1(this.this$0, this.$t, dVar);
        defaultErrorReporter$reportError$1.L$0 = obj;
        return defaultErrorReporter$reportError$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((DefaultErrorReporter$reportError$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object b11;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            o0 o0Var = (o0) this.L$0;
            DefaultErrorReporter defaultErrorReporter = this.this$0;
            Throwable th2 = this.$t;
            try {
                q.a aVar = q.f54772b;
                defaultErrorReporter.send(defaultErrorReporter.createRequestBody$3ds2sdk_release(th2));
                b11 = q.b(b0.f54756a);
            } catch (Throwable th3) {
                q.a aVar2 = q.f54772b;
                b11 = q.b(r.a(th3));
            }
            DefaultErrorReporter defaultErrorReporter2 = this.this$0;
            Throwable e11 = q.e(b11);
            if (e11 != null) {
                defaultErrorReporter2.onFailure(e11);
            }
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}