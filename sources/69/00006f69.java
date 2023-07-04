package g20;

import java.util.ArrayList;
import java.util.Collection;
import w00.n0;

/* loaded from: classes5.dex */
public abstract class p extends o {

    /* renamed from: h  reason: collision with root package name */
    private final r10.a f27430h;

    /* renamed from: i  reason: collision with root package name */
    private final i20.f f27431i;

    /* renamed from: j  reason: collision with root package name */
    private final r10.d f27432j;

    /* renamed from: k  reason: collision with root package name */
    private final x f27433k;

    /* renamed from: l  reason: collision with root package name */
    private p10.m f27434l;

    /* renamed from: m  reason: collision with root package name */
    private d20.h f27435m;

    /* loaded from: classes5.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<u10.b, n0> {
        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final n0 invoke(u10.b it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            i20.f fVar = p.this.f27431i;
            if (fVar == null) {
                n0 NO_SOURCE = n0.f55303a;
                kotlin.jvm.internal.s.f(NO_SOURCE, "NO_SOURCE");
                return NO_SOURCE;
            }
            return fVar;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<Collection<? extends u10.f>> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final Collection<u10.f> invoke() {
            int t11;
            Collection<u10.b> b11 = p.this.F0().b();
            ArrayList<u10.b> arrayList = new ArrayList();
            for (Object obj : b11) {
                u10.b bVar = (u10.b) obj;
                if ((bVar.l() || h.f27386c.a().contains(bVar)) ? false : true) {
                    arrayList.add(obj);
                }
            }
            t11 = wz.x.t(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(t11);
            for (u10.b bVar2 : arrayList) {
                arrayList2.add(bVar2.j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u10.c fqName, j20.n storageManager, w00.x module, p10.m proto, r10.a metadataVersion, i20.f fVar) {
        super(fqName, storageManager, module);
        kotlin.jvm.internal.s.g(fqName, "fqName");
        kotlin.jvm.internal.s.g(storageManager, "storageManager");
        kotlin.jvm.internal.s.g(module, "module");
        kotlin.jvm.internal.s.g(proto, "proto");
        kotlin.jvm.internal.s.g(metadataVersion, "metadataVersion");
        this.f27430h = metadataVersion;
        this.f27431i = fVar;
        p10.p J = proto.J();
        kotlin.jvm.internal.s.f(J, "proto.strings");
        p10.o I = proto.I();
        kotlin.jvm.internal.s.f(I, "proto.qualifiedNames");
        r10.d dVar = new r10.d(J, I);
        this.f27432j = dVar;
        this.f27433k = new x(proto, dVar, metadataVersion, new a());
        this.f27434l = proto;
    }

    @Override // g20.o
    public void H0(j components) {
        kotlin.jvm.internal.s.g(components, "components");
        p10.m mVar = this.f27434l;
        if (mVar != null) {
            this.f27434l = null;
            p10.l H = mVar.H();
            kotlin.jvm.internal.s.f(H, "proto.`package`");
            this.f27435m = new i20.i(this, H, this.f27432j, this.f27430h, this.f27431i, components, kotlin.jvm.internal.s.p("scope of ", this), new b());
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    @Override // g20.o
    /* renamed from: J0 */
    public x F0() {
        return this.f27433k;
    }

    @Override // w00.a0
    public d20.h m() {
        d20.h hVar = this.f27435m;
        if (hVar == null) {
            kotlin.jvm.internal.s.x("_memberScope");
            return null;
        }
        return hVar;
    }
}