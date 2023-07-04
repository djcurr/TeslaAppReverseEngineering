package ca;

import com.brentvatne.exoplayer.ReactExoplayerViewManager;
import com.brentvatne.exoplayer.e;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.v;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class c implements v {

    /* renamed from: a  reason: collision with root package name */
    private e f9033a;

    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    @Override // com.facebook.react.v
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        if (this.f9033a == null) {
            this.f9033a = new com.brentvatne.exoplayer.c(reactApplicationContext);
        }
        return Collections.singletonList(new ReactExoplayerViewManager(this.f9033a));
    }
}