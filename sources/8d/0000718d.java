package gw;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import wz.x0;

/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static final a f28488a = new a(null);

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Set<pr.u<?>> a(p selfieCameraScreenViewFactory) {
            Set<pr.u<?>> i11;
            kotlin.jvm.internal.s.g(selfieCameraScreenViewFactory, "selfieCameraScreenViewFactory");
            i11 = x0.i(y.f28483b, selfieCameraScreenViewFactory, f0.f28255b, u.f28475b, g.f28261b);
            return i11;
        }
    }

    public static final Set<pr.u<?>> a(p pVar) {
        return f28488a.a(pVar);
    }
}