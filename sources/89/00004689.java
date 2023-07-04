package com.plaid.link;

import android.app.Activity;
import com.plaid.internal.link.LinkActivity;
import com.plaid.internal.t8;
import com.plaid.internal.z2;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.plaid.link.Plaid$openLinkInternal$1", f = "Plaid.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Plaid$openLinkInternal$1 extends l implements p<o0, d<? super b0>, Object> {
    public final /* synthetic */ Activity $activity;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$openLinkInternal$1(Activity activity, d<? super Plaid$openLinkInternal$1> dVar) {
        super(2, dVar);
        this.$activity = activity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new Plaid$openLinkInternal$1(this.$activity, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((Plaid$openLinkInternal$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            t8 a11 = ((z2) Plaid.getComponent$link_sdk_release()).a();
            this.label = 1;
            obj = a11.b(this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        this.$activity.startActivityForResult(((Boolean) obj).booleanValue() ? LinkActivity.f18987c.b(this.$activity) : LinkActivity.f18987c.a(this.$activity), 3364);
        return b0.f54756a;
    }
}