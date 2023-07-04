package com.adyen.checkout.core.api;

import java.net.HttpURLConnection;

/* loaded from: classes.dex */
final class e extends a {

    /* renamed from: a  reason: collision with root package name */
    private static final String f9587a = o7.a.c();

    /* renamed from: b  reason: collision with root package name */
    private static e f9588b;

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static e c() {
        e eVar;
        synchronized (e.class) {
            if (f9588b == null) {
                f9588b = new e();
            }
            eVar = f9588b;
        }
        return eVar;
    }

    @Override // com.adyen.checkout.core.api.a
    HttpURLConnection b(HttpURLConnection httpURLConnection) {
        o7.b.g(f9587a, "Trying to connect to a URL that is not HTTPS.");
        return httpURLConnection;
    }
}