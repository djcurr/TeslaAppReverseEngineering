package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tesla/data/oapi/MediaVolumeBody;", "", "", "volume", "<init>", "(F)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class MediaVolumeBody {
    @ir.b(name = "volume")

    /* renamed from: a  reason: collision with root package name */
    private final float f21618a;

    public MediaVolumeBody(float f11) {
        this.f21618a = f11;
    }

    public final float a() {
        return this.f21618a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MediaVolumeBody) && s.c(Float.valueOf(this.f21618a), Float.valueOf(((MediaVolumeBody) obj).f21618a));
    }

    public int hashCode() {
        return Float.hashCode(this.f21618a);
    }

    public String toString() {
        float f11 = this.f21618a;
        return "MediaVolumeBody(volume=" + f11 + ")";
    }
}