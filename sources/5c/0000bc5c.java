package w5;

import kotlin.jvm.internal.s;
import okhttp3.Call;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class k extends i<HttpUrl> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Call.Factory callFactory) {
        super(callFactory);
        s.g(callFactory, "callFactory");
    }

    @Override // w5.g
    /* renamed from: g */
    public String b(HttpUrl data) {
        s.g(data, "data");
        String httpUrl = data.toString();
        s.f(httpUrl, "data.toString()");
        return httpUrl;
    }

    @Override // w5.i
    /* renamed from: h */
    public HttpUrl f(HttpUrl toHttpUrl) {
        s.g(toHttpUrl, "$this$toHttpUrl");
        return toHttpUrl;
    }
}