package zp;

import java.net.URI;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public abstract class b extends e {

    /* renamed from: h  reason: collision with root package name */
    private final URI f60567h;

    /* renamed from: i  reason: collision with root package name */
    private final fq.d f60568i;

    /* renamed from: j  reason: collision with root package name */
    private final URI f60569j;

    /* renamed from: k  reason: collision with root package name */
    private final nq.c f60570k;

    /* renamed from: l  reason: collision with root package name */
    private final nq.c f60571l;

    /* renamed from: m  reason: collision with root package name */
    private final List<nq.a> f60572m;

    /* renamed from: n  reason: collision with root package name */
    private final String f60573n;

    /* JADX INFO: Access modifiers changed from: protected */
    public b(a aVar, g gVar, String str, Set<String> set, URI uri, fq.d dVar, URI uri2, nq.c cVar, nq.c cVar2, List<nq.a> list, String str2, Map<String, Object> map, nq.c cVar3) {
        super(aVar, gVar, str, set, map, cVar3);
        this.f60567h = uri;
        this.f60568i = dVar;
        this.f60569j = uri2;
        this.f60570k = cVar;
        this.f60571l = cVar2;
        if (list != null) {
            this.f60572m = Collections.unmodifiableList(new ArrayList(list));
        } else {
            this.f60572m = null;
        }
        this.f60573n = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static fq.d q(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        fq.d l11 = fq.d.l(map);
        if (l11.k()) {
            throw new ParseException("Non-public key in jwk header parameter", 0);
        }
        return l11;
    }

    @Override // zp.e
    public Map<String, Object> i() {
        Map<String, Object> i11 = super.i();
        URI uri = this.f60567h;
        if (uri != null) {
            i11.put("jku", uri.toString());
        }
        fq.d dVar = this.f60568i;
        if (dVar != null) {
            i11.put("jwk", dVar.m());
        }
        URI uri2 = this.f60569j;
        if (uri2 != null) {
            i11.put("x5u", uri2.toString());
        }
        nq.c cVar = this.f60570k;
        if (cVar != null) {
            i11.put("x5t", cVar.toString());
        }
        nq.c cVar2 = this.f60571l;
        if (cVar2 != null) {
            i11.put("x5t#S256", cVar2.toString());
        }
        List<nq.a> list = this.f60572m;
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList = new ArrayList(this.f60572m.size());
            for (nq.a aVar : this.f60572m) {
                arrayList.add(aVar.toString());
            }
            i11.put("x5c", arrayList);
        }
        String str = this.f60573n;
        if (str != null) {
            i11.put("kid", str);
        }
        return i11;
    }

    public fq.d j() {
        return this.f60568i;
    }

    public URI k() {
        return this.f60567h;
    }

    public String l() {
        return this.f60573n;
    }

    public List<nq.a> m() {
        return this.f60572m;
    }

    public nq.c n() {
        return this.f60571l;
    }

    @Deprecated
    public nq.c o() {
        return this.f60570k;
    }

    public URI p() {
        return this.f60569j;
    }
}