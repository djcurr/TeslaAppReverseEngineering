package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes7.dex */
public enum b implements v {
    NANOS("Nanos", Duration.d(1)),
    MICROS("Micros", Duration.d(1000)),
    MILLIS("Millis", Duration.d(1000000)),
    SECONDS("Seconds", Duration.e(1)),
    MINUTES("Minutes", Duration.e(60)),
    HOURS("Hours", Duration.e(3600)),
    HALF_DAYS("HalfDays", Duration.e(43200)),
    DAYS("Days", Duration.e(86400)),
    WEEKS("Weeks", Duration.e(604800)),
    MONTHS("Months", Duration.e(2629746)),
    YEARS("Years", Duration.e(31556952)),
    DECADES("Decades", Duration.e(315569520)),
    CENTURIES("Centuries", Duration.e(3155695200L)),
    MILLENNIA("Millennia", Duration.e(31556952000L)),
    ERAS("Eras", Duration.e(31556952000000000L)),
    FOREVER("Forever", Duration.ofSeconds(Long.MAX_VALUE, 999999999));
    

    /* renamed from: a  reason: collision with root package name */
    private final String f32954a;

    b(String str, Duration duration) {
        this.f32954a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f32954a;
    }
}