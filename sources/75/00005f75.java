package com.tesla.TeslaV4.reactnative.module;

import com.google.protobuf.util.JsonFormat;
import com.tesla.proto.energy.powergate.v1.GetLiveStatusRequest;
import com.tesla.proto.energy.powergate.v1.GetLiveStatusResponse;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class a0 implements io.grpc.stub.h<GetLiveStatusRequest, GetLiveStatusResponse> {
    public static final a Companion = new a(null);

    /* renamed from: e  reason: collision with root package name */
    private static final com.tesla.logging.g f21408e = com.tesla.logging.g.f21878b.a("PowerstreamObserver");

    /* renamed from: a  reason: collision with root package name */
    private final h00.l<String, vz.b0> f21409a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.l<String, vz.b0> f21410b;

    /* renamed from: c  reason: collision with root package name */
    private final h00.a<vz.b0> f21411c;

    /* renamed from: d  reason: collision with root package name */
    private io.grpc.stub.f<GetLiveStatusRequest> f21412d;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a0(h00.l<? super String, vz.b0> onData, h00.l<? super String, vz.b0> onError, h00.a<vz.b0> onEnd) {
        kotlin.jvm.internal.s.g(onData, "onData");
        kotlin.jvm.internal.s.g(onError, "onError");
        kotlin.jvm.internal.s.g(onEnd, "onEnd");
        this.f21409a = onData;
        this.f21410b = onError;
        this.f21411c = onEnd;
    }

    @Override // io.grpc.stub.j
    public void a() {
        this.f21411c.invoke();
    }

    @Override // io.grpc.stub.h
    public void c(io.grpc.stub.f<GetLiveStatusRequest> fVar) {
        this.f21412d = fVar;
    }

    public final void d() {
        io.grpc.stub.f<GetLiveStatusRequest> fVar = this.f21412d;
        if (fVar == null) {
            return;
        }
        fVar.d("User cancellation", new Throwable("cancelStream called"));
    }

    @Override // io.grpc.stub.j
    /* renamed from: e */
    public void b(GetLiveStatusResponse getLiveStatusResponse) {
        if (getLiveStatusResponse == null) {
            return;
        }
        com.tesla.logging.g gVar = f21408e;
        gVar.i("Data received.");
        try {
            String dataStr = JsonFormat.printer().print(getLiveStatusResponse);
            gVar.i("Data serialized.");
            h00.l<String, vz.b0> lVar = this.f21409a;
            kotlin.jvm.internal.s.f(dataStr, "dataStr");
            lVar.invoke(dataStr);
        } catch (Exception e11) {
            com.tesla.logging.g gVar2 = f21408e;
            gVar2.i("Serialization failed: " + e11);
            throw e11;
        }
    }

    @Override // io.grpc.stub.j
    public void onError(Throwable th2) {
        this.f21410b.invoke(th2 == null ? null : th2.toString());
    }
}