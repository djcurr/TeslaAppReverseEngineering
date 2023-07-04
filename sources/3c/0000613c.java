package com.tesla.proto.energy.powergate.v1;

import com.google.protobuf.Descriptors;
import io.grpc.c1;
import io.grpc.d1;
import io.grpc.s0;
import io.grpc.stub.d;
import io.grpc.stub.i;
import java.util.Iterator;

/* loaded from: classes6.dex */
public final class PowerstreamAPIGrpc {
    private static final int METHODID_GET_HEALTH = 0;
    private static final int METHODID_GET_LIVE_STATUS = 1;
    public static final String SERVICE_NAME = "tesla.proto.energy.powerstream.v1.PowerstreamAPI";
    private static volatile s0<GetHealthRequest, GetHealthResponse> getGetHealthMethod;
    private static volatile s0<GetLiveStatusRequest, GetLiveStatusResponse> getGetLiveStatusMethod;
    private static volatile d1 serviceDescriptor;

    /* loaded from: classes6.dex */
    private static abstract class PowerstreamAPIBaseDescriptorSupplier {
        PowerstreamAPIBaseDescriptorSupplier() {
        }

        public Descriptors.FileDescriptor getFileDescriptor() {
            return Powerstream.getDescriptor();
        }

        public Descriptors.ServiceDescriptor getServiceDescriptor() {
            return getFileDescriptor().findServiceByName("PowerstreamAPI");
        }
    }

    /* loaded from: classes6.dex */
    public static final class PowerstreamAPIBlockingStub extends io.grpc.stub.b<PowerstreamAPIBlockingStub> {
        private PowerstreamAPIBlockingStub(io.grpc.d dVar, io.grpc.c cVar) {
            super(dVar, cVar);
        }

        public GetHealthResponse getHealth(GetHealthRequest getHealthRequest) {
            return (GetHealthResponse) io.grpc.stub.g.f(getChannel(), PowerstreamAPIGrpc.getGetHealthMethod(), getCallOptions(), getHealthRequest);
        }

