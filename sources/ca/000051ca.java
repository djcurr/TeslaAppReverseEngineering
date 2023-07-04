package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.core.model.StripeModel;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class RadarSession implements StripeModel {

    /* renamed from: id  reason: collision with root package name */
    private final String f20934id;
    public static final Parcelable.Creator<RadarSession> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<RadarSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarSession createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new RadarSession(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final RadarSession[] newArray(int i11) {
            return new RadarSession[i11];
        }
    }

    public RadarSession(String id2) {
        s.g(id2, "id");
        this.f20934id = id2;
    }

    public static /* synthetic */ RadarSession copy$default(RadarSession radarSession, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = radarSession.f20934id;
        }
        return radarSession.copy(str);
    }

    public final String component1() {
        return this.f20934id;
    }

    public final RadarSession copy(String id2) {
        s.g(id2, "id");
        return new RadarSession(id2);
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
        return (obj instanceof RadarSession) && s.c(this.f20934id, ((RadarSession) obj).f20934id);
    }

    public final String getId() {
        return this.f20934id;
    }

    @Override // com.stripe.android.core.model.StripeModel
    public int hashCode() {
        return this.f20934id.hashCode();
    }

    public String toString() {
        return "RadarSession(id=" + this.f20934id + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.f20934id);
    }
}