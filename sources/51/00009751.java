package org.reactnative.facedetector;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class FaceDetectorModule extends ReactContextBaseJavaModule {
    private static final String TAG = "RNFaceDetector";
    private static ReactApplicationContext mScopedContext;

    /* loaded from: classes5.dex */
    class a extends HashMap<String, Object> {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: org.reactnative.facedetector.FaceDetectorModule$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public class C0867a extends HashMap<String, Object> {
            C0867a(a aVar) {
                put("fast", Integer.valueOf(g80.b.f27848m));
                put("accurate", Integer.valueOf(g80.b.f27847l));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class b extends HashMap<String, Object> {
            b(a aVar) {
                put("all", Integer.valueOf(g80.b.f27843h));
                put(PermissionsResponse.SCOPE_NONE, Integer.valueOf(g80.b.f27844i));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public class c extends HashMap<String, Object> {
            c(a aVar) {
                put("all", Integer.valueOf(g80.b.f27845j));
                put(PermissionsResponse.SCOPE_NONE, Integer.valueOf(g80.b.f27846k));
            }
        }

        a(FaceDetectorModule faceDetectorModule) {
            put("Mode", c());
            put("Landmarks", b());
            put("Classifications", a());
        }

        private Map<String, Object> a() {
            return Collections.unmodifiableMap(new b(this));
        }

        private Map<String, Object> b() {
            return Collections.unmodifiableMap(new c(this));
        }

        private Map<String, Object> c() {
            return Collections.unmodifiableMap(new C0867a(this));
        }
    }

    public FaceDetectorModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        mScopedContext = reactApplicationContext;
    }

    @ReactMethod
    public void detectFaces(ReadableMap readableMap, Promise promise) {
        new h80.a(mScopedContext, readableMap, promise).execute(new Void[0]);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return Collections.unmodifiableMap(new a(this));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return TAG;
    }
}