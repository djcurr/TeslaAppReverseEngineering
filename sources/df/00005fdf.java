package com.tesla.data.oapi;

import kotlin.Metadata;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tesla/data/oapi/FetchNearbyChargingBody;", "", "", "radius", "count", "", "includeMetadata", "detail", "<init>", "(IIZZ)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class FetchNearbyChargingBody {
    @ir.b(name = "radius")

    /* renamed from: a  reason: collision with root package name */
    private final int f21597a;
    @ir.b(name = "count")

    /* renamed from: b  reason: collision with root package name */
    private final int f21598b;
    @ir.b(name = "include_metadata")

    /* renamed from: c  reason: collision with root package name */
    private final boolean f21599c;
    @ir.b(name = "detail")

    /* renamed from: d  reason: collision with root package name */
    private final boolean f21600d;

    public FetchNearbyChargingBody(int i11, int i12, boolean z11, boolean z12) {
        this.f21597a = i11;
        this.f21598b = i12;
        this.f21599c = z11;
        this.f21600d = z12;
    }

    public final int a() {
        return this.f21598b;
    }

    public final boolean b() {
        return this.f21600d;
    }

    public final boolean c() {
        return this.f21599c;
    }

    public final int d() {
        return this.f21597a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FetchNearbyChargingBody) {
            FetchNearbyChargingBody fetchNearbyChargingBody = (FetchNearbyChargingBody) obj;
            return this.f21597a == fetchNearbyChargingBody.f21597a && this.f21598b == fetchNearbyChargingBody.f21598b && this.f21599c == fetchNearbyChargingBody.f21599c && this.f21600d == fetchNearbyChargingBody.f21600d;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.f21597a) * 31) + Integer.hashCode(this.f21598b)) * 31;
        boolean z11 = this.f21599c;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode + i11) * 31;
        boolean z12 = this.f21600d;
        return i12 + (z12 ? 1 : z12 ? 1 : 0);
    }

    public String toString() {
        int i11 = this.f21597a;
        int i12 = this.f21598b;
        boolean z11 = this.f21599c;
        boolean z12 = this.f21600d;
        return "FetchNearbyChargingBody(radius=" + i11 + ", count=" + i12 + ", includeMetadata=" + z11 + ", detail=" + z12 + ")";
    }
}