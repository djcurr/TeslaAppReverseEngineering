package u20;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public final class a<T> implements h<T> {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<h<T>> f53035a;

    public a(h<? extends T> sequence) {
        s.g(sequence, "sequence");
        this.f53035a = new AtomicReference<>(sequence);
    }

    @Override // u20.h
    public Iterator<T> iterator() {
        h<T> andSet = this.f53035a.getAndSet(null);
        if (andSet != null) {
            return andSet.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}