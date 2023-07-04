package d20;

import java.util.HashSet;
import java.util.Set;
import kotlin.jvm.internal.s;
import wz.b0;

/* loaded from: classes5.dex */
public final class j {
    public static final Set<u10.f> a(Iterable<? extends h> iterable) {
        s.g(iterable, "<this>");
        HashSet hashSet = new HashSet();
        for (h hVar : iterable) {
            Set<u10.f> f11 = hVar.f();
            if (f11 == null) {
                return null;
            }
            b0.z(hashSet, f11);
        }
        return hashSet;
    }
}