package com.reactnativecompressor;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import br.a;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import cr.b;
import fg.a;
import java.io.File;

@a(name = CompressorModule.NAME)
/* loaded from: classes2.dex */
public class CompressorModule extends ReactContextBaseJavaModule {
    public static final String NAME = "Compressor";
    private final ReactApplicationContext reactContext;

    public CompressorModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    private void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void compress_audio(String str, ReadableMap readableMap, Promise promise) {
        try {
            com.reactnativecompressor.Video.a g11 = com.reactnativecompressor.Video.a.g(readableMap);
            String path = Uri.parse(str).getPath();
            String d11 = b.d("mp3", this.reactContext);
            new MediaMetadataRetriever().setDataSource(path);
            float f11 = g11.f20190b;
            Log.d("nomi onStart", d11 + "onProgress: " + f11);
            new zq.a().a(path, d11, ((int) f11) * 1000);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @ReactMethod
    public void generateFilePath(String str, Promise promise) {
        try {
            promise.resolve(b.d(str, this.reactContext));
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void getRealPath(String str, String str2, Promise promise) {
        try {
            String e11 = b.e(str, this.reactContext);
            promise.resolve("file://" + e11);
        } catch (Exception e12) {
            promise.reject(e12);
        }
    }

    @ReactMethod
    public void getVideoMetaData(String str, Promise promise) {
        try {
            String e11 = b.e(str, this.reactContext);
            String path = Uri.parse(e11).getPath();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(path);
            float length = (float) (new File(path).length() / 1024);
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            long parseLong = Long.parseLong(mediaMetadataRetriever.extractMetadata(9));
            String substring = e11.substring(e11.lastIndexOf(".") + 1);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("size", String.valueOf(length));
            createMap.putString(Snapshot.WIDTH, String.valueOf(parseInt2));
            createMap.putString(Snapshot.HEIGHT, String.valueOf(parseInt));
            createMap.putString("duration", String.valueOf(parseLong / 1000));
            createMap.putString("extension", substring);
            promise.resolve(createMap);
        } catch (Exception e12) {
            promise.reject(e12);
        }
    }

    @ReactMethod
    public void image_compress(String str, ReadableMap readableMap, Promise promise) {
        try {
            String e11 = b.e(str, this.reactContext);
            br.a a11 = br.a.a(readableMap);
            if (a11.f7901a == a.EnumC0155a.auto) {
                promise.resolve(ar.a.a(e11, a11, this.reactContext));
            } else {
                promise.resolve(ar.a.i(e11, a11, this.reactContext));
            }
        } catch (Exception e12) {
            promise.reject(e12);
        }
    }
}