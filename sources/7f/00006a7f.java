package expo.modules.kotlin.events;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\b\u0010\tR!\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lexpo/modules/kotlin/events/EventsDefinition;", "", "", "", "names", "[Ljava/lang/String;", "getNames", "()[Ljava/lang/String;", "<init>", "([Ljava/lang/String;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class EventsDefinition {
    private final String[] names;

    public EventsDefinition(String[] names) {
        s.g(names, "names");
        this.names = names;
    }

    public final String[] getNames() {
        return this.names;
    }
}