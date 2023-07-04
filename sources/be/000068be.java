package expo.modules.calendar;

import h00.l;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.u;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public final class CalendarModule$saveCalendar$3 extends u implements l<Object, Integer> {
    public static final CalendarModule$saveCalendar$3 INSTANCE = new CalendarModule$saveCalendar$3();

    CalendarModule$saveCalendar$3() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // h00.l
    public final Integer invoke(Object obj) {
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
        return Integer.valueOf(JsValuesMappersKt.attendeeTypeConstantMatchingString((String) obj));
    }
}