package x20;

import java.util.concurrent.CancellationException;

/* loaded from: classes5.dex */
public interface t<E> {
    boolean c();

    Object e(zz.d<? super E> dVar);

    kotlinx.coroutines.selects.c<E> f();

    kotlinx.coroutines.selects.c<i<E>> i();

    g<E> iterator();

    void j(CancellationException cancellationException);

    Object k(zz.d<? super i<? extends E>> dVar);

    Object l();
}