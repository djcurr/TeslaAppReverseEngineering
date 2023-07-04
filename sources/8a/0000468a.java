package com.plaid.link;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.plaid.internal.link.LinkActivity;
import com.plaid.internal.t8;
import com.plaid.internal.z2;
import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.plaid.link.Plaid$openLinkInternal$2", f = "Plaid.kt", l = {86}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class Plaid$openLinkInternal$2 extends l implements p<o0, d<? super b0>, Object> {
    public final /* synthetic */ Fragment $fragment;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Plaid$openLinkInternal$2(Fragment fragment, d<? super Plaid$openLinkInternal$2> dVar) {
        super(2, dVar);
        this.$fragment = fragment;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new Plaid$openLinkInternal$2(this.$fragment, dVar);
    }

    @Override // h00.p
    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object mo160invoke(o0 o0Var, d<? super b0> dVar) {
        return ((Plaid$openLinkInternal$2) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        Intent a11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            t8 a12 = ((z2) Plaid.getComponent$link_sdk_release()).a();
            this.label = 1;
            obj = a12.b(this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            LinkActivity.a aVar = LinkActivity.f18987c;
            Context requireContext = this.$fragment.requireContext();
            s.f(requireContext, "fragment.requireContext()");
            a11 = aVar.b(requireContext);
        } else {
            LinkActivity.a aVar2 = LinkActivity.f18987c;
            Context requireContext2 = this.$fragment.requireContext();
            s.f(requireContext2, "fragment.requireContext()");
            a11 = aVar2.a(requireContext2);
        }
        this.$fragment.startActivityForResult(a11, 3364);
        return b0.f54756a;
    }
}