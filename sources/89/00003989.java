package com.google.firebase.perf.network;

import androidx.annotation.Keep;
import com.google.firebase.perf.util.h;
import java.io.IOException;
import kn.k;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public class FirebasePerfOkHttpClient {
    private FirebasePerfOkHttpClient() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Response response, gn.c cVar, long j11, long j12) {
        Request request = response.request();
        if (request == null) {
            return;
        }
        cVar.v(request.url().url().toString());
        cVar.k(request.method());
        if (request.body() != null) {
            long contentLength = request.body().contentLength();
            if (contentLength != -1) {
                cVar.o(contentLength);
            }
        }
        ResponseBody body = response.body();
        if (body != null) {
            long contentLength2 = body.contentLength();
            if (contentLength2 != -1) {
                cVar.r(contentLength2);
            }
            MediaType contentType = body.contentType();
            if (contentType != null) {
                cVar.q(contentType.toString());
            }
        }
        cVar.l(response.code());
        cVar.p(j11);
        cVar.t(j12);
        cVar.b();
    }

    @Keep
    public static void enqueue(Call call, Callback callback) {
        h hVar = new h();
        call.enqueue(new d(callback, k.k(), hVar, hVar.d()));
    }

    @Keep
    public static Response execute(Call call) {
        gn.c c11 = gn.c.c(k.k());
        h hVar = new h();
        long d11 = hVar.d();
        try {
            Response execute = call.execute();
            a(execute, c11, d11, hVar.b());
            return execute;
        } catch (IOException e11) {
            Request request = call.request();
            if (request != null) {
                HttpUrl url = request.url();
                if (url != null) {
                    c11.v(url.url().toString());
                }
                if (request.method() != null) {
                    c11.k(request.method());
                }
            }
            c11.p(d11);
            c11.t(hVar.b());
            in.d.d(c11);
            throw e11;
        }
    }
}