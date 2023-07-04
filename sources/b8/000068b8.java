package expo.modules.calendar;

import expo.modules.core.Promise;
import h00.a;
import h00.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "expo.modules.calendar.CalendarModule$launchAsyncWithModuleScope$1", f = "CalendarModule.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lv20/o0;", "Lvz/b0;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class CalendarModule$launchAsyncWithModuleScope$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ a<b0> $block;
    final /* synthetic */ Promise $promise;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarModule$launchAsyncWithModuleScope$1(a<b0> aVar, Promise promise, d<? super CalendarModule$launchAsyncWithModuleScope$1> dVar) {
        super(2, dVar);
        this.$block = aVar;
        this.$promise = promise;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CalendarModule$launchAsyncWithModuleScope$1(this.$block, this.$promise, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((CalendarModule$launchAsyncWithModuleScope$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            try {
                this.$block.invoke();
            } catch (ModuleDestroyedException unused) {
                this.$promise.reject("E_CALENDAR_MODULE_DESTROYED", "Module destroyed, promise canceled");
            }
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        try {
            this.$block.invoke();
        } catch (ModuleDestroyedException unused) {
            this.$promise.reject("E_CALENDAR_MODULE_DESTROYED", "Module destroyed, promise canceled");
        }
        return b0.f54756a;
    }
}