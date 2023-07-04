package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.Token;
import java.util.Map;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;

/* loaded from: classes6.dex */
public final class PiiTokenParams extends TokenParams {
    public static final Parcelable.Creator<PiiTokenParams> CREATOR = new Creator();
    private final String personalId;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<PiiTokenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PiiTokenParams createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new PiiTokenParams(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PiiTokenParams[] newArray(int i11) {
            return new PiiTokenParams[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PiiTokenParams(String personalId) {
        super(Token.Type.Pii, null, 2, null);
        s.g(personalId, "personalId");
        this.personalId = personalId;
    }

    private final String component1() {
        return this.personalId;
    }

    public static /* synthetic */ PiiTokenParams copy$default(PiiTokenParams piiTokenParams, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = piiTokenParams.personalId;
        }
        return piiTokenParams.copy(str);
    }

    public final PiiTokenParams copy(String personalId) {
        s.g(personalId, "personalId");
        return new PiiTokenParams(personalId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PiiTokenParams) && s.c(this.personalId, ((PiiTokenParams) obj).personalId);
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        Map<String, Object> f11;
        f11 = r0.f(v.a("personal_id_number", this.personalId));
        return f11;
    }

    public int hashCode() {
        return this.personalId.hashCode();
    }

    public String toString() {
        return "PiiTokenParams(personalId=" + this.personalId + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.personalId);
    }
}