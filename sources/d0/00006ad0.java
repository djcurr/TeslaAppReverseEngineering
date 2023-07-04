package expo.modules.kotlin.modules;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import h00.p;
import h00.q;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u0001\"\u0006\b\u0003\u0010\u0003\u0018\u00012\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\n¨\u0006\n"}, d2 = {"R", "P0", "P1", "P2", "", "", "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "expo/modules/kotlin/modules/ModuleDefinitionBuilder$AsyncFunction$7", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$5 extends u implements p<Object[], Promise, b0> {
    final /* synthetic */ q $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$5(q qVar) {
        super(2);
        this.$body = qVar;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(Object[] objArr, Promise promise) {
        invoke2(objArr, promise);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Object[] args, Promise promise) {
        s.g(args, "args");
        s.g(promise, "promise");
        q qVar = this.$body;
        Object obj = args[0];
        s.m(1, "P0");
        Object obj2 = args[1];
        s.m(1, "P1");
        s.m(1, "P2");
        qVar.invoke(obj, obj2, promise);
    }
}