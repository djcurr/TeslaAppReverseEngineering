package x00;

import java.util.Collection;
import java.util.List;
import k20.d0;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.h;
import u10.f;
import wz.w;

/* loaded from: classes5.dex */
public interface a {

    /* renamed from: x00.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1295a implements a {

        /* renamed from: a  reason: collision with root package name */
        public static final C1295a f56634a = new C1295a();

        private C1295a() {
        }

        @Override // x00.a
        public Collection<w00.b> a(w00.c classDescriptor) {
            List i11;
            s.g(classDescriptor, "classDescriptor");
            i11 = w.i();
            return i11;
        }

        @Override // x00.a
        public Collection<d0> c(w00.c classDescriptor) {
            List i11;
            s.g(classDescriptor, "classDescriptor");
            i11 = w.i();
            return i11;
        }

        @Override // x00.a
        public Collection<f> d(w00.c classDescriptor) {
            List i11;
            s.g(classDescriptor, "classDescriptor");
            i11 = w.i();
            return i11;
        }

        @Override // x00.a
        public Collection<h> e(f name, w00.c classDescriptor) {
            List i11;
            s.g(name, "name");
            s.g(classDescriptor, "classDescriptor");
            i11 = w.i();
            return i11;
        }
    }

    Collection<w00.b> a(w00.c cVar);

    Collection<d0> c(w00.c cVar);

    Collection<f> d(w00.c cVar);

    Collection<h> e(f fVar, w00.c cVar);
}