package hf;

import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class d<E> {

    /* renamed from: a  reason: collision with root package name */
    private int f29143a;

    /* renamed from: b  reason: collision with root package name */
    private LinkedHashSet<E> f29144b;

    public d(int i11) {
        this.f29144b = new LinkedHashSet<>(i11);
        this.f29143a = i11;
    }

    public synchronized boolean a(E e11) {
        if (this.f29144b.size() == this.f29143a) {
            LinkedHashSet<E> linkedHashSet = this.f29144b;
            linkedHashSet.remove(linkedHashSet.iterator().next());
        }
        this.f29144b.remove(e11);
        return this.f29144b.add(e11);
    }

    public synchronized boolean b(E e11) {
        return this.f29144b.contains(e11);
    }
}