package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tesla/data/oapi/SpeedLimitSetLimitBody;", "", "", "limitMPH", "<init>", "(D)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SpeedLimitSetLimitBody {
    @ir.b(name = "limit_mph")

    /* renamed from: a  reason: collision with root package name */
    private final double f21695a;

    public SpeedLimitSetLimitBody(double d11) {
        this.f21695a = d11;
    }

    public final double a() {
        return this.f21695a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpeedLimitSetLimitBody) && s.c(Double.valueOf(this.f21695a), Double.valueOf(((SpeedLimitSetLimitBody) obj).f21695a));
    }

    public int hashCode() {
        return Double.hashCode(this.f21695a);
    }

    public String toString() {
        double d11 = this.f21695a;
        return "SpeedLimitSetLimitBody(limitMPH=" + d11 + ")";
    }
}