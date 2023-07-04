package com.stripe.android.link.account;

import com.stripe.android.link.LinkActivityContract;
import com.stripe.android.link.model.AccountStatus;
import com.stripe.android.link.model.LinkAccount;
import com.stripe.android.link.repositories.LinkRepository;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.g;
import kotlinx.coroutines.flow.h0;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.u;
import v20.a2;
import v20.k;
import v20.t1;
import zz.d;

/* loaded from: classes6.dex */
public final class LinkAccountManager {
    private final u<LinkAccount> _linkAccount;
    private final e<AccountStatus> accountStatus;
    private final LinkActivityContract.Args args;
    private final CookieStore cookieStore;
    private h0<LinkAccount> linkAccount;
    private final LinkRepository linkRepository;
    private boolean userHasLoggedOut;

    public LinkAccountManager(LinkActivityContract.Args args, LinkRepository linkRepository, CookieStore cookieStore) {
        s.g(args, "args");
        s.g(linkRepository, "linkRepository");
        s.g(cookieStore, "cookieStore");
        this.args = args;
        this.linkRepository = linkRepository;
        this.cookieStore = cookieStore;
        u<LinkAccount> a11 = j0.a(null);
        this._linkAccount = a11;
        this.linkAccount = a11;
        this.accountStatus = g.v(new LinkAccountManager$special$$inlined$transform$1(a11, null, this));
    }

    private final String cookie() {
        return this.cookieStore.getAuthSessionCookie();
    }

    /* renamed from: lookupConsumer-0E7RQCE$default  reason: not valid java name */
    public static /* synthetic */ Object m157lookupConsumer0E7RQCE$default(LinkAccountManager linkAccountManager, String str, boolean z11, d dVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return linkAccountManager.m160lookupConsumer0E7RQCE(str, z11, dVar);
    }

    private final LinkAccount setAndReturn(LinkAccount linkAccount) {
        this._linkAccount.setValue(linkAccount);
        this.cookieStore.updateAuthSessionCookie(linkAccount.getAuthSessionCookie());
        if (this.cookieStore.isEmailLoggedOut(linkAccount.getEmail())) {
            this.cookieStore.storeLoggedOutEmail("");
        }
        return linkAccount;
    }

