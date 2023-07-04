package com.plaid.internal;

import java.io.File;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.core.storage.PlaidDirectoryStorage$createFile$2", f = "PlaidDirectoryStorage.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class d9 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super File>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ e9 f18502a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f18503b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d9(e9 e9Var, String str, zz.d<? super d9> dVar) {
        super(2, dVar);
        this.f18502a = e9Var;
        this.f18503b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new d9(this.f18502a, this.f18503b, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super File> dVar) {
        return new d9(this.f18502a, this.f18503b, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        vz.r.b(obj);
        File parentDirectory = this.f18502a.f18528a;
        String fileName = this.f18503b;
        kotlin.jvm.internal.s.g(parentDirectory, "parentDirectory");
        kotlin.jvm.internal.s.g(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
        } else {
            file.delete();
            file.createNewFile();
        }
        return file;
    }
}