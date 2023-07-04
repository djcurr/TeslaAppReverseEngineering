package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u000e\u0010\u000b\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/tesla/data/oapi/SetScheduledDepartureBody;", "", "", "enable", "", "Lcom/tesla/data/oapi/MinutesFromMidnight;", "departureTime", "preconditioningEnabled", "preconditioningWeekdaysOnly", "offPeakChargingEnabled", "offPeakChargingWeekdaysOnly", "endOffPeakTime", "<init>", "(ZLjava/lang/Integer;ZZZZLjava/lang/Integer;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SetScheduledDepartureBody {
    @ir.b(name = "enable")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21664a;
    @ir.b(name = "departure_time")

    /* renamed from: b  reason: collision with root package name */
    private final Integer f21665b;
    @ir.b(name = "preconditioning_enabled")

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21666c;
    @ir.b(name = "preconditioning_weekdays_only")

    /* renamed from: d  reason: collision with root package name */
    private final boolean f21667d;
    @ir.b(name = "off_peak_charging_enabled")

    /* renamed from: e  reason: collision with root package name */
    private final boolean f21668e;
    @ir.b(name = "off_peak_charging_weekdays_only")

    /* renamed from: f  reason: collision with root package name */
    private final boolean f21669f;
    @ir.b(name = "end_off_peak_time")

    /* renamed from: g  reason: collision with root package name */
    private final Integer f21670g;

    public SetScheduledDepartureBody(boolean z11, Integer num, boolean z12, boolean z13, boolean z14, boolean z15, Integer num2) {
        this.f21664a = z11;
        this.f21665b = num;
        this.f21666c = z12;
        this.f21667d = z13;
        this.f21668e = z14;
        this.f21669f = z15;
        this.f21670g = num2;
    }

    public final Integer a() {
        return this.f21665b;
    }

    public final boolean b() {
        return this.f21664a;
    }

    public final Integer c() {
        return this.f21670g;
    }

    public final boolean d() {
        return this.f21668e;
    }

    public final boolean e() {
        return this.f21669f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetScheduledDepartureBody) {
            SetScheduledDepartureBody setScheduledDepartureBody = (SetScheduledDepartureBody) obj;
            return this.f21664a == setScheduledDepartureBody.f21664a && s.c(this.f21665b, setScheduledDepartureBody.f21665b) && this.f21666c == setScheduledDepartureBody.f21666c && this.f21667d == setScheduledDepartureBody.f21667d && this.f21668e == setScheduledDepartureBody.f21668e && this.f21669f == setScheduledDepartureBody.f21669f && s.c(this.f21670g, setScheduledDepartureBody.f21670g);
        }
        return false;
    }

    public final boolean f() {
        return this.f21666c;
    }

    public final boolean g() {
        return this.f21667d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v7, types: [boolean] */
    public int hashCode() {
        boolean z11 = this.f21664a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        Integer num = this.f21665b;
        int hashCode = (i11 + (num == null ? 0 : num.hashCode())) * 31;
        ?? r22 = this.f21666c;
        int i12 = r22;
        if (r22 != 0) {
            i12 = 1;
        }
        int i13 = (hashCode + i12) * 31;
        ?? r23 = this.f21667d;
        int i14 = r23;
        if (r23 != 0) {
            i14 = 1;
        }
        int i15 = (i13 + i14) * 31;
        ?? r24 = this.f21668e;
        int i16 = r24;
        if (r24 != 0) {
            i16 = 1;
        }
        int i17 = (i15 + i16) * 31;
        boolean z12 = this.f21669f;
        int i18 = (i17 + (z12 ? 1 : z12 ? 1 : 0)) * 31;
        Integer num2 = this.f21670g;
        return i18 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        boolean z11 = this.f21664a;
        Integer num = this.f21665b;
        boolean z12 = this.f21666c;
        boolean z13 = this.f21667d;
        boolean z14 = this.f21668e;
        boolean z15 = this.f21669f;
        Integer num2 = this.f21670g;
        return "SetScheduledDepartureBody(enable=" + z11 + ", departureTime=" + num + ", preconditioningEnabled=" + z12 + ", preconditioningWeekdaysOnly=" + z13 + ", offPeakChargingEnabled=" + z14 + ", offPeakChargingWeekdaysOnly=" + z15 + ", endOffPeakTime=" + num2 + ")";
    }
}