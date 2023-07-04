package com.facebook.react.views.view;

import android.graphics.Rect;
import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.t0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Map;

@fg.a(name = ReactViewManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class ReactViewManager extends ReactClippingViewManager<g> {
    private static final int CMD_HOTSPOT_UPDATE = 1;
    private static final int CMD_SET_PRESSED = 2;
    private static final String HOTSPOT_UPDATE_KEY = "hotspotUpdate";
    public static final String REACT_CLASS = "RCTView";
    private static final int[] SPACING_TYPES = {8, 0, 2, 1, 3, 4, 5};

    /* loaded from: classes3.dex */
    class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ g f12797a;

        a(ReactViewManager reactViewManager, g gVar) {
            this.f12797a = gVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            com.facebook.react.uimanager.events.d c11 = t0.c((ReactContext) this.f12797a.getContext(), this.f12797a.getId());
            if (c11 == null) {
                return;
            }
            c11.g(new h(t0.e(this.f12797a.getContext()), this.f12797a.getId()));
        }
    }

    /* loaded from: classes3.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12798a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f12798a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12798a[ReadableType.Map.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12798a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void handleHotspotUpdate(g gVar, ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() == 2) {
            gVar.drawableHotspotChanged(p.b(readableArray.getDouble(0)), p.b(readableArray.getDouble(1)));
            return;
        }
        throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'updateHotspot' command");
    }

    private void handleSetPressed(g gVar, ReadableArray readableArray) {
        if (readableArray != null && readableArray.size() == 1) {
            gVar.setPressed(readableArray.getBoolean(0));
            return;
        }
        throw new JSApplicationIllegalArgumentException("Illegal number of arguments for 'setPressed' command");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return yf.c.e(HOTSPOT_UPDATE_KEY, 1, "setPressed", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(defaultInt = -1, name = "nextFocusDown")
    public void nextFocusDown(g gVar, int i11) {
        gVar.setNextFocusDownId(i11);
    }

    @ng.a(defaultInt = -1, name = "nextFocusForward")
    public void nextFocusForward(g gVar, int i11) {
        gVar.setNextFocusForwardId(i11);
    }

    @ng.a(defaultInt = -1, name = "nextFocusLeft")
    public void nextFocusLeft(g gVar, int i11) {
        gVar.setNextFocusLeftId(i11);
    }

    @ng.a(defaultInt = -1, name = "nextFocusRight")
    public void nextFocusRight(g gVar, int i11) {
        gVar.setNextFocusRightId(i11);
    }

    @ng.a(defaultInt = -1, name = "nextFocusUp")
    public void nextFocusUp(g gVar, int i11) {
        gVar.setNextFocusUpId(i11);
    }

    @ng.a(name = "accessible")
    public void setAccessible(g gVar, boolean z11) {
        gVar.setFocusable(z11);
    }

    @ng.a(name = "backfaceVisibility")
    public void setBackfaceVisibility(g gVar, String str) {
        gVar.setBackfaceVisibility(str);
    }

    @ng.b(customType = "Color", names = {"borderColor", "borderLeftColor", "borderRightColor", "borderTopColor", "borderBottomColor", "borderStartColor", "borderEndColor"})
    public void setBorderColor(g gVar, int i11, Integer num) {
        gVar.setBorderColor(SPACING_TYPES[i11], num == null ? Float.NaN : num.intValue() & 16777215, num != null ? num.intValue() >>> 24 : Float.NaN);
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius", "borderTopStartRadius", "borderTopEndRadius", "borderBottomStartRadius", "borderBottomEndRadius"})
    public void setBorderRadius(g gVar, int i11, float f11) {
        if (!com.facebook.yoga.g.a(f11) && f11 < BitmapDescriptorFactory.HUE_RED) {
            f11 = Float.NaN;
        }
        if (!com.facebook.yoga.g.a(f11)) {
            f11 = p.c(f11);
        }
        if (i11 == 0) {
            gVar.setBorderRadius(f11);
        } else {
            gVar.setBorderRadius(f11, i11 - 1);
        }
    }

    @ng.a(name = "borderStyle")
    public void setBorderStyle(g gVar, String str) {
        gVar.setBorderStyle(str);
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderWidth", "borderLeftWidth", "borderRightWidth", "borderTopWidth", "borderBottomWidth", "borderStartWidth", "borderEndWidth"})
    public void setBorderWidth(g gVar, int i11, float f11) {
        if (!com.facebook.yoga.g.a(f11) && f11 < BitmapDescriptorFactory.HUE_RED) {
            f11 = Float.NaN;
        }
        if (!com.facebook.yoga.g.a(f11)) {
            f11 = p.c(f11);
        }
        gVar.setBorderWidth(SPACING_TYPES[i11], f11);
    }

    @ng.a(name = "collapsable")
    public void setCollapsable(g gVar, boolean z11) {
    }

    @ng.a(name = "focusable")
    public void setFocusable(g gVar, boolean z11) {
        if (z11) {
            gVar.setOnClickListener(new a(this, gVar));
            gVar.setFocusable(true);
            return;
        }
        gVar.setOnClickListener(null);
        gVar.setClickable(false);
    }

    @ng.a(name = "hitSlop")
    public void setHitSlop(g gVar, Dynamic dynamic) {
        int i11 = b.f12798a[dynamic.getType().ordinal()];
        if (i11 == 1) {
            gVar.setHitSlopRect(null);
        } else if (i11 == 2) {
            ReadableMap asMap = dynamic.asMap();
            gVar.setHitSlopRect(new Rect(asMap.hasKey("left") ? (int) p.b(asMap.getDouble("left")) : 0, asMap.hasKey("top") ? (int) p.b(asMap.getDouble("top")) : 0, asMap.hasKey("right") ? (int) p.b(asMap.getDouble("right")) : 0, asMap.hasKey("bottom") ? (int) p.b(asMap.getDouble("bottom")) : 0));
        } else if (i11 == 3) {
            int b11 = (int) p.b(dynamic.asDouble());
            gVar.setHitSlopRect(new Rect(b11, b11, b11, b11));
        } else {
            throw new JSApplicationIllegalArgumentException("Invalid type for 'hitSlop' value " + dynamic.getType());
        }
    }

    @ng.a(name = "nativeBackgroundAndroid")
    public void setNativeBackground(g gVar, ReadableMap readableMap) {
        gVar.setTranslucentBackgroundDrawable(readableMap == null ? null : d.a(gVar.getContext(), readableMap));
    }

    @ng.a(name = "nativeForegroundAndroid")
    public void setNativeForeground(g gVar, ReadableMap readableMap) {
        gVar.setForeground(readableMap == null ? null : d.a(gVar.getContext(), readableMap));
    }

    @ng.a(name = "needsOffscreenAlphaCompositing")
    public void setNeedsOffscreenAlphaCompositing(g gVar, boolean z11) {
        gVar.setNeedsOffscreenAlphaCompositing(z11);
    }

    @ng.a(name = "overflow")
    public void setOverflow(g gVar, String str) {
        gVar.setOverflow(str);
    }

    @ng.a(name = "pointerEvents")
    public void setPointerEvents(g gVar, String str) {
        gVar.setPointerEvents(q.parsePointerEvents(str));
    }

    @ng.a(name = "hasTVPreferredFocus")
    public void setTVPreferredFocus(g gVar, boolean z11) {
        if (z11) {
            gVar.setFocusable(true);
            gVar.setFocusableInTouchMode(true);
            gVar.requestFocus();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public g createViewInstance(n0 n0Var) {
        return new g(n0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setOpacity(g gVar, float f11) {
        gVar.setOpacityIfPossible(f11);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setTransform(g gVar, ReadableArray readableArray) {
        super.setTransform((ReactViewManager) gVar, readableArray);
        gVar.setBackfaceVisibilityDependantOpacity();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(g gVar, int i11, ReadableArray readableArray) {
        if (i11 == 1) {
            handleHotspotUpdate(gVar, readableArray);
        } else if (i11 != 2) {
        } else {
            handleSetPressed(gVar, readableArray);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(g gVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setPressed")) {
            handleSetPressed(gVar, readableArray);
        } else if (str.equals(HOTSPOT_UPDATE_KEY)) {
            handleHotspotUpdate(gVar, readableArray);
        }
    }
}