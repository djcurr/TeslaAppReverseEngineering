package za;

import za.b;

/* loaded from: classes.dex */
public class a<R> implements b<R> {

    /* renamed from: a  reason: collision with root package name */
    static final a<?> f60399a = new a<>();

    /* renamed from: b  reason: collision with root package name */
    private static final c<?> f60400b = new C1379a();

    /* renamed from: za.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1379a<R> implements c<R> {
        @Override // za.c
        public b<R> a(com.bumptech.glide.load.a aVar, boolean z11) {
            return a.f60399a;
        }
    }

    public static <R> c<R> b() {
        return (c<R>) f60400b;
    }

    @Override // za.b
    public boolean a(Object obj, b.a aVar) {
        return false;
    }
}