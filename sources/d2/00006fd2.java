package g30;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class o0<K, V> extends x0<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    private final e30.f f27620c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(c30.b<K> kSerializer, c30.b<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.s.g(kSerializer, "kSerializer");
        kotlin.jvm.internal.s.g(vSerializer, "vSerializer");
        this.f27620c = new n0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // g30.x0, c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27620c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: q */
    public LinkedHashMap<K, V> a() {
        return new LinkedHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: r */
    public int b(LinkedHashMap<K, V> linkedHashMap) {
        kotlin.jvm.internal.s.g(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: s */
    public void c(LinkedHashMap<K, V> linkedHashMap, int i11) {
        kotlin.jvm.internal.s.g(linkedHashMap, "<this>");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: t */
    public Iterator<Map.Entry<K, V>> d(Map<K, ? extends V> map) {
        kotlin.jvm.internal.s.g(map, "<this>");
        return (Iterator<Map.Entry<K, ? extends V>>) map.entrySet().iterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: u */
    public int e(Map<K, ? extends V> map) {
        kotlin.jvm.internal.s.g(map, "<this>");
        return map.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: v */
    public LinkedHashMap<K, V> k(Map<K, ? extends V> map) {
        kotlin.jvm.internal.s.g(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: w */
    public Map<K, V> l(LinkedHashMap<K, V> linkedHashMap) {
        kotlin.jvm.internal.s.g(linkedHashMap, "<this>");
        return linkedHashMap;
    }
}