package net.time4j.engine;

import java.util.List;
import net.time4j.engine.j0;
import net.time4j.engine.v;

/* loaded from: classes5.dex */
public abstract class a<U extends v> implements j0<U> {
    @Override // net.time4j.engine.j0
    public boolean isEmpty() {
        List<j0.a<U>> b11 = b();
        int size = b11.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (((j0.a) b11.get(i11)).a() > 0) {
                return false;
            }
        }
        return true;
    }
}