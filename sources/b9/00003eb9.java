package com.ijzerenhein.sharedelement;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class f {

    /* renamed from: a */
    private final Context f17759a;

    /* renamed from: b */
    private final int f17760b;

    /* renamed from: c */
    private View f17761c;

    /* renamed from: d */
    private View f17762d;

    /* renamed from: e */
    private final boolean f17763e;

    /* renamed from: f */
    private ReadableMap f17764f;

    /* renamed from: g */
    private final j f17765g;

    /* renamed from: i */
    private int f17767i = 1;

    /* renamed from: j */
    private int f17768j = 0;

    /* renamed from: k */
    private float f17769k = 1.0f;

    /* renamed from: l */
    private j f17770l = null;

    /* renamed from: m */
    private ArrayList<Callback> f17771m = null;

    /* renamed from: n */
    private c f17772n = null;

    /* renamed from: o */
    private ArrayList<Callback> f17773o = null;

    /* renamed from: h */
    private View f17766h = null;

    /* renamed from: p */
    private ge.c<nf.h> f17774p = null;

    /* renamed from: q */
    private Handler f17775q = null;

    /* loaded from: classes2.dex */
    public class a extends p {
        a() {
            f.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (f.this.f17775q == null) {
                return;
            }
            this.f17840a++;
            boolean i11 = f.this.i();
            boolean j11 = f.this.j();
            if (!i11 || !j11) {
                f.this.f17775q.postDelayed(this, 8L);
            } else {
                f.this.f17775q = null;
            }
        }
    }

    /* loaded from: classes2.dex */
    public class b extends ge.c<nf.h> {

        /* renamed from: b */
        final /* synthetic */ View f17777b;

        b(View view) {
            f.this = r1;
            this.f17777b = view;
        }

        @Override // ge.c, ge.d
        /* renamed from: c */
        public void l(String str, nf.h hVar, Animatable animatable) {
            f.this.p(this.f17777b);
            f.this.i();
        }

        @Override // ge.c, ge.d
        public void e(String str, Throwable th2) {
            Log.d("RNSharedElementNode", "mDraweeControllerListener.onFailure: " + str + ", throwable: " + th2);
        }

        @Override // ge.c, ge.d
        public void p(String str, Object obj) {
        }
    }

    public f(Context context, int i11, View view, boolean z11, View view2, ReadableMap readableMap) {
        this.f17760b = i11;
        this.f17761c = view;
        this.f17762d = view2;
        this.f17763e = z11;
        this.f17764f = readableMap;
        this.f17765g = new j(readableMap, context);
        this.f17759a = context;
    }

    private void f(View view) {
        if (this.f17774p == null && (view instanceof com.facebook.drawee.view.d)) {
            me.a controller = ((com.facebook.drawee.view.d) view).getController();
            if (controller instanceof be.d) {
                b bVar = new b(view);
                this.f17774p = bVar;
                ((be.d) controller).k(bVar);
            }
        }
    }

    public boolean i() {
        View m11 = m();
        if (m11 == null) {
            return false;
        }
        if (this.f17773o == null) {
            return true;
        }
        int width = m11.getWidth();
        int height = m11.getHeight();
        if (width == 0 && height == 0) {
            return false;
        }
        RectF a11 = c.a(m11);
        if (a11 == null) {
            f(m11);
            return false;
        }
        c cVar = new c();
        cVar.f17749a = m11;
        cVar.f17750b = a11;
        this.f17772n = cVar;
        ArrayList<Callback> arrayList = this.f17773o;
        this.f17773o = null;
        Iterator<Callback> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(cVar, this);
        }
        return true;
    }

    public boolean j() {
        View m11 = m();
        if (m11 == null) {
            return false;
        }
        if (this.f17771m == null) {
            return true;
        }
        int left = m11.getLeft();
        int top = m11.getTop();
        int width = m11.getWidth();
        int height = m11.getHeight();
        if (width == 0 && height == 0) {
            return false;
        }
        Matrix c11 = j.c(m11);
        Matrix c12 = j.c(this.f17762d);
        if (c11 == null || c12 == null) {
            return false;
        }
        Rect rect = new Rect(left, top, width + left, height + top);
        j jVar = new j(this.f17764f, this.f17759a);
        j.i(m11, jVar.f17793a);
        jVar.f17794b = rect;
        j.i(this.f17762d, jVar.f17795c);
        jVar.f17796d = c12;
        jVar.f17799g = m11.getAlpha();
        this.f17770l = jVar;
        ArrayList<Callback> arrayList = this.f17771m;
        this.f17771m = null;
        Iterator<Callback> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(jVar, this);
        }
        return true;
    }

    public void p(View view) {
        if (this.f17774p == null) {
            return;
        }
        me.a controller = ((com.facebook.drawee.view.d) view).getController();
        if (controller instanceof be.d) {
            ((be.d) controller).R(this.f17774p);
            this.f17774p = null;
        }
    }

    private static View s(View view, j jVar) {
        if (view == null) {
            return null;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                View childAt = viewGroup.getChildAt(0);
                if (childAt instanceof ImageView) {
                    int left = childAt.getLeft();
                    int top = childAt.getTop();
                    int width = childAt.getWidth();
                    int height = childAt.getHeight();
                    int round = Math.round(jVar.f17804l);
                    int round2 = Math.round(jVar.f17804l);
                    int round3 = Math.round(viewGroup.getWidth() - (jVar.f17804l * 2.0f));
                    int round4 = Math.round(viewGroup.getHeight() - (jVar.f17804l * 2.0f));
                    if (left >= round - 1 && left <= round + 1 && top >= round2 - 1 && top <= round2 + 1 && width >= round3 - 1 && width <= round3 + 1 && height >= round4 - 1 && height <= round4 + 1) {
                        return childAt;
                    }
                }
            }
        }
        return view;
    }

    private void t() {
        if (this.f17775q != null) {
            return;
        }
        Handler handler = new Handler();
        this.f17775q = handler;
        handler.postDelayed(new a(), 4L);
    }

    private void u() {
        if (this.f17775q != null) {
            this.f17775q = null;
        }
    }

    public void g() {
        int i11 = this.f17768j + 1;
        this.f17768j = i11;
        if (i11 == 1) {
            this.f17769k = this.f17761c.getAlpha();
            this.f17761c.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
    }

    public int h() {
        int i11 = this.f17767i + 1;
        this.f17767i = i11;
        return i11;
    }

    public View k() {
        return this.f17762d;
    }

    public int l() {
        return this.f17760b;
    }

    public View m() {
        View view = this.f17766h;
        if (view != null) {
            return view;
        }
        View view2 = this.f17761c;
        if (this.f17763e) {
            int childCount = ((ViewGroup) view2).getChildCount();
            if (childCount == 1) {
                view2 = ((ViewGroup) this.f17761c).getChildAt(0);
            } else if (childCount <= 0) {
                Log.d("RNSharedElementNode", "Child for parent doesn't exist");
                return null;
            }
        }
        View s11 = s(view2, this.f17765g);
        this.f17766h = s11;
        return s11;
    }

    public void n() {
        int i11 = this.f17768j - 1;
        this.f17768j = i11;
        if (i11 == 0) {
            this.f17761c.setAlpha(this.f17769k);
        }
    }

    public int o() {
        int i11 = this.f17767i - 1;
        this.f17767i = i11;
        if (i11 == 0) {
            p(this.f17766h);
            u();
            this.f17761c = null;
            this.f17762d = null;
            this.f17764f = null;
            this.f17766h = null;
            this.f17772n = null;
            this.f17773o = null;
            this.f17770l = null;
            this.f17771m = null;
        }
        return this.f17767i;
    }

    public void q(Callback callback) {
        c cVar = this.f17772n;
        if (cVar != null) {
            callback.invoke(cVar, this);
            return;
        }
        if (this.f17773o == null) {
            this.f17773o = new ArrayList<>();
        }
        this.f17773o.add(callback);
        if (i()) {
            return;
        }
        t();
    }

    public void r(Callback callback) {
        j jVar = this.f17770l;
        if (jVar != null) {
            callback.invoke(jVar, this);
            return;
        }
        if (this.f17771m == null) {
            this.f17771m = new ArrayList<>();
        }
        this.f17771m.add(callback);
        if (j()) {
            return;
        }
        t();
    }
}