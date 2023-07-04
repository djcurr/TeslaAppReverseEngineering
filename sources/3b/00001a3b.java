package com.facebook.react.views.slider;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;
import androidx.core.view.a0;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.b1;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.s;
import com.facebook.react.uimanager.t0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.o;
import com.facebook.yoga.p;
import java.util.HashMap;
import java.util.Map;
import sg.k;
import sg.l;
import w3.c;

/* loaded from: classes3.dex */
public class ReactSliderManager extends SimpleViewManager<com.facebook.react.views.slider.a> implements l<com.facebook.react.views.slider.a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new a();
    public static final String REACT_CLASS = "RCTSlider";
    private static final int STYLE = 16842875;
    private final b1<com.facebook.react.views.slider.a> mDelegate = new k(this);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements SeekBar.OnSeekBarChangeListener {
        a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i11, boolean z11) {
            d c11 = t0.c((ReactContext) seekBar.getContext(), seekBar.getId());
            if (c11 != null) {
                c11.g(new com.facebook.react.views.slider.b(seekBar.getId(), ((com.facebook.react.views.slider.a) seekBar).b(i11), z11));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            d c11 = t0.c((ReactContext) seekBar.getContext(), seekBar.getId());
            if (c11 != null) {
                c11.g(new com.facebook.react.views.slider.c(t0.f(seekBar), seekBar.getId(), ((com.facebook.react.views.slider.a) seekBar).b(seekBar.getProgress())));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public class b extends s {
        protected b(ReactSliderManager reactSliderManager) {
        }

        private boolean e(int i11) {
            return i11 == c.a.f55457k.b() || i11 == c.a.f55458l.b() || i11 == c.a.f55466t.b();
        }

        @Override // com.facebook.react.uimanager.s, androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i11, Bundle bundle) {
            if (e(i11)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStartTrackingTouch((SeekBar) view);
            }
            boolean performAccessibilityAction = super.performAccessibilityAction(view, i11, bundle);
            if (e(i11)) {
                ReactSliderManager.ON_CHANGE_LISTENER.onStopTrackingTouch((SeekBar) view);
            }
            return performAccessibilityAction;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class c extends i implements m {
        private int A;
        private boolean B;

        /* renamed from: z  reason: collision with root package name */
        private int f12584z;

        /* synthetic */ c(a aVar) {
            this();
        }

        private void p1() {
            S0(this);
        }

        @Override // com.facebook.yoga.m
        public long B(p pVar, float f11, n nVar, float f12, n nVar2) {
            if (!this.B) {
                com.facebook.react.views.slider.a aVar = new com.facebook.react.views.slider.a(R(), null, ReactSliderManager.STYLE);
                aVar.a();
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
                aVar.measure(makeMeasureSpec, makeMeasureSpec);
                this.f12584z = aVar.getMeasuredWidth();
                this.A = aVar.getMeasuredHeight();
                this.B = true;
            }
            return o.b(this.f12584z, this.A);
        }

        private c() {
            p1();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b1<com.facebook.react.views.slider.a> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomBubblingEventTypeConstants() {
        Map<String, Object> exportedCustomBubblingEventTypeConstants = super.getExportedCustomBubblingEventTypeConstants();
        if (exportedCustomBubblingEventTypeConstants == null) {
            exportedCustomBubblingEventTypeConstants = new HashMap<>();
        }
        exportedCustomBubblingEventTypeConstants.putAll(yf.c.a().b("topValueChange", yf.c.d("phasedRegistrationNames", yf.c.e("bubbled", "onValueChange", "captured", "onValueChangeCapture"))).a());
        return exportedCustomBubblingEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(yf.c.d("topSlidingComplete", yf.c.d("registrationName", "onSlidingComplete")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return c.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public long measure(Context context, ReadableMap readableMap, ReadableMap readableMap2, ReadableMap readableMap3, float f11, n nVar, float f12, n nVar2, float[] fArr) {
        com.facebook.react.views.slider.a aVar = new com.facebook.react.views.slider.a(context, null, STYLE);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(-2, 0);
        aVar.measure(makeMeasureSpec, makeMeasureSpec);
        return o.a(com.facebook.react.uimanager.p.a(aVar.getMeasuredWidth()), com.facebook.react.uimanager.p.a(aVar.getMeasuredHeight()));
    }

    @Override // sg.l
    @ng.a(name = "disabled")
    public void setDisabled(com.facebook.react.views.slider.a aVar, boolean z11) {
    }

    @Override // sg.l
    @ng.a(customType = "ImageSource", name = "maximumTrackImage")
    public void setMaximumTrackImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // sg.l
    @ng.a(customType = "ImageSource", name = "minimumTrackImage")
    public void setMinimumTrackImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // sg.l
    @ng.a(customType = "ImageSource", name = "thumbImage")
    public void setThumbImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    @Override // sg.l
    @ng.a(customType = "ImageSource", name = "trackImage")
    public void setTrackImage(com.facebook.react.views.slider.a aVar, ReadableMap readableMap) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(n0 n0Var, com.facebook.react.views.slider.a aVar) {
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public i createShadowNodeInstance() {
        return new c(null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public com.facebook.react.views.slider.a createViewInstance(n0 n0Var) {
        com.facebook.react.views.slider.a aVar = new com.facebook.react.views.slider.a(n0Var, null, STYLE);
        a0.w0(aVar, new b(this));
        return aVar;
    }

    @Override // sg.l
    @ng.a(defaultBoolean = true, name = "enabled")
    public void setEnabled(com.facebook.react.views.slider.a aVar, boolean z11) {
        aVar.setEnabled(z11);
    }

    @Override // sg.l
    @ng.a(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908288);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // sg.l
    @ng.a(defaultDouble = 1.0d, name = "maximumValue")
    public void setMaximumValue(com.facebook.react.views.slider.a aVar, double d11) {
        aVar.setMaxValue(d11);
    }

    @Override // sg.l
    @ng.a(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        Drawable findDrawableByLayerId = ((LayerDrawable) aVar.getProgressDrawable().getCurrent()).findDrawableByLayerId(16908301);
        if (num == null) {
            findDrawableByLayerId.clearColorFilter();
        } else {
            findDrawableByLayerId.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // sg.l
    @ng.a(defaultDouble = 0.0d, name = "minimumValue")
    public void setMinimumValue(com.facebook.react.views.slider.a aVar, double d11) {
        aVar.setMinValue(d11);
    }

    @Override // sg.l
    @ng.a(defaultDouble = 0.0d, name = "step")
    public void setStep(com.facebook.react.views.slider.a aVar, double d11) {
        aVar.setStep(d11);
    }

    @Override // sg.l
    public void setTestID(com.facebook.react.views.slider.a aVar, String str) {
        super.setTestId(aVar, str);
    }

    @Override // sg.l
    @ng.a(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(com.facebook.react.views.slider.a aVar, Integer num) {
        if (num == null) {
            aVar.getThumb().clearColorFilter();
        } else {
            aVar.getThumb().setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // sg.l
    @ng.a(defaultDouble = 0.0d, name = "value")
    public void setValue(com.facebook.react.views.slider.a aVar, double d11) {
        aVar.setOnSeekBarChangeListener(null);
        aVar.setValue(d11);
        aVar.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }
}