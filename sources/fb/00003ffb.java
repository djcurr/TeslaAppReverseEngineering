package com.plaid.internal;

import java.util.List;

/* loaded from: classes2.dex */
public final class c4<T> {

    /* renamed from: a  reason: collision with root package name */
    public final kotlinx.coroutines.flow.t<Integer> f18243a;

    /* renamed from: b  reason: collision with root package name */
    public int f18244b;

    /* renamed from: c  reason: collision with root package name */
    public List<? extends T> f18245c;

    public c4(List<? extends T> list) {
        kotlinx.coroutines.flow.t<Integer> b11 = kotlinx.coroutines.flow.a0.b(1, 0, kotlinx.coroutines.channels.a.DROP_OLDEST, 2, null);
        this.f18243a = b11;
        this.f18244b = -1;
        this.f18245c = list;
        if (list == null || !(!list.isEmpty())) {
            return;
        }
        this.f18244b = 0;
        b11.b(0);
    }

    public final void a(List<? extends T> list) {
        if (this.f18245c == null) {
            if (!list.isEmpty()) {
                this.f18245c = list;
                this.f18244b = 0;
                this.f18243a.b(0);
                return;
            }
            throw new IllegalArgumentException("Values must not be empty");
        }
        throw new IllegalStateException("Values are already set");
    }

    public final boolean b() {
        int i11 = this.f18244b;
        List<? extends T> list = this.f18245c;
        return i11 < (list == null ? 0 : list.size()) - 1;
    }

    public final void c() {
        if (b()) {
            kotlinx.coroutines.flow.t<Integer> tVar = this.f18243a;
            int i11 = this.f18244b + 1;
            this.f18244b = i11;
            tVar.b(Integer.valueOf(i11));
            return;
        }
        throw new IndexOutOfBoundsException("Can't go to next - no more elements");
    }

    public /* synthetic */ c4(List list, int i11) {
        this(null);
    }

    public final T a() {
        List<? extends T> list = this.f18245c;
        if (list == null ? false : !list.isEmpty()) {
            List<? extends T> list2 = this.f18245c;
            kotlin.jvm.internal.s.e(list2);
            return list2.get(this.f18244b);
        }
        throw new IllegalStateException("No values have been set");
    }
}