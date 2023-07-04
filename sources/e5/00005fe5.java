package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/data/oapi/MaxDefrostBody;", "", "", "on", "Lcom/tesla/data/oapi/OverrideMode;", "manualOverride", "<init>", "(ZLcom/tesla/data/oapi/OverrideMode;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class MaxDefrostBody {
    @ir.b(name = "on")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21613a;
    @ir.b(name = "manual_override")

    /* renamed from: b  reason: collision with root package name */
    private final OverrideMode f21614b;

    public MaxDefrostBody(boolean z11, OverrideMode manualOverride) {
        s.g(manualOverride, "manualOverride");
        this.f21613a = z11;
        this.f21614b = manualOverride;
    }

    public final OverrideMode a() {
        return this.f21614b;
    }

    public final boolean b() {
        return this.f21613a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MaxDefrostBody) {
            MaxDefrostBody maxDefrostBody = (MaxDefrostBody) obj;
            return this.f21613a == maxDefrostBody.f21613a && this.f21614b == maxDefrostBody.f21614b;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f21613a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return (r02 * 31) + this.f21614b.hashCode();
    }

    public String toString() {
        boolean z11 = this.f21613a;
        OverrideMode overrideMode = this.f21614b;
        return "MaxDefrostBody(on=" + z11 + ", manualOverride=" + overrideMode + ")";
    }
}