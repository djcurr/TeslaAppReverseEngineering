package expo.modules.kotlin.modules;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import h00.p;
import h00.s;
import kotlin.Metadata;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\f\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u0001\"\u0006\b\u0003\u0010\u0003\u0018\u0001\"\u0006\b\u0004\u0010\u0004\u0018\u0001\"\u0006\b\u0005\u0010\u0005\u0018\u00012\u0010\u0010\b\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\n"}, d2 = {"R", "P0", "P1", "P2", "P3", "P4", "", "", "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleDefinitionBuilder$AsyncFunction$11 extends u implements p<Object[], Promise, b0> {
    final /* synthetic */ s<P0, P1, P2, P3, P4, R> $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModuleDefinitionBuilder$AsyncFunction$11(s<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? extends R> sVar) {
        super(2);
        this.$body = sVar;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(Object[] objArr, Promise promise) {
        invoke2(objArr, promise);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Object[] args, Promise promise) {
        kotlin.jvm.internal.s.g(args, "args");
        kotlin.jvm.internal.s.g(promise, "promise");
        s<P0, P1, P2, P3, P4, R> sVar = this.$body;
        Object obj = args[0];
        kotlin.jvm.internal.s.m(1, "P0");
        Object obj2 = args[1];
        kotlin.jvm.internal.s.m(1, "P1");
        Object obj3 = args[2];
        kotlin.jvm.internal.s.m(1, "P2");
        Object obj4 = args[3];
        kotlin.jvm.internal.s.m(1, "P3");
        kotlin.jvm.internal.s.m(1, "P4");
        sVar.invoke(obj, obj2, obj3, obj4, promise);
    }
}