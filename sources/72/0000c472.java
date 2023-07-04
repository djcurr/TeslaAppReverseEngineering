package z5;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import androidx.core.view.a0;
import coil.request.NullRequestDataException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: c  reason: collision with root package name */
    public static final Bitmap.Config[] f60313c;

    /* renamed from: a  reason: collision with root package name */
    private final g f60314a = g.f60226a.a();

    /* renamed from: b  reason: collision with root package name */
    private final g6.k f60315b;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
        f60313c = Build.VERSION.SDK_INT >= 26 ? new Bitmap.Config[]{Bitmap.Config.ARGB_8888, Bitmap.Config.RGBA_F16} : new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
    }

    public r(g6.k kVar) {
        this.f60315b = kVar;
    }

    private final boolean c(b6.g gVar, c6.g gVar2) {
        return b(gVar, gVar.i()) && this.f60314a.a(gVar2, this.f60315b);
    }

    private final boolean d(b6.g gVar) {
        boolean D;
        if (!gVar.H().isEmpty()) {
            D = wz.p.D(f60313c, gVar.i());
            if (!D) {
                return false;
            }
        }
        return true;
    }

    public final b6.e a(b6.g request, Throwable throwable) {
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(throwable, "throwable");
        return new b6.e(throwable instanceof NullRequestDataException ? request.s() : request.r(), request, throwable);
    }

    public final boolean b(b6.g request, Bitmap.Config requestedConfig) {
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(requestedConfig, "requestedConfig");
        if (g6.a.d(requestedConfig)) {
            if (request.g()) {
                d6.b G = request.G();
                if (G instanceof d6.c) {
                    View view = ((d6.c) G).getView();
                    if (a0.Y(view) && !view.isHardwareAccelerated()) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final v5.j e(b6.g request, c6.g size, boolean z11) {
        kotlin.jvm.internal.s.g(request, "request");
        kotlin.jvm.internal.s.g(size, "size");
        Bitmap.Config i11 = d(request) && c(request, size) ? request.i() : Bitmap.Config.ARGB_8888;
        return new v5.j(request.k(), i11, request.j(), request.E(), g6.h.b(request), request.h() && request.H().isEmpty() && i11 != Bitmap.Config.ALPHA_8, request.u(), request.A(), request.y(), request.p(), z11 ? request.z() : coil.request.a.DISABLED);
    }
}