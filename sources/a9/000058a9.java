package com.stripe.android.stripe3ds2.transaction;

/* loaded from: classes6.dex */
public final class HttpResponse {
    private final String content;
    private final boolean isJsonContentType;

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r6 == true) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public HttpResponse(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            java.lang.String r0 = "content"
            kotlin.jvm.internal.s.g(r5, r0)
            r4.<init>()
            r4.content = r5
            r5 = 1
            r0 = 0
            if (r6 != 0) goto L10
        Le:
            r5 = r0
            goto L1a
        L10:
            r1 = 2
            r2 = 0
            java.lang.String r3 = "application/json"
            boolean r6 = kotlin.text.m.H(r6, r3, r0, r1, r2)
            if (r6 != r5) goto Le
        L1a:
            r4.isJsonContentType = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transaction.HttpResponse.<init>(java.lang.String, java.lang.String):void");
    }

    public final String getContent() {
        return this.content;
    }

    public final boolean isJsonContentType() {
        return this.isJsonContentType;
    }
}