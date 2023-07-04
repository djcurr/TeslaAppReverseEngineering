package d80;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class l extends com.facebook.react.uimanager.events.c<l> {

    /* renamed from: b  reason: collision with root package name */
    private static final v3.g<l> f23854b = new v3.g<>(3);

    /* renamed from: a  reason: collision with root package name */
    private WritableArray f23855a;

    private l() {
    }

    private WritableMap a() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "textBlock");
        createMap.putArray("textBlocks", this.f23855a);
        createMap.putInt("target", getViewTag());
        return createMap;
    }

    private void b(int i11, WritableArray writableArray) {
        super.init(i11);
        this.f23855a = writableArray;
    }

    public static l c(int i11, WritableArray writableArray) {
        l b11 = f23854b.b();
        if (b11 == null) {
            b11 = new l();
        }
        b11.b(i11, writableArray);
        return b11;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), a());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return CameraViewManager.a.EVENT_ON_TEXT_RECOGNIZED.toString();
    }
}