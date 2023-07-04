package com.tesla.data.oapi;

import expo.modules.constants.ExponentInstallationId;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/tesla/data/oapi/CalendarData;", "", "", "accessDisabled", "", "phoneName", "notificationDisabled", "backgroundDisabled", ExponentInstallationId.LEGACY_UUID_KEY, "reason", "", "Lcom/tesla/data/oapi/Calendar;", "calendars", "<init>", "(ZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CalendarData {
    @ir.b(name = "access_disabled")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21544a;
    @ir.b(name = "phone_name")

    /* renamed from: b  reason: collision with root package name */
    private final String f21545b;
    @ir.b(name = "notification_disabled")

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21546c;
    @ir.b(name = "background_disabled")

    /* renamed from: d  reason: collision with root package name */
    private final boolean f21547d;
    @ir.b(name = ExponentInstallationId.LEGACY_UUID_KEY)

    /* renamed from: e  reason: collision with root package name */
    private final String f21548e;
    @ir.b(name = "reason")

    /* renamed from: f  reason: collision with root package name */
    private final String f21549f;
    @ir.b(name = "calendars")

    /* renamed from: g  reason: collision with root package name */
    private final List<Calendar> f21550g;

    public CalendarData(boolean z11, String phoneName, boolean z12, boolean z13, String uuid, String reason, List<Calendar> calendars) {
        s.g(phoneName, "phoneName");
        s.g(uuid, "uuid");
        s.g(reason, "reason");
        s.g(calendars, "calendars");
        this.f21544a = z11;
        this.f21545b = phoneName;
        this.f21546c = z12;
        this.f21547d = z13;
        this.f21548e = uuid;
        this.f21549f = reason;
        this.f21550g = calendars;
    }

    public final boolean a() {
        return this.f21544a;
    }

    public final boolean b() {
        return this.f21547d;
    }

    public final List<Calendar> c() {
        return this.f21550g;
    }

    public final boolean d() {
        return this.f21546c;
    }

    public final String e() {
        return this.f21545b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarData) {
            CalendarData calendarData = (CalendarData) obj;
            return this.f21544a == calendarData.f21544a && s.c(this.f21545b, calendarData.f21545b) && this.f21546c == calendarData.f21546c && this.f21547d == calendarData.f21547d && s.c(this.f21548e, calendarData.f21548e) && s.c(this.f21549f, calendarData.f21549f) && s.c(this.f21550g, calendarData.f21550g);
        }
        return false;
    }

    public final String f() {
        return this.f21549f;
    }

    public final String g() {
        return this.f21548e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean] */
    public int hashCode() {
        boolean z11 = this.f21544a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int hashCode = ((r02 * 31) + this.f21545b.hashCode()) * 31;
        ?? r22 = this.f21546c;
        int i11 = r22;
        if (r22 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z12 = this.f21547d;
        return ((((((i12 + (z12 ? 1 : z12 ? 1 : 0)) * 31) + this.f21548e.hashCode()) * 31) + this.f21549f.hashCode()) * 31) + this.f21550g.hashCode();
    }

    public String toString() {
        boolean z11 = this.f21544a;
        String str = this.f21545b;
        boolean z12 = this.f21546c;
        boolean z13 = this.f21547d;
        String str2 = this.f21548e;
        String str3 = this.f21549f;
        List<Calendar> list = this.f21550g;
        return "CalendarData(accessDisabled=" + z11 + ", phoneName=" + str + ", notificationDisabled=" + z12 + ", backgroundDisabled=" + z13 + ", uuid=" + str2 + ", reason=" + str3 + ", calendars=" + list + ")";
    }
}