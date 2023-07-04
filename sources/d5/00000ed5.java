package c1;

import android.os.Looper;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final vz.k f8436a;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<m0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f8437a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final m0 invoke() {
            return Looper.getMainLooper() != null ? u.f8694a : f1.f8464a;
        }
    }

    static {
        vz.k a11;
        a11 = vz.m.a(a.f8437a);
        f8436a = a11;
    }

    public static final <T> m1.q<T> a(T t11, m1<T> policy) {
        kotlin.jvm.internal.s.g(policy, "policy");
        return new r0(t11, policy);
    }
}