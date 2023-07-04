package expo.modules.calendar;

import expo.modules.core.Promise;
import expo.modules.core.arguments.ReadableArguments;
import expo.modules.core.errors.InvalidArgumentException;
import h00.p;
import java.text.ParseException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "expo.modules.calendar.CalendarModule$saveEventAsync$lambda-12$$inlined$launchAsyncWithModuleScope$1", f = "CalendarModule.kt", l = {}, m = "invokeSuspend")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lv20/o0;", "Lvz/b0;", "expo/modules/calendar/CalendarModule$launchAsyncWithModuleScope$1", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* renamed from: expo.modules.calendar.CalendarModule$saveEventAsync$lambda-12$$inlined$launchAsyncWithModuleScope$1  reason: invalid class name */
/* loaded from: classes5.dex */
public final class CalendarModule$saveEventAsync$lambda12$$inlined$launchAsyncWithModuleScope$1 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ ReadableArguments $details$inlined;
    final /* synthetic */ Promise $promise;
    final /* synthetic */ Promise $promise$inlined;
    int label;
    final /* synthetic */ CalendarModule this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CalendarModule$saveEventAsync$lambda12$$inlined$launchAsyncWithModuleScope$1(Promise promise, d dVar, CalendarModule calendarModule, ReadableArguments readableArguments, Promise promise2) {
        super(2, dVar);
        this.$promise = promise;
        this.this$0 = calendarModule;
        this.$details$inlined = readableArguments;
        this.$promise$inlined = promise2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new CalendarModule$saveEventAsync$lambda12$$inlined$launchAsyncWithModuleScope$1(this.$promise, dVar, this.this$0, this.$details$inlined, this.$promise$inlined);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((CalendarModule$saveEventAsync$lambda12$$inlined$launchAsyncWithModuleScope$1) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int saveEvent;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            try {
                try {
                    try {
                        saveEvent = this.this$0.saveEvent(this.$details$inlined);
                        this.$promise$inlined.resolve(String.valueOf(saveEvent));
                    } catch (EventNotSavedException e11) {
                        this.$promise$inlined.reject("E_EVENT_NOT_SAVED", "Event could not be saved", e11);
                    } catch (InvalidArgumentException e12) {
                        this.$promise$inlined.reject("E_EVENT_NOT_SAVED", "Event could not be saved", e12);
                    }
                } catch (ParseException e13) {
                    this.$promise$inlined.reject("E_EVENT_NOT_SAVED", "Event could not be saved", e13);
                }
            } catch (ModuleDestroyedException unused) {
                this.$promise.reject("E_CALENDAR_MODULE_DESTROYED", "Module destroyed, promise canceled");
            }
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}