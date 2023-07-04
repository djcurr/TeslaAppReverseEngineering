package expo.modules.calendar;

import h00.l;
import kotlin.Metadata;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
/* loaded from: classes5.dex */
public /* synthetic */ class CalendarModule$saveEvent$2 extends p implements l<String, Integer> {
    public static final CalendarModule$saveEvent$2 INSTANCE = new CalendarModule$saveEvent$2();

    CalendarModule$saveEvent$2() {
        super(1, JsValuesMappersKt.class, "accessConstantMatchingString", "accessConstantMatchingString(Ljava/lang/String;)I", 1);
    }

    @Override // h00.l
    public final Integer invoke(String p02) {
        s.g(p02, "p0");
        return Integer.valueOf(JsValuesMappersKt.accessConstantMatchingString(p02));
    }
}