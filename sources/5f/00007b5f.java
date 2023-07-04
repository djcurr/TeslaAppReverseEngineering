package j80;

import com.google.gson.e;
import com.google.gson.u;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import retrofit2.f;

/* loaded from: classes4.dex */
final class b<T> implements f<T, RequestBody> {

    /* renamed from: c  reason: collision with root package name */
    private static final MediaType f33281c = MediaType.get("application/json; charset=UTF-8");

    /* renamed from: d  reason: collision with root package name */
    private static final Charset f33282d = Charset.forName("UTF-8");

    /* renamed from: a  reason: collision with root package name */
    private final e f33283a;

    /* renamed from: b  reason: collision with root package name */
    private final u<T> f33284b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(e eVar, u<T> uVar) {
        this.f33283a = eVar;
        this.f33284b = uVar;
    }

    @Override // retrofit2.f
    /* renamed from: a */
    public RequestBody convert(T t11) {
        okio.f fVar = new okio.f();
        com.google.gson.stream.b p11 = this.f33283a.p(new OutputStreamWriter(fVar.G1(), f33282d));
        this.f33284b.d(p11, t11);
        p11.close();
        return RequestBody.create(f33281c, fVar.j1());
    }
}