package s0;

import c1.o0;
import c1.s1;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: g  reason: collision with root package name */
    private static final a f49888g = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private int f49889a;

    /* renamed from: b  reason: collision with root package name */
    private int f49890b;

    /* renamed from: c  reason: collision with root package name */
    private final o0<Integer> f49891c;

    /* renamed from: d  reason: collision with root package name */
    private final o0<Integer> f49892d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f49893e;

    /* renamed from: f  reason: collision with root package name */
    private Object f49894f;

    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int b(Object obj, int i11, k kVar) {
            Integer num;
            return obj == null ? i11 : ((i11 >= kVar.c() || !kotlin.jvm.internal.s.c(obj, kVar.d(i11))) && (num = kVar.a().get(obj)) != null) ? s0.a.a(num.intValue()) : i11;
        }
    }

    public t(int i11, int i12) {
        o0<Integer> d11;
        o0<Integer> d12;
        this.f49889a = s0.a.a(i11);
        this.f49890b = i12;
        d11 = s1.d(Integer.valueOf(a()), null, 2, null);
        this.f49891c = d11;
        d12 = s1.d(Integer.valueOf(this.f49890b), null, 2, null);
        this.f49892d = d12;
    }

    private final void f(int i11, int i12) {
        if (((float) i11) >= BitmapDescriptorFactory.HUE_RED) {
            if (!s0.a.b(i11, a())) {
                this.f49889a = i11;
                this.f49891c.setValue(Integer.valueOf(i11));
            }
            if (i12 != this.f49890b) {
                this.f49890b = i12;
                this.f49892d.setValue(Integer.valueOf(i12));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Index should be non-negative (" + i11 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
    }

    public final int a() {
        return this.f49889a;
    }

    public final int b() {
        return this.f49891c.getValue().intValue();
    }

    public final int c() {
        return this.f49892d.getValue().intValue();
    }

    public final int d() {
        return this.f49890b;
    }

    public final void e(int i11, int i12) {
        f(i11, i12);
        this.f49894f = null;
    }

    public final void g(p measureResult) {
        kotlin.jvm.internal.s.g(measureResult, "measureResult");
        u g11 = measureResult.g();
        this.f49894f = g11 == null ? null : g11.c();
        if (this.f49893e || measureResult.d() > 0) {
            this.f49893e = true;
            int h11 = measureResult.h();
            if (((float) h11) >= BitmapDescriptorFactory.HUE_RED) {
                u g12 = measureResult.g();
                f(s0.a.a(g12 != null ? g12.b() : 0), h11);
                return;
            }
            throw new IllegalStateException(("scrollOffset should be non-negative (" + h11 + CoreConstants.RIGHT_PARENTHESIS_CHAR).toString());
        }
    }

    public final void h(k itemsProvider) {
        kotlin.jvm.internal.s.g(itemsProvider, "itemsProvider");
        f(f49888g.b(this.f49894f, a(), itemsProvider), this.f49890b);
    }
}