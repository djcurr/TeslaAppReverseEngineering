package net.time4j.engine;

import java.util.Map;
import net.time4j.engine.l;

/* loaded from: classes5.dex */
public final class j<T extends l<T>> extends w<T> {

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, ? extends k<T>> f40973h;

    @Override // net.time4j.engine.w
    public k<T> m() {
        throw new ChronoException("Cannot determine calendar system without variant.");
    }

    @Override // net.time4j.engine.w
    public k<T> o(String str) {
        if (str.isEmpty()) {
            return m();
        }
        k<T> kVar = this.f40973h.get(str);
        return kVar == null ? super.o(str) : kVar;
    }

    @Override // net.time4j.engine.w
    public boolean w(p<?> pVar) {
        return super.w(pVar) || (pVar instanceof z);
    }
}