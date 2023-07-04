package s0;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class y<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final List<b<T>> f49935a;

    /* renamed from: b  reason: collision with root package name */
    private final List<b<T>> f49936b;

    /* renamed from: c  reason: collision with root package name */
    private int f49937c;

    public y() {
        ArrayList arrayList = new ArrayList();
        this.f49935a = arrayList;
        this.f49936b = arrayList;
    }

    @Override // s0.c
    public List<b<T>> a() {
        return this.f49936b;
    }

    @Override // s0.c
    public int b() {
        return this.f49937c;
    }

    public final void c(int i11, T t11) {
        if (i11 == 0) {
            return;
        }
        b<T> bVar = new b<>(b(), i11, t11);
        this.f49937c = b() + i11;
        this.f49935a.add(bVar);
    }
}