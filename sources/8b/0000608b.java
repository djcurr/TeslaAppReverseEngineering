package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import expo.modules.contacts.EXColumns;
import ir.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\b\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\"\u001a\u0004\u0018\u00010\f\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\bQ\u0010RJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ®\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b)\u0010*J\t\u0010+\u001a\u00020\u0002HÖ\u0001J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\u0013\u0010/\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003R\u001c\u0010\u001c\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00100\u001a\u0004\b1\u00102R\u001c\u0010\u001d\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\b3\u00102R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00104\u001a\u0004\b5\u0010\u0007R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00106\u001a\u0004\b7\u00108R\u001e\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u00100\u001a\u0004\b9\u00102R\u001e\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u00100\u001a\u0004\b:\u00102R\u001e\u0010\"\u001a\u0004\u0018\u00010\f8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010;\u001a\u0004\b<\u0010=R\u001e\u0010#\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010>\u001a\u0004\b?\u0010@R\u001e\u0010$\u001a\u0004\u0018\u00010\u00108\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010A\u001a\u0004\bB\u0010CR\u001e\u0010%\u001a\u0004\u0018\u00010\u00128\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010D\u001a\u0004\bE\u0010FR\u001e\u0010&\u001a\u0004\u0018\u00010\u00148\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010G\u001a\u0004\bH\u0010IR$\u0010'\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010J\u001a\u0004\bK\u0010LR\u001e\u0010(\u001a\u0004\u0018\u00010\u00198\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010M\u001a\u0004\b(\u0010\u001bR\u0013\u0010P\u001a\u00020\u00058F@\u0006¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006S"}, d2 = {"Lcom/tesla/domain/model/Vehicle;", "Lcom/tesla/domain/model/Product;", "", "component1", "component2", "", "component3", "()Ljava/lang/Integer;", "Lcom/tesla/domain/model/VehicleConfig;", "component4", "component5", "component6", "Lcom/tesla/domain/model/ChargeState;", "component7", "Lcom/tesla/domain/model/VehicleState;", "component8", "Lcom/tesla/domain/model/GuiSettings;", "component9", "Lcom/tesla/domain/model/DriveState;", "component10", "Lcom/tesla/domain/model/ClimateState;", "component11", "", "Lcom/tesla/domain/model/ReverseGeocodedObject;", "component12", "", "component13", "()Ljava/lang/Boolean;", "vin", "id", "apiVersion", "config", "snapshotConfigHash", "displayName", "chargeState", "vehicleState", "guiSettings", "driveState", "climateState", "reverseGeocodedObject", "isPreDelivery", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/tesla/domain/model/VehicleConfig;Ljava/lang/String;Ljava/lang/String;Lcom/tesla/domain/model/ChargeState;Lcom/tesla/domain/model/VehicleState;Lcom/tesla/domain/model/GuiSettings;Lcom/tesla/domain/model/DriveState;Lcom/tesla/domain/model/ClimateState;Ljava/util/List;Ljava/lang/Boolean;)Lcom/tesla/domain/model/Vehicle;", "toString", "hashCode", "", "other", "equals", "Ljava/lang/String;", "getVin", "()Ljava/lang/String;", "getId", "Ljava/lang/Integer;", "getApiVersion", "Lcom/tesla/domain/model/VehicleConfig;", "getConfig", "()Lcom/tesla/domain/model/VehicleConfig;", "getSnapshotConfigHash", "getDisplayName", "Lcom/tesla/domain/model/ChargeState;", "getChargeState", "()Lcom/tesla/domain/model/ChargeState;", "Lcom/tesla/domain/model/VehicleState;", "getVehicleState", "()Lcom/tesla/domain/model/VehicleState;", "Lcom/tesla/domain/model/GuiSettings;", "getGuiSettings", "()Lcom/tesla/domain/model/GuiSettings;", "Lcom/tesla/domain/model/DriveState;", "getDriveState", "()Lcom/tesla/domain/model/DriveState;", "Lcom/tesla/domain/model/ClimateState;", "getClimateState", "()Lcom/tesla/domain/model/ClimateState;", "Ljava/util/List;", "getReverseGeocodedObject", "()Ljava/util/List;", "Ljava/lang/Boolean;", "getVehicleApiVersion", "()I", "vehicleApiVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/tesla/domain/model/VehicleConfig;Ljava/lang/String;Ljava/lang/String;Lcom/tesla/domain/model/ChargeState;Lcom/tesla/domain/model/VehicleState;Lcom/tesla/domain/model/GuiSettings;Lcom/tesla/domain/model/DriveState;Lcom/tesla/domain/model/ClimateState;Ljava/util/List;Ljava/lang/Boolean;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class Vehicle extends Product {
    @b(name = "api_version")
    private final Integer apiVersion;
    @b(name = "charge_state")
    private final ChargeState chargeState;
    @b(name = "climate_state")
    private final ClimateState climateState;
    @b(name = "vehicle_config")
    private final VehicleConfig config;
    @b(name = EXColumns.DISPLAY_NAME)
    private final String displayName;
    @b(name = "drive_state")
    private final DriveState driveState;
    @b(name = "gui_settings")
    private final GuiSettings guiSettings;
    @b(name = "id")

    /* renamed from: id  reason: collision with root package name */
    private final String f21829id;
    @b(name = "is_predelivery")
    private final Boolean isPreDelivery;
    @b(name = "reverse_geocoded_object")
    private final List<ReverseGeocodedObject> reverseGeocodedObject;
    @b(name = "snapshotConfigHash")
    private final String snapshotConfigHash;
    @b(name = "vehicle_state")
    private final VehicleState vehicleState;
    @b(name = "vin")
    private final String vin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Vehicle(String vin, String id2, Integer num, VehicleConfig vehicleConfig, String str, String str2, ChargeState chargeState, VehicleState vehicleState, GuiSettings guiSettings, DriveState driveState, ClimateState climateState, List<ReverseGeocodedObject> list, Boolean bool) {
        super("VEHICLE", null);
        s.g(vin, "vin");
        s.g(id2, "id");
        this.vin = vin;
        this.f21829id = id2;
        this.apiVersion = num;
        this.config = vehicleConfig;
        this.snapshotConfigHash = str;
        this.displayName = str2;
        this.chargeState = chargeState;
        this.vehicleState = vehicleState;
        this.guiSettings = guiSettings;
        this.driveState = driveState;
        this.climateState = climateState;
        this.reverseGeocodedObject = list;
        this.isPreDelivery = bool;
    }

    public final String component1() {
        return this.vin;
    }

    public final DriveState component10() {
        return this.driveState;
    }

    public final ClimateState component11() {
        return this.climateState;
    }

    public final List<ReverseGeocodedObject> component12() {
        return this.reverseGeocodedObject;
    }

    public final Boolean component13() {
        return this.isPreDelivery;
    }

    public final String component2() {
        return this.f21829id;
    }

    public final Integer component3() {
        return this.apiVersion;
    }

    public final VehicleConfig component4() {
        return this.config;
    }

    public final String component5() {
        return this.snapshotConfigHash;
    }

    public final String component6() {
        return this.displayName;
    }

    public final ChargeState component7() {
        return this.chargeState;
    }

    public final VehicleState component8() {
        return this.vehicleState;
    }

    public final GuiSettings component9() {
        return this.guiSettings;
    }

    public final Vehicle copy(String vin, String id2, Integer num, VehicleConfig vehicleConfig, String str, String str2, ChargeState chargeState, VehicleState vehicleState, GuiSettings guiSettings, DriveState driveState, ClimateState climateState, List<ReverseGeocodedObject> list, Boolean bool) {
        s.g(vin, "vin");
        s.g(id2, "id");
        return new Vehicle(vin, id2, num, vehicleConfig, str, str2, chargeState, vehicleState, guiSettings, driveState, climateState, list, bool);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Vehicle) {
            Vehicle vehicle = (Vehicle) obj;
            return s.c(this.vin, vehicle.vin) && s.c(this.f21829id, vehicle.f21829id) && s.c(this.apiVersion, vehicle.apiVersion) && s.c(this.config, vehicle.config) && s.c(this.snapshotConfigHash, vehicle.snapshotConfigHash) && s.c(this.displayName, vehicle.displayName) && s.c(this.chargeState, vehicle.chargeState) && s.c(this.vehicleState, vehicle.vehicleState) && s.c(this.guiSettings, vehicle.guiSettings) && s.c(this.driveState, vehicle.driveState) && s.c(this.climateState, vehicle.climateState) && s.c(this.reverseGeocodedObject, vehicle.reverseGeocodedObject) && s.c(this.isPreDelivery, vehicle.isPreDelivery);
        }
        return false;
    }

    public final Integer getApiVersion() {
        return this.apiVersion;
    }

    public final ChargeState getChargeState() {
        return this.chargeState;
    }

    public final ClimateState getClimateState() {
        return this.climateState;
    }

    public final VehicleConfig getConfig() {
        return this.config;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final DriveState getDriveState() {
        return this.driveState;
    }

    public final GuiSettings getGuiSettings() {
        return this.guiSettings;
    }

    public final String getId() {
        return this.f21829id;
    }

    public final List<ReverseGeocodedObject> getReverseGeocodedObject() {
        return this.reverseGeocodedObject;
    }

    public final String getSnapshotConfigHash() {
        return this.snapshotConfigHash;
    }

    public final int getVehicleApiVersion() {
        VehicleState vehicleState = this.vehicleState;
        Integer apiVersion = vehicleState == null ? null : vehicleState.getApiVersion();
        if (apiVersion == null && (apiVersion = this.apiVersion) == null) {
            return -1;
        }
        return apiVersion.intValue();
    }

    public final VehicleState getVehicleState() {
        return this.vehicleState;
    }

    public final String getVin() {
        return this.vin;
    }

    public int hashCode() {
        int hashCode = ((this.vin.hashCode() * 31) + this.f21829id.hashCode()) * 31;
        Integer num = this.apiVersion;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        VehicleConfig vehicleConfig = this.config;
        int hashCode3 = (hashCode2 + (vehicleConfig == null ? 0 : vehicleConfig.hashCode())) * 31;
        String str = this.snapshotConfigHash;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.displayName;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ChargeState chargeState = this.chargeState;
        int hashCode6 = (hashCode5 + (chargeState == null ? 0 : chargeState.hashCode())) * 31;
        VehicleState vehicleState = this.vehicleState;
        int hashCode7 = (hashCode6 + (vehicleState == null ? 0 : vehicleState.hashCode())) * 31;
        GuiSettings guiSettings = this.guiSettings;
        int hashCode8 = (hashCode7 + (guiSettings == null ? 0 : guiSettings.hashCode())) * 31;
        DriveState driveState = this.driveState;
        int hashCode9 = (hashCode8 + (driveState == null ? 0 : driveState.hashCode())) * 31;
        ClimateState climateState = this.climateState;
        int hashCode10 = (hashCode9 + (climateState == null ? 0 : climateState.hashCode())) * 31;
        List<ReverseGeocodedObject> list = this.reverseGeocodedObject;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.isPreDelivery;
        return hashCode11 + (bool != null ? bool.hashCode() : 0);
    }

    public final Boolean isPreDelivery() {
        return this.isPreDelivery;
    }

    public String toString() {
        String str = this.vin;
        String str2 = this.f21829id;
        Integer num = this.apiVersion;
        VehicleConfig vehicleConfig = this.config;
        String str3 = this.snapshotConfigHash;
        String str4 = this.displayName;
        ChargeState chargeState = this.chargeState;
        VehicleState vehicleState = this.vehicleState;
        GuiSettings guiSettings = this.guiSettings;
        DriveState driveState = this.driveState;
        ClimateState climateState = this.climateState;
        List<ReverseGeocodedObject> list = this.reverseGeocodedObject;
        Boolean bool = this.isPreDelivery;
        return "Vehicle(vin=" + str + ", id=" + str2 + ", apiVersion=" + num + ", config=" + vehicleConfig + ", snapshotConfigHash=" + str3 + ", displayName=" + str4 + ", chargeState=" + chargeState + ", vehicleState=" + vehicleState + ", guiSettings=" + guiSettings + ", driveState=" + driveState + ", climateState=" + climateState + ", reverseGeocodedObject=" + list + ", isPreDelivery=" + bool + ")";
    }
}