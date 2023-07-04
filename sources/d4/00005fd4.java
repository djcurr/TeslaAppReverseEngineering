package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/data/oapi/ClimateKeeperModeBody;", "", "Lcom/tesla/data/oapi/ClimateKeeperMode;", "climateKeeperMode", "", "manualOverride", "<init>", "(Lcom/tesla/data/oapi/ClimateKeeperMode;Z)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ClimateKeeperModeBody {
    @ir.b(name = "climate_keeper_mode")

    /* renamed from: a  reason: collision with root package name */
    private final ClimateKeeperMode f21585a;
    @ir.b(name = "manual_override")

    /* renamed from: b  reason: collision with root package name */
    private final boolean f21586b;

    public ClimateKeeperModeBody(ClimateKeeperMode climateKeeperMode, boolean z11) {
        s.g(climateKeeperMode, "climateKeeperMode");
        this.f21585a = climateKeeperMode;
        this.f21586b = z11;
    }

    public final ClimateKeeperMode a() {
        return this.f21585a;
    }

    public final boolean b() {
        return this.f21586b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ClimateKeeperModeBody) {
            ClimateKeeperModeBody climateKeeperModeBody = (ClimateKeeperModeBody) obj;
            return this.f21585a == climateKeeperModeBody.f21585a && this.f21586b == climateKeeperModeBody.f21586b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = this.f21585a.hashCode() * 31;
        boolean z11 = this.f21586b;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return hashCode + i11;
    }

    public String toString() {
        ClimateKeeperMode climateKeeperMode = this.f21585a;
        boolean z11 = this.f21586b;
        return "ClimateKeeperModeBody(climateKeeperMode=" + climateKeeperMode + ", manualOverride=" + z11 + ")";
    }
}