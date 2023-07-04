package expo.modules.kotlin.modules;

import com.facebook.react.bridge.BaseJavaModule;
import expo.modules.kotlin.Promise;
import h00.p;
import h00.r;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u000b\u001a\u00020\n\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u0001\"\u0006\b\u0003\u0010\u0003\u0018\u0001\"\u0006\b\u0004\u0010\u0004\u0018\u00012\u0010\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\n"}, d2 = {"R", "P0", "P1", "P2", "P3", "", "", "args", "Lexpo/modules/kotlin/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class ModuleDefinitionBuilder$function$9 extends u implements p<Object[], Promise, b0> {
    final /* synthetic */ r<P0, P1, P2, P3, R> $body;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ModuleDefinitionBuilder$function$9(r<? super P0, ? super P1, ? super P2, ? super P3, ? extends R> rVar) {
        super(2);
        this.$body = rVar;
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
        r<P0, P1, P2, P3, R> rVar = this.$body;
        Object obj = args[0];
        s.m(1, "P0");
        Object obj2 = args[1];
        s.m(1, "P1");
        Object obj3 = args[2];
        s.m(1, "P2");
        s.m(1, "P3");
        rVar.invoke(obj, obj2, obj3, promise);
    }
}