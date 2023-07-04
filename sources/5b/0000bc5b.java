package w5;

import android.net.Uri;
import kotlin.jvm.internal.s;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class j extends i<Uri> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Call.Factory callFactory) {
        super(callFactory);
        s.g(callFactory, "callFactory");
    }

    @Override // w5.i, w5.g
    /* renamed from: g */
    public boolean a(Uri data) {
        s.g(data, "data");
        return s.c(data.getScheme(), "http") || s.c(data.getScheme(), "https");
    }

    @Override // w5.g
    /* renamed from: h */
    public String b(Uri data) {
        s.g(data, "data");
        String uri = data.toString();
        s.f(uri, "data.toString()");
        return uri;
    }

    @Override // w5.i
    /* renamed from: i */
    public HttpUrl f(Uri toHttpUrl) {
        s.g(toHttpUrl, "$this$toHttpUrl");
        HttpUrl httpUrl = HttpUrl.get(toHttpUrl.toString());
        s.f(httpUrl, "HttpUrl.get(toString())");
        return httpUrl;
    }
}