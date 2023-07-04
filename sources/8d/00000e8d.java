package bw;

import java.util.Set;

/* loaded from: classes6.dex */
public final class i implements tw.e<Set<Object>> {

    /* loaded from: classes6.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final i f8320a = new i();
    }

    public static i a() {
        return a.f8320a;
    }

    public static Set<Object> c() {
        return (Set) tw.h.e(bw.a.f());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public Set<Object> get() {
        return c();
    }
}