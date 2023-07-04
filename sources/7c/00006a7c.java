package expo.modules.kotlin.events;

import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006R%\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lexpo/modules/kotlin/events/EventListenerWithPayload;", "Payload", "Lexpo/modules/kotlin/events/EventListener;", "sender", "Lvz/b0;", "call", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "body", "Lh00/l;", "getBody", "()Lh00/l;", "Lexpo/modules/kotlin/events/EventName;", "eventName", "<init>", "(Lexpo/modules/kotlin/events/EventName;Lh00/l;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class EventListenerWithPayload<Payload> extends EventListener {
    private final l<Payload, b0> body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EventListenerWithPayload(EventName eventName, l<? super Payload, b0> body) {
        super(eventName, null);
        s.g(eventName, "eventName");
        s.g(body, "body");
        this.body = body;
    }

    public final void call(Payload payload) {
        this.body.invoke(payload);
    }

    public final l<Payload, b0> getBody() {
        return this.body;
    }
}