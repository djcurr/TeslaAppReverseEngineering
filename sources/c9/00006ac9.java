package expo.modules.kotlin.modules;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import h00.p;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000f\u001a\u00020\r\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u0001\"\u0006\b\u0003\u0010\u0003\u0018\u0001\"\u0006\b\u0004\u0010\u0004\u0018\u0001\"\u0006\b\u0005\u0010\u0005\u0018\u0001\"\u0006\b\u0006\u0010\u0006\u0018\u0001\"\u0006\b\u0007\u0010\u0007\u0018\u00012\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\n¨\u0006\u000e"}, d2 = {"R", "P0", "P1", "P2", "P3", "P4", "P5", "P6", "", "", "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "expo/modules/kotlin/modules/ModuleDefinitionBuilder$AsyncFunction$15", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$13 extends u implements p<Object[], Promise, b0> {
    final /* synthetic */ h00.u $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModuleDefinitionBuilder$asyncFunction$$inlined$AsyncFunction$13(h00.u uVar) {
        super(2);
        this.$body = uVar;
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
        h00.u uVar = this.$body;
        Object obj = args[0];
        s.m(1, "P0");
        Object obj2 = args[1];
        s.m(1, "P1");
        Object obj3 = args[2];
        s.m(1, "P2");
        Object obj4 = args[3];
        s.m(1, "P3");
        Object obj5 = args[4];
        s.m(1, "P4");
        Object obj6 = args[5];
        s.m(1, "P5");
        s.m(1, "P6");
        uVar.L(obj, obj2, obj3, obj4, obj5, obj6, promise);
    }
}