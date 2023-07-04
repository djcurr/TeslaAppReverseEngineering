package in;

import com.google.firebase.perf.util.h;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* loaded from: classes2.dex */
public class c<T> implements ResponseHandler<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ResponseHandler<? extends T> f30489a;

    /* renamed from: b  reason: collision with root package name */
    private final h f30490b;

    /* renamed from: c  reason: collision with root package name */
    private final gn.c f30491c;

    public c(ResponseHandler<? extends T> responseHandler, h hVar, gn.c cVar) {
        this.f30489a = responseHandler;
        this.f30490b = hVar;
        this.f30491c = cVar;
    }

    public T handleResponse(HttpResponse httpResponse) {
        this.f30491c.t(this.f30490b.b());
        this.f30491c.l(httpResponse.getStatusLine().getStatusCode());
        Long a11 = d.a(httpResponse);
        if (a11 != null) {
            this.f30491c.r(a11.longValue());
        }
        String b11 = d.b(httpResponse);
        if (b11 != null) {
            this.f30491c.q(b11);
        }
        this.f30491c.b();
        return (T) this.f30489a.handleResponse(httpResponse);
    }
}