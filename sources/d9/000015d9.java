package com.dylanvann.fastimage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PorterDuff;
import android.os.Build;
import com.bumptech.glide.k;
import com.bumptech.glide.request.d;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.n0;
import com.stripe.android.model.Stripe3ds2AuthParams;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import na.g;
import yf.c;

/* loaded from: classes.dex */
class FastImageViewManager extends SimpleViewManager<b> implements FastImageProgressListener {
    private static final String REACT_CLASS = "FastImageView";
    private static final String REACT_ON_LOAD_START_EVENT = "onFastImageLoadStart";
    private static final String REACT_ON_PROGRESS_EVENT = "onFastImageProgress";
    private static final Map<String, List<b>> VIEWS_FOR_URLS = new WeakHashMap();
    private k requestManager = null;

    private void clearView(b bVar) {
        if (this.requestManager == null || bVar == null || bVar.getTag() == null || !(bVar.getTag() instanceof d)) {
            return;
        }
        this.requestManager.clear(bVar);
    }

    private static Activity getActivityFromContext(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof n0) {
            Context baseContext = ((n0) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
            if (baseContext instanceof ContextWrapper) {
                Context baseContext2 = ((ContextWrapper) baseContext).getBaseContext();
                if (baseContext2 instanceof Activity) {
                    return (Activity) baseContext2;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    private static boolean isActivityDestroyed(Activity activity) {
        return Build.VERSION.SDK_INT >= 17 ? activity.isDestroyed() || activity.isFinishing() : activity.isDestroyed() || activity.isFinishing() || activity.isChangingConfigurations();
    }

    private boolean isNullOrEmpty(String str) {
        return str == null || str.trim().isEmpty();
    }

    private static boolean isValidContextForGlide(Context context) {
        Activity activityFromContext = getActivityFromContext(context);
        if (activityFromContext == null) {
            return false;
        }
        return !isActivityDestroyed(activityFromContext);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return c.a().b(REACT_ON_LOAD_START_EVENT, c.d("registrationName", REACT_ON_LOAD_START_EVENT)).b(REACT_ON_PROGRESS_EVENT, c.d("registrationName", REACT_ON_PROGRESS_EVENT)).b("onFastImageLoad", c.d("registrationName", "onFastImageLoad")).b("onFastImageError", c.d("registrationName", "onFastImageError")).b("onFastImageLoadEnd", c.d("registrationName", "onFastImageLoadEnd")).a();
    }

    @Override // com.dylanvann.fastimage.FastImageProgressListener
    public float getGranularityPercentage() {
        return 0.5f;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.dylanvann.fastimage.FastImageProgressListener
    public void onProgress(String str, long j11, long j12) {
        List<b> list = VIEWS_FOR_URLS.get(str);
        if (list != null) {
            for (b bVar : list) {
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putInt("loaded", (int) j11);
                writableNativeMap.putInt("total", (int) j12);
                ((RCTEventEmitter) ((n0) bVar.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(bVar.getId(), REACT_ON_PROGRESS_EVENT, writableNativeMap);
            }
        }
    }

    @ng.a(name = "resizeMode")
    public void setResizeMode(b bVar, String str) {
        bVar.setScaleType(a.f(str));
    }

    @ng.a(name = Stripe3ds2AuthParams.FIELD_SOURCE)
    public void setSrc(b bVar, ReadableMap readableMap) {
        if (readableMap != null && readableMap.hasKey("uri") && !isNullOrEmpty(readableMap.getString("uri"))) {
            FastImageSource c11 = a.c(bVar.getContext(), readableMap);
            if (c11.getUri().toString().length() == 0) {
                int id2 = bVar.getId();
                WritableNativeMap writableNativeMap = new WritableNativeMap();
                writableNativeMap.putString("message", "Invalid source prop:" + readableMap);
                ((RCTEventEmitter) ((n0) bVar.getContext()).getJSModule(RCTEventEmitter.class)).receiveEvent(id2, "onFastImageError", writableNativeMap);
                k kVar = this.requestManager;
                if (kVar != null) {
                    kVar.clear(bVar);
                }
                g gVar = bVar.f11051c;
                if (gVar != null) {
                    FastImageOkHttpProgressGlideModule.forget(gVar.h());
                }
                bVar.setImageDrawable(null);
                return;
            }
            g glideUrl = c11.getGlideUrl();
            bVar.f11051c = glideUrl;
            clearView(bVar);
            String h11 = glideUrl.h();
            FastImageOkHttpProgressGlideModule.expect(h11, this);
            Map<String, List<b>> map = VIEWS_FOR_URLS;
            List<b> list = map.get(h11);
            if (list != null && !list.contains(bVar)) {
                list.add(bVar);
            } else if (list == null) {
                map.put(h11, new ArrayList(Collections.singletonList(bVar)));
            }
            n0 n0Var = (n0) bVar.getContext();
            ((RCTEventEmitter) n0Var.getJSModule(RCTEventEmitter.class)).receiveEvent(bVar.getId(), REACT_ON_LOAD_START_EVENT, new WritableNativeMap());
            k kVar2 = this.requestManager;
            if (kVar2 != null) {
                kVar2.mo108load(c11.getSourceForLoad()).apply((com.bumptech.glide.request.a<?>) a.d(n0Var, c11, readableMap)).listener(new FastImageRequestListener(h11)).into(bVar);
                return;
            }
            return;
        }
        clearView(bVar);
        g gVar2 = bVar.f11051c;
        if (gVar2 != null) {
            FastImageOkHttpProgressGlideModule.forget(gVar2.h());
        }
        bVar.setImageDrawable(null);
    }

    @ng.a(customType = "Color", name = "tintColor")
    public void setTintColor(b bVar, Integer num) {
        if (num == null) {
            bVar.clearColorFilter();
        } else {
            bVar.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(n0 n0Var) {
        if (isValidContextForGlide(n0Var)) {
            this.requestManager = com.bumptech.glide.c.C(n0Var);
        }
        return new b(n0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(b bVar) {
        clearView(bVar);
        g gVar = bVar.f11051c;
        if (gVar != null) {
            String gVar2 = gVar.toString();
            FastImageOkHttpProgressGlideModule.forget(gVar2);
            Map<String, List<b>> map = VIEWS_FOR_URLS;
            List<b> list = map.get(gVar2);
            if (list != null) {
                list.remove(bVar);
                if (list.size() == 0) {
                    map.remove(gVar2);
                }
            }
        }
        super.onDropViewInstance((FastImageViewManager) bVar);
    }
}