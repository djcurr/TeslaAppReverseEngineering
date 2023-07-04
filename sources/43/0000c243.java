package ya;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d<T extends View, Z> implements k<Z> {

    /* renamed from: f  reason: collision with root package name */
    private static final int f59403f = com.bumptech.glide.i.f10485a;

    /* renamed from: a  reason: collision with root package name */
    private final a f59404a;

    /* renamed from: b  reason: collision with root package name */
    protected final T f59405b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnAttachStateChangeListener f59406c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f59407d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f59408e;

    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: e  reason: collision with root package name */
        static Integer f59409e;

        /* renamed from: a  reason: collision with root package name */
        private final View f59410a;

        /* renamed from: b  reason: collision with root package name */
        private final List<j> f59411b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        boolean f59412c;

        /* renamed from: d  reason: collision with root package name */
        private ViewTreeObserver$OnPreDrawListenerC1354a f59413d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ya.d$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC1354a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f59414a;

            ViewTreeObserver$OnPreDrawListenerC1354a(a aVar) {
                this.f59414a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("CustomViewTarget", 2)) {
                    Log.v("CustomViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f59414a.get();
                if (aVar != null) {
                    aVar.a();
                    return true;
                }
                return true;
            }
        }

        a(View view) {
            this.f59410a = view;
        }

        private static int c(Context context) {
            if (f59409e == null) {
                Display defaultDisplay = ((WindowManager) bb.j.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f59409e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f59409e.intValue();
        }

        private int e(int i11, int i12, int i13) {
            int i14 = i12 - i13;
            if (i14 > 0) {
                return i14;
            }
            if (this.f59412c && this.f59410a.isLayoutRequested()) {
                return 0;
            }
            int i15 = i11 - i13;
            if (i15 > 0) {
                return i15;
            }
            if (this.f59410a.isLayoutRequested() || i12 != -2) {
                return 0;
            }
            if (Log.isLoggable("CustomViewTarget", 4)) {
                Log.i("CustomViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use .override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f59410a.getContext());
        }

        private int f() {
            int paddingTop = this.f59410a.getPaddingTop() + this.f59410a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f59410a.getLayoutParams();
            return e(this.f59410a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f59410a.getPaddingLeft() + this.f59410a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f59410a.getLayoutParams();
            return e(this.f59410a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i11) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }

        private boolean i(int i11, int i12) {
            return h(i11) && h(i12);
        }

        private void j(int i11, int i12) {
            Iterator it2 = new ArrayList(this.f59411b).iterator();
            while (it2.hasNext()) {
                ((j) it2.next()).e(i11, i12);
            }
        }

        void a() {
            if (this.f59411b.isEmpty()) {
                return;
            }
            int g11 = g();
            int f11 = f();
            if (i(g11, f11)) {
                j(g11, f11);
                b();
            }
        }

        void b() {
            ViewTreeObserver viewTreeObserver = this.f59410a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f59413d);
            }
            this.f59413d = null;
            this.f59411b.clear();
        }

        void d(j jVar) {
            int g11 = g();
            int f11 = f();
            if (i(g11, f11)) {
                jVar.e(g11, f11);
                return;
            }
            if (!this.f59411b.contains(jVar)) {
                this.f59411b.add(jVar);
            }
            if (this.f59413d == null) {
                ViewTreeObserver viewTreeObserver = this.f59410a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC1354a viewTreeObserver$OnPreDrawListenerC1354a = new ViewTreeObserver$OnPreDrawListenerC1354a(this);
                this.f59413d = viewTreeObserver$OnPreDrawListenerC1354a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC1354a);
            }
        }

        void k(j jVar) {
            this.f59411b.remove(jVar);
        }
    }

    public d(T t11) {
        this.f59405b = (T) bb.j.d(t11);
        this.f59404a = new a(t11);
    }

    private Object a() {
        return this.f59405b.getTag(f59403f);
    }

    private void b() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f59406c;
        if (onAttachStateChangeListener == null || this.f59408e) {
            return;
        }
        this.f59405b.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f59408e = true;
    }

    private void c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f59406c;
        if (onAttachStateChangeListener == null || !this.f59408e) {
            return;
        }
        this.f59405b.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f59408e = false;
    }

    private void f(Object obj) {
        this.f59405b.setTag(f59403f, obj);
    }

    protected abstract void d(Drawable drawable);

    protected void e(Drawable drawable) {
    }

    @Override // ya.k
    public final com.bumptech.glide.request.d getRequest() {
        Object a11 = a();
        if (a11 != null) {
            if (a11 instanceof com.bumptech.glide.request.d) {
                return (com.bumptech.glide.request.d) a11;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // ya.k
    public final void getSize(j jVar) {
        this.f59404a.d(jVar);
    }

    @Override // va.m
    public void onDestroy() {
    }

    @Override // ya.k
    public final void onLoadCleared(Drawable drawable) {
        this.f59404a.b();
        d(drawable);
        if (this.f59407d) {
            return;
        }
        c();
    }

    @Override // ya.k
    public final void onLoadStarted(Drawable drawable) {
        b();
        e(drawable);
    }

    @Override // va.m
    public void onStart() {
    }

    @Override // va.m
    public void onStop() {
    }

    @Override // ya.k
    public final void removeCallback(j jVar) {
        this.f59404a.k(jVar);
    }

    @Override // ya.k
    public final void setRequest(com.bumptech.glide.request.d dVar) {
        f(dVar);
    }

    public String toString() {
        return "Target for: " + this.f59405b;
    }
}