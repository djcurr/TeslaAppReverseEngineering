package hf;

/* loaded from: classes3.dex */
public class p<K, V> implements s<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final s<K, V> f29181a;

    /* renamed from: b  reason: collision with root package name */
    private final u f29182b;

    public p(s<K, V> sVar, u uVar) {
        this.f29181a = sVar;
        this.f29182b = uVar;
    }

    @Override // hf.s
    public void b(K k11) {
        this.f29181a.b(k11);
    }

    @Override // hf.s
    public qd.a<V> c(K k11, qd.a<V> aVar) {
        this.f29182b.c(k11);
        return this.f29181a.c(k11, aVar);
    }

    @Override // hf.s
    public boolean e(md.l<K> lVar) {
        return this.f29181a.e(lVar);
    }

    @Override // hf.s
    public int g(md.l<K> lVar) {
        return this.f29181a.g(lVar);
    }

    @Override // hf.s
    public qd.a<V> get(K k11) {
        qd.a<V> aVar = this.f29181a.get(k11);
        if (aVar == null) {
            this.f29182b.b(k11);
        } else {
            this.f29182b.a(k11);
        }
        return aVar;
    }
}