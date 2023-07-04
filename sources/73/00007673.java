package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes5.dex */
final class i implements d1 {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicLong f30985a = new AtomicLong();

    @Override // io.grpc.internal.d1
    public void a(long j11) {
        this.f30985a.getAndAdd(j11);
    }
}