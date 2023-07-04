package at;

import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static final c f6724a = new c();

    private c() {
    }

    public final com.auth0.android.jwt.c a(String token) {
        s.g(token, "token");
        try {
            return new com.auth0.android.jwt.c(token);
        } catch (Exception unused) {
            return null;
        }
    }
}