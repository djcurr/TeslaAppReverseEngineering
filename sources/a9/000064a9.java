package d;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.ui.platform.z;
import c1.i;
import c1.r;
import c1.w0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static final e f23238a = new e();

    /* renamed from: b  reason: collision with root package name */
    private static final w0<androidx.activity.result.e> f23239b = r.c(null, a.f23240a, 1, null);

    /* loaded from: classes.dex */
    static final class a extends u implements h00.a<androidx.activity.result.e> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23240a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final androidx.activity.result.e invoke() {
            return null;
        }
    }

    private e() {
    }

    public final androidx.activity.result.e a(i iVar, int i11) {
        iVar.x(1972133187);
        androidx.activity.result.e eVar = (androidx.activity.result.e) iVar.A(f23239b);
        if (eVar == null) {
            Context context = (Context) iVar.A(z.g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof androidx.activity.result.e) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    s.f(context, "innerContext.baseContext");
                }
            }
            eVar = (androidx.activity.result.e) context;
        }
        iVar.N();
        return eVar;
    }
}