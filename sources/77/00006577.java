package d80;

import android.util.Base64;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Formatter;
import org.reactnative.camera.CameraViewManager;

/* loaded from: classes5.dex */
public class a extends com.facebook.react.uimanager.events.c<a> {

    /* renamed from: e  reason: collision with root package name */
    private static final v3.g<a> f23831e = new v3.g<>(3);

    /* renamed from: a  reason: collision with root package name */
    private com.google.zxing.j f23832a;

    /* renamed from: b  reason: collision with root package name */
    private int f23833b;

    /* renamed from: c  reason: collision with root package name */
    private int f23834c;

    /* renamed from: d  reason: collision with root package name */
    private byte[] f23835d;

    private a() {
    }

    private void a(int i11, com.google.zxing.j jVar, int i12, int i13, byte[] bArr) {
        super.init(i11);
        this.f23832a = jVar;
        this.f23833b = i12;
        this.f23834c = i13;
        this.f23835d = bArr;
    }

    public static a b(int i11, com.google.zxing.j jVar, int i12, int i13, byte[] bArr) {
        a b11 = f23831e.b();
        if (b11 == null) {
            b11 = new a();
        }
        b11.a(i11, jVar, i12, i13, bArr);
        return b11;
    }

    private WritableMap c() {
        com.google.zxing.l[] e11;
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap.putInt("target", getViewTag());
        createMap.putString(MessageExtension.FIELD_DATA, this.f23832a.f());
        byte[] c11 = this.f23832a.c();
        if (c11 != null && c11.length > 0) {
            Formatter formatter = new Formatter();
            int length = c11.length;
            for (int i11 = 0; i11 < length; i11++) {
                formatter.format("%02x", Byte.valueOf(c11[i11]));
            }
            createMap.putString("rawData", formatter.toString());
            formatter.close();
        }
        createMap.putString("type", this.f23832a.b().toString());
        WritableArray createArray = Arguments.createArray();
        for (com.google.zxing.l lVar : this.f23832a.e()) {
            if (lVar != null) {
                WritableMap createMap3 = Arguments.createMap();
                createMap3.putString("x", String.valueOf(lVar.c()));
                createMap3.putString("y", String.valueOf(lVar.d()));
                createArray.pushMap(createMap3);
            }
        }
        createMap2.putArray(AppMeasurementSdk.ConditionalUserProperty.ORIGIN, createArray);
        createMap2.putInt(Snapshot.HEIGHT, this.f23834c);
        createMap2.putInt(Snapshot.WIDTH, this.f23833b);
        createMap.putMap("bounds", createMap2);
        byte[] bArr = this.f23835d;
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
        return (short) (this.f23832a.f().hashCode() % 32767);
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return CameraViewManager.a.EVENT_ON_BAR_CODE_READ.toString();
    }
}