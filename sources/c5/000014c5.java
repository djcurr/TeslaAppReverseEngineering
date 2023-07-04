package com.brentvatne.exoplayer;

import ak.k0;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.n0;
import com.google.android.exoplayer2.upstream.RawResourceDataSource;
import com.stripe.android.StripePaymentController;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import yf.c;

/* loaded from: classes.dex */
public class ReactExoplayerViewManager extends ViewGroupManager<f> {
    private static final String PROP_BUFFER_CONFIG = "bufferConfig";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS = "bufferForPlaybackAfterRebufferMs";
    private static final String PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS = "bufferForPlaybackMs";
    private static final String PROP_BUFFER_CONFIG_MAX_BUFFER_MS = "maxBufferMs";
    private static final String PROP_BUFFER_CONFIG_MIN_BUFFER_MS = "minBufferMs";
    private static final String PROP_CONTROLS = "controls";
    private static final String PROP_DISABLE_FOCUS = "disableFocus";
    private static final String PROP_DRM = "drm";
    private static final String PROP_DRM_HEADERS = "headers";
    private static final String PROP_DRM_LICENSESERVER = "licenseServer";
    private static final String PROP_DRM_TYPE = "type";
    private static final String PROP_FULLSCREEN = "fullscreen";
    private static final String PROP_HIDE_SHUTTER_VIEW = "hideShutterView";
    private static final String PROP_MAXIMUM_BIT_RATE = "maxBitRate";
    private static final String PROP_MIN_LOAD_RETRY_COUNT = "minLoadRetryCount";
    private static final String PROP_MUTED = "muted";
    private static final String PROP_PAUSED = "paused";
    private static final String PROP_PLAY_IN_BACKGROUND = "playInBackground";
    private static final String PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK = "preventsDisplaySleepDuringVideoPlayback";
    private static final String PROP_PROGRESS_UPDATE_INTERVAL = "progressUpdateInterval";
    private static final String PROP_RATE = "rate";
    private static final String PROP_REPEAT = "repeat";
    private static final String PROP_REPORT_BANDWIDTH = "reportBandwidth";
    private static final String PROP_RESIZE_MODE = "resizeMode";
    private static final String PROP_SEEK = "seek";
    private static final String PROP_SELECTED_AUDIO_TRACK = "selectedAudioTrack";
    private static final String PROP_SELECTED_AUDIO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_AUDIO_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_TEXT_TRACK = "selectedTextTrack";
    private static final String PROP_SELECTED_TEXT_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_TEXT_TRACK_VALUE = "value";
    private static final String PROP_SELECTED_VIDEO_TRACK = "selectedVideoTrack";
    private static final String PROP_SELECTED_VIDEO_TRACK_TYPE = "type";
    private static final String PROP_SELECTED_VIDEO_TRACK_VALUE = "value";
    private static final String PROP_SRC = "src";
    private static final String PROP_SRC_HEADERS = "requestHeaders";
    private static final String PROP_SRC_TYPE = "type";
    private static final String PROP_SRC_URI = "uri";
    private static final String PROP_TEXT_TRACKS = "textTracks";
    private static final String PROP_USE_TEXTURE_VIEW = "useTextureView";
    private static final String PROP_VOLUME = "volume";
    private static final String REACT_CLASS = "RCTVideo";
    private e config;

    public ReactExoplayerViewManager(e eVar) {
        this.config = eVar;
    }

    private int convertToIntDef(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        return g.a(Integer.parseInt(str));
    }

    private boolean startsWithValidScheme(String str) {
        return str.startsWith("http://") || str.startsWith("https://") || str.startsWith("content://") || str.startsWith("file://") || str.startsWith("asset://");
    }

