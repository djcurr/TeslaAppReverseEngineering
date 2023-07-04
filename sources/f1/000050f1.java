package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import vz.v;
import wz.r0;
import wz.s0;

/* loaded from: classes6.dex */
public final class ConfirmSetupIntentParams implements ConfirmStripeIntentParams {
    private final String clientSecret;
    private MandateDataParams mandateData;
    private String mandateId;
    private final PaymentMethodCreateParams paymentMethodCreateParams;
    private final String paymentMethodId;
    private String returnUrl;
    private final boolean useStripeSdk;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ConfirmSetupIntentParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ConfirmSetupIntentParams create$default(Companion companion, String str, String str2, MandateDataParams mandateDataParams, String str3, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                mandateDataParams = null;
            }
            if ((i11 & 8) != 0) {
                str3 = null;
            }
            return companion.create(str, str2, mandateDataParams, str3);
        }

        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret) {
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.g(clientSecret, "clientSecret");
            return create$default(this, paymentMethodCreateParams, clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
        }

        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, MandateDataParams mandateDataParams) {
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.g(clientSecret, "clientSecret");
            return create$default(this, paymentMethodCreateParams, clientSecret, mandateDataParams, (String) null, 8, (Object) null);
        }

        public final ConfirmSetupIntentParams create(String clientSecret, PaymentMethod.Type paymentMethodType) {
            s.g(clientSecret, "clientSecret");
            s.g(paymentMethodType, "paymentMethodType");
            MandateDataParams mandateDataParams = new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT());
            if (!paymentMethodType.requiresMandate) {
                mandateDataParams = null;
            }
            return new ConfirmSetupIntentParams(clientSecret, null, null, null, false, null, mandateDataParams, 62, null);
        }

        public final ConfirmSetupIntentParams create(String paymentMethodId, String clientSecret) {
            s.g(paymentMethodId, "paymentMethodId");
            s.g(clientSecret, "clientSecret");
            return create$default(this, paymentMethodId, clientSecret, (MandateDataParams) null, (String) null, 12, (Object) null);
        }

        public final ConfirmSetupIntentParams create(String paymentMethodId, String clientSecret, MandateDataParams mandateDataParams) {
            s.g(paymentMethodId, "paymentMethodId");
            s.g(clientSecret, "clientSecret");
            return create$default(this, paymentMethodId, clientSecret, mandateDataParams, (String) null, 8, (Object) null);
        }

        public final ConfirmSetupIntentParams createWithoutPaymentMethod(String clientSecret) {
            s.g(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, null, null, null, false, null, null, 126, null);
        }

        public static /* synthetic */ ConfirmSetupIntentParams create$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams, String str2, int i11, Object obj) {
            if ((i11 & 4) != 0) {
                mandateDataParams = null;
            }
            if ((i11 & 8) != 0) {
                str2 = null;
            }
            return companion.create(paymentMethodCreateParams, str, mandateDataParams, str2);
        }

        public final ConfirmSetupIntentParams create(String paymentMethodId, String clientSecret, MandateDataParams mandateDataParams, String str) {
            s.g(paymentMethodId, "paymentMethodId");
            s.g(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, paymentMethodId, null, null, false, str, mandateDataParams, 28, null);
        }

        public final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, MandateDataParams mandateDataParams, String str) {
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.g(clientSecret, "clientSecret");
            return new ConfirmSetupIntentParams(clientSecret, null, paymentMethodCreateParams, null, false, str, mandateDataParams, 26, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ConfirmSetupIntentParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmSetupIntentParams createFromParcel(Parcel parcel) {
            s.g(parcel, "parcel");
            return new ConfirmSetupIntentParams(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0 ? MandateDataParams.CREATOR.createFromParcel(parcel) : null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmSetupIntentParams[] newArray(int i11) {
            return new ConfirmSetupIntentParams[i11];
        }
    }

    public ConfirmSetupIntentParams(String clientSecret, String str, PaymentMethodCreateParams paymentMethodCreateParams, String str2, boolean z11, String str3, MandateDataParams mandateDataParams) {
        s.g(clientSecret, "clientSecret");
        this.clientSecret = clientSecret;
        this.paymentMethodId = str;
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.returnUrl = str2;
        this.useStripeSdk = z11;
        this.mandateId = str3;
        this.mandateData = mandateDataParams;
    }

    private final boolean component5() {
        return this.useStripeSdk;
    }

    public static /* synthetic */ ConfirmSetupIntentParams copy$default(ConfirmSetupIntentParams confirmSetupIntentParams, String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z11, String str4, MandateDataParams mandateDataParams, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = confirmSetupIntentParams.getClientSecret();
        }
        if ((i11 & 2) != 0) {
            str2 = confirmSetupIntentParams.paymentMethodId;
        }
        String str5 = str2;
        if ((i11 & 4) != 0) {
            paymentMethodCreateParams = confirmSetupIntentParams.paymentMethodCreateParams;
        }
        PaymentMethodCreateParams paymentMethodCreateParams2 = paymentMethodCreateParams;
        if ((i11 & 8) != 0) {
            str3 = confirmSetupIntentParams.getReturnUrl();
        }
        String str6 = str3;
        if ((i11 & 16) != 0) {
            z11 = confirmSetupIntentParams.useStripeSdk;
        }
        boolean z12 = z11;
        if ((i11 & 32) != 0) {
            str4 = confirmSetupIntentParams.mandateId;
        }
        String str7 = str4;
        if ((i11 & 64) != 0) {
            mandateDataParams = confirmSetupIntentParams.mandateData;
        }
        return confirmSetupIntentParams.copy(str, str5, paymentMethodCreateParams2, str6, z12, str7, mandateDataParams);
    }

    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str) {
        return Companion.create(paymentMethodCreateParams, str);
    }

    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams) {
        return Companion.create(paymentMethodCreateParams, str, mandateDataParams);
    }

    public static final ConfirmSetupIntentParams create(PaymentMethodCreateParams paymentMethodCreateParams, String str, MandateDataParams mandateDataParams, String str2) {
        return Companion.create(paymentMethodCreateParams, str, mandateDataParams, str2);
    }

    public static final ConfirmSetupIntentParams create(String str, PaymentMethod.Type type) {
        return Companion.create(str, type);
    }

    public static final ConfirmSetupIntentParams create(String str, String str2) {
        return Companion.create(str, str2);
    }

    public static final ConfirmSetupIntentParams create(String str, String str2, MandateDataParams mandateDataParams) {
        return Companion.create(str, str2, mandateDataParams);
    }

    public static final ConfirmSetupIntentParams create(String str, String str2, MandateDataParams mandateDataParams, String str3) {
        return Companion.create(str, str2, mandateDataParams, str3);
    }

    public static final ConfirmSetupIntentParams createWithoutPaymentMethod(String str) {
        return Companion.createWithoutPaymentMethod(str);
    }

    private final Map<String, Object> getMandateDataParams() {
        PaymentMethod.Type type$payments_core_release;
        MandateDataParams mandateDataParams = this.mandateData;
        Map<String, Object> paramMap = mandateDataParams == null ? null : mandateDataParams.toParamMap();
        if (paramMap == null) {
            PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
            if (((paymentMethodCreateParams == null || (type$payments_core_release = paymentMethodCreateParams.getType$payments_core_release()) == null || !type$payments_core_release.requiresMandate) ? false : true) && this.mandateId == null) {
                return new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT()).toParamMap();
            }
            return null;
        }
        return paramMap;
    }

    private final Map<String, Object> getPaymentMethodParamMap() {
        Map<String, Object> i11;
        Map<String, Object> f11;
        Map<String, Object> f12;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null) {
            f12 = r0.f(v.a("payment_method_data", paymentMethodCreateParams.toParamMap()));
            return f12;
        }
        String str = this.paymentMethodId;
        if (str != null) {
            f11 = r0.f(v.a("payment_method", str));
            return f11;
        }
        i11 = s0.i();
        return i11;
    }

    public final String component1() {
        return getClientSecret();
    }

    public final String component2$payments_core_release() {
        return this.paymentMethodId;
    }

    public final PaymentMethodCreateParams component3$payments_core_release() {
        return this.paymentMethodCreateParams;
    }

    public final String component4() {
        return getReturnUrl();
    }

    public final String component6() {
        return this.mandateId;
    }

    public final MandateDataParams component7() {
        return this.mandateData;
    }

    public final ConfirmSetupIntentParams copy(String clientSecret, String str, PaymentMethodCreateParams paymentMethodCreateParams, String str2, boolean z11, String str3, MandateDataParams mandateDataParams) {
        s.g(clientSecret, "clientSecret");
        return new ConfirmSetupIntentParams(clientSecret, str, paymentMethodCreateParams, str2, z11, str3, mandateDataParams);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfirmSetupIntentParams) {
            ConfirmSetupIntentParams confirmSetupIntentParams = (ConfirmSetupIntentParams) obj;
            return s.c(getClientSecret(), confirmSetupIntentParams.getClientSecret()) && s.c(this.paymentMethodId, confirmSetupIntentParams.paymentMethodId) && s.c(this.paymentMethodCreateParams, confirmSetupIntentParams.paymentMethodCreateParams) && s.c(getReturnUrl(), confirmSetupIntentParams.getReturnUrl()) && this.useStripeSdk == confirmSetupIntentParams.useStripeSdk && s.c(this.mandateId, confirmSetupIntentParams.mandateId) && s.c(this.mandateData, confirmSetupIntentParams.mandateData);
        }
        return false;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public /* synthetic */ String getClientSecret() {
        return this.clientSecret;
    }

    public final MandateDataParams getMandateData() {
        return this.mandateData;
    }

    public final String getMandateId() {
        return this.mandateId;
    }

    public final /* synthetic */ PaymentMethodCreateParams getPaymentMethodCreateParams$payments_core_release() {
        return this.paymentMethodCreateParams;
    }

    public final /* synthetic */ String getPaymentMethodId$payments_core_release() {
        return this.paymentMethodId;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public String getReturnUrl() {
        return this.returnUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = getClientSecret().hashCode() * 31;
        String str = this.paymentMethodId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int hashCode3 = (((hashCode2 + (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode())) * 31) + (getReturnUrl() == null ? 0 : getReturnUrl().hashCode())) * 31;
        boolean z11 = this.useStripeSdk;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode3 + i11) * 31;
        String str2 = this.mandateId;
        int hashCode4 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        MandateDataParams mandateDataParams = this.mandateData;
        return hashCode4 + (mandateDataParams != null ? mandateDataParams.hashCode() : 0);
    }

    public final void setMandateData(MandateDataParams mandateDataParams) {
        this.mandateData = mandateDataParams;
    }

    public final void setMandateId(String str) {
        this.mandateId = str;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public boolean shouldUseStripeSdk() {
        return this.useStripeSdk;
    }

    @Override // com.stripe.android.model.StripeParamsModel
    public Map<String, Object> toParamMap() {
        Map l11;
        Map p11;
        Map p12;
        Map p13;
        Map<String, Object> p14;
        l11 = s0.l(v.a("client_secret", getClientSecret()), v.a("use_stripe_sdk", Boolean.valueOf(this.useStripeSdk)));
        String returnUrl = getReturnUrl();
        Map f11 = returnUrl == null ? null : r0.f(v.a("return_url", returnUrl));
        if (f11 == null) {
            f11 = s0.i();
        }
        p11 = s0.p(l11, f11);
        String str = this.mandateId;
        Map f12 = str == null ? null : r0.f(v.a("mandate", str));
        if (f12 == null) {
            f12 = s0.i();
        }
        p12 = s0.p(p11, f12);
        Map<String, Object> mandateDataParams = getMandateDataParams();
        Map f13 = mandateDataParams != null ? r0.f(v.a("mandate_data", mandateDataParams)) : null;
        if (f13 == null) {
            f13 = s0.i();
        }
        p13 = s0.p(p12, f13);
        p14 = s0.p(p13, getPaymentMethodParamMap());
        return p14;
    }

    public String toString() {
        return "ConfirmSetupIntentParams(clientSecret=" + getClientSecret() + ", paymentMethodId=" + ((Object) this.paymentMethodId) + ", paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", returnUrl=" + ((Object) getReturnUrl()) + ", useStripeSdk=" + this.useStripeSdk + ", mandateId=" + ((Object) this.mandateId) + ", mandateData=" + this.mandateData + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        out.writeString(this.clientSecret);
        out.writeString(this.paymentMethodId);
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            paymentMethodCreateParams.writeToParcel(out, i11);
        }
        out.writeString(this.returnUrl);
        out.writeInt(this.useStripeSdk ? 1 : 0);
        out.writeString(this.mandateId);
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams == null) {
            out.writeInt(0);
            return;
        }
        out.writeInt(1);
        mandateDataParams.writeToParcel(out, i11);
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public ConfirmSetupIntentParams withShouldUseStripeSdk(boolean z11) {
        return copy$default(this, null, null, null, null, z11, null, null, 111, null);
    }

    public /* synthetic */ ConfirmSetupIntentParams(String str, String str2, PaymentMethodCreateParams paymentMethodCreateParams, String str3, boolean z11, String str4, MandateDataParams mandateDataParams, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i11 & 2) != 0 ? null : str2, (i11 & 4) != 0 ? null : paymentMethodCreateParams, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? false : z11, (i11 & 32) != 0 ? null : str4, (i11 & 64) == 0 ? mandateDataParams : null);
    }
}