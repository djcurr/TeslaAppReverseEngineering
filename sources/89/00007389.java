package hl;

import com.google.crypto.tink.shaded.protobuf.q0;
import hl.p;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import ol.a0;
import ol.c0;
import ol.y;
import ol.z;

/* loaded from: classes3.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f29334a = Logger.getLogger(r.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final ConcurrentMap<String, d> f29335b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    private static final ConcurrentMap<String, c> f29336c = new ConcurrentHashMap();

    /* renamed from: d  reason: collision with root package name */
    private static final ConcurrentMap<String, Boolean> f29337d = new ConcurrentHashMap();

    /* renamed from: e  reason: collision with root package name */
    private static final ConcurrentMap<Class<?>, q<?, ?>> f29338e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f29339a;

        a(h hVar) {
            this.f29339a = hVar;
        }

        @Override // hl.r.d
        public Class<?> a() {
            return this.f29339a.getClass();
        }

        @Override // hl.r.d
        public Set<Class<?>> b() {
            return this.f29339a.h();
        }

        @Override // hl.r.d
        public <Q> e<Q> c(Class<Q> cls) {
            try {
                return new f(this.f29339a, cls);
            } catch (IllegalArgumentException e11) {
                throw new GeneralSecurityException("Primitive type not supported", e11);
            }
        }

        @Override // hl.r.d
        public e<?> d() {
            h hVar = this.f29339a;
            return new f(hVar, hVar.a());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements c {
        b(h hVar) {
        }
    }

    /* loaded from: classes3.dex */
    private interface c {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public interface d {
        Class<?> a();

        Set<Class<?>> b();

        <P> e<P> c(Class<P> cls);

        e<?> d();
    }

    static {
        new ConcurrentHashMap();
        f29338e = new ConcurrentHashMap();
    }

    private r() {
    }

    private static <T> T a(T t11) {
        Objects.requireNonNull(t11);
        return t11;
    }

    private static <KeyProtoT extends q0> d b(h<KeyProtoT> hVar) {
        return new a(hVar);
    }

    private static <KeyProtoT extends q0> c c(h<KeyProtoT> hVar) {
        return new b(hVar);
    }

    private static synchronized void d(String str, Class<?> cls, boolean z11) {
        synchronized (r.class) {
            ConcurrentMap<String, d> concurrentMap = f29335b;
            if (concurrentMap.containsKey(str)) {
                d dVar = concurrentMap.get(str);
                if (dVar.a().equals(cls)) {
                    if (z11 && !f29337d.get(str).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
                    }
                    return;
                }
                Logger logger = f29334a;
                logger.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, dVar.a().getName(), cls.getName()));
            }
        }
    }

    public static Class<?> e(Class<?> cls) {
        q<?, ?> qVar = f29338e.get(cls);
        if (qVar == null) {
            return null;
        }
        return qVar.a();
    }

    private static synchronized d f(String str) {
        d dVar;
        synchronized (r.class) {
            ConcurrentMap<String, d> concurrentMap = f29335b;
            if (concurrentMap.containsKey(str)) {
                dVar = concurrentMap.get(str);
            } else {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
        }
        return dVar;
    }

    private static <P> e<P> g(String str, Class<P> cls) {
        d f11 = f(str);
        if (cls == null) {
            return (e<P>) f11.d();
        }
        if (f11.b().contains(cls)) {
            return f11.c(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + f11.a() + ", supported primitives: " + s(f11.b()));
    }

    public static <P> P h(String str, com.google.crypto.tink.shaded.protobuf.i iVar, Class<P> cls) {
        return (P) j(str, iVar, (Class) a(cls));
    }

    public static <P> P i(String str, byte[] bArr, Class<P> cls) {
        return (P) h(str, com.google.crypto.tink.shaded.protobuf.i.f(bArr), cls);
    }

    private static <P> P j(String str, com.google.crypto.tink.shaded.protobuf.i iVar, Class<P> cls) {
        return (P) g(str, cls).c(iVar);
    }

    public static <P> p<P> k(i iVar, e<P> eVar, Class<P> cls) {
        return m(iVar, eVar, (Class) a(cls));
    }

    public static <P> p<P> l(i iVar, Class<P> cls) {
        return k(iVar, null, cls);
    }

    private static <P> p<P> m(i iVar, e<P> eVar, Class<P> cls) {
        P p11;
        s.d(iVar.f());
        p<P> f11 = p.f(cls);
        for (c0.c cVar : iVar.f().J()) {
            if (cVar.K() == z.ENABLED) {
                if (eVar != null && eVar.a(cVar.H().I())) {
                    p11 = eVar.c(cVar.H().J());
                } else {
                    p11 = (P) j(cVar.H().I(), cVar.H().J(), cls);
                }
                p.b<P> a11 = f11.a(p11, cVar);
                if (cVar.I() == iVar.f().K()) {
                    f11.g(a11);
                }
            }
        }
        return f11;
    }

    public static e<?> n(String str) {
        return f(str).d();
    }

    public static synchronized q0 o(a0 a0Var) {
        q0 d11;
        synchronized (r.class) {
            e<?> n11 = n(a0Var.I());
            if (f29337d.get(a0Var.I()).booleanValue()) {
                d11 = n11.d(a0Var.J());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.I());
            }
        }
        return d11;
    }

    public static synchronized y p(a0 a0Var) {
        y b11;
        synchronized (r.class) {
            e<?> n11 = n(a0Var.I());
            if (f29337d.get(a0Var.I()).booleanValue()) {
                b11 = n11.b(a0Var.J());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.I());
            }
        }
        return b11;
    }

    public static synchronized <KeyProtoT extends q0> void q(h<KeyProtoT> hVar, boolean z11) {
        synchronized (r.class) {
            if (hVar != null) {
                String c11 = hVar.c();
                d(c11, hVar.getClass(), z11);
                ConcurrentMap<String, d> concurrentMap = f29335b;
                if (!concurrentMap.containsKey(c11)) {
                    concurrentMap.put(c11, b(hVar));
                    f29336c.put(c11, c(hVar));
                }
                f29337d.put(c11, Boolean.valueOf(z11));
            } else {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
        }
    }

    public static synchronized <B, P> void r(q<B, P> qVar) {
        synchronized (r.class) {
            if (qVar != null) {
                Class<P> c11 = qVar.c();
                ConcurrentMap<Class<?>, q<?, ?>> concurrentMap = f29338e;
                if (concurrentMap.containsKey(c11)) {
                    q<?, ?> qVar2 = concurrentMap.get(c11);
                    if (!qVar.getClass().equals(qVar2.getClass())) {
                        Logger logger = f29334a;
                        logger.warning("Attempted overwrite of a registered SetWrapper for type " + c11);
                        throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", c11.getName(), qVar2.getClass().getName(), qVar.getClass().getName()));
                    }
                }
                concurrentMap.put(c11, qVar);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static String s(Set<Class<?>> set) {
        StringBuilder sb2 = new StringBuilder();
        boolean z11 = true;
        for (Class<?> cls : set) {
            if (!z11) {
                sb2.append(", ");
            }
            sb2.append(cls.getCanonicalName());
            z11 = false;
        }
        return sb2.toString();
    }

    public static <B, P> P t(p<B> pVar, Class<P> cls) {
        q<?, ?> qVar = f29338e.get(cls);
        if (qVar != null) {
            if (qVar.a().equals(pVar.d())) {
                return (P) qVar.b(pVar);
            }
            throw new GeneralSecurityException("Wrong input primitive class, expected " + qVar.a() + ", got " + pVar.d());
        }
        throw new GeneralSecurityException("No wrapper found for " + pVar.d().getName());
    }
}