package expo.modules.kotlin.functions;

import h00.q;
import h00.u;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "expo.modules.kotlin.functions.AsyncFunctionBuilder$SuspendBody$7", f = "AsyncFunctionBuilder.kt", l = {80}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\u0001\u0018\u0001\"\u0006\b\u0002\u0010\u0002\u0018\u0001\"\u0006\b\u0003\u0010\u0003\u0018\u0001\"\u0006\b\u0004\u0010\u0004\u0018\u0001\"\u0006\b\u0005\u0010\u0005\u0018\u0001\"\u0006\b\u0006\u0010\u0006\u0018\u0001*\u00020\u00072\u0010\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\bH\u008a@"}, d2 = {"R", "P0", "P1", "P2", "P3", "P4", "P5", "Lv20/o0;", "", "", "it", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class AsyncFunctionBuilder$SuspendBody$7 extends l implements q<o0, Object[], d<? super Object>, Object> {
    final /* synthetic */ u<P0, P1, P2, P3, P4, P5, d<? super R>, Object> $block;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFunctionBuilder$SuspendBody$7(u<? super P0, ? super P1, ? super P2, ? super P3, ? super P4, ? super P5, ? super d<? super R>, ? extends Object> uVar, d<? super AsyncFunctionBuilder$SuspendBody$7> dVar) {
        super(3, dVar);
        this.$block = uVar;
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(o0 o0Var, Object[] objArr, d<? super Object> dVar) {
        return invoke2(o0Var, objArr, (d<Object>) dVar);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final Object invoke2(o0 o0Var, Object[] objArr, d<Object> dVar) {
        AsyncFunctionBuilder$SuspendBody$7 asyncFunctionBuilder$SuspendBody$7 = new AsyncFunctionBuilder$SuspendBody$7(this.$block, dVar);
        asyncFunctionBuilder$SuspendBody$7.L$0 = objArr;
        return asyncFunctionBuilder$SuspendBody$7.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            Object[] objArr = (Object[]) this.L$0;
            u<P0, P1, P2, P3, P4, P5, d<? super R>, Object> uVar = this.$block;
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
            this.label = 1;
            obj = uVar.L(obj2, obj3, obj4, obj5, obj6, obj7, this);
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
        u<P0, P1, P2, P3, P4, P5, d<? super R>, Object> uVar = this.$block;
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
        return uVar.L(obj2, obj3, obj4, obj5, obj6, obj7, this);
    }
}