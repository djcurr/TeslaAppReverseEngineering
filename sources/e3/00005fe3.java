package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/tesla/data/oapi/JsCalendarSyncParameters;", "", "", "enabled", "", "reason", "<init>", "(ZLjava/lang/String;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class JsCalendarSyncParameters {
    @ir.b(name = "enabled")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21608a;
    @ir.b(name = "reason")

    /* renamed from: b  reason: collision with root package name */
    private final String f21609b;

    public JsCalendarSyncParameters(boolean z11, String reason) {
        s.g(reason, "reason");
        this.f21608a = z11;
        this.f21609b = reason;
    }

    public final boolean a() {
        return this.f21608a;
    }

    public final String b() {
        return this.f21609b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JsCalendarSyncParameters) {
            JsCalendarSyncParameters jsCalendarSyncParameters = (JsCalendarSyncParameters) obj;
            return this.f21608a == jsCalendarSyncParameters.f21608a && s.c(this.f21609b, jsCalendarSyncParameters.f21609b);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z11 = this.f21608a;
        ?? r02 = z11;
        if (z11) {
            r02 = 1;
        }
        return (r02 * 31) + this.f21609b.hashCode();
    }

    public String toString() {
        boolean z11 = this.f21608a;
        String str = this.f21609b;
        return "JsCalendarSyncParameters(enabled=" + z11 + ", reason=" + str + ")";
    }
}