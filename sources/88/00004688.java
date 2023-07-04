package com.plaid.link;

import android.webkit.WebView;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.plaid.link.Plaid$maybeSetWebviewDebugging$2", f = "Plaid.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Plaid$maybeSetWebviewDebugging$2 extends l implements p<o0, d<? super b0>, Object> {
    public int label;

    public Plaid$maybeSetWebviewDebugging$2(d<? super Plaid$maybeSetWebviewDebugging$2> dVar) {
        super(2, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new Plaid$maybeSetWebviewDebugging$2(dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((Plaid$maybeSetWebviewDebugging$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            WebView.setWebContentsDebuggingEnabled(true);
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}