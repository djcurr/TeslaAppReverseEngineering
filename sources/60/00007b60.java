package j80;

import com.google.gson.JsonIOException;
import com.google.gson.e;
import com.google.gson.u;
import okhttp3.ResponseBody;
import retrofit2.f;

/* loaded from: classes4.dex */
final class c<T> implements f<ResponseBody, T> {

    /* renamed from: a  reason: collision with root package name */
    private final e f33285a;

    /* renamed from: b  reason: collision with root package name */
    private final u<T> f33286b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(e eVar, u<T> uVar) {
        this.f33285a = eVar;
        this.f33286b = uVar;
    }

    @Override // retrofit2.f
    /* renamed from: a */
    public T convert(ResponseBody responseBody) {
        tn.a o11 = this.f33285a.o(responseBody.charStream());
        try {
            T b11 = this.f33286b.b(o11);
            if (o11.Q0() == com.google.gson.stream.a.END_DOCUMENT) {
                return b11;
            }
            throw new JsonIOException("JSON document was not fully consumed.");
        } finally {
            responseBody.close();
        }
    }
}