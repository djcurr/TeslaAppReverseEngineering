package com.stripe.android.link;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import y0.n0;
import zz.d;

@f(c = "com.stripe.android.link.LinkActivity$onCreate$1$1$2$1", f = "LinkActivity.kt", l = {84}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class LinkActivity$onCreate$1$1$2$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ n0 $sheetState;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkActivity$onCreate$1$1$2$1(n0 n0Var, d<? super LinkActivity$onCreate$1$1$2$1> dVar) {
        super(2, dVar);
        this.$sheetState = n0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new LinkActivity$onCreate$1$1$2$1(this.$sheetState, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((LinkActivity$onCreate$1$1$2$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            n0 n0Var = this.$sheetState;
            this.label = 1;
            if (n0Var.N(this) == d11) {
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