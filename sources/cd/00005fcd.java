package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/ChangeClimateTemperatureSettingBody;", "", "", "passengerTemperatureCelsius", "driverTemperatureCelsius", "<init>", "(FF)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ChangeClimateTemperatureSettingBody {
    @ir.b(name = "passenger_temp")

    /* renamed from: a  reason: collision with root package name */
    private final float f21575a;
    @ir.b(name = "driver_temp")

    /* renamed from: b  reason: collision with root package name */
    private final float f21576b;

    public ChangeClimateTemperatureSettingBody(float f11, float f12) {
        this.f21575a = f11;
        this.f21576b = f12;
    }

    public final float a() {
        return this.f21576b;
    }

    public final float b() {
        return this.f21575a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChangeClimateTemperatureSettingBody) {
            ChangeClimateTemperatureSettingBody changeClimateTemperatureSettingBody = (ChangeClimateTemperatureSettingBody) obj;
            return s.c(Float.valueOf(this.f21575a), Float.valueOf(changeClimateTemperatureSettingBody.f21575a)) && s.c(Float.valueOf(this.f21576b), Float.valueOf(changeClimateTemperatureSettingBody.f21576b));
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f21575a) * 31) + Float.hashCode(this.f21576b);
    }

    public String toString() {
        float f11 = this.f21575a;
        float f12 = this.f21576b;
        return "ChangeClimateTemperatureSettingBody(passengerTemperatureCelsius=" + f11 + ", driverTemperatureCelsius=" + f12 + ")";
    }
}