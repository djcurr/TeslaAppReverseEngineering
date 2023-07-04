package expo.modules.kotlin.functions;

import h00.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$3", f = "AsyncFunctionBuilder.kt", l = {40}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u0001*\u00020\u00032\u0010\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004H\u008a@¨\u0006\u0007"}, d2 = {"R", "P0", "P1", "Lv20/o0;", "", "", "it", "expo/modules/kotlin/functions/AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$3 extends l implements q<o0, Object[], d<? super Object>, Object> {
    final /* synthetic */ q $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$3(q qVar, d dVar) {
        super(3, dVar);
        this.$block = qVar;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Object[] objArr, d<? super Object> dVar) {
        return invoke2(o0Var, objArr, (d<Object>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, Object[] objArr, d<Object> dVar) {
        AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$3 asyncFunctionBuilderKt$coroutine$$inlined$Coroutine$3 = new AsyncFunctionBuilderKt$coroutine$$inlined$Coroutine$3(this.$block, dVar);
        asyncFunctionBuilderKt$coroutine$$inlined$Coroutine$3.L$0 = objArr;
        return asyncFunctionBuilderKt$coroutine$$inlined$Coroutine$3.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            q qVar = this.$block;
            Object obj2 = objArr[0];
            s.m(1, "P0");
            Object obj3 = objArr[0];
            s.m(1, "P1");
            this.label = 1;
            obj = qVar.invoke(obj2, obj3, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            r.b(obj);
        }
        return obj;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        Object[] objArr = (Object[]) this.L$0;
        q qVar = this.$block;
        Object obj2 = objArr[0];
        s.m(1, "P0");
        Object obj3 = objArr[0];
        s.m(1, "P1");
        kotlin.jvm.internal.q.c(0);
        kotlin.jvm.internal.q.c(0);
        Object invoke = qVar.invoke(obj2, obj3, this);
        kotlin.jvm.internal.q.c(1);
        kotlin.jvm.internal.q.c(1);
        return invoke;
    }
}