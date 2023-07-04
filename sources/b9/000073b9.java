package hr;

import android.os.Bundle;
import android.util.Log;
import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.response.Action;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.stripe.android.PaymentAuthConfig;
import com.stripe.android.model.Address;
import com.stripe.android.model.BankAccount;
import com.stripe.android.model.BankAccountTokenParams;
import com.stripe.android.model.Card;
import com.stripe.android.model.CardBrand;
import com.stripe.android.model.CardFunding;
import com.stripe.android.model.ConfirmPaymentIntentParams;
import com.stripe.android.model.MicrodepositType;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.SetupIntent;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.Token;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.paymentsheet.analytics.PaymentSheetEvent;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.List;
import kotlin.jvm.internal.s;
import org.spongycastle.i18n.ErrorBundle;
import vz.b0;

/* loaded from: classes2.dex */
public final class d {

    /* loaded from: classes2.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f29404a;

        /* renamed from: b  reason: collision with root package name */
        public static final /* synthetic */ int[] f29405b;

        /* renamed from: c  reason: collision with root package name */
        public static final /* synthetic */ int[] f29406c;

        /* renamed from: d  reason: collision with root package name */
        public static final /* synthetic */ int[] f29407d;

        /* renamed from: e  reason: collision with root package name */
        public static final /* synthetic */ int[] f29408e;

        /* renamed from: f  reason: collision with root package name */
        public static final /* synthetic */ int[] f29409f;

        /* renamed from: g  reason: collision with root package name */
        public static final /* synthetic */ int[] f29410g;

        /* renamed from: h  reason: collision with root package name */
        public static final /* synthetic */ int[] f29411h;

        /* renamed from: i  reason: collision with root package name */
        public static final /* synthetic */ int[] f29412i;

        /* renamed from: j  reason: collision with root package name */
        public static final /* synthetic */ int[] f29413j;

        /* renamed from: k  reason: collision with root package name */
        public static final /* synthetic */ int[] f29414k;

        /* renamed from: l  reason: collision with root package name */
        public static final /* synthetic */ int[] f29415l;

        /* renamed from: m  reason: collision with root package name */
        public static final /* synthetic */ int[] f29416m;

        /* renamed from: n  reason: collision with root package name */
        public static final /* synthetic */ int[] f29417n;

        /* renamed from: o  reason: collision with root package name */
        public static final /* synthetic */ int[] f29418o;

        /* renamed from: p  reason: collision with root package name */
        public static final /* synthetic */ int[] f29419p;

