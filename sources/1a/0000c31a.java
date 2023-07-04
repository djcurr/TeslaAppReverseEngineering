package yu;

import com.tesla.domain.model.Product;
import com.tesla.domain.model.Vehicle;
import com.tesla.logging.TeslaLog;
import zu.z;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final ct.i f59781a;

    /* loaded from: classes6.dex */
    public interface a {
        void a(Product product);
    }

    /* loaded from: classes6.dex */
    public static final class b implements zu.z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a f59782a;

        b(a aVar) {
            this.f59782a = aVar;
        }

        @Override // zu.z
        public void a(String key, String value) {
            kotlin.jvm.internal.s.g(key, "key");
            kotlin.jvm.internal.s.g(value, "value");
            try {
                Product c11 = ft.a.f27026a.b().c(value);
                if (c11 == null) {
                    return;
                }
                this.f59782a.a(c11);
            } catch (Exception e11) {
                TeslaLog.INSTANCE.e("GetSelectedProduct", "Failed to deserialize", e11);
            }
        }

        @Override // zu.z
        public void b(String str) {
            z.a.a(this, str);
        }
    }

    public d(ct.i realmHelper) {
        kotlin.jvm.internal.s.g(realmHelper, "realmHelper");
        this.f59781a = realmHelper;
    }

    public final Vehicle a() {
        try {
            String g11 = this.f59781a.g("LAST_SELECTED_VEHICLE");
            if (g11 == null) {
                return null;
            }
            return (Vehicle) ft.a.f27026a.b().c(g11);
        } catch (Exception e11) {
            TeslaLog.INSTANCE.e("GetSelectedProduct", "Failed to deserialize", e11);
            return null;
        }
    }

    public final String b(a listener) {
        kotlin.jvm.internal.s.g(listener, "listener");
        String p11 = this.f59781a.p("SELECTED_PRODUCT", new b(listener));
        kotlin.jvm.internal.s.f(p11, "listener: Listener): Str…\n        }\n      }\n    })");
        return p11;
    }
}