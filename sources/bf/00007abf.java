package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes7.dex */
enum i implements v {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.e(31556952)),
    QUARTER_YEARS("QuarterYears", Duration.e(7889238));
    

    /* renamed from: a  reason: collision with root package name */
    private final String f32958a;

    i(String str, Duration duration) {
        this.f32958a = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f32958a;
    }
}