package com.stripe.android.link.ui.inline;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public abstract class UserInput {
    public static final int $stable = 0;

    /* loaded from: classes6.dex */
    public static final class SignIn extends UserInput {
        public static final int $stable = 0;
        private final String email;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignIn(String email) {
            super(null);
            s.g(email, "email");
            this.email = email;
        }

        public static /* synthetic */ SignIn copy$default(SignIn signIn, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = signIn.email;
            }
            return signIn.copy(str);
        }

        public final String component1() {
            return this.email;
        }

        public final SignIn copy(String email) {
            s.g(email, "email");
            return new SignIn(email);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SignIn) && s.c(this.email, ((SignIn) obj).email);
        }

        public final String getEmail() {
            return this.email;
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "SignIn(email=" + this.email + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    /* loaded from: classes6.dex */
    public static final class SignUp extends UserInput {
        public static final int $stable = 0;
        private final String country;
        private final String email;
        private final String phone;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SignUp(String email, String phone, String country) {
            super(null);
            s.g(email, "email");
            s.g(phone, "phone");
            s.g(country, "country");
            this.email = email;
            this.phone = phone;
            this.country = country;
        }

        public static /* synthetic */ SignUp copy$default(SignUp signUp, String str, String str2, String str3, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = signUp.email;
            }
            if ((i11 & 2) != 0) {
                str2 = signUp.phone;
            }
            if ((i11 & 4) != 0) {
                str3 = signUp.country;
            }
            return signUp.copy(str, str2, str3);
        }

        public final String component1() {
            return this.email;
        }

        public final String component2() {
            return this.phone;
        }

        public final String component3() {
            return this.country;
        }

        public final SignUp copy(String email, String phone, String country) {
            s.g(email, "email");
            s.g(phone, "phone");
            s.g(country, "country");
            return new SignUp(email, phone, country);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof SignUp) {
                SignUp signUp = (SignUp) obj;
                return s.c(this.email, signUp.email) && s.c(this.phone, signUp.phone) && s.c(this.country, signUp.country);
            }
            return false;
        }

        public final String getCountry() {
            return this.country;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getPhone() {
            return this.phone;
        }

        public int hashCode() {
            return (((this.email.hashCode() * 31) + this.phone.hashCode()) * 31) + this.country.hashCode();
        }

        public String toString() {
            return "SignUp(email=" + this.email + ", phone=" + this.phone + ", country=" + this.country + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    private UserInput() {
    }

    public /* synthetic */ UserInput(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}