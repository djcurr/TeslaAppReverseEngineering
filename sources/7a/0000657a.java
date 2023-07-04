package d80;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class d extends com.facebook.react.uimanager.events.c<d> {

    /* renamed from: b  reason: collision with root package name */
    private static final v3.g<d> f23841b = new v3.g<>(3);

    /* renamed from: a  reason: collision with root package name */
    private String f23842a;

    private d() {
    }

    private void a(int i11, String str) {
        super.init(i11);
        this.f23842a = str;
    }

    public static d b(int i11, String str) {
        d b11 = f23841b.b();
        if (b11 == null) {
            b11 = new d();
        }
        b11.a(i11, str);
        return b11;
    }

    private WritableMap c() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("message", this.f23842a);
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), c());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return CameraViewManager.a.EVENT_ON_MOUNT_ERROR.toString();
    }
}