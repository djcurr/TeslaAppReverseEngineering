package com.facebook.datasource;

import md.n;

/* loaded from: classes.dex */
public class d {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* loaded from: classes.dex */
    static class a<T> implements n<c<T>> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Throwable f11074a;

        a(Throwable th2) {
            this.f11074a = th2;
        }

        @Override // md.n
        /* renamed from: a */
        public c<T> get() {
            return d.b(this.f11074a);
        }
    }

    public static <T> n<c<T>> a(Throwable th2) {
        return new a(th2);
    }

    public static <T> c<T> b(Throwable th2) {
        h x11 = h.x();
        x11.p(th2);
        return x11;
    }
}