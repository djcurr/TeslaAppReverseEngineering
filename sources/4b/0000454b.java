package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.SearchAndSelect$SearchAndSelectPane;
import java.util.List;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.searchandselect.SearchAndSelectViewModel$initialSearchItems$1", f = "SearchAndSelectViewModel.kt", l = {63}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class rb extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super List<Common$ListItem>>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19371a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ pb f19372b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rb(pb pbVar, zz.d<? super rb> dVar) {
        super(2, dVar);
        this.f19372b = pbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new rb(this.f19372b, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super List<Common$ListItem>> dVar) {
        return new rb(this.f19372b, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f19371a;
        if (i11 == 0) {
            vz.r.b(obj);
            kotlinx.coroutines.flow.t<SearchAndSelect$SearchAndSelectPane.Rendering> tVar = this.f19372b.f19231k;
            this.f19371a = 1;
            obj = kotlinx.coroutines.flow.g.r(tVar, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        return ((SearchAndSelect$SearchAndSelectPane.Rendering) obj).getInitialItemsList();
    }
}