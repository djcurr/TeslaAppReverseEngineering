package d80;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class b extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: b  reason: collision with root package name */
    private static final v3.g<b> f23836b = new v3.g<>(3);

    /* renamed from: a  reason: collision with root package name */
    private c80.b f23837a;

    private b() {
    }

    private void a(int i11, c80.b bVar) {
        super.init(i11);
        this.f23837a = bVar;
    }

    public static b b(int i11, c80.b bVar) {
        b b11 = f23836b.b();
        if (b11 == null) {
            b11 = new b();
        }
        b11.a(i11, bVar);
        return b11;
    }

    private WritableMap c() {
        WritableMap createMap = Arguments.createMap();
        c80.b bVar = this.f23837a;
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
        return CameraViewManager.a.EVENT_ON_BARCODE_DETECTION_ERROR.toString();
    }
}