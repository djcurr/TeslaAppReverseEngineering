package d20;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import w00.i0;
import wz.x0;

/* loaded from: classes5.dex */
public interface h extends k {

    /* renamed from: a  reason: collision with root package name */
    public static final a f23478a = a.f23479a;

    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f23479a = new a();

        /* renamed from: b  reason: collision with root package name */
        private static final h00.l<u10.f, Boolean> f23480b = C0452a.f23481a;

        /* renamed from: d20.h$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        static final class C0452a extends u implements h00.l<u10.f, Boolean> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0452a f23481a = new C0452a();

            C0452a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: a */
            public final Boolean invoke(u10.f it2) {
                s.g(it2, "it");
                return Boolean.TRUE;
            }
        }

        private a() {
        }

        public final h00.l<u10.f, Boolean> a() {
            return f23480b;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends i {

        /* renamed from: b  reason: collision with root package name */
        public static final b f23482b = new b();

        private b() {
        }

        @Override // d20.i, d20.h
        public Set<u10.f> b() {
            Set<u10.f> d11;
            d11 = x0.d();
            return d11;
        }

        @Override // d20.i, d20.h
        public Set<u10.f> d() {
            Set<u10.f> d11;
            d11 = x0.d();
            return d11;
        }

        @Override // d20.i, d20.h
        public Set<u10.f> f() {
            Set<u10.f> d11;
            d11 = x0.d();
            return d11;
        }
    }

    Collection<? extends i0> a(u10.f fVar, d10.b bVar);

    Set<u10.f> b();

    Collection<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> c(u10.f fVar, d10.b bVar);

    Set<u10.f> d();

    Set<u10.f> f();
}