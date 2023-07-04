package expo.modules.kotlin.events;

import com.adyen.checkout.components.status.model.StatusResponse;
import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B)\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\t¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\u0005\u001a\u00028\u0001¢\u0006\u0004\b\u0007\u0010\bR+\u0010\n\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lexpo/modules/kotlin/events/EventListenerWithSenderAndPayload;", "Sender", "Payload", "Lexpo/modules/kotlin/events/EventListener;", "sender", StatusResponse.PAYLOAD, "Lvz/b0;", "call", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lkotlin/Function2;", "body", "Lh00/p;", "getBody", "()Lh00/p;", "Lexpo/modules/kotlin/events/EventName;", "eventName", "<init>", "(Lexpo/modules/kotlin/events/EventName;Lh00/p;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class EventListenerWithSenderAndPayload<Sender, Payload> extends EventListener {
    private final p<Sender, Payload, b0> body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public EventListenerWithSenderAndPayload(EventName eventName, p<? super Sender, ? super Payload, b0> body) {
        super(eventName, null);
        s.g(eventName, "eventName");
        s.g(body, "body");
        this.body = body;
    }

    public final void call(Sender sender, Payload payload) {
        this.body.invoke(sender, payload);
    }

    public final p<Sender, Payload, b0> getBody() {
        return this.body;
    }
}