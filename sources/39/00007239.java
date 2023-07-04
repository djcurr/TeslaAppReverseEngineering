package h20;

import d10.c;
import g20.i;
import g20.j;
import g20.k;
import g20.q;
import g20.r;
import g20.u;
import h00.l;
import j20.n;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.protobuf.f;
import n00.g;
import t00.k;
import w00.b0;
import w00.c0;
import w00.x;
import w00.z;
import wz.w;

/* loaded from: classes5.dex */
public final class b implements t00.a {

    /* renamed from: b  reason: collision with root package name */
    private final d f28773b = new d();

    /* loaded from: classes5.dex */
    /* synthetic */ class a extends o implements l<String, InputStream> {
        a(Object obj) {
            super(1, obj);
        }

        @Override // h00.l
        /* renamed from: d */
        public final InputStream mo12invoke(String p02) {
            s.g(p02, "p0");
            return ((d) this.receiver).a(p02);
        }

        @Override // kotlin.jvm.internal.f, n00.c
        public final String getName() {
            return "loadResource";
        }

        @Override // kotlin.jvm.internal.f
        public final g getOwner() {
            return m0.b(d.class);
        }

        @Override // kotlin.jvm.internal.f
        public final String getSignature() {
            return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
        }
    }

    @Override // t00.a
    public b0 a(n storageManager, x builtInsModule, Iterable<? extends x00.b> classDescriptorFactories, x00.c platformDependentDeclarationFilter, x00.a additionalClassPartsProvider, boolean z11) {
        s.g(storageManager, "storageManager");
        s.g(builtInsModule, "builtInsModule");
        s.g(classDescriptorFactories, "classDescriptorFactories");
        s.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        s.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        return b(storageManager, builtInsModule, k.f51321p, classDescriptorFactories, platformDependentDeclarationFilter, additionalClassPartsProvider, z11, new a(this.f28773b));
    }

    public final b0 b(n storageManager, x module, Set<u10.c> packageFqNames, Iterable<? extends x00.b> classDescriptorFactories, x00.c platformDependentDeclarationFilter, x00.a additionalClassPartsProvider, boolean z11, l<? super String, ? extends InputStream> loadResource) {
        int t11;
        List i11;
        s.g(storageManager, "storageManager");
        s.g(module, "module");
        s.g(packageFqNames, "packageFqNames");
        s.g(classDescriptorFactories, "classDescriptorFactories");
        s.g(platformDependentDeclarationFilter, "platformDependentDeclarationFilter");
        s.g(additionalClassPartsProvider, "additionalClassPartsProvider");
        s.g(loadResource, "loadResource");
        t11 = wz.x.t(packageFqNames, 10);
        ArrayList<c> arrayList = new ArrayList(t11);
        for (u10.c cVar : packageFqNames) {
            String n11 = h20.a.f28772m.n(cVar);
            InputStream mo12invoke = loadResource.mo12invoke(n11);
            if (mo12invoke != null) {
                arrayList.add(c.f28774n.a(cVar, storageManager, module, mo12invoke, z11));
            } else {
                throw new IllegalStateException(s.p("Resource not found in classpath: ", n11));
            }
        }
        c0 c0Var = new c0(arrayList);
        z zVar = new z(storageManager, module);
        k.a aVar = k.a.f27416a;
        g20.n nVar = new g20.n(c0Var);
        h20.a aVar2 = h20.a.f28772m;
        g20.d dVar = new g20.d(module, zVar, aVar2);
        u.a aVar3 = u.a.f27444a;
        q DO_NOTHING = q.f27438a;
        s.f(DO_NOTHING, "DO_NOTHING");
        c.a aVar4 = c.a.f23289a;
        r.a aVar5 = r.a.f27439a;
        i a11 = i.f27393a.a();
        f e11 = aVar2.e();
        i11 = w.i();
        j jVar = new j(storageManager, module, aVar, nVar, dVar, c0Var, aVar3, DO_NOTHING, aVar4, aVar5, classDescriptorFactories, zVar, a11, additionalClassPartsProvider, platformDependentDeclarationFilter, e11, null, new c20.b(storageManager, i11), null, 327680, null);
        for (c cVar2 : arrayList) {
            cVar2.H0(jVar);
        }
        return c0Var;
    }
}