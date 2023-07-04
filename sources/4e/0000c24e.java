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

@Deprecated
/* loaded from: classes.dex */
public abstract class l<T extends View, Z> extends ya.a<Z> {

    /* renamed from: f  reason: collision with root package name */
    private static int f59418f = com.bumptech.glide.i.f10485a;

    /* renamed from: a  reason: collision with root package name */
    protected final T f59419a;

    /* renamed from: b  reason: collision with root package name */
    private final a f59420b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnAttachStateChangeListener f59421c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f59422d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f59423e;

    /* loaded from: classes.dex */
    static final class a {

        /* renamed from: e  reason: collision with root package name */
        static Integer f59424e;

        /* renamed from: a  reason: collision with root package name */
        private final View f59425a;

        /* renamed from: b  reason: collision with root package name */
        private final List<j> f59426b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        boolean f59427c;

        /* renamed from: d  reason: collision with root package name */
        private ViewTreeObserver$OnPreDrawListenerC1355a f59428d;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ya.l$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class ViewTreeObserver$OnPreDrawListenerC1355a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: a  reason: collision with root package name */
            private final WeakReference<a> f59429a;

            ViewTreeObserver$OnPreDrawListenerC1355a(a aVar) {
                this.f59429a = new WeakReference<>(aVar);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                a aVar = this.f59429a.get();
                if (aVar != null) {
                    aVar.a();
                    return true;
                }
                return true;
            }
        }

        a(View view) {
            this.f59425a = view;
        }

        private static int c(Context context) {
            if (f59424e == null) {
                Display defaultDisplay = ((WindowManager) bb.j.d((WindowManager) context.getSystemService("window"))).getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                f59424e = Integer.valueOf(Math.max(point.x, point.y));
            }
            return f59424e.intValue();
        }

        private int e(int i11, int i12, int i13) {
            int i14 = i12 - i13;
            if (i14 > 0) {
                return i14;
            }
            if (this.f59427c && this.f59425a.isLayoutRequested()) {
                return 0;
            }
            int i15 = i11 - i13;
            if (i15 > 0) {
                return i15;
            }
            if (this.f59425a.isLayoutRequested() || i12 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            return c(this.f59425a.getContext());
        }

        private int f() {
            int paddingTop = this.f59425a.getPaddingTop() + this.f59425a.getPaddingBottom();
            ViewGroup.LayoutParams layoutParams = this.f59425a.getLayoutParams();
            return e(this.f59425a.getHeight(), layoutParams != null ? layoutParams.height : 0, paddingTop);
        }

        private int g() {
            int paddingLeft = this.f59425a.getPaddingLeft() + this.f59425a.getPaddingRight();
            ViewGroup.LayoutParams layoutParams = this.f59425a.getLayoutParams();
            return e(this.f59425a.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingLeft);
        }

        private boolean h(int i11) {
            return i11 > 0 || i11 == Integer.MIN_VALUE;
        }

        private boolean i(int i11, int i12) {
            return h(i11) && h(i12);
        }

        private void j(int i11, int i12) {
            Iterator it2 = new ArrayList(this.f59426b).iterator();
            while (it2.hasNext()) {
                ((j) it2.next()).e(i11, i12);
            }
        }

        void a() {
            if (this.f59426b.isEmpty()) {
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
            ViewTreeObserver viewTreeObserver = this.f59425a.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this.f59428d);
            }
            this.f59428d = null;
            this.f59426b.clear();
        }

        void d(j jVar) {
            int g11 = g();
            int f11 = f();
            if (i(g11, f11)) {
                jVar.e(g11, f11);
                return;
            }
            if (!this.f59426b.contains(jVar)) {
                this.f59426b.add(jVar);
            }
            if (this.f59428d == null) {
                ViewTreeObserver viewTreeObserver = this.f59425a.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC1355a viewTreeObserver$OnPreDrawListenerC1355a = new ViewTreeObserver$OnPreDrawListenerC1355a(this);
                this.f59428d = viewTreeObserver$OnPreDrawListenerC1355a;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC1355a);
            }
        }

        void k(j jVar) {
            this.f59426b.remove(jVar);
        }
    }

    public l(T t11) {
        this.f59419a = (T) bb.j.d(t11);
        this.f59420b = new a(t11);
    }

    private Object a() {
        return this.f59419a.getTag(f59418f);
    }

    private void c() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f59421c;
        if (onAttachStateChangeListener == null || this.f59423e) {
            return;
        }
        this.f59419a.addOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f59423e = true;
    }

    private void d() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.f59421c;
        if (onAttachStateChangeListener == null || !this.f59423e) {
            return;
        }
        this.f59419a.removeOnAttachStateChangeListener(onAttachStateChangeListener);
        this.f59423e = false;
    }

    private void e(Object obj) {
        this.f59419a.setTag(f59418f, obj);
    }

    public T b() {
        return this.f59419a;
    }

    @Override // ya.a, ya.k
    public com.bumptech.glide.request.d getRequest() {
        Object a11 = a();
        if (a11 != null) {
            if (a11 instanceof com.bumptech.glide.request.d) {
                return (com.bumptech.glide.request.d) a11;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // ya.k
    public void getSize(j jVar) {
        this.f59420b.d(jVar);
    }

    @Override // ya.a, ya.k
    public void onLoadCleared(Drawable drawable) {
        super.onLoadCleared(drawable);
        this.f59420b.b();
        if (this.f59422d) {
            return;
        }
        d();
    }

    @Override // ya.a, ya.k
    public void onLoadStarted(Drawable drawable) {
        super.onLoadStarted(drawable);
        c();
    }

    @Override // ya.k
    public void removeCallback(j jVar) {
        this.f59420b.k(jVar);
    }

    @Override // ya.a, ya.k
    public void setRequest(com.bumptech.glide.request.d dVar) {
        e(dVar);
    }

    public String toString() {
        return "Target for: " + this.f59419a;
    }
}