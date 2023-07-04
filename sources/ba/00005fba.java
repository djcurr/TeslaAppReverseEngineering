package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/data/oapi/AutoSeatClimateBody;", "", "Lcom/tesla/data/oapi/SeatPosition;", "autoSeatPosition", "", "autoClimateOn", "<init>", "(Lcom/tesla/data/oapi/SeatPosition;Z)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class AutoSeatClimateBody {
    @ir.b(name = "auto_seat_position")

    /* renamed from: a  reason: collision with root package name */
    private final SeatPosition f21521a;
    @ir.b(name = "auto_climate_on")

    /* renamed from: b  reason: collision with root package name */
    private final boolean f21522b;

    public AutoSeatClimateBody(SeatPosition autoSeatPosition, boolean z11) {
        s.g(autoSeatPosition, "autoSeatPosition");
        this.f21521a = autoSeatPosition;
        this.f21522b = z11;
    }

    public final boolean a() {
        return this.f21522b;
    }

    public final SeatPosition b() {
        return this.f21521a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AutoSeatClimateBody) {
            AutoSeatClimateBody autoSeatClimateBody = (AutoSeatClimateBody) obj;
            return this.f21521a == autoSeatClimateBody.f21521a && this.f21522b == autoSeatClimateBody.f21522b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f21521a.hashCode() * 31;
        boolean z11 = this.f21522b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public String toString() {
        SeatPosition seatPosition = this.f21521a;
        boolean z11 = this.f21522b;
        return "AutoSeatClimateBody(autoSeatPosition=" + seatPosition + ", autoClimateOn=" + z11 + ")";
    }
}