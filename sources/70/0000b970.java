package v6;

import com.adyen.checkout.card.api.model.Brand;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import v20.o0;
import wz.x0;

/* loaded from: classes.dex */
public abstract class l implements e7.k {

    /* renamed from: a  reason: collision with root package name */
    private final k f54173a;

    /* renamed from: b  reason: collision with root package name */
    private final i7.a f54174b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<x6.a> f54175c;

    public l(k cardConfiguration, i7.a publicKeyRepository) {
        HashSet e11;
        kotlin.jvm.internal.s.g(cardConfiguration, "cardConfiguration");
        kotlin.jvm.internal.s.g(publicKeyRepository, "publicKeyRepository");
        this.f54173a = cardConfiguration;
        this.f54174b = publicKeyRepository;
        e11 = x0.e(x6.a.BCMC);
        this.f54175c = e11;
    }

    public abstract List<x6.b> b(String str, String str2, o0 o0Var);

    public final Object c(zz.d<? super String> dVar) {
        return this.f54174b.a(e().b(), e().a(), dVar);
    }

    public abstract c d(a aVar, e7.a aVar2);

    /* JADX INFO: Access modifiers changed from: protected */
    public final k e() {
        return this.f54173a;
    }

    public abstract String f();

    public abstract List<r> g(q qVar, x6.a aVar, boolean z11);

    /* JADX INFO: Access modifiers changed from: protected */
    public final Set<x6.a> h() {
        return this.f54175c;
    }

    public abstract boolean i(c cVar);

    public abstract boolean j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract boolean m();

    public abstract boolean n();

    public abstract e o(d dVar, c cVar);

    public abstract j7.a<String> p(String str, boolean z11, boolean z12);

    public abstract j7.a<x6.c> q(x6.c cVar, Brand.c cVar2);

    public abstract j7.a<String> r(String str);

    public abstract j7.a<String> s(String str);

    public abstract j7.a<String> t(String str);

    public abstract j7.a<String> u(String str, x6.b bVar);

    public abstract j7.a<String> v(String str);
}