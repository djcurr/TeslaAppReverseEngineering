package d80;

import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class c extends com.facebook.react.uimanager.events.c<c> {

    /* renamed from: c  reason: collision with root package name */
    private static final v3.g<c> f23838c = new v3.g<>(3);

    /* renamed from: a  reason: collision with root package name */
    private WritableArray f23839a;

    /* renamed from: b  reason: collision with root package name */
    private byte[] f23840b;

    private c() {
    }

    private void a(int i11, WritableArray writableArray, byte[] bArr) {
        super.init(i11);
        this.f23839a = writableArray;
        this.f23840b = bArr;
    }

    public static c b(int i11, WritableArray writableArray, byte[] bArr) {
        c b11 = f23838c.b();
        if (b11 == null) {
            b11 = new c();
        }
        b11.a(i11, writableArray, bArr);
        return b11;
    }

    private WritableMap c() {
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "barcode");
        createMap.putArray("barcodes", this.f23839a);
        createMap.putInt("target", getViewTag());
        byte[] bArr = this.f23840b;
        if (bArr != null) {
            createMap.putString("image", Base64.encodeToString(bArr, 2));
        }
        return createMap;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rCTEventEmitter) {
        rCTEventEmitter.receiveEvent(getViewTag(), getEventName(), c());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        if (this.f23839a.size() > 32767) {
            return Short.MAX_VALUE;
        }
        return (short) this.f23839a.size();
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return CameraViewManager.a.EVENT_ON_BARCODES_DETECTED.toString();
    }
}