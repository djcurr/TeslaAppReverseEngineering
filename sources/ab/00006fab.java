package g30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes5.dex */
public final class d0<K, V> extends x0<K, V, Map<K, ? extends V>, HashMap<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    private final e30.f f27570c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(c30.b<K> kSerializer, c30.b<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        kotlin.jvm.internal.s.g(kSerializer, "kSerializer");
        kotlin.jvm.internal.s.g(vSerializer, "vSerializer");
        this.f27570c = new c0(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // g30.x0, c30.b, c30.h, c30.a
    public e30.f getDescriptor() {
        return this.f27570c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: q */
    public HashMap<K, V> a() {
        return new HashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: r */
    public int b(HashMap<K, V> hashMap) {
        kotlin.jvm.internal.s.g(hashMap, "<this>");
        return hashMap.size() * 2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: s */
    public void c(HashMap<K, V> hashMap, int i11) {
        kotlin.jvm.internal.s.g(hashMap, "<this>");
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
    public HashMap<K, V> k(Map<K, ? extends V> map) {
        kotlin.jvm.internal.s.g(map, "<this>");
        HashMap<K, V> hashMap = map instanceof HashMap ? (HashMap) map : null;
        return hashMap == null ? new HashMap<>(map) : hashMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.a
    /* renamed from: w */
    public Map<K, V> l(HashMap<K, V> hashMap) {
        kotlin.jvm.internal.s.g(hashMap, "<this>");
        return hashMap;
    }
}