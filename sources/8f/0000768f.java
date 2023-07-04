package io.grpc.internal;

import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public interface k2 {

    /* renamed from: a  reason: collision with root package name */
    public static final k2 f31033a = new a();

    /* loaded from: classes5.dex */
    class a implements k2 {
        a() {
        }

        @Override // io.grpc.internal.k2
        public long a() {
            return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
        }
    }

    long a();
}