package dr;

import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.constants.ExponentInstallationId;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.io.File;
import java.io.IOException;
import lx.f;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes2.dex */
public class b {

    /* loaded from: classes2.dex */
    class a extends f {

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ dr.a f24237f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f24238g;

        a(dr.a aVar, ReactApplicationContext reactApplicationContext) {
            this.f24237f = aVar;
            this.f24238g = reactApplicationContext;
        }

        @Override // lx.f
        public void f(long j11, long j12, float f11, float f12) {
            b.c(j11, j12, this.f24237f, this.f24238g);
            Log.d("asyncTaskFileUploader", "=============start===============");
            Log.d("asyncTaskFileUploader", "numBytes:" + j11);
            Log.d("asyncTaskFileUploader", "totalBytes:" + j12);
            Log.d("asyncTaskFileUploader", "percent:" + f11);
            Log.d("asyncTaskFileUploader", "speed:" + f12);
            Log.d("asyncTaskFileUploader", "============= end ===============");
        }

        @Override // lx.f
        public void g() {
            super.g();
            Log.d("asyncTaskFileUploader", "onUIProgressFinish:");
        }

        @Override // lx.f
        public void h(long j11) {
            super.h(j11);
            Log.d("asyncTaskFileUploader", "onUIProgressStart:" + j11);
        }
    }

    /* renamed from: dr.b$b  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0463b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f24239a;

        C0463b(Promise promise) {
            this.f24239a = promise;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            Log.d("asyncTaskFileUploader", "=============onFailure===============");
            this.f24239a.reject("");
            iOException.printStackTrace();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Log.d("asyncTaskFileUploader", "=============onResponse===============");
            Log.d("asyncTaskFileUploader", "request headers:" + response.request().headers());
            Log.d("asyncTaskFileUploader", "response code:" + response.code());
            Log.d("asyncTaskFileUploader", "response headers:" + response.headers());
            Log.d("asyncTaskFileUploader", "response body:" + response.body().string());
            WritableMap createMap = Arguments.createMap();
            createMap.putInt(PermissionsResponse.STATUS_KEY, response.code());
            this.f24239a.resolve(createMap);
        }
    }

    private static void b(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(long j11, long j12, dr.a aVar, ReactApplicationContext reactApplicationContext) {
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putString(ExponentInstallationId.LEGACY_UUID_KEY, aVar.f24234a);
        createMap2.putDouble("written", j11);
        createMap2.putDouble("total", j12);
        createMap.putMap(MessageExtension.FIELD_DATA, createMap2);
        b(reactApplicationContext, "VideoCompressorProgress", createMap);
    }

    public static void d(String str, ReadableMap readableMap, ReactApplicationContext reactApplicationContext, Promise promise) {
        dr.a a11 = dr.a.a(readableMap);
        File file = new File(str);
        String str2 = a11.f24236c;
        OkHttpClient okHttpClient = new OkHttpClient();
        Request.Builder builder = new Request.Builder();
        builder.url(str2);
        ReadableMapKeySetIterator keySetIterator = a11.f24235b.keySetIterator();
        String str3 = MediaStreamTrack.VIDEO_TRACK_KIND;
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            String string = a11.f24235b.getString(nextKey);
            Log.d("asyncTaskFileUploader", nextKey + "  value: " + string);
            builder.addHeader(nextKey, string);
            if (nextKey.toLowerCase() == "content-type:") {
                str3 = string;
            }
        }
        builder.put(lx.b.a(RequestBody.create(MediaType.parse(str3), file), new a(a11, reactApplicationContext)));
        FirebasePerfOkHttpClient.enqueue(okHttpClient.newCall(builder.build()), new C0463b(promise));
    }
}