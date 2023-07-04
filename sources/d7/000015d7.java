package com.dylanvann.fastimage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.g;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.n0;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import ya.f;
import ya.k;

/* loaded from: classes.dex */
public class FastImageRequestListener implements g<Drawable> {
    static final String REACT_ON_ERROR_EVENT = "onFastImageError";
    static final String REACT_ON_LOAD_END_EVENT = "onFastImageLoadEnd";
    static final String REACT_ON_LOAD_EVENT = "onFastImageLoad";
    private String key;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FastImageRequestListener(String str) {
        this.key = str;
    }

    private static WritableMap mapFromResource(Drawable drawable) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt(Snapshot.WIDTH, drawable.getIntrinsicWidth());
        writableNativeMap.putInt(Snapshot.HEIGHT, drawable.getIntrinsicHeight());
        return writableNativeMap;
    }

    @Override // com.bumptech.glide.request.g
    public boolean onLoadFailed(GlideException glideException, Object obj, k<Drawable> kVar, boolean z11) {
        FastImageOkHttpProgressGlideModule.forget(this.key);
        if (kVar instanceof f) {
            b bVar = (b) ((f) kVar).b();
            RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((n0) bVar.getContext()).getJSModule(RCTEventEmitter.class);
            int id2 = bVar.getId();
            rCTEventEmitter.receiveEvent(id2, REACT_ON_ERROR_EVENT, new WritableNativeMap());
            rCTEventEmitter.receiveEvent(id2, REACT_ON_LOAD_END_EVENT, new WritableNativeMap());
            return false;
        }
        return false;
    }

    @Override // com.bumptech.glide.request.g
    public boolean onResourceReady(Drawable drawable, Object obj, k<Drawable> kVar, com.bumptech.glide.load.a aVar, boolean z11) {
        if (kVar instanceof f) {
            b bVar = (b) ((f) kVar).b();
            RCTEventEmitter rCTEventEmitter = (RCTEventEmitter) ((n0) bVar.getContext()).getJSModule(RCTEventEmitter.class);
            int id2 = bVar.getId();
            rCTEventEmitter.receiveEvent(id2, REACT_ON_LOAD_EVENT, mapFromResource(drawable));
            rCTEventEmitter.receiveEvent(id2, REACT_ON_LOAD_END_EVENT, new WritableNativeMap());
            return false;
        }
        return false;
    }
}