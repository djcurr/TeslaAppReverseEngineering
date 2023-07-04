package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tesla/data/oapi/StwHeatLevelBody;", "", "Lcom/tesla/data/oapi/StwHeatLevel;", "level", "<init>", "(Lcom/tesla/data/oapi/StwHeatLevel;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class StwHeatLevelBody {
    @ir.b(name = "level")

    /* renamed from: a  reason: collision with root package name */
    private final StwHeatLevel f21699a;

    public StwHeatLevelBody(StwHeatLevel level) {
        s.g(level, "level");
        this.f21699a = level;
    }

    public final StwHeatLevel a() {
        return this.f21699a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StwHeatLevelBody) && this.f21699a == ((StwHeatLevelBody) obj).f21699a;
    }

    public int hashCode() {
        return this.f21699a.hashCode();
    }

    public String toString() {
        StwHeatLevel stwHeatLevel = this.f21699a;
        return "StwHeatLevelBody(level=" + stwHeatLevel + ")";
    }
}