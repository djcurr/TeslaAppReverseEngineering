package p1;

import h00.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final Map<Integer, h> f45461a = new LinkedHashMap();

    public final Map<Integer, h> a() {
        return this.f45461a;
    }

    public final b0 b(int i11, String value) {
        l<String, b0> c11;
        s.g(value, "value");
        h hVar = this.f45461a.get(Integer.valueOf(i11));
        if (hVar == null || (c11 = hVar.c()) == null) {
            return null;
        }
        c11.invoke(value);
        return b0.f54756a;
    }
}