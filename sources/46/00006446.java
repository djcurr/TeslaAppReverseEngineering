package cr;

import android.net.Uri;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.constants.ExponentInstallationId;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import o30.h;
import o30.i;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    static int f23057a = 10;

    /* renamed from: b  reason: collision with root package name */
    static Map<String, h> f23058b = new HashMap();

    /* loaded from: classes2.dex */
    class a implements i.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f23059a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f23060b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f23061c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int[] f23062d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ String f23063e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f23064f;

        a(Promise promise, String str, String str2, int[] iArr, String str3, ReactApplicationContext reactApplicationContext) {
            this.f23059a = promise;
            this.f23060b = str;
            this.f23061c = str2;
            this.f23062d = iArr;
            this.f23063e = str3;
            this.f23064f = reactApplicationContext;
        }

        @Override // o30.i.a
        public void a(float f11) {
            int round = Math.round(f11);
            if (round % b.f23057a != 0 || round <= this.f23062d[0]) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            WritableMap createMap2 = Arguments.createMap();
            createMap.putString(ExponentInstallationId.LEGACY_UUID_KEY, this.f23063e);
            createMap2.putDouble("progress", f11 / 100.0f);
            createMap.putMap(MessageExtension.FIELD_DATA, createMap2);
            b.f(this.f23064f, "videoCompressProgress", createMap);
            this.f23062d[0] = round;
        }

        @Override // o30.i.a
        public void b(boolean z11) {
            Promise promise = this.f23059a;
            promise.resolve("file:/" + this.f23060b);
        }

        @Override // o30.i.a
        public void c(String str) {
            if (str.equals("class java.lang.AssertionError")) {
                this.f23059a.resolve(this.f23061c);
            } else {
                this.f23059a.reject("Compression has canncelled");
            }
        }

        @Override // o30.i.a
        public void onStart() {
        }
    }

    public static void b(String str) {
        try {
            f23058b.get(str).cancel(true);
        } catch (Exception unused) {
        }
    }

    public static void c(String str, String str2, int i11, int i12, float f11, String str3, Promise promise, ReactApplicationContext reactApplicationContext) {
        int[] iArr = {0};
        try {
            f23058b.put(str3, i.a(str, str2, i11, i12, (int) f11, new a(promise, str2, str, iArr, str3, reactApplicationContext)));
        } catch (Exception e11) {
            promise.reject(e11);
        } finally {
            iArr[0] = 0;
        }
    }

    public static String d(String str, ReactApplicationContext reactApplicationContext) {
        File cacheDir = reactApplicationContext.getCacheDir();
        return String.format("%s/%s." + str, cacheDir.getPath(), UUID.randomUUID().toString());
    }

    public static String e(String str, ReactApplicationContext reactApplicationContext) {
        if (str.startsWith("content://")) {
            try {
                return cr.a.b(reactApplicationContext, Uri.parse(str));
            } catch (Exception unused) {
                Log.d("react-native-compessor", " Please see this issue: https://github.com/Shobbak/react-native-compressor/issues/25");
                return str;
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(ReactContext reactContext, String str, WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
    }
}