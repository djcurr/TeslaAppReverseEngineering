package com.plaid.internal;

import com.plaid.internal.core.networking.models.NetworkException;
import com.plaid.internal.wa;
import com.stripe.android.core.networking.NetworkConstantsKt;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class ka implements Interceptor {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ ja f18936a;

    public ka(ja jaVar) {
        this.f18936a = jaVar;
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) {
        boolean M;
        String f11;
        kotlin.jvm.internal.s.g(chain, "chain");
        Request.Builder newBuilder = chain.request().newBuilder();
        String str = this.f18936a.f18893a;
        if (str != null) {
            newBuilder.addHeader(NetworkConstantsKt.HEADER_USER_AGENT, str);
        }
        Request request = newBuilder.build();
        Response response = chain.proceed(request);
        if (!response.isSuccessful()) {
            M = kotlin.text.w.M(request.url().encodedPath(), "sentry", false, 2, null);
            if (!M) {
                NetworkException.a aVar = NetworkException.f18276c;
                kotlin.jvm.internal.s.g(request, "request");
                kotlin.jvm.internal.s.g(response, "response");
                String p11 = kotlin.jvm.internal.s.p("Request failed - ", request.url().encodedPath());
                StringBuilder a11 = g4.a("\n        \n        \n        Url: ");
                a11.append(request.url());
                a11.append("\n        Response code: ");
                a11.append(response.code());
                a11.append("\n        Error message: ");
                ResponseBody body = response.body();
                a11.append(body != null ? new com.plaid.internal.core.networking.models.a(body) : null);
                a11.append("\n        \n        Stacktrace:\n      ");
                f11 = kotlin.text.o.f(a11.toString());
                NetworkException networkException = new NetworkException(p11, f11);
                wa.a.a(wa.f19678a, (Throwable) networkException, networkException.f18277a, false, 4);
            }
        }
        return response;
    }
}