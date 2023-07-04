package com.tesla.data.oapi;

import kotlin.Metadata;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tesla/data/oapi/ClimateOnBody;", "", "Lcom/tesla/data/oapi/ClimateOverrideMode;", "manualOverride", "<init>", "(Lcom/tesla/data/oapi/ClimateOverrideMode;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ClimateOnBody {
    @ir.b(name = "manual_override")

    /* renamed from: a  reason: collision with root package name */
    private final ClimateOverrideMode f21591a;

    public ClimateOnBody(ClimateOverrideMode climateOverrideMode) {
        this.f21591a = climateOverrideMode;
    }

    public final ClimateOverrideMode a() {
        return this.f21591a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ClimateOnBody) && this.f21591a == ((ClimateOnBody) obj).f21591a;
    }

    public int hashCode() {
        ClimateOverrideMode climateOverrideMode = this.f21591a;
        if (climateOverrideMode == null) {
            return 0;
        }
        return climateOverrideMode.hashCode();
    }

    public String toString() {
        ClimateOverrideMode climateOverrideMode = this.f21591a;
        return "ClimateOnBody(manualOverride=" + climateOverrideMode + ")";
    }
}