package i10;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.s;
import l10.n;
import l10.r;
import l10.w;
import wz.x0;

/* loaded from: classes5.dex */
public interface b {

    /* loaded from: classes5.dex */
    public static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static final a f29564a = new a();

        private a() {
        }

        @Override // i10.b
        public Set<u10.f> a() {
            Set<u10.f> d11;
            d11 = x0.d();
            return d11;
        }

        @Override // i10.b
        public w b(u10.f name) {
            s.g(name, "name");
            return null;
        }

        @Override // i10.b
        public Set<u10.f> c() {
            Set<u10.f> d11;
            d11 = x0.d();
            return d11;
        }

        @Override // i10.b
        public Set<u10.f> d() {
            Set<u10.f> d11;
            d11 = x0.d();
            return d11;
        }

        @Override // i10.b
        public n e(u10.f name) {
            s.g(name, "name");
            return null;
        }

        @Override // i10.b
        /* renamed from: g */
        public List<r> f(u10.f name) {
            List<r> i11;
            s.g(name, "name");
            i11 = wz.w.i();
            return i11;
        }
    }

    Set<u10.f> a();

    w b(u10.f fVar);

    Set<u10.f> c();

    Set<u10.f> d();

    n e(u10.f fVar);

    Collection<r> f(u10.f fVar);
}