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
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f23241a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static final w0<androidx.activity.f> f23242b = r.c(null, a.f23243a, 1, null);

    /* loaded from: classes.dex */
    static final class a extends u implements h00.a<androidx.activity.f> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f23243a = new a();

        a() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final androidx.activity.f invoke() {
            return null;
        }
    }

    private f() {
    }

    public final androidx.activity.f a(i iVar, int i11) {
        iVar.x(1680121376);
        androidx.activity.f fVar = (androidx.activity.f) iVar.A(f23242b);
        if (fVar == null) {
            Context context = (Context) iVar.A(z.g());
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    context = null;
                    break;
                } else if (context instanceof androidx.activity.f) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                    s.f(context, "innerContext.baseContext");
                }
            }
            fVar = (androidx.activity.f) context;
        }
        iVar.N();
        return fVar;
    }
}