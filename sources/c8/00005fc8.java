package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/data/oapi/CalendarSyncParameters;", "", "", "reason", "", "enabled", "vehicleId", "<init>", "(Ljava/lang/String;ZLjava/lang/String;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class CalendarSyncParameters {
    @ir.b(name = "reason")

    /* renamed from: a  reason: collision with root package name */
    private final String f21561a;
    @ir.b(name = "sync_enabled")

    /* renamed from: b  reason: collision with root package name */
    private final boolean f21562b;
    @ir.b(name = "vehicle_id")

    /* renamed from: c  reason: collision with root package name */
    private final String f21563c;

    public CalendarSyncParameters(String reason, boolean z11, String vehicleId) {
        s.g(reason, "reason");
        s.g(vehicleId, "vehicleId");
        this.f21561a = reason;
        this.f21562b = z11;
        this.f21563c = vehicleId;
    }

    public final String a() {
        return this.f21561a;
    }

    public final boolean b() {
        return this.f21562b;
    }

    public final boolean c() {
        return this.f21562b;
    }

    public final String d() {
        return this.f21561a;
    }

    public final String e() {
        return this.f21563c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CalendarSyncParameters) {
            CalendarSyncParameters calendarSyncParameters = (CalendarSyncParameters) obj;
            return s.c(this.f21561a, calendarSyncParameters.f21561a) && this.f21562b == calendarSyncParameters.f21562b && s.c(this.f21563c, calendarSyncParameters.f21563c);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f21561a.hashCode() * 31;
        boolean z11 = this.f21562b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return ((hashCode + i11) * 31) + this.f21563c.hashCode();
    }

    public String toString() {
        String str = this.f21561a;
        boolean z11 = this.f21562b;
        String str2 = this.f21563c;
        return "CalendarSyncParameters(reason=" + str + ", enabled=" + z11 + ", vehicleId=" + str2 + ")";
    }
}