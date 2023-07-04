package com.facebook.react.views.modal;

import android.content.DialogInterface;
import android.graphics.Point;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.e0;
import com.facebook.react.uimanager.m0;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import com.facebook.react.views.modal.c;
import java.util.HashMap;
import java.util.Map;
import sg.i;
import sg.j;

@fg.a(name = ReactModalHostManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class ReactModalHostManager extends ViewGroupManager<c> implements j<c> {
    public static final String REACT_CLASS = "RCTModalHostView";
    private final b1<c> mDelegate = new i(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements c.InterfaceC0236c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f12544a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f12545b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f12546c;

        a(ReactModalHostManager reactModalHostManager, com.facebook.react.uimanager.events.d dVar, n0 n0Var, c cVar) {
            this.f12544a = dVar;
            this.f12545b = n0Var;
            this.f12546c = cVar;
        }

        @Override // com.facebook.react.views.modal.c.InterfaceC0236c
        public void a(DialogInterface dialogInterface) {
            this.f12544a.g(new d(t0.e(this.f12545b), this.f12546c.getId()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements DialogInterface.OnShowListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f12547a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n0 f12548b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ c f12549c;

        b(ReactModalHostManager reactModalHostManager, com.facebook.react.uimanager.events.d dVar, n0 n0Var, c cVar) {
            this.f12547a = dVar;
            this.f12548b = n0Var;
            this.f12549c = cVar;
        }

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            this.f12547a.g(new e(t0.e(this.f12548b), this.f12549c.getId()));
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b1<c> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(yf.c.a().b("topRequestClose", yf.c.d("registrationName", "onRequestClose")).b("topShow", yf.c.d("registrationName", "onShow")).b("topDismiss", yf.c.d("registrationName", "onDismiss")).b("topOrientationChange", yf.c.d("registrationName", "onOrientationChange")).a());
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.i> getShadowNodeClass() {
        return com.facebook.react.views.modal.b.class;
    }

    @Override // sg.j
    @ng.a(name = "animated")
    public void setAnimated(c cVar, boolean z11) {
    }

    @Override // sg.j
    @ng.a(name = "identifier")
    public void setIdentifier(c cVar, int i11) {
    }

    @Override // sg.j
    @ng.a(name = "presentationStyle")
    public void setPresentationStyle(c cVar, String str) {
    }

    @Override // sg.j
    @ng.a(name = "supportedOrientations")
    public void setSupportedOrientations(c cVar, ReadableArray readableArray) {
    }

    @Override // sg.j
    @ng.a(name = "visible")
    public void setVisible(c cVar, boolean z11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, c cVar) {
        com.facebook.react.uimanager.events.d c11 = t0.c(n0Var, cVar.getId());
        if (c11 != null) {
            cVar.setOnRequestCloseListener(new a(this, c11, n0Var, cVar));
            cVar.setOnShowListener(new b(this, c11, n0Var, cVar));
            cVar.setEventDispatcher(c11);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public com.facebook.react.uimanager.i createShadowNodeInstance() {
        return new com.facebook.react.views.modal.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(n0 n0Var) {
        return new c(n0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(c cVar) {
        super.onAfterUpdateTransaction((ReactModalHostManager) cVar);
        cVar.d();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(c cVar) {
        super.onDropViewInstance((ReactModalHostManager) cVar);
        cVar.c();
    }

    @Override // sg.j
    @ng.a(name = "animationType")
    public void setAnimationType(c cVar, String str) {
        if (str != null) {
            cVar.setAnimationType(str);
        }
    }

    @Override // sg.j
    @ng.a(name = "hardwareAccelerated")
    public void setHardwareAccelerated(c cVar, boolean z11) {
        cVar.setHardwareAccelerated(z11);
    }

    @Override // sg.j
    @ng.a(name = "statusBarTranslucent")
    public void setStatusBarTranslucent(c cVar, boolean z11) {
        cVar.setStatusBarTranslucent(z11);
    }

    @Override // sg.j
    @ng.a(name = "transparent")
    public void setTransparent(c cVar, boolean z11) {
        cVar.setTransparent(z11);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Object updateState(c cVar, e0 e0Var, m0 m0Var) {
        cVar.getFabricViewStateManager().e(m0Var);
        Point a11 = com.facebook.react.views.modal.a.a(cVar.getContext());
        cVar.f(a11.x, a11.y);
        return null;
    }
}