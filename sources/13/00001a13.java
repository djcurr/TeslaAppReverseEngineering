package com.facebook.react.views.image;

import android.graphics.PorterDuff;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.n0;
import com.facebook.react.uimanager.p;
import java.util.HashMap;
import java.util.Map;

@fg.a(name = ReactImageManager.REACT_CLASS)
/* loaded from: classes3.dex */
public class ReactImageManager extends SimpleViewManager<h> {
    public static final String REACT_CLASS = "RCTImageView";
    private final Object mCallerContext;
    private final f mCallerContextFactory;
    private ge.b mDraweeControllerBuilder;
    private a mGlobalImageLoadListener;

    @Deprecated
    public ReactImageManager(ge.b bVar, Object obj) {
        this(bVar, (a) null, obj);
    }

    @Deprecated
    public Object getCallerContext() {
        return this.mCallerContext;
    }

    public ge.b getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = be.c.g();
        }
        return this.mDraweeControllerBuilder;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        Map<String, Object> exportedCustomDirectEventTypeConstants = super.getExportedCustomDirectEventTypeConstants();
        if (exportedCustomDirectEventTypeConstants == null) {
            exportedCustomDirectEventTypeConstants = new HashMap<>();
        }
        exportedCustomDirectEventTypeConstants.putAll(yf.c.h(b.g(4), yf.c.d("registrationName", "onLoadStart"), b.g(5), yf.c.d("registrationName", "onProgress"), b.g(2), yf.c.d("registrationName", "onLoad"), b.g(1), yf.c.d("registrationName", "onError"), b.g(3), yf.c.d("registrationName", "onLoadEnd")));
        return exportedCustomDirectEventTypeConstants;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(name = "accessible")
    public void setAccessible(h hVar, boolean z11) {
        hVar.setFocusable(z11);
    }

    @ng.a(name = "blurRadius")
    public void setBlurRadius(h hVar, float f11) {
        hVar.setBlurRadius(f11);
    }

    @ng.a(customType = "Color", name = "borderColor")
    public void setBorderColor(h hVar, Integer num) {
        if (num == null) {
            hVar.setBorderColor(0);
        } else {
            hVar.setBorderColor(num.intValue());
        }
    }

    @ng.b(defaultFloat = Float.NaN, names = {"borderRadius", "borderTopLeftRadius", "borderTopRightRadius", "borderBottomRightRadius", "borderBottomLeftRadius"})
    public void setBorderRadius(h hVar, int i11, float f11) {
        if (!com.facebook.yoga.g.a(f11)) {
            f11 = p.c(f11);
        }
        if (i11 == 0) {
            hVar.setBorderRadius(f11);
        } else {
            hVar.t(f11, i11 - 1);
        }
    }

    @ng.a(name = "borderWidth")
    public void setBorderWidth(h hVar, float f11) {
        hVar.setBorderWidth(f11);
    }

    @ng.a(name = "defaultSrc")
    public void setDefaultSource(h hVar, String str) {
        hVar.setDefaultSource(str);
    }

    @ng.a(name = "fadeDuration")
    public void setFadeDuration(h hVar, int i11) {
        hVar.setFadeDuration(i11);
    }

    @ng.a(name = "headers")
    public void setHeaders(h hVar, ReadableMap readableMap) {
        hVar.setHeaders(readableMap);
    }

    @ng.a(name = "internal_analyticTag")
    public void setInternal_AnalyticsTag(h hVar, String str) {
        f fVar = this.mCallerContextFactory;
        if (fVar != null) {
            hVar.x(fVar.a(((n0) hVar.getContext()).a(), str));
        }
    }

    @ng.a(name = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(h hVar, boolean z11) {
        hVar.setShouldNotifyLoadEvents(z11);
    }

    @ng.a(name = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(h hVar, String str) {
        hVar.setLoadingIndicatorSource(str);
    }

    @ng.a(customType = "Color", name = "overlayColor")
    public void setOverlayColor(h hVar, Integer num) {
        if (num == null) {
            hVar.setOverlayColor(0);
        } else {
            hVar.setOverlayColor(num.intValue());
        }
    }

    @ng.a(name = "progressiveRenderingEnabled")
    public void setProgressiveRenderingEnabled(h hVar, boolean z11) {
        hVar.setProgressiveRenderingEnabled(z11);
    }

    @ng.a(name = "resizeMethod")
    public void setResizeMethod(h hVar, String str) {
        if (str != null && !"auto".equals(str)) {
            if ("resize".equals(str)) {
                hVar.setResizeMethod(c.RESIZE);
                return;
            } else if ("scale".equals(str)) {
                hVar.setResizeMethod(c.SCALE);
                return;
            } else {
                throw new JSApplicationIllegalArgumentException("Invalid resize method: '" + str + "'");
            }
        }
        hVar.setResizeMethod(c.AUTO);
    }

    @ng.a(name = "resizeMode")
    public void setResizeMode(h hVar, String str) {
        hVar.setScaleType(d.c(str));
        hVar.setTileMode(d.d(str));
    }

    @ng.a(name = "src")
    public void setSource(h hVar, ReadableArray readableArray) {
        hVar.setSource(readableArray);
    }

    @ng.a(customType = "Color", name = "tintColor")
    public void setTintColor(h hVar, Integer num) {
        if (num == null) {
            hVar.clearColorFilter();
        } else {
            hVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    @Deprecated
    public ReactImageManager(ge.b bVar, a aVar, Object obj) {
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContext = obj;
        this.mCallerContextFactory = null;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public h createViewInstance(n0 n0Var) {
        Object callerContext;
        f fVar = this.mCallerContextFactory;
        if (fVar != null) {
            callerContext = fVar.a(n0Var.a(), null);
        } else {
            callerContext = getCallerContext();
        }
        return new h(n0Var, getDraweeControllerBuilder(), this.mGlobalImageLoadListener, callerContext);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(h hVar) {
        super.onAfterUpdateTransaction((ReactImageManager) hVar);
        hVar.s();
    }

    public ReactImageManager(ge.b bVar, f fVar) {
        this(bVar, (a) null, fVar);
    }

    public ReactImageManager(ge.b bVar, a aVar, f fVar) {
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContextFactory = fVar;
        this.mCallerContext = null;
    }

    public ReactImageManager() {
        this.mDraweeControllerBuilder = null;
        this.mCallerContext = null;
        this.mCallerContextFactory = null;
    }
}