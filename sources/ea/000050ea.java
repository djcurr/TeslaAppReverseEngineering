package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import ch.qos.logback.core.CoreConstants;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodCreateParams;
import com.stripe.android.model.PaymentMethodOptionsParams;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import vz.p;
import vz.v;
import wz.r0;
import wz.s0;
import wz.w;

/* loaded from: classes6.dex */
public final class ConfirmPaymentIntentParams implements ConfirmStripeIntentParams {
    private static final String PARAM_PAYMENT_METHOD_OPTIONS = "payment_method_options";
    private static final String PARAM_RECEIPT_EMAIL = "receipt_email";
    private static final String PARAM_SAVE_PAYMENT_METHOD = "save_payment_method";
    private static final String PARAM_SETUP_FUTURE_USAGE = "setup_future_usage";
    private static final String PARAM_SHIPPING = "shipping";
    public static final String PARAM_SOURCE_DATA = "source_data";
    private static final String PARAM_SOURCE_ID = "source";
    private final String clientSecret;
    private MandateDataParams mandateData;
    private String mandateId;
    private final PaymentMethodCreateParams paymentMethodCreateParams;
    private final String paymentMethodId;
    private PaymentMethodOptionsParams paymentMethodOptions;
    private String receiptEmail;
    private String returnUrl;
    private Boolean savePaymentMethod;
    private SetupFutureUsage setupFutureUsage;
    private Shipping shipping;
    private final String sourceId;
    private final SourceParams sourceParams;
    private final boolean useStripeSdk;
    public static final Companion Companion = new Companion(null);
    public static final Parcelable.Creator<ConfirmPaymentIntentParams> CREATOR = new Creator();
    public static final int $stable = 8;

    /* loaded from: classes6.dex */
    public static final class Creator implements Parcelable.Creator<ConfirmPaymentIntentParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmPaymentIntentParams createFromParcel(Parcel parcel) {
            Boolean valueOf;
            s.g(parcel, "parcel");
            PaymentMethodCreateParams createFromParcel = parcel.readInt() == 0 ? null : PaymentMethodCreateParams.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            SourceParams createFromParcel2 = parcel.readInt() == 0 ? null : SourceParams.CREATOR.createFromParcel(parcel);
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ConfirmPaymentIntentParams(createFromParcel, readString, createFromParcel2, readString2, readString3, readString4, valueOf, parcel.readInt() != 0, (PaymentMethodOptionsParams) parcel.readParcelable(ConfirmPaymentIntentParams.class.getClassLoader()), parcel.readString(), parcel.readInt() == 0 ? null : MandateDataParams.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SetupFutureUsage.valueOf(parcel.readString()), parcel.readInt() != 0 ? Shipping.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ConfirmPaymentIntentParams[] newArray(int i11) {
            return new ConfirmPaymentIntentParams[i11];
        }
    }

    /* loaded from: classes6.dex */
    public enum SetupFutureUsage {
        OnSession("on_session"),
        OffSession("off_session"),
        Blank("");
        
        private final String code;

        SetupFutureUsage(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    public ConfirmPaymentIntentParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String clientSecret, String str3, Boolean bool, boolean z11, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str5) {
        s.g(clientSecret, "clientSecret");
        this.paymentMethodCreateParams = paymentMethodCreateParams;
        this.paymentMethodId = str;
        this.sourceParams = sourceParams;
        this.sourceId = str2;
        this.clientSecret = clientSecret;
        this.returnUrl = str3;
        this.savePaymentMethod = bool;
        this.useStripeSdk = z11;
        this.paymentMethodOptions = paymentMethodOptionsParams;
        this.mandateId = str4;
        this.mandateData = mandateDataParams;
        this.setupFutureUsage = setupFutureUsage;
        this.shipping = shipping;
        this.receiptEmail = str5;
    }

    private final boolean component8() {
        return this.useStripeSdk;
    }

