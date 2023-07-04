package com.reactnativecompressor.Video;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Handler;
import android.os.PowerManager;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.constants.ExponentInstallationId;
import java.util.UUID;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: f  reason: collision with root package name */
    private static ReactApplicationContext f20182f;

    /* renamed from: g  reason: collision with root package name */
    private static String f20183g;

    /* renamed from: h  reason: collision with root package name */
    private static Handler f20184h;

    /* renamed from: i  reason: collision with root package name */
    private static Runnable f20185i;

    /* renamed from: j  reason: collision with root package name */
    private static PowerManager f20186j;

    /* renamed from: k  reason: collision with root package name */
    private static PowerManager.WakeLock f20187k;

    /* renamed from: l  reason: collision with root package name */
    private static final LifecycleEventListener f20188l = new C0355a();

    /* renamed from: a  reason: collision with root package name */
    public c f20189a = c.manual;

    /* renamed from: b  reason: collision with root package name */
    public float f20190b = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: c  reason: collision with root package name */
    public String f20191c = "";

    /* renamed from: d  reason: collision with root package name */
    public float f20192d = 640.0f;

    /* renamed from: e  reason: collision with root package name */
    public float f20193e = 16.0f;

    /* renamed from: com.reactnativecompressor.Video.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0355a implements LifecycleEventListener {
        C0355a() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
            if (a.f20187k.isHeld()) {
                a.f20187k.release();
                a.h(a.f20182f, "backgroundTaskExpired", a.f20183g);
            }
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    /* loaded from: classes2.dex */
    public enum c {
        auto,
        manual
    }

    public static void a(String str, a aVar, Promise promise, ReactApplicationContext reactApplicationContext) {
        er.a.a(str, aVar, promise, reactApplicationContext);
    }

    public static void b(String str, a aVar, Promise promise, ReactApplicationContext reactApplicationContext) {
        int i11;
        int i12;
        try {
            String path = Uri.parse(str).getPath();
            String d11 = cr.b.d("mp4", reactApplicationContext);
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(path);
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
            if ((parseInt > parseInt2) && parseInt > 1920) {
                i12 = (int) ((1920 / parseInt) * parseInt2);
                i11 = 1920;
            } else if (parseInt2 > 1920) {
                i11 = (int) ((1920 / parseInt2) * parseInt);
                i12 = 1920;
            } else {
                if (aVar.f20190b == BitmapDescriptorFactory.HUE_RED) {
                    aVar.f20190b = (int) (parseInt3 * 0.8d);
                }
                i11 = parseInt;
                i12 = parseInt2;
            }
            float f11 = aVar.f20190b;
            if (f11 <= BitmapDescriptorFactory.HUE_RED) {
                f11 = (float) (i11 * i12 * 1.5d);
            }
            cr.b.c(path, d11, i12, i11, f11, aVar.f20191c, promise, reactApplicationContext);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    public static a g(ReadableMap readableMap) {
        a aVar = new a();
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            nextKey.hashCode();
            char c11 = 65535;
            switch (nextKey.hashCode()) {
                case 3601339:
                    if (nextKey.equals(ExponentInstallationId.LEGACY_UUID_KEY)) {
                        c11 = 0;
                        break;
                    }
                    break;
                case 291107303:
                    if (nextKey.equals("compressionMethod")) {
                        c11 = 1;
                        break;
                    }
                    break;
                case 844081029:
                    if (nextKey.equals("maxSize")) {
                        c11 = 2;
                        break;
                    }
                    break;
                case 1180564608:
                    if (nextKey.equals("minimumFileSizeForCompress")) {
                        c11 = 3;
                        break;
                    }
                    break;
            }
            switch (c11) {
                case 0:
                    aVar.f20191c = readableMap.getString(nextKey);
                    break;
                case 1:
                    aVar.f20189a = c.valueOf(readableMap.getString(nextKey));
                    break;
                case 2:
                    aVar.f20192d = (float) readableMap.getDouble(nextKey);
                    break;
                case 3:
                    aVar.f20193e = (float) readableMap.getDouble(nextKey);
                    break;
            }
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h(ReactContext reactContext, String str, String str2) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, str2);
    }

    public static String i(ReadableMap readableMap, ReactApplicationContext reactApplicationContext) {
        f20182f = reactApplicationContext;
        f20183g = UUID.randomUUID().toString();
        PowerManager powerManager = (PowerManager) reactApplicationContext.getSystemService("power");
        f20186j = powerManager;
        f20187k = powerManager.newWakeLock(1, "bg_wakelock");
        reactApplicationContext.addLifecycleEventListener(f20188l);
        if (!f20187k.isHeld()) {
            f20187k.acquire();
        }
        f20184h = new Handler();
        b bVar = new b();
        f20185i = bVar;
        f20184h.post(bVar);
        return "";
    }

    public static String j(ReadableMap readableMap, ReactApplicationContext reactApplicationContext) {
        if (f20187k.isHeld()) {
            f20187k.release();
        }
        Handler handler = f20184h;
        if (handler != null) {
            handler.removeCallbacks(f20185i);
        }
        f20183g = "";
        return "";
    }

    public static void k(String str, ReadableMap readableMap, ReactApplicationContext reactApplicationContext, Promise promise) {
        dr.b.d(str, readableMap, reactApplicationContext, promise);
    }
}