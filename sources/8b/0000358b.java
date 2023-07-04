package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.a0;
import b4.c;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import w3.c;
import w3.f;

/* loaded from: classes3.dex */
public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.c<V> {

    /* renamed from: a  reason: collision with root package name */
    b4.c f14892a;

    /* renamed from: b  reason: collision with root package name */
    c f14893b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f14894c;

    /* renamed from: e  reason: collision with root package name */
    private boolean f14896e;

    /* renamed from: d  reason: collision with root package name */
    private float f14895d = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: f  reason: collision with root package name */
    int f14897f = 2;

    /* renamed from: g  reason: collision with root package name */
    float f14898g = 0.5f;

    /* renamed from: h  reason: collision with root package name */
    float f14899h = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: i  reason: collision with root package name */
    float f14900i = 0.5f;

    /* renamed from: j  reason: collision with root package name */
    private final c.AbstractC0147c f14901j = new a();

    /* loaded from: classes3.dex */
    class a extends c.AbstractC0147c {

        /* renamed from: a  reason: collision with root package name */
        private int f14902a;

        /* renamed from: b  reason: collision with root package name */
        private int f14903b = -1;

        a() {
        }

        private boolean n(View view, float f11) {
            int i11 = (f11 > BitmapDescriptorFactory.HUE_RED ? 1 : (f11 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            if (i11 == 0) {
                return Math.abs(view.getLeft() - this.f14902a) >= Math.round(((float) view.getWidth()) * SwipeDismissBehavior.this.f14898g);
            }
            boolean z11 = a0.F(view) == 1;
            int i12 = SwipeDismissBehavior.this.f14897f;
            if (i12 == 2) {
                return true;
            }
            if (i12 == 0) {
                if (z11) {
                    if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                        return false;
                    }
                } else if (i11 <= 0) {
                    return false;
                }
                return true;
            } else if (i12 == 1) {
                if (z11) {
                    if (i11 <= 0) {
                        return false;
                    }
                } else if (f11 >= BitmapDescriptorFactory.HUE_RED) {
                    return false;
                }
                return true;
            } else {
                return false;
            }
        }

        @Override // b4.c.AbstractC0147c
        public int a(View view, int i11, int i12) {
            int width;
            int width2;
            int width3;
            boolean z11 = a0.F(view) == 1;
            int i13 = SwipeDismissBehavior.this.f14897f;
            if (i13 == 0) {
                if (z11) {
                    width = this.f14902a - view.getWidth();
                    width2 = this.f14902a;
                } else {
                    width = this.f14902a;
                    width3 = view.getWidth();
                    width2 = width3 + width;
                }
            } else if (i13 != 1) {
                width = this.f14902a - view.getWidth();
                width2 = view.getWidth() + this.f14902a;
            } else if (z11) {
                width = this.f14902a;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.f14902a - view.getWidth();
                width2 = this.f14902a;
            }
            return SwipeDismissBehavior.G(width, i11, width2);
        }

        @Override // b4.c.AbstractC0147c
        public int b(View view, int i11, int i12) {
            return view.getTop();
        }

        @Override // b4.c.AbstractC0147c
        public int d(View view) {
            return view.getWidth();
        }

        @Override // b4.c.AbstractC0147c
        public void i(View view, int i11) {
            this.f14903b = i11;
            this.f14902a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        @Override // b4.c.AbstractC0147c
        public void j(int i11) {
            c cVar = SwipeDismissBehavior.this.f14893b;
            if (cVar != null) {
                cVar.b(i11);
            }
        }

        @Override // b4.c.AbstractC0147c
        public void k(View view, int i11, int i12, int i13, int i14) {
            float width = this.f14902a + (view.getWidth() * SwipeDismissBehavior.this.f14899h);
            float width2 = this.f14902a + (view.getWidth() * SwipeDismissBehavior.this.f14900i);
            float f11 = i11;
            if (f11 <= width) {
                view.setAlpha(1.0f);
            } else if (f11 >= width2) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            } else {
                view.setAlpha(SwipeDismissBehavior.F(BitmapDescriptorFactory.HUE_RED, 1.0f - SwipeDismissBehavior.I(width, width2, f11), 1.0f));
            }
        }

        @Override // b4.c.AbstractC0147c
        public void l(View view, float f11, float f12) {
            int i11;
            boolean z11;
            c cVar;
            this.f14903b = -1;
            int width = view.getWidth();
            if (n(view, f11)) {
                int left = view.getLeft();
                int i12 = this.f14902a;
                i11 = left < i12 ? i12 - width : i12 + width;
                z11 = true;
            } else {
                i11 = this.f14902a;
                z11 = false;
            }
            if (SwipeDismissBehavior.this.f14892a.O(i11, view.getTop())) {
                a0.o0(view, new d(view, z11));
            } else if (!z11 || (cVar = SwipeDismissBehavior.this.f14893b) == null) {
            } else {
                cVar.a(view);
            }
        }

        @Override // b4.c.AbstractC0147c
        public boolean m(View view, int i11) {
            int i12 = this.f14903b;
            return (i12 == -1 || i12 == i11) && SwipeDismissBehavior.this.E(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements f {
        b() {
        }

        @Override // w3.f
        public boolean a(View view, f.a aVar) {
            boolean z11 = false;
            if (SwipeDismissBehavior.this.E(view)) {
                boolean z12 = a0.F(view) == 1;
                int i11 = SwipeDismissBehavior.this.f14897f;
                if ((i11 == 0 && z12) || (i11 == 1 && !z12)) {
                    z11 = true;
                }
                int width = view.getWidth();
                if (z11) {
                    width = -width;
                }
                a0.g0(view, width);
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
                c cVar = SwipeDismissBehavior.this.f14893b;
                if (cVar != null) {
                    cVar.a(view);
                }
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes3.dex */
    public interface c {
        void a(View view);

        void b(int i11);
    }

    /* loaded from: classes3.dex */
    private class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final View f14906a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f14907b;

        d(View view, boolean z11) {
            this.f14906a = view;
            this.f14907b = z11;
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar;
            b4.c cVar2 = SwipeDismissBehavior.this.f14892a;
            if (cVar2 != null && cVar2.m(true)) {
                a0.o0(this.f14906a, this);
            } else if (!this.f14907b || (cVar = SwipeDismissBehavior.this.f14893b) == null) {
            } else {
                cVar.a(this.f14906a);
            }
        }
    }

    static float F(float f11, float f12, float f13) {
        return Math.min(Math.max(f11, f12), f13);
    }

    static int G(int i11, int i12, int i13) {
        return Math.min(Math.max(i11, i12), i13);
    }

    private void H(ViewGroup viewGroup) {
        b4.c o11;
        if (this.f14892a == null) {
            if (this.f14896e) {
                o11 = b4.c.n(viewGroup, this.f14895d, this.f14901j);
            } else {
                o11 = b4.c.o(viewGroup, this.f14901j);
            }
            this.f14892a = o11;
        }
    }

    static float I(float f11, float f12, float f13) {
        return (f13 - f11) / (f12 - f11);
    }

    private void N(View view) {
        a0.q0(view, PKIFailureInfo.badCertTemplate);
        if (E(view)) {
            a0.s0(view, c.a.f55461o, null, new b());
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean D(CoordinatorLayout coordinatorLayout, V v11, MotionEvent motionEvent) {
        b4.c cVar = this.f14892a;
        if (cVar != null) {
            cVar.F(motionEvent);
            return true;
        }
        return false;
    }

    public boolean E(View view) {
        return true;
    }

    public void J(float f11) {
        this.f14900i = F(BitmapDescriptorFactory.HUE_RED, f11, 1.0f);
    }

    public void K(c cVar) {
        this.f14893b = cVar;
    }

    public void L(float f11) {
        this.f14899h = F(BitmapDescriptorFactory.HUE_RED, f11, 1.0f);
    }

    public void M(int i11) {
        this.f14897f = i11;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean k(CoordinatorLayout coordinatorLayout, V v11, MotionEvent motionEvent) {
        boolean z11 = this.f14894c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z11 = coordinatorLayout.B(v11, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f14894c = z11;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f14894c = false;
        }
        if (z11) {
            H(coordinatorLayout);
            return this.f14892a.P(motionEvent);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, V v11, int i11) {
        boolean l11 = super.l(coordinatorLayout, v11, i11);
        if (a0.D(v11) == 0) {
            a0.G0(v11, 1);
            N(v11);
        }
        return l11;
    }
}