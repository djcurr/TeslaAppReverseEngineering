package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b,\u0010-J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\f\u0010\tJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003Jp\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u0002HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b \u0010!R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010\u0006R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010$\u001a\u0004\b%\u0010\tR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010$\u001a\u0004\b&\u0010\tR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010$\u001a\u0004\b'\u0010\tR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010$\u001a\u0004\b(\u0010\tR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010\u000fR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b+\u0010!¨\u0006."}, d2 = {"Lcom/tesla/domain/model/ChargeState;", "", "", "component1", "", "component2", "()Ljava/lang/Integer;", "", "component3", "()Ljava/lang/Double;", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Boolean;", "component8", "chargingState", "batteryLevel", "timeToFullCharge", "usableBatteryLevel", "idealBatteryRange", "batteryRange", "chargePortDoorOpen", "chargePortLatch", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/tesla/domain/model/ChargeState;", "toString", "hashCode", "other", "equals", "Ljava/lang/String;", "getChargingState", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getBatteryLevel", "Ljava/lang/Double;", "getTimeToFullCharge", "getUsableBatteryLevel", "getIdealBatteryRange", "getBatteryRange", "Ljava/lang/Boolean;", "getChargePortDoorOpen", "getChargePortLatch", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ChargeState {
    @b(name = "battery_level")
    private final Integer batteryLevel;
    @b(name = "battery_range")
    private final Double batteryRange;
    @b(name = "charge_port_door_open")
    private final Boolean chargePortDoorOpen;
    @b(name = "charge_port_latch")
    private final String chargePortLatch;
    @b(name = "charging_state")
    private final String chargingState;
    @b(name = "ideal_battery_range")
    private final Double idealBatteryRange;
    @b(name = "time_to_full_charge")
    private final Double timeToFullCharge;
    @b(name = "usable_battery_level")
    private final Double usableBatteryLevel;

    public ChargeState(String str, Integer num, Double d11, Double d12, Double d13, Double d14, Boolean bool, String str2) {
        this.chargingState = str;
        this.batteryLevel = num;
        this.timeToFullCharge = d11;
        this.usableBatteryLevel = d12;
        this.idealBatteryRange = d13;
        this.batteryRange = d14;
        this.chargePortDoorOpen = bool;
        this.chargePortLatch = str2;
    }

    public final String component1() {
        return this.chargingState;
    }

    public final Integer component2() {
        return this.batteryLevel;
    }

    public final Double component3() {
        return this.timeToFullCharge;
    }

    public final Double component4() {
        return this.usableBatteryLevel;
    }

    public final Double component5() {
        return this.idealBatteryRange;
    }

    public final Double component6() {
        return this.batteryRange;
    }

    public final Boolean component7() {
        return this.chargePortDoorOpen;
    }

    public final String component8() {
        return this.chargePortLatch;
    }

    public final ChargeState copy(String str, Integer num, Double d11, Double d12, Double d13, Double d14, Boolean bool, String str2) {
        return new ChargeState(str, num, d11, d12, d13, d14, bool, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChargeState) {
            ChargeState chargeState = (ChargeState) obj;
            return s.c(this.chargingState, chargeState.chargingState) && s.c(this.batteryLevel, chargeState.batteryLevel) && s.c(this.timeToFullCharge, chargeState.timeToFullCharge) && s.c(this.usableBatteryLevel, chargeState.usableBatteryLevel) && s.c(this.idealBatteryRange, chargeState.idealBatteryRange) && s.c(this.batteryRange, chargeState.batteryRange) && s.c(this.chargePortDoorOpen, chargeState.chargePortDoorOpen) && s.c(this.chargePortLatch, chargeState.chargePortLatch);
        }
        return false;
    }

    public final Integer getBatteryLevel() {
        return this.batteryLevel;
    }

    public final Double getBatteryRange() {
        return this.batteryRange;
    }

    public final Boolean getChargePortDoorOpen() {
        return this.chargePortDoorOpen;
    }

    public final String getChargePortLatch() {
        return this.chargePortLatch;
    }

    public final String getChargingState() {
        return this.chargingState;
    }

    public final Double getIdealBatteryRange() {
        return this.idealBatteryRange;
    }

    public final Double getTimeToFullCharge() {
        return this.timeToFullCharge;
    }

    public final Double getUsableBatteryLevel() {
        return this.usableBatteryLevel;
    }

    public int hashCode() {
        String str = this.chargingState;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.batteryLevel;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d11 = this.timeToFullCharge;
        int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.usableBatteryLevel;
        int hashCode4 = (hashCode3 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.idealBatteryRange;
        int hashCode5 = (hashCode4 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.batteryRange;
        int hashCode6 = (hashCode5 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Boolean bool = this.chargePortDoorOpen;
        int hashCode7 = (hashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.chargePortLatch;
        return hashCode7 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.chargingState;
        Integer num = this.batteryLevel;
        Double d11 = this.timeToFullCharge;
        Double d12 = this.usableBatteryLevel;
        Double d13 = this.idealBatteryRange;
        Double d14 = this.batteryRange;
        Boolean bool = this.chargePortDoorOpen;
        String str2 = this.chargePortLatch;
        return "ChargeState(chargingState=" + str + ", batteryLevel=" + num + ", timeToFullCharge=" + d11 + ", usableBatteryLevel=" + d12 + ", idealBatteryRange=" + d13 + ", batteryRange=" + d14 + ", chargePortDoorOpen=" + bool + ", chargePortLatch=" + str2 + ")";
    }
}