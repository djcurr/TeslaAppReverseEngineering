package com.stripe.android.financialconnections.presentation;

import android.content.Intent;
import android.net.Uri;
import androidx.browser.customtabs.d;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class CreateBrowserIntentForUrl {
    private static final String CHROME_PACKAGE = "com.android.chrome";
    private static final String FIREFOX_PACKAGE = "org.mozilla";
    public static final CreateBrowserIntentForUrl INSTANCE = new CreateBrowserIntentForUrl();

    private CreateBrowserIntentForUrl() {
    }

    private final Intent createCustomTabIntent(Uri uri) {
        d b11 = new d.a().h(2).b();
        b11.f2065a.setData(uri);
        Intent intent = b11.f2065a;
        s.f(intent, "Builder()\n            .s…uri }\n            .intent");
        return intent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r7 == true) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.Intent invoke(android.content.Context r7, android.net.Uri r8) {
        /*
            r6 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.s.g(r7, r0)
            java.lang.String r0 = "uri"
            kotlin.jvm.internal.s.g(r8, r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1, r8)
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r1 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r1)
            r1 = 0
            if (r7 != 0) goto L20
        L1e:
            r7 = r1
            goto L27
        L20:
            android.content.pm.ActivityInfo r7 = r7.activityInfo
            if (r7 != 0) goto L25
            goto L1e
        L25:
            java.lang.String r7 = r7.packageName
        L27:
            r2 = 2
            r3 = 1
            r4 = 0
            if (r7 != 0) goto L2e
        L2c:
            r5 = r4
            goto L37
        L2e:
            java.lang.String r5 = "org.mozilla"
            boolean r5 = kotlin.text.m.M(r7, r5, r4, r2, r1)
            if (r5 != r3) goto L2c
            r5 = r3
        L37:
            if (r5 == 0) goto L3a
            goto L51
        L3a:
            if (r7 != 0) goto L3e
        L3c:
            r3 = r4
            goto L46
        L3e:
            java.lang.String r0 = "com.android.chrome"
            boolean r7 = kotlin.text.m.M(r7, r0, r4, r2, r1)
            if (r7 != r3) goto L3c
        L46:
            if (r3 == 0) goto L4d
            android.content.Intent r0 = r6.createCustomTabIntent(r8)
            goto L51
        L4d:
            android.content.Intent r0 = r6.createCustomTabIntent(r8)
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.financialconnections.presentation.CreateBrowserIntentForUrl.invoke(android.content.Context, android.net.Uri):android.content.Intent");
    }
}