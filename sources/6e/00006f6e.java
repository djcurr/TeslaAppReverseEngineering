package g20;

import k20.d0;
import k20.k0;

/* loaded from: classes5.dex */
public interface r {

    /* loaded from: classes5.dex */
    public static final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        public static final a f27439a = new a();

        private a() {
        }

        @Override // g20.r
        public d0 a(p10.q proto, String flexibleId, k0 lowerBound, k0 upperBound) {
            kotlin.jvm.internal.s.g(proto, "proto");
            kotlin.jvm.internal.s.g(flexibleId, "flexibleId");
            kotlin.jvm.internal.s.g(lowerBound, "lowerBound");
            kotlin.jvm.internal.s.g(upperBound, "upperBound");
            throw new IllegalArgumentException("This method should not be used.");
        }
    }

    d0 a(p10.q qVar, String str, k0 k0Var, k0 k0Var2);
}