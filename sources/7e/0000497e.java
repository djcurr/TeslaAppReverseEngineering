package com.reactnativecommunity.slider;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.n0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public class ReactSliderManager extends SimpleViewManager<com.reactnativecommunity.slider.a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "RNCSlider";
    private static final int STYLE = 16842875;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new com.reactnativecommunity.slider.b(seekBar.getId(), ((com.reactnativecommunity.slider.a) seekBar).d(i11), z11));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new e(seekBar.getId(), ((com.reactnativecommunity.slider.a) seekBar).d(seekBar.getProgress())));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().g(new d(seekBar.getId(), ((com.reactnativecommunity.slider.a) seekBar).d(seekBar.getProgress())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class b extends i implements m {
        private int A;
        private boolean B;

        /* renamed from: z  reason: collision with root package name */
        private int f20133z;

        /* synthetic */ b(a aVar) {
            this();
        }

        private void p1() {
            S0(this);
        }

        @Override // com.facebook.yoga.m
        public long B(p pVar, float f11, n nVar, float f12, n nVar2) {
            if (!this.B) {
                com.reactnativecommunity.slider.a aVar = new com.reactnativecommunity.slider.a(R(), null, ReactSliderManager.STYLE);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f20133z = aVar.getMeasuredWidth();
                this.A = aVar.getMeasuredHeight();
                this.B = true;
            }
            return o.b(this.f20133z, this.A);
        }

        private b() {
            p1();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return yf.c.e("topSlidingComplete", yf.c.d("registrationName", "onRNCSliderSlidingComplete"), "topSlidingStart", yf.c.d("registrationName", "onRNCSliderSlidingStart"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return b.class;
    }

    @ng.a(name = "accessibilityIncrements")
    public void setAccessibilityIncrements(com.reactnativecommunity.slider.a aVar, ReadableArray readableArray) {
        ArrayList<Object> arrayList = readableArray.toArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<Object> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add((String) it2.next());
        }
        aVar.setAccessibilityIncrements(arrayList2);
    }

    @ng.a(name = "accessibilityUnits")
    public void setAccessibilityUnits(com.reactnativecommunity.slider.a aVar, String str) {
        aVar.setAccessibilityUnits(str);
    }

    @ng.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.reactnativecommunity.slider.a aVar, boolean z11) {
        aVar.setEnabled(z11);
    }

    @ng.a(defaultBoolean = false, name = "inverted")
    public void setInverted(com.reactnativecommunity.slider.a aVar, boolean z11) {
        if (z11) {
            aVar.setScaleX(-1.0f);
        } else {
            aVar.setScaleX(1.0f);
        }
    }

    @ng.a(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ng.a(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(com.reactnativecommunity.slider.a aVar, double d11) {
        aVar.setMaxValue(d11);
    }

    @ng.a(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @ng.a(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(com.reactnativecommunity.slider.a aVar, double d11) {
        aVar.setMinValue(d11);
    }

    @ng.a(defaultDouble = 0.0d, name = "step")
    public void setStep(com.reactnativecommunity.slider.a aVar, double d11) {
        aVar.setStep(d11);
    }

    @ng.a(name = "thumbImage")
    public void setThumbImage(com.reactnativecommunity.slider.a aVar, ReadableMap readableMap) {
        aVar.setThumbImage(readableMap != null ? readableMap.getString("uri") : null);
    }

    @ng.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.reactnativecommunity.slider.a aVar, Integer num) {
        if (aVar.getThumb() != null) {
            if (num == null) {
                aVar.getThumb().clearColorFilter();
            } else {
                aVar.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
            }
        }
    }

    @ng.a(defaultDouble = 0.0d, name = "value")
    public void setValue(com.reactnativecommunity.slider.a aVar, double d11) {
        aVar.setOnSeekBarChangeListener(null);
        aVar.setValue(d11);
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.reactnativecommunity.slider.a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new b(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.reactnativecommunity.slider.a createViewInstance(n0 n0Var) {
        com.reactnativecommunity.slider.a aVar = new com.reactnativecommunity.slider.a(n0Var, null, STYLE);
        if (Build.VERSION.SDK_INT >= 21) {
            aVar.setSplitTrack(false);
        }
        return aVar;
    }
}