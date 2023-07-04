package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/data/oapi/SeatCoolingBody;", "", "Lcom/tesla/data/oapi/SeatPosition;", "seatPosition", "Lcom/tesla/data/oapi/CoolingLevel;", "seatCoolerLevel", "<init>", "(Lcom/tesla/data/oapi/SeatPosition;Lcom/tesla/data/oapi/CoolingLevel;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SeatCoolingBody {
    @ir.b(name = "seat_position")

    /* renamed from: a  reason: collision with root package name */
    private final SeatPosition f21640a;
    @ir.b(name = "seat_cooler_level")

    /* renamed from: b  reason: collision with root package name */
    private final CoolingLevel f21641b;

    public SeatCoolingBody(SeatPosition seatPosition, CoolingLevel seatCoolerLevel) {
        s.g(seatPosition, "seatPosition");
        s.g(seatCoolerLevel, "seatCoolerLevel");
        this.f21640a = seatPosition;
        this.f21641b = seatCoolerLevel;
    }

    public final CoolingLevel a() {
        return this.f21641b;
    }

    public final SeatPosition b() {
        return this.f21640a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SeatCoolingBody) {
            SeatCoolingBody seatCoolingBody = (SeatCoolingBody) obj;
            return this.f21640a == seatCoolingBody.f21640a && this.f21641b == seatCoolingBody.f21641b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f21640a.hashCode() * 31) + this.f21641b.hashCode();
    }

    public String toString() {
        SeatPosition seatPosition = this.f21640a;
        CoolingLevel coolingLevel = this.f21641b;
        return "SeatCoolingBody(seatPosition=" + seatPosition + ", seatCoolerLevel=" + coolingLevel + ")";
    }
}