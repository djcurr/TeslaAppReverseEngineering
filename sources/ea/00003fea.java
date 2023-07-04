package com.plaid.internal;

import android.app.Activity;
import android.content.Intent;
import com.plaid.internal.fb;
import com.plaid.internal.link.LinkActivity;
import com.plaid.internal.wa;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.redirect.LinkRedirectActivityViewModel$redirectToLink$1", f = "LinkRedirectActivityViewModel.kt", l = {34}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class b6 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f18223a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c6 f18224b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Activity f18225c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ fb f18226d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6(c6 c6Var, Activity activity, fb fbVar, zz.d<? super b6> dVar) {
        super(2, dVar);
        this.f18224b = c6Var;
        this.f18225c = activity;
        this.f18226d = fbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new b6(this.f18224b, this.f18225c, this.f18226d, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new b6(this.f18224b, this.f18225c, this.f18226d, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Intent a11;
        d11 = a00.d.d();
        int i11 = this.f18223a;
        if (i11 == 0) {
            vz.r.b(obj);
            t8 t8Var = this.f18224b.f18248a;
            if (t8Var == null) {
                kotlin.jvm.internal.s.x("clientSideOnlyConfigurationStore");
                t8Var = null;
            }
            this.f18223a = 1;
            obj = t8Var.b(this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            wa.a.a(wa.f19678a, "Launching transparent LinkActivity", false, 2);
            a11 = LinkActivity.f18987c.b(this.f18225c);
        } else {
            wa.a.a(wa.f19678a, "Launching LinkActivity", false, 2);
            a11 = LinkActivity.f18987c.a(this.f18225c);
        }
        Activity activity = this.f18225c;
        fb fbVar = this.f18226d;
        kotlin.jvm.internal.s.g(a11, "<this>");
        if (fbVar != null) {
            a11.setFlags(603979776);
            if (fbVar instanceof fb.a) {
                a11.putExtra("link_oauth_redirect", true);
                a11.putExtra("link_oauth_received_redirect_uri", ((fb.a) fbVar).f18592a);
            } else if (fbVar instanceof fb.b) {
                a11.putExtra("redirect_error", true);
                Exception exc = ((fb.b) fbVar).f18593a;
                if (exc != null) {
                    a11.putExtra("redirect_error_exception", exc);
                }
            }
        }
        activity.startActivity(a11);
        return vz.b0.f54756a;
    }
}