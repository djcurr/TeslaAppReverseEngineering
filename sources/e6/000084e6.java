package lw;

import android.os.Bundle;
import android.os.Parcelable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import java.util.ArrayList;

/* loaded from: classes6.dex */
public class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes6.dex */
    public class a implements LifecycleEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ReactContext f37756a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f37757b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ WritableMap f37758c;

        a(e eVar, ReactContext reactContext, String str, WritableMap writableMap) {
            this.f37756a = reactContext;
            this.f37757b = str;
            this.f37758c = writableMap;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f37756a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(this.f37757b, this.f37758c);
            this.f37756a.removeLifecycleEventListener(this);
        }
    }

    public static Bundle a(Bundle bundle) {
        ArrayList<String> arrayList = new ArrayList();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj.getClass().isArray() && !(obj instanceof Parcelable[])) {
                arrayList.add(str);
            }
            if (obj instanceof Bundle) {
                bundle.putBundle(str, a((Bundle) obj));
            }
        }
        for (String str2 : arrayList) {
            bundle.remove(str2);
        }
        return bundle;
    }

    public boolean b(String str, Bundle bundle, ReactContext reactContext) {
        if (reactContext != null) {
            c(str, Arguments.fromBundle(a(bundle)), reactContext);
            return true;
        }
        return false;
    }

    public boolean c(String str, WritableMap writableMap, ReactContext reactContext) {
        if (reactContext != null) {
            if (reactContext.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
                return true;
            }
            reactContext.addLifecycleEventListener(new a(this, reactContext, str, writableMap));
            return true;
        }
        return false;
    }
}