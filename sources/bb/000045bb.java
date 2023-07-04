package com.plaid.internal;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import com.plaid.internal.vb;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.consent.SellingPointsAdapter$SellingPointHolder$bind$1", f = "SellingPointsAdapter.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class ub extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19594a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Common$RenderedAssetAppearance f19595b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ vb.a f19596c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub(Common$RenderedAssetAppearance common$RenderedAssetAppearance, vb.a aVar, zz.d<? super ub> dVar) {
        super(2, dVar);
        this.f19595b = common$RenderedAssetAppearance;
        this.f19596c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new ub(this.f19595b, this.f19596c, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new ub(this.f19595b, this.f19596c, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f19594a;
        if (i11 == 0) {
            vz.r.b(obj);
            Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.f19595b;
            Context context = this.f19596c.f19631a.getContext();
            kotlin.jvm.internal.s.f(context, "plaidSellingPoint.context");
            this.f19594a = 1;
            obj = gb.a(common$RenderedAssetAppearance, context, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        Drawable drawable = (Drawable) obj;
        if (drawable != null) {
            this.f19596c.f19631a.setIcon(drawable);
        }
        return vz.b0.f54756a;
    }
}