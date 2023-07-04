package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tesla/data/oapi/TriggerHomelinkBody;", "", "", "latitude", "longitude", "<init>", "(FF)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class TriggerHomelinkBody {
    @ir.b(name = "lat")

    /* renamed from: a  reason: collision with root package name */
    private final float f21706a;
    @ir.b(name = "lon")

    /* renamed from: b  reason: collision with root package name */
    private final float f21707b;

    public TriggerHomelinkBody(float f11, float f12) {
        this.f21706a = f11;
        this.f21707b = f12;
    }

    public final float a() {
        return this.f21706a;
    }

    public final float b() {
        return this.f21707b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TriggerHomelinkBody) {
            TriggerHomelinkBody triggerHomelinkBody = (TriggerHomelinkBody) obj;
            return s.c(Float.valueOf(this.f21706a), Float.valueOf(triggerHomelinkBody.f21706a)) && s.c(Float.valueOf(this.f21707b), Float.valueOf(triggerHomelinkBody.f21707b));
        }
        return false;
    }

    public int hashCode() {
        return (Float.hashCode(this.f21706a) * 31) + Float.hashCode(this.f21707b);
    }

    public String toString() {
        float f11 = this.f21706a;
        float f12 = this.f21707b;
        return "TriggerHomelinkBody(latitude=" + f11 + ", longitude=" + f12 + ")";
    }
}