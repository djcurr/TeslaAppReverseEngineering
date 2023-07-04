package v00;

import j20.m;
import j20.n;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.KProperty;
import w00.x;
import wz.e0;

/* loaded from: classes5.dex */
public final class f extends t00.h {

    /* renamed from: j  reason: collision with root package name */
    static final /* synthetic */ KProperty<Object>[] f53815j = {m0.j(new f0(m0.b(f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: g  reason: collision with root package name */
    private final a f53816g;

    /* renamed from: h  reason: collision with root package name */
    private h00.a<b> f53817h;

    /* renamed from: i  reason: collision with root package name */
    private final j20.i f53818i;

    /* loaded from: classes5.dex */
    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final x f53819a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f53820b;

        public b(x ownerModuleDescriptor, boolean z11) {
            s.g(ownerModuleDescriptor, "ownerModuleDescriptor");
            this.f53819a = ownerModuleDescriptor;
            this.f53820b = z11;
        }

        public final x a() {
            return this.f53819a;
        }

        public final boolean b() {
            return this.f53820b;
        }
    }

    /* loaded from: classes5.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f53821a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[a.FALLBACK.ordinal()] = 3;
            f53821a = iArr;
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends u implements h00.a<g> {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ n f53823b;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends u implements h00.a<b> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f f53824a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f53824a = fVar;
            }

            @Override // h00.a
            /* renamed from: a */
            public final b mo11invoke() {
                h00.a aVar = this.f53824a.f53817h;
                if (aVar != null) {
                    b bVar = (b) aVar.mo11invoke();
                    this.f53824a.f53817h = null;
                    return bVar;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(0);
            this.f53823b = nVar;
        }

        @Override // h00.a
        /* renamed from: a */
        public final g mo11invoke() {
            y00.x builtInsModule = f.this.r();
            s.f(builtInsModule, "builtInsModule");
            return new g(builtInsModule, this.f53823b, new a(f.this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class e extends u implements h00.a<b> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f53825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f53826b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(x xVar, boolean z11) {
            super(0);
            this.f53825a = xVar;
            this.f53826b = z11;
        }

        @Override // h00.a
        /* renamed from: a */
        public final b mo11invoke() {
            return new b(this.f53825a, this.f53826b);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n storageManager, a kind) {
        super(storageManager);
        s.g(storageManager, "storageManager");
        s.g(kind, "kind");
        this.f53816g = kind;
        this.f53818i = storageManager.b(new d(storageManager));
        int i11 = c.f53821a[kind.ordinal()];
        if (i11 == 2) {
            f(false);
        } else if (i11 != 3) {
        } else {
            f(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // t00.h
    /* renamed from: F0 */
    public List<x00.b> mo230v() {
        List<x00.b> x02;
        Iterable<x00.b> mo230v = super.mo230v();
        s.f(mo230v, "super.getClassDescriptorFactories()");
        n storageManager = U();
        s.f(storageManager, "storageManager");
        y00.x builtInsModule = r();
        s.f(builtInsModule, "builtInsModule");
        x02 = e0.x0(mo230v, new v00.e(storageManager, builtInsModule, null, 4, null));
        return x02;
    }

    public final g G0() {
        return (g) m.a(this.f53818i, this, f53815j[0]);
    }

    public final void H0(x moduleDescriptor, boolean z11) {
        s.g(moduleDescriptor, "moduleDescriptor");
        I0(new e(moduleDescriptor, z11));
    }

    public final void I0(h00.a<b> computation) {
        s.g(computation, "computation");
        this.f53817h = computation;
    }

    @Override // t00.h
    /* renamed from: M */
    protected x00.c mo229M() {
        return G0();
    }

    @Override // t00.h
    protected x00.a g() {
        return G0();
    }
}