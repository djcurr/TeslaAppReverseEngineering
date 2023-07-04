package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/SendGPSToVehicleBody;", "", "", "latitude", "longitude", "<init>", "(DD)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SendGPSToVehicleBody {
    @ir.b(name = "lat")

    /* renamed from: a  reason: collision with root package name */
    private final double f21648a;
    @ir.b(name = "lon")

    /* renamed from: b  reason: collision with root package name */
    private final double f21649b;

    public SendGPSToVehicleBody(double d11, double d12) {
        this.f21648a = d11;
        this.f21649b = d12;
    }

    public final double a() {
        return this.f21648a;
    }

    public final double b() {
        return this.f21649b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SendGPSToVehicleBody) {
            SendGPSToVehicleBody sendGPSToVehicleBody = (SendGPSToVehicleBody) obj;
            return s.c(Double.valueOf(this.f21648a), Double.valueOf(sendGPSToVehicleBody.f21648a)) && s.c(Double.valueOf(this.f21649b), Double.valueOf(sendGPSToVehicleBody.f21649b));
        }
        return false;
    }

    public int hashCode() {
        return (Double.hashCode(this.f21648a) * 31) + Double.hashCode(this.f21649b);
    }

    public String toString() {
        double d11 = this.f21648a;
        double d12 = this.f21649b;
        return "SendGPSToVehicleBody(latitude=" + d11 + ", longitude=" + d12 + ")";
    }
}