package hv;

import android.content.Context;
import bu.j;
import bu.o;
import com.tesla.logging.g;
import hv.c;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class d implements c.b {

    /* renamed from: b  reason: collision with root package name */
    public static final a f29433b = new a(null);

    /* renamed from: c  reason: collision with root package name */
    private static final g f29434c = g.f21878b.a("AuthEngine");

    /* renamed from: a  reason: collision with root package name */
    private final hv.a f29435a;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return d.f29434c;
        }
    }

    public d() {
        new c();
        this.f29435a = new hv.a(false, null, null, 7, null);
    }

    @Override // hv.c.b
    public void a(e motion) {
        s.g(motion, "motion");
        if (motion.c()) {
            this.f29435a.a(motion);
        } else {
            this.f29435a.b(motion);
        }
    }

    public final o c(Context context, String vin, j level, String[] authReasons) {
        s.g(context, "context");
        s.g(vin, "vin");
        s.g(level, "level");
        s.g(authReasons, "authReasons");
        return this.f29435a.c(vin).shouldAuthorize(level);
    }

    public final void d(Context context) {
        s.g(context, "context");
    }
}