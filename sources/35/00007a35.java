package it;

import android.content.Context;
import com.tesla.data.oapi.h;
import com.tesla.features.FeaturesConfig;
import it.d;
import kotlin.jvm.internal.s;
import yu.y;
import zu.c0;

/* loaded from: classes6.dex */
public interface e {

    /* renamed from: a  reason: collision with root package name */
    public static final a f32754a = a.f32755a;

    /* loaded from: classes6.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f32755a = new a();

        private a() {
        }

        public final e a(Context context) {
            s.g(context, "context");
            Context applicationContext = context.getApplicationContext();
            h.a aVar = com.tesla.data.oapi.h.f21733b;
            s.f(applicationContext, "applicationContext");
            com.tesla.data.oapi.h a11 = aVar.a(applicationContext);
            y a12 = y.f59842h.a(applicationContext);
            ct.i realmHelper = ct.i.i();
            d.a aVar2 = d.f32752a;
            s.f(realmHelper, "realmHelper");
            return new m(a11, realmHelper, a12, aVar2.a(realmHelper), new yu.c(realmHelper));
        }
    }

    /* loaded from: classes6.dex */
    public static final class b {
        public static /* synthetic */ hy.m a(e eVar, boolean z11, int i11, Object obj) {
            if (obj == null) {
                if ((i11 & 1) != 0) {
                    z11 = false;
                }
                return eVar.a(z11);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
        }
    }

    hy.m<c0<FeaturesConfig>> a(boolean z11);
}