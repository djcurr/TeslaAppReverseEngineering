package k80;

import com.squareup.moshi.JsonDataException;
import com.squareup.moshi.h;
import okhttp3.ResponseBody;
import okio.h;
import okio.i;
import retrofit2.f;

/* loaded from: classes4.dex */
final class c<T> implements f<ResponseBody, T> {

    /* renamed from: b  reason: collision with root package name */
    private static final i f34497b = i.d("EFBBBF");

    /* renamed from: a  reason: collision with root package name */
    private final com.squareup.moshi.f<T> f34498a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(com.squareup.moshi.f<T> fVar) {
        this.f34498a = fVar;
    }

    @Override // retrofit2.f
    /* renamed from: a */
    public T convert(ResponseBody responseBody) {
        h source = responseBody.source();
        try {
            i iVar = f34497b;
            if (source.V(0L, iVar)) {
                source.skip(iVar.z());
            }
            com.squareup.moshi.h p02 = com.squareup.moshi.h.p0(source);
            T b11 = this.f34498a.b(p02);
            if (p02.t0() == h.c.END_DOCUMENT) {
                return b11;
            }
            throw new JsonDataException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}