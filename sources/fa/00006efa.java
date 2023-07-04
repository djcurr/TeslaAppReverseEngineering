package ft;

import com.squareup.moshi.f;
import com.squareup.moshi.p;
import com.tesla.domain.model.EnergySite;
import com.tesla.domain.model.Product;
import com.tesla.domain.model.Vehicle;
import com.tesla.domain.model.adapter.ForceToIntAdapter;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.k;
import vz.m;

/* loaded from: classes6.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f27026a = new a();

    /* renamed from: b  reason: collision with root package name */
    private static final k f27027b;

    /* renamed from: c  reason: collision with root package name */
    private static final k f27028c;

    /* renamed from: ft.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    static final class C0521a extends u implements h00.a<f<Product>> {

        /* renamed from: a  reason: collision with root package name */
        public static final C0521a f27029a = new C0521a();

        C0521a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final f<Product> invoke() {
            return a.f27026a.c().c(Product.class);
        }
    }

    /* loaded from: classes6.dex */
    static final class b extends u implements h00.a<p> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f27030a = new b();

        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final p invoke() {
            return new p.b().a(jr.a.c(Product.class, "type").f(Vehicle.class, "VEHICLE").f(EnergySite.class, "ENERGY_SITE")).b(new ForceToIntAdapter()).a(new lr.b()).d();
        }
    }

    static {
        k a11;
        k a12;
        a11 = m.a(b.f27030a);
        f27027b = a11;
        a12 = m.a(C0521a.f27029a);
        f27028c = a12;
    }

    private a() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final p c() {
        return (p) f27027b.getValue();
    }

    public final f<Product> b() {
        Object value = f27028c.getValue();
        s.f(value, "<get-adapter>(...)");
        return (f) value;
    }
}