package com.tesla.features;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/tesla/features/Signaling;", "", "", "component1", "enabled", "copy", "", "toString", "", "hashCode", "other", "equals", "Z", "getEnabled", "()Z", "<init>", "(Z)V", "features_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class Signaling {
    @b(name = "enabled")
    private final boolean enabled;

    public Signaling() {
        this(false, 1, null);
    }

    public Signaling(boolean z11) {
        this.enabled = z11;
    }

    public static /* synthetic */ Signaling copy$default(Signaling signaling, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = signaling.enabled;
        }
        return signaling.copy(z11);
    }

    public final boolean component1() {
        return this.enabled;
    }

    public final Signaling copy(boolean z11) {
        return new Signaling(z11);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Signaling) && this.enabled == ((Signaling) obj).enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public int hashCode() {
        boolean z11 = this.enabled;
        if (z11) {
            return 1;
        }
        return z11 ? 1 : 0;
    }

    public String toString() {
        boolean z11 = this.enabled;
        return "Signaling(enabled=" + z11 + ")";
    }

    public /* synthetic */ Signaling(boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? false : z11);
    }
}