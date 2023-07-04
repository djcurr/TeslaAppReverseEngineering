package bw;

import java.util.Set;
import pr.u;

/* loaded from: classes6.dex */
public final class k implements tw.e<Set<u<?>>> {

    /* loaded from: classes6.dex */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private static final k f8322a = new k();
    }

    public static k a() {
        return a.f8322a;
    }

    public static Set<u<?>> c() {
        return (Set) tw.h.e(bw.a.i());
    }

    @Override // javax.inject.Provider
    /* renamed from: b */
    public Set<u<?>> get() {
        return c();
    }
}