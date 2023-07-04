package t00;

import java.util.ServiceLoader;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import w00.b0;
import w00.x;

/* loaded from: classes5.dex */
public interface a {

    /* renamed from: a  reason: collision with root package name */
    public static final C1138a f51275a = C1138a.f51276a;

    /* renamed from: t00.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public static final class C1138a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ C1138a f51276a = new C1138a();

        /* renamed from: b  reason: collision with root package name */
        private static final vz.k<a> f51277b;

        /* renamed from: t00.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C1139a extends u implements h00.a<a> {

            /* renamed from: a  reason: collision with root package name */
            public static final C1139a f51278a = new C1139a();

            C1139a() {
                super(0);
            }

            @Override // h00.a
            /* renamed from: a */
            public final a invoke() {
                ServiceLoader implementations = ServiceLoader.load(a.class, a.class.getClassLoader());
                s.f(implementations, "implementations");
                a aVar = (a) wz.u.c0(implementations);
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("No BuiltInsLoader implementation was found. Please ensure that the META-INF/services/ is not stripped from your application and that the Java virtual machine is not running under a security manager");
            }
        }

        static {
            vz.k<a> b11;
            b11 = vz.m.b(kotlin.b.PUBLICATION, C1139a.f51278a);
            f51277b = b11;
        }

        private C1138a() {
        }

        public final a a() {
            return f51277b.getValue();
        }
    }

    b0 a(j20.n nVar, x xVar, Iterable<? extends x00.b> iterable, x00.c cVar, x00.a aVar, boolean z11);
}