package d80;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class i extends com.facebook.react.uimanager.events.c<i> {

    /* renamed from: a  reason: collision with root package name */
    private static final v3.g<i> f23850a = new v3.g<>(3);

    private i() {
    }

    public static i a(int i11) {
        i b11 = f23850a.b();
        if (b11 == null) {
            b11 = new i();
        }
        b11.init(i11);
        return b11;
    }

    private WritableMap b() {
        return Arguments.createMap();
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), b());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return CameraViewManager.a.EVENT_ON_PICTURE_TAKEN.toString();
    }
}