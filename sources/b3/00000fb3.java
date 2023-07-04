package c6;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import v20.o;
import v20.p;
import vz.b0;
import vz.q;

/* loaded from: classes.dex */
public interface i<T extends View> extends h {

    /* renamed from: a */
    public static final a f8895a = a.f8896a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f8896a = new a();

        private a() {
        }

        public static /* synthetic */ i b(a aVar, View view, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = true;
            }
            return aVar.a(view, z11);
        }

        public final <T extends View> i<T> a(T view, boolean z11) {
            s.g(view, "view");
            return new e(view, z11);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* loaded from: classes.dex */
        public static final class a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver f8897a;

            /* renamed from: b */
            final /* synthetic */ o f8898b;

            /* renamed from: c */
            final /* synthetic */ i f8899c;

            a(ViewTreeObserver viewTreeObserver, o oVar, i iVar) {
                this.f8897a = viewTreeObserver;
                this.f8898b = oVar;
                this.f8899c = iVar;
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                c e11 = b.e(this.f8899c, false);
                if (e11 != null) {
                    i iVar = this.f8899c;
                    ViewTreeObserver viewTreeObserver = this.f8897a;
                    s.f(viewTreeObserver, "viewTreeObserver");
                    b.g(iVar, viewTreeObserver, this);
                    o oVar = this.f8898b;
                    q.a aVar = q.f54772b;
                    oVar.resumeWith(q.b(e11));
                    return true;
                }
                return true;
            }
        }

        /* renamed from: c6.i$b$b */
        /* loaded from: classes.dex */
        public static final class C0174b extends u implements l<Throwable, b0> {

            /* renamed from: a */
            final /* synthetic */ ViewTreeObserver f8900a;

            /* renamed from: b */
            final /* synthetic */ a f8901b;

            /* renamed from: c */
            final /* synthetic */ i f8902c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0174b(ViewTreeObserver viewTreeObserver, a aVar, i iVar) {
                super(1);
                this.f8900a = viewTreeObserver;
                this.f8901b = aVar;
                this.f8902c = iVar;
            }

            public final void a(Throwable th2) {
                i iVar = this.f8902c;
                ViewTreeObserver viewTreeObserver = this.f8900a;
                s.f(viewTreeObserver, "viewTreeObserver");
                b.g(iVar, viewTreeObserver, this.f8901b);
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(Throwable th2) {
                a(th2);
                return b0.f54756a;
            }
        }

        private static <T extends View> int c(i<T> iVar, int i11, int i12, int i13, boolean z11, boolean z12) {
            int i14 = i11 - i13;
            if (i14 > 0) {
                return i14;
            }
            int i15 = i12 - i13;
            if (i15 > 0) {
                return i15;
            }
            if (z11 || i11 != -2) {
                return -1;
            }
            Context context = iVar.getView().getContext();
            s.f(context, "view.context");
            Resources resources = context.getResources();
            s.f(resources, "view.context.resources");
            DisplayMetrics displayMetrics = resources.getDisplayMetrics();
            return z12 ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        }

        private static <T extends View> int d(i<T> iVar, boolean z11) {
            ViewGroup.LayoutParams layoutParams = iVar.getView().getLayoutParams();
            return c(iVar, layoutParams != null ? layoutParams.height : -1, iVar.getView().getHeight(), iVar.b() ? iVar.getView().getPaddingTop() + iVar.getView().getPaddingBottom() : 0, z11, false);
        }

        public static <T extends View> c e(i<T> iVar, boolean z11) {
            int d11;
            int f11 = f(iVar, z11);
            if (f11 > 0 && (d11 = d(iVar, z11)) > 0) {
                return new c(f11, d11);
            }
            return null;
        }

        private static <T extends View> int f(i<T> iVar, boolean z11) {
            ViewGroup.LayoutParams layoutParams = iVar.getView().getLayoutParams();
            return c(iVar, layoutParams != null ? layoutParams.width : -1, iVar.getView().getWidth(), iVar.b() ? iVar.getView().getPaddingLeft() + iVar.getView().getPaddingRight() : 0, z11, true);
        }

        public static <T extends View> void g(i<T> iVar, ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            } else {
                iVar.getView().getViewTreeObserver().removeOnPreDrawListener(onPreDrawListener);
            }
        }

        public static <T extends View> Object h(i<T> iVar, zz.d<? super g> dVar) {
            zz.d c11;
            Object d11;
            c e11 = e(iVar, iVar.getView().isLayoutRequested());
            if (e11 != null) {
                return e11;
            }
            c11 = a00.c.c(dVar);
            p pVar = new p(c11, 1);
            pVar.y();
            ViewTreeObserver viewTreeObserver = iVar.getView().getViewTreeObserver();
            a aVar = new a(viewTreeObserver, pVar, iVar);
            viewTreeObserver.addOnPreDrawListener(aVar);
            pVar.T(new C0174b(viewTreeObserver, aVar, iVar));
            Object s11 = pVar.s();
            d11 = a00.d.d();
            if (s11 == d11) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return s11;
        }
    }

    boolean b();

    T getView();
}