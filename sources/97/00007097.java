package gr;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class a extends com.facebook.react.uimanager.events.c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final int f28084a;

    /* renamed from: b  reason: collision with root package name */
    private final float f28085b;

    /* renamed from: gr.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0532a {
        private C0532a() {
        }

        public /* synthetic */ C0532a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C0532a(null);
    }

    public a(int i11, int i12, float f11) {
        super(i11);
        this.f28084a = i12;
        this.f28085b = (Float.isInfinite(f11) || Float.isNaN(f11)) ? BitmapDescriptorFactory.HUE_RED : f11;
    }

    private final WritableMap a() {
        WritableMap eventData = Arguments.createMap();
        eventData.putInt("position", this.f28084a);
        eventData.putDouble("offset", this.f28085b);
        s.f(eventData, "eventData");
        return eventData;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        s.g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), a());
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topPageScroll";
    }
}