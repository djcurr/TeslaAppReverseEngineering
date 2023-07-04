package expo.modules.kotlin.modules;

import expo.modules.kotlin.events.EventListener;
import expo.modules.kotlin.events.EventName;
import expo.modules.kotlin.events.EventsDefinition;
import expo.modules.kotlin.functions.AnyFunction;
import expo.modules.kotlin.views.ViewManagerDefinition;
import h00.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u001a\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00070\u001b\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b \u0010!R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R%\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R%\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR-\u0010\u001c\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00070\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, d2 = {"Lexpo/modules/kotlin/modules/ModuleDefinitionData;", "", "", "name", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "", "Lexpo/modules/kotlin/functions/AnyFunction;", "methods", "Ljava/util/Map;", "getMethods", "()Ljava/util/Map;", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "viewManagerDefinition", "Lexpo/modules/kotlin/views/ViewManagerDefinition;", "getViewManagerDefinition", "()Lexpo/modules/kotlin/views/ViewManagerDefinition;", "Lexpo/modules/kotlin/events/EventName;", "Lexpo/modules/kotlin/events/EventListener;", "eventListeners", "getEventListeners", "Lexpo/modules/kotlin/events/EventsDefinition;", "eventsDefinition", "Lexpo/modules/kotlin/events/EventsDefinition;", "getEventsDefinition", "()Lexpo/modules/kotlin/events/EventsDefinition;", "Lkotlin/Function0;", "constantsProvider", "Lh00/a;", "getConstantsProvider", "()Lh00/a;", "<init>", "(Ljava/lang/String;Lh00/a;Ljava/util/Map;Lexpo/modules/kotlin/views/ViewManagerDefinition;Ljava/util/Map;Lexpo/modules/kotlin/events/EventsDefinition;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleDefinitionData {
    private final a<Map<String, Object>> constantsProvider;
    private final Map<EventName, EventListener> eventListeners;
    private final EventsDefinition eventsDefinition;
    private final Map<String, AnyFunction> methods;
    private final String name;
    private final ViewManagerDefinition viewManagerDefinition;

    /* JADX WARN: Multi-variable type inference failed */
    public ModuleDefinitionData(String name, a<? extends Map<String, ? extends Object>> constantsProvider, Map<String, ? extends AnyFunction> methods, ViewManagerDefinition viewManagerDefinition, Map<EventName, ? extends EventListener> eventListeners, EventsDefinition eventsDefinition) {
        s.g(name, "name");
        s.g(constantsProvider, "constantsProvider");
        s.g(methods, "methods");
        s.g(eventListeners, "eventListeners");
        this.name = name;
        this.constantsProvider = constantsProvider;
        this.methods = methods;
        this.viewManagerDefinition = viewManagerDefinition;
        this.eventListeners = eventListeners;
        this.eventsDefinition = eventsDefinition;
    }

    public final a<Map<String, Object>> getConstantsProvider() {
        return this.constantsProvider;
    }

    public final Map<EventName, EventListener> getEventListeners() {
        return this.eventListeners;
    }

    public final EventsDefinition getEventsDefinition() {
        return this.eventsDefinition;
    }

    public final Map<String, AnyFunction> getMethods() {
        return this.methods;
    }

    public final String getName() {
        return this.name;
    }

    public final ViewManagerDefinition getViewManagerDefinition() {
        return this.viewManagerDefinition;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ModuleDefinitionData(java.lang.String r10, h00.a r11, java.util.Map r12, expo.modules.kotlin.views.ViewManagerDefinition r13, java.util.Map r14, expo.modules.kotlin.events.EventsDefinition r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r9 = this;
            r0 = r16 & 8
            r1 = 0
            if (r0 == 0) goto L7
            r6 = r1
            goto L8
        L7:
            r6 = r13
        L8:
            r0 = r16 & 16
            if (r0 == 0) goto L12
            java.util.Map r0 = wz.p0.i()
            r7 = r0
            goto L13
        L12:
            r7 = r14
        L13:
            r0 = r16 & 32
            if (r0 == 0) goto L19
            r8 = r1
            goto L1a
        L19:
            r8 = r15
        L1a:
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.modules.ModuleDefinitionData.<init>(java.lang.String, h00.a, java.util.Map, expo.modules.kotlin.views.ViewManagerDefinition, java.util.Map, expo.modules.kotlin.events.EventsDefinition, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}