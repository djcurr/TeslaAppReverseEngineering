package expo.modules.kotlin.functions;

import expo.modules.kotlin.ModuleHolder;
import expo.modules.kotlin.Promise;
import expo.modules.kotlin.exception.CodedException;
import expo.modules.kotlin.exception.FunctionCallException;
import expo.modules.kotlin.exception.UnexpectedException;
import h00.p;
import h00.q;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import v20.p0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "expo.modules.kotlin.functions.AsyncSuspendFunction$callImplementation$1", f = "AsyncSuspendFunction.kt", l = {24}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lv20/o0;", "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
final class AsyncSuspendFunction$callImplementation$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ Object[] $args;
    final /* synthetic */ ModuleHolder $holder;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ o0 $scope;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AsyncSuspendFunction this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncSuspendFunction$callImplementation$1(Promise promise, AsyncSuspendFunction asyncSuspendFunction, ModuleHolder moduleHolder, o0 o0Var, Object[] objArr, d<? super AsyncSuspendFunction$callImplementation$1> dVar) {
        super(2, dVar);
        this.$promise = promise;
        this.this$0 = asyncSuspendFunction;
        this.$holder = moduleHolder;
        this.$scope = o0Var;
        this.$args = objArr;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        AsyncSuspendFunction$callImplementation$1 asyncSuspendFunction$callImplementation$1 = new AsyncSuspendFunction$callImplementation$1(this.$promise, this.this$0, this.$holder, this.$scope, this.$args, dVar);
        asyncSuspendFunction$callImplementation$1.L$0 = obj;
        return asyncSuspendFunction$callImplementation$1;
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((AsyncSuspendFunction$callImplementation$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        AsyncSuspendFunction asyncSuspendFunction;
        ModuleHolder moduleHolder;
        q qVar;
        o0 o0Var;
        d11 = a00.d.d();
        int i11 = this.label;
        if (i11 == 0) {
            r.b(obj);
            o0 o0Var2 = (o0) this.L$0;
            try {
                asyncSuspendFunction = this.this$0;
                ModuleHolder moduleHolder2 = this.$holder;
                o0 o0Var3 = this.$scope;
                Object[] objArr = this.$args;
                try {
                    qVar = asyncSuspendFunction.body;
                    this.L$0 = o0Var2;
                    this.L$1 = asyncSuspendFunction;
                    this.L$2 = moduleHolder2;
                    this.label = 1;
                    Object invoke = qVar.invoke(o0Var3, objArr, this);
                    if (invoke == d11) {
                        return d11;
                    }
                    o0Var = o0Var2;
                    obj = invoke;
                } catch (CodedException e11) {
                    e = e11;
                    moduleHolder = moduleHolder2;
                    throw new FunctionCallException(asyncSuspendFunction.getName(), moduleHolder.getName(), e);
                } catch (Throwable th2) {
                    th = th2;
                    moduleHolder = moduleHolder2;
                    throw new FunctionCallException(asyncSuspendFunction.getName(), moduleHolder.getName(), new UnexpectedException(th));
                }
            } catch (CodedException e12) {
                this.$promise.reject(e12);
            } catch (Throwable th3) {
                this.$promise.reject(new UnexpectedException(th3));
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            moduleHolder = (ModuleHolder) this.L$2;
            asyncSuspendFunction = (AsyncSuspendFunction) this.L$1;
            o0Var = (o0) this.L$0;
            try {
                r.b(obj);
            } catch (CodedException e13) {
                e = e13;
                throw new FunctionCallException(asyncSuspendFunction.getName(), moduleHolder.getName(), e);
            } catch (Throwable th4) {
                th = th4;
                throw new FunctionCallException(asyncSuspendFunction.getName(), moduleHolder.getName(), new UnexpectedException(th));
            }
        }
        if (p0.f(o0Var)) {
            this.$promise.resolve(obj);
        }
        return b0.f54756a;
    }
}