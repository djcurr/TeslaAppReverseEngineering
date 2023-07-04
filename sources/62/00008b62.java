package net.time4j.format.expert;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
class q extends HashMap<net.time4j.engine.p<?>, Object> {
    private static final long serialVersionUID = 1245025551222311435L;

    /* JADX INFO: Access modifiers changed from: package-private */
    public q(Map<? extends net.time4j.engine.p<?>, ?> map) {
        super(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a */
    public Object put(net.time4j.engine.p<?> pVar, Object obj) {
        Object put = super.put(pVar, obj);
        if (pVar == null || put == null || put.equals(obj)) {
            return put;
        }
        throw new a(pVar);
    }
}