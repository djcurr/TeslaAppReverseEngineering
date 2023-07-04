package com.tesla.TeslaV4.reactnative.module;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.tesla.proto.common.v1.UUIDv4;
import com.tesla.proto.energy.powergate.v1.GetLiveStatusRequest;
import com.tesla.proto.energy.powergate.v1.PowerstreamAPIGrpc;
import io.grpc.p0;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import yu.y;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001$B\u000f\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002J\u0012\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0002H\u0002J\b\u0010\f\u001a\u00020\u0006H\u0002J\b\u0010\r\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0007J\b\u0010\u0012\u001a\u00020\u0006H\u0007J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u0014H\u0007R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006%"}, d2 = {"Lcom/tesla/TeslaV4/reactnative/module/PowerstreamApiGrpcNativeModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "", "eventName", "Lcom/facebook/react/bridge/WritableNativeMap;", "params", "Lvz/b0;", "sendEvent", MessageExtension.FIELD_DATA, "onData", "errMsg", "onError", "onEnd", "getName", "assetSiteId", "Lcom/facebook/react/bridge/Promise;", "result", "getLiveStatus", "cancelStream", "addListener", "", "count", "removeListeners", "Lcom/tesla/TeslaV4/reactnative/module/a0;", "streamObserver", "Lcom/tesla/TeslaV4/reactnative/module/a0;", "Lio/grpc/p0;", "grpcChannel", "Lio/grpc/p0;", "requestIdCopy", "Ljava/lang/String;", "Lcom/facebook/react/bridge/ReactApplicationContext;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "app_prodGlobalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class PowerstreamApiGrpcNativeModule extends ReactContextBaseJavaModule {
    public static final a Companion = new a(null);
    private static final String TAG = "PowerstreamApiGrpc";
    private static final com.tesla.logging.g log = com.tesla.logging.g.f21878b.a(TAG);
    private p0 grpcChannel;
    private String requestIdCopy;
    private a0 streamObserver;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<String, vz.b0> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f21401b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f21402c;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public /* synthetic */ class a extends kotlin.jvm.internal.p implements h00.l<String, vz.b0> {
            a(Object obj) {
                super(1, obj, PowerstreamApiGrpcNativeModule.class, "onData", "onData(Ljava/lang/String;)V", 0);
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(String str) {
                invoke2(str);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String p02) {
                kotlin.jvm.internal.s.g(p02, "p0");
                ((PowerstreamApiGrpcNativeModule) this.receiver).onData(p02);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.tesla.TeslaV4.reactnative.module.PowerstreamApiGrpcNativeModule$b$b  reason: collision with other inner class name */
        /* loaded from: classes6.dex */
        public /* synthetic */ class C0392b extends kotlin.jvm.internal.p implements h00.l<String, vz.b0> {
            C0392b(Object obj) {
                super(1, obj, PowerstreamApiGrpcNativeModule.class, "onError", "onError(Ljava/lang/String;)V", 0);
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(String str) {
                invoke2(str);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                ((PowerstreamApiGrpcNativeModule) this.receiver).onError(str);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes6.dex */
        public /* synthetic */ class c extends kotlin.jvm.internal.p implements h00.a<vz.b0> {
            c(Object obj) {
                super(0, obj, PowerstreamApiGrpcNativeModule.class, "onEnd", "onEnd()V", 0);
            }

            @Override // h00.a
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
                invoke2();
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2() {
                ((PowerstreamApiGrpcNativeModule) this.receiver).onEnd();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Promise promise) {
            super(1);
            this.f21401b = str;
            this.f21402c = promise;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(String str) {
            invoke2(str);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(String token) {
            p0 b11;
            kotlin.jvm.internal.s.g(token, "token");
            PowerstreamApiGrpcNativeModule.log.i("Got access token");
            String uuid = UUID.randomUUID().toString();
            kotlin.jvm.internal.s.f(uuid, "randomUUID().toString()");
            PowerstreamApiGrpcNativeModule.this.requestIdCopy = uuid;
            GetLiveStatusRequest build = GetLiveStatusRequest.newBuilder().setAssetSiteId(UUIDv4.newBuilder().setText(this.f21401b)).setRequestId(UUIDv4.newBuilder().setText(uuid)).build();
            com.tesla.logging.g gVar = PowerstreamApiGrpcNativeModule.log;
            gVar.i("Request ID: " + uuid);
            a0 a0Var = new a0(new a(PowerstreamApiGrpcNativeModule.this), new C0392b(PowerstreamApiGrpcNativeModule.this), new c(PowerstreamApiGrpcNativeModule.this));
            PowerstreamApiGrpcNativeModule.this.streamObserver = a0Var;
            b11 = z.b();
            PowerstreamApiGrpcNativeModule.this.grpcChannel = b11;
            try {
                ((PowerstreamAPIGrpc.PowerstreamAPIStub) PowerstreamAPIGrpc.newStub(b11).withCallCredentials(new com.tesla.TeslaV4.reactnative.module.b(token, uuid))).getLiveStatus(build, a0Var);
                this.f21402c.resolve(uuid);
            } catch (Exception e11) {
                com.tesla.logging.g gVar2 = PowerstreamApiGrpcNativeModule.log;
                gVar2.i("Request failed: " + e11);
                this.f21402c.reject(e11);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PowerstreamApiGrpcNativeModule(ReactApplicationContext context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
        this.requestIdCopy = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onData(String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString(MessageExtension.FIELD_DATA, str);
        writableNativeMap.putString("id", this.requestIdCopy);
        vz.b0 b0Var = vz.b0.f54756a;
        sendEvent(MessageExtension.FIELD_DATA, writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEnd() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", this.requestIdCopy);
        vz.b0 b0Var = vz.b0.f54756a;
        sendEvent("end", writableNativeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(String str) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("error", str);
        writableNativeMap.putString("id", this.requestIdCopy);
        vz.b0 b0Var = vz.b0.f54756a;
        sendEvent("error", writableNativeMap);
    }

    private final void sendEvent(String str, WritableNativeMap writableNativeMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableNativeMap);
    }

    @ReactMethod
    public final void addListener(String eventName) {
        kotlin.jvm.internal.s.g(eventName, "eventName");
    }

    @ReactMethod
    public final void cancelStream() {
        a0 a0Var = this.streamObserver;
        if (a0Var != null) {
            a0Var.d();
        }
        p0 p0Var = this.grpcChannel;
        if (p0Var == null) {
            return;
        }
        p0Var.mo142i();
    }

    @ReactMethod
    public final void getLiveStatus(String assetSiteId, Promise result) {
        kotlin.jvm.internal.s.g(assetSiteId, "assetSiteId");
        kotlin.jvm.internal.s.g(result, "result");
        cancelStream();
        y.a aVar = yu.y.f59842h;
        Context applicationContext = getReactApplicationContext().getApplicationContext();
        kotlin.jvm.internal.s.f(applicationContext, "reactApplicationContext.applicationContext");
        aVar.a(applicationContext).x(new b(assetSiteId, result));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "PowerstreamApiGrpcNativeModule";
    }

    @ReactMethod
    public final void removeListeners(int i11) {
    }
}