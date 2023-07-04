package yr;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class a extends com.facebook.react.uimanager.events.c<b> {

    /* renamed from: yr.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public static final class C1358a {
        private C1358a() {
        }

        public /* synthetic */ C1358a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1358a(null);
    }

    public a(int i11) {
        super(i11);
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        s.g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), Arguments.createMap());
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topHeaderBackButtonClickedEvent";
    }
}