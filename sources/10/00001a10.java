package com.facebook.react.views.drawer;

import android.view.View;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.t0;
import e4.a;
import java.util.HashMap;
import java.util.Map;
import sg.b;
import ug.c;

@fg.a(name = ReactDrawerLayoutManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class ReactDrawerLayoutManager extends ViewGroupManager<com.facebook.react.views.drawer.a> implements b<com.facebook.react.views.drawer.a> {
    public static final int CLOSE_DRAWER = 2;
    public static final int OPEN_DRAWER = 1;
    public static final String REACT_CLASS = "AndroidDrawerLayout";
    private final b1<com.facebook.react.views.drawer.a> mDelegate = new sg.a(this);

    /* loaded from: classes3.dex */
    public static class a implements a.e {

        /* renamed from: a  reason: collision with root package name */
        private final e4.a f12511a;

        /* renamed from: b  reason: collision with root package name */
        private final d f12512b;

        public a(e4.a aVar, d dVar) {
            this.f12511a = aVar;
            this.f12512b = dVar;
        }

        @Override // e4.a.e
        public void a(View view) {
            this.f12512b.g(new ug.b(t0.f(this.f12511a), this.f12511a.getId()));
        }

        @Override // e4.a.e
        public void b(View view) {
            this.f12512b.g(new ug.a(t0.f(this.f12511a), this.f12511a.getId()));
        }

        @Override // e4.a.e
        public void c(int i11) {
            this.f12512b.g(new ug.d(t0.f(this.f12511a), this.f12511a.getId(), i11));
        }

        @Override // e4.a.e
        public void d(View view, float f11) {
            this.f12512b.g(new c(t0.f(this.f12511a), this.f12511a.getId(), f11));
        }
    }

    private void setDrawerPositionInternal(com.facebook.react.views.drawer.a aVar, String str) {
        if (str.equals("left")) {
            aVar.Y(8388611);
        } else if (str.equals("right")) {
            aVar.Y(8388613);
        } else {
            throw new JSApplicationIllegalArgumentException("drawerPosition must be 'left' or 'right', received" + str);
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Integer> getCommandsMap() {
        return yf.c.e("openDrawer", 1, "closeDrawer", 2);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b1<com.facebook.react.views.drawer.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(yf.c.g("topDrawerSlide", yf.c.d("registrationName", "onDrawerSlide"), "topDrawerOpen", yf.c.d("registrationName", "onDrawerOpen"), "topDrawerClose", yf.c.d("registrationName", "onDrawerClose"), "topDrawerStateChanged", yf.c.d("registrationName", "onDrawerStateChanged")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map getExportedViewConstants() {
        return yf.c.d("DrawerPosition", yf.c.e("Left", 8388611, "Right", 8388613));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.g
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // sg.b
    @ng.a(customType = "Color", name = "drawerBackgroundColor")
    public void setDrawerBackgroundColor(com.facebook.react.views.drawer.a aVar, Integer num) {
    }

    @Override // sg.b
    @ng.a(name = "keyboardDismissMode")
    public void setKeyboardDismissMode(com.facebook.react.views.drawer.a aVar, String str) {
    }

    @Override // sg.b
    @ng.a(customType = "Color", name = "statusBarBackgroundColor")
    public void setStatusBarBackgroundColor(com.facebook.react.views.drawer.a aVar, Integer num) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.facebook.react.views.drawer.a aVar) {
        d c11 = t0.c(n0Var, aVar.getId());
        if (c11 == null) {
            return;
        }
        aVar.a(new a(aVar, c11));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(com.facebook.react.views.drawer.a aVar, View view, int i11) {
        if (getChildCount(aVar) >= 2) {
            throw new JSApplicationIllegalArgumentException("The Drawer cannot have more than two children");
        }
        if (i11 != 0 && i11 != 1) {
            throw new JSApplicationIllegalArgumentException("The only valid indices for drawer's child are 0 or 1. Got " + i11 + " instead.");
        }
        aVar.addView(view, i11);
        aVar.Z();
    }

    @Override // sg.b
    public void closeDrawer(com.facebook.react.views.drawer.a aVar) {
        aVar.W();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.drawer.a createViewInstance(n0 n0Var) {
        return new com.facebook.react.views.drawer.a(n0Var);
    }

    @Override // sg.b
    public void openDrawer(com.facebook.react.views.drawer.a aVar) {
        aVar.X();
    }

    @Override // sg.b
    @ng.a(name = "drawerLockMode")
    public void setDrawerLockMode(com.facebook.react.views.drawer.a aVar, String str) {
        if (str != null && !"unlocked".equals(str)) {
            if ("locked-closed".equals(str)) {
                aVar.setDrawerLockMode(1);
                return;
            } else if ("locked-open".equals(str)) {
                aVar.setDrawerLockMode(2);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Unknown drawerLockMode " + str);
            }
        }
        aVar.setDrawerLockMode(0);
    }

    @Override // sg.b
    public void setDrawerPosition(com.facebook.react.views.drawer.a aVar, String str) {
        if (str == null) {
            aVar.Y(8388611);
        } else {
            setDrawerPositionInternal(aVar, str);
        }
    }

    @ng.a(defaultFloat = Float.NaN, name = "drawerWidth")
    public void setDrawerWidth(com.facebook.react.views.drawer.a aVar, float f11) {
        aVar.a0(Float.isNaN(f11) ? -1 : Math.round(p.c(f11)));
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setElevation(com.facebook.react.views.drawer.a aVar, float f11) {
        aVar.setDrawerElevation(p.c(f11));
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.drawer.a aVar, int i11, ReadableArray readableArray) {
        if (i11 == 1) {
            aVar.X();
        } else if (i11 != 2) {
        } else {
            aVar.W();
        }
    }

    @ng.a(name = "drawerPosition")
    public void setDrawerPosition(com.facebook.react.views.drawer.a aVar, Dynamic dynamic) {
        if (dynamic.isNull()) {
            aVar.Y(8388611);
        } else if (dynamic.getType() == ReadableType.Number) {
            int asInt = dynamic.asInt();
            if (8388611 != asInt && 8388613 != asInt) {
                throw new JSApplicationIllegalArgumentException("Unknown drawerPosition " + asInt);
            }
            aVar.Y(asInt);
        } else if (dynamic.getType() == ReadableType.String) {
            setDrawerPositionInternal(aVar, dynamic.asString());
        } else {
            throw new JSApplicationIllegalArgumentException("drawerPosition must be a string or int");
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.drawer.a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("closeDrawer")) {
            aVar.W();
        } else if (str.equals("openDrawer")) {
            aVar.X();
        }
    }

    @Override // sg.b
    public void setDrawerWidth(com.facebook.react.views.drawer.a aVar, Float f11) {
        aVar.a0(f11 == null ? -1 : Math.round(p.c(f11.floatValue())));
    }
}