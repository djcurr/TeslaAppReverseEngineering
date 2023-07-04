package com.tesla.data.oapi;

import kotlin.Metadata;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/data/oapi/SetScheduledChargingBody;", "", "", "enable", "", "Lcom/tesla/data/oapi/MinutesFromMidnight;", "time", "<init>", "(ZI)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SetScheduledChargingBody {
    @ir.b(name = "enable")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21659a;
    @ir.b(name = "time")

    /* renamed from: b  reason: collision with root package name */
    private final int f21660b;

    public SetScheduledChargingBody(boolean z11, int i11) {
        this.f21659a = z11;
        this.f21660b = i11;
    }

    public final boolean a() {
        return this.f21659a;
    }

    public final int b() {
        return this.f21660b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SetScheduledChargingBody) {
            SetScheduledChargingBody setScheduledChargingBody = (SetScheduledChargingBody) obj;
            return this.f21659a == setScheduledChargingBody.f21659a && this.f21660b == setScheduledChargingBody.f21660b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f21659a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return (r02 * 31) + Integer.hashCode(this.f21660b);
    }

    public String toString() {
        boolean z11 = this.f21659a;
        int i11 = this.f21660b;
        return "SetScheduledChargingBody(enable=" + z11 + ", time=" + i11 + ")";
    }
}