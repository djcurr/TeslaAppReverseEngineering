package av;

import android.content.Context;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.s;
import v20.o;
import vz.q;
import yu.g;
import yu.p;

/* loaded from: classes6.dex */
public final class b {

    /* loaded from: classes6.dex */
    public static final class a implements p {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o<String> f6976a;

        /* JADX WARN: Multi-variable type inference failed */
        a(o<? super String> oVar) {
            this.f6976a = oVar;
        }

        @Override // yu.p
        public void a() {
            if (this.f6976a.a()) {
                o<String> oVar = this.f6976a;
                q.a aVar = q.f54772b;
                oVar.resumeWith(q.b(null));
            }
        }

        @Override // yu.p
        public void b(Map<String, String> addressMapping) {
            s.g(addressMapping, "addressMapping");
            if (this.f6976a.a()) {
                o<String> oVar = this.f6976a;
                String str = addressMapping.get("name");
                if (str == null) {
                    str = addressMapping.get("city");
                }
                q.a aVar = q.f54772b;
                oVar.resumeWith(q.b(str));
            }
        }
    }

    public static final Object a(Context context, vz.p<Double, Double> pVar, zz.d<? super String> dVar) {
        zz.d c11;
        Object d11;
        c11 = a00.c.c(dVar);
        v20.p pVar2 = new v20.p(c11, 1);
        pVar2.y();
        double doubleValue = pVar.a().doubleValue();
        double doubleValue2 = pVar.b().doubleValue();
        g.a aVar = yu.g.f59787c;
        Context applicationContext = context.getApplicationContext();
        s.f(applicationContext, "context.applicationContext");
        aVar.a(applicationContext).c(doubleValue, doubleValue2, Locale.getDefault().toString(), new a(pVar2));
        Object s11 = pVar2.s();
        d11 = a00.d.d();
        if (s11 == d11) {
            kotlin.coroutines.jvm.internal.h.c(dVar);
        }
        return s11;
    }
}