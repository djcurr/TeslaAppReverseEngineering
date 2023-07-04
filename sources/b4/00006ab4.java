package expo.modules.kotlin.functions;

import h00.q;
import h00.w;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9", f = "AsyncFunctionBuilder.kt", l = {100}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u0001\"\u0006\b\u0003\u0010\u0003\u0018\u0001\"\u0006\b\u0004\u0010\u0004\u0018\u0001\"\u0006\b\u0005\u0010\u0005\u0018\u0001\"\u0006\b\u0006\u0010\u0006\u0018\u0001\"\u0006\b\u0007\u0010\u0007\u0018\u0001\"\u0006\b\b\u0010\b\u0018\u0001*\u00020\t2\u0010\u0010\f\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\nH\u008a@¨\u0006\r"}, d2 = {"R", "P0", "P1", "P2", "P3", "P4", "P5", "P6", "P7", "Lv20/o0;", "", "", "it", "expo/modules/kotlin/functions/AsyncFunctionBuilder$SuspendBody$9", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9 extends l implements q<o0, Object[], d<? super Object>, Object> {
    final /* synthetic */ w $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9(w wVar, d dVar) {
        super(3, dVar);
        this.$block = wVar;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Object[] objArr, d<? super Object> dVar) {
        return invoke2(o0Var, objArr, (d<Object>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, Object[] objArr, d<Object> dVar) {
        AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9 = new AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9(this.$block, dVar);
        asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9.L$0 = objArr;
        return asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            w wVar = this.$block;
            Object obj2 = objArr[0];
            s.m(1, "P0");
            Object obj3 = objArr[1];
            s.m(1, "P1");
            Object obj4 = objArr[2];
            s.m(1, "P2");
            Object obj5 = objArr[3];
            s.m(1, "P3");
            Object obj6 = objArr[4];
            s.m(1, "P4");
            Object obj7 = objArr[5];
            s.m(1, "P5");
            Object obj8 = objArr[6];
            s.m(1, "P6");
            Object obj9 = objArr[7];
            s.m(1, "P7");
            this.label = 1;
            obj = wVar.n0(obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, this);
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
        w wVar = this.$block;
        Object obj2 = objArr[0];
        s.m(1, "P0");
        Object obj3 = objArr[1];
        s.m(1, "P1");
        Object obj4 = objArr[2];
        s.m(1, "P2");
        Object obj5 = objArr[3];
        s.m(1, "P3");
        Object obj6 = objArr[4];
        s.m(1, "P4");
        Object obj7 = objArr[5];
        s.m(1, "P5");
        Object obj8 = objArr[6];
        s.m(1, "P6");
        Object obj9 = objArr[7];
        s.m(1, "P7");
        kotlin.jvm.internal.q.c(0);
        Object n02 = wVar.n0(obj2, obj3, obj4, obj5, obj6, obj7, obj8, obj9, this);
        kotlin.jvm.internal.q.c(1);
        return n02;
    }
}