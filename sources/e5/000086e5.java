package mm;

import lm.c;
import mm.b;

/* loaded from: classes3.dex */
public interface b<T extends b<T>> {
    <U> T registerEncoder(Class<U> cls, c<? super U> cVar);
}