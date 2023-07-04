package yr;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class e extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: a  reason: collision with root package name */
    private final float f59700a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f59701b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f59702c;

    /* renamed from: d  reason: collision with root package name */
    private final short f59703d;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    public e(int i11, float f11, boolean z11, boolean z12, short s11) {
        super(i11);
        this.f59700a = f11;
        this.f59701b = z11;
        this.f59702c = z12;
        this.f59703d = s11;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        s.g(rctEventEmitter, "rctEventEmitter");
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("progress", this.f59700a);
        createMap.putInt("closing", this.f59701b ? 1 : 0);
        createMap.putInt("goingForward", this.f59702c ? 1 : 0);
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), createMap);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return this.f59703d;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topTransitionProgress";
    }
}