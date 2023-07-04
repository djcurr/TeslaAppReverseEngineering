package lx;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.g;
import okio.r;

/* loaded from: classes5.dex */
class e extends RequestBody {

    /* renamed from: a  reason: collision with root package name */
    private final RequestBody f37773a;

    /* renamed from: b  reason: collision with root package name */
    private final a f37774b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(RequestBody requestBody, a aVar) {
        this.f37773a = requestBody;
        this.f37774b = aVar;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.f37773a.contentLength();
    }

    @Override // okhttp3.RequestBody
    public MediaType contentType() {
        return this.f37773a.contentType();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(g gVar) {
        if (this.f37774b == null) {
            this.f37773a.writeTo(gVar);
            return;
        }
        g c11 = r.c(r.g(new d(gVar.G1(), this.f37774b, contentLength())));
        this.f37773a.writeTo(c11);
        c11.flush();
    }
}