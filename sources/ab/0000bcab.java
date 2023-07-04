package wg;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactSoftExceptionLogger;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.p;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* loaded from: classes3.dex */
public class g extends com.facebook.react.uimanager.events.c<g> {

    /* renamed from: j  reason: collision with root package name */
    private static String f55864j = "g";

    /* renamed from: k  reason: collision with root package name */
    private static final v3.g<g> f55865k = new v3.g<>(3);

    /* renamed from: a  reason: collision with root package name */
    private int f55866a;

    /* renamed from: b  reason: collision with root package name */
    private int f55867b;

    /* renamed from: c  reason: collision with root package name */
    private double f55868c;

    /* renamed from: d  reason: collision with root package name */
    private double f55869d;

    /* renamed from: e  reason: collision with root package name */
    private int f55870e;

    /* renamed from: f  reason: collision with root package name */
    private int f55871f;

    /* renamed from: g  reason: collision with root package name */
    private int f55872g;

    /* renamed from: h  reason: collision with root package name */
    private int f55873h;

    /* renamed from: i  reason: collision with root package name */
    private com.facebook.react.views.scroll.b f55874i;

    private g() {
    }

    private void a(int i11, int i12, com.facebook.react.views.scroll.b bVar, int i13, int i14, float f11, float f12, int i15, int i16, int i17, int i18) {
        super.init(i11, i12);
        this.f55874i = bVar;
        this.f55866a = i13;
        this.f55867b = i14;
        this.f55868c = f11;
        this.f55869d = f12;
        this.f55870e = i15;
        this.f55871f = i16;
        this.f55872g = i17;
        this.f55873h = i18;
    }

    public static g b(int i11, int i12, com.facebook.react.views.scroll.b bVar, int i13, int i14, float f11, float f12, int i15, int i16, int i17, int i18) {
        g b11 = f55865k.b();
        if (b11 == null) {
            b11 = new g();
        }
        b11.a(i11, i12, bVar, i13, i14, f11, f12, i15, i16, i17, i18);
        return b11;
    }

    @Deprecated
    public static g c(int i11, com.facebook.react.views.scroll.b bVar, int i12, int i13, float f11, float f12, int i14, int i15, int i16, int i17) {
        return b(-1, i11, bVar, i12, i13, f11, f12, i14, i15, i16, i17);
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return this.f55874i == com.facebook.react.views.scroll.b.SCROLL;
    }

    @Override // com.facebook.react.uimanager.events.c
    protected WritableMap getEventData() {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("top", 0.0d);
        createMap.putDouble("bottom", 0.0d);
        createMap.putDouble("left", 0.0d);
        createMap.putDouble("right", 0.0d);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putDouble("x", p.a(this.f55866a));
        createMap2.putDouble("y", p.a(this.f55867b));
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putDouble(Snapshot.WIDTH, p.a(this.f55870e));
        createMap3.putDouble(Snapshot.HEIGHT, p.a(this.f55871f));
        WritableMap createMap4 = Arguments.createMap();
        createMap4.putDouble(Snapshot.WIDTH, p.a(this.f55872g));
        createMap4.putDouble(Snapshot.HEIGHT, p.a(this.f55873h));
        WritableMap createMap5 = Arguments.createMap();
        createMap5.putDouble("x", this.f55868c);
        createMap5.putDouble("y", this.f55869d);
        WritableMap createMap6 = Arguments.createMap();
        createMap6.putMap("contentInset", createMap);
        createMap6.putMap("contentOffset", createMap2);
        createMap6.putMap("contentSize", createMap3);
        createMap6.putMap("layoutMeasurement", createMap4);
        createMap6.putMap("velocity", createMap5);
        createMap6.putInt("target", getViewTag());
        createMap6.putBoolean("responderIgnoreScroll", true);
        return createMap6;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return com.facebook.react.views.scroll.b.getJSEventName((com.facebook.react.views.scroll.b) wf.a.c(this.f55874i));
    }

    @Override // com.facebook.react.uimanager.events.c
    public void onDispose() {
        try {
            f55865k.a(this);
        } catch (IllegalStateException e11) {
            ReactSoftExceptionLogger.logSoftException(f55864j, e11);
        }
    }
}