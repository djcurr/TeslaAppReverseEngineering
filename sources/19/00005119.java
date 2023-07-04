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
public final class CvcTokenParams extends TokenParams {
    private final String cvc;
    public static final Parcelable.Creator<CvcTokenParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<CvcTokenParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CvcTokenParams createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new CvcTokenParams(parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final CvcTokenParams[] newArray(int i11) {
            return new CvcTokenParams[i11];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CvcTokenParams(String cvc) {
        super(Token.Type.CvcUpdate, null, 2, null);
        s.g(cvc, "cvc");
        this.cvc = cvc;
    }

    private final String component1() {
        return this.cvc;
    }

    public static /* synthetic */ CvcTokenParams copy$default(CvcTokenParams cvcTokenParams, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cvcTokenParams.cvc;
        }
        return cvcTokenParams.copy(str);
    }

    public final CvcTokenParams copy(String cvc) {
        s.g(cvc, "cvc");
        return new CvcTokenParams(cvc);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CvcTokenParams) && s.c(this.cvc, ((CvcTokenParams) obj).cvc);
    }

    @Override // com.stripe.android.model.TokenParams
    public Map<String, Object> getTypeDataParams() {
        Map<String, Object> f11;
        f11 = r0.f(v.a("cvc", this.cvc));
        return f11;
    }

    public int hashCode() {
        return this.cvc.hashCode();
    }

    public String toString() {
        return "CvcTokenParams(cvc=" + this.cvc + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.cvc);
    }
}