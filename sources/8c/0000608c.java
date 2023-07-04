package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.stripe.android.networking.FraudDetectionData;
import com.tesla.domain.model.adapter.ForceToInt;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.k;
import vz.m;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b+\u0010,J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u0004JX\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u0004R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b!\u0010\tR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\"\u001a\u0004\b#\u0010\fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\"\u001a\u0004\b$\u0010\fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b%\u0010\u0004R\u001d\u0010*\u001a\u00020\n8F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lcom/tesla/domain/model/VehicleConfig;", "", "", "component1", "()Ljava/lang/Integer;", "", "component2", "", "component3", "()Ljava/lang/Long;", "", "component4", "()Ljava/lang/Boolean;", "component5", "component6", "keyVersion", "carType", FraudDetectionData.KEY_TIMESTAMP, "motorizedChargePort", "powerLiftGate", "sunRoofInstalled", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/tesla/domain/model/VehicleConfig;", "toString", "hashCode", "other", "equals", "Ljava/lang/Integer;", "getKeyVersion", "Ljava/lang/String;", "getCarType", "()Ljava/lang/String;", "Ljava/lang/Long;", "getTimestamp", "Ljava/lang/Boolean;", "getMotorizedChargePort", "getPowerLiftGate", "getSunRoofInstalled", "hasSunRoof$delegate", "Lvz/k;", "getHasSunRoof", "()Z", "hasSunRoof", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class VehicleConfig {
    @b(name = "car_type")
    private final String carType;
    private final k hasSunRoof$delegate;
    @b(name = "key_version")
    private final Integer keyVersion;
    @b(name = "motorized_charge_port")
    private final Boolean motorizedChargePort;
    @b(name = "plg")
    private final Boolean powerLiftGate;
    @b(name = "sun_roof_installed")
    private final Integer sunRoofInstalled;
    @b(name = FraudDetectionData.KEY_TIMESTAMP)
    private final Long timestamp;

    /* loaded from: classes6.dex */
    static final class a extends u implements h00.a<Boolean> {
        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // h00.a
        public final Boolean invoke() {
            Integer sunRoofInstalled = VehicleConfig.this.getSunRoofInstalled();
            return Boolean.valueOf((sunRoofInstalled == null ? 0 : sunRoofInstalled.intValue()) > 0);
        }
    }

    public VehicleConfig(Integer num, String str, Long l11, Boolean bool, Boolean bool2, @ForceToInt Integer num2) {
        k a11;
        this.keyVersion = num;
        this.carType = str;
        this.timestamp = l11;
        this.motorizedChargePort = bool;
        this.powerLiftGate = bool2;
        this.sunRoofInstalled = num2;
        a11 = m.a(new a());
        this.hasSunRoof$delegate = a11;
    }

    public static /* synthetic */ VehicleConfig copy$default(VehicleConfig vehicleConfig, Integer num, String str, Long l11, Boolean bool, Boolean bool2, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            num = vehicleConfig.keyVersion;
        }
        if ((i11 & 2) != 0) {
            str = vehicleConfig.carType;
        }
        String str2 = str;
        if ((i11 & 4) != 0) {
            l11 = vehicleConfig.timestamp;
        }
        Long l12 = l11;
        if ((i11 & 8) != 0) {
            bool = vehicleConfig.motorizedChargePort;
        }
        Boolean bool3 = bool;
        if ((i11 & 16) != 0) {
            bool2 = vehicleConfig.powerLiftGate;
        }
        Boolean bool4 = bool2;
        if ((i11 & 32) != 0) {
            num2 = vehicleConfig.sunRoofInstalled;
        }
        return vehicleConfig.copy(num, str2, l12, bool3, bool4, num2);
    }

    public final Integer component1() {
        return this.keyVersion;
    }

    public final String component2() {
        return this.carType;
    }

    public final Long component3() {
        return this.timestamp;
    }

    public final Boolean component4() {
        return this.motorizedChargePort;
    }

    public final Boolean component5() {
        return this.powerLiftGate;
    }

    public final Integer component6() {
        return this.sunRoofInstalled;
    }

    public final VehicleConfig copy(Integer num, String str, Long l11, Boolean bool, Boolean bool2, @ForceToInt Integer num2) {
        return new VehicleConfig(num, str, l11, bool, bool2, num2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehicleConfig) {
            VehicleConfig vehicleConfig = (VehicleConfig) obj;
            return s.c(this.keyVersion, vehicleConfig.keyVersion) && s.c(this.carType, vehicleConfig.carType) && s.c(this.timestamp, vehicleConfig.timestamp) && s.c(this.motorizedChargePort, vehicleConfig.motorizedChargePort) && s.c(this.powerLiftGate, vehicleConfig.powerLiftGate) && s.c(this.sunRoofInstalled, vehicleConfig.sunRoofInstalled);
        }
        return false;
    }

    public final String getCarType() {
        return this.carType;
    }

    public final boolean getHasSunRoof() {
        return ((Boolean) this.hasSunRoof$delegate.getValue()).booleanValue();
    }

    public final Integer getKeyVersion() {
        return this.keyVersion;
    }

    public final Boolean getMotorizedChargePort() {
        return this.motorizedChargePort;
    }

    public final Boolean getPowerLiftGate() {
        return this.powerLiftGate;
    }

    public final Integer getSunRoofInstalled() {
        return this.sunRoofInstalled;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        Integer num = this.keyVersion;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.carType;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l11 = this.timestamp;
        int hashCode3 = (hashCode2 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Boolean bool = this.motorizedChargePort;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.powerLiftGate;
        int hashCode5 = (hashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num2 = this.sunRoofInstalled;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        Integer num = this.keyVersion;
        String str = this.carType;
        Long l11 = this.timestamp;
        Boolean bool = this.motorizedChargePort;
        Boolean bool2 = this.powerLiftGate;
        Integer num2 = this.sunRoofInstalled;
        return "VehicleConfig(keyVersion=" + num + ", carType=" + str + ", timestamp=" + l11 + ", motorizedChargePort=" + bool + ", powerLiftGate=" + bool2 + ", sunRoofInstalled=" + num2 + ")";
    }

    public /* synthetic */ VehicleConfig(Integer num, String str, Long l11, Boolean bool, Boolean bool2, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : num, (i11 & 2) != 0 ? null : str, l11, bool, bool2, num2);
    }
}