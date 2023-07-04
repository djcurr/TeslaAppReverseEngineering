package md;

import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public class f<E> extends ArrayList<E> {
    private f(int i11) {
        super(i11);
    }

    public static <E> f<E> b(E... eArr) {
        f<E> fVar = new f<>(eArr.length);
        Collections.addAll(fVar, eArr);
        return fVar;
    }
}