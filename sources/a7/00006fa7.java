package g30;

/* loaded from: classes5.dex */
public final class c1<K, V> extends m0<K, V, vz.p<? extends K, ? extends V>> {

    /* renamed from: c  reason: collision with root package name */
    private final e30.f f27565c;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<e30.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c30.b<K> f27566a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ c30.b<V> f27567b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c30.b<K> bVar, c30.b<V> bVar2) {
            super(1);
            this.f27566a = bVar;
            this.f27567b = bVar2;
        }

        public final void a(e30.a buildClassSerialDescriptor) {
            kotlin.jvm.internal.s.g(buildClassSerialDescriptor, "$this$buildClassSerialDescriptor");
            e30.a.b(buildClassSerialDescriptor, "first", this.f27566a.getDescriptor(), null, false, 12, null);
            e30.a.b(buildClassSerialDescriptor, "second", this.f27567b.getDescriptor(), null, false, 12, null);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(e30.a aVar) {
            a(aVar);
            return vz.b0.f54756a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(c30.b<K> keySerializer, c30.b<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        kotlin.jvm.internal.s.g(keySerializer, "keySerializer");
        kotlin.jvm.internal.s.g(valueSerializer, "valueSerializer");
        this.f27565c = e30.i.b("kotlin.Pair", new e30.f[0], new a(keySerializer, valueSerializer));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.m0
    /* renamed from: d */
    public K a(vz.p<? extends K, ? extends V> pVar) {
        kotlin.jvm.internal.s.g(pVar, "<this>");
        return pVar.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.m0
    /* renamed from: e */
    public V b(vz.p<? extends K, ? extends V> pVar) {
        kotlin.jvm.internal.s.g(pVar, "<this>");
        return pVar.d();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.m0
    /* renamed from: f */
    public vz.p<K, V> c(K k11, V v11) {
        return vz.v.a(k11, v11);
    }

    @Override // c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27565c;
    }
}