package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
class d implements g {

    /* renamed from: a  reason: collision with root package name */
    private final h f16697a;

    /* renamed from: b  reason: collision with root package name */
    private final TaskCompletionSource<f> f16698b;

    public d(h hVar, TaskCompletionSource<f> taskCompletionSource) {
        this.f16697a = hVar;
        this.f16698b = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        this.f16698b.trySetException(exc);
        return true;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(vm.d dVar) {
        if (!dVar.k() || this.f16697a.f(dVar)) {
            return false;
        }
        this.f16698b.setResult(f.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}