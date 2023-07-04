package i10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.reflect.KProperty;
import l10.u;
import n10.n;
import n10.o;
import o10.a;
import vz.p;
import vz.v;
import w00.n0;
import wz.s0;
import wz.w;
import wz.x;
import y00.z;

/* loaded from: classes5.dex */
public final class h extends z {

    /* renamed from: m  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f29622m = {m0.j(new f0(m0.b(h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), m0.j(new f0(m0.b(h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};

    /* renamed from: g  reason: collision with root package name */
    private final u f29623g;

    /* renamed from: h  reason: collision with root package name */
    private final h10.h f29624h;

    /* renamed from: i  reason: collision with root package name */
    private final j20.i f29625i;

    /* renamed from: j  reason: collision with root package name */
    private final d f29626j;

    /* renamed from: k  reason: collision with root package name */
    private final j20.i<List<u10.c>> f29627k;

    /* renamed from: l  reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.g f29628l;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.a<Map<String, ? extends o>> {
        a() {
            super(0);
        }

        @Override // h00.a
        public final Map<String, ? extends o> invoke() {
            Map<String, ? extends o> t11;
            n10.u o11 = h.this.f29624h.a().o();
            String b11 = h.this.e().b();
            s.f(b11, "fqName.asString()");
            List<String> a11 = o11.a(b11);
            h hVar = h.this;
            ArrayList arrayList = new ArrayList();
            for (String str : a11) {
                u10.b m11 = u10.b.m(b20.d.d(str).e());
                s.f(m11, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                o b12 = n.b(hVar.f29624h.a().j(), m11);
                p a12 = b12 == null ? null : v.a(str, b12);
                if (a12 != null) {
                    arrayList.add(a12);
                }
            }
            t11 = s0.t(arrayList);
            return t11;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<HashMap<b20.d, b20.d>> {

        /* loaded from: classes5.dex */
        public /* synthetic */ class a {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f29631a;

            static {
                int[] iArr = new int[a.EnumC0828a.values().length];
                iArr[a.EnumC0828a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                iArr[a.EnumC0828a.FILE_FACADE.ordinal()] = 2;
                f29631a = iArr;
            }
        }

        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final HashMap<b20.d, b20.d> invoke() {
            HashMap<b20.d, b20.d> hashMap = new HashMap<>();
            for (Map.Entry<String, o> entry : h.this.I0().entrySet()) {
                b20.d d11 = b20.d.d(entry.getKey());
                s.f(d11, "byInternalName(partInternalName)");
                o10.a a11 = entry.getValue().a();
                int i11 = a.f29631a[a11.c().ordinal()];
                if (i11 == 1) {
                    String e11 = a11.e();
                    if (e11 != null) {
                        b20.d d12 = b20.d.d(e11);
                        s.f(d12, "byInternalName(header.mu…: continue@kotlinClasses)");
                        hashMap.put(d11, d12);
                    }
                } else if (i11 == 2) {
                    hashMap.put(d11, d11);
                }
            }
            return hashMap;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.a<List<? extends u10.c>> {
        c() {
            super(0);
        }

        @Override // h00.a
        public final List<? extends u10.c> invoke() {
            int t11;
            Collection<u> v11 = h.this.f29623g.v();
            t11 = x.t(v11, 10);
            ArrayList arrayList = new ArrayList(t11);
            for (u uVar : v11) {
                arrayList.add(uVar.e());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h10.h outerContext, u jPackage) {
        super(outerContext.d(), jPackage.e());
        List i11;
        s.g(outerContext, "outerContext");
        s.g(jPackage, "jPackage");
        this.f29623g = jPackage;
        h10.h d11 = h10.a.d(outerContext, this, null, 0, 6, null);
        this.f29624h = d11;
        this.f29625i = d11.e().b(new a());
        this.f29626j = new d(d11, jPackage, this);
        j20.n e11 = d11.e();
        c cVar = new c();
        i11 = w.i();
        this.f29627k = e11.f(cVar, i11);
        this.f29628l = d11.a().i().b() ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b() : h10.f.a(d11, jPackage);
        d11.e().b(new b());
    }

    public final w00.c H0(l10.g jClass) {
        s.g(jClass, "jClass");
        return this.f29626j.j().O(jClass);
    }

    public final Map<String, o> I0() {
        return (Map) j20.m.a(this.f29625i, this, f29622m[0]);
    }

    @Override // w00.a0
    /* renamed from: J0 */
    public d m() {
        return this.f29626j;
    }

    public final List<u10.c> K0() {
        return this.f29627k.invoke();
    }

    @Override // y00.z, y00.k, w00.l
    public n0 f() {
        return new n10.p(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.b, kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
        return this.f29628l;
    }

    @Override // y00.z, y00.j
    public String toString() {
        return "Lazy Java package fragment: " + e() + " of module " + this.f29624h.a().m();
    }
}