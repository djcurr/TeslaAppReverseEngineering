package com.google.firebase.messaging;

import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements Executor {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ h f16804a = new h();

    private /* synthetic */ h() {
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.run();
    }
}