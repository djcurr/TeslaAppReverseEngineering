package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/data/oapi/UpdateChargeOnSolarFeatureRequestBody;", "", "", "enabled", "", "lowerChargeLimit", "upperChargeLimit", "<init>", "(ZFF)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class UpdateChargeOnSolarFeatureRequestBody {
    @ir.b(name = "enabled")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21711a;
    @ir.b(name = "lower_charge_limit")

    /* renamed from: b  reason: collision with root package name */
    private final float f21712b;
    @ir.b(name = "upper_charge_limit")

    /* renamed from: c  reason: collision with root package name */
    private final float f21713c;

    public UpdateChargeOnSolarFeatureRequestBody(boolean z11, float f11, float f12) {
        this.f21711a = z11;
        this.f21712b = f11;
        this.f21713c = f12;
    }

    public final boolean a() {
        return this.f21711a;
    }

    public final float b() {
        return this.f21712b;
    }

    public final float c() {
        return this.f21713c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateChargeOnSolarFeatureRequestBody) {
            UpdateChargeOnSolarFeatureRequestBody updateChargeOnSolarFeatureRequestBody = (UpdateChargeOnSolarFeatureRequestBody) obj;
            return this.f21711a == updateChargeOnSolarFeatureRequestBody.f21711a && s.c(Float.valueOf(this.f21712b), Float.valueOf(updateChargeOnSolarFeatureRequestBody.f21712b)) && s.c(Float.valueOf(this.f21713c), Float.valueOf(updateChargeOnSolarFeatureRequestBody.f21713c));
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public int hashCode() {
        boolean z11 = this.f21711a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return (((r02 * 31) + Float.hashCode(this.f21712b)) * 31) + Float.hashCode(this.f21713c);
    }

    public String toString() {
        boolean z11 = this.f21711a;
        float f11 = this.f21712b;
        float f12 = this.f21713c;
        return "UpdateChargeOnSolarFeatureRequestBody(enabled=" + z11 + ", lowerChargeLimit=" + f11 + ", upperChargeLimit=" + f12 + ")";
    }
}