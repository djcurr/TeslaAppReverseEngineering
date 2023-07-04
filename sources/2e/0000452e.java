package com.plaid.internal;

import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchRequest;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowSearchResponse;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ListItem;
import com.plaid.internal.f7;
import java.util.List;
import org.spongycastle.crypto.tls.CipherSuite;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.searchandselect.SearchAndSelectViewModel$callWorkflowSearch$1", f = "SearchAndSelectViewModel.kt", l = {CipherSuite.TLS_PSK_WITH_NULL_SHA384, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA384}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class qb extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19325a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ pb f19326b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f19327c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb(pb pbVar, String str, zz.d<? super qb> dVar) {
        super(2, dVar);
        this.f19326b = pbVar;
        this.f19327c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new qb(this.f19326b, this.f19327c, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new qb(this.f19326b, this.f19327c, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        List<Common$ListItem> items;
        d11 = a00.d.d();
        int i11 = this.f19325a;
        if (i11 == 0) {
            vz.r.b(obj);
            md mdVar = this.f19326b.f19228h;
            Workflow$LinkWorkflowSearchRequest.a aVar = null;
            if (mdVar == null) {
                kotlin.jvm.internal.s.x("workflowApi");
                mdVar = null;
            }
            Workflow$LinkWorkflowSearchRequest.a aVar2 = this.f19326b.f19237q;
            if (aVar2 == null) {
                kotlin.jvm.internal.s.x("workflowSearchRequestBuilder");
            } else {
                aVar = aVar2;
            }
            Workflow$LinkWorkflowSearchRequest build = aVar.d(this.f19327c).build();
            kotlin.jvm.internal.s.f(build, "workflowSearchRequestBui…r.setQuery(query).build()");
            this.f19325a = 1;
            obj = mdVar.a(build, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vz.r.b(obj);
            return vz.b0.f54756a;
        } else {
            vz.r.b(obj);
        }
        f7 f7Var = (f7) obj;
        if (f7Var instanceof f7.c) {
            items = ((Workflow$LinkWorkflowSearchResponse) ((f7.c) f7Var).f18587a).getListItemsList();
        } else {
            items = wz.w.i();
        }
        kotlinx.coroutines.flow.t<List<Common$ListItem>> tVar = this.f19326b.f19235o;
        kotlin.jvm.internal.s.f(items, "items");
        this.f19325a = 2;
        if (tVar.emit(items, this) == d11) {
            return d11;
        }
        return vz.b0.f54756a;
    }
}