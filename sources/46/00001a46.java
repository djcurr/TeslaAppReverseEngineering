package com.facebook.react.views.switchview;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.t0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import sg.g;
import sg.h;

/* loaded from: classes3.dex */
public class ReactSwitchManager extends SimpleViewManager<com.facebook.react.views.switchview.a> implements h<com.facebook.react.views.switchview.a> {
    private static final CompoundButton.OnCheckedChangeListener ON_CHECKED_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "AndroidSwitch";
    private final b1<com.facebook.react.views.switchview.a> mDelegate = new g(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
            ReactContext reactContext = (ReactContext) compoundButton.getContext();
            int id2 = compoundButton.getId();
            t0.c(reactContext, id2).g(new com.facebook.react.views.switchview.b(t0.e(reactContext), id2, z11));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class b extends i implements m {
        private int A;
        private boolean B;

        /* renamed from: z  reason: collision with root package name */
        private int f12601z;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void p1() {
            S0(this);
        }

        @Override // com.facebook.yoga.m
        public long B(p pVar, float f11, n nVar, float f12, n nVar2) {
            if (!this.B) {
                com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(R());
                aVar.setShowText(false);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f12601z = aVar.getMeasuredWidth();
                this.A = aVar.getMeasuredHeight();
                this.B = true;
            }
            return o.b(this.f12601z, this.A);
        }

        private b() {
            p1();
        }
    }

    private static void setValueInternal(com.facebook.react.views.switchview.a aVar, boolean z11) {
        aVar.setOnCheckedChangeListener(null);
        aVar.q(z11);
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b1<com.facebook.react.views.switchview.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, n nVar, float f12, n nVar2, float[] fArr) {
        com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(context);
        aVar.setShowText(false);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return o.a(com.facebook.react.uimanager.p.a(aVar.getMeasuredWidth()), com.facebook.react.uimanager.p.a(aVar.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.facebook.react.views.switchview.a aVar) {
        aVar.setOnCheckedChangeListener(ON_CHECKED_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new b(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.switchview.a createViewInstance(n0 n0Var) {
        com.facebook.react.views.switchview.a aVar = new com.facebook.react.views.switchview.a(n0Var);
        aVar.setShowText(false);
        return aVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(com.facebook.react.views.switchview.a aVar, String str, ReadableArray readableArray) {
        str.hashCode();
        if (str.equals("setNativeValue")) {
            boolean z11 = false;
            if (readableArray != null && readableArray.getBoolean(0)) {
                z11 = true;
            }
            setValueInternal(aVar, z11);
        }
    }

    @Override // sg.h
    @ng.a(defaultBoolean = false, name = "disabled")
    public void setDisabled(com.facebook.react.views.switchview.a aVar, boolean z11) {
        aVar.setEnabled(!z11);
    }

    @Override // sg.h
    @ng.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.facebook.react.views.switchview.a aVar, boolean z11) {
        aVar.setEnabled(z11);
    }

    @Override // sg.h
    public void setNativeValue(com.facebook.react.views.switchview.a aVar, boolean z11) {
        setValueInternal(aVar, z11);
    }

    @Override // sg.h
    @ng.a(name = "on")
    public void setOn(com.facebook.react.views.switchview.a aVar, boolean z11) {
        setValueInternal(aVar, z11);
    }

    @Override // sg.h
    @ng.a(customType = "Color", name = "thumbColor")
    public void setThumbColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.r(num);
    }

    @Override // sg.h
    @ng.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        setThumbColor(aVar, num);
    }

    @Override // sg.h
    @ng.a(customType = "Color", name = "trackColorForFalse")
    public void setTrackColorForFalse(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.u(num);
    }

    @Override // sg.h
    @ng.a(customType = "Color", name = "trackColorForTrue")
    public void setTrackColorForTrue(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.v(num);
    }

    @Override // sg.h
    @ng.a(customType = "Color", name = "trackTintColor")
    public void setTrackTintColor(com.facebook.react.views.switchview.a aVar, Integer num) {
        aVar.s(num);
    }

    @Override // sg.h
    @ng.a(name = "value")
    public void setValue(com.facebook.react.views.switchview.a aVar, boolean z11) {
        setValueInternal(aVar, z11);
    }
}