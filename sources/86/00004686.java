package com.plaid.link;

import com.plaid.internal.s8;
import com.plaid.internal.t8;
import com.plaid.internal.v8;
import com.plaid.internal.z2;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.e1;
import v20.i;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.plaid.link.Plaid$create$1", f = "Plaid.kt", l = {139, 140}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Plaid$create$1 extends l implements p<o0, d<? super b0>, Object> {
    public final /* synthetic */ boolean $flagSecureOn;
    public final /* synthetic */ String $statusBarColor;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$create$1(String str, boolean z11, d<? super Plaid$create$1> dVar) {
        super(2, dVar);
        this.$statusBarColor = str;
        this.$flagSecureOn = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new Plaid$create$1(this.$statusBarColor, this.$flagSecureOn, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((Plaid$create$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Object d12;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            t8 a11 = ((z2) Plaid.getComponent$link_sdk_release()).a();
            String str = this.$statusBarColor;
            this.label = 1;
            if (a11.a(str, this) == d11) {
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
        t8 a12 = ((z2) Plaid.getComponent$link_sdk_release()).a();
        boolean z11 = this.$flagSecureOn;
        this.label = 2;
        s8 s8Var = a12.f19515b;
        if (s8Var != null) {
            a12.f19515b = s8.a(s8Var, false, null, z11, 3);
        }
        Object g11 = i.g(e1.b(), new v8(a12, z11, null), this);
        d12 = a00.d.d();
        if (g11 != d12) {
            g11 = b0.f54756a;
        }
        if (g11 == d11) {
            return d11;
        }
        return b0.f54756a;
    }
}