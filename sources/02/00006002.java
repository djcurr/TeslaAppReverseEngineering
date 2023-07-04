package com.tesla.data.oapi;

import kotlin.Metadata;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tesla/data/oapi/SetCopTempBody;", "", "", "copTemp", "<init>", "(I)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class SetCopTempBody {
    @ir.b(name = "cop_temp")

    /* renamed from: a  reason: collision with root package name */
    private final int f21656a;

    public SetCopTempBody(int i11) {
        this.f21656a = i11;
    }

    public final int a() {
        return this.f21656a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SetCopTempBody) && this.f21656a == ((SetCopTempBody) obj).f21656a;
    }

    public int hashCode() {
        return Integer.hashCode(this.f21656a);
    }

    public String toString() {
        int i11 = this.f21656a;
        return "SetCopTempBody(copTemp=" + i11 + ")";
    }
}