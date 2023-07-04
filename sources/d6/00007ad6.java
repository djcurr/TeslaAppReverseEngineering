package j$.util;

import j$.time.Instant;
import j$.time.ZonedDateTime;
import j$.time.k;
import java.util.GregorianCalendar;

/* loaded from: classes7.dex */
public class DesugarGregorianCalendar {
    public static ZonedDateTime toZonedDateTime(GregorianCalendar gregorianCalendar) {
        return ZonedDateTime.k(Instant.ofEpochMilli(gregorianCalendar.getTimeInMillis()), k.k(gregorianCalendar.getTimeZone().getID(), k.f32947a));
    }
}