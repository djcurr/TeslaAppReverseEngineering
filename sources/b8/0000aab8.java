package ph;

import java.util.Set;

/* loaded from: classes3.dex */
final class p implements nh.g {

    /* renamed from: a  reason: collision with root package name */
    private final Set<nh.b> f46519a;

    /* renamed from: b  reason: collision with root package name */
    private final o f46520b;

    /* renamed from: c  reason: collision with root package name */
    private final s f46521c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(Set<nh.b> set, o oVar, s sVar) {
        this.f46519a = set;
        this.f46520b = oVar;
        this.f46521c = sVar;
    }

    @Override // nh.g
    public <T> nh.f<T> a(String str, Class<T> cls, nh.b bVar, nh.e<T, byte[]> eVar) {
        if (this.f46519a.contains(bVar)) {
            return new r(this.f46520b, str, bVar, eVar, this.f46521c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f46519a));
    }

    @Override // nh.g
    public <T> nh.f<T> b(String str, Class<T> cls, nh.e<T, byte[]> eVar) {
        return a(str, cls, nh.b.b("proto"), eVar);
    }
}