    public static Map<String, String> toStringMap(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (keySetIterator.hasNextKey()) {
            HashMap hashMap = new HashMap();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                hashMap.put(nextKey, readableMap.getString(nextKey));
            }
            return hashMap;
        }
        return null;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        String[] strArr;
        c.b a11 = yf.c.a();
        for (String str : h.f10430c) {
            a11.b(str, yf.c.d("registrationName", str));
        }
        return a11.a();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedViewConstants() {
        return yf.c.g("ScaleNone", Integer.toString(0), "ScaleAspectFit", Integer.toString(0), "ScaleToFill", Integer.toString(3), "ScaleAspectFill", Integer.toString(4));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ng.a(name = PROP_MIN_LOAD_RETRY_COUNT)
    public void minLoadRetryCount(f fVar, int i11) {
        fVar.c1(i11);
    }

    @ng.a(name = PROP_BUFFER_CONFIG)
    public void setBufferConfig(f fVar, ReadableMap readableMap) {
        if (readableMap != null) {
            boolean hasKey = readableMap.hasKey(PROP_BUFFER_CONFIG_MIN_BUFFER_MS);
            int i11 = StripePaymentController.PAYMENT_REQUEST_CODE;
            int i12 = hasKey ? readableMap.getInt(PROP_BUFFER_CONFIG_MIN_BUFFER_MS) : 50000;
            if (readableMap.hasKey(PROP_BUFFER_CONFIG_MAX_BUFFER_MS)) {
                i11 = readableMap.getInt(PROP_BUFFER_CONFIG_MAX_BUFFER_MS);
            }
            fVar.T0(i12, i11, readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_MS) : 2500, readableMap.hasKey(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS) ? readableMap.getInt(PROP_BUFFER_CONFIG_BUFFER_FOR_PLAYBACK_AFTER_REBUFFER_MS) : 5000);
        }
    }

    @ng.a(defaultBoolean = false, name = PROP_CONTROLS)
    public void setControls(f fVar, boolean z11) {
        fVar.U0(z11);
    }

