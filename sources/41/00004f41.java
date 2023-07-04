package com.stripe.android.link.model;

import com.stripe.android.model.ConsumerSession;
import java.util.Iterator;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class LinkAccount {
    private final AccountStatus accountStatus;
    private final String clientSecret;
    private final ConsumerSession consumerSession;
    private final String email;
    private final boolean isVerified;
    private final String redactedPhoneNumber;

    public LinkAccount(ConsumerSession consumerSession) {
        AccountStatus accountStatus;
        s.g(consumerSession, "consumerSession");
        this.consumerSession = consumerSession;
        this.redactedPhoneNumber = consumerSession.getRedactedPhoneNumber();
        this.clientSecret = consumerSession.getClientSecret();
        this.email = consumerSession.getEmailAddress();
        boolean z11 = containsVerifiedSMSSession(consumerSession) || isVerifiedForSignup(consumerSession);
        this.isVerified = z11;
        if (z11) {
            accountStatus = AccountStatus.Verified;
        } else if (containsSMSSessionStarted(consumerSession)) {
            accountStatus = AccountStatus.VerificationStarted;
        } else {
            accountStatus = AccountStatus.NeedsVerification;
        }
        this.accountStatus = accountStatus;
    }

    private final boolean containsSMSSessionStarted(ConsumerSession consumerSession) {
        Object obj;
        boolean z11;
        Iterator<T> it2 = consumerSession.getVerificationSessions().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) obj;
            if (verificationSession.getType() == ConsumerSession.VerificationSession.SessionType.Sms && verificationSession.getState() == ConsumerSession.VerificationSession.SessionState.Started) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                break;
            }
        }
        return obj != null;
    }

    private final boolean containsVerifiedSMSSession(ConsumerSession consumerSession) {
        Object obj;
        boolean z11;
        Iterator<T> it2 = consumerSession.getVerificationSessions().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) obj;
            if (verificationSession.getType() == ConsumerSession.VerificationSession.SessionType.Sms && verificationSession.getState() == ConsumerSession.VerificationSession.SessionState.Verified) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                break;
            }
        }
        return obj != null;
    }

    private final boolean isVerifiedForSignup(ConsumerSession consumerSession) {
        Object obj;
        boolean z11;
        Iterator<T> it2 = consumerSession.getVerificationSessions().iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            ConsumerSession.VerificationSession verificationSession = (ConsumerSession.VerificationSession) obj;
            if (verificationSession.getType() == ConsumerSession.VerificationSession.SessionType.SignUp && verificationSession.getState() == ConsumerSession.VerificationSession.SessionState.Started) {
                z11 = true;
                continue;
            } else {
                z11 = false;
                continue;
            }
            if (z11) {
                break;
            }
        }
        return obj != null;
    }

    public final AccountStatus getAccountStatus() {
        return this.accountStatus;
    }

    public final String getAuthSessionCookie() {
        return this.consumerSession.getAuthSessionClientSecret();
    }

    public final String getClientSecret() {
        return this.clientSecret;
    }

    public final String getEmail() {
        return this.email;
    }

    public final String getRedactedPhoneNumber() {
        return this.redactedPhoneNumber;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }
}