package d80;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class j extends com.facebook.react.uimanager.events.c<j> {

    /* renamed from: a  reason: collision with root package name */
    private static final v3.g<j> f23851a = new v3.g<>(3);

    private j() {
    }

    public static j a(int i11) {
        j b11 = f23851a.b();
        if (b11 == null) {
            b11 = new j();
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
        return CameraViewManager.a.EVENT_ON_RECORDING_END.toString();
    }
}