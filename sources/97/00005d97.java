package com.swmansion.gesturehandler.react;

import android.view.View;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.swmansion.gesturehandler.GestureHandler;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class o extends com.facebook.react.uimanager.events.c<o> {

    /* renamed from: c  reason: collision with root package name */
    public static final a f21207c = new a(null);

    /* renamed from: d  reason: collision with root package name */
    private static final v3.g<o> f21208d = new v3.g<>(7);

    /* renamed from: a  reason: collision with root package name */
    private WritableMap f21209a;

    /* renamed from: b  reason: collision with root package name */
    private short f21210b;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <T extends GestureHandler<T>> WritableMap a(T handler) {
            s.g(handler, "handler");
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("handlerTag", handler.N());
            createMap.putInt("state", handler.M());
            createMap.putInt("numberOfTouches", handler.P());
            createMap.putInt("eventType", handler.O());
            WritableArray r11 = handler.r();
            if (r11 != null) {
                createMap.putArray("changedTouches", r11);
            }
            WritableArray q11 = handler.q();
            if (q11 != null) {
                createMap.putArray("allTouches", q11);
            }
            if (handler.W() && handler.M() == 4) {
                createMap.putInt("state", 2);
            }
            s.f(createMap, "createMap().apply {\n    …TATE_BEGAN)\n      }\n    }");
            return createMap;
        }

        public final <T extends GestureHandler<T>> o b(T handler) {
            s.g(handler, "handler");
            o oVar = (o) o.f21208d.b();
            if (oVar == null) {
                oVar = new o(null);
            }
            oVar.c(handler);
            return oVar;
        }
    }

    private o() {
    }

    public /* synthetic */ o(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends GestureHandler<T>> void c(T t11) {
        View R = t11.R();
        s.e(R);
        super.init(R.getId());
        this.f21209a = f21207c.a(t11);
        this.f21210b = t11.E();
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return true;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        s.g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), "onGestureHandlerEvent", this.f21209a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return this.f21210b;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "onGestureHandlerEvent";
    }

    @Override // com.facebook.react.uimanager.events.c
    public void onDispose() {
        this.f21209a = null;
        f21208d.a(this);
    }
}