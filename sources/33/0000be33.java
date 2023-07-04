package x00;

import k20.k0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public interface e {

    /* loaded from: classes5.dex */
    public static final class a implements e {

        /* renamed from: a  reason: collision with root package name */
        public static final a f56638a = new a();

        private a() {
        }

        @Override // x00.e
        public k0 a(u10.b classId, k0 computedType) {
            s.g(classId, "classId");
            s.g(computedType, "computedType");
            return computedType;
        }
    }

    k0 a(u10.b bVar, k0 k0Var);
}