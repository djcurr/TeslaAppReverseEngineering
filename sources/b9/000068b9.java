package expo.modules.calendar;

import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public /* synthetic */ class CalendarModule$saveAttendeeForEvent$attendeeBuilder$1 extends p implements l<String, Integer> {
    public static final CalendarModule$saveAttendeeForEvent$attendeeBuilder$1 INSTANCE = new CalendarModule$saveAttendeeForEvent$attendeeBuilder$1();

    CalendarModule$saveAttendeeForEvent$attendeeBuilder$1() {
        super(1, JsValuesMappersKt.class, "attendeeRelationshipConstantMatchingString", "attendeeRelationshipConstantMatchingString(Ljava/lang/String;)I", 1);
    }

    @Override // h00.l
    public final Integer invoke(String p02) {
        s.g(p02, "p0");
        return Integer.valueOf(JsValuesMappersKt.attendeeRelationshipConstantMatchingString(p02));
    }
}