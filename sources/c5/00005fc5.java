package com.tesla.data.oapi;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.w;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/CalendarSyncBody;", "", "Lcom/tesla/data/oapi/CalendarData;", "calendarData", "<init>", "(Lcom/tesla/data/oapi/CalendarData;)V", "a", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CalendarSyncBody {
    @ir.b(name = "calendar_data")

    /* renamed from: a  reason: collision with root package name */
    private final CalendarData f21558a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        List i11;
        new a(null);
        i11 = w.i();
        new CalendarSyncBody(new CalendarData(false, "", false, false, "", "", i11));
    }

    public CalendarSyncBody(CalendarData calendarData) {
        s.g(calendarData, "calendarData");
        this.f21558a = calendarData;
    }

    public final CalendarData a() {
        return this.f21558a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CalendarSyncBody) && s.c(this.f21558a, ((CalendarSyncBody) obj).f21558a);
    }

    public int hashCode() {
        return this.f21558a.hashCode();
    }

    public String toString() {
        CalendarData calendarData = this.f21558a;
        return "CalendarSyncBody(calendarData=" + calendarData + ")";
    }
}