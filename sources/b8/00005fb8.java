package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/tesla/data/oapi/AddManagedChargingSiteBody;", "", "", "publicKey", "din", "", "latitude", "longitude", "<init>", "(Ljava/lang/String;Ljava/lang/String;FF)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class AddManagedChargingSiteBody {
    @ir.b(name = "public_key")

    /* renamed from: a  reason: collision with root package name */
    private final String f21514a;
    @ir.b(name = "din")

    /* renamed from: b  reason: collision with root package name */
    private final String f21515b;
    @ir.b(name = "lat")

    /* renamed from: c  reason: collision with root package name */
    private final float f21516c;
    @ir.b(name = "lon")

    /* renamed from: d  reason: collision with root package name */
    private final float f21517d;

    public AddManagedChargingSiteBody(String publicKey, String din, float f11, float f12) {
        s.g(publicKey, "publicKey");
        s.g(din, "din");
        this.f21514a = publicKey;
        this.f21515b = din;
        this.f21516c = f11;
        this.f21517d = f12;
    }

    public final String a() {
        return this.f21515b;
    }

    public final float b() {
        return this.f21516c;
    }

    public final float c() {
        return this.f21517d;
    }

    public final String d() {
        return this.f21514a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AddManagedChargingSiteBody) {
            AddManagedChargingSiteBody addManagedChargingSiteBody = (AddManagedChargingSiteBody) obj;
            return s.c(this.f21514a, addManagedChargingSiteBody.f21514a) && s.c(this.f21515b, addManagedChargingSiteBody.f21515b) && s.c(Float.valueOf(this.f21516c), Float.valueOf(addManagedChargingSiteBody.f21516c)) && s.c(Float.valueOf(this.f21517d), Float.valueOf(addManagedChargingSiteBody.f21517d));
        }
        return false;
    }

    public int hashCode() {
        return (((((this.f21514a.hashCode() * 31) + this.f21515b.hashCode()) * 31) + Float.hashCode(this.f21516c)) * 31) + Float.hashCode(this.f21517d);
    }

    public String toString() {
        String str = this.f21514a;
        String str2 = this.f21515b;
        float f11 = this.f21516c;
        float f12 = this.f21517d;
        return "AddManagedChargingSiteBody(publicKey=" + str + ", din=" + str2 + ", latitude=" + f11 + ", longitude=" + f12 + ")";
    }
}