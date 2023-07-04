package d80;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class h extends com.facebook.react.uimanager.events.c<h> {

    /* renamed from: b  reason: collision with root package name */
    private static final v3.g<h> f23848b = new v3.g<>(5);

    /* renamed from: a  reason: collision with root package name */
    private WritableMap f23849a;

    private h() {
    }

    private void a(int i11, WritableMap writableMap) {
        super.init(i11);
        this.f23849a = writableMap;
    }

    public static h b(int i11, WritableMap writableMap) {
        h b11 = f23848b.b();
        if (b11 == null) {
            b11 = new h();
        }
        b11.a(i11, writableMap);
        return b11;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f23849a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) (this.f23849a.getMap(MessageExtension.FIELD_DATA).getString("uri").hashCode() % 32767);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return CameraViewManager.a.EVENT_ON_PICTURE_SAVED.toString();
    }
}