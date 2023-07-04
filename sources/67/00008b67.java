package net.time4j.format.expert;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import net.time4j.engine.ChronoException;

/* loaded from: classes5.dex */
class u extends t<u> {

    /* renamed from: b  reason: collision with root package name */
    private Map<net.time4j.engine.p<?>, Object> f41228b = null;

    /* renamed from: a  reason: collision with root package name */
    private Object f41227a = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.format.expert.t
    public <E> E B() {
        return (E) this.f41227a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.format.expert.t
    public void D(net.time4j.engine.p<?> pVar, int i11) {
        Objects.requireNonNull(pVar);
        Map map = this.f41228b;
        if (map == null) {
            map = new HashMap();
            this.f41228b = map;
        }
        map.put(pVar, Integer.valueOf(i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.format.expert.t
    public void E(net.time4j.engine.p<?> pVar, Object obj) {
        Objects.requireNonNull(pVar);
        if (obj == null) {
            Map<net.time4j.engine.p<?>, Object> map = this.f41228b;
            if (map != null) {
                map.remove(pVar);
                if (this.f41228b.isEmpty()) {
                    this.f41228b = null;
                    return;
                }
                return;
            }
            return;
        }
        Map map2 = this.f41228b;
        if (map2 == null) {
            map2 = new HashMap();
            this.f41228b = map2;
        }
        map2.put(pVar, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // net.time4j.format.expert.t
    public void F(Object obj) {
        this.f41227a = obj;
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public int h(net.time4j.engine.p<Integer> pVar) {
        Objects.requireNonNull(pVar);
        Map<net.time4j.engine.p<?>, Object> map = this.f41228b;
        if (map == null || !map.containsKey(pVar)) {
            return Integer.MIN_VALUE;
        }
        return pVar.getType().cast(map.get(pVar)).intValue();
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public <V> V l(net.time4j.engine.p<V> pVar) {
        Objects.requireNonNull(pVar);
        Map<net.time4j.engine.p<?>, Object> map = this.f41228b;
        if (map != null && map.containsKey(pVar)) {
            return pVar.getType().cast(map.get(pVar));
        }
        throw new ChronoException("No value found for: " + pVar.name());
    }

    @Override // net.time4j.engine.q, net.time4j.engine.o
    public boolean q(net.time4j.engine.p<?> pVar) {
        Map<net.time4j.engine.p<?>, Object> map;
        if (pVar == null || (map = this.f41228b) == null) {
            return false;
        }
        return map.containsKey(pVar);
    }

    @Override // net.time4j.engine.q
    public Set<net.time4j.engine.p<?>> t() {
        Map<net.time4j.engine.p<?>, Object> map = this.f41228b;
        if (map == null) {
            return Collections.emptySet();
        }
        return Collections.unmodifiableSet(map.keySet());
    }
}