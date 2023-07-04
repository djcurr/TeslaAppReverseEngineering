package com.tesla.features;

import androidx.annotation.Keep;
import com.squareup.moshi.g;
import ir.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

@g(generateAdapter = true)
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001c\u0010\u0004\u001a\u00020\u00028\u0006@\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/tesla/features/FeaturesConfig;", "", "Lcom/tesla/features/Signaling;", "component1", "signaling", "copy", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/tesla/features/Signaling;", "getSignaling", "()Lcom/tesla/features/Signaling;", "<init>", "(Lcom/tesla/features/Signaling;)V", "features_globalPlayRelease"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class FeaturesConfig {
    @b(name = "signaling")
    private final Signaling signaling;

    public FeaturesConfig() {
        this(null, 1, null);
    }

    public FeaturesConfig(Signaling signaling) {
        s.g(signaling, "signaling");
        this.signaling = signaling;
    }

    public static /* synthetic */ FeaturesConfig copy$default(FeaturesConfig featuresConfig, Signaling signaling, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            signaling = featuresConfig.signaling;
        }
        return featuresConfig.copy(signaling);
    }

    public final Signaling component1() {
        return this.signaling;
    }

    public final FeaturesConfig copy(Signaling signaling) {
        s.g(signaling, "signaling");
        return new FeaturesConfig(signaling);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FeaturesConfig) && s.c(this.signaling, ((FeaturesConfig) obj).signaling);
    }

    public final Signaling getSignaling() {
        return this.signaling;
    }

    public int hashCode() {
        return this.signaling.hashCode();
    }

    public String toString() {
        Signaling signaling = this.signaling;
        return "FeaturesConfig(signaling=" + signaling + ")";
    }

    public /* synthetic */ FeaturesConfig(Signaling signaling, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? new Signaling(false, 1, null) : signaling);
    }
}