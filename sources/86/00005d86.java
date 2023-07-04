package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.gesturehandler.GestureHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class d extends com.facebook.react.uimanager.events.c<d> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f21181c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final v3.g<d> f21182d = new v3.g<>(7);

    /* renamed from: a  reason: collision with root package name */
    private WritableMap f21183a;

    /* renamed from: b  reason: collision with root package name */
    private short f21184b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends GestureHandler<T>> WritableMap a(T handler, e<T> eVar) {
            s.g(handler, "handler");
            WritableMap createMap = Arguments.createMap();
            if (eVar != null) {
                s.f(createMap, "this");
                eVar.a(handler, createMap);
            }
            createMap.putInt("handlerTag", handler.N());
            createMap.putInt("state", handler.M());
            s.f(createMap, "createMap().apply {\n    …\", handler.state)\n      }");
            return createMap;
        }

        public final <T extends GestureHandler<T>> d b(T handler, e<T> eVar) {
            s.g(handler, "handler");
            d dVar = (d) d.f21182d.b();
            if (dVar == null) {
                dVar = new d(null);
            }
            dVar.c(handler, eVar);
            return dVar;
        }
    }

    private d() {
    }

    public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends GestureHandler<T>> void c(T t11, e<T> eVar) {
        View R = t11.R();
        s.e(R);
        super.init(R.getId());
        this.f21183a = f21181c.a(t11, eVar);
        this.f21184b = t11.E();
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        s.g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerEvent", this.f21183a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return this.f21184b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.c
    public void onDispose() {
        this.f21183a = null;
        f21182d.a(this);
    }
}