    public static /* synthetic */ ConfirmPaymentIntentParams copy$default(ConfirmPaymentIntentParams confirmPaymentIntentParams, PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String str3, String str4, Boolean bool, boolean z11, PaymentMethodOptionsParams paymentMethodOptionsParams, String str5, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str6, int i11, Object obj) {
        return confirmPaymentIntentParams.copy((i11 & 1) != 0 ? confirmPaymentIntentParams.paymentMethodCreateParams : paymentMethodCreateParams, (i11 & 2) != 0 ? confirmPaymentIntentParams.paymentMethodId : str, (i11 & 4) != 0 ? confirmPaymentIntentParams.sourceParams : sourceParams, (i11 & 8) != 0 ? confirmPaymentIntentParams.sourceId : str2, (i11 & 16) != 0 ? confirmPaymentIntentParams.getClientSecret() : str3, (i11 & 32) != 0 ? confirmPaymentIntentParams.getReturnUrl() : str4, (i11 & 64) != 0 ? confirmPaymentIntentParams.savePaymentMethod : bool, (i11 & 128) != 0 ? confirmPaymentIntentParams.useStripeSdk : z11, (i11 & 256) != 0 ? confirmPaymentIntentParams.paymentMethodOptions : paymentMethodOptionsParams, (i11 & 512) != 0 ? confirmPaymentIntentParams.mandateId : str5, (i11 & 1024) != 0 ? confirmPaymentIntentParams.mandateData : mandateDataParams, (i11 & 2048) != 0 ? confirmPaymentIntentParams.setupFutureUsage : setupFutureUsage, (i11 & 4096) != 0 ? confirmPaymentIntentParams.shipping : shipping, (i11 & PKIFailureInfo.certRevoked) != 0 ? confirmPaymentIntentParams.receiptEmail : str6);
    }

    public static final ConfirmPaymentIntentParams create(String str) {
        return Companion.create(str);
    }

    public static final ConfirmPaymentIntentParams create(String str, Shipping shipping) {
        return Companion.create(str, shipping);
    }

    public static final ConfirmPaymentIntentParams create(String str, Shipping shipping, SetupFutureUsage setupFutureUsage) {
        return Companion.create(str, shipping, setupFutureUsage);
    }

    public static final ConfirmPaymentIntentParams create(String str, PaymentMethod.Type type) {
        return Companion.create(str, type);
    }

