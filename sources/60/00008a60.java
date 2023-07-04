package na;

import android.net.Uri;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import na.n;

/* loaded from: classes.dex */
public class x<Data> implements n<Uri, Data> {

    /* renamed from: b  reason: collision with root package name */
    private static final Set<String> f40774b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", "https")));

    /* renamed from: a  reason: collision with root package name */
    private final n<g, Data> f40775a;

    /* loaded from: classes.dex */
    public static class a implements o<Uri, InputStream> {
        @Override // na.o
        public void a() {
        }

        @Override // na.o
        public n<Uri, InputStream> c(r rVar) {
            return new x(rVar.d(g.class, InputStream.class));
        }
    }

    public x(n<g, Data> nVar) {
        this.f40775a = nVar;
    }

    @Override // na.n
    /* renamed from: c */
    public n.a<Data> b(Uri uri, int i11, int i12, ha.e eVar) {
        return this.f40775a.b(new g(uri.toString()), i11, i12, eVar);
    }

    @Override // na.n
    /* renamed from: d */
    public boolean a(Uri uri) {
        return f40774b.contains(uri.getScheme());
    }
}