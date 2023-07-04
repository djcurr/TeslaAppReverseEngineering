package com.plaid.internal;

import java.io.File;
import java.util.UUID;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.TakePictureWithAppInternalUri$createInternalUri$file$1", f = "TakePictureWithAppInternalUri.kt", l = {55}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class fc extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super File>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f18594a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ gc f18595b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc(gc gcVar, zz.d<? super fc> dVar) {
        super(2, dVar);
        this.f18595b = gcVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new fc(this.f18595b, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super File> dVar) {
        return new fc(this.f18595b, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f18594a;
        if (i11 == 0) {
            vz.r.b(obj);
            e9 e9Var = this.f18595b.f18677a;
            String valueOf = String.valueOf(UUID.randomUUID());
            this.f18594a = 1;
            e9Var.getClass();
            obj = v20.i.g(v20.e1.b(), new d9(e9Var, valueOf, null), this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        return obj;
    }
}