package com.swmansion.gesturehandler.react;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.q0;
import com.facebook.react.z;
import com.swmansion.gesturehandler.GestureHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.v;
import wz.s0;

@fg.a(name = RNGestureHandlerModule.MODULE_NAME)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0089\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f*\u00010\b\u0007\u0018\u0000 F2\u00020\u00012\u00020\u0002:\nGHIJKLMNOPB\u0011\u0012\b\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bD\u0010EJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002J.\u0010\u000e\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\r\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0002J/\u0010\u0011\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J7\u0010\u0015\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0019H\u0016J0\u0010\u001f\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J \u0010\"\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 H\u0007J(\u0010#\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u000b*\b\u0012\u0004\u0012\u00028\u00000\n2\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001dH\u0007J\u0010\u0010$\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0003H\u0007J\u0018\u0010&\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010%\u001a\u00020 H\u0007J\b\u0010'\u001a\u00020\u0005H\u0007J\u0018\u0010(\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0003H\u0016J\u0014\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020*0)H\u0016J\b\u0010,\u001a\u00020\u0005H\u0016J\u000e\u0010.\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\bJ\u000e\u0010/\u001a\u00020\u00052\u0006\u0010-\u001a\u00020\bR\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R \u00104\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r038\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0019\u00107\u001a\u0002068\u0006@\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0016\u0010<\u001a\u00020;8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00020\b0>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00030>8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010@¨\u0006Q"}, d2 = {"Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lwr/a;", "", "ancestorViewTag", "Lvz/b0;", "tryInitializeHandlerForReactRootView", "viewTag", "Lcom/swmansion/gesturehandler/react/l;", "findRootHelperForViewAncestor", "Lcom/swmansion/gesturehandler/GestureHandler;", "T", "handler", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "findFactoryForHandler", "Landroid/view/MotionEvent;", "motionEvent", "onHandlerUpdate", "(Lcom/swmansion/gesturehandler/GestureHandler;Landroid/view/MotionEvent;)V", "newState", "oldState", "onStateChange", "(Lcom/swmansion/gesturehandler/GestureHandler;II)V", "onTouchEvent", "(Lcom/swmansion/gesturehandler/GestureHandler;)V", "", "getName", "handlerName", "handlerTag", "Lcom/facebook/react/bridge/ReadableMap;", "config", "createGestureHandler", "", "useDeviceEvents", "attachGestureHandler", "updateGestureHandler", "dropGestureHandler", "blockNativeResponder", "handleSetJSResponder", "handleClearJSResponder", "setGestureHandlerState", "", "", "getConstants", "onCatalystInstanceDestroy", "root", "registerRootHelper", "unregisterRootHelper", "com/swmansion/gesturehandler/react/RNGestureHandlerModule$k", "eventListener", "Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$k;", "", "handlerFactories", "[Lcom/swmansion/gesturehandler/react/RNGestureHandlerModule$c;", "Lcom/swmansion/gesturehandler/react/j;", "registry", "Lcom/swmansion/gesturehandler/react/j;", "getRegistry", "()Lcom/swmansion/gesturehandler/react/j;", "Lcom/swmansion/gesturehandler/react/f;", "interactionManager", "Lcom/swmansion/gesturehandler/react/f;", "", "roots", "Ljava/util/List;", "enqueuedRootViewInit", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "Companion", "a", "b", cg.c.f9084i, "d", "e", "f", "g", "h", IntegerTokenConverter.CONVERTER_KEY, "j", "react-native-gesture-handler_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RNGestureHandlerModule extends ReactContextBaseJavaModule implements wr.a {
    public static final a Companion = new a(null);
    private static final String KEY_DIRECTION = "direction";
    private static final String KEY_ENABLED = "enabled";
    private static final String KEY_HIT_SLOP = "hitSlop";
    private static final String KEY_HIT_SLOP_BOTTOM = "bottom";
    private static final String KEY_HIT_SLOP_HEIGHT = "height";
    private static final String KEY_HIT_SLOP_HORIZONTAL = "horizontal";
    private static final String KEY_HIT_SLOP_LEFT = "left";
    private static final String KEY_HIT_SLOP_RIGHT = "right";
    private static final String KEY_HIT_SLOP_TOP = "top";
    private static final String KEY_HIT_SLOP_VERTICAL = "vertical";
    private static final String KEY_HIT_SLOP_WIDTH = "width";
    private static final String KEY_LONG_PRESS_MAX_DIST = "maxDist";
    private static final String KEY_LONG_PRESS_MIN_DURATION_MS = "minDurationMs";
    private static final String KEY_MANUAL_ACTIVATION = "manualActivation";
    private static final String KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION = "disallowInterruption";
    private static final String KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START = "shouldActivateOnStart";
    private static final String KEY_NEEDS_POINTER_DATA = "needsPointerData";
    private static final String KEY_NUMBER_OF_POINTERS = "numberOfPointers";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_END = "activeOffsetXEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_X_START = "activeOffsetXStart";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_END = "activeOffsetYEnd";
    private static final String KEY_PAN_ACTIVE_OFFSET_Y_START = "activeOffsetYStart";
    private static final String KEY_PAN_AVG_TOUCHES = "avgTouches";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_END = "failOffsetXEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_X_START = "failOffsetXStart";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_END = "failOffsetYEnd";
    private static final String KEY_PAN_FAIL_OFFSET_RANGE_Y_START = "failOffsetYStart";
    private static final String KEY_PAN_MAX_POINTERS = "maxPointers";
    private static final String KEY_PAN_MIN_DIST = "minDist";
    private static final String KEY_PAN_MIN_POINTERS = "minPointers";
    private static final String KEY_PAN_MIN_VELOCITY = "minVelocity";
    private static final String KEY_PAN_MIN_VELOCITY_X = "minVelocityX";
    private static final String KEY_PAN_MIN_VELOCITY_Y = "minVelocityY";
    private static final String KEY_SHOULD_CANCEL_WHEN_OUTSIDE = "shouldCancelWhenOutside";
    private static final String KEY_TAP_MAX_DELAY_MS = "maxDelayMs";
    private static final String KEY_TAP_MAX_DELTA_X = "maxDeltaX";
    private static final String KEY_TAP_MAX_DELTA_Y = "maxDeltaY";
    private static final String KEY_TAP_MAX_DIST = "maxDist";
    private static final String KEY_TAP_MAX_DURATION_MS = "maxDurationMs";
    private static final String KEY_TAP_MIN_POINTERS = "minPointers";
    private static final String KEY_TAP_NUMBER_OF_TAPS = "numberOfTaps";
    public static final String MODULE_NAME = "RNGestureHandlerModule";
    private final List<Integer> enqueuedRootViewInit;
    private final k eventListener;
    private final c<?>[] handlerFactories;
    private final com.swmansion.gesturehandler.react.f interactionManager;
    private final com.swmansion.gesturehandler.react.j registry;
    private final List<l> roots;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(GestureHandler<?> gestureHandler, ReadableMap readableMap) {
            if (readableMap.getType(RNGestureHandlerModule.KEY_HIT_SLOP) == ReadableType.Number) {
                float b11 = com.facebook.react.uimanager.p.b(readableMap.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP));
                gestureHandler.q0(b11, b11, b11, b11, Float.NaN, Float.NaN);
                return;
            }
            ReadableMap map = readableMap.getMap(RNGestureHandlerModule.KEY_HIT_SLOP);
            s.e(map);
            s.f(map, "config.getMap(KEY_HIT_SLOP)!!");
            float b12 = map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL) ? com.facebook.react.uimanager.p.b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_HORIZONTAL)) : Float.NaN;
            float f11 = b12;
            float b13 = map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL) ? com.facebook.react.uimanager.p.b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_VERTICAL)) : Float.NaN;
            float f12 = b13;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_LEFT)) {
                b12 = com.facebook.react.uimanager.p.b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_LEFT));
            }
            float f13 = b12;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_TOP)) {
                b13 = com.facebook.react.uimanager.p.b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_TOP));
            }
            float f14 = b13;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_RIGHT)) {
                f11 = com.facebook.react.uimanager.p.b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_RIGHT));
            }
            float f15 = f11;
            if (map.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP_BOTTOM)) {
                f12 = com.facebook.react.uimanager.p.b(map.getDouble(RNGestureHandlerModule.KEY_HIT_SLOP_BOTTOM));
            }
            gestureHandler.q0(f13, f14, f15, f12, map.hasKey("width") ? com.facebook.react.uimanager.p.b(map.getDouble("width")) : Float.NaN, map.hasKey("height") ? com.facebook.react.uimanager.p.b(map.getDouble("height")) : Float.NaN);
        }
    }

    /* loaded from: classes6.dex */
    private static final class b extends c<com.swmansion.gesturehandler.a> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<com.swmansion.gesturehandler.a> f21159a = com.swmansion.gesturehandler.a.class;

        /* renamed from: b  reason: collision with root package name */
        private final String f21160b = "FlingGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f21160b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class<com.swmansion.gesturehandler.a> e() {
            return this.f21159a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f */
        public void b(com.swmansion.gesturehandler.a handler, ReadableMap config) {
            s.g(handler, "handler");
            s.g(config, "config");
            super.b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS)) {
                handler.L0(config.getInt(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_DIRECTION)) {
                handler.K0(config.getInt(RNGestureHandlerModule.KEY_DIRECTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g */
        public com.swmansion.gesturehandler.a c(Context context) {
            return new com.swmansion.gesturehandler.a();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c, com.swmansion.gesturehandler.react.e
        /* renamed from: h */
        public void a(com.swmansion.gesturehandler.a handler, WritableMap eventData) {
            s.g(handler, "handler");
            s.g(eventData, "eventData");
            super.a(handler, eventData);
            eventData.putDouble("x", com.facebook.react.uimanager.p.a(handler.H()));
            eventData.putDouble("y", com.facebook.react.uimanager.p.a(handler.I()));
            eventData.putDouble("absoluteX", com.facebook.react.uimanager.p.a(handler.F()));
            eventData.putDouble("absoluteY", com.facebook.react.uimanager.p.a(handler.G()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public static abstract class c<T extends GestureHandler<T>> implements com.swmansion.gesturehandler.react.e<T> {
        @Override // com.swmansion.gesturehandler.react.e
        public void a(T handler, WritableMap eventData) {
            s.g(handler, "handler");
            s.g(eventData, "eventData");
            eventData.putDouble(RNGestureHandlerModule.KEY_NUMBER_OF_POINTERS, handler.K());
        }

        public void b(T handler, ReadableMap config) {
            s.g(handler, "handler");
            s.g(config, "config");
            handler.i0();
            if (config.hasKey(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE)) {
                handler.v0(config.getBoolean(RNGestureHandlerModule.KEY_SHOULD_CANCEL_WHEN_OUTSIDE));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_ENABLED)) {
                handler.o0(config.getBoolean(RNGestureHandlerModule.KEY_ENABLED));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_HIT_SLOP)) {
                RNGestureHandlerModule.Companion.b(handler, config);
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA)) {
                handler.t0(config.getBoolean(RNGestureHandlerModule.KEY_NEEDS_POINTER_DATA));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION)) {
                handler.s0(config.getBoolean(RNGestureHandlerModule.KEY_MANUAL_ACTIVATION));
            }
        }

        public abstract T c(Context context);

        public abstract String d();

        public abstract Class<T> e();
    }

    /* loaded from: classes6.dex */
    private static final class d extends c<com.swmansion.gesturehandler.b> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<com.swmansion.gesturehandler.b> f21161a = com.swmansion.gesturehandler.b.class;

        /* renamed from: b  reason: collision with root package name */
        private final String f21162b = "LongPressGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f21162b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class<com.swmansion.gesturehandler.b> e() {
            return this.f21161a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f */
        public void b(com.swmansion.gesturehandler.b handler, ReadableMap config) {
            s.g(handler, "handler");
            s.g(config, "config");
            super.b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS)) {
                handler.L0(config.getInt(RNGestureHandlerModule.KEY_LONG_PRESS_MIN_DURATION_MS));
            }
            if (config.hasKey("maxDist")) {
                handler.K0(com.facebook.react.uimanager.p.b(config.getDouble("maxDist")));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g */
        public com.swmansion.gesturehandler.b c(Context context) {
            s.e(context);
            return new com.swmansion.gesturehandler.b(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c, com.swmansion.gesturehandler.react.e
        /* renamed from: h */
        public void a(com.swmansion.gesturehandler.b handler, WritableMap eventData) {
            s.g(handler, "handler");
            s.g(eventData, "eventData");
            super.a(handler, eventData);
            eventData.putDouble("x", com.facebook.react.uimanager.p.a(handler.H()));
            eventData.putDouble("y", com.facebook.react.uimanager.p.a(handler.I()));
            eventData.putDouble("absoluteX", com.facebook.react.uimanager.p.a(handler.F()));
            eventData.putDouble("absoluteY", com.facebook.react.uimanager.p.a(handler.G()));
            eventData.putInt("duration", handler.I0());
        }
    }

    /* loaded from: classes6.dex */
    private static final class e extends c<xr.j> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<xr.j> f21163a = xr.j.class;

        /* renamed from: b  reason: collision with root package name */
        private final String f21164b = "ManualGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f21164b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class<xr.j> e() {
            return this.f21163a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f */
        public xr.j c(Context context) {
            return new xr.j();
        }
    }

    /* loaded from: classes6.dex */
    private static final class f extends c<com.swmansion.gesturehandler.c> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<com.swmansion.gesturehandler.c> f21165a = com.swmansion.gesturehandler.c.class;

        /* renamed from: b  reason: collision with root package name */
        private final String f21166b = "NativeViewGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f21166b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class<com.swmansion.gesturehandler.c> e() {
            return this.f21165a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f */
        public void b(com.swmansion.gesturehandler.c handler, ReadableMap config) {
            s.g(handler, "handler");
            s.g(config, "config");
            super.b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START)) {
                handler.K0(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_SHOULD_ACTIVATE_ON_START));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION)) {
                handler.J0(config.getBoolean(RNGestureHandlerModule.KEY_NATIVE_VIEW_DISALLOW_INTERRUPTION));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g */
        public com.swmansion.gesturehandler.c c(Context context) {
            return new com.swmansion.gesturehandler.c();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c, com.swmansion.gesturehandler.react.e
        /* renamed from: h */
        public void a(com.swmansion.gesturehandler.c handler, WritableMap eventData) {
            s.g(handler, "handler");
            s.g(eventData, "eventData");
            super.a(handler, eventData);
            eventData.putBoolean("pointerInside", handler.Y());
        }
    }

    /* loaded from: classes6.dex */
    private static final class g extends c<com.swmansion.gesturehandler.d> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<com.swmansion.gesturehandler.d> f21167a = com.swmansion.gesturehandler.d.class;

        /* renamed from: b  reason: collision with root package name */
        private final String f21168b = "PanGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f21168b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class<com.swmansion.gesturehandler.d> e() {
            return this.f21167a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f */
        public void b(com.swmansion.gesturehandler.d handler, ReadableMap config) {
            boolean z11;
            s.g(handler, "handler");
            s.g(config, "config");
            super.b(handler, config);
            boolean z12 = true;
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)) {
                handler.M0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_START)));
                z11 = true;
            } else {
                z11 = false;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)) {
                handler.L0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_X_END)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)) {
                handler.R0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_START)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)) {
                handler.Q0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_X_END)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)) {
                handler.O0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_START)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)) {
                handler.N0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_ACTIVE_OFFSET_Y_END)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)) {
                handler.T0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_START)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)) {
                handler.S0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_FAIL_OFFSET_RANGE_Y_END)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)) {
                handler.X0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)) {
                handler.Y0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_X)));
                z11 = true;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)) {
                handler.Z0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_VELOCITY_Y)));
            } else {
                z12 = z11;
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MIN_DIST)) {
                handler.V0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_PAN_MIN_DIST)));
            } else if (z12) {
                handler.V0(Float.MAX_VALUE);
            }
            if (config.hasKey("minPointers")) {
                handler.W0(config.getInt("minPointers"));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS)) {
                handler.U0(config.getInt(RNGestureHandlerModule.KEY_PAN_MAX_POINTERS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES)) {
                handler.P0(config.getBoolean(RNGestureHandlerModule.KEY_PAN_AVG_TOUCHES));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g */
        public com.swmansion.gesturehandler.d c(Context context) {
            return new com.swmansion.gesturehandler.d(context);
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c, com.swmansion.gesturehandler.react.e
        /* renamed from: h */
        public void a(com.swmansion.gesturehandler.d handler, WritableMap eventData) {
            s.g(handler, "handler");
            s.g(eventData, "eventData");
            super.a(handler, eventData);
            eventData.putDouble("x", com.facebook.react.uimanager.p.a(handler.H()));
            eventData.putDouble("y", com.facebook.react.uimanager.p.a(handler.I()));
            eventData.putDouble("absoluteX", com.facebook.react.uimanager.p.a(handler.F()));
            eventData.putDouble("absoluteY", com.facebook.react.uimanager.p.a(handler.G()));
            eventData.putDouble("translationX", com.facebook.react.uimanager.p.a(handler.H0()));
            eventData.putDouble("translationY", com.facebook.react.uimanager.p.a(handler.I0()));
            eventData.putDouble("velocityX", com.facebook.react.uimanager.p.a(handler.J0()));
            eventData.putDouble("velocityY", com.facebook.react.uimanager.p.a(handler.K0()));
        }
    }

    /* loaded from: classes6.dex */
    private static final class h extends c<xr.l> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<xr.l> f21169a = xr.l.class;

        /* renamed from: b  reason: collision with root package name */
        private final String f21170b = "PinchGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f21170b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class<xr.l> e() {
            return this.f21169a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f */
        public xr.l c(Context context) {
            return new xr.l();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c, com.swmansion.gesturehandler.react.e
        /* renamed from: g */
        public void a(xr.l handler, WritableMap eventData) {
            s.g(handler, "handler");
            s.g(eventData, "eventData");
            super.a(handler, eventData);
            eventData.putDouble("scale", handler.O0());
            eventData.putDouble("focalX", com.facebook.react.uimanager.p.a(handler.M0()));
            eventData.putDouble("focalY", com.facebook.react.uimanager.p.a(handler.N0()));
            eventData.putDouble("velocity", handler.P0());
        }
    }

    /* loaded from: classes6.dex */
    private static final class i extends c<com.swmansion.gesturehandler.f> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<com.swmansion.gesturehandler.f> f21171a = com.swmansion.gesturehandler.f.class;

        /* renamed from: b  reason: collision with root package name */
        private final String f21172b = "RotationGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f21172b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class<com.swmansion.gesturehandler.f> e() {
            return this.f21171a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f */
        public com.swmansion.gesturehandler.f c(Context context) {
            return new com.swmansion.gesturehandler.f();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c, com.swmansion.gesturehandler.react.e
        /* renamed from: g */
        public void a(com.swmansion.gesturehandler.f handler, WritableMap eventData) {
            s.g(handler, "handler");
            s.g(eventData, "eventData");
            super.a(handler, eventData);
            eventData.putDouble("rotation", handler.L0());
            eventData.putDouble("anchorX", com.facebook.react.uimanager.p.a(handler.J0()));
            eventData.putDouble("anchorY", com.facebook.react.uimanager.p.a(handler.K0()));
            eventData.putDouble("velocity", handler.M0());
        }
    }

    /* loaded from: classes6.dex */
    private static final class j extends c<com.swmansion.gesturehandler.g> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<com.swmansion.gesturehandler.g> f21173a = com.swmansion.gesturehandler.g.class;

        /* renamed from: b  reason: collision with root package name */
        private final String f21174b = "TapGestureHandler";

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public String d() {
            return this.f21174b;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        public Class<com.swmansion.gesturehandler.g> e() {
            return this.f21173a;
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: f */
        public void b(com.swmansion.gesturehandler.g handler, ReadableMap config) {
            s.g(handler, "handler");
            s.g(config, "config");
            super.b(handler, config);
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS)) {
                handler.Q0(config.getInt(RNGestureHandlerModule.KEY_TAP_NUMBER_OF_TAPS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS)) {
                handler.M0(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DURATION_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS)) {
                handler.K0(config.getInt(RNGestureHandlerModule.KEY_TAP_MAX_DELAY_MS));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)) {
                handler.N0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_X)));
            }
            if (config.hasKey(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)) {
                handler.O0(com.facebook.react.uimanager.p.b(config.getDouble(RNGestureHandlerModule.KEY_TAP_MAX_DELTA_Y)));
            }
            if (config.hasKey("maxDist")) {
                handler.L0(com.facebook.react.uimanager.p.b(config.getDouble("maxDist")));
            }
            if (config.hasKey("minPointers")) {
                handler.P0(config.getInt("minPointers"));
            }
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c
        /* renamed from: g */
        public com.swmansion.gesturehandler.g c(Context context) {
            return new com.swmansion.gesturehandler.g();
        }

        @Override // com.swmansion.gesturehandler.react.RNGestureHandlerModule.c, com.swmansion.gesturehandler.react.e
        /* renamed from: h */
        public void a(com.swmansion.gesturehandler.g handler, WritableMap eventData) {
            s.g(handler, "handler");
            s.g(eventData, "eventData");
            super.a(handler, eventData);
            eventData.putDouble("x", com.facebook.react.uimanager.p.a(handler.H()));
            eventData.putDouble("y", com.facebook.react.uimanager.p.a(handler.I()));
            eventData.putDouble("absoluteX", com.facebook.react.uimanager.p.a(handler.F()));
            eventData.putDouble("absoluteY", com.facebook.react.uimanager.p.a(handler.G()));
        }
    }

    /* loaded from: classes6.dex */
    public static final class k implements xr.k {
        k() {
        }

        @Override // xr.k
        public <T extends GestureHandler<T>> void a(T handler, int i11, int i12) {
            s.g(handler, "handler");
            RNGestureHandlerModule.this.onStateChange(handler, i11, i12);
        }

        @Override // xr.k
        public <T extends GestureHandler<T>> void b(T handler) {
            s.g(handler, "handler");
            RNGestureHandlerModule.this.onTouchEvent(handler);
        }

        @Override // xr.k
        public <T extends GestureHandler<T>> void c(T handler, MotionEvent event) {
            s.g(handler, "handler");
            s.g(event, "event");
            RNGestureHandlerModule.this.onHandlerUpdate(handler, event);
        }
    }

    public RNGestureHandlerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.eventListener = new k();
        this.handlerFactories = new c[]{new f(), new j(), new d(), new g(), new h(), new i(), new b(), new e()};
        this.registry = new com.swmansion.gesturehandler.react.j();
        this.interactionManager = new com.swmansion.gesturehandler.react.f();
        this.roots = new ArrayList();
        this.enqueuedRootViewInit = new ArrayList();
    }

    private final <T extends GestureHandler<T>> c<T> findFactoryForHandler(GestureHandler<T> gestureHandler) {
        for (c<?> cVar : this.handlerFactories) {
            c<T> cVar2 = (c<T>) cVar;
            if (s.c(cVar2.e(), gestureHandler.getClass())) {
                return cVar2;
            }
        }
        return null;
    }

    private final l findRootHelperForViewAncestor(int i11) {
        l lVar;
        boolean z11;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.f(reactApplicationContext, "reactApplicationContext");
        int resolveRootTagFromReactTag = xr.a.b(reactApplicationContext).resolveRootTagFromReactTag(i11);
        Object obj = null;
        if (resolveRootTagFromReactTag < 1) {
            return null;
        }
        synchronized (this.roots) {
            Iterator<T> it2 = this.roots.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                l lVar2 = (l) next;
                if ((lVar2.d() instanceof z) && ((z) lVar2.d()).getRootViewTag() == resolveRootTagFromReactTag) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    obj = next;
                    break;
                }
            }
            lVar = (l) obj;
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends GestureHandler<T>> void onHandlerUpdate(T t11, MotionEvent motionEvent) {
        if (t11.N() >= 0 && t11.M() == 4) {
            c<T> findFactoryForHandler = findFactoryForHandler(t11);
            if (t11.Q()) {
                WritableMap a11 = com.swmansion.gesturehandler.react.d.f21181c.a(t11, findFactoryForHandler);
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                s.f(reactApplicationContext, "reactApplicationContext");
                xr.a.a(reactApplicationContext).emit("onGestureHandlerEvent", a11);
                return;
            }
            ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
            s.f(reactApplicationContext2, "reactApplicationContext");
            xr.a.b(reactApplicationContext2).getEventDispatcher().g(com.swmansion.gesturehandler.react.d.f21181c.b(t11, findFactoryForHandler));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends GestureHandler<T>> void onStateChange(T t11, int i11, int i12) {
        if (t11.N() < 0) {
            return;
        }
        c<T> findFactoryForHandler = findFactoryForHandler(t11);
        if (t11.Q()) {
            WritableMap a11 = n.f21204b.a(t11, findFactoryForHandler, i11, i12);
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            s.f(reactApplicationContext, "reactApplicationContext");
            xr.a.a(reactApplicationContext).emit("onGestureHandlerStateChange", a11);
            return;
        }
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        s.f(reactApplicationContext2, "reactApplicationContext");
        xr.a.b(reactApplicationContext2).getEventDispatcher().g(n.f21204b.b(t11, i11, i12, findFactoryForHandler));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends GestureHandler<T>> void onTouchEvent(T t11) {
        if (t11.N() < 0) {
            return;
        }
        if (t11.M() == 2 || t11.M() == 4 || t11.M() == 0 || t11.R() != null) {
            if (t11.Q()) {
                WritableMap a11 = o.f21207c.a(t11);
                ReactApplicationContext reactApplicationContext = getReactApplicationContext();
                s.f(reactApplicationContext, "reactApplicationContext");
                xr.a.a(reactApplicationContext).emit("onGestureHandlerEvent", a11);
                return;
            }
            ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
            s.f(reactApplicationContext2, "reactApplicationContext");
            xr.a.b(reactApplicationContext2).getEventDispatcher().g(o.f21207c.b(t11));
        }
    }

    private final void tryInitializeHandlerForReactRootView(int i11) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        s.f(reactApplicationContext, "reactApplicationContext");
        UIManagerModule b11 = xr.a.b(reactApplicationContext);
        final int resolveRootTagFromReactTag = b11.resolveRootTagFromReactTag(i11);
        if (resolveRootTagFromReactTag >= 1) {
            synchronized (this.roots) {
                for (l lVar : this.roots) {
                    ViewGroup d11 = lVar.d();
                    if ((d11 instanceof z) && ((z) d11).getRootViewTag() == resolveRootTagFromReactTag) {
                        return;
                    }
                }
                b0 b0Var = b0.f54756a;
                synchronized (this.enqueuedRootViewInit) {
                    if (this.enqueuedRootViewInit.contains(Integer.valueOf(resolveRootTagFromReactTag))) {
                        return;
                    }
                    this.enqueuedRootViewInit.add(Integer.valueOf(resolveRootTagFromReactTag));
                    b11.addUIBlock(new q0() { // from class: com.swmansion.gesturehandler.react.g
                        @Override // com.facebook.react.uimanager.q0
                        public final void execute(com.facebook.react.uimanager.m mVar) {
                            RNGestureHandlerModule.m549tryInitializeHandlerForReactRootView$lambda6(resolveRootTagFromReactTag, this, mVar);
                        }
                    });
                    return;
                }
            }
        }
        throw new JSApplicationIllegalArgumentException(s.p("Could find root view for a given ancestor with tag ", Integer.valueOf(i11)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tryInitializeHandlerForReactRootView$lambda-6  reason: not valid java name */
    public static final void m549tryInitializeHandlerForReactRootView$lambda6(int i11, RNGestureHandlerModule this$0, com.facebook.react.uimanager.m mVar) {
        s.g(this$0, "this$0");
        View resolveView = mVar.resolveView(i11);
        if (resolveView instanceof com.swmansion.gesturehandler.react.c) {
            ((com.swmansion.gesturehandler.react.c) resolveView).w();
        }
        synchronized (this$0.enqueuedRootViewInit) {
            this$0.enqueuedRootViewInit.remove(Integer.valueOf(i11));
            b0 b0Var = b0.f54756a;
        }
    }

    @ReactMethod
    public final void attachGestureHandler(int i11, int i12, boolean z11) {
        tryInitializeHandlerForReactRootView(i12);
        if (this.registry.c(i11, i12, z11)) {
            return;
        }
        throw new JSApplicationIllegalArgumentException("Handler with tag " + i11 + " does not exists");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [com.swmansion.gesturehandler.GestureHandler] */
    @ReactMethod
    public final <T extends GestureHandler<T>> void createGestureHandler(String handlerName, int i11, ReadableMap config) {
        s.g(handlerName, "handlerName");
        s.g(config, "config");
        c<?>[] cVarArr = this.handlerFactories;
        int length = cVarArr.length;
        int i12 = 0;
        while (i12 < length) {
            c<?> cVar = cVarArr[i12];
            i12++;
            if (s.c(cVar.d(), handlerName)) {
                ?? c11 = cVar.c(getReactApplicationContext());
                c11.x0(i11);
                c11.u0(this.eventListener);
                this.registry.k(c11);
                this.interactionManager.e(c11, config);
                cVar.b(c11, config);
                return;
            }
        }
        throw new JSApplicationIllegalArgumentException(s.p("Invalid handler name ", handlerName));
    }

    @ReactMethod
    public final void dropGestureHandler(int i11) {
        this.interactionManager.g(i11);
        this.registry.h(i11);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        Map l11;
        Map l12;
        Map<String, Object> l13;
        l11 = s0.l(v.a("UNDETERMINED", 0), v.a("BEGAN", 2), v.a("ACTIVE", 4), v.a("CANCELLED", 3), v.a("FAILED", 1), v.a("END", 5));
        l12 = s0.l(v.a("RIGHT", 1), v.a("LEFT", 2), v.a("UP", 4), v.a("DOWN", 8));
        l13 = s0.l(v.a("State", l11), v.a("Direction", l12));
        return l13;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    public final com.swmansion.gesturehandler.react.j getRegistry() {
        return this.registry;
    }

    @ReactMethod
    public final void handleClearJSResponder() {
    }

    @ReactMethod
    public final void handleSetJSResponder(int i11, boolean z11) {
        l findRootHelperForViewAncestor = findRootHelperForViewAncestor(i11);
        if (findRootHelperForViewAncestor == null) {
            return;
        }
        findRootHelperForViewAncestor.e(i11, z11);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        this.registry.g();
        this.interactionManager.h();
        synchronized (this.roots) {
            while (!this.roots.isEmpty()) {
                int size = this.roots.size();
                l lVar = this.roots.get(0);
                ViewGroup d11 = lVar.d();
                if (d11 instanceof com.swmansion.gesturehandler.react.c) {
                    ((com.swmansion.gesturehandler.react.c) d11).x();
                } else {
                    lVar.h();
                }
                if (this.roots.size() >= size) {
                    throw new IllegalStateException("Expected root helper to get unregistered while tearing down");
                }
            }
            b0 b0Var = b0.f54756a;
        }
        super.onCatalystInstanceDestroy();
    }

    public final void registerRootHelper(l root) {
        s.g(root, "root");
        synchronized (this.roots) {
            if (!this.roots.contains(root)) {
                this.roots.add(root);
            } else {
                throw new IllegalStateException("Root helper" + root + " already registered");
            }
        }
    }

    @Override // wr.a
    public void setGestureHandlerState(int i11, int i12) {
        GestureHandler<?> i13 = this.registry.i(i11);
        if (i13 == null) {
            return;
        }
        if (i12 == 1) {
            i13.B();
        } else if (i12 == 2) {
            i13.n();
        } else if (i12 == 3) {
            i13.o();
        } else if (i12 == 4) {
            i13.j(true);
        } else if (i12 != 5) {
        } else {
            i13.z();
        }
    }

    public final void unregisterRootHelper(l root) {
        s.g(root, "root");
        synchronized (this.roots) {
            this.roots.remove(root);
        }
    }

    @ReactMethod
    public final <T extends GestureHandler<T>> void updateGestureHandler(int i11, ReadableMap config) {
        c<T> findFactoryForHandler;
        s.g(config, "config");
        GestureHandler<?> i12 = this.registry.i(i11);
        if (i12 == null || (findFactoryForHandler = findFactoryForHandler(i12)) == null) {
            return;
        }
        this.interactionManager.g(i11);
        this.interactionManager.e(i12, config);
        findFactoryForHandler.b(i12, config);
    }
}