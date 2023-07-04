package com.stripe.android.link.account;

import java.security.MessageDigest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.d;
import org.spongycastle.pqc.jcajce.spec.McElieceCCA2KeyGenParameterSpec;
import vz.b0;
import wz.p;

/* loaded from: classes6.dex */
public final class CookieStore {
    public static final String AUTH_SESSION_COOKIE = "auth_session_cookie";
    public static final Companion Companion = new Companion(null);
    public static final String LOGGED_OUT_EMAIL_HASH = "logged_out_email_hash";
    private final EncryptedStore store;

    /* loaded from: classes6.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public CookieStore(EncryptedStore store) {
        s.g(store, "store");
        this.store = store;
    }

    private final String sha256(String str) {
        String W;
        MessageDigest messageDigest = MessageDigest.getInstance(McElieceCCA2KeyGenParameterSpec.SHA256);
        byte[] bytes = str.getBytes(d.f35187b);
        s.f(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] digest = messageDigest.digest(bytes);
        s.f(digest, "getInstance(\"SHA-256\").d…yteArray(Charsets.UTF_8))");
        W = p.W(digest, "", null, null, 0, null, CookieStore$sha256$1.INSTANCE, 30, null);
        return W;
    }

    public final String getAuthSessionCookie() {
        return this.store.read(AUTH_SESSION_COOKIE);
    }

    public final boolean isEmailLoggedOut(String email) {
        s.g(email, "email");
        return s.c(this.store.read(LOGGED_OUT_EMAIL_HASH), sha256(email));
    }

    public final void logout(String email) {
        s.g(email, "email");
        storeLoggedOutEmail(email);
        this.store.delete(AUTH_SESSION_COOKIE);
    }

    public final void storeLoggedOutEmail(String email) {
        s.g(email, "email");
        this.store.write(LOGGED_OUT_EMAIL_HASH, sha256(email));
    }

    public final b0 updateAuthSessionCookie(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() == 0) {
            this.store.delete(AUTH_SESSION_COOKIE);
        } else {
            this.store.write(AUTH_SESSION_COOKIE, str);
        }
        return b0.f54756a;
    }
}