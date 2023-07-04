package expo.modules.kotlin.events;

import android.os.Bundle;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.records.Record;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\tH\u0016J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\nH\u0016J\"\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0010\u0010\u0007\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000bH\u0016R\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lexpo/modules/kotlin/events/KModuleEventEmitterWrapper;", "Lexpo/modules/kotlin/events/KEventEmitterWrapper;", "", "eventName", "Lvz/b0;", "checkIfEventWasExported", "Landroid/os/Bundle;", "eventBody", "emit", "Lcom/facebook/react/bridge/WritableMap;", "Lexpo/modules/kotlin/records/Record;", "", "Lexpo/modules/kotlin/ModuleHolder;", "moduleHolder", "Lexpo/modules/kotlin/ModuleHolder;", "Lexpo/modules/core/interfaces/services/EventEmitter;", "legacyEventEmitter", "Ljava/lang/ref/WeakReference;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContextHolder", "<init>", "(Lexpo/modules/kotlin/ModuleHolder;Lexpo/modules/core/interfaces/services/EventEmitter;Ljava/lang/ref/WeakReference;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class KModuleEventEmitterWrapper extends KEventEmitterWrapper {
    private final ModuleHolder moduleHolder;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KModuleEventEmitterWrapper(ModuleHolder moduleHolder, expo.modules.core.interfaces.services.EventEmitter legacyEventEmitter, WeakReference<ReactApplicationContext> reactContextHolder) {
        super(legacyEventEmitter, reactContextHolder);
        s.g(moduleHolder, "moduleHolder");
        s.g(legacyEventEmitter, "legacyEventEmitter");
        s.g(reactContextHolder, "reactContextHolder");
        this.moduleHolder = moduleHolder;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
        if (r0 == true) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void checkIfEventWasExported(java.lang.String r4) {
        /*
            r3 = this;
            expo.modules.kotlin.ModuleHolder r0 = r3.moduleHolder
            expo.modules.kotlin.modules.ModuleDefinitionData r0 = r0.getDefinition()
            expo.modules.kotlin.events.EventsDefinition r0 = r0.getEventsDefinition()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
        Le:
            r1 = r2
            goto L1d
        L10:
            java.lang.String[] r0 = r0.getNames()
            if (r0 != 0) goto L17
            goto Le
        L17:
            boolean r0 = wz.l.D(r0, r4)
            if (r0 != r1) goto Le
        L1d:
            if (r1 == 0) goto L20
            return
        L20:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unsupported event: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.events.KModuleEventEmitterWrapper.checkIfEventWasExported(java.lang.String):void");
    }

    @Override // expo.modules.kotlin.events.KEventEmitterWrapper, expo.modules.core.interfaces.services.EventEmitter
    public void emit(String eventName, Bundle bundle) {
        s.g(eventName, "eventName");
        checkIfEventWasExported(eventName);
        super.emit(eventName, bundle);
    }

    @Override // expo.modules.kotlin.events.KEventEmitterWrapper, expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, WritableMap writableMap) {
        s.g(eventName, "eventName");
        checkIfEventWasExported(eventName);
        super.emit(eventName, writableMap);
    }

    @Override // expo.modules.kotlin.events.KEventEmitterWrapper, expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, Record record) {
        s.g(eventName, "eventName");
        checkIfEventWasExported(eventName);
        super.emit(eventName, record);
    }

    @Override // expo.modules.kotlin.events.KEventEmitterWrapper, expo.modules.kotlin.events.EventEmitter
    public void emit(String eventName, Map<?, ?> map) {
        s.g(eventName, "eventName");
        checkIfEventWasExported(eventName);
        super.emit(eventName, map);
    }
}