package tv;

import java.util.Set;
import pr.u;

/* loaded from: classes6.dex */
public final class h implements tw.e<Set<u<?>>> {

    /* loaded from: classes6.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final h f52575a = new h();
    }

    public static h a() {
        return a.f52575a;
    }

    public static Set<u<?>> c() {
        return (Set) tw.h.e(g.a());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public Set<u<?>> get() {
        return c();
    }
}