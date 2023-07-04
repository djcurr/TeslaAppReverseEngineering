package t20;

/* loaded from: classes5.dex */
public final class b<K, V> {

    /* renamed from: c  reason: collision with root package name */
    private static final b<Object, Object> f51572c = new b<>(d.a(), 0);

    /* renamed from: a  reason: collision with root package name */
    private final d<a<e<K, V>>> f51573a;

    /* renamed from: b  reason: collision with root package name */
    private final int f51574b;

    private b(d<a<e<K, V>>> dVar, int i11) {
        this.f51573a = dVar;
        this.f51574b = i11;
    }

    private static /* synthetic */ void a(int i11) {
        Object[] objArr = new Object[2];
        objArr[0] = "kotlin/reflect/jvm/internal/pcollections/HashPMap";
        if (i11 != 1) {
            objArr[1] = "empty";
        } else {
            objArr[1] = "minus";
        }
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", objArr));
    }

    public static <K, V> b<K, V> b() {
        b<K, V> bVar = (b<K, V>) f51572c;
        if (bVar == null) {
            a(0);
        }
        return bVar;
    }

    private a<e<K, V>> d(int i11) {
        a<e<K, V>> b11 = this.f51573a.b(i11);
        return b11 == null ? a.c() : b11;
    }

    private static <K, V> int e(a<e<K, V>> aVar, Object obj) {
        int i11 = 0;
        while (aVar != null && aVar.size() > 0) {
            if (aVar.f51568a.f51583a.equals(obj)) {
                return i11;
            }
            aVar = aVar.f51569b;
            i11++;
        }
        return -1;
    }

    public V c(Object obj) {
        for (a d11 = d(obj.hashCode()); d11 != null && d11.size() > 0; d11 = d11.f51569b) {
            e eVar = (e) d11.f51568a;
            if (eVar.f51583a.equals(obj)) {
                return eVar.f51584b;
            }
        }
        return null;
    }

    public b<K, V> f(K k11, V v11) {
        a<e<K, V>> d11 = d(k11.hashCode());
        int size = d11.size();
        int e11 = e(d11, k11);
        if (e11 != -1) {
            d11 = d11.e(e11);
        }
        a<e<K, V>> h11 = d11.h(new e<>(k11, v11));
        return new b<>(this.f51573a.c(k11.hashCode(), h11), (this.f51574b - size) + h11.size());
    }
}