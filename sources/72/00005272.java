package com.stripe.android.model;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.e0;
import wz.w0;
import wz.x0;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum ApplePay uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:444)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:368)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:333)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:318)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:258)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:289)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: classes6.dex */
public final class TokenizationMethod {
    private static final /* synthetic */ TokenizationMethod[] $VALUES;
    public static final TokenizationMethod ApplePay;
    public static final Companion Companion;
    public static final TokenizationMethod GooglePay;
    public static final TokenizationMethod Masterpass;
    public static final TokenizationMethod VisaCheckout;
    private final Set<String> code;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TokenizationMethod fromCode(String str) {
            TokenizationMethod[] values;
            boolean T;
            for (TokenizationMethod tokenizationMethod : TokenizationMethod.values()) {
                T = e0.T(tokenizationMethod.code, str);
                if (T) {
                    return tokenizationMethod;
                }
            }
            return null;
        }
    }

    private static final /* synthetic */ TokenizationMethod[] $values() {
        return new TokenizationMethod[]{ApplePay, GooglePay, Masterpass, VisaCheckout};
    }

    static {
        Set c11;
        Set i11;
        Set c12;
        Set c13;
        c11 = w0.c("apple_pay");
        ApplePay = new TokenizationMethod("ApplePay", 0, c11);
        i11 = x0.i("android_pay", "google");
        GooglePay = new TokenizationMethod("GooglePay", 1, i11);
        c12 = w0.c("masterpass");
        Masterpass = new TokenizationMethod("Masterpass", 2, c12);
        c13 = w0.c("visa_checkout");
        VisaCheckout = new TokenizationMethod("VisaCheckout", 3, c13);
        $VALUES = $values();
        Companion = new Companion(null);
    }

    private TokenizationMethod(String str, int i11, Set set) {
        this.code = set;
    }

    public static TokenizationMethod valueOf(String str) {
        return (TokenizationMethod) Enum.valueOf(TokenizationMethod.class, str);
    }

    public static TokenizationMethod[] values() {
        return (TokenizationMethod[]) $VALUES.clone();
    }
}