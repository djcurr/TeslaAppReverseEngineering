package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u000b\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003J-\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/tesla/domain/model/GuiSettings;", "", "", "component1", "component2", "component3", "chargeRateUnit", "rangeDisplay", "distanceUnit", "copy", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "getChargeRateUnit", "()Ljava/lang/String;", "getRangeDisplay", "getDistanceUnit", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class GuiSettings {
    @b(name = "gui_charge_rate_units")
    private final String chargeRateUnit;
    @b(name = "gui_distance_units")
    private final String distanceUnit;
    @b(name = "gui_range_display")
    private final String rangeDisplay;

    public GuiSettings(String str, String str2, String str3) {
        this.chargeRateUnit = str;
        this.rangeDisplay = str2;
        this.distanceUnit = str3;
    }

    public static /* synthetic */ GuiSettings copy$default(GuiSettings guiSettings, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = guiSettings.chargeRateUnit;
        }
        if ((i11 & 2) != 0) {
            str2 = guiSettings.rangeDisplay;
        }
        if ((i11 & 4) != 0) {
            str3 = guiSettings.distanceUnit;
        }
        return guiSettings.copy(str, str2, str3);
    }

    public final String component1() {
        return this.chargeRateUnit;
    }

    public final String component2() {
        return this.rangeDisplay;
    }

    public final String component3() {
        return this.distanceUnit;
    }

    public final GuiSettings copy(String str, String str2, String str3) {
        return new GuiSettings(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof GuiSettings) {
            GuiSettings guiSettings = (GuiSettings) obj;
            return s.c(this.chargeRateUnit, guiSettings.chargeRateUnit) && s.c(this.rangeDisplay, guiSettings.rangeDisplay) && s.c(this.distanceUnit, guiSettings.distanceUnit);
        }
        return false;
    }

    public final String getChargeRateUnit() {
        return this.chargeRateUnit;
    }

    public final String getDistanceUnit() {
        return this.distanceUnit;
    }

    public final String getRangeDisplay() {
        return this.rangeDisplay;
    }

    public int hashCode() {
        String str = this.chargeRateUnit;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rangeDisplay;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.distanceUnit;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.chargeRateUnit;
        String str2 = this.rangeDisplay;
        String str3 = this.distanceUnit;
        return "GuiSettings(chargeRateUnit=" + str + ", rangeDisplay=" + str2 + ", distanceUnit=" + str3 + ")";
    }
}