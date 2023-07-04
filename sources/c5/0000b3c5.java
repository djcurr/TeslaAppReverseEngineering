package t0;

import f2.o;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import s1.h;
import s1.i;
import vz.b0;

/* loaded from: classes.dex */
public interface e {

    /* renamed from: j1  reason: collision with root package name */
    public static final a f51264j1 = a.f51265a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f51265a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final g2.f<e> f51266b = g2.c.a(C1136a.f51268a);

        /* renamed from: c  reason: collision with root package name */
        private static final e f51267c = new b();

        /* renamed from: t0.e$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C1136a extends u implements h00.a<e> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1136a f51268a = new C1136a();

            C1136a() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final e invoke() {
                return a.f51265a.b();
            }
        }

        /* loaded from: classes.dex */
        public static final class b implements e {
            b() {
            }

            @Override // t0.e
            public Object a(h hVar, zz.d<? super b0> dVar) {
                return b0.f54756a;
            }

            @Override // t0.e
            public h b(h rect, o layoutCoordinates) {
                s.g(rect, "rect");
                s.g(layoutCoordinates, "layoutCoordinates");
                return i.b(layoutCoordinates.q0(rect.m()), rect.k());
            }
        }

        private a() {
        }

        public final g2.f<e> a() {
            return f51266b;
        }

        public final e b() {
            return f51267c;
        }
    }

    Object a(h hVar, zz.d<? super b0> dVar);

    h b(h hVar, o oVar);
}