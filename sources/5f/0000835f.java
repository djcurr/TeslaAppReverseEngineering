package lq;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class d extends f<hq.c> {
    /* JADX INFO: Access modifiers changed from: protected */
    public d(e eVar) {
        super(eVar);
    }

    @Override // lq.f
    public void a(Object obj, Object obj2) {
        ((hq.a) obj).add(obj2);
    }

    @Override // lq.f
    public Object c() {
        return new hq.a();
    }

    @Override // lq.f
    public Object d() {
        return new LinkedHashMap();
    }

    @Override // lq.f
    public void e(Object obj, String str, Object obj2) {
        ((Map) obj).put(str, obj2);
    }

    @Override // lq.f
    public f<hq.c> f(String str) {
        return this.f37296a.f37294c;
    }

    @Override // lq.f
    public f<hq.c> g(String str) {
        return this.f37296a.f37294c;
    }
}