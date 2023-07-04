package ii;

import com.google.android.exoplayer2.upstream.HttpDataSource;
import okhttp3.CacheControl;
import okhttp3.Call;
import zj.n;

@Deprecated
/* loaded from: classes3.dex */
public final class b extends HttpDataSource.a {

    /* renamed from: b  reason: collision with root package name */
    private final Call.Factory f30437b;

    /* renamed from: c  reason: collision with root package name */
    private final String f30438c;

    /* renamed from: d  reason: collision with root package name */
    private final n f30439d;

    /* renamed from: e  reason: collision with root package name */
    private final CacheControl f30440e;

    public b(Call.Factory factory, String str, n nVar) {
        this(factory, str, nVar, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.upstream.HttpDataSource.a
    /* renamed from: d */
    public a b(HttpDataSource.c cVar) {
        a aVar = new a(this.f30437b, this.f30438c, this.f30440e, cVar);
        n nVar = this.f30439d;
        if (nVar != null) {
            aVar.b(nVar);
        }
        return aVar;
    }

    public b(Call.Factory factory, String str, n nVar, CacheControl cacheControl) {
        this.f30437b = factory;
        this.f30438c = str;
        this.f30439d = nVar;
        this.f30440e = cacheControl;
    }
}