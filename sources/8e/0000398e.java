package com.google.firebase.perf.network;

import com.google.firebase.perf.util.h;
import java.io.IOException;
import kn.k;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.HttpUrl;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes2.dex */
public class d implements Callback {

    /* renamed from: a  reason: collision with root package name */
    private final Callback f16986a;

    /* renamed from: b  reason: collision with root package name */
    private final gn.c f16987b;

    /* renamed from: c  reason: collision with root package name */
    private final h f16988c;

    /* renamed from: d  reason: collision with root package name */
    private final long f16989d;

    public d(Callback callback, k kVar, h hVar, long j11) {
        this.f16986a = callback;
        this.f16987b = gn.c.c(kVar);
        this.f16989d = j11;
        this.f16988c = hVar;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        Request request = call.request();
        if (request != null) {
            HttpUrl url = request.url();
            if (url != null) {
                this.f16987b.v(url.url().toString());
            }
            if (request.method() != null) {
                this.f16987b.k(request.method());
            }
        }
        this.f16987b.p(this.f16989d);
        this.f16987b.t(this.f16988c.b());
        in.d.d(this.f16987b);
        this.f16986a.onFailure(call, iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        FirebasePerfOkHttpClient.a(response, this.f16987b, this.f16989d, this.f16988c.b());
        this.f16986a.onResponse(call, response);
    }
}