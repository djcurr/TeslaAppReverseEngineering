package io.grpc.internal;

import java.io.Closeable;
import java.net.SocketAddress;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes5.dex */
public interface t extends Closeable {

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private String f31211a = "unknown-authority";

        /* renamed from: b  reason: collision with root package name */
        private io.grpc.a f31212b = io.grpc.a.f30500c;

        /* renamed from: c  reason: collision with root package name */
        private String f31213c;

        /* renamed from: d  reason: collision with root package name */
        private io.grpc.a0 f31214d;

        public String a() {
            return this.f31211a;
        }

        public io.grpc.a b() {
            return this.f31212b;
        }

        public io.grpc.a0 c() {
            return this.f31214d;
        }

        public String d() {
            return this.f31213c;
        }

        public a e(String str) {
            this.f31211a = (String) com.google.common.base.u.p(str, "authority");
            return this;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f31211a.equals(aVar.f31211a) && this.f31212b.equals(aVar.f31212b) && com.google.common.base.q.a(this.f31213c, aVar.f31213c) && com.google.common.base.q.a(this.f31214d, aVar.f31214d);
            }
            return false;
        }

        public a f(io.grpc.a aVar) {
            com.google.common.base.u.p(aVar, "eagAttributes");
            this.f31212b = aVar;
            return this;
        }

        public a g(io.grpc.a0 a0Var) {
            this.f31214d = a0Var;
            return this;
        }

        public a h(String str) {
            this.f31213c = str;
            return this;
        }

        public int hashCode() {
            return com.google.common.base.q.b(this.f31211a, this.f31212b, this.f31213c, this.f31214d);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    v g1(SocketAddress socketAddress, a aVar, io.grpc.f fVar);

    ScheduledExecutorService getScheduledExecutorService();
}