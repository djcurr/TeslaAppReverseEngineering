package k80;

import com.squareup.moshi.m;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.f;

/* loaded from: classes4.dex */
final class b<T> implements f<T, RequestBody> {

    /* renamed from: b  reason: collision with root package name */
    private static final MediaType f34495b = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final com.squareup.moshi.f<T> f34496a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(com.squareup.moshi.f<T> fVar) {
        this.f34496a = fVar;
    }

    @Override // retrofit2.f
    /* renamed from: a */
    public RequestBody convert(T t11) {
        okio.f fVar = new okio.f();
        this.f34496a.j(m.a0(fVar), t11);
        return RequestBody.create(f34495b, fVar.j1());
    }
}