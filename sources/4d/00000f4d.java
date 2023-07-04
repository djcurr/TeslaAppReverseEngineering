package c1;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u1<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayList<T> f8700a = new ArrayList<>();

    public final void a() {
        this.f8700a.clear();
    }

    public final int b() {
        return this.f8700a.size();
    }

    public final boolean c() {
        return this.f8700a.isEmpty();
    }

    public final boolean d() {
        return !c();
    }

    public final T e() {
        return this.f8700a.get(b() - 1);
    }

    public final T f(int i11) {
        return this.f8700a.get(i11);
    }

    public final T g() {
        return this.f8700a.remove(b() - 1);
    }

    public final boolean h(T t11) {
        return this.f8700a.add(t11);
    }

    public final T[] i() {
        int size = this.f8700a.size();
        T[] tArr = (T[]) new Object[size];
        for (int i11 = 0; i11 < size; i11++) {
            tArr[i11] = this.f8700a.get(i11);
        }
        return tArr;
    }
}