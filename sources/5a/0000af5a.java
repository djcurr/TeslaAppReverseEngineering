package r0;

import c1.o0;
import c1.s1;
import c1.y;
import c1.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final l1.c f48861a;

    /* renamed from: b  reason: collision with root package name */
    private final h00.a<f> f48862b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<Object, a> f48863c;

    /* renamed from: d  reason: collision with root package name */
    private x2.d f48864d;

    /* renamed from: e  reason: collision with root package name */
    private long f48865e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Object f48866a;

        /* renamed from: b  reason: collision with root package name */
        private final o0 f48867b;

        /* renamed from: c  reason: collision with root package name */
        private final h00.p<c1.i, Integer, b0> f48868c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f48869d;

        /* renamed from: r0.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C1058a extends u implements h00.p<c1.i, Integer, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ c f48870a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ a f48871b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: r0.c$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1059a extends u implements h00.l<z, y> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ c f48872a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ a f48873b;

                /* renamed from: r0.c$a$a$a$a  reason: collision with other inner class name */
                /* loaded from: classes.dex */
                public static final class C1060a implements y {

                    /* renamed from: a  reason: collision with root package name */
                    final /* synthetic */ c f48874a;

                    /* renamed from: b  reason: collision with root package name */
                    final /* synthetic */ a f48875b;

                    public C1060a(c cVar, a aVar) {
                        this.f48874a = cVar;
                        this.f48875b = aVar;
                    }

                    @Override // c1.y
                    public void dispose() {
                        this.f48874a.f48863c.remove(this.f48875b.c());
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C1059a(c cVar, a aVar) {
                    super(1);
                    this.f48872a = cVar;
                    this.f48873b = aVar;
                }

                @Override // h00.l
                public final y invoke(z DisposableEffect) {
                    kotlin.jvm.internal.s.g(DisposableEffect, "$this$DisposableEffect");
                    return new C1060a(this.f48872a, this.f48873b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1058a(c cVar, a aVar) {
                super(2);
                this.f48870a = cVar;
                this.f48871b = aVar;
            }

            @Override // h00.p
            public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                int intValue;
                if (((i11 & 11) ^ 2) != 0 || !iVar.i()) {
                    f fVar = (f) this.f48870a.f48862b.invoke();
                    Integer num = fVar.a().get(this.f48871b.c());
                    if (num == null) {
                        num = null;
                    } else {
                        this.f48871b.e(num.intValue());
                    }
                    if (num == null) {
                        intValue = this.f48871b.d();
                    } else {
                        intValue = num.intValue();
                    }
                    iVar.x(494375263);
                    if (intValue < fVar.c()) {
                        Object d11 = fVar.d(intValue);
                        if (kotlin.jvm.internal.s.c(d11, this.f48871b.c())) {
                            this.f48870a.f48861a.a(d11, fVar.b(intValue), iVar, 520);
                        }
                    }
                    iVar.N();
                    c1.b0.a(this.f48871b.c(), new C1059a(this.f48870a, this.f48871b), iVar, 8);
                    return;
                }
                iVar.G();
            }
        }

        public a(c this$0, int i11, Object key) {
            o0 d11;
            kotlin.jvm.internal.s.g(this$0, "this$0");
            kotlin.jvm.internal.s.g(key, "key");
            this.f48869d = this$0;
            this.f48866a = key;
            d11 = s1.d(Integer.valueOf(i11), null, 2, null);
            this.f48867b = d11;
            this.f48868c = j1.c.c(-985530431, true, new C1058a(this$0, this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(int i11) {
            this.f48867b.setValue(Integer.valueOf(i11));
        }

        public final h00.p<c1.i, Integer, b0> b() {
            return this.f48868c;
        }

        public final Object c() {
            return this.f48866a;
        }

        public final int d() {
            return ((Number) this.f48867b.getValue()).intValue();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(l1.c saveableStateHolder, h00.a<? extends f> itemsProvider) {
        kotlin.jvm.internal.s.g(saveableStateHolder, "saveableStateHolder");
        kotlin.jvm.internal.s.g(itemsProvider, "itemsProvider");
        this.f48861a = saveableStateHolder;
        this.f48862b = itemsProvider;
        this.f48863c = new LinkedHashMap();
        this.f48864d = x2.f.a(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.f48865e = x2.c.b(0, 0, 0, 0, 15, null);
    }

    public final h00.p<c1.i, Integer, b0> d(int i11, Object key) {
        kotlin.jvm.internal.s.g(key, "key");
        a aVar = this.f48863c.get(key);
        if (aVar != null && aVar.d() == i11) {
            return aVar.b();
        }
        a aVar2 = new a(this, i11, key);
        this.f48863c.put(key, aVar2);
        return aVar2.b();
    }

    public final void e(x2.d density, long j11) {
        kotlin.jvm.internal.s.g(density, "density");
        if (kotlin.jvm.internal.s.c(density, this.f48864d) && x2.b.g(j11, this.f48865e)) {
            return;
        }
        this.f48864d = density;
        this.f48865e = j11;
        this.f48863c.clear();
    }
}