package jz;

import android.app.Activity;
import android.content.res.Resources;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.c0;
import io.sentry.d0;
import io.sentry.f3;
import io.sentry.j0;
import io.sentry.t;
import io.sentry.u1;
import io.sentry.v1;
import io.sentry.x3;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.VisibleForTesting;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class g implements GestureDetector.OnGestureListener {

    /* renamed from: a */
    private final WeakReference<Activity> f34025a;

    /* renamed from: b */
    private final c0 f34026b;

    /* renamed from: c */
    private final SentryAndroidOptions f34027c;

    /* renamed from: d */
    private final boolean f34028d;

    /* renamed from: e */
    private WeakReference<View> f34029e = null;

    /* renamed from: f */
    private j0 f34030f = null;

    /* renamed from: g */
    private String f34031g = null;

    /* renamed from: h */
    private final b f34032h = new b(null);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public class a implements i {
        a() {
            g.this = r1;
        }

        @Override // jz.i
        public boolean a(View view) {
            return j.e(view, g.this.f34028d);
        }

        @Override // jz.i
        public boolean b() {
            return true;
        }
    }

    public g(Activity activity, c0 c0Var, SentryAndroidOptions sentryAndroidOptions, boolean z11) {
        this.f34025a = new WeakReference<>(activity);
        this.f34026b = c0Var;
        this.f34027c = sentryAndroidOptions;
        this.f34028d = z11;
    }

    public static /* synthetic */ void a(g gVar, j0 j0Var, u1 u1Var) {
        gVar.o(j0Var, u1Var);
    }

    public static /* synthetic */ void b(g gVar, u1 u1Var, j0 j0Var, j0 j0Var2) {
        gVar.l(u1Var, j0Var, j0Var2);
    }

    public static /* synthetic */ void c(g gVar, u1 u1Var) {
        gVar.p(u1Var);
    }

    public static /* synthetic */ void d(g gVar, u1 u1Var, j0 j0Var) {
        gVar.m(u1Var, j0Var);
    }

    public static /* synthetic */ boolean e(View view) {
        return j.f(view);
    }

    private void g(View view, String str, Map<String, Object> map, MotionEvent motionEvent) {
        String canonicalName = view.getClass().getCanonicalName();
        if (canonicalName == null) {
            canonicalName = view.getClass().getSimpleName();
        }
        t tVar = new t();
        tVar.e("android:motionEvent", motionEvent);
        tVar.e("android:view", view);
        this.f34026b.h(io.sentry.c.r(str, j.c(view), canonicalName, map), tVar);
    }

    private View j(String str) {
        Activity activity = this.f34025a.get();
        if (activity == null) {
            d0 logger = this.f34027c.getLogger();
            f3 f3Var = f3.DEBUG;
            logger.c(f3Var, "Activity is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            d0 logger2 = this.f34027c.getLogger();
            f3 f3Var2 = f3.DEBUG;
            logger2.c(f3Var2, "Window is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        View decorView = window.getDecorView();
        if (decorView == null) {
            d0 logger3 = this.f34027c.getLogger();
            f3 f3Var3 = f3.DEBUG;
            logger3.c(f3Var3, "DecorView is null in " + str + ". No breadcrumb captured.", new Object[0]);
            return null;
        }
        return decorView;
    }

    private String k(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    public /* synthetic */ void l(u1 u1Var, j0 j0Var, j0 j0Var2) {
        if (j0Var2 == null) {
            u1Var.x(j0Var);
        } else {
            this.f34027c.getLogger().c(f3.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", j0Var.getName());
        }
    }

    public /* synthetic */ void m(u1 u1Var, j0 j0Var) {
        if (j0Var == this.f34030f) {
            u1Var.d();
        }
    }

    private void r(View view, String str) {
        Activity activity;
        if (this.f34027c.isTracingEnabled() && this.f34027c.isEnableUserInteractionTracing()) {
            if (this.f34025a.get() == null) {
                this.f34027c.getLogger().c(f3.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
                return;
            }
            try {
                String b11 = j.b(view);
                WeakReference<View> weakReference = this.f34029e;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (this.f34030f != null) {
                    if (view.equals(view2) && str.equals(this.f34031g) && !this.f34030f.a()) {
                        this.f34027c.getLogger().c(f3.DEBUG, "The view with id: " + b11 + " already has an ongoing transaction assigned. Rescheduling finish", new Object[0]);
                        if (this.f34027c.getIdleTimeout() != null) {
                            this.f34030f.g();
                            return;
                        }
                        return;
                    }
                    s(x3.OK);
                }
                final j0 m11 = this.f34026b.m(k(activity) + "." + b11, "ui.action." + str, true, this.f34027c.getIdleTimeout(), true);
                this.f34026b.i(new v1() { // from class: jz.e
                    @Override // io.sentry.v1
                    public final void a(u1 u1Var) {
                        g.a(g.this, m11, u1Var);
                    }
                });
                this.f34030f = m11;
                this.f34029e = new WeakReference<>(view);
                this.f34031g = str;
            } catch (Resources.NotFoundException unused) {
                this.f34027c.getLogger().c(f3.DEBUG, "View id cannot be retrieved from Resources, no transaction captured.", new Object[0]);
            }
        }
    }

    @VisibleForTesting
    /* renamed from: h */
    public void o(final u1 u1Var, final j0 j0Var) {
        u1Var.B(new u1.b() { // from class: jz.c
            @Override // io.sentry.u1.b
            public final void a(j0 j0Var2) {
                g.b(g.this, u1Var, j0Var, j0Var2);
            }
        });
    }

    @VisibleForTesting
    /* renamed from: i */
    public void p(final u1 u1Var) {
        u1Var.B(new u1.b() { // from class: jz.b
            @Override // io.sentry.u1.b
            public final void a(j0 j0Var) {
                g.d(g.this, u1Var, j0Var);
            }
        });
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        this.f34032h.j();
        this.f34032h.f34036c = motionEvent.getX();
        this.f34032h.f34037d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        this.f34032h.f34034a = "swipe";
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f11, float f12) {
        View j11 = j("onScroll");
        if (j11 != null && motionEvent != null && this.f34032h.f34034a == null) {
            View a11 = j.a(j11, motionEvent.getX(), motionEvent.getY(), new a());
            if (a11 != null) {
                this.f34032h.k(a11);
                this.f34032h.f34034a = "scroll";
            } else {
                this.f34027c.getLogger().c(f3.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                return false;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        View j11 = j("onSingleTapUp");
        if (j11 != null && motionEvent != null) {
            View a11 = j.a(j11, motionEvent.getX(), motionEvent.getY(), new i() { // from class: jz.f
                @Override // jz.i
                public final boolean a(View view) {
                    return g.e(view);
                }
            });
            if (a11 == null) {
                this.f34027c.getLogger().c(f3.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            g(a11, "click", Collections.emptyMap(), motionEvent);
            r(a11, "click");
        }
        return false;
    }

    public void q(MotionEvent motionEvent) {
        View j11 = j("onUp");
        View view = (View) this.f34032h.f34035b.get();
        if (j11 == null || view == null) {
            return;
        }
        if (this.f34032h.f34034a != null) {
            g(view, this.f34032h.f34034a, Collections.singletonMap("direction", this.f34032h.i(motionEvent)), motionEvent);
            r(view, this.f34032h.f34034a);
            this.f34032h.j();
            return;
        }
        this.f34027c.getLogger().c(f3.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
    }

    public void s(x3 x3Var) {
        j0 j0Var = this.f34030f;
        if (j0Var != null) {
            j0Var.e(x3Var);
        }
        this.f34026b.i(new v1() { // from class: jz.d
            @Override // io.sentry.v1
            public final void a(u1 u1Var) {
                g.c(g.this, u1Var);
            }
        });
        this.f34030f = null;
        WeakReference<View> weakReference = this.f34029e;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f34031g = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a */
        private String f34034a;

        /* renamed from: b */
        private WeakReference<View> f34035b;

        /* renamed from: c */
        private float f34036c;

        /* renamed from: d */
        private float f34037d;

        private b() {
            this.f34034a = null;
            this.f34035b = new WeakReference<>(null);
            this.f34036c = BitmapDescriptorFactory.HUE_RED;
            this.f34037d = BitmapDescriptorFactory.HUE_RED;
        }

        public String i(MotionEvent motionEvent) {
            float x11 = motionEvent.getX() - this.f34036c;
            float y11 = motionEvent.getY() - this.f34037d;
            return Math.abs(x11) > Math.abs(y11) ? x11 > BitmapDescriptorFactory.HUE_RED ? "right" : "left" : y11 > BitmapDescriptorFactory.HUE_RED ? "down" : "up";
        }

        public void j() {
            this.f34035b.clear();
            this.f34034a = null;
            this.f34036c = BitmapDescriptorFactory.HUE_RED;
            this.f34037d = BitmapDescriptorFactory.HUE_RED;
        }

        public void k(View view) {
            this.f34035b = new WeakReference<>(view);
        }

        /* synthetic */ b(a aVar) {
            this();
        }
    }
}