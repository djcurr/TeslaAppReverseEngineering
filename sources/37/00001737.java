package com.facebook.imagepipeline.producers;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class v implements z0 {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f11573a;

    public v(Executor executor) {
        this.f11573a = (Executor) md.k.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void a(Runnable runnable) {
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public void b(Runnable runnable) {
        this.f11573a.execute(runnable);
    }
}