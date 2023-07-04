package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/tesla/data/oapi/WindowControlBody;", "", "", "latitude", "longitude", "Lcom/tesla/data/oapi/WindowControlCommand;", "command", "<init>", "(FFLcom/tesla/data/oapi/WindowControlCommand;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class WindowControlBody {
    @ir.b(name = "lat")

    /* renamed from: a  reason: collision with root package name */
    private final float f21717a;
    @ir.b(name = "long")

    /* renamed from: b  reason: collision with root package name */
    private final float f21718b;
    @ir.b(name = "command")

    /* renamed from: c  reason: collision with root package name */
    private final WindowControlCommand f21719c;

    public WindowControlBody(float f11, float f12, WindowControlCommand command) {
        s.g(command, "command");
        this.f21717a = f11;
        this.f21718b = f12;
        this.f21719c = command;
    }

    public final WindowControlCommand a() {
        return this.f21719c;
    }

    public final float b() {
        return this.f21717a;
    }

    public final float c() {
        return this.f21718b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowControlBody) {
            WindowControlBody windowControlBody = (WindowControlBody) obj;
            return s.c(Float.valueOf(this.f21717a), Float.valueOf(windowControlBody.f21717a)) && s.c(Float.valueOf(this.f21718b), Float.valueOf(windowControlBody.f21718b)) && this.f21719c == windowControlBody.f21719c;
        }
        return false;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f21717a) * 31) + Float.hashCode(this.f21718b)) * 31) + this.f21719c.hashCode();
    }

    public String toString() {
        float f11 = this.f21717a;
        float f12 = this.f21718b;
        WindowControlCommand windowControlCommand = this.f21719c;
        return "WindowControlBody(latitude=" + f11 + ", longitude=" + f12 + ", command=" + windowControlCommand + ")";
    }
}