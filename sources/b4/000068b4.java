package expo.modules.calendar;

import expo.modules.core.Promise;
import expo.modules.core.arguments.ReadableArguments;
import h00.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "expo.modules.calendar.CalendarModule$saveCalendarAsync$lambda-4$$inlined$launchAsyncWithModuleScope$1", f = "CalendarModule.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lv20/o0;", "Lvz/b0;", "expo/modules/calendar/CalendarModule$launchAsyncWithModuleScope$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: expo.modules.calendar.CalendarModule$saveCalendarAsync$lambda-4$$inlined$launchAsyncWithModuleScope$1  reason: invalid class name */
/* loaded from: classes5.dex */
public final class CalendarModule$saveCalendarAsync$lambda4$$inlined$launchAsyncWithModuleScope$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ ReadableArguments $details$inlined;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Promise $promise$inlined;
    int label;
    final /* synthetic */ CalendarModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarModule$saveCalendarAsync$lambda4$$inlined$launchAsyncWithModuleScope$1(Promise promise, d dVar, CalendarModule calendarModule, ReadableArguments readableArguments, Promise promise2) {
        super(2, dVar);
        this.$promise = promise;
        this.this$0 = calendarModule;
        this.$details$inlined = readableArguments;
        this.$promise$inlined = promise2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CalendarModule$saveCalendarAsync$lambda4$$inlined$launchAsyncWithModuleScope$1(this.$promise, dVar, this.this$0, this.$details$inlined, this.$promise$inlined);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((CalendarModule$saveCalendarAsync$lambda4$$inlined$launchAsyncWithModuleScope$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int saveCalendar;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            try {
                saveCalendar = this.this$0.saveCalendar(this.$details$inlined);
                this.$promise$inlined.resolve(String.valueOf(saveCalendar));
            } catch (Exception e11) {
                try {
                    Promise promise = this.$promise$inlined;
                    String message = e11.getMessage();
                    promise.reject("E_CALENDAR_NOT_SAVED", "Calendar could not be saved: " + message, e11);
                } catch (ModuleDestroyedException unused) {
                    this.$promise.reject("E_CALENDAR_MODULE_DESTROYED", "Module destroyed, promise canceled");
                }
            }
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}