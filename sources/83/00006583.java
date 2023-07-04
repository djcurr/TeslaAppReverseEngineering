package d80;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class m extends com.facebook.react.uimanager.events.c<m> {

    /* renamed from: d  reason: collision with root package name */
    private static final v3.g<m> f23856d = new v3.g<>(3);

    /* renamed from: a  reason: collision with root package name */
    private int f23857a;

    /* renamed from: b  reason: collision with root package name */
    private int f23858b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f23859c;

    private m() {
    }

    private void a(int i11, boolean z11, int i12, int i13) {
        super.init(i11);
        this.f23857a = i12;
        this.f23858b = i13;
        this.f23859c = z11;
    }

    public static m b(int i11, boolean z11, int i12, int i13) {
        m b11 = f23856d.b();
        if (b11 == null) {
            b11 = new m();
        }
        b11.a(i11, z11, i12, i13);
        return b11;
    }

    private WritableMap c() {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putInt("x", this.f23857a);
        createMap2.putInt("y", this.f23858b);
        createMap.putBoolean("isDoubleTap", this.f23859c);
        createMap.putMap("touchOrigin", createMap2);
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
        return CameraViewManager.a.EVENT_ON_TOUCH.toString();
    }
}