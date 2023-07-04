package com.squareup.moshi;

import com.squareup.moshi.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
final class o<K, V> extends f<Map<K, V>> {

    /* renamed from: c  reason: collision with root package name */
    public static final f.d f20575c = new a();

    /* renamed from: a  reason: collision with root package name */
    private final f<K> f20576a;

    /* renamed from: b  reason: collision with root package name */
    private final f<V> f20577b;

    /* loaded from: classes2.dex */
    class a implements f.d {
        a() {
        }

        @Override // com.squareup.moshi.f.d
        public f<?> a(Type type, Set<? extends Annotation> set, p pVar) {
            Class<?> h11;
            if (set.isEmpty() && (h11 = r.h(type)) == Map.class) {
                Type[] j11 = r.j(type, h11);
                return new o(pVar, j11[0], j11[1]).g();
            }
            return null;
        }
    }

    o(p pVar, Type type, Type type2) {
        this.f20576a = pVar.d(type);
        this.f20577b = pVar.d(type2);
    }

    @Override // com.squareup.moshi.f
    /* renamed from: l */
    public Map<K, V> b(h hVar) {
        n nVar = new n();
        hVar.g();
        while (hVar.p()) {
            hVar.C0();
            K b11 = this.f20576a.b(hVar);
            V b12 = this.f20577b.b(hVar);
            Object put = nVar.put(b11, b12);
            if (put != null) {
                throw new JsonDataException("Map key '" + b11 + "' has multiple values at path " + hVar.getPath() + ": " + put + " and " + b12);
            }
        }
        hVar.l();
        return nVar;
    }

    @Override // com.squareup.moshi.f
    /* renamed from: m */
    public void j(m mVar, Map<K, V> map) {
        mVar.j();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                mVar.n0();
                this.f20576a.j(mVar, entry.getKey());
                this.f20577b.j(mVar, entry.getValue());
            } else {
                throw new JsonDataException("Map key is null at " + mVar.getPath());
            }
        }
        mVar.C();
    }

    public String toString() {
        return "JsonAdapter(" + this.f20576a + "=" + this.f20577b + ")";
    }
}