package ga;

import android.util.Log;
import bb.c;
import bb.j;
import com.bumptech.glide.h;
import com.bumptech.glide.load.HttpException;
import com.bumptech.glide.load.data.d;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import na.g;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public class a implements d<InputStream>, Callback {

    /* renamed from: a  reason: collision with root package name */
    private final Call.Factory f27894a;

    /* renamed from: b  reason: collision with root package name */
    private final g f27895b;

    /* renamed from: c  reason: collision with root package name */
    private InputStream f27896c;

    /* renamed from: d  reason: collision with root package name */
    private ResponseBody f27897d;

    /* renamed from: e  reason: collision with root package name */
    private d.a<? super InputStream> f27898e;

    /* renamed from: f  reason: collision with root package name */
    private volatile Call f27899f;

    public a(Call.Factory factory, g gVar) {
        this.f27894a = factory;
        this.f27895b = gVar;
    }

    @Override // com.bumptech.glide.load.data.d
    public Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public com.bumptech.glide.load.a c() {
        return com.bumptech.glide.load.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        Call call = this.f27899f;
        if (call != null) {
            call.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void cleanup() {
        try {
            InputStream inputStream = this.f27896c;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        }
        ResponseBody responseBody = this.f27897d;
        if (responseBody != null) {
            responseBody.close();
        }
        this.f27898e = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void d(h hVar, d.a<? super InputStream> aVar) {
        Request.Builder url = new Request.Builder().url(this.f27895b.h());
        for (Map.Entry<String, String> entry : this.f27895b.e().entrySet()) {
            url.addHeader(entry.getKey(), entry.getValue());
        }
        Request build = url.build();
        this.f27898e = aVar;
        this.f27899f = this.f27894a.newCall(build);
        FirebasePerfOkHttpClient.enqueue(this.f27899f, this);
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        if (Log.isLoggable("OkHttpFetcher", 3)) {
            Log.d("OkHttpFetcher", "OkHttp failed to obtain result", iOException);
        }
        this.f27898e.b(iOException);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        this.f27897d = response.body();
        if (response.isSuccessful()) {
            InputStream g11 = c.g(this.f27897d.byteStream(), ((ResponseBody) j.d(this.f27897d)).contentLength());
            this.f27896c = g11;
            this.f27898e.e(g11);
            return;
        }
        this.f27898e.b(new HttpException(response.message(), response.code()));
    }
}