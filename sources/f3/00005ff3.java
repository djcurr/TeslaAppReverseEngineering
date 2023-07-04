package com.tesla.data.oapi;

import kotlin.Metadata;
import kotlin.jvm.internal.s;

@com.squareup.moshi.g(generateAdapter = true)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tesla/data/oapi/RemoveManagedChargingSiteBody;", "", "", "publicKey", "<init>", "(Ljava/lang/String;)V", "data_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class RemoveManagedChargingSiteBody {
    @ir.b(name = "public_key")

    /* renamed from: a  reason: collision with root package name */
    private final String f21637a;

    public RemoveManagedChargingSiteBody(String publicKey) {
        s.g(publicKey, "publicKey");
        this.f21637a = publicKey;
    }

    public final String a() {
        return this.f21637a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RemoveManagedChargingSiteBody) && s.c(this.f21637a, ((RemoveManagedChargingSiteBody) obj).f21637a);
    }

    public int hashCode() {
        return this.f21637a.hashCode();
    }

    public String toString() {
        String str = this.f21637a;
        return "RemoveManagedChargingSiteBody(publicKey=" + str + ")";
    }
}