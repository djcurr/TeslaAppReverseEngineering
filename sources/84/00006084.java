package com.tesla.domain.model;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0006\u001a\u00020\u0002HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tHÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tesla/domain/model/EnergySite;", "Lcom/tesla/domain/model/Product;", "", "component1", "id", "copy", "toString", "", "hashCode", "", "other", "", "equals", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "domain_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class EnergySite extends Product {
    @b(name = "id")

    /* renamed from: id  reason: collision with root package name */
    private final String f21822id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EnergySite(String id2) {
        super("ENERGY_SITE", null);
        s.g(id2, "id");
        this.f21822id = id2;
    }

    public static /* synthetic */ EnergySite copy$default(EnergySite energySite, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = energySite.f21822id;
        }
        return energySite.copy(str);
    }

    public final String component1() {
        return this.f21822id;
    }

    public final EnergySite copy(String id2) {
        s.g(id2, "id");
        return new EnergySite(id2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EnergySite) && s.c(this.f21822id, ((EnergySite) obj).f21822id);
    }

    public final String getId() {
        return this.f21822id;
    }

    public int hashCode() {
        return this.f21822id.hashCode();
    }

    public String toString() {
        String str = this.f21822id;
        return "EnergySite(id=" + str + ")";
    }
}