    private final LinkAccount setAndReturnNullable(LinkAccount linkAccount) {
        LinkAccount andReturn = linkAccount == null ? null : setAndReturn(linkAccount);
        if (andReturn == null) {
            this._linkAccount.setValue(null);
            return null;
        }
        return andReturn;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0096  */
    /* renamed from: confirmVerification-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m158confirmVerificationgIAlus(java.lang.String r6, zz.d<? super vz.q<com.stripe.android.link.model.LinkAccount>> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.stripe.android.link.account.LinkAccountManager$confirmVerification$1
            if (r0 == 0) goto L13
            r0 = r7
            com.stripe.android.link.account.LinkAccountManager$confirmVerification$1 r0 = (com.stripe.android.link.account.LinkAccountManager$confirmVerification$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.account.LinkAccountManager$confirmVerification$1 r0 = new com.stripe.android.link.account.LinkAccountManager$confirmVerification$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r6 = r0.L$0
            com.stripe.android.link.account.LinkAccountManager r6 = (com.stripe.android.link.account.LinkAccountManager) r6
            vz.r.b(r7)
            vz.q r7 = (vz.q) r7
            java.lang.Object r7 = r7.j()
            goto L62
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L3b:
            vz.r.b(r7)
            kotlinx.coroutines.flow.h0 r7 = r5.getLinkAccount()
            java.lang.Object r7 = r7.getValue()
            com.stripe.android.link.model.LinkAccount r7 = (com.stripe.android.link.model.LinkAccount) r7
            if (r7 != 0) goto L4c
            r6 = 0
            goto L82
        L4c:
            com.stripe.android.link.repositories.LinkRepository r2 = r5.linkRepository
            java.lang.String r7 = r7.getClientSecret()
            java.lang.String r4 = r5.cookie()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r7 = r2.mo164confirmVerificationBWLJW6A(r7, r6, r4, r0)
            if (r7 != r1) goto L61
            return r1
        L61:
            r6 = r5
        L62:
            boolean r0 = vz.q.h(r7)
            if (r0 == 0) goto L7a
            vz.q$a r0 = vz.q.f54772b
            com.stripe.android.model.ConsumerSession r7 = (com.stripe.android.model.ConsumerSession) r7
            com.stripe.android.link.model.LinkAccount r0 = new com.stripe.android.link.model.LinkAccount
            r0.<init>(r7)
            com.stripe.android.link.model.LinkAccount r6 = r6.setAndReturn(r0)
            java.lang.Object r6 = vz.q.b(r6)
            goto L7e
        L7a:
            java.lang.Object r6 = vz.q.b(r7)
        L7e:
            vz.q r6 = vz.q.a(r6)
        L82:
            if (r6 != 0) goto L96
            vz.q$a r6 = vz.q.f54772b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "A non-null Link account is needed to confirm verification"
            r6.<init>(r7)
            java.lang.Object r6 = vz.r.a(r6)
            java.lang.Object r6 = vz.q.b(r6)
            goto L9a
        L96:
            java.lang.Object r6 = r6.j()
        L9a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.account.LinkAccountManager.m158confirmVerificationgIAlus(java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    /* renamed from: createPaymentDetails-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m159createPaymentDetails0E7RQCE(com.stripe.android.link.ui.paymentmethod.SupportedPaymentMethod r8, com.stripe.android.model.PaymentMethodCreateParams r9, zz.d<? super vz.q<com.stripe.android.link.LinkPaymentDetails>> r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof com.stripe.android.link.account.LinkAccountManager$createPaymentDetails$1
            if (r0 == 0) goto L13
            r0 = r10
            com.stripe.android.link.account.LinkAccountManager$createPaymentDetails$1 r0 = (com.stripe.android.link.account.LinkAccountManager$createPaymentDetails$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.account.LinkAccountManager$createPaymentDetails$1 r0 = new com.stripe.android.link.account.LinkAccountManager$createPaymentDetails$1
            r0.<init>(r7, r10)
        L18:
            r6 = r0
            java.lang.Object r10 = r6.result
            java.lang.Object r0 = a00.b.d()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L38
            if (r1 != r2) goto L30
            vz.r.b(r10)
            vz.q r10 = (vz.q) r10
            java.lang.Object r8 = r10.j()
            goto L6c
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            vz.r.b(r10)
            kotlinx.coroutines.flow.h0 r10 = r7.getLinkAccount()
            java.lang.Object r10 = r10.getValue()
            com.stripe.android.link.model.LinkAccount r10 = (com.stripe.android.link.model.LinkAccount) r10
            if (r10 != 0) goto L49
            r8 = 0
            goto L70
        L49:
            com.stripe.android.link.repositories.LinkRepository r1 = r7.linkRepository
            java.lang.String r3 = r10.getEmail()
            com.stripe.android.model.ConsumerPaymentDetailsCreateParams r3 = r8.createParams(r9, r3)
            java.lang.String r10 = r10.getClientSecret()
            com.stripe.android.link.LinkActivityContract$Args r4 = r7.args
            com.stripe.android.model.StripeIntent r4 = r4.getStripeIntent$link_release()
            java.util.Map r5 = r8.extraConfirmationParams(r9)
            r6.label = r2
            r2 = r3
            r3 = r10
            java.lang.Object r8 = r1.mo166createPaymentDetailsyxL6bBk(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L6c
            return r0
        L6c:
            vz.q r8 = vz.q.a(r8)
        L70:
            if (r8 != 0) goto L84
            vz.q$a r8 = vz.q.f54772b
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "A non-null Link account is needed to create payment details"
            r8.<init>(r9)
            java.lang.Object r8 = vz.r.a(r8)
            java.lang.Object r8 = vz.q.b(r8)
            goto L88
        L84:
            java.lang.Object r8 = r8.j()
        L88:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.account.LinkAccountManager.m159createPaymentDetails0E7RQCE(com.stripe.android.link.ui.paymentmethod.SupportedPaymentMethod, com.stripe.android.model.PaymentMethodCreateParams, zz.d):java.lang.Object");
    }

    public final e<AccountStatus> getAccountStatus() {
        return this.accountStatus;
    }

    public final h0<LinkAccount> getLinkAccount() {
        return this.linkAccount;
    }

    public final boolean hasUserLoggedOut(String str) {
        if (!this.userHasLoggedOut) {
            if (!(str == null ? false : this.cookieStore.isEmailLoggedOut(str))) {
                return false;
            }
        }
        return true;
    }

    public final a2 logout() {
        a2 d11;
        LinkAccount value = this.linkAccount.getValue();
        if (value == null) {
            return null;
        }
        String cookie = cookie();
        this.cookieStore.logout(value.getEmail());
        this.userHasLoggedOut = true;
        this._linkAccount.setValue(null);
        d11 = k.d(t1.f54002a, null, null, new LinkAccountManager$logout$1$1(this, value, cookie, null), 3, null);
        return d11;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a4 A[Catch: all -> 0x0038, TRY_ENTER, TryCatch #0 {all -> 0x0038, blocks: (B:13:0x002d, B:48:0x00c8, B:50:0x00d9, B:39:0x00a4, B:43:0x00ad, B:45:0x00b3), top: B:55:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e9  */
    /* renamed from: lookupConsumer-0E7RQCE  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m160lookupConsumer0E7RQCE(java.lang.String r7, boolean r8, zz.d<? super vz.q<com.stripe.android.link.model.LinkAccount>> r9) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.account.LinkAccountManager.m160lookupConsumer0E7RQCE(java.lang.String, boolean, zz.d):java.lang.Object");
    }

    public final void setLinkAccount(h0<LinkAccount> h0Var) {
        s.g(h0Var, "<set-?>");
        this.linkAccount = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: signInWithUserInput-gIAlu-s  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m161signInWithUserInputgIAlus(com.stripe.android.link.ui.inline.UserInput r8, zz.d<? super vz.q<com.stripe.android.link.model.LinkAccount>> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof com.stripe.android.link.account.LinkAccountManager$signInWithUserInput$1
            if (r0 == 0) goto L13
            r0 = r9
            com.stripe.android.link.account.LinkAccountManager$signInWithUserInput$1 r0 = (com.stripe.android.link.account.LinkAccountManager$signInWithUserInput$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.account.LinkAccountManager$signInWithUserInput$1 r0 = new com.stripe.android.link.account.LinkAccountManager$signInWithUserInput$1
            r0.<init>(r7, r9)
        L18:
            r4 = r0
            java.lang.Object r9 = r4.result
            java.lang.Object r0 = a00.b.d()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L46
            if (r1 == r3) goto L3c
            if (r1 != r2) goto L34
            vz.r.b(r9)
            vz.q r9 = (vz.q) r9
            java.lang.Object r8 = r9.j()
            goto La5
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            vz.r.b(r9)
            vz.q r9 = (vz.q) r9
            java.lang.Object r8 = r9.j()
            goto L61
        L46:
            vz.r.b(r9)
            boolean r9 = r8 instanceof com.stripe.android.link.ui.inline.UserInput.SignIn
            if (r9 == 0) goto L8a
            com.stripe.android.link.ui.inline.UserInput$SignIn r8 = (com.stripe.android.link.ui.inline.UserInput.SignIn) r8
            java.lang.String r2 = r8.getEmail()
            r8 = 0
            r5 = 2
            r6 = 0
            r4.label = r3
            r1 = r7
            r3 = r8
            java.lang.Object r8 = m157lookupConsumer0E7RQCE$default(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto L61
            return r0
        L61:
            boolean r9 = vz.q.h(r8)
            if (r9 == 0) goto L85
            vz.q$a r9 = vz.q.f54772b     // Catch: java.lang.Throwable -> L7e
            com.stripe.android.link.model.LinkAccount r8 = (com.stripe.android.link.model.LinkAccount) r8     // Catch: java.lang.Throwable -> L7e
            if (r8 == 0) goto L72
            java.lang.Object r8 = vz.q.b(r8)     // Catch: java.lang.Throwable -> L7e
            goto L89
        L72:
            java.lang.String r8 = "Error fetching user account"
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L7e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L7e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L7e
            throw r9     // Catch: java.lang.Throwable -> L7e
        L7e:
            r8 = move-exception
            vz.q$a r9 = vz.q.f54772b
            java.lang.Object r8 = vz.r.a(r8)
        L85:
            java.lang.Object r8 = vz.q.b(r8)
        L89:
            return r8
        L8a:
            boolean r9 = r8 instanceof com.stripe.android.link.ui.inline.UserInput.SignUp
            if (r9 == 0) goto La6
            com.stripe.android.link.ui.inline.UserInput$SignUp r8 = (com.stripe.android.link.ui.inline.UserInput.SignUp) r8
            java.lang.String r9 = r8.getEmail()
            java.lang.String r1 = r8.getPhone()
            java.lang.String r8 = r8.getCountry()
            r4.label = r2
            java.lang.Object r8 = r7.m162signUpBWLJW6A(r9, r1, r8, r4)
            if (r8 != r0) goto La5
            return r0
        La5:
            return r8
        La6:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.account.LinkAccountManager.m161signInWithUserInputgIAlus(com.stripe.android.link.ui.inline.UserInput, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0086 A[Catch: all -> 0x0037, TRY_ENTER, TryCatch #0 {all -> 0x0037, blocks: (B:13:0x002c, B:35:0x00a6, B:36:0x00b4, B:29:0x0086, B:32:0x0091), top: B:41:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4  */
    /* renamed from: signUp-BWLJW6A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m162signUpBWLJW6A(java.lang.String r10, java.lang.String r11, java.lang.String r12, zz.d<? super vz.q<com.stripe.android.link.model.LinkAccount>> r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.stripe.android.link.account.LinkAccountManager$signUp$1
            if (r0 == 0) goto L13
            r0 = r13
            com.stripe.android.link.account.LinkAccountManager$signUp$1 r0 = (com.stripe.android.link.account.LinkAccountManager$signUp$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.account.LinkAccountManager$signUp$1 r0 = new com.stripe.android.link.account.LinkAccountManager$signUp$1
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.result
            java.lang.Object r7 = a00.b.d()
            int r1 = r0.label
            r8 = 2
            r2 = 1
            if (r1 == 0) goto L50
            if (r1 == r2) goto L42
            if (r1 != r8) goto L3a
            java.lang.Object r10 = r0.L$0
            com.stripe.android.link.account.LinkAccountManager r10 = (com.stripe.android.link.account.LinkAccountManager) r10
            vz.r.b(r13)     // Catch: java.lang.Throwable -> L37
            vz.q r13 = (vz.q) r13     // Catch: java.lang.Throwable -> L37
            java.lang.Object r11 = r13.j()     // Catch: java.lang.Throwable -> L37
            goto La6
        L37:
            r10 = move-exception
            goto Lb9
        L3a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L42:
            java.lang.Object r10 = r0.L$0
            com.stripe.android.link.account.LinkAccountManager r10 = (com.stripe.android.link.account.LinkAccountManager) r10
            vz.r.b(r13)
            vz.q r13 = (vz.q) r13
            java.lang.Object r11 = r13.j()
            goto L69
        L50:
            vz.r.b(r13)
            com.stripe.android.link.repositories.LinkRepository r1 = r9.linkRepository
            java.lang.String r5 = r9.cookie()
            r0.L$0 = r9
            r0.label = r2
            r2 = r10
            r3 = r11
            r4 = r12
            r6 = r0
            java.lang.Object r11 = r1.mo165consumerSignUpyxL6bBk(r2, r3, r4, r5, r6)
            if (r11 != r7) goto L68
            return r7
        L68:
            r10 = r9
        L69:
            boolean r12 = vz.q.h(r11)
            if (r12 == 0) goto L7c
            vz.q$a r12 = vz.q.f54772b
            com.stripe.android.model.ConsumerSession r11 = (com.stripe.android.model.ConsumerSession) r11
            com.stripe.android.link.model.LinkAccount r12 = new com.stripe.android.link.model.LinkAccount
            r12.<init>(r11)
            com.stripe.android.link.model.LinkAccount r11 = r10.setAndReturn(r12)
        L7c:
            java.lang.Object r11 = vz.q.b(r11)
            boolean r12 = vz.q.h(r11)
            if (r12 == 0) goto Lc4
            vz.q$a r12 = vz.q.f54772b     // Catch: java.lang.Throwable -> L37
            com.stripe.android.link.model.LinkAccount r11 = (com.stripe.android.link.model.LinkAccount) r11     // Catch: java.lang.Throwable -> L37
            boolean r12 = r11.isVerified()     // Catch: java.lang.Throwable -> L37
            if (r12 == 0) goto L91
            goto Lb4
        L91:
            com.stripe.android.link.repositories.LinkRepository r12 = r10.linkRepository     // Catch: java.lang.Throwable -> L37
            java.lang.String r11 = r11.getClientSecret()     // Catch: java.lang.Throwable -> L37
            java.lang.String r13 = r10.cookie()     // Catch: java.lang.Throwable -> L37
            r0.L$0 = r10     // Catch: java.lang.Throwable -> L37
            r0.label = r8     // Catch: java.lang.Throwable -> L37
            java.lang.Object r11 = r12.mo171startVerification0E7RQCE(r11, r13, r0)     // Catch: java.lang.Throwable -> L37
            if (r11 != r7) goto La6
            return r7
        La6:
            vz.r.b(r11)     // Catch: java.lang.Throwable -> L37
            com.stripe.android.model.ConsumerSession r11 = (com.stripe.android.model.ConsumerSession) r11     // Catch: java.lang.Throwable -> L37
            com.stripe.android.link.model.LinkAccount r12 = new com.stripe.android.link.model.LinkAccount     // Catch: java.lang.Throwable -> L37
            r12.<init>(r11)     // Catch: java.lang.Throwable -> L37
            com.stripe.android.link.model.LinkAccount r11 = r10.setAndReturn(r12)     // Catch: java.lang.Throwable -> L37
        Lb4:
            java.lang.Object r10 = vz.q.b(r11)     // Catch: java.lang.Throwable -> L37
            goto Lc8
        Lb9:
            vz.q$a r11 = vz.q.f54772b
            java.lang.Object r10 = vz.r.a(r10)
            java.lang.Object r10 = vz.q.b(r10)
            goto Lc8
        Lc4:
            java.lang.Object r10 = vz.q.b(r11)
        Lc8:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.account.LinkAccountManager.m162signUpBWLJW6A(java.lang.String, java.lang.String, java.lang.String, zz.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* renamed from: startVerification-IoAF18A  reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m163startVerificationIoAF18A(zz.d<? super vz.q<com.stripe.android.link.model.LinkAccount>> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.stripe.android.link.account.LinkAccountManager$startVerification$1
            if (r0 == 0) goto L13
            r0 = r6
            com.stripe.android.link.account.LinkAccountManager$startVerification$1 r0 = (com.stripe.android.link.account.LinkAccountManager$startVerification$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.link.account.LinkAccountManager$startVerification$1 r0 = new com.stripe.android.link.account.LinkAccountManager$startVerification$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r0 = r0.L$0
            com.stripe.android.link.account.LinkAccountManager r0 = (com.stripe.android.link.account.LinkAccountManager) r0
            vz.r.b(r6)
            vz.q r6 = (vz.q) r6
            java.lang.Object r6 = r6.j()
            goto L62
        L33:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3b:
            vz.r.b(r6)
            kotlinx.coroutines.flow.h0 r6 = r5.getLinkAccount()
            java.lang.Object r6 = r6.getValue()
            com.stripe.android.link.model.LinkAccount r6 = (com.stripe.android.link.model.LinkAccount) r6
            if (r6 != 0) goto L4c
            r6 = 0
            goto L7d
        L4c:
            com.stripe.android.link.repositories.LinkRepository r2 = r5.linkRepository
            java.lang.String r6 = r6.getClientSecret()
            java.lang.String r4 = r5.cookie()
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r2.mo171startVerification0E7RQCE(r6, r4, r0)
            if (r6 != r1) goto L61
            return r1
        L61:
            r0 = r5
        L62:
            boolean r1 = vz.q.h(r6)
            if (r1 == 0) goto L75
            vz.q$a r1 = vz.q.f54772b
            com.stripe.android.model.ConsumerSession r6 = (com.stripe.android.model.ConsumerSession) r6
            com.stripe.android.link.model.LinkAccount r1 = new com.stripe.android.link.model.LinkAccount
            r1.<init>(r6)
            com.stripe.android.link.model.LinkAccount r6 = r0.setAndReturn(r1)
        L75:
            java.lang.Object r6 = vz.q.b(r6)
            vz.q r6 = vz.q.a(r6)
        L7d:
            if (r6 != 0) goto L91
            vz.q$a r6 = vz.q.f54772b
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "A non-null Link account is needed to start verification"
            r6.<init>(r0)
            java.lang.Object r6 = vz.r.a(r6)
            java.lang.Object r6 = vz.q.b(r6)
            goto L95
        L91:
            java.lang.Object r6 = r6.j()
        L95:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.link.account.LinkAccountManager.m163startVerificationIoAF18A(zz.d):java.lang.Object");
    }
}