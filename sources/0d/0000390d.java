package com.google.firebase.installations;

import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
class e implements g {

    /* renamed from: a  reason: collision with root package name */
    final TaskCompletionSource<String> f16699a;

    public e(TaskCompletionSource<String> taskCompletionSource) {
        this.f16699a = taskCompletionSource;
    }

    @Override // com.google.firebase.installations.g
    public boolean a(Exception exc) {
        return false;
    }

    @Override // com.google.firebase.installations.g
    public boolean b(vm.d dVar) {
        if (dVar.l() || dVar.k() || dVar.i()) {
            this.f16699a.trySetResult(dVar.d());
            return true;
        }
        return false;
    }
}