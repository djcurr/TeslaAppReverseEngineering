package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class EphemeralKey implements StripeModel {
    private final long created;
    private final long expires;

    /* renamed from: id  reason: collision with root package name */
    private final String f20883id;
    private final boolean isLiveMode;
    private final String objectId;
    private final String objectType;
    private final String secret;
    private final String type;
    public static final Parcelable.Creator<EphemeralKey> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes2.dex */
    public static final class Creator implements Parcelable.Creator<EphemeralKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EphemeralKey createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new EphemeralKey(parcel.readString(), parcel.readLong(), parcel.readLong(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final EphemeralKey[] newArray(int i11) {
            return new EphemeralKey[i11];
        }
    }

    public EphemeralKey(String objectId, long j11, long j12, String id2, boolean z11, String objectType, String secret, String type) {
        s.g(objectId, "objectId");
        s.g(id2, "id");
        s.g(objectType, "objectType");
        s.g(secret, "secret");
        s.g(type, "type");
        this.objectId = objectId;
        this.created = j11;
        this.expires = j12;
        this.f20883id = id2;
        this.isLiveMode = z11;
        this.objectType = objectType;
        this.secret = secret;
        this.type = type;
    }

    public final String component1$payments_core_release() {
        return this.objectId;
    }

    public final long component2$payments_core_release() {
        return this.created;
    }

    public final long component3$payments_core_release() {
        return this.expires;
    }

    public final String component4$payments_core_release() {
        return this.f20883id;
    }

    public final boolean component5$payments_core_release() {
        return this.isLiveMode;
    }

    public final String component6$payments_core_release() {
        return this.objectType;
    }

    public final String component7() {
        return this.secret;
    }

    public final String component8$payments_core_release() {
        return this.type;
    }

    public final EphemeralKey copy(String objectId, long j11, long j12, String id2, boolean z11, String objectType, String secret, String type) {
        s.g(objectId, "objectId");
        s.g(id2, "id");
        s.g(objectType, "objectType");
        s.g(secret, "secret");
        s.g(type, "type");
        return new EphemeralKey(objectId, j11, j12, id2, z11, objectType, secret, type);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof EphemeralKey) {
            EphemeralKey ephemeralKey = (EphemeralKey) obj;
            return s.c(this.objectId, ephemeralKey.objectId) && this.created == ephemeralKey.created && this.expires == ephemeralKey.expires && s.c(this.f20883id, ephemeralKey.f20883id) && this.isLiveMode == ephemeralKey.isLiveMode && s.c(this.objectType, ephemeralKey.objectType) && s.c(this.secret, ephemeralKey.secret) && s.c(this.type, ephemeralKey.type);
        }
        return false;
    }

    public final long getCreated$payments_core_release() {
        return this.created;
    }

    public final long getExpires$payments_core_release() {
        return this.expires;
    }

    public final String getId$payments_core_release() {
        return this.f20883id;
    }

    public final String getObjectId$payments_core_release() {
        return this.objectId;
    }

    public final String getObjectType$payments_core_release() {
        return this.objectType;
    }

    public final String getSecret() {
        return this.secret;
    }

    public final String getType$payments_core_release() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        int hashCode = ((((((this.objectId.hashCode() * 31) + Long.hashCode(this.created)) * 31) + Long.hashCode(this.expires)) * 31) + this.f20883id.hashCode()) * 31;
        boolean z11 = this.isLiveMode;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        return ((((((hashCode + i11) * 31) + this.objectType.hashCode()) * 31) + this.secret.hashCode()) * 31) + this.type.hashCode();
    }

    public final boolean isLiveMode$payments_core_release() {
        return this.isLiveMode;
    }

    public String toString() {
        return "EphemeralKey(objectId=" + this.objectId + ", created=" + this.created + ", expires=" + this.expires + ", id=" + this.f20883id + ", isLiveMode=" + this.isLiveMode + ", objectType=" + this.objectType + ", secret=" + this.secret + ", type=" + this.type + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.objectId);
        out.writeLong(this.created);
        out.writeLong(this.expires);
        out.writeString(this.f20883id);
        out.writeInt(this.isLiveMode ? 1 : 0);
        out.writeString(this.objectType);
        out.writeString(this.secret);
        out.writeString(this.type);
    }
}