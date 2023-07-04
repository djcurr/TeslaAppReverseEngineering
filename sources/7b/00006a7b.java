package expo.modules.kotlin.events;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\t\n\u000b¨\u0006\f"}, d2 = {"Lexpo/modules/kotlin/events/EventListener;", "", "Lexpo/modules/kotlin/events/EventName;", "eventName", "Lexpo/modules/kotlin/events/EventName;", "getEventName", "()Lexpo/modules/kotlin/events/EventName;", "<init>", "(Lexpo/modules/kotlin/events/EventName;)V", "Lexpo/modules/kotlin/events/BasicEventListener;", "Lexpo/modules/kotlin/events/EventListenerWithPayload;", "Lexpo/modules/kotlin/events/EventListenerWithSenderAndPayload;", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public abstract class EventListener {
    private final EventName eventName;

    private EventListener(EventName eventName) {
        this.eventName = eventName;
    }

    public /* synthetic */ EventListener(EventName eventName, DefaultConstructorMarker defaultConstructorMarker) {
        this(eventName);
    }

    public final EventName getEventName() {
        return this.eventName;
    }
}