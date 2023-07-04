package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.gesturehandler.GestureHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class n extends com.facebook.react.uimanager.events.c<n> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f21204b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final v3.g<n> f21205c = new v3.g<>(7);

    /* renamed from: a  reason: collision with root package name */
    private WritableMap f21206a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends GestureHandler<T>> WritableMap a(T handler, e<T> eVar, int i11, int i12) {
            s.g(handler, "handler");
            WritableMap createMap = Arguments.createMap();
            if (eVar != null) {
                s.f(createMap, "this");
                eVar.a(handler, createMap);
            }
            createMap.putInt("handlerTag", handler.N());
            createMap.putInt("state", i11);
            createMap.putInt("oldState", i12);
            s.f(createMap, "createMap().apply {\n    …State\", oldState)\n      }");
            return createMap;
        }

        public final <T extends GestureHandler<T>> n b(T handler, int i11, int i12, e<T> eVar) {
            s.g(handler, "handler");
            n nVar = (n) n.f21205c.b();
            if (nVar == null) {
                nVar = new n(null);
            }
            nVar.c(handler, i11, i12, eVar);
            return nVar;
        }
    }

    private n() {
    }

    public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends GestureHandler<T>> void c(T t11, int i11, int i12, e<T> eVar) {
        View R = t11.R();
        s.e(R);
        super.init(R.getId());
        this.f21206a = f21204b.a(t11, eVar, i11, i12);
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        s.g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerStateChange", this.f21206a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "onGestureHandlerStateChange";
    }

    @Override // com.facebook.react.uimanager.events.c
    public void onDispose() {
        this.f21206a = null;
        f21205c.a(this);
    }
}