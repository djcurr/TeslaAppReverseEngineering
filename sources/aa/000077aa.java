package io.grpc.stub;

import com.google.common.base.u;
import io.grpc.c;
import io.grpc.stub.d;
import io.grpc.t;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public abstract class d<S extends d<S>> {
    private final io.grpc.c callOptions;
    private final io.grpc.d channel;

    /* loaded from: classes5.dex */
    public interface a<T extends d<T>> {
        T newStub(io.grpc.d dVar, io.grpc.c cVar);
    }

    protected d(io.grpc.d dVar) {
        this(dVar, io.grpc.c.f30520k);
    }

    public static <T extends d<T>> T newStub(a<T> aVar, io.grpc.d dVar) {
        return (T) newStub(aVar, dVar, io.grpc.c.f30520k);
    }

    protected abstract S build(io.grpc.d dVar, io.grpc.c cVar);

    public final io.grpc.c getCallOptions() {
        return this.callOptions;
    }

    public final io.grpc.d getChannel() {
        return this.channel;
    }

    public final S withCallCredentials(io.grpc.b bVar) {
        return build(this.channel, this.callOptions.k(bVar));
    }

    @Deprecated
    public final S withChannel(io.grpc.d dVar) {
        return build(dVar, this.callOptions);
    }

    public final S withCompression(String str) {
        return build(this.channel, this.callOptions.l(str));
    }

    public final S withDeadline(t tVar) {
        return build(this.channel, this.callOptions.m(tVar));
    }

    public final S withDeadlineAfter(long j11, TimeUnit timeUnit) {
        return build(this.channel, this.callOptions.n(j11, timeUnit));
    }

    public final S withExecutor(Executor executor) {
        return build(this.channel, this.callOptions.o(executor));
    }

    public final S withInterceptors(io.grpc.h... hVarArr) {
        return build(io.grpc.j.b(this.channel, hVarArr), this.callOptions);
    }

    public final S withMaxInboundMessageSize(int i11) {
        return build(this.channel, this.callOptions.p(i11));
    }

    public final S withMaxOutboundMessageSize(int i11) {
        return build(this.channel, this.callOptions.q(i11));
    }

    public final <T> S withOption(c.a<T> aVar, T t11) {
        return build(this.channel, this.callOptions.r(aVar, t11));
    }

    public final S withWaitForReady() {
        return build(this.channel, this.callOptions.t());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public d(io.grpc.d dVar, io.grpc.c cVar) {
        this.channel = (io.grpc.d) u.p(dVar, "channel");
        this.callOptions = (io.grpc.c) u.p(cVar, "callOptions");
    }

    public static <T extends d<T>> T newStub(a<T> aVar, io.grpc.d dVar, io.grpc.c cVar) {
        return aVar.newStub(dVar, cVar);
    }
}