package org.reactnative.camera;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.v;
import com.lwansbrough.RCTCamera.RCTCameraModule;
import com.lwansbrough.RCTCamera.RCTCameraViewManager;
import java.util.Arrays;
import java.util.List;
import org.reactnative.facedetector.FaceDetectorModule;

/* loaded from: classes5.dex */
public class c implements v {
    @Override // com.facebook.react.v
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RCTCameraModule(reactApplicationContext), new CameraModule(reactApplicationContext), new FaceDetectorModule(reactApplicationContext));
    }

    @Override // com.facebook.react.v
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Arrays.asList(new RCTCameraViewManager(), new CameraViewManager());
    }
}