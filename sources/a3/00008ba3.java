package net.time4j;

import java.util.Collections;
import java.util.EnumMap;
import java.util.Map;

/* loaded from: classes5.dex */
final class g implements net.time4j.engine.c0<h> {

    /* renamed from: a  reason: collision with root package name */
    private static final Map<h, g> f41279a = a(0);

    /* renamed from: b  reason: collision with root package name */
    private static final Map<h, g> f41280b = a(1);

    /* renamed from: c  reason: collision with root package name */
    private static final Map<h, g> f41281c = a(2);

    private g(h hVar, int i11) {
    }

    private static Map<h, g> a(int i11) {
        h[] values;
        EnumMap enumMap = new EnumMap(h.class);
        for (h hVar : h.values()) {
            enumMap.put((EnumMap) hVar, (h) new g(hVar, i11));
        }
        return Collections.unmodifiableMap(enumMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g b(h hVar) {
        g gVar = f41279a.get(hVar);
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException(hVar.name());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g c(h hVar) {
        g gVar = f41281c.get(hVar);
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException(hVar.name());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g d(h hVar) {
        g gVar = f41280b.get(hVar);
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalArgumentException(hVar.name());
    }
}