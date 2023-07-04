package e10;

import java.util.Map;
import wz.s0;

/* loaded from: classes5.dex */
public interface b0<T> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f24427a = a.f24428a;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f24428a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final b0 f24429b;

        static {
            Map i11;
            i11 = s0.i();
            f24429b = new c0(i11);
        }

        private a() {
        }

        public final b0 a() {
            return f24429b;
        }
    }

    T a(u10.c cVar);
}