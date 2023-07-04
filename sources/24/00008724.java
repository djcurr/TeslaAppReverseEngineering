package mr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class c<T> extends wz.c<T> implements RandomAccess, Serializable {

    /* renamed from: b  reason: collision with root package name */
    private final ArrayList<T> f38915b;

    public c(List<? extends T> list) {
        s.g(list, "list");
        this.f38915b = new ArrayList<>(list);
    }

    @Override // wz.a
    public int b() {
        return this.f38915b.size();
    }

    @Override // wz.c, java.util.List
    public T get(int i11) {
        return this.f38915b.get(i11);
    }

    @Override // wz.a, java.util.Collection, java.util.List
    public Object[] toArray() {
        Object[] array = this.f38915b.toArray(new Object[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return array;
    }
}