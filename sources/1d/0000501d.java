package com.stripe.android.link.ui.signup;

import c1.i;
import com.stripe.android.link.injection.NonFallbackInjector;
import h00.p;
import kotlin.jvm.internal.u;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SignUpScreenKt$SignUpBody$2 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$changed;
    final /* synthetic */ String $email;
    final /* synthetic */ NonFallbackInjector $injector;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$SignUpBody$2(NonFallbackInjector nonFallbackInjector, String str, int i11) {
        super(2);
        this.$injector = nonFallbackInjector;
        this.$email = str;
        this.$$changed = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        SignUpScreenKt.SignUpBody(this.$injector, this.$email, iVar, this.$$changed | 1);
    }
}