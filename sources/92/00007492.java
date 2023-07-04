package i30;

import c30.h;
import g30.d1;
import h00.l;
import i30.a;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.r0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<n00.d<?>, a> f29826a;

    /* renamed from: b  reason: collision with root package name */
    public final Map<n00.d<?>, Map<n00.d<?>, c30.b<?>>> f29827b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<n00.d<?>, l<?, h<?>>> f29828c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<n00.d<?>, Map<String, c30.b<?>>> f29829d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<n00.d<?>, l<String, c30.a<?>>> f29830e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(Map<n00.d<?>, ? extends a> class2ContextualFactory, Map<n00.d<?>, ? extends Map<n00.d<?>, ? extends c30.b<?>>> polyBase2Serializers, Map<n00.d<?>, ? extends l<?, ? extends h<?>>> polyBase2DefaultSerializerProvider, Map<n00.d<?>, ? extends Map<String, ? extends c30.b<?>>> polyBase2NamedSerializers, Map<n00.d<?>, ? extends l<? super String, ? extends c30.a<?>>> polyBase2DefaultDeserializerProvider) {
        super(null);
        s.g(class2ContextualFactory, "class2ContextualFactory");
        s.g(polyBase2Serializers, "polyBase2Serializers");
        s.g(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        s.g(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        s.g(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f29826a = class2ContextualFactory;
        this.f29827b = polyBase2Serializers;
        this.f29828c = polyBase2DefaultSerializerProvider;
        this.f29829d = polyBase2NamedSerializers;
        this.f29830e = polyBase2DefaultDeserializerProvider;
    }

    @Override // i30.c
    public void a(d collector) {
        s.g(collector, "collector");
        for (Map.Entry<n00.d<?>, a> entry : this.f29826a.entrySet()) {
            n00.d<?> key = entry.getKey();
            a value = entry.getValue();
            if (value instanceof a.C0578a) {
                collector.d(key, ((a.C0578a) value).b());
            } else if (value instanceof a.b) {
                collector.b(key, ((a.b) value).b());
            }
        }
        for (Map.Entry<n00.d<?>, Map<n00.d<?>, c30.b<?>>> entry2 : this.f29827b.entrySet()) {
            n00.d<?> key2 = entry2.getKey();
            for (Map.Entry<n00.d<?>, c30.b<?>> entry3 : entry2.getValue().entrySet()) {
                collector.a(key2, entry3.getKey(), entry3.getValue());
            }
        }
        for (Map.Entry<n00.d<?>, l<?, h<?>>> entry4 : this.f29828c.entrySet()) {
            collector.c(entry4.getKey(), (l) r0.f(entry4.getValue(), 1));
        }
        for (Map.Entry<n00.d<?>, l<String, c30.a<?>>> entry5 : this.f29830e.entrySet()) {
            collector.e(entry5.getKey(), (l) r0.f(entry5.getValue(), 1));
        }
    }

    @Override // i30.c
    public <T> c30.b<T> b(n00.d<T> kClass, List<? extends c30.b<?>> typeArgumentsSerializers) {
        s.g(kClass, "kClass");
        s.g(typeArgumentsSerializers, "typeArgumentsSerializers");
        a aVar = this.f29826a.get(kClass);
        c30.b<?> a11 = aVar != null ? aVar.a(typeArgumentsSerializers) : null;
        if (a11 instanceof c30.b) {
            return (c30.b<T>) a11;
        }
        return null;
    }

    @Override // i30.c
    public <T> c30.a<? extends T> d(n00.d<? super T> baseClass, String str) {
        s.g(baseClass, "baseClass");
        Map<String, c30.b<?>> map = this.f29829d.get(baseClass);
        c30.b<?> bVar = map != null ? map.get(str) : null;
        if (!(bVar instanceof c30.b)) {
            bVar = null;
        }
        if (bVar != null) {
            return bVar;
        }
        l<String, c30.a<?>> lVar = this.f29830e.get(baseClass);
        l<String, c30.a<?>> lVar2 = r0.m(lVar, 1) ? lVar : null;
        if (lVar2 != null) {
            return (c30.a<? extends T>) lVar2.invoke(str);
        }
        return null;
    }

    @Override // i30.c
    public <T> h<T> e(n00.d<? super T> baseClass, T value) {
        s.g(baseClass, "baseClass");
        s.g(value, "value");
        if (d1.i(value, baseClass)) {
            Map<n00.d<?>, c30.b<?>> map = this.f29827b.get(baseClass);
            c30.b<?> bVar = map != null ? map.get(m0.b(value.getClass())) : null;
            if (!(bVar instanceof h)) {
                bVar = null;
            }
            if (bVar != null) {
                return bVar;
            }
            l<?, h<?>> lVar = this.f29828c.get(baseClass);
            l<?, h<?>> lVar2 = r0.m(lVar, 1) ? lVar : null;
            if (lVar2 != null) {
                return (h<T>) lVar2.invoke(value);
            }
            return null;
        }
        return null;
    }
}