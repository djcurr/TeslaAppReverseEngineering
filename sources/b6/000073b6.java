package hr;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.stripe.android.core.StripeError;
import com.stripe.android.core.exception.APIException;
import com.stripe.android.core.exception.AuthenticationException;
import com.stripe.android.core.exception.InvalidRequestException;
import com.stripe.android.exception.CardException;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.SetupIntent;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class a {
    public static final WritableMap a(String code, PaymentIntent.Error error) {
        PaymentIntent.Error.Type type;
        s.g(code, "code");
        return h(code, error == null ? null : error.getMessage(), error == null ? null : error.getMessage(), error == null ? null : error.getDeclineCode(), (error == null || (type = error.getType()) == null) ? null : type.getCode(), error != null ? error.getCode() : null);
    }

    public static final WritableMap b(String code, SetupIntent.Error error) {
        SetupIntent.Error.Type type;
        s.g(code, "code");
        return h(code, error == null ? null : error.getMessage(), error == null ? null : error.getMessage(), error == null ? null : error.getDeclineCode(), (error == null || (type = error.getType()) == null) ? null : type.getCode(), error != null ? error.getCode() : null);
    }

    public static final WritableMap c(String code, Exception error) {
        s.g(code, "code");
        s.g(error, "error");
        if (error instanceof CardException) {
            String message = error.getMessage();
            CardException cardException = (CardException) error;
            String localizedMessage = cardException.getLocalizedMessage();
            String declineCode = cardException.getDeclineCode();
            StripeError stripeError = cardException.getStripeError();
            String type = stripeError == null ? null : stripeError.getType();
            StripeError stripeError2 = cardException.getStripeError();
            return h(code, message, localizedMessage, declineCode, type, stripeError2 != null ? stripeError2.getCode() : null);
        } else if (error instanceof InvalidRequestException) {
            String message2 = error.getMessage();
            InvalidRequestException invalidRequestException = (InvalidRequestException) error;
            String localizedMessage2 = invalidRequestException.getLocalizedMessage();
            StripeError stripeError3 = invalidRequestException.getStripeError();
            String declineCode2 = stripeError3 == null ? null : stripeError3.getDeclineCode();
            StripeError stripeError4 = invalidRequestException.getStripeError();
            String type2 = stripeError4 == null ? null : stripeError4.getType();
            StripeError stripeError5 = invalidRequestException.getStripeError();
            return h(code, message2, localizedMessage2, declineCode2, type2, stripeError5 != null ? stripeError5.getCode() : null);
        } else if (error instanceof AuthenticationException) {
            String message3 = error.getMessage();
            AuthenticationException authenticationException = (AuthenticationException) error;
            String localizedMessage3 = authenticationException.getLocalizedMessage();
            StripeError stripeError6 = authenticationException.getStripeError();
            String declineCode3 = stripeError6 == null ? null : stripeError6.getDeclineCode();
            StripeError stripeError7 = authenticationException.getStripeError();
            String type3 = stripeError7 == null ? null : stripeError7.getType();
            StripeError stripeError8 = authenticationException.getStripeError();
            return h(code, message3, localizedMessage3, declineCode3, type3, stripeError8 != null ? stripeError8.getCode() : null);
        } else if (error instanceof APIException) {
            String message4 = error.getMessage();
            APIException aPIException = (APIException) error;
            String localizedMessage4 = aPIException.getLocalizedMessage();
            StripeError stripeError9 = aPIException.getStripeError();
            String declineCode4 = stripeError9 == null ? null : stripeError9.getDeclineCode();
            StripeError stripeError10 = aPIException.getStripeError();
            String type4 = stripeError10 == null ? null : stripeError10.getType();
            StripeError stripeError11 = aPIException.getStripeError();
            return h(code, message4, localizedMessage4, declineCode4, type4, stripeError11 != null ? stripeError11.getCode() : null);
        } else {
            String message5 = error.getMessage();
            String localizedMessage5 = error.getLocalizedMessage();
            if (localizedMessage5 == null) {
                localizedMessage5 = "";
            }
            return h(code, message5, localizedMessage5, null, null, null);
        }
    }

    public static final WritableMap d(String code, String str) {
        s.g(code, "code");
        return h(code, str, str, null, null, null);
    }

    public static final WritableMap e(String code, Throwable error) {
        s.g(code, "code");
        s.g(error, "error");
        Exception exc = error instanceof Exception ? (Exception) error : null;
        if (exc == null) {
            return h(code, error.getMessage(), error.getLocalizedMessage(), null, null, null);
        }
        return c(code, exc);
    }

    public static final WritableMap f() {
        return h("Failed", "Activity doesn't exist yet. You can safely retry this method.", null, null, null, null);
    }

    public static final WritableMap g() {
        return d(com.reactnativestripesdk.utils.d.Failed.toString(), "Stripe has not been initialized. Initialize Stripe in your app with the StripeProvider component or the initStripe method.");
    }

    public static final WritableMap h(String code, String str, String str2, String str3, String str4, String str5) {
        s.g(code, "code");
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        WritableNativeMap writableNativeMap2 = new WritableNativeMap();
        writableNativeMap2.putString(PaymentMethodOptionsParams.Blik.PARAM_CODE, code);
        writableNativeMap2.putString("message", str);
        writableNativeMap2.putString("localizedMessage", str2);
        writableNativeMap2.putString("declineCode", str3);
        writableNativeMap2.putString("type", str4);
        writableNativeMap2.putString("stripeErrorCode", str5);
        writableNativeMap.putMap("error", writableNativeMap2);
        return writableNativeMap;
    }
}