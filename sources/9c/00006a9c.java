package expo.modules.kotlin.functions;

import h00.q;
import h00.r;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.b0;
import zz.d;

@f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$4", f = "AsyncFunctionBuilder.kt", l = {50}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u0001\"\u0006\b\u0003\u0010\u0003\u0018\u0001*\u00020\u00042\u0010\u0010\u0007\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00060\u0005H\u008a@¨\u0006\b"}, d2 = {"R", "P0", "P1", "P2", "Lv20/o0;", "", "", "it", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$4", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$4 extends l implements q<o0, Object[], d<? super Object>, Object> {
    final /* synthetic */ r $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$4(r rVar, d dVar) {
        super(3, dVar);
        this.$block = rVar;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Object[] objArr, d<? super Object> dVar) {
        return invoke2(o0Var, objArr, (d<Object>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, Object[] objArr, d<Object> dVar) {
        AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$4 asyncFunctionBuilder$suspendBody$$inlined$SuspendBody$4 = new AsyncFunctionBuilder$suspendBody$$inlined$SuspendBody$4(this.$block, dVar);
        asyncFunctionBuilder$suspendBody$$inlined$SuspendBody$4.L$0 = objArr;
        return asyncFunctionBuilder$suspendBody$$inlined$SuspendBody$4.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            vz.r.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            r rVar = this.$block;
            Object obj2 = objArr[0];
            s.m(1, "P0");
            Object obj3 = objArr[1];
            s.m(1, "P1");
            Object obj4 = objArr[2];
            s.m(1, "P2");
            this.label = 1;
            obj = rVar.invoke(obj2, obj3, obj4, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        return obj;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Object[] objArr = (Object[]) this.L$0;
        r rVar = this.$block;
        Object obj2 = objArr[0];
        s.m(1, "P0");
        Object obj3 = objArr[1];
        s.m(1, "P1");
        Object obj4 = objArr[2];
        s.m(1, "P2");
        kotlin.jvm.internal.q.c(0);
        Object invoke = rVar.invoke(obj2, obj3, obj4, this);
        kotlin.jvm.internal.q.c(1);
        return invoke;
    }
}