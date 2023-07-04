package expo.modules.kotlin.events;

import h00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lexpo/modules/kotlin/events/BasicEventListener;", "Lexpo/modules/kotlin/events/EventListener;", "Lvz/b0;", "call", "Lkotlin/Function0;", "body", "Lh00/a;", "getBody", "()Lh00/a;", "Lexpo/modules/kotlin/events/EventName;", "eventName", "<init>", "(Lexpo/modules/kotlin/events/EventName;Lh00/a;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class BasicEventListener extends EventListener {
    private final a<b0> body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicEventListener(EventName eventName, a<b0> body) {
        super(eventName, null);
        s.g(eventName, "eventName");
        s.g(body, "body");
        this.body = body;
    }

    public final void call() {
        this.body.invoke();
    }

    public final a<b0> getBody() {
        return this.body;
    }
}