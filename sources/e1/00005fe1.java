package com.tesla.data.oapi;

import kotlin.Metadata;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/HVACBioweaponModeBody;", "", "", "on", "manualOverride", "<init>", "(ZZ)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class HVACBioweaponModeBody {
    @ir.b(name = "on")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21604a;
    @ir.b(name = "manual_override")

    /* renamed from: b  reason: collision with root package name */
    private final boolean f21605b;

    public HVACBioweaponModeBody(boolean z11, boolean z12) {
        this.f21604a = z11;
        this.f21605b = z12;
    }

    public final boolean a() {
        return this.f21605b;
    }

    public final boolean b() {
        return this.f21604a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HVACBioweaponModeBody) {
            HVACBioweaponModeBody hVACBioweaponModeBody = (HVACBioweaponModeBody) obj;
            return this.f21604a == hVACBioweaponModeBody.f21604a && this.f21605b == hVACBioweaponModeBody.f21605b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f21604a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        int i11 = r02 * 31;
        boolean z12 = this.f21605b;
        return i11 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        boolean z11 = this.f21604a;
        boolean z12 = this.f21605b;
        return "HVACBioweaponModeBody(on=" + z11 + ", manualOverride=" + z12 + ")";
    }
}