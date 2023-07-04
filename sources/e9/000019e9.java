package com.facebook.react.uimanager;

import android.widget.ImageView;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
class u0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map a() {
        return yf.c.a().b("topChange", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onChange", "captured", "onChangeCapture"))).b("topSelect", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onSelect", "captured", "onSelectCapture"))).b(com.facebook.react.uimanager.events.l.getJSEventName(com.facebook.react.uimanager.events.l.START), yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onTouchStart", "captured", "onTouchStartCapture"))).b(com.facebook.react.uimanager.events.l.getJSEventName(com.facebook.react.uimanager.events.l.MOVE), yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onTouchMove", "captured", "onTouchMoveCapture"))).b(com.facebook.react.uimanager.events.l.getJSEventName(com.facebook.react.uimanager.events.l.END), yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onTouchEnd", "captured", "onTouchEndCapture"))).b(com.facebook.react.uimanager.events.l.getJSEventName(com.facebook.react.uimanager.events.l.CANCEL), yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onTouchCancel", "captured", "onTouchCancelCapture"))).a();
    }

    public static Map<String, Object> b() {
        HashMap b11 = yf.c.b();
        b11.put("UIView", yf.c.d("ContentMode", yf.c.f("ScaleAspectFit", Integer.valueOf(ImageView.ScaleType.FIT_CENTER.ordinal()), "ScaleAspectFill", Integer.valueOf(ImageView.ScaleType.CENTER_CROP.ordinal()), "ScaleAspectCenter", Integer.valueOf(ImageView.ScaleType.CENTER_INSIDE.ordinal()))));
        b11.put("StyleConstants", yf.c.d("PointerEventsValues", yf.c.g(PermissionsResponse.SCOPE_NONE, Integer.valueOf(q.NONE.ordinal()), "boxNone", Integer.valueOf(q.BOX_NONE.ordinal()), "boxOnly", Integer.valueOf(q.BOX_ONLY.ordinal()), "unspecified", Integer.valueOf(q.AUTO.ordinal()))));
        b11.put("PopupMenu", yf.c.e("dismissed", "dismissed", "itemSelected", "itemSelected"));
        b11.put("AccessibilityEventTypes", yf.c.f("typeWindowStateChanged", 32, "typeViewFocused", 8, "typeViewClicked", 1));
        return b11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Map c() {
        return yf.c.a().b("topContentSizeChange", yf.c.d("registrationName", "onContentSizeChange")).b("topLayout", yf.c.d("registrationName", "onLayout")).b("topPointerEnter", yf.c.d("registrationName", "pointerenter")).b("topPointerLeave", yf.c.d("registrationName", "pointerleave")).b("topPointerMove", yf.c.d("registrationName", "pointermove")).b("topLoadingError", yf.c.d("registrationName", "onLoadingError")).b("topLoadingFinish", yf.c.d("registrationName", "onLoadingFinish")).b("topLoadingStart", yf.c.d("registrationName", "onLoadingStart")).b("topSelectionChange", yf.c.d("registrationName", "onSelectionChange")).b("topMessage", yf.c.d("registrationName", "onMessage")).b("topClick", yf.c.d("registrationName", "onClick")).b("topScrollBeginDrag", yf.c.d("registrationName", "onScrollBeginDrag")).b("topScrollEndDrag", yf.c.d("registrationName", "onScrollEndDrag")).b("topScroll", yf.c.d("registrationName", "onScroll")).b("topMomentumScrollBegin", yf.c.d("registrationName", "onMomentumScrollBegin")).b("topMomentumScrollEnd", yf.c.d("registrationName", "onMomentumScrollEnd")).a();
    }
}