package com.plaid.link;

import android.content.Context;
import com.plaid.internal.g6;
import com.plaid.internal.j6;
import com.plaid.internal.z2;
import com.plaid.link.configuration.LinkPublicKeyConfiguration;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.plaid.link.Plaid$setLinkConfiguration$1", f = "Plaid.kt", l = {230, 232}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Plaid$setLinkConfiguration$1 extends l implements p<o0, d<? super b0>, Object> {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ LinkPublicKeyConfiguration $linkConfiguration;
    public final /* synthetic */ String $linkOpenId;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$setLinkConfiguration$1(String str, LinkPublicKeyConfiguration linkPublicKeyConfiguration, Context context, d<? super Plaid$setLinkConfiguration$1> dVar) {
        super(2, dVar);
        this.$linkOpenId = str;
        this.$linkConfiguration = linkPublicKeyConfiguration;
        this.$context = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new Plaid$setLinkConfiguration$1(this.$linkOpenId, this.$linkConfiguration, this.$context, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((Plaid$setLinkConfiguration$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object maybeSetWebviewDebugging;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            j6 c11 = ((z2) Plaid.getComponent$link_sdk_release()).c();
            g6.a aVar = new g6.a(this.$linkOpenId, this.$linkConfiguration);
            this.label = 1;
            if (c11.a(aVar, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return b0.f54756a;
        } else {
            r.b(obj);
        }
        Plaid plaid = Plaid.INSTANCE;
        Context context = this.$context;
        this.label = 2;
        maybeSetWebviewDebugging = plaid.maybeSetWebviewDebugging(context, this);
        if (maybeSetWebviewDebugging == d11) {
            return d11;
        }
        return b0.f54756a;
    }
}