package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class a1 implements z0 {

    /* renamed from: a  reason: collision with root package name */
    private boolean f11335a = false;

    /* renamed from: b  reason: collision with root package name */
    private final Deque<Runnable> f11336b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11337c;

    public a1(Executor executor) {
        this.f11337c = (Executor) md.k.g(executor);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public synchronized void a(Runnable runnable) {
        this.f11336b.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.z0
    public synchronized void b(Runnable runnable) {
        if (this.f11335a) {
            this.f11336b.add(runnable);
        } else {
            this.f11337c.execute(runnable);
        }
    }
}