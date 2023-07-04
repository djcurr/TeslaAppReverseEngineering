package com.brentvatne.exoplayer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import bk.m;
import ci.l;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.ui.SubtitleView;
import com.google.android.exoplayer2.w0;
import com.google.android.exoplayer2.z0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fj.v;
import java.util.List;
import nj.k;

/* loaded from: classes.dex */
public final class d extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private View f10373a;

    /* renamed from: b  reason: collision with root package name */
    private final View f10374b;

    /* renamed from: c  reason: collision with root package name */
    private final SubtitleView f10375c;

    /* renamed from: d  reason: collision with root package name */
    private final com.brentvatne.exoplayer.a f10376d;

    /* renamed from: e  reason: collision with root package name */
    private final b f10377e;

    /* renamed from: f  reason: collision with root package name */
    private w0 f10378f;

    /* renamed from: g  reason: collision with root package name */
    private Context f10379g;

    /* renamed from: h  reason: collision with root package name */
    private ViewGroup.LayoutParams f10380h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f10381i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f10382j;

    /* renamed from: k  reason: collision with root package name */
    private final Runnable f10383k;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d.this.getHeight(), 1073741824));
            d dVar2 = d.this;
            dVar2.layout(dVar2.getLeft(), d.this.getTop(), d.this.getRight(), d.this.getBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements m, k, s0.a {
        private b() {
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void B(int i11) {
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void C(ExoPlaybackException exoPlaybackException) {
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void E() {
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void L(boolean z11, int i11) {
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void O(z0 z0Var, Object obj, int i11) {
        }

        @Override // bk.m
        public void d(int i11, int i12, int i13, float f11) {
            boolean z11 = d.this.f10376d.getAspectRatio() == BitmapDescriptorFactory.HUE_RED;
            d.this.f10376d.setAspectRatio(i12 == 0 ? 1.0f : (i11 * f11) / i12);
            if (z11) {
                d dVar = d.this;
                dVar.post(dVar.f10383k);
            }
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void e(l lVar) {
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void f(int i11) {
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void h(boolean z11) {
        }

        @Override // bk.m
        public void i() {
            d.this.f10374b.setVisibility(4);
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void q(v vVar, xj.k kVar) {
            d.this.i();
        }

        @Override // com.google.android.exoplayer2.s0.a
        public void u(boolean z11) {
        }

        @Override // nj.k
        public void w(List<nj.b> list) {
            d.this.f10375c.w(list);
        }

        /* synthetic */ b(d dVar, a aVar) {
            this();
        }
    }

    public d(Context context) {
        this(context, null);
    }

    private void f() {
        View view = this.f10373a;
        if (view instanceof TextureView) {
            this.f10378f.o0((TextureView) view);
        } else if (view instanceof SurfaceView) {
            this.f10378f.n0((SurfaceView) view);
        }
    }

    private void h() {
        View view = this.f10373a;
        if (view instanceof TextureView) {
            this.f10378f.N0((TextureView) view);
        } else if (view instanceof SurfaceView) {
            this.f10378f.M0((SurfaceView) view);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        w0 w0Var = this.f10378f;
        if (w0Var == null) {
            return;
        }
        xj.k r02 = w0Var.r0();
        for (int i11 = 0; i11 < r02.f57570a; i11++) {
            if (this.f10378f.u0(i11) == 2 && r02.a(i11) != null) {
                return;
            }
        }
        this.f10374b.setVisibility(0);
    }

    private void j() {
        this.f10374b.setVisibility(this.f10382j ? 4 : 0);
    }

    private void k() {
        View textureView = this.f10381i ? new TextureView(this.f10379g) : new SurfaceView(this.f10379g);
        textureView.setLayoutParams(this.f10380h);
        this.f10373a = textureView;
        if (this.f10376d.getChildAt(0) != null) {
            this.f10376d.removeViewAt(0);
        }
        this.f10376d.addView(this.f10373a, 0, this.f10380h);
        if (this.f10378f != null) {
            h();
        }
    }

    public void g() {
        this.f10376d.a();
    }

    public View getVideoSurfaceView() {
        return this.f10373a;
    }

    public void setHideShutterView(boolean z11) {
        this.f10382j = z11;
        j();
    }

    public void setPlayer(w0 w0Var) {
        w0 w0Var2 = this.f10378f;
        if (w0Var2 == w0Var) {
            return;
        }
        if (w0Var2 != null) {
            w0Var2.D0(this.f10377e);
            this.f10378f.E0(this.f10377e);
            this.f10378f.f(this.f10377e);
            f();
        }
        this.f10378f = w0Var;
        this.f10374b.setVisibility(0);
        if (w0Var != null) {
            h();
            w0Var.k0(this.f10377e);
            w0Var.r(this.f10377e);
            w0Var.j0(this.f10377e);
        }
    }

    public void setResizeMode(int i11) {
        if (this.f10376d.getResizeMode() != i11) {
            this.f10376d.setResizeMode(i11);
            post(this.f10383k);
        }
    }

    public void setUseTextureView(boolean z11) {
        if (z11 != this.f10381i) {
            this.f10381i = z11;
            k();
        }
    }

    public d(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public d(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f10381i = true;
        this.f10382j = false;
        this.f10383k = new a();
        this.f10379g = context;
        this.f10380h = new ViewGroup.LayoutParams(-1, -1);
        this.f10377e = new b(this, null);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        com.brentvatne.exoplayer.a aVar = new com.brentvatne.exoplayer.a(context);
        this.f10376d = aVar;
        aVar.setLayoutParams(layoutParams);
        View view = new View(getContext());
        this.f10374b = view;
        view.setLayoutParams(this.f10380h);
        view.setBackgroundColor(androidx.core.content.b.getColor(context, 17170444));
        SubtitleView subtitleView = new SubtitleView(context);
        this.f10375c = subtitleView;
        subtitleView.setLayoutParams(this.f10380h);
        subtitleView.d();
        subtitleView.e();
        k();
        aVar.addView(view, 1, this.f10380h);
        aVar.addView(subtitleView, 2, this.f10380h);
        addViewInLayout(aVar, 0, layoutParams);
    }
}