        public Iterator<GetLiveStatusResponse> getLiveStatus(GetLiveStatusRequest getLiveStatusRequest) {
            return io.grpc.stub.g.e(getChannel(), PowerstreamAPIGrpc.getGetLiveStatusMethod(), getCallOptions(), getLiveStatusRequest);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public PowerstreamAPIBlockingStub build(io.grpc.d dVar, io.grpc.c cVar) {
            return new PowerstreamAPIBlockingStub(dVar, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class PowerstreamAPIFileDescriptorSupplier extends PowerstreamAPIBaseDescriptorSupplier {
        PowerstreamAPIFileDescriptorSupplier() {
        }
    }

    /* loaded from: classes6.dex */
    public static final class PowerstreamAPIFutureStub extends io.grpc.stub.c<PowerstreamAPIFutureStub> {
        private PowerstreamAPIFutureStub(io.grpc.d dVar, io.grpc.c cVar) {
            super(dVar, cVar);
        }

        public com.google.common.util.concurrent.c<GetHealthResponse> getHealth(GetHealthRequest getHealthRequest) {
            return io.grpc.stub.g.h(getChannel().h(PowerstreamAPIGrpc.getGetHealthMethod(), getCallOptions()), getHealthRequest);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public PowerstreamAPIFutureStub build(io.grpc.d dVar, io.grpc.c cVar) {
            return new PowerstreamAPIFutureStub(dVar, cVar);
        }
    }

    /* loaded from: classes6.dex */
    public static abstract class PowerstreamAPIImplBase {
        public final c1 bindService() {
            return c1.a(PowerstreamAPIGrpc.getServiceDescriptor()).a(PowerstreamAPIGrpc.getGetHealthMethod(), io.grpc.stub.i.b(new MethodHandlers(this, 0))).a(PowerstreamAPIGrpc.getGetLiveStatusMethod(), io.grpc.stub.i.a(new MethodHandlers(this, 1))).c();
        }

        public void getHealth(GetHealthRequest getHealthRequest, io.grpc.stub.j<GetHealthResponse> jVar) {
            io.grpc.stub.i.c(PowerstreamAPIGrpc.getGetHealthMethod(), jVar);
        }

        public void getLiveStatus(GetLiveStatusRequest getLiveStatusRequest, io.grpc.stub.j<GetLiveStatusResponse> jVar) {
            io.grpc.stub.i.c(PowerstreamAPIGrpc.getGetLiveStatusMethod(), jVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static final class PowerstreamAPIMethodDescriptorSupplier extends PowerstreamAPIBaseDescriptorSupplier {
        private final String methodName;

        PowerstreamAPIMethodDescriptorSupplier(String str) {
            this.methodName = str;
        }

        public Descriptors.MethodDescriptor getMethodDescriptor() {
            return getServiceDescriptor().findMethodByName(this.methodName);
        }
    }

    /* loaded from: classes6.dex */
    public static final class PowerstreamAPIStub extends io.grpc.stub.a<PowerstreamAPIStub> {
        private PowerstreamAPIStub(io.grpc.d dVar, io.grpc.c cVar) {
            super(dVar, cVar);
        }

        public void getHealth(GetHealthRequest getHealthRequest, io.grpc.stub.j<GetHealthResponse> jVar) {
            io.grpc.stub.g.b(getChannel().h(PowerstreamAPIGrpc.getGetHealthMethod(), getCallOptions()), getHealthRequest, jVar);
        }

        public void getLiveStatus(GetLiveStatusRequest getLiveStatusRequest, io.grpc.stub.j<GetLiveStatusResponse> jVar) {
            io.grpc.stub.g.a(getChannel().h(PowerstreamAPIGrpc.getGetLiveStatusMethod(), getCallOptions()), getLiveStatusRequest, jVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public PowerstreamAPIStub build(io.grpc.d dVar, io.grpc.c cVar) {
            return new PowerstreamAPIStub(dVar, cVar);
        }
    }

    private PowerstreamAPIGrpc() {
    }

    public static s0<GetHealthRequest, GetHealthResponse> getGetHealthMethod() {
        s0<GetHealthRequest, GetHealthResponse> s0Var = getGetHealthMethod;
        if (s0Var == null) {
            synchronized (PowerstreamAPIGrpc.class) {
                s0Var = getGetHealthMethod;
                if (s0Var == null) {
                    s0Var = s0.g().g(s0.d.UNARY).b(s0.b(SERVICE_NAME, "GetHealth")).e(true).c(px.a.a(GetHealthRequest.getDefaultInstance())).d(px.a.a(GetHealthResponse.getDefaultInstance())).f(new PowerstreamAPIMethodDescriptorSupplier("GetHealth")).a();
                    getGetHealthMethod = s0Var;
                }
            }
        }
        return s0Var;
    }

    public static s0<GetLiveStatusRequest, GetLiveStatusResponse> getGetLiveStatusMethod() {
        s0<GetLiveStatusRequest, GetLiveStatusResponse> s0Var = getGetLiveStatusMethod;
        if (s0Var == null) {
            synchronized (PowerstreamAPIGrpc.class) {
                s0Var = getGetLiveStatusMethod;
                if (s0Var == null) {
                    s0Var = s0.g().g(s0.d.SERVER_STREAMING).b(s0.b(SERVICE_NAME, "GetLiveStatus")).e(true).c(px.a.a(GetLiveStatusRequest.getDefaultInstance())).d(px.a.a(GetLiveStatusResponse.getDefaultInstance())).f(new PowerstreamAPIMethodDescriptorSupplier("GetLiveStatus")).a();
                    getGetLiveStatusMethod = s0Var;
                }
            }
        }
        return s0Var;
    }

    public static d1 getServiceDescriptor() {
        d1 d1Var = serviceDescriptor;
        if (d1Var == null) {
            synchronized (PowerstreamAPIGrpc.class) {
                d1Var = serviceDescriptor;
                if (d1Var == null) {
                    d1Var = d1.c(SERVICE_NAME).i(new PowerstreamAPIFileDescriptorSupplier()).f(getGetHealthMethod()).f(getGetLiveStatusMethod()).g();
                    serviceDescriptor = d1Var;
                }
            }
        }
        return d1Var;
    }

    public static PowerstreamAPIBlockingStub newBlockingStub(io.grpc.d dVar) {
        return (PowerstreamAPIBlockingStub) io.grpc.stub.b.newStub(new d.a<PowerstreamAPIBlockingStub>() { // from class: com.tesla.proto.energy.powergate.v1.PowerstreamAPIGrpc.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.grpc.stub.d.a
            public PowerstreamAPIBlockingStub newStub(io.grpc.d dVar2, io.grpc.c cVar) {
                return new PowerstreamAPIBlockingStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static PowerstreamAPIFutureStub newFutureStub(io.grpc.d dVar) {
        return (PowerstreamAPIFutureStub) io.grpc.stub.c.newStub(new d.a<PowerstreamAPIFutureStub>() { // from class: com.tesla.proto.energy.powergate.v1.PowerstreamAPIGrpc.3
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.grpc.stub.d.a
            public PowerstreamAPIFutureStub newStub(io.grpc.d dVar2, io.grpc.c cVar) {
                return new PowerstreamAPIFutureStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static PowerstreamAPIStub newStub(io.grpc.d dVar) {
        return (PowerstreamAPIStub) io.grpc.stub.a.newStub(new d.a<PowerstreamAPIStub>() { // from class: com.tesla.proto.energy.powergate.v1.PowerstreamAPIGrpc.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // io.grpc.stub.d.a
            public PowerstreamAPIStub newStub(io.grpc.d dVar2, io.grpc.c cVar) {
                return new PowerstreamAPIStub(dVar2, cVar);
            }
        }, dVar);
    }

    /* loaded from: classes6.dex */
    private static final class MethodHandlers<Req, Resp> implements i.b<Req, Resp>, i.a<Req, Resp> {
        private final int methodId;
        private final PowerstreamAPIImplBase serviceImpl;

        MethodHandlers(PowerstreamAPIImplBase powerstreamAPIImplBase, int i11) {
            this.serviceImpl = powerstreamAPIImplBase;
            this.methodId = i11;
        }

        public void invoke(Req req, io.grpc.stub.j<Resp> jVar) {
            int i11 = this.methodId;
            if (i11 == 0) {
                this.serviceImpl.getHealth((GetHealthRequest) req, jVar);
            } else if (i11 == 1) {
                this.serviceImpl.getLiveStatus((GetLiveStatusRequest) req, jVar);
            } else {
                throw new AssertionError();
            }
        }

        public io.grpc.stub.j<Req> invoke(io.grpc.stub.j<Resp> jVar) {
            throw new AssertionError();
        }
    }
}