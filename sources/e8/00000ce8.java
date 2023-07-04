package bs;

import android.view.View;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.c0;
import com.facebook.react.v;
import com.tesla.TeslaV4.firebase.FirebaseAnalyticsModule;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import wz.w;

/* loaded from: classes6.dex */
public final class e implements v {
    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        List<NativeModule> o11;
        s.g(reactContext, "reactContext");
        o11 = w.o(new FirebaseAnalyticsModule(reactContext));
        return o11;
    }

    @Override // com.facebook.react.v
    public List<ViewManager<View, c0<?>>> createViewManagers(ReactApplicationContext reactContext) {
        s.g(reactContext, "reactContext");
        return new ArrayList();
    }
}