        static {
            int[] iArr = new int[StripeIntent.Status.values().length];
            iArr[StripeIntent.Status.Succeeded.ordinal()] = 1;
            iArr[StripeIntent.Status.RequiresPaymentMethod.ordinal()] = 2;
            iArr[StripeIntent.Status.RequiresConfirmation.ordinal()] = 3;
            iArr[StripeIntent.Status.Canceled.ordinal()] = 4;
            iArr[StripeIntent.Status.Processing.ordinal()] = 5;
            iArr[StripeIntent.Status.RequiresAction.ordinal()] = 6;
            iArr[StripeIntent.Status.RequiresCapture.ordinal()] = 7;
            f29404a = iArr;
            int[] iArr2 = new int[PaymentIntent.CaptureMethod.values().length];
            iArr2[PaymentIntent.CaptureMethod.Automatic.ordinal()] = 1;
            iArr2[PaymentIntent.CaptureMethod.Manual.ordinal()] = 2;
            f29405b = iArr2;
            int[] iArr3 = new int[PaymentIntent.ConfirmationMethod.values().length];
            iArr3[PaymentIntent.ConfirmationMethod.Automatic.ordinal()] = 1;
            iArr3[PaymentIntent.ConfirmationMethod.Manual.ordinal()] = 2;
            f29406c = iArr3;
            int[] iArr4 = new int[CardBrand.values().length];
            iArr4[CardBrand.AmericanExpress.ordinal()] = 1;
            iArr4[CardBrand.DinersClub.ordinal()] = 2;
            iArr4[CardBrand.Discover.ordinal()] = 3;
            iArr4[CardBrand.JCB.ordinal()] = 4;
            iArr4[CardBrand.MasterCard.ordinal()] = 5;
            iArr4[CardBrand.UnionPay.ordinal()] = 6;
            iArr4[CardBrand.Visa.ordinal()] = 7;
            iArr4[CardBrand.Unknown.ordinal()] = 8;
            f29407d = iArr4;
            int[] iArr5 = new int[PaymentMethod.Type.values().length];
            iArr5[PaymentMethod.Type.AfterpayClearpay.ordinal()] = 1;
            iArr5[PaymentMethod.Type.Alipay.ordinal()] = 2;
            iArr5[PaymentMethod.Type.AuBecsDebit.ordinal()] = 3;
            iArr5[PaymentMethod.Type.BacsDebit.ordinal()] = 4;
            iArr5[PaymentMethod.Type.Bancontact.ordinal()] = 5;
            iArr5[PaymentMethod.Type.Card.ordinal()] = 6;
            iArr5[PaymentMethod.Type.CardPresent.ordinal()] = 7;
            iArr5[PaymentMethod.Type.Eps.ordinal()] = 8;
            iArr5[PaymentMethod.Type.Fpx.ordinal()] = 9;
            iArr5[PaymentMethod.Type.Giropay.ordinal()] = 10;
            iArr5[PaymentMethod.Type.GrabPay.ordinal()] = 11;
            iArr5[PaymentMethod.Type.Ideal.ordinal()] = 12;
            iArr5[PaymentMethod.Type.Netbanking.ordinal()] = 13;
            iArr5[PaymentMethod.Type.Oxxo.ordinal()] = 14;
            iArr5[PaymentMethod.Type.P24.ordinal()] = 15;
            iArr5[PaymentMethod.Type.SepaDebit.ordinal()] = 16;
            iArr5[PaymentMethod.Type.Sofort.ordinal()] = 17;
            iArr5[PaymentMethod.Type.Upi.ordinal()] = 18;
            iArr5[PaymentMethod.Type.WeChatPay.ordinal()] = 19;
            iArr5[PaymentMethod.Type.Klarna.ordinal()] = 20;
            iArr5[PaymentMethod.Type.USBankAccount.ordinal()] = 21;
            iArr5[PaymentMethod.Type.PayPal.ordinal()] = 22;
            iArr5[PaymentMethod.Type.Affirm.ordinal()] = 23;
            f29408e = iArr5;
            int[] iArr6 = new int[Token.Type.values().length];
            iArr6[Token.Type.Account.ordinal()] = 1;
            iArr6[Token.Type.BankAccount.ordinal()] = 2;
            iArr6[Token.Type.Card.ordinal()] = 3;
            iArr6[Token.Type.CvcUpdate.ordinal()] = 4;
            iArr6[Token.Type.Person.ordinal()] = 5;
            iArr6[Token.Type.Pii.ordinal()] = 6;
            f29409f = iArr6;
            int[] iArr7 = new int[BankAccount.Type.values().length];
            iArr7[BankAccount.Type.Company.ordinal()] = 1;
            iArr7[BankAccount.Type.Individual.ordinal()] = 2;
            f29410g = iArr7;
            int[] iArr8 = new int[BankAccount.Status.values().length];
            iArr8[BankAccount.Status.Errored.ordinal()] = 1;
            iArr8[BankAccount.Status.New.ordinal()] = 2;
            iArr8[BankAccount.Status.Validated.ordinal()] = 3;
            iArr8[BankAccount.Status.VerificationFailed.ordinal()] = 4;
            iArr8[BankAccount.Status.Verified.ordinal()] = 5;
            f29411h = iArr8;
            int[] iArr9 = new int[PaymentMethod.USBankAccount.USBankAccountHolderType.values().length];
            iArr9[PaymentMethod.USBankAccount.USBankAccountHolderType.COMPANY.ordinal()] = 1;
            iArr9[PaymentMethod.USBankAccount.USBankAccountHolderType.INDIVIDUAL.ordinal()] = 2;
            f29412i = iArr9;
            int[] iArr10 = new int[PaymentMethod.USBankAccount.USBankAccountType.values().length];
            iArr10[PaymentMethod.USBankAccount.USBankAccountType.CHECKING.ordinal()] = 1;
            iArr10[PaymentMethod.USBankAccount.USBankAccountType.SAVINGS.ordinal()] = 2;
            f29413j = iArr10;
            int[] iArr11 = new int[MicrodepositType.values().length];
            iArr11[MicrodepositType.AMOUNTS.ordinal()] = 1;
            iArr11[MicrodepositType.DESCRIPTOR_CODE.ordinal()] = 2;
            f29414k = iArr11;
            int[] iArr12 = new int[StripeIntent.NextActionType.values().length];
            iArr12[StripeIntent.NextActionType.RedirectToUrl.ordinal()] = 1;
            iArr12[StripeIntent.NextActionType.VerifyWithMicrodeposits.ordinal()] = 2;
            iArr12[StripeIntent.NextActionType.DisplayOxxoDetails.ordinal()] = 3;
            iArr12[StripeIntent.NextActionType.WeChatPayRedirect.ordinal()] = 4;
            iArr12[StripeIntent.NextActionType.AlipayRedirect.ordinal()] = 5;
            iArr12[StripeIntent.NextActionType.BlikAuthorize.ordinal()] = 6;
            iArr12[StripeIntent.NextActionType.UseStripeSdk.ordinal()] = 7;
            f29415l = iArr12;
            int[] iArr13 = new int[PaymentIntent.Error.Type.values().length];
            iArr13[PaymentIntent.Error.Type.ApiConnectionError.ordinal()] = 1;
            iArr13[PaymentIntent.Error.Type.AuthenticationError.ordinal()] = 2;
            iArr13[PaymentIntent.Error.Type.ApiError.ordinal()] = 3;
            iArr13[PaymentIntent.Error.Type.CardError.ordinal()] = 4;
            iArr13[PaymentIntent.Error.Type.IdempotencyError.ordinal()] = 5;
            iArr13[PaymentIntent.Error.Type.InvalidRequestError.ordinal()] = 6;
            iArr13[PaymentIntent.Error.Type.RateLimitError.ordinal()] = 7;
            f29416m = iArr13;
            int[] iArr14 = new int[SetupIntent.Error.Type.values().length];
            iArr14[SetupIntent.Error.Type.ApiConnectionError.ordinal()] = 1;
            iArr14[SetupIntent.Error.Type.AuthenticationError.ordinal()] = 2;
            iArr14[SetupIntent.Error.Type.ApiError.ordinal()] = 3;
            iArr14[SetupIntent.Error.Type.CardError.ordinal()] = 4;
            iArr14[SetupIntent.Error.Type.IdempotencyError.ordinal()] = 5;
            iArr14[SetupIntent.Error.Type.InvalidRequestError.ordinal()] = 6;
            iArr14[SetupIntent.Error.Type.RateLimitError.ordinal()] = 7;
            f29417n = iArr14;
            int[] iArr15 = new int[StripeIntent.Usage.values().length];
            iArr15[StripeIntent.Usage.OffSession.ordinal()] = 1;
            iArr15[StripeIntent.Usage.OnSession.ordinal()] = 2;
            iArr15[StripeIntent.Usage.OneTime.ordinal()] = 3;
            f29418o = iArr15;
            int[] iArr16 = new int[ReadableType.values().length];
            iArr16[ReadableType.Null.ordinal()] = 1;
            iArr16[ReadableType.Boolean.ordinal()] = 2;
            iArr16[ReadableType.Number.ordinal()] = 3;
            iArr16[ReadableType.String.ordinal()] = 4;
            iArr16[ReadableType.Map.ordinal()] = 5;
            iArr16[ReadableType.Array.ordinal()] = 6;
            f29419p = iArr16;
        }
    }

    public static final String A(PaymentMethod.USBankAccount.USBankAccountType uSBankAccountType) {
        int i11 = uSBankAccountType == null ? -1 : a.f29413j[uSBankAccountType.ordinal()];
        return i11 != 1 ? i11 != 2 ? "Unknown" : "Savings" : "Checking";
    }

    public static final WritableMap B(PaymentIntent.Shipping shipping) {
        s.g(shipping, "shipping");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("city", shipping.getAddress().getCity());
        writableNativeMap2.putString("country", shipping.getAddress().getCountry());
        writableNativeMap2.putString("line1", shipping.getAddress().getLine1());
        writableNativeMap2.putString("line2", shipping.getAddress().getLine2());
        writableNativeMap2.putString("postalCode", shipping.getAddress().getPostalCode());
        writableNativeMap2.putString("state", shipping.getAddress().getState());
        writableNativeMap.putMap("address", writableNativeMap2);
        writableNativeMap.putString("name", shipping.getName());
        writableNativeMap.putString("carrier", shipping.getCarrier());
        writableNativeMap.putString(PaymentMethod.BillingDetails.PARAM_PHONE, shipping.getPhone());
        writableNativeMap.putString("trackingNumber", shipping.getTrackingNumber());
        return writableNativeMap;
    }

    public static final String C(StripeIntent.Status status) {
        switch (status == null ? -1 : a.f29404a[status.ordinal()]) {
            case 1:
                return "Succeeded";
            case 2:
                return "RequiresPaymentMethod";
            case 3:
                return "RequiresConfirmation";
            case 4:
                return "Canceled";
            case 5:
                return "Processing";
            case 6:
                return "RequiresAction";
            case 7:
                return "RequiresCapture";
            default:
                return "Unknown";
        }
    }

    public static final WritableNativeMap D(StripeIntent.NextActionType nextActionType, StripeIntent.NextActionData nextActionData) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        switch (nextActionType == null ? -1 : a.f29415l[nextActionType.ordinal()]) {
            case -1:
            case 6:
            case 7:
                return null;
            case 1:
                StripeIntent.NextActionData.RedirectToUrl redirectToUrl = nextActionData instanceof StripeIntent.NextActionData.RedirectToUrl ? (StripeIntent.NextActionData.RedirectToUrl) nextActionData : null;
                if (redirectToUrl != null) {
                    writableNativeMap.putString("type", "urlRedirect");
                    writableNativeMap.putString("redirectUrl", redirectToUrl.getUrl().toString());
                    break;
                }
                break;
            case 2:
                StripeIntent.NextActionData.VerifyWithMicrodeposits verifyWithMicrodeposits = nextActionData instanceof StripeIntent.NextActionData.VerifyWithMicrodeposits ? (StripeIntent.NextActionData.VerifyWithMicrodeposits) nextActionData : null;
                if (verifyWithMicrodeposits != null) {
                    writableNativeMap.putString("type", "verifyWithMicrodeposits");
                    writableNativeMap.putString("arrivalDate", String.valueOf(verifyWithMicrodeposits.getArrivalDate()));
                    writableNativeMap.putString("redirectUrl", verifyWithMicrodeposits.getHostedVerificationUrl());
                    writableNativeMap.putString("microdepositType", s(verifyWithMicrodeposits.getMicrodepositType()));
                    break;
                }
                break;
            case 3:
                StripeIntent.NextActionData.DisplayOxxoDetails displayOxxoDetails = nextActionData instanceof StripeIntent.NextActionData.DisplayOxxoDetails ? (StripeIntent.NextActionData.DisplayOxxoDetails) nextActionData : null;
                if (displayOxxoDetails != null) {
                    writableNativeMap.putString("type", "oxxoVoucher");
                    writableNativeMap.putInt("expiration", displayOxxoDetails.getExpiresAfter());
                    writableNativeMap.putString("voucherURL", displayOxxoDetails.getHostedVoucherUrl());
                    writableNativeMap.putString("voucherNumber", displayOxxoDetails.getNumber());
                    break;
                }
                break;
            case 4:
                StripeIntent.NextActionData.WeChatPayRedirect weChatPayRedirect = nextActionData instanceof StripeIntent.NextActionData.WeChatPayRedirect ? (StripeIntent.NextActionData.WeChatPayRedirect) nextActionData : null;
                if (weChatPayRedirect != null) {
                    writableNativeMap.putString("type", "weChatRedirect");
                    writableNativeMap.putString("redirectUrl", weChatPayRedirect.getWeChat().getQrCodeUrl());
                    break;
                }
                break;
            case 5:
                return null;
        }
        return writableNativeMap;
    }

    public static final String E(PaymentMethod.Type type) {
        switch (type == null ? -1 : a.f29408e[type.ordinal()]) {
            case 1:
                return "AfterpayClearpay";
            case 2:
                return "Alipay";
            case 3:
                return "AuBecsDebit";
            case 4:
                return "BacsDebit";
            case 5:
                return "Bancontact";
            case 6:
                return "Card";
            case 7:
                return "CardPresent";
            case 8:
                return "Eps";
            case 9:
                return "Fpx";
            case 10:
                return "Giropay";
            case 11:
                return "GrabPay";
            case 12:
                return "Ideal";
            case 13:
                return "Netbanking";
            case 14:
                return "Oxxo";
            case 15:
                return "P24";
            case 16:
                return "SepaDebit";
            case 17:
                return "Sofort";
            case 18:
                return "Upi";
            case 19:
                return "WeChatPay";
            case 20:
                return "Klarna";
            case 21:
                return "USBankAccount";
            case 22:
                return "PayPal";
            case 23:
                return "Affirm";
            default:
                return "Unknown";
        }
    }

    public static final String F(StripeIntent.Usage usage) {
        int i11 = usage == null ? -1 : a.f29418o[usage.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? "Unknown" : "OneTime" : "OnSession" : "OffSession";
    }

    public static final Address G(ReadableMap readableMap, Address address) {
        Address.Builder builder = new Address.Builder();
        if (readableMap != null) {
            builder.setPostalCode(j(readableMap, "postalCode", null, 4, null)).setCity(j(readableMap, "city", null, 4, null)).setCountry(j(readableMap, "country", null, 4, null)).setLine1(j(readableMap, "line1", null, 4, null)).setLine2(j(readableMap, "line2", null, 4, null)).setState(j(readableMap, "state", null, 4, null));
        }
        if (address != null) {
            String postalCode = address.getPostalCode();
            boolean z11 = false;
            if (!(postalCode == null || postalCode.length() == 0)) {
                builder.setPostalCode(address.getPostalCode());
            }
            String country = address.getCountry();
            if (country == null || country.length() == 0) {
                z11 = true;
            }
            if (!z11) {
                builder.setCountry(address.getCountry());
            }
        }
        return builder.build();
    }

    public static final BankAccountTokenParams.Type H(String str) {
        return s.c(str, "Company") ? BankAccountTokenParams.Type.Company : s.c(str, "Individual") ? BankAccountTokenParams.Type.Individual : BankAccountTokenParams.Type.Individual;
    }

    public static final PaymentMethod.BillingDetails I(ReadableMap readableMap, Address address) {
        if (readableMap == null && address == null) {
            return null;
        }
        Address G = G(g(readableMap, "address"), address);
        PaymentMethod.BillingDetails.Builder builder = new PaymentMethod.BillingDetails.Builder();
        if (readableMap != null) {
            builder.setName(j(readableMap, "name", null, 4, null)).setPhone(j(readableMap, PaymentMethod.BillingDetails.PARAM_PHONE, null, 4, null)).setEmail(j(readableMap, "email", null, 4, null));
        }
        builder.setAddress(G);
        return builder.build();
    }

    public static final ConfirmPaymentIntentParams.SetupFutureUsage J(String str) {
        if (s.c(str, "OffSession")) {
            return ConfirmPaymentIntentParams.SetupFutureUsage.OffSession;
        }
        if (s.c(str, "OnSession")) {
            return ConfirmPaymentIntentParams.SetupFutureUsage.OnSession;
        }
        return null;
    }

    public static final PaymentMethod.Type K(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -2045037915:
                    if (str.equals("Klarna")) {
                        return PaymentMethod.Type.Klarna;
                    }
                    break;
                case -1911368973:
                    if (str.equals("PayPal")) {
                        return PaymentMethod.Type.PayPal;
                    }
                    break;
                case -1813087929:
                    if (str.equals("Sofort")) {
                        return PaymentMethod.Type.Sofort;
                    }
                    break;
                case -752190179:
                    if (str.equals("BacsDebit")) {
                        return PaymentMethod.Type.BacsDebit;
                    }
                    break;
                case -600549687:
                    if (str.equals("SepaDebit")) {
                        return PaymentMethod.Type.SepaDebit;
                    }
                    break;
                case -529183021:
                    if (str.equals("USBankAccount")) {
                        return PaymentMethod.Type.USBankAccount;
                    }
                    break;
                case -430881083:
                    if (str.equals("AuBecsDebit")) {
                        return PaymentMethod.Type.AuBecsDebit;
                    }
                    break;
                case -346968055:
                    if (str.equals("Netbanking")) {
                        return PaymentMethod.Type.Netbanking;
                    }
                    break;
                case -302881593:
                    if (str.equals("AfterpayClearpay")) {
                        return PaymentMethod.Type.AfterpayClearpay;
                    }
                    break;
                case -295777438:
                    if (str.equals("WeChatPay")) {
                        return PaymentMethod.Type.WeChatPay;
                    }
                    break;
                case 69896:
                    if (str.equals("Eps")) {
                        return PaymentMethod.Type.Eps;
                    }
                    break;
                case 70862:
                    if (str.equals("Fpx")) {
                        return PaymentMethod.Type.Fpx;
                    }
                    break;
                case 78482:
                    if (str.equals("P24")) {
                        return PaymentMethod.Type.P24;
                    }
                    break;
                case 85262:
                    if (str.equals("Upi")) {
                        return PaymentMethod.Type.Upi;
                    }
                    break;
                case 2092848:
                    if (str.equals("Card")) {
                        return PaymentMethod.Type.Card;
                    }
                    break;
                case 2472640:
                    if (str.equals("Oxxo")) {
                        return PaymentMethod.Type.Oxxo;
                    }
                    break;
                case 70496309:
                    if (str.equals("Ideal")) {
                        return PaymentMethod.Type.Ideal;
                    }
                    break;
                case 72721745:
                    if (str.equals("Bancontact")) {
                        return PaymentMethod.Type.Bancontact;
                    }
                    break;
                case 1703011721:
                    if (str.equals("Giropay")) {
                        return PaymentMethod.Type.Giropay;
                    }
                    break;
                case 1918741355:
                    if (str.equals("CardPresent")) {
                        return PaymentMethod.Type.CardPresent;
                    }
                    break;
                case 1944556188:
                    if (str.equals("GrabPay")) {
                        return PaymentMethod.Type.GrabPay;
                    }
                    break;
                case 1958237187:
                    if (str.equals("Affirm")) {
                        return PaymentMethod.Type.Affirm;
                    }
                    break;
                case 1963873898:
                    if (str.equals("Alipay")) {
                        return PaymentMethod.Type.Alipay;
                    }
                    break;
            }
        }
        return null;
    }

    public static final String L(String str) {
        if (str != null) {
            return s.p(str, "://safepay");
        }
        return null;
    }

    public static final ConfirmPaymentIntentParams.Shipping M(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        Address G = G(g(readableMap, "address"), null);
        String j11 = j(readableMap, "name", null, 4, null);
        if (j11 == null) {
            j11 = "";
        }
        return new ConfirmPaymentIntentParams.Shipping(G, j11, null, null, null, 28, null);
    }

    public static final PaymentAuthConfig.Stripe3ds2UiCustomization N(ReadableMap params) {
        PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder builder;
        s.g(params, "params");
        ReadableMap g11 = g(params, "label");
        ReadableMap map = params.getMap("navigationBar");
        ReadableMap g12 = g(params, "textField");
        ReadableMap g13 = g(params, "submitButton");
        ReadableMap g14 = g(params, "cancelButton");
        ReadableMap g15 = g(params, "nextButton");
        ReadableMap g16 = g(params, "continueButton");
        ReadableMap g17 = g(params, "resendButton");
        PaymentAuthConfig.Stripe3ds2LabelCustomization.Builder builder2 = new PaymentAuthConfig.Stripe3ds2LabelCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ToolbarCustomization.Builder builder3 = new PaymentAuthConfig.Stripe3ds2ToolbarCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2TextBoxCustomization.Builder builder4 = new PaymentAuthConfig.Stripe3ds2TextBoxCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder builder5 = new PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder builder6 = new PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder builder7 = new PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder builder8 = new PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder();
        PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder builder9 = new PaymentAuthConfig.Stripe3ds2ButtonCustomization.Builder();
        String h11 = h(g11, "headingTextColor");
        if (h11 != null) {
            builder2.setHeadingTextColor(h11);
        }
        String h12 = h(g11, "textColor");
        if (h12 != null) {
            builder2.setTextColor(h12);
        }
        Integer f11 = f(g11, "headingFontSize");
        if (f11 != null) {
            builder2.setHeadingTextFontSize(f11.intValue());
        }
        Integer f12 = f(g11, "textFontSize");
        if (f12 != null) {
            builder2.setTextFontSize(f12.intValue());
        }
        String h13 = h(map, "headerText");
        if (h13 != null) {
            builder3.setHeaderText(h13);
        }
        String h14 = h(map, "buttonText");
        if (h14 != null) {
            builder3.setButtonText(h14);
        }
        String h15 = h(map, "textColor");
        if (h15 != null) {
            builder3.setTextColor(h15);
        }
        String h16 = h(map, "statusBarColor");
        if (h16 != null) {
            builder3.setStatusBarColor(h16);
        }
        String h17 = h(map, "backgroundColor");
        if (h17 != null) {
            builder3.setBackgroundColor(h17);
        }
        Integer f13 = f(map, "textFontSize");
        if (f13 != null) {
            builder3.setTextFontSize(f13.intValue());
        }
        String h18 = h(g12, "borderColor");
        if (h18 != null) {
            builder4.setBorderColor(h18);
        }
        String h19 = h(g12, "textColor");
        if (h19 != null) {
            builder4.setTextColor(h19);
        }
        Integer f14 = f(g12, "borderWidth");
        if (f14 != null) {
            builder4.setBorderWidth(f14.intValue());
        }
        Integer f15 = f(g12, "borderRadius");
        if (f15 != null) {
            builder4.setCornerRadius(f15.intValue());
        }
        Integer f16 = f(g12, "textFontSize");
        if (f16 != null) {
            builder4.setTextFontSize(f16.intValue());
        }
        String h21 = h(g13, "backgroundColor");
        if (h21 != null) {
            builder5.setBackgroundColor(h21);
        }
        Integer f17 = f(g13, "borderRadius");
        if (f17 != null) {
            builder5.setCornerRadius(f17.intValue());
        }
        String h22 = h(g13, "textColor");
        if (h22 != null) {
            builder5.setTextColor(h22);
        }
        Integer f18 = f(g13, "textFontSize");
        if (f18 != null) {
            builder5.setTextFontSize(f18.intValue());
        }
        String h23 = h(g14, "backgroundColor");
        if (h23 != null) {
            builder6.setBackgroundColor(h23);
        }
        Integer f19 = f(g14, "borderRadius");
        if (f19 != null) {
            builder6.setCornerRadius(f19.intValue());
        }
        String h24 = h(g14, "textColor");
        if (h24 != null) {
            builder6.setTextColor(h24);
        }
        Integer f21 = f(g14, "textFontSize");
        if (f21 != null) {
            builder6.setTextFontSize(f21.intValue());
        }
        String h25 = h(g16, "backgroundColor");
        if (h25 != null) {
            builder8.setBackgroundColor(h25);
        }
        Integer f22 = f(g16, "borderRadius");
        if (f22 != null) {
            builder8.setCornerRadius(f22.intValue());
        }
        String h26 = h(g16, "textColor");
        if (h26 != null) {
            builder8.setTextColor(h26);
        }
        Integer f23 = f(g16, "textFontSize");
        if (f23 != null) {
            builder8.setTextFontSize(f23.intValue());
        }
        String h27 = h(g15, "backgroundColor");
        if (h27 != null) {
            builder7.setBackgroundColor(h27);
        }
        Integer f24 = f(g15, "borderRadius");
        if (f24 != null) {
            builder7.setCornerRadius(f24.intValue());
        }
        String h28 = h(g15, "textColor");
        if (h28 != null) {
            builder7.setTextColor(h28);
        }
        Integer f25 = f(g15, "textFontSize");
        if (f25 != null) {
            builder7.setTextFontSize(f25.intValue());
        }
        String h29 = h(g17, "backgroundColor");
        if (h29 == null) {
            builder = builder9;
        } else {
            builder = builder9;
            builder.setBackgroundColor(h29);
        }
        Integer f26 = f(g17, "borderRadius");
        if (f26 != null) {
            builder.setCornerRadius(f26.intValue());
        }
        String h31 = h(g17, "textColor");
        if (h31 != null) {
            builder.setTextColor(h31);
        }
        Integer f27 = f(g17, "textFontSize");
        if (f27 != null) {
            builder.setTextFontSize(f27.intValue());
        }
        PaymentAuthConfig.Stripe3ds2UiCustomization.Builder buttonCustomization = new PaymentAuthConfig.Stripe3ds2UiCustomization.Builder().setLabelCustomization(builder2.build()).setToolbarCustomization(builder3.build()).setButtonCustomization(builder5.build(), PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType.SUBMIT).setButtonCustomization(builder8.build(), PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType.CONTINUE).setButtonCustomization(builder7.build(), PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType.SELECT).setButtonCustomization(builder6.build(), PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType.CANCEL).setButtonCustomization(builder.build(), PaymentAuthConfig.Stripe3ds2UiCustomization.ButtonType.RESEND);
        String h32 = h(params, "accentColor");
        if (h32 != null) {
            buttonCustomization.setAccentColor(h32);
        }
        return buttonCustomization.build();
    }

    public static final PaymentMethod.USBankAccount.USBankAccountHolderType O(String str) {
        return s.c(str, "Company") ? PaymentMethod.USBankAccount.USBankAccountHolderType.COMPANY : s.c(str, "Individual") ? PaymentMethod.USBankAccount.USBankAccountHolderType.INDIVIDUAL : PaymentMethod.USBankAccount.USBankAccountHolderType.INDIVIDUAL;
    }

    public static final PaymentMethod.USBankAccount.USBankAccountType P(String str) {
        return s.c(str, "Savings") ? PaymentMethod.USBankAccount.USBankAccountType.SAVINGS : s.c(str, "Checking") ? PaymentMethod.USBankAccount.USBankAccountType.CHECKING : PaymentMethod.USBankAccount.USBankAccountType.CHECKING;
    }

    public static final String Q(Token.Type type) {
        s.g(type, "type");
        switch (a.f29409f[type.ordinal()]) {
            case 1:
                return "Account";
            case 2:
                return "BankAccount";
            case 3:
                return "Card";
            case 4:
                return "CvcUpdate";
            case 5:
                return "Person";
            case 6:
                return "Pii";
            default:
                return "Unknown";
        }
    }

    public static final Bundle R(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap == null) {
            return bundle;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        s.f(keySetIterator, "readableMap.keySetIterator()");
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (a.f29419p[readableMap.getType(nextKey).ordinal()]) {
                case 1:
                    bundle.putString(nextKey, null);
                    break;
                case 2:
                    bundle.putBoolean(nextKey, readableMap.getBoolean(nextKey));
                    break;
                case 3:
                    try {
                        bundle.putInt(nextKey, readableMap.getInt(nextKey));
                        break;
                    } catch (Exception unused) {
                        bundle.putDouble(nextKey, readableMap.getDouble(nextKey));
                        break;
                    }
                case 4:
                    bundle.putString(nextKey, readableMap.getString(nextKey));
                    break;
                case 5:
                    bundle.putBundle(nextKey, R(readableMap.getMap(nextKey)));
                    break;
                case 6:
                    Log.e("toBundleException", "Cannot put arrays of objects into bundles. Failed on: " + ((Object) nextKey) + CoreConstants.DOT);
                    break;
                default:
                    Log.e("toBundleException", "Could not convert object with key: " + ((Object) nextKey) + CoreConstants.DOT);
                    break;
            }
        }
        return bundle;
    }

    private static final String a(long j11) {
        return String.valueOf(j11 * 1000);
    }

    public static final WritableNativeMap b(boolean z11, String str, WritableMap writableMap) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        if (str != null) {
            writableNativeMap.putBoolean("canAddCard", false);
            writableNativeMap2.putString(PermissionsResponse.STATUS_KEY, str);
        } else {
            writableNativeMap.putBoolean("canAddCard", z11);
            if (writableMap != null) {
                writableNativeMap2.putMap("token", writableMap);
            }
        }
        writableNativeMap.putMap(ErrorBundle.DETAIL_ENTRY, writableNativeMap2);
        return writableNativeMap;
    }

    public static /* synthetic */ WritableNativeMap c(boolean z11, String str, WritableMap writableMap, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        if ((i11 & 4) != 0) {
            writableMap = null;
        }
        return b(z11, str, writableMap);
    }

    public static final WritableMap d(String key, WritableMap value) {
        s.g(key, "key");
        s.g(value, "value");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putMap(key, value);
        return writableNativeMap;
    }

    public static final boolean e(ReadableMap readableMap, String key) {
        s.g(key, "key");
        if (readableMap != null && readableMap.hasKey(key)) {
            return readableMap.getBoolean(key);
        }
        return false;
    }

    public static final Integer f(ReadableMap readableMap, String key) {
        s.g(key, "key");
        boolean z11 = false;
        if (readableMap != null && readableMap.hasKey(key)) {
            z11 = true;
        }
        if (z11) {
            return Integer.valueOf(readableMap.getInt(key));
        }
        return null;
    }

    public static final ReadableMap g(ReadableMap readableMap, String key) {
        s.g(key, "key");
        boolean z11 = false;
        if (readableMap != null && readableMap.hasKey(key)) {
            z11 = true;
        }
        if (z11) {
            return readableMap.getMap(key);
        }
        return null;
    }

    private static final String h(ReadableMap readableMap, String str) {
        boolean z11 = false;
        if (readableMap != null && readableMap.hasKey(str)) {
            z11 = true;
        }
        if (z11) {
            return readableMap.getString(str);
        }
        return null;
    }

    public static final String i(ReadableMap readableMap, String key, String str) {
        s.g(key, "key");
        if (readableMap == null) {
            return str;
        }
        String string = readableMap.hasKey(key) ? readableMap.getString(key) : str;
        return string == null ? str : string;
    }

    public static /* synthetic */ String j(ReadableMap readableMap, String str, String str2, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str2 = "";
        }
        return i(readableMap, str, str2);
    }

    public static final String k(PaymentIntent.CaptureMethod captureMethod) {
        int i11 = captureMethod == null ? -1 : a.f29405b[captureMethod.ordinal()];
        return i11 != 1 ? i11 != 2 ? "Unknown" : "Manual" : "Automatic";
    }

    public static final String l(CardBrand cardBrand) {
        switch (cardBrand == null ? -1 : a.f29407d[cardBrand.ordinal()]) {
            case 1:
                return "AmericanExpress";
            case 2:
                return "DinersClub";
            case 3:
                return "Discover";
            case 4:
                return "JCB";
            case 5:
                return "MasterCard";
            case 6:
                return "UnionPay";
            case 7:
                return "Visa";
            case 8:
            default:
                return "Unknown";
        }
    }

    public static final String m(PaymentIntent.ConfirmationMethod confirmationMethod) {
        int i11 = confirmationMethod == null ? -1 : a.f29406c[confirmationMethod.ordinal()];
        return i11 != 1 ? i11 != 2 ? "Unknown" : "Manual" : "Automatic";
    }

    public static final WritableMap n(BankAccount bankAccount) {
        if (bankAccount == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", bankAccount.getId());
        writableNativeMap.putString("bankName", bankAccount.getBankName());
        writableNativeMap.putString("accountHolderName", bankAccount.getAccountHolderName());
        writableNativeMap.putString("accountHolderType", p(bankAccount.getAccountHolderType()));
        writableNativeMap.putString("currency", bankAccount.getCurrency());
        writableNativeMap.putString("country", bankAccount.getCountryCode());
        writableNativeMap.putString("routingNumber", bankAccount.getRoutingNumber());
        writableNativeMap.putString(PermissionsResponse.STATUS_KEY, o(bankAccount.getStatus()));
        writableNativeMap.putString("fingerprint", bankAccount.getFingerprint());
        writableNativeMap.putString("last4", bankAccount.getLast4());
        return writableNativeMap;
    }

    public static final String o(BankAccount.Status status) {
        int i11 = status == null ? -1 : a.f29411h[status.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? i11 != 5 ? "Unknown" : "Verified" : "VerificationFailed" : "Validated" : "New" : "Errored";
    }

    public static final String p(BankAccount.Type type) {
        int i11 = type == null ? -1 : a.f29410g[type.ordinal()];
        return i11 != 1 ? i11 != 2 ? "Unknown" : "Individual" : "Company";
    }

    public static final WritableMap q(PaymentMethod.BillingDetails billingDetails) {
        Address address;
        Address address2;
        Address address3;
        Address address4;
        Address address5;
        Address address6;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString("country", (billingDetails == null || (address = billingDetails.address) == null) ? null : address.getCountry());
        writableNativeMap2.putString("city", (billingDetails == null || (address2 = billingDetails.address) == null) ? null : address2.getCity());
        writableNativeMap2.putString("line1", (billingDetails == null || (address3 = billingDetails.address) == null) ? null : address3.getLine1());
        writableNativeMap2.putString("line2", (billingDetails == null || (address4 = billingDetails.address) == null) ? null : address4.getLine2());
        writableNativeMap2.putString("postalCode", (billingDetails == null || (address5 = billingDetails.address) == null) ? null : address5.getPostalCode());
        writableNativeMap2.putString("state", (billingDetails == null || (address6 = billingDetails.address) == null) ? null : address6.getState());
        writableNativeMap.putString("email", billingDetails == null ? null : billingDetails.email);
        writableNativeMap.putString(PaymentMethod.BillingDetails.PARAM_PHONE, billingDetails == null ? null : billingDetails.phone);
        writableNativeMap.putString("name", billingDetails != null ? billingDetails.name : null);
        writableNativeMap.putMap("address", writableNativeMap2);
        return writableNativeMap;
    }

    public static final WritableMap r(Card card) {
        b0 b0Var;
        b0 b0Var2;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (card == null) {
            return null;
        }
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap.putString("country", card.getCountry());
        writableNativeMap.putString(AccountRangeJsonParser.FIELD_BRAND, l(card.getBrand()));
        writableNativeMap.putString("currency", card.getCurrency());
        Integer expMonth = card.getExpMonth();
        if (expMonth == null) {
            b0Var = null;
        } else {
            writableNativeMap.putInt("expMonth", expMonth.intValue());
            b0Var = b0.f54756a;
        }
        if (b0Var == null) {
            writableNativeMap.putNull("expMonth");
        }
        Integer expYear = card.getExpYear();
        if (expYear == null) {
            b0Var2 = null;
        } else {
            writableNativeMap.putInt("expYear", expYear.intValue());
            b0Var2 = b0.f54756a;
        }
        if (b0Var2 == null) {
            writableNativeMap.putNull("expYear");
        }
        writableNativeMap.putString("id", card.getId());
        writableNativeMap.putString("last4", card.getLast4());
        CardFunding funding = card.getFunding();
        writableNativeMap.putString("funding", funding != null ? funding.name() : null);
        writableNativeMap.putString("name", card.getName());
        writableNativeMap2.putString("city", card.getAddressCity());
        writableNativeMap2.putString("country", card.getAddressCountry());
        writableNativeMap2.putString("line1", card.getAddressLine1());
        writableNativeMap2.putString("line2", card.getAddressLine2());
        writableNativeMap2.putString("state", card.getAddressState());
        writableNativeMap2.putString("postalCode", card.getAddressZip());
        writableNativeMap.putMap("address", writableNativeMap2);
        return writableNativeMap;
    }

    public static final String s(MicrodepositType type) {
        s.g(type, "type");
        int i11 = a.f29414k[type.ordinal()];
        return i11 != 1 ? i11 != 2 ? "unknown" : "descriptorCode" : "amounts";
    }

    public static final String t(PaymentIntent.Error.Type type) {
        switch (type == null ? -1 : a.f29416m[type.ordinal()]) {
            case 1:
                return "api_connection_error";
            case 2:
                return "authentication_error";
            case 3:
                return "api_error";
            case 4:
                return "card_error";
            case 5:
                return "idempotency_error";
            case 6:
                return "invalid_request_error";
            case 7:
                return "rate_limit_error";
            default:
                return null;
        }
    }

    public static final WritableMap u(PaymentIntent paymentIntent) {
        PaymentMethod paymentMethod;
        s.g(paymentIntent, "paymentIntent");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", paymentIntent.getId());
        writableNativeMap.putString("clientSecret", paymentIntent.getClientSecret());
        writableNativeMap.putBoolean("livemode", paymentIntent.isLiveMode());
        writableNativeMap.putString("paymentMethodId", paymentIntent.getPaymentMethodId());
        writableNativeMap.putString("receiptEmail", paymentIntent.getReceiptEmail());
        writableNativeMap.putString("currency", paymentIntent.getCurrency());
        writableNativeMap.putString(PermissionsResponse.STATUS_KEY, C(paymentIntent.getStatus()));
        writableNativeMap.putString("description", paymentIntent.getDescription());
        writableNativeMap.putString("receiptEmail", paymentIntent.getReceiptEmail());
        writableNativeMap.putString("created", a(paymentIntent.getCreated()));
        writableNativeMap.putString("captureMethod", k(paymentIntent.getCaptureMethod()));
        writableNativeMap.putString("confirmationMethod", m(paymentIntent.getConfirmationMethod()));
        writableNativeMap.putMap("nextAction", D(paymentIntent.getNextActionType(), paymentIntent.getNextActionData()));
        writableNativeMap.putNull("lastPaymentError");
        writableNativeMap.putNull("shipping");
        writableNativeMap.putNull(BaseSheetViewModel.SAVE_AMOUNT);
        writableNativeMap.putNull("canceledAt");
        PaymentIntent.Error lastPaymentError = paymentIntent.getLastPaymentError();
        if (lastPaymentError != null) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString(PaymentMethodOptionsParams.Blik.PARAM_CODE, lastPaymentError.getCode());
            writableNativeMap2.putString("message", lastPaymentError.getMessage());
            writableNativeMap2.putString("type", t(lastPaymentError.getType()));
            writableNativeMap2.putString("declineCode", lastPaymentError.getDeclineCode());
            PaymentIntent.Error lastPaymentError2 = paymentIntent.getLastPaymentError();
            if (lastPaymentError2 != null && (paymentMethod = lastPaymentError2.getPaymentMethod()) != null) {
                writableNativeMap2.putMap("paymentMethod", v(paymentMethod));
            }
            writableNativeMap.putMap("lastPaymentError", writableNativeMap2);
        }
        PaymentIntent.Shipping shipping = paymentIntent.getShipping();
        if (shipping != null) {
            writableNativeMap.putMap("shipping", B(shipping));
        }
        Long amount = paymentIntent.getAmount();
        if (amount != null) {
            writableNativeMap.putDouble(BaseSheetViewModel.SAVE_AMOUNT, amount.longValue());
        }
        writableNativeMap.putString("canceledAt", a(paymentIntent.getCanceledAt()));
        return writableNativeMap;
    }

    public static final WritableMap v(PaymentMethod paymentMethod) {
        String str;
        WritableNativeMap writableNativeMap;
        PaymentMethod.USBankAccount.USBankNetworks uSBankNetworks;
        PaymentMethod.USBankAccount.USBankNetworks uSBankNetworks2;
        Integer num;
        Integer num2;
        s.g(paymentMethod, "paymentMethod");
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        WritableNativeMap writableNativeMap3 = new WritableNativeMap();
        WritableNativeMap writableNativeMap4 = new WritableNativeMap();
        WritableNativeMap writableNativeMap5 = new WritableNativeMap();
        WritableNativeMap writableNativeMap6 = new WritableNativeMap();
        WritableNativeMap writableNativeMap7 = new WritableNativeMap();
        WritableNativeMap writableNativeMap8 = new WritableNativeMap();
        WritableNativeMap writableNativeMap9 = new WritableNativeMap();
        WritableNativeMap writableNativeMap10 = new WritableNativeMap();
        WritableNativeMap writableNativeMap11 = new WritableNativeMap();
        PaymentMethod.Card card = paymentMethod.card;
        writableNativeMap3.putString(AccountRangeJsonParser.FIELD_BRAND, l(card == null ? null : card.brand));
        PaymentMethod.Card card2 = paymentMethod.card;
        writableNativeMap3.putString("country", card2 == null ? null : card2.country);
        PaymentMethod.Card card3 = paymentMethod.card;
        if (card3 != null && (num2 = card3.expiryYear) != null) {
            writableNativeMap3.putInt("expYear", num2.intValue());
        }
        PaymentMethod.Card card4 = paymentMethod.card;
        if (card4 != null && (num = card4.expiryMonth) != null) {
            writableNativeMap3.putInt("expMonth", num.intValue());
        }
        PaymentMethod.Card card5 = paymentMethod.card;
        writableNativeMap3.putString("funding", card5 == null ? null : card5.funding);
        PaymentMethod.Card card6 = paymentMethod.card;
        writableNativeMap3.putString("last4", card6 == null ? null : card6.last4);
        PaymentMethod.Card card7 = paymentMethod.card;
        writableNativeMap3.putString("fingerprint", card7 == null ? null : card7.fingerprint);
        PaymentMethod.SepaDebit sepaDebit = paymentMethod.sepaDebit;
        writableNativeMap4.putString("bankCode", sepaDebit == null ? null : sepaDebit.bankCode);
        PaymentMethod.SepaDebit sepaDebit2 = paymentMethod.sepaDebit;
        writableNativeMap4.putString("country", sepaDebit2 == null ? null : sepaDebit2.country);
        PaymentMethod.SepaDebit sepaDebit3 = paymentMethod.sepaDebit;
        writableNativeMap4.putString("fingerprint", sepaDebit3 == null ? null : sepaDebit3.fingerprint);
        PaymentMethod.SepaDebit sepaDebit4 = paymentMethod.sepaDebit;
        writableNativeMap4.putString("last4", sepaDebit4 == null ? null : sepaDebit4.branchCode);
        PaymentMethod.BacsDebit bacsDebit = paymentMethod.bacsDebit;
        writableNativeMap5.putString("fingerprint", bacsDebit == null ? null : bacsDebit.fingerprint);
        PaymentMethod.BacsDebit bacsDebit2 = paymentMethod.bacsDebit;
        writableNativeMap5.putString("last4", bacsDebit2 == null ? null : bacsDebit2.last4);
        PaymentMethod.BacsDebit bacsDebit3 = paymentMethod.bacsDebit;
        writableNativeMap5.putString("sortCode", bacsDebit3 == null ? null : bacsDebit3.sortCode);
        PaymentMethod.BacsDebit bacsDebit4 = paymentMethod.bacsDebit;
        writableNativeMap6.putString("bsbNumber", bacsDebit4 == null ? null : bacsDebit4.sortCode);
        PaymentMethod.BacsDebit bacsDebit5 = paymentMethod.bacsDebit;
        writableNativeMap6.putString("fingerprint", bacsDebit5 == null ? null : bacsDebit5.fingerprint);
        PaymentMethod.BacsDebit bacsDebit6 = paymentMethod.bacsDebit;
        writableNativeMap6.putString("last4", bacsDebit6 == null ? null : bacsDebit6.last4);
        PaymentMethod.Sofort sofort = paymentMethod.sofort;
        writableNativeMap7.putString("country", sofort == null ? null : sofort.country);
        PaymentMethod.Ideal ideal = paymentMethod.ideal;
        writableNativeMap8.putString("bankName", ideal == null ? null : ideal.bank);
        PaymentMethod.Ideal ideal2 = paymentMethod.ideal;
        writableNativeMap8.putString("bankIdentifierCode", ideal2 == null ? null : ideal2.bankIdentifierCode);
        PaymentMethod.Fpx fpx = paymentMethod.fpx;
        writableNativeMap9.putString("accountHolderType", fpx == null ? null : fpx.accountHolderType);
        PaymentMethod.Fpx fpx2 = paymentMethod.fpx;
        if (fpx2 == null) {
            writableNativeMap = writableNativeMap8;
            str = null;
        } else {
            str = fpx2.bank;
            writableNativeMap = writableNativeMap8;
        }
        writableNativeMap9.putString(PlaceTypes.BANK, str);
        PaymentMethod.Upi upi = paymentMethod.upi;
        writableNativeMap10.putString("vpa", upi == null ? null : upi.vpa);
        PaymentMethod.USBankAccount uSBankAccount = paymentMethod.usBankAccount;
        writableNativeMap11.putString("routingNumber", uSBankAccount == null ? null : uSBankAccount.routingNumber);
        PaymentMethod.USBankAccount uSBankAccount2 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("accountType", A(uSBankAccount2 == null ? null : uSBankAccount2.accountType));
        PaymentMethod.USBankAccount uSBankAccount3 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("accountHolderType", z(uSBankAccount3 == null ? null : uSBankAccount3.accountHolderType));
        PaymentMethod.USBankAccount uSBankAccount4 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("last4", uSBankAccount4 == null ? null : uSBankAccount4.last4);
        PaymentMethod.USBankAccount uSBankAccount5 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("bankName", uSBankAccount5 == null ? null : uSBankAccount5.bankName);
        PaymentMethod.USBankAccount uSBankAccount6 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("linkedAccount", uSBankAccount6 == null ? null : uSBankAccount6.linkedAccount);
        PaymentMethod.USBankAccount uSBankAccount7 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("fingerprint", uSBankAccount7 == null ? null : uSBankAccount7.fingerprint);
        PaymentMethod.USBankAccount uSBankAccount8 = paymentMethod.usBankAccount;
        writableNativeMap11.putString("preferredNetworks", (uSBankAccount8 == null || (uSBankNetworks = uSBankAccount8.networks) == null) ? null : uSBankNetworks.getPreferred());
        PaymentMethod.USBankAccount uSBankAccount9 = paymentMethod.usBankAccount;
        List<String> supported = (uSBankAccount9 == null || (uSBankNetworks2 = uSBankAccount9.networks) == null) ? null : uSBankNetworks2.getSupported();
        writableNativeMap11.putArray("supportedNetworks", supported instanceof ReadableArray ? (ReadableArray) supported : null);
        writableNativeMap2.putString("id", paymentMethod.f20932id);
        writableNativeMap2.putString(Action.PAYMENT_METHOD_TYPE, E(paymentMethod.type));
        writableNativeMap2.putBoolean("livemode", paymentMethod.liveMode);
        writableNativeMap2.putString("customerId", paymentMethod.customerId);
        writableNativeMap2.putMap("billingDetails", q(paymentMethod.billingDetails));
        writableNativeMap2.putMap("Card", writableNativeMap3);
        writableNativeMap2.putMap("SepaDebit", writableNativeMap4);
        writableNativeMap2.putMap("BacsDebit", writableNativeMap5);
        writableNativeMap2.putMap("AuBecsDebit", writableNativeMap6);
        writableNativeMap2.putMap("Sofort", writableNativeMap7);
        writableNativeMap2.putMap("Ideal", writableNativeMap);
        writableNativeMap2.putMap("Fpx", writableNativeMap9);
        writableNativeMap2.putMap("Upi", writableNativeMap10);
        writableNativeMap2.putMap("USBankAccount", writableNativeMap11);
        return writableNativeMap2;
    }

    public static final String w(SetupIntent.Error.Type type) {
        switch (type == null ? -1 : a.f29417n[type.ordinal()]) {
            case 1:
                return "api_connection_error";
            case 2:
                return "authentication_error";
            case 3:
                return "api_error";
            case 4:
                return "card_error";
            case 5:
                return "idempotency_error";
            case 6:
                return "invalid_request_error";
            case 7:
                return "rate_limit_error";
            default:
                return null;
        }
    }

    public static final WritableMap x(SetupIntent setupIntent) {
        PaymentMethod.Type type;
        PaymentMethod paymentMethod;
        s.g(setupIntent, "setupIntent");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableArray createArray = Arguments.createArray();
        s.f(createArray, "createArray()");
        writableNativeMap.putString("id", setupIntent.getId());
        writableNativeMap.putString(PermissionsResponse.STATUS_KEY, C(setupIntent.getStatus()));
        writableNativeMap.putString("description", setupIntent.getDescription());
        writableNativeMap.putBoolean("livemode", setupIntent.isLiveMode());
        writableNativeMap.putString("clientSecret", setupIntent.getClientSecret());
        writableNativeMap.putString("paymentMethodId", setupIntent.getPaymentMethodId());
        writableNativeMap.putString(PaymentSheetEvent.FIELD_APPEARANCE_USAGE, F(setupIntent.getUsage()));
        writableNativeMap.putString("created", a(setupIntent.getCreated()));
        writableNativeMap.putMap("nextAction", D(setupIntent.getNextActionType(), setupIntent.getNextActionData()));
        SetupIntent.Error lastSetupError = setupIntent.getLastSetupError();
        if (lastSetupError != null) {
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            writableNativeMap2.putString(PaymentMethodOptionsParams.Blik.PARAM_CODE, lastSetupError.getCode());
            writableNativeMap2.putString("message", lastSetupError.getMessage());
            writableNativeMap2.putString("type", w(lastSetupError.getType()));
            writableNativeMap2.putString("declineCode", lastSetupError.getDeclineCode());
            SetupIntent.Error lastSetupError2 = setupIntent.getLastSetupError();
            if (lastSetupError2 != null && (paymentMethod = lastSetupError2.getPaymentMethod()) != null) {
                writableNativeMap2.putMap("paymentMethod", v(paymentMethod));
            }
            writableNativeMap.putMap("lastSetupError", writableNativeMap2);
        }
        for (String str : setupIntent.getPaymentMethodTypes()) {
            PaymentMethod.Type[] values = PaymentMethod.Type.values();
            int i11 = 0;
            int length = values.length;
            while (true) {
                if (i11 >= length) {
                    type = null;
                    break;
                }
                type = values[i11];
                if (s.c(str, type.code)) {
                    break;
                }
                i11++;
            }
            if (type != null) {
                createArray.pushString(E(type));
            }
        }
        writableNativeMap.putArray("paymentMethodTypes", createArray);
        return writableNativeMap;
    }

    public static final WritableMap y(Token token) {
        s.g(token, "token");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putString("id", token.getId());
        writableNativeMap.putDouble("created", token.getCreated().getTime());
        writableNativeMap.putString("type", Q(token.getType()));
        writableNativeMap.putBoolean("livemode", token.getLivemode());
        writableNativeMap.putMap("bankAccount", n(token.getBankAccount()));
        writableNativeMap.putMap("card", r(token.getCard()));
        writableNativeMap.putBoolean("used", token.getUsed());
        return writableNativeMap;
    }

    public static final String z(PaymentMethod.USBankAccount.USBankAccountHolderType uSBankAccountHolderType) {
        int i11 = uSBankAccountHolderType == null ? -1 : a.f29412i[uSBankAccountHolderType.ordinal()];
        return i11 != 1 ? i11 != 2 ? "Unknown" : "Individual" : "Company";
    }
}