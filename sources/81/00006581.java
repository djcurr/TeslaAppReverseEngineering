package d80;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class k extends com.facebook.react.uimanager.events.c<k> {

    /* renamed from: b  reason: collision with root package name */
    private static final v3.g<k> f23852b = new v3.g<>(3);

    /* renamed from: a  reason: collision with root package name */
    private WritableMap f23853a;

    private k() {
    }

    private void a(int i11, WritableMap writableMap) {
        super.init(i11);
        this.f23853a = writableMap;
    }

    public static k b(int i11, WritableMap writableMap) {
        k b11 = f23852b.b();
        if (b11 == null) {
            b11 = new k();
        }
        b11.a(i11, writableMap);
        return b11;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f23853a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return CameraViewManager.a.EVENT_ON_RECORDING_START.toString();
    }
}