package d80;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class g extends com.facebook.react.uimanager.events.c<g> {

    /* renamed from: b  reason: collision with root package name */
    private static final v3.g<g> f23846b = new v3.g<>(3);

    /* renamed from: a  reason: collision with root package name */
    private WritableArray f23847a;

    private g() {
    }

    private void a(int i11, WritableArray writableArray) {
        super.init(i11);
        this.f23847a = writableArray;
    }

    public static g b(int i11, WritableArray writableArray) {
        g b11 = f23846b.b();
        if (b11 == null) {
            b11 = new g();
        }
        b11.a(i11, writableArray);
        return b11;
    }

    private WritableMap c() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "face");
        createMap.putArray("faces", this.f23847a);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), c());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        if (this.f23847a.size() > 32767) {
            return Short.MAX_VALUE;
        }
        return (short) this.f23847a.size();
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return CameraViewManager.a.EVENT_ON_FACES_DETECTED.toString();
    }
}