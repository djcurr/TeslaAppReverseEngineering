package xq;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class a extends com.facebook.react.uimanager.events.c<a> {

    /* renamed from: a  reason: collision with root package name */
    private final WritableMap f57643a;

    /* renamed from: xq.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1308a {
        private C1308a() {
        }

        public /* synthetic */ C1308a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C1308a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i11, WritableMap mEventData) {
        super(i11);
        s.g(mEventData, "mEventData");
        this.f57643a = mEventData;
    }

    @Override // com.facebook.react.uimanager.events.c
    public boolean canCoalesce() {
        return false;
    }

    @Override // com.facebook.react.uimanager.events.c
    public void dispatch(RCTEventEmitter rctEventEmitter) {
        s.g(rctEventEmitter, "rctEventEmitter");
        rctEventEmitter.receiveEvent(getViewTag(), getEventName(), this.f57643a);
    }

    @Override // com.facebook.react.uimanager.events.c
    public short getCoalescingKey() {
        return (short) 0;
    }

    @Override // com.facebook.react.uimanager.events.c
    public String getEventName() {
        return "topHttpError";
    }
}