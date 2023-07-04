package com.stripe.android.stripe3ds2.transaction;

import com.stripe.android.stripe3ds2.observability.ErrorReporter;
import com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor;
import com.stripe.android.stripe3ds2.transactions.ErrorData;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import v20.e1;
import v20.k;
import v20.p0;
import vz.q;
import vz.r;
import zz.g;

/* loaded from: classes6.dex */
public final class StripeErrorRequestExecutor implements ErrorRequestExecutor {
    @Deprecated
    private static final String CONTENT_TYPE = "application/json; charset=utf-8";
    private static final Companion Companion = new Companion(null);
    private final ErrorReporter errorReporter;
    private final HttpClient httpClient;
    private final g workContext;

    /* loaded from: classes6.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes6.dex */
    public static final class Factory implements ErrorRequestExecutor.Factory {
        private final g workContext;

        public Factory(g workContext) {
            s.g(workContext, "workContext");
            this.workContext = workContext;
        }

        @Override // com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor.Factory
        public ErrorRequestExecutor create(String acsUrl, ErrorReporter errorReporter) {
            s.g(acsUrl, "acsUrl");
            s.g(errorReporter, "errorReporter");
            return new StripeErrorRequestExecutor(new StripeHttpClient(acsUrl, null, errorReporter, this.workContext, 2, null), errorReporter, e1.b());
        }
    }

    public StripeErrorRequestExecutor(HttpClient httpClient, ErrorReporter errorReporter, g workContext) {
        s.g(httpClient, "httpClient");
        s.g(errorReporter, "errorReporter");
        s.g(workContext, "workContext");
        this.httpClient = httpClient;
        this.errorReporter = errorReporter;
        this.workContext = workContext;
    }

    @Override // com.stripe.android.stripe3ds2.transaction.ErrorRequestExecutor
    public void executeAsync(ErrorData errorData) {
        Object b11;
        s.g(errorData, "errorData");
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(errorData.toJson$3ds2sdk_release().toString());
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        Throwable e11 = q.e(b11);
        if (e11 != null) {
            this.errorReporter.reportError(new RuntimeException(s.p("Could not convert ErrorData to JSON.\n$", errorData), e11));
        }
        if (q.g(b11)) {
            b11 = null;
        }
        String str = (String) b11;
        if (str == null) {
            return;
        }
        k.d(p0.a(this.workContext), null, null, new StripeErrorRequestExecutor$executeAsync$3$1(this, str, null), 3, null);
    }
}