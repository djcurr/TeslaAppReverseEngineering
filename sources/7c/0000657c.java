package d80;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class f extends com.facebook.react.uimanager.events.c<f> {

    /* renamed from: b  reason: collision with root package name */
    private static final v3.g<f> f23844b = new v3.g<>(3);

    /* renamed from: a  reason: collision with root package name */
    private g80.b f23845a;

    private f() {
    }

    private void a(int i11, g80.b bVar) {
        super.init(i11);
        this.f23845a = bVar;
    }

    public static f b(int i11, g80.b bVar) {
        f b11 = f23844b.b();
        if (b11 == null) {
            b11 = new f();
        }
        b11.a(i11, bVar);
        return b11;
    }

    private WritableMap c() {
        WritableMap createMap = Arguments.createMap();
        g80.b bVar = this.f23845a;
        createMap.putBoolean("isOperational", bVar != null && bVar.c());
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
        return CameraViewManager.a.EVENT_ON_FACE_DETECTION_ERROR.toString();
    }
}