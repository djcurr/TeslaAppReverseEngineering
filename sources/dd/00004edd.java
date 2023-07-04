package com.stripe.android.link;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class LinkScreen {
    private final String route;

    /* loaded from: classes6.dex */
    public static final class CardEdit extends LinkScreen {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public static final String idArg = "id";
        public static final String route = "CardEdit?id={id}";
        private final String route$1;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public CardEdit(java.lang.String r2) {
            /*
                r1 = this;
                java.lang.String r0 = "paymentDetailsId"
                kotlin.jvm.internal.s.g(r2, r0)
                java.lang.String r2 = com.stripe.android.link.LinkScreenKt.access$urlEncode(r2)
                java.lang.String r0 = "CardEdit?id="
                java.lang.String r2 = kotlin.jvm.internal.s.p(r0, r2)
                r0 = 0
                r1.<init>(r2, r0)
                java.lang.String r2 = super.getRoute()
                r1.route$1 = r2
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.LinkScreen.CardEdit.<init>(java.lang.String):void");
        }

        @Override // com.stripe.android.link.LinkScreen
        public String getRoute() {
            return this.route$1;
        }
    }

    /* loaded from: classes6.dex */
    public static final class Loading extends LinkScreen {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super("Loading", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class PaymentMethod extends LinkScreen {
        public static final int $stable = 0;
        public static final PaymentMethod INSTANCE = new PaymentMethod();

        private PaymentMethod() {
            super("PaymentMethod", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class SignUp extends LinkScreen {
        public static final int $stable = 0;
        public static final Companion Companion = new Companion(null);
        public static final String emailArg = "email";
        public static final String route = "SignUp?email={email}";
        private final String route$1;

        /* loaded from: classes6.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public SignUp() {
            this(null, 1, null);
        }

        public /* synthetic */ SignUp(String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str);
        }

        @Override // com.stripe.android.link.LinkScreen
        public String getRoute() {
            return this.route$1;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public SignUp(java.lang.String r3) {
            /*
                r2 = this;
                java.lang.String r0 = ""
                if (r3 != 0) goto L5
                goto L13
            L5:
                java.lang.String r3 = com.stripe.android.link.LinkScreenKt.access$urlEncode(r3)
                java.lang.String r1 = "?email="
                java.lang.String r3 = kotlin.jvm.internal.s.p(r1, r3)
                if (r3 != 0) goto L12
                goto L13
            L12:
                r0 = r3
            L13:
                java.lang.String r3 = "SignUp"
                java.lang.String r3 = kotlin.jvm.internal.s.p(r3, r0)
                r0 = 0
                r2.<init>(r3, r0)
                java.lang.String r3 = super.getRoute()
                r2.route$1 = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.LinkScreen.SignUp.<init>(java.lang.String):void");
        }
    }

    /* loaded from: classes6.dex */
    public static final class Verification extends LinkScreen {
        public static final int $stable = 0;
        public static final Verification INSTANCE = new Verification();

        private Verification() {
            super("Verification", null);
        }
    }

    /* loaded from: classes6.dex */
    public static final class Wallet extends LinkScreen {
        public static final int $stable = 0;
        public static final Wallet INSTANCE = new Wallet();

        private Wallet() {
            super("Wallet", null);
        }
    }

    private LinkScreen(String str) {
        this.route = str;
    }

    public /* synthetic */ LinkScreen(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public String getRoute() {
        return this.route;
    }
}