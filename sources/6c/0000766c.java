package io.grpc.internal;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: c  reason: collision with root package name */
    private static final Logger f30967c = Logger.getLogger(h.class.getName());

    /* renamed from: a  reason: collision with root package name */
    private final String f30968a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicLong f30969b;

    /* loaded from: classes5.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private final long f30970a;

        public void a() {
            long j11 = this.f30970a;
            long max = Math.max(2 * j11, j11);
            if (h.this.f30969b.compareAndSet(this.f30970a, max)) {
                h.f30967c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{h.this.f30968a, Long.valueOf(max)});
            }
        }

        public long b() {
            return this.f30970a;
        }

        private b(long j11) {
            this.f30970a = j11;
        }
    }

    public h(String str, long j11) {
        AtomicLong atomicLong = new AtomicLong();
        this.f30969b = atomicLong;
        com.google.common.base.u.e(j11 > 0, "value must be positive");
        this.f30968a = str;
        atomicLong.set(j11);
    }

    public b d() {
        return new b(this.f30969b.get());
    }
}