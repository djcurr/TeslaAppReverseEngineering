package b20;

import java.util.Collection;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import wz.w;

/* loaded from: classes5.dex */
public interface f {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7358a = a.f7359a;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f7359a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final b20.a f7360b;

        static {
            List i11;
            i11 = w.i();
            f7360b = new b20.a(i11);
        }

        private a() {
        }

        public final b20.a a() {
            return f7360b;
        }
    }

    List<u10.f> a(w00.c cVar);

    void b(w00.c cVar, u10.f fVar, Collection<h> collection);

    void c(w00.c cVar, u10.f fVar, Collection<h> collection);

    void d(w00.c cVar, List<w00.b> list);

    List<u10.f> e(w00.c cVar);
}