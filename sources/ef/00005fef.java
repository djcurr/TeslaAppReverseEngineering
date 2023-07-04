package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/data/oapi/RemoteSeatHeaterBody;", "", "Lcom/tesla/data/oapi/SeatHeater;", "heater", "Lcom/tesla/data/oapi/SeatHeaterLevel;", "level", "<init>", "(Lcom/tesla/data/oapi/SeatHeater;Lcom/tesla/data/oapi/SeatHeaterLevel;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RemoteSeatHeaterBody {
    @ir.b(name = "heater")

    /* renamed from: a  reason: collision with root package name */
    private final SeatHeater f21629a;
    @ir.b(name = "level")

    /* renamed from: b  reason: collision with root package name */
    private final SeatHeaterLevel f21630b;

    public RemoteSeatHeaterBody(SeatHeater heater, SeatHeaterLevel level) {
        s.g(heater, "heater");
        s.g(level, "level");
        this.f21629a = heater;
        this.f21630b = level;
    }

    public final SeatHeater a() {
        return this.f21629a;
    }

    public final SeatHeaterLevel b() {
        return this.f21630b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof RemoteSeatHeaterBody) {
            RemoteSeatHeaterBody remoteSeatHeaterBody = (RemoteSeatHeaterBody) obj;
            return this.f21629a == remoteSeatHeaterBody.f21629a && this.f21630b == remoteSeatHeaterBody.f21630b;
        }
        return false;
    }

    public int hashCode() {
        return (this.f21629a.hashCode() * 31) + this.f21630b.hashCode();
    }

    public String toString() {
        SeatHeater seatHeater = this.f21629a;
        SeatHeaterLevel seatHeaterLevel = this.f21630b;
        return "RemoteSeatHeaterBody(heater=" + seatHeater + ", level=" + seatHeaterLevel + ")";
    }
}