    public static final ConfirmPaymentIntentParams createAlipay(String str) {
        return Companion.createAlipay(str);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage, shipping);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptionsParams) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage, shipping, paymentMethodOptionsParams);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2) {
        return Companion.createWithPaymentMethodId(str, str2);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool) {
        return Companion.createWithPaymentMethodId(str, str2, bool);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams) {
        return Companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3) {
        return Companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams) {
        return Companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
        return Companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, setupFutureUsage);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
        return Companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, setupFutureUsage, shipping);
    }

    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3) {
        return Companion.createWithSourceId(str, str2, str3);
    }

    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool) {
        return Companion.createWithSourceId(str, str2, str3, bool);
    }

    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool, Shipping shipping) {
        return Companion.createWithSourceId(str, str2, str3, bool, shipping);
    }

    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2) {
        return Companion.createWithSourceParams(sourceParams, str, str2);
    }

    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2, Boolean bool) {
        return Companion.createWithSourceParams(sourceParams, str, str2, bool);
    }

    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2, Boolean bool, Shipping shipping) {
        return Companion.createWithSourceParams(sourceParams, str, str2, bool, shipping);
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
        Map<String, Object> f13;
        Map<String, Object> f14;
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams != null) {
            f14 = r0.f(v.a("payment_method_data", paymentMethodCreateParams.toParamMap()));
            return f14;
        }
        String str = this.paymentMethodId;
        if (str != null) {
            f13 = r0.f(v.a("payment_method", str));
            return f13;
        }
        SourceParams sourceParams = this.sourceParams;
        if (sourceParams != null) {
            f12 = r0.f(v.a(PARAM_SOURCE_DATA, sourceParams.toParamMap()));
            return f12;
        }
        String str2 = this.sourceId;
        if (str2 != null) {
            f11 = r0.f(v.a("source", str2));
            return f11;
        }
        i11 = s0.i();
        return i11;
    }

    public final PaymentMethodCreateParams component1() {
        return this.paymentMethodCreateParams;
    }

    public final String component10() {
        return this.mandateId;
    }

    public final MandateDataParams component11() {
        return this.mandateData;
    }

    public final SetupFutureUsage component12() {
        return this.setupFutureUsage;
    }

    public final Shipping component13() {
        return this.shipping;
    }

    public final String component14() {
        return this.receiptEmail;
    }

    public final String component2() {
        return this.paymentMethodId;
    }

    public final SourceParams component3() {
        return this.sourceParams;
    }

    public final String component4() {
        return this.sourceId;
    }

    public final String component5() {
        return getClientSecret();
    }

    public final String component6() {
        return getReturnUrl();
    }

    public final Boolean component7() {
        return this.savePaymentMethod;
    }

    public final PaymentMethodOptionsParams component9() {
        return this.paymentMethodOptions;
    }

    public final ConfirmPaymentIntentParams copy(PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String clientSecret, String str3, Boolean bool, boolean z11, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str5) {
        s.g(clientSecret, "clientSecret");
        return new ConfirmPaymentIntentParams(paymentMethodCreateParams, str, sourceParams, str2, clientSecret, str3, bool, z11, paymentMethodOptionsParams, str4, mandateDataParams, setupFutureUsage, shipping, str5);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ConfirmPaymentIntentParams) {
            ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) obj;
            return s.c(this.paymentMethodCreateParams, confirmPaymentIntentParams.paymentMethodCreateParams) && s.c(this.paymentMethodId, confirmPaymentIntentParams.paymentMethodId) && s.c(this.sourceParams, confirmPaymentIntentParams.sourceParams) && s.c(this.sourceId, confirmPaymentIntentParams.sourceId) && s.c(getClientSecret(), confirmPaymentIntentParams.getClientSecret()) && s.c(getReturnUrl(), confirmPaymentIntentParams.getReturnUrl()) && s.c(this.savePaymentMethod, confirmPaymentIntentParams.savePaymentMethod) && this.useStripeSdk == confirmPaymentIntentParams.useStripeSdk && s.c(this.paymentMethodOptions, confirmPaymentIntentParams.paymentMethodOptions) && s.c(this.mandateId, confirmPaymentIntentParams.mandateId) && s.c(this.mandateData, confirmPaymentIntentParams.mandateData) && this.setupFutureUsage == confirmPaymentIntentParams.setupFutureUsage && s.c(this.shipping, confirmPaymentIntentParams.shipping) && s.c(this.receiptEmail, confirmPaymentIntentParams.receiptEmail);
        }
        return false;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public String getClientSecret() {
        return this.clientSecret;
    }

    public final MandateDataParams getMandateData() {
        return this.mandateData;
    }

    public final String getMandateId() {
        return this.mandateId;
    }

    public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final PaymentMethodOptionsParams getPaymentMethodOptions() {
        return this.paymentMethodOptions;
    }

    public final String getReceiptEmail() {
        return this.receiptEmail;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public String getReturnUrl() {
        return this.returnUrl;
    }

    public final Boolean getSavePaymentMethod() {
        return this.savePaymentMethod;
    }

    public final SetupFutureUsage getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final SourceParams getSourceParams() {
        return this.sourceParams;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        int hashCode = (paymentMethodCreateParams == null ? 0 : paymentMethodCreateParams.hashCode()) * 31;
        String str = this.paymentMethodId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        SourceParams sourceParams = this.sourceParams;
        int hashCode3 = (hashCode2 + (sourceParams == null ? 0 : sourceParams.hashCode())) * 31;
        String str2 = this.sourceId;
        int hashCode4 = (((((hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31) + getClientSecret().hashCode()) * 31) + (getReturnUrl() == null ? 0 : getReturnUrl().hashCode())) * 31;
        Boolean bool = this.savePaymentMethod;
        int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        boolean z11 = this.useStripeSdk;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int i12 = (hashCode5 + i11) * 31;
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptions;
        int hashCode6 = (i12 + (paymentMethodOptionsParams == null ? 0 : paymentMethodOptionsParams.hashCode())) * 31;
        String str3 = this.mandateId;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        MandateDataParams mandateDataParams = this.mandateData;
        int hashCode8 = (hashCode7 + (mandateDataParams == null ? 0 : mandateDataParams.hashCode())) * 31;
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        int hashCode9 = (hashCode8 + (setupFutureUsage == null ? 0 : setupFutureUsage.hashCode())) * 31;
        Shipping shipping = this.shipping;
        int hashCode10 = (hashCode9 + (shipping == null ? 0 : shipping.hashCode())) * 31;
        String str4 = this.receiptEmail;
        return hashCode10 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setMandateData(MandateDataParams mandateDataParams) {
        this.mandateData = mandateDataParams;
    }

    public final void setMandateId(String str) {
        this.mandateId = str;
    }

    public final void setPaymentMethodOptions(PaymentMethodOptionsParams paymentMethodOptionsParams) {
        this.paymentMethodOptions = paymentMethodOptionsParams;
    }

    public final void setReceiptEmail(String str) {
        this.receiptEmail = str;
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final void setSavePaymentMethod(Boolean bool) {
        this.savePaymentMethod = bool;
    }

    public final void setSetupFutureUsage(SetupFutureUsage setupFutureUsage) {
        this.setupFutureUsage = setupFutureUsage;
    }

    public final void setShipping(Shipping shipping) {
        this.shipping = shipping;
    }

    public final boolean shouldSavePaymentMethod() {
        return s.c(this.savePaymentMethod, Boolean.TRUE);
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
        Map p14;
        Map p15;
        Map p16;
        Map p17;
        Map p18;
        Map<String, Object> p19;
        l11 = s0.l(v.a("client_secret", getClientSecret()), v.a("use_stripe_sdk", Boolean.valueOf(this.useStripeSdk)));
        Boolean bool = this.savePaymentMethod;
        Map f11 = bool == null ? null : r0.f(v.a(PARAM_SAVE_PAYMENT_METHOD, Boolean.valueOf(bool.booleanValue())));
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
        Map f13 = mandateDataParams == null ? null : r0.f(v.a("mandate_data", mandateDataParams));
        if (f13 == null) {
            f13 = s0.i();
        }
        p13 = s0.p(p12, f13);
        String returnUrl = getReturnUrl();
        Map f14 = returnUrl == null ? null : r0.f(v.a("return_url", returnUrl));
        if (f14 == null) {
            f14 = s0.i();
        }
        p14 = s0.p(p13, f14);
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptions;
        Map f15 = paymentMethodOptionsParams == null ? null : r0.f(v.a(PARAM_PAYMENT_METHOD_OPTIONS, paymentMethodOptionsParams.toParamMap()));
        if (f15 == null) {
            f15 = s0.i();
        }
        p15 = s0.p(p14, f15);
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        Map f16 = setupFutureUsage == null ? null : r0.f(v.a("setup_future_usage", setupFutureUsage.getCode$payments_core_release()));
        if (f16 == null) {
            f16 = s0.i();
        }
        p16 = s0.p(p15, f16);
        Shipping shipping = this.shipping;
        Map f17 = shipping == null ? null : r0.f(v.a(PARAM_SHIPPING, shipping.toParamMap()));
        if (f17 == null) {
            f17 = s0.i();
        }
        p17 = s0.p(p16, f17);
        p18 = s0.p(p17, getPaymentMethodParamMap());
        String str2 = this.receiptEmail;
        Map f18 = str2 != null ? r0.f(v.a(PARAM_RECEIPT_EMAIL, str2)) : null;
        if (f18 == null) {
            f18 = s0.i();
        }
        p19 = s0.p(p18, f18);
        return p19;
    }

    public String toString() {
        return "ConfirmPaymentIntentParams(paymentMethodCreateParams=" + this.paymentMethodCreateParams + ", paymentMethodId=" + ((Object) this.paymentMethodId) + ", sourceParams=" + this.sourceParams + ", sourceId=" + ((Object) this.sourceId) + ", clientSecret=" + getClientSecret() + ", returnUrl=" + ((Object) getReturnUrl()) + ", savePaymentMethod=" + this.savePaymentMethod + ", useStripeSdk=" + this.useStripeSdk + ", paymentMethodOptions=" + this.paymentMethodOptions + ", mandateId=" + ((Object) this.mandateId) + ", mandateData=" + this.mandateData + ", setupFutureUsage=" + this.setupFutureUsage + ", shipping=" + this.shipping + ", receiptEmail=" + ((Object) this.receiptEmail) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int i11) {
        s.g(out, "out");
        PaymentMethodCreateParams paymentMethodCreateParams = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            paymentMethodCreateParams.writeToParcel(out, i11);
        }
        out.writeString(this.paymentMethodId);
        SourceParams sourceParams = this.sourceParams;
        if (sourceParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            sourceParams.writeToParcel(out, i11);
        }
        out.writeString(this.sourceId);
        out.writeString(this.clientSecret);
        out.writeString(this.returnUrl);
        Boolean bool = this.savePaymentMethod;
        if (bool == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeInt(bool.booleanValue() ? 1 : 0);
        }
        out.writeInt(this.useStripeSdk ? 1 : 0);
        out.writeParcelable(this.paymentMethodOptions, i11);
        out.writeString(this.mandateId);
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            mandateDataParams.writeToParcel(out, i11);
        }
        SetupFutureUsage setupFutureUsage = this.setupFutureUsage;
        if (setupFutureUsage == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            out.writeString(setupFutureUsage.name());
        }
        Shipping shipping = this.shipping;
        if (shipping == null) {
            out.writeInt(0);
        } else {
            out.writeInt(1);
            shipping.writeToParcel(out, i11);
        }
        out.writeString(this.receiptEmail);
    }

    @Override // com.stripe.android.model.ConfirmStripeIntentParams
    public ConfirmPaymentIntentParams withShouldUseStripeSdk(boolean z11) {
        return copy$default(this, null, null, null, null, null, null, null, z11, null, null, null, null, null, null, 16255, null);
    }

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ConfirmPaymentIntentParams create$default(Companion companion, String str, Shipping shipping, SetupFutureUsage setupFutureUsage, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                shipping = null;
            }
            if ((i11 & 4) != 0) {
                setupFutureUsage = null;
            }
            return companion.create(str, shipping, setupFutureUsage);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodCreateParams$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptionsParams, int i11, Object obj) {
            return companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : str2, (i11 & 16) != 0 ? null : mandateDataParams, (i11 & 32) != 0 ? null : setupFutureUsage, (i11 & 64) != 0 ? null : shipping, (i11 & 128) != 0 ? null : paymentMethodOptionsParams);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodId$default(Companion companion, String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, int i11, Object obj) {
            return companion.createWithPaymentMethodId(str, str2, (i11 & 4) != 0 ? null : bool, (i11 & 8) != 0 ? null : paymentMethodOptionsParams, (i11 & 16) != 0 ? null : str3, (i11 & 32) != 0 ? null : mandateDataParams, (i11 & 64) != 0 ? null : setupFutureUsage, (i11 & 128) != 0 ? null : shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSourceId$default(Companion companion, String str, String str2, String str3, Boolean bool, Shipping shipping, int i11, Object obj) {
            return companion.createWithSourceId(str, str2, str3, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSourceParams$default(Companion companion, SourceParams sourceParams, String str, String str2, Boolean bool, Shipping shipping, int i11, Object obj) {
            return companion.createWithSourceParams(sourceParams, str, str2, (i11 & 8) != 0 ? null : bool, (i11 & 16) != 0 ? null : shipping);
        }

        public final ConfirmPaymentIntentParams create(String clientSecret) {
            s.g(clientSecret, "clientSecret");
            return create$default(this, clientSecret, null, null, 6, null);
        }

        public final ConfirmPaymentIntentParams create(String clientSecret, Shipping shipping) {
            s.g(clientSecret, "clientSecret");
            return create$default(this, clientSecret, shipping, null, 4, null);
        }

        public final ConfirmPaymentIntentParams create(String clientSecret, PaymentMethod.Type paymentMethodType) {
            s.g(clientSecret, "clientSecret");
            s.g(paymentMethodType, "paymentMethodType");
            return new ConfirmPaymentIntentParams(null, null, null, null, clientSecret, null, null, false, null, null, paymentMethodType.requiresMandate ? new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT()) : null, null, null, null, 15343, null);
        }

        public final ConfirmPaymentIntentParams createAlipay(String clientSecret) {
            s.g(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(PaymentMethodCreateParams.Companion.createAlipay$default(PaymentMethodCreateParams.Companion, null, 1, null), null, null, null, clientSecret, "stripe://return_url", null, false, null, null, null, null, null, null, 16334, null);
        }

        public final ConfirmPaymentIntentParams createForDashboard$payments_core_release(String clientSecret, String paymentMethodId) {
            s.g(clientSecret, "clientSecret");
            s.g(paymentMethodId, "paymentMethodId");
            return new ConfirmPaymentIntentParams(null, paymentMethodId, null, null, clientSecret, null, Boolean.FALSE, true, new PaymentMethodOptionsParams.Card(null, null, null, Boolean.TRUE, 7, null), null, null, null, null, null, 15917, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret) {
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, null, null, null, null, null, null, 252, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool) {
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, null, null, null, null, null, 248, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str) {
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, null, null, null, null, 240, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str, MandateDataParams mandateDataParams) {
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, mandateDataParams, null, null, null, 224, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, mandateDataParams, setupFutureUsage, null, null, 192, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, clientSecret, bool, str, mandateDataParams, setupFutureUsage, shipping, null, 128, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String clientSecret, Boolean bool, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, PaymentMethodOptionsParams paymentMethodOptionsParams) {
            s.g(paymentMethodCreateParams, "paymentMethodCreateParams");
            s.g(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(paymentMethodCreateParams, null, null, null, clientSecret, null, bool, false, paymentMethodOptionsParams, str, mandateDataParams, setupFutureUsage, shipping, null, 8366, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret) {
            s.g(paymentMethodId, "paymentMethodId");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, null, null, null, null, null, null, 252, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool) {
            s.g(paymentMethodId, "paymentMethodId");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, null, null, null, null, null, 248, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams) {
            s.g(paymentMethodId, "paymentMethodId");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, null, null, null, null, 240, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str) {
            s.g(paymentMethodId, "paymentMethodId");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, str, null, null, null, 224, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str, MandateDataParams mandateDataParams) {
            s.g(paymentMethodId, "paymentMethodId");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, str, mandateDataParams, null, null, 192, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            s.g(paymentMethodId, "paymentMethodId");
            s.g(clientSecret, "clientSecret");
            return createWithPaymentMethodId$default(this, paymentMethodId, clientSecret, bool, paymentMethodOptionsParams, str, mandateDataParams, setupFutureUsage, null, 128, null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String paymentMethodId, String clientSecret, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            s.g(paymentMethodId, "paymentMethodId");
            s.g(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(null, paymentMethodId, null, null, clientSecret, null, bool, false, paymentMethodOptionsParams, str, mandateDataParams, setupFutureUsage, shipping, null, 8365, null);
        }

        public final ConfirmPaymentIntentParams createWithSourceId(String sourceId, String clientSecret, String returnUrl) {
            s.g(sourceId, "sourceId");
            s.g(clientSecret, "clientSecret");
            s.g(returnUrl, "returnUrl");
            return createWithSourceId$default(this, sourceId, clientSecret, returnUrl, null, null, 24, null);
        }

        public final ConfirmPaymentIntentParams createWithSourceId(String sourceId, String clientSecret, String returnUrl, Boolean bool) {
            s.g(sourceId, "sourceId");
            s.g(clientSecret, "clientSecret");
            s.g(returnUrl, "returnUrl");
            return createWithSourceId$default(this, sourceId, clientSecret, returnUrl, bool, null, 16, null);
        }

        public final ConfirmPaymentIntentParams createWithSourceId(String sourceId, String clientSecret, String returnUrl, Boolean bool, Shipping shipping) {
            s.g(sourceId, "sourceId");
            s.g(clientSecret, "clientSecret");
            s.g(returnUrl, "returnUrl");
            return new ConfirmPaymentIntentParams(null, null, null, sourceId, clientSecret, returnUrl, bool, false, null, null, null, null, shipping, null, 12167, null);
        }

        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String clientSecret, String returnUrl) {
            s.g(sourceParams, "sourceParams");
            s.g(clientSecret, "clientSecret");
            s.g(returnUrl, "returnUrl");
            return createWithSourceParams$default(this, sourceParams, clientSecret, returnUrl, null, null, 24, null);
        }

        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String clientSecret, String returnUrl, Boolean bool) {
            s.g(sourceParams, "sourceParams");
            s.g(clientSecret, "clientSecret");
            s.g(returnUrl, "returnUrl");
            return createWithSourceParams$default(this, sourceParams, clientSecret, returnUrl, bool, null, 16, null);
        }

        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String clientSecret, String returnUrl, Boolean bool, Shipping shipping) {
            s.g(sourceParams, "sourceParams");
            s.g(clientSecret, "clientSecret");
            s.g(returnUrl, "returnUrl");
            return new ConfirmPaymentIntentParams(null, null, sourceParams, null, clientSecret, returnUrl, bool, false, null, null, null, null, shipping, null, 12171, null);
        }

        public final ConfirmPaymentIntentParams create(String clientSecret, Shipping shipping, SetupFutureUsage setupFutureUsage) {
            s.g(clientSecret, "clientSecret");
            return new ConfirmPaymentIntentParams(null, null, null, null, clientSecret, null, null, false, null, null, null, setupFutureUsage, shipping, null, 10223, null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Shipping implements StripeParamsModel, Parcelable {
        public static final int $stable = 0;
        @Deprecated
        private static final String PARAM_ADDRESS = "address";
        @Deprecated
        private static final String PARAM_CARRIER = "carrier";
        @Deprecated
        private static final String PARAM_NAME = "name";
        @Deprecated
        private static final String PARAM_PHONE = "phone";
        @Deprecated
        private static final String PARAM_TRACKING_NUMBER = "tracking_number";
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;
        private static final Companion Companion = new Companion(null);
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();

        /* loaded from: classes6.dex */
        private static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* loaded from: classes6.dex */
        public static final class Creator implements Parcelable.Creator<Shipping> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping createFromParcel(Parcel parcel) {
                s.g(parcel, "parcel");
                return new Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Shipping[] newArray(int i11) {
                return new Shipping[i11];
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Shipping(Address address, String name) {
            this(address, name, null, null, null, 28, null);
            s.g(address, "address");
            s.g(name, "name");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Shipping(Address address, String name, String str) {
            this(address, name, str, null, null, 24, null);
            s.g(address, "address");
            s.g(name, "name");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Shipping(Address address, String name, String str, String str2) {
            this(address, name, str, str2, null, 16, null);
            s.g(address, "address");
            s.g(name, "name");
        }

        public Shipping(Address address, String name, String str, String str2, String str3) {
            s.g(address, "address");
            s.g(name, "name");
            this.address = address;
            this.name = name;
            this.carrier = str;
            this.phone = str2;
            this.trackingNumber = str3;
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address, String str, String str2, String str3, String str4, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                address = shipping.address;
            }
            if ((i11 & 2) != 0) {
                str = shipping.name;
            }
            String str5 = str;
            if ((i11 & 4) != 0) {
                str2 = shipping.carrier;
            }
            String str6 = str2;
            if ((i11 & 8) != 0) {
                str3 = shipping.phone;
            }
            String str7 = str3;
            if ((i11 & 16) != 0) {
                str4 = shipping.trackingNumber;
            }
            return shipping.copy(address, str5, str6, str7, str4);
        }

        public final Address component1$payments_core_release() {
            return this.address;
        }

        public final String component2$payments_core_release() {
            return this.name;
        }

        public final String component3$payments_core_release() {
            return this.carrier;
        }

        public final String component4$payments_core_release() {
            return this.phone;
        }

        public final String component5$payments_core_release() {
            return this.trackingNumber;
        }

        public final Shipping copy(Address address, String name, String str, String str2, String str3) {
            s.g(address, "address");
            s.g(name, "name");
            return new Shipping(address, name, str, str2, str3);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof Shipping) {
                Shipping shipping = (Shipping) obj;
                return s.c(this.address, shipping.address) && s.c(this.name, shipping.name) && s.c(this.carrier, shipping.carrier) && s.c(this.phone, shipping.phone) && s.c(this.trackingNumber, shipping.trackingNumber);
            }
            return false;
        }

        public final Address getAddress$payments_core_release() {
            return this.address;
        }

        public final String getCarrier$payments_core_release() {
            return this.carrier;
        }

        public final String getName$payments_core_release() {
            return this.name;
        }

        public final String getPhone$payments_core_release() {
            return this.phone;
        }

        public final String getTrackingNumber$payments_core_release() {
            return this.trackingNumber;
        }

        public int hashCode() {
            int hashCode = ((this.address.hashCode() * 31) + this.name.hashCode()) * 31;
            String str = this.carrier;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.phone;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.trackingNumber;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @Override // com.stripe.android.model.StripeParamsModel
        public Map<String, Object> toParamMap() {
            List<p> l11;
            Map<String, Object> i11;
            l11 = w.l(v.a("address", this.address.toParamMap()), v.a("name", this.name), v.a(PARAM_CARRIER, this.carrier), v.a("phone", this.phone), v.a(PARAM_TRACKING_NUMBER, this.trackingNumber));
            i11 = s0.i();
            for (p pVar : l11) {
                String str = (String) pVar.a();
                Object b11 = pVar.b();
                Map f11 = b11 == null ? null : r0.f(v.a(str, b11));
                if (f11 == null) {
                    f11 = s0.i();
                }
                i11 = s0.p(i11, f11);
            }
            return i11;
        }

        public String toString() {
            return "Shipping(address=" + this.address + ", name=" + this.name + ", carrier=" + ((Object) this.carrier) + ", phone=" + ((Object) this.phone) + ", trackingNumber=" + ((Object) this.trackingNumber) + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i11) {
            s.g(out, "out");
            this.address.writeToParcel(out, i11);
            out.writeString(this.name);
            out.writeString(this.carrier);
            out.writeString(this.phone);
            out.writeString(this.trackingNumber);
        }

        public /* synthetic */ Shipping(Address address, String str, String str2, String str3, String str4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(address, str, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : str4);
        }
    }

    public /* synthetic */ ConfirmPaymentIntentParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, SourceParams sourceParams, String str2, String str3, String str4, Boolean bool, boolean z11, PaymentMethodOptionsParams paymentMethodOptionsParams, String str5, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, String str6, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : paymentMethodCreateParams, (i11 & 2) != 0 ? null : str, (i11 & 4) != 0 ? null : sourceParams, (i11 & 8) != 0 ? null : str2, str3, (i11 & 32) != 0 ? null : str4, (i11 & 64) != 0 ? null : bool, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? null : paymentMethodOptionsParams, (i11 & 512) != 0 ? null : str5, (i11 & 1024) != 0 ? null : mandateDataParams, (i11 & 2048) != 0 ? null : setupFutureUsage, (i11 & 4096) != 0 ? null : shipping, (i11 & PKIFailureInfo.certRevoked) != 0 ? null : str6);
    }
}