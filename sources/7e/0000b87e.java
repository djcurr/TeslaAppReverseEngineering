package v1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.s;
import s1.l;
import s1.m;
import t1.q0;
import t1.u;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final x2.d f53865a = x2.f.a(1.0f, 1.0f);

    /* loaded from: classes.dex */
    public static final class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ d f53866a;

        a(d dVar) {
            this.f53866a = dVar;
        }

        @Override // v1.g
        public void a(float f11, float f12, float f13, float f14, int i11) {
            this.f53866a.b().a(f11, f12, f13, f14, i11);
        }

        @Override // v1.g
        public void b(float f11, float f12) {
            this.f53866a.b().b(f11, f12);
        }

        @Override // v1.g
        public void c(q0 path, int i11) {
            s.g(path, "path");
            this.f53866a.b().c(path, i11);
        }

        @Override // v1.g
        public void d(float[] matrix) {
            s.g(matrix, "matrix");
            this.f53866a.b().q(matrix);
        }

        @Override // v1.g
        public void e(float f11, float f12, long j11) {
            u b11 = this.f53866a.b();
            b11.b(s1.f.l(j11), s1.f.m(j11));
            b11.e(f11, f12);
            b11.b(-s1.f.l(j11), -s1.f.m(j11));
        }

        @Override // v1.g
        public void f(float f11, long j11) {
            u b11 = this.f53866a.b();
            b11.b(s1.f.l(j11), s1.f.m(j11));
            b11.k(f11);
            b11.b(-s1.f.l(j11), -s1.f.m(j11));
        }

        @Override // v1.g
        public void g(float f11, float f12, float f13, float f14) {
            u b11 = this.f53866a.b();
            d dVar = this.f53866a;
            long a11 = m.a(l.i(h()) - (f13 + f11), l.g(h()) - (f14 + f12));
            if (l.i(a11) >= BitmapDescriptorFactory.HUE_RED && l.g(a11) >= BitmapDescriptorFactory.HUE_RED) {
                dVar.d(a11);
                b11.b(f11, f12);
                return;
            }
            throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
        }

        public long h() {
            return this.f53866a.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final g c(d dVar) {
        return new a(dVar);
    }
}