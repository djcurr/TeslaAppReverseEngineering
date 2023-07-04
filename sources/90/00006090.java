package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import com.stripe.android.networking.FraudDetectionData;
import com.tesla.domain.model.adapter.ForceToInt;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b6\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\bM\u0010NJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000b\u0010\bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\f\u0010\bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\r\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0004J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\bJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\bJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\bJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\bJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\bJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJô\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u001e\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010 \u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010!\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010\"\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010#\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010'\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010(\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010)\u001a\u0004\u0018\u00010\u00062\n\b\u0003\u0010*\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u000e2\n\b\u0003\u0010,\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b/\u00100J\t\u00101\u001a\u00020\u000eHÖ\u0001J\t\u00102\u001a\u00020\u0006HÖ\u0001J\u0013\u00104\u001a\u00020\u00022\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u00105\u001a\u0004\b6\u0010\u0004R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b7\u0010\u0004R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u00108\u001a\u0004\b9\u0010\bR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\b:\u0010\bR\u001e\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u00108\u001a\u0004\b;\u0010\bR\u001e\u0010!\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u00108\u001a\u0004\b<\u0010\bR\u001e\u0010\"\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u00108\u001a\u0004\b=\u0010\bR\u001e\u0010#\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u00108\u001a\u0004\b>\u0010\bR\u001e\u0010$\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010?\u001a\u0004\b@\u0010AR\u001e\u0010%\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u00105\u001a\u0004\bB\u0010\u0004R\u001e\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\bC\u0010\u0004R\u001e\u0010'\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u00108\u001a\u0004\bD\u0010\bR\u001e\u0010(\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u00108\u001a\u0004\bE\u0010\bR\u001e\u0010)\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u00108\u001a\u0004\bF\u0010\bR\u001e\u0010*\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u00108\u001a\u0004\bG\u0010\bR\u001e\u0010+\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010?\u001a\u0004\bH\u0010AR\u001e\u0010,\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u00108\u001a\u0004\bI\u0010\bR\u001e\u0010-\u001a\u0004\u0018\u00010\u00068\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u00108\u001a\u0004\bJ\u0010\bR\u001e\u0010.\u001a\u0004\u0018\u00010\u00198\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010K\u001a\u0004\bL\u0010\u001b¨\u0006O"}, d2 = {"Lcom/tesla/domain/model/VehicleState;", "", "", "component1", "()Ljava/lang/Boolean;", "component2", "", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "", "component19", "()Ljava/lang/Long;", "locked", "sentryMode", "frunk", "trunk", "frontDriverDoor", "frontPassengerDoor", "rearDriverDoor", "rearPassengerDoor", "carVersion", "remoteStarted", "remoteStartSupported", "frontDriverWindow", "frontPassengerWindow", "rearDriverWindow", "rearPassengerWindow", "sunRoofState", "sunRoofPercentOpen", "apiVersion", FraudDetectionData.KEY_TIMESTAMP, "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/tesla/domain/model/VehicleState;", "toString", "hashCode", "other", "equals", "Ljava/lang/Boolean;", "getLocked", "getSentryMode", "Ljava/lang/Integer;", "getFrunk", "getTrunk", "getFrontDriverDoor", "getFrontPassengerDoor", "getRearDriverDoor", "getRearPassengerDoor", "Ljava/lang/String;", "getCarVersion", "()Ljava/lang/String;", "getRemoteStarted", "getRemoteStartSupported", "getFrontDriverWindow", "getFrontPassengerWindow", "getRearDriverWindow", "getRearPassengerWindow", "getSunRoofState", "getSunRoofPercentOpen", "getApiVersion", "Ljava/lang/Long;", "getTimestamp", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class VehicleState {
    @b(name = "api_version")
    private final Integer apiVersion;
    @b(name = "car_version")
    private final String carVersion;
    @b(name = "df")
    private final Integer frontDriverDoor;
    @b(name = "fd_window")
    private final Integer frontDriverWindow;
    @b(name = "pf")
    private final Integer frontPassengerDoor;
    @b(name = "fp_window")
    private final Integer frontPassengerWindow;
    @b(name = "ft")
    private final Integer frunk;
    @b(name = "locked")
    private final Boolean locked;
    @b(name = "dr")
    private final Integer rearDriverDoor;
    @b(name = "rd_window")
    private final Integer rearDriverWindow;
    @b(name = "pr")
    private final Integer rearPassengerDoor;
    @b(name = "rp_window")
    private final Integer rearPassengerWindow;
    @b(name = "remote_start_supported")
    private final Boolean remoteStartSupported;
    @b(name = "remote_start")
    private final Boolean remoteStarted;
    @b(name = "sentry_mode")
    private final Boolean sentryMode;
    @b(name = "sun_roof_percent_open")
    private final Integer sunRoofPercentOpen;
    @b(name = "sun_roof_state")
    private final String sunRoofState;
    @b(name = FraudDetectionData.KEY_TIMESTAMP)
    private final Long timestamp;
    @b(name = "rt")
    private final Integer trunk;

    public VehicleState(Boolean bool, Boolean bool2, @ForceToInt Integer num, @ForceToInt Integer num2, @ForceToInt Integer num3, @ForceToInt Integer num4, @ForceToInt Integer num5, @ForceToInt Integer num6, String str, Boolean bool3, Boolean bool4, @ForceToInt Integer num7, @ForceToInt Integer num8, @ForceToInt Integer num9, @ForceToInt Integer num10, String str2, @ForceToInt Integer num11, Integer num12, Long l11) {
        this.locked = bool;
        this.sentryMode = bool2;
        this.frunk = num;
        this.trunk = num2;
        this.frontDriverDoor = num3;
        this.frontPassengerDoor = num4;
        this.rearDriverDoor = num5;
        this.rearPassengerDoor = num6;
        this.carVersion = str;
        this.remoteStarted = bool3;
        this.remoteStartSupported = bool4;
        this.frontDriverWindow = num7;
        this.frontPassengerWindow = num8;
        this.rearDriverWindow = num9;
        this.rearPassengerWindow = num10;
        this.sunRoofState = str2;
        this.sunRoofPercentOpen = num11;
        this.apiVersion = num12;
        this.timestamp = l11;
    }

    public final Boolean component1() {
        return this.locked;
    }

    public final Boolean component10() {
        return this.remoteStarted;
    }

    public final Boolean component11() {
        return this.remoteStartSupported;
    }

    public final Integer component12() {
        return this.frontDriverWindow;
    }

    public final Integer component13() {
        return this.frontPassengerWindow;
    }

    public final Integer component14() {
        return this.rearDriverWindow;
    }

    public final Integer component15() {
        return this.rearPassengerWindow;
    }

    public final String component16() {
        return this.sunRoofState;
    }

    public final Integer component17() {
        return this.sunRoofPercentOpen;
    }

    public final Integer component18() {
        return this.apiVersion;
    }

    public final Long component19() {
        return this.timestamp;
    }

    public final Boolean component2() {
        return this.sentryMode;
    }

    public final Integer component3() {
        return this.frunk;
    }

    public final Integer component4() {
        return this.trunk;
    }

    public final Integer component5() {
        return this.frontDriverDoor;
    }

    public final Integer component6() {
        return this.frontPassengerDoor;
    }

    public final Integer component7() {
        return this.rearDriverDoor;
    }

    public final Integer component8() {
        return this.rearPassengerDoor;
    }

    public final String component9() {
        return this.carVersion;
    }

    public final VehicleState copy(Boolean bool, Boolean bool2, @ForceToInt Integer num, @ForceToInt Integer num2, @ForceToInt Integer num3, @ForceToInt Integer num4, @ForceToInt Integer num5, @ForceToInt Integer num6, String str, Boolean bool3, Boolean bool4, @ForceToInt Integer num7, @ForceToInt Integer num8, @ForceToInt Integer num9, @ForceToInt Integer num10, String str2, @ForceToInt Integer num11, Integer num12, Long l11) {
        return new VehicleState(bool, bool2, num, num2, num3, num4, num5, num6, str, bool3, bool4, num7, num8, num9, num10, str2, num11, num12, l11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VehicleState) {
            VehicleState vehicleState = (VehicleState) obj;
            return s.c(this.locked, vehicleState.locked) && s.c(this.sentryMode, vehicleState.sentryMode) && s.c(this.frunk, vehicleState.frunk) && s.c(this.trunk, vehicleState.trunk) && s.c(this.frontDriverDoor, vehicleState.frontDriverDoor) && s.c(this.frontPassengerDoor, vehicleState.frontPassengerDoor) && s.c(this.rearDriverDoor, vehicleState.rearDriverDoor) && s.c(this.rearPassengerDoor, vehicleState.rearPassengerDoor) && s.c(this.carVersion, vehicleState.carVersion) && s.c(this.remoteStarted, vehicleState.remoteStarted) && s.c(this.remoteStartSupported, vehicleState.remoteStartSupported) && s.c(this.frontDriverWindow, vehicleState.frontDriverWindow) && s.c(this.frontPassengerWindow, vehicleState.frontPassengerWindow) && s.c(this.rearDriverWindow, vehicleState.rearDriverWindow) && s.c(this.rearPassengerWindow, vehicleState.rearPassengerWindow) && s.c(this.sunRoofState, vehicleState.sunRoofState) && s.c(this.sunRoofPercentOpen, vehicleState.sunRoofPercentOpen) && s.c(this.apiVersion, vehicleState.apiVersion) && s.c(this.timestamp, vehicleState.timestamp);
        }
        return false;
    }

    public final Integer getApiVersion() {
        return this.apiVersion;
    }

    public final String getCarVersion() {
        return this.carVersion;
    }

    public final Integer getFrontDriverDoor() {
        return this.frontDriverDoor;
    }

    public final Integer getFrontDriverWindow() {
        return this.frontDriverWindow;
    }

    public final Integer getFrontPassengerDoor() {
        return this.frontPassengerDoor;
    }

    public final Integer getFrontPassengerWindow() {
        return this.frontPassengerWindow;
    }

    public final Integer getFrunk() {
        return this.frunk;
    }

    public final Boolean getLocked() {
        return this.locked;
    }

    public final Integer getRearDriverDoor() {
        return this.rearDriverDoor;
    }

    public final Integer getRearDriverWindow() {
        return this.rearDriverWindow;
    }

    public final Integer getRearPassengerDoor() {
        return this.rearPassengerDoor;
    }

    public final Integer getRearPassengerWindow() {
        return this.rearPassengerWindow;
    }

    public final Boolean getRemoteStartSupported() {
        return this.remoteStartSupported;
    }

    public final Boolean getRemoteStarted() {
        return this.remoteStarted;
    }

    public final Boolean getSentryMode() {
        return this.sentryMode;
    }

    public final Integer getSunRoofPercentOpen() {
        return this.sunRoofPercentOpen;
    }

    public final String getSunRoofState() {
        return this.sunRoofState;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final Integer getTrunk() {
        return this.trunk;
    }

    public int hashCode() {
        Boolean bool = this.locked;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.sentryMode;
        int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.frunk;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.trunk;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.frontDriverDoor;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.frontPassengerDoor;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.rearDriverDoor;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.rearPassengerDoor;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str = this.carVersion;
        int hashCode9 = (hashCode8 + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool3 = this.remoteStarted;
        int hashCode10 = (hashCode9 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.remoteStartSupported;
        int hashCode11 = (hashCode10 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Integer num7 = this.frontDriverWindow;
        int hashCode12 = (hashCode11 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.frontPassengerWindow;
        int hashCode13 = (hashCode12 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.rearDriverWindow;
        int hashCode14 = (hashCode13 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.rearPassengerWindow;
        int hashCode15 = (hashCode14 + (num10 == null ? 0 : num10.hashCode())) * 31;
        String str2 = this.sunRoofState;
        int hashCode16 = (hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num11 = this.sunRoofPercentOpen;
        int hashCode17 = (hashCode16 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.apiVersion;
        int hashCode18 = (hashCode17 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Long l11 = this.timestamp;
        return hashCode18 + (l11 != null ? l11.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.locked;
        Boolean bool2 = this.sentryMode;
        Integer num = this.frunk;
        Integer num2 = this.trunk;
        Integer num3 = this.frontDriverDoor;
        Integer num4 = this.frontPassengerDoor;
        Integer num5 = this.rearDriverDoor;
        Integer num6 = this.rearPassengerDoor;
        String str = this.carVersion;
        Boolean bool3 = this.remoteStarted;
        Boolean bool4 = this.remoteStartSupported;
        Integer num7 = this.frontDriverWindow;
        Integer num8 = this.frontPassengerWindow;
        Integer num9 = this.rearDriverWindow;
        Integer num10 = this.rearPassengerWindow;
        String str2 = this.sunRoofState;
        Integer num11 = this.sunRoofPercentOpen;
        Integer num12 = this.apiVersion;
        Long l11 = this.timestamp;
        return "VehicleState(locked=" + bool + ", sentryMode=" + bool2 + ", frunk=" + num + ", trunk=" + num2 + ", frontDriverDoor=" + num3 + ", frontPassengerDoor=" + num4 + ", rearDriverDoor=" + num5 + ", rearPassengerDoor=" + num6 + ", carVersion=" + str + ", remoteStarted=" + bool3 + ", remoteStartSupported=" + bool4 + ", frontDriverWindow=" + num7 + ", frontPassengerWindow=" + num8 + ", rearDriverWindow=" + num9 + ", rearPassengerWindow=" + num10 + ", sunRoofState=" + str2 + ", sunRoofPercentOpen=" + num11 + ", apiVersion=" + num12 + ", timestamp=" + l11 + ")";
    }

    public /* synthetic */ VehicleState(Boolean bool, Boolean bool2, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, Boolean bool3, Boolean bool4, Integer num7, Integer num8, Integer num9, Integer num10, String str2, Integer num11, Integer num12, Long l11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(bool, bool2, num, num2, (i11 & 16) != 0 ? null : num3, (i11 & 32) != 0 ? null : num4, (i11 & 64) != 0 ? null : num5, (i11 & 128) != 0 ? null : num6, (i11 & 256) != 0 ? null : str, (i11 & 512) != 0 ? null : bool3, (i11 & 1024) != 0 ? null : bool4, (i11 & 2048) != 0 ? null : num7, (i11 & 4096) != 0 ? null : num8, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : num9, (i11 & 16384) != 0 ? null : num10, (32768 & i11) != 0 ? null : str2, (65536 & i11) != 0 ? null : num11, (131072 & i11) != 0 ? null : num12, (i11 & 262144) != 0 ? null : l11);
    }
}