    @ng.a(name = PROP_DRM)
    public void setDRM(f fVar, ReadableMap readableMap) {
        if (readableMap == null || !readableMap.hasKey("type")) {
            return;
        }
        String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
        String string2 = readableMap.hasKey(PROP_DRM_LICENSESERVER) ? readableMap.getString(PROP_DRM_LICENSESERVER) : null;
        ReadableMap map = readableMap.hasKey(PROP_DRM_HEADERS) ? readableMap.getMap(PROP_DRM_HEADERS) : null;
        if (string == null || string2 == null || k0.T(string) == null) {
            return;
        }
        fVar.Y0(k0.T(string));
        fVar.X0(string2);
        if (map != null) {
            ArrayList arrayList = new ArrayList();
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                arrayList.add(nextKey);
                arrayList.add(map.getString(nextKey));
            }
            fVar.W0((String[]) arrayList.toArray(new String[0]));
        }
        fVar.u1(false);
    }

    @ng.a(defaultBoolean = false, name = PROP_DISABLE_FOCUS)
    public void setDisableFocus(f fVar, boolean z11) {
        fVar.V0(z11);
    }

    @ng.a(defaultBoolean = false, name = "fullscreen")
    public void setFullscreen(f fVar, boolean z11) {
        fVar.Z0(z11);
    }

    @ng.a(defaultBoolean = false, name = PROP_HIDE_SHUTTER_VIEW)
    public void setHideShutterView(f fVar, boolean z11) {
        fVar.a1(z11);
    }

    @ng.a(name = PROP_MAXIMUM_BIT_RATE)
    public void setMaxBitRate(f fVar, int i11) {
        fVar.b1(i11);
    }

    @ng.a(defaultBoolean = false, name = PROP_MUTED)
    public void setMuted(f fVar, boolean z11) {
        fVar.d1(z11);
    }

    @ng.a(defaultBoolean = false, name = PROP_PAUSED)
    public void setPaused(f fVar, boolean z11) {
        fVar.e1(z11);
    }

    @ng.a(defaultBoolean = false, name = PROP_PLAY_IN_BACKGROUND)
    public void setPlayInBackground(f fVar, boolean z11) {
        fVar.f1(z11);
    }

    @ng.a(defaultBoolean = false, name = PROP_PREVENTS_DISPLAY_SLEEP_DURING_VIDEO_PLAYBACK)
    public void setPreventsDisplaySleepDuringVideoPlayback(f fVar, boolean z11) {
        fVar.h1(z11);
    }

    @ng.a(defaultFloat = 250.0f, name = PROP_PROGRESS_UPDATE_INTERVAL)
    public void setProgressUpdateInterval(f fVar, float f11) {
        fVar.i1(f11);
    }

    @ng.a(name = PROP_TEXT_TRACKS)
    public void setPropTextTracks(f fVar, ReadableArray readableArray) {
        fVar.t1(readableArray);
    }

    @ng.a(name = PROP_RATE)
    public void setRate(f fVar, float f11) {
        fVar.j1(f11);
    }

    @ng.a(defaultBoolean = false, name = PROP_REPEAT)
    public void setRepeat(f fVar, boolean z11) {
        fVar.l1(z11);
    }

    @ng.a(defaultBoolean = false, name = PROP_REPORT_BANDWIDTH)
    public void setReportBandwidth(f fVar, boolean z11) {
        fVar.m1(z11);
    }

    @ng.a(name = PROP_RESIZE_MODE)
    public void setResizeMode(f fVar, String str) {
        fVar.n1(convertToIntDef(str));
    }

    @ng.a(name = PROP_SEEK)
    public void setSeek(f fVar, float f11) {
        fVar.S0(Math.round(f11 * 1000.0f));
    }

    @ng.a(name = PROP_SELECTED_AUDIO_TRACK)
    public void setSelectedAudioTrack(f fVar, ReadableMap readableMap) {
        Dynamic dynamic;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            r0 = string;
        } else {
            dynamic = null;
        }
        fVar.o1(r0, dynamic);
    }

    @ng.a(name = PROP_SELECTED_TEXT_TRACK)
    public void setSelectedTextTrack(f fVar, ReadableMap readableMap) {
        Dynamic dynamic;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            r0 = string;
        } else {
            dynamic = null;
        }
        fVar.p1(r0, dynamic);
    }

    @ng.a(name = PROP_SELECTED_VIDEO_TRACK)
    public void setSelectedVideoTrack(f fVar, ReadableMap readableMap) {
        Dynamic dynamic;
        if (readableMap != null) {
            String string = readableMap.hasKey("type") ? readableMap.getString("type") : null;
            dynamic = readableMap.hasKey("value") ? readableMap.getDynamic("value") : null;
            r0 = string;
        } else {
            dynamic = null;
        }
        fVar.r1(r0, dynamic);
    }

    @ng.a(name = PROP_SRC)
    public void setSrc(f fVar, ReadableMap readableMap) {
        Uri buildRawResourceUri;
        Context applicationContext = fVar.getContext().getApplicationContext();
        String string = readableMap.hasKey(PROP_SRC_URI) ? readableMap.getString(PROP_SRC_URI) : null;
        String string2 = readableMap.hasKey("type") ? readableMap.getString("type") : null;
        Map<String, String> stringMap = readableMap.hasKey(PROP_SRC_HEADERS) ? toStringMap(readableMap.getMap(PROP_SRC_HEADERS)) : null;
        if (TextUtils.isEmpty(string)) {
            fVar.A0();
        } else if (startsWithValidScheme(string)) {
            Uri parse = Uri.parse(string);
            if (parse != null) {
                fVar.s1(parse, string2, stringMap);
            }
        } else {
            int identifier = applicationContext.getResources().getIdentifier(string, "drawable", applicationContext.getPackageName());
            if (identifier == 0) {
                identifier = applicationContext.getResources().getIdentifier(string, "raw", applicationContext.getPackageName());
            }
            if (identifier <= 0 || (buildRawResourceUri = RawResourceDataSource.buildRawResourceUri(identifier)) == null) {
                return;
            }
            fVar.k1(buildRawResourceUri, string2);
        }
    }

    @ng.a(defaultBoolean = true, name = PROP_USE_TEXTURE_VIEW)
    public void setUseTextureView(f fVar, boolean z11) {
        fVar.u1(z11);
    }

    @ng.a(defaultFloat = 1.0f, name = PROP_VOLUME)
    public void setVolume(f fVar, float f11) {
        fVar.v1(f11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public f createViewInstance(n0 n0Var) {
        return new f(n0Var, this.config);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(f fVar) {
        fVar.x0();
    }
}