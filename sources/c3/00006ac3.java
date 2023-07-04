package expo.modules.kotlin.modules;

import expo.modules.kotlin.events.EventEmitter;
import h00.a;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lexpo/modules/kotlin/events/EventEmitter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class Module$moduleEventEmitter$2 extends u implements a<EventEmitter> {
    final /* synthetic */ Module this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Module$moduleEventEmitter$2(Module module) {
        super(0);
        this.this$0 = module;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.a
    public final EventEmitter invoke() {
        return this.this$0.getAppContext().eventEmitter(this.this$0);
    }
}