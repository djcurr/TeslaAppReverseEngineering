package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b-\u0010.J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\rHÆ\u0003J|\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u001b\u001a\u00020\rHÖ\u0001J\t\u0010\u001c\u001a\u00020\nHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\u0004R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010 \u001a\u0004\b\"\u0010\u0004R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010 \u001a\u0004\b#\u0010\u0004R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010 \u001a\u0004\b$\u0010\u0004R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b%\u0010\u0004R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b&\u0010\u0004R\u001e\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010'\u001a\u0004\b(\u0010\fR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010)\u001a\u0004\b*\u0010+R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\r8\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b,\u0010+¨\u0006/"}, d2 = {"Lcom/tesla/domain/model/DriveState;", "", "", "component1", "()Ljava/lang/Double;", "component2", "component3", "component4", "component5", "component6", "", "component7", "()Ljava/lang/Integer;", "", "component8", "component9", "correctedLatitude", "correctedLongitude", "latitude", "longitude", "nativeLatitude", "nativeLongitude", "nativeLocationSupported", "nativeType", "shiftState", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/tesla/domain/model/DriveState;", "toString", "hashCode", "other", "", "equals", "Ljava/lang/Double;", "getCorrectedLatitude", "getCorrectedLongitude", "getLatitude", "getLongitude", "getNativeLatitude", "getNativeLongitude", "Ljava/lang/Integer;", "getNativeLocationSupported", "Ljava/lang/String;", "getNativeType", "()Ljava/lang/String;", "getShiftState", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class DriveState {
    @b(name = "corrected_latitude")
    private final Double correctedLatitude;
    @b(name = "corrected_longitude")
    private final Double correctedLongitude;
    @b(name = "latitude")
    private final Double latitude;
    @b(name = "longitude")
    private final Double longitude;
    @b(name = "native_latitude")
    private final Double nativeLatitude;
    @b(name = "native_location_supported")
    private final Integer nativeLocationSupported;
    @b(name = "native_longitude")
    private final Double nativeLongitude;
    @b(name = "native_type")
    private final String nativeType;
    @b(name = "shift_state")
    private final String shiftState;

    public DriveState(Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Integer num, String str, String str2) {
        this.correctedLatitude = d11;
        this.correctedLongitude = d12;
        this.latitude = d13;
        this.longitude = d14;
        this.nativeLatitude = d15;
        this.nativeLongitude = d16;
        this.nativeLocationSupported = num;
        this.nativeType = str;
        this.shiftState = str2;
    }

    public final Double component1() {
        return this.correctedLatitude;
    }

    public final Double component2() {
        return this.correctedLongitude;
    }

    public final Double component3() {
        return this.latitude;
    }

    public final Double component4() {
        return this.longitude;
    }

    public final Double component5() {
        return this.nativeLatitude;
    }

    public final Double component6() {
        return this.nativeLongitude;
    }

    public final Integer component7() {
        return this.nativeLocationSupported;
    }

    public final String component8() {
        return this.nativeType;
    }

    public final String component9() {
        return this.shiftState;
    }

    public final DriveState copy(Double d11, Double d12, Double d13, Double d14, Double d15, Double d16, Integer num, String str, String str2) {
        return new DriveState(d11, d12, d13, d14, d15, d16, num, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DriveState) {
            DriveState driveState = (DriveState) obj;
            return s.c(this.correctedLatitude, driveState.correctedLatitude) && s.c(this.correctedLongitude, driveState.correctedLongitude) && s.c(this.latitude, driveState.latitude) && s.c(this.longitude, driveState.longitude) && s.c(this.nativeLatitude, driveState.nativeLatitude) && s.c(this.nativeLongitude, driveState.nativeLongitude) && s.c(this.nativeLocationSupported, driveState.nativeLocationSupported) && s.c(this.nativeType, driveState.nativeType) && s.c(this.shiftState, driveState.shiftState);
        }
        return false;
    }

    public final Double getCorrectedLatitude() {
        return this.correctedLatitude;
    }

    public final Double getCorrectedLongitude() {
        return this.correctedLongitude;
    }

    public final Double getLatitude() {
        return this.latitude;
    }

    public final Double getLongitude() {
        return this.longitude;
    }

    public final Double getNativeLatitude() {
        return this.nativeLatitude;
    }

    public final Integer getNativeLocationSupported() {
        return this.nativeLocationSupported;
    }

    public final Double getNativeLongitude() {
        return this.nativeLongitude;
    }

    public final String getNativeType() {
        return this.nativeType;
    }

    public final String getShiftState() {
        return this.shiftState;
    }

    public int hashCode() {
        Double d11 = this.correctedLatitude;
        int hashCode = (d11 == null ? 0 : d11.hashCode()) * 31;
        Double d12 = this.correctedLongitude;
        int hashCode2 = (hashCode + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.latitude;
        int hashCode3 = (hashCode2 + (d13 == null ? 0 : d13.hashCode())) * 31;
        Double d14 = this.longitude;
        int hashCode4 = (hashCode3 + (d14 == null ? 0 : d14.hashCode())) * 31;
        Double d15 = this.nativeLatitude;
        int hashCode5 = (hashCode4 + (d15 == null ? 0 : d15.hashCode())) * 31;
        Double d16 = this.nativeLongitude;
        int hashCode6 = (hashCode5 + (d16 == null ? 0 : d16.hashCode())) * 31;
        Integer num = this.nativeLocationSupported;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.nativeType;
        int hashCode8 = (hashCode7 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.shiftState;
        return hashCode8 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Double d11 = this.correctedLatitude;
        Double d12 = this.correctedLongitude;
        Double d13 = this.latitude;
        Double d14 = this.longitude;
        Double d15 = this.nativeLatitude;
        Double d16 = this.nativeLongitude;
        Integer num = this.nativeLocationSupported;
        String str = this.nativeType;
        String str2 = this.shiftState;
        return "DriveState(correctedLatitude=" + d11 + ", correctedLongitude=" + d12 + ", latitude=" + d13 + ", longitude=" + d14 + ", nativeLatitude=" + d15 + ", nativeLongitude=" + d16 + ", nativeLocationSupported=" + num + ", nativeType=" + str + ", shiftState=" + str2 + ")";
    }
}