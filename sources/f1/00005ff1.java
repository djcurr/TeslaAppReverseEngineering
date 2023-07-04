package com.tesla.data.oapi;

import kotlin.Metadata;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tesla/data/oapi/RemoteSteeringWheelHeaterBody;", "", "", "on", "<init>", "(Z)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RemoteSteeringWheelHeaterBody {
    @ir.b(name = "on")

    /* renamed from: a  reason: collision with root package name */
    private final boolean f21634a;

    public RemoteSteeringWheelHeaterBody(boolean z11) {
        this.f21634a = z11;
    }

    public final boolean a() {
        return this.f21634a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RemoteSteeringWheelHeaterBody) && this.f21634a == ((RemoteSteeringWheelHeaterBody) obj).f21634a;
    }

    public int hashCode() {
        boolean z11 = this.f21634a;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public String toString() {
        boolean z11 = this.f21634a;
        return "RemoteSteeringWheelHeaterBody(on=" + z11 + ")";
    }
}