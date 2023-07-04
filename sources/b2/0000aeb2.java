package qv;

import java.util.Set;
import pr.u;

/* loaded from: classes6.dex */
public final class i implements tw.e<Set<u<?>>> {

    /* loaded from: classes6.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final i f48535a = new i();
    }

    public static i a() {
        return a.f48535a;
    }

    public static Set<u<?>> c() {
        return (Set) tw.h.e(h.a());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public Set<u<?>> get() {
        return c();
    }
}