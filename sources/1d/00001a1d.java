package com.facebook.react.views.image;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.config.ReactFeatureFlags;
import com.facebook.react.uimanager.p;
import com.facebook.react.uimanager.t0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import je.l;
import je.q;
import ke.d;
import md.j;
import vg.b;

/* loaded from: classes3.dex */
public class h extends com.facebook.drawee.view.d {
    private static float[] Q = new float[4];
    private static final Matrix R = new Matrix();
    private static final Matrix T = new Matrix();

    /* renamed from: b1  reason: collision with root package name */
    private static final Matrix f12522b1 = new Matrix();
    private final ge.b A;
    private b B;
    private c C;
    private rf.a E;
    private g F;
    private ge.d G;
    private com.facebook.react.views.image.a H;
    private Object K;
    private int L;
    private boolean O;
    private ReadableMap P;

    /* renamed from: g  reason: collision with root package name */
    private com.facebook.react.views.image.c f12523g;

    /* renamed from: h  reason: collision with root package name */
    private final List<vg.a> f12524h;

    /* renamed from: i  reason: collision with root package name */
    private vg.a f12525i;

    /* renamed from: j  reason: collision with root package name */
    private vg.a f12526j;

    /* renamed from: k  reason: collision with root package name */
    private Drawable f12527k;

    /* renamed from: l  reason: collision with root package name */
    private Drawable f12528l;

    /* renamed from: m  reason: collision with root package name */
    private l f12529m;

    /* renamed from: n  reason: collision with root package name */
    private int f12530n;

    /* renamed from: o  reason: collision with root package name */
    private int f12531o;

    /* renamed from: p  reason: collision with root package name */
    private int f12532p;

    /* renamed from: q  reason: collision with root package name */
    private float f12533q;

    /* renamed from: t  reason: collision with root package name */
    private float f12534t;

    /* renamed from: w  reason: collision with root package name */
    private float[] f12535w;

    /* renamed from: x  reason: collision with root package name */
    private q.c f12536x;

    /* renamed from: y  reason: collision with root package name */
    private Shader.TileMode f12537y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f12538z;

    /* loaded from: classes3.dex */
    class a extends g<nf.h> {

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ com.facebook.react.uimanager.events.d f12539e;

        a(com.facebook.react.uimanager.events.d dVar) {
            this.f12539e = dVar;
        }

        @Override // ge.d
        public void e(String str, Throwable th2) {
            this.f12539e.g(com.facebook.react.views.image.b.a(t0.f(h.this), h.this.getId(), th2));
        }

        @Override // ge.d
        public void p(String str, Object obj) {
            this.f12539e.g(com.facebook.react.views.image.b.e(t0.f(h.this), h.this.getId()));
        }

        @Override // com.facebook.react.views.image.g
        public void x(int i11, int i12) {
            this.f12539e.g(com.facebook.react.views.image.b.f(t0.f(h.this), h.this.getId(), h.this.f12525i.getSource(), i11, i12));
        }

        @Override // ge.d
        /* renamed from: y */
        public void l(String str, nf.h hVar, Animatable animatable) {
            if (hVar != null) {
                this.f12539e.g(com.facebook.react.views.image.b.d(t0.f(h.this), h.this.getId(), h.this.f12525i.getSource(), hVar.getWidth(), hVar.getHeight()));
                this.f12539e.g(com.facebook.react.views.image.b.c(t0.f(h.this), h.this.getId()));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class b extends sf.a {
        private b() {
        }

        @Override // sf.a
        public void f(Bitmap bitmap, Bitmap bitmap2) {
            h.this.p(h.Q);
            bitmap.setHasAlpha(true);
            if (com.facebook.react.uimanager.e.a(h.Q[0], BitmapDescriptorFactory.HUE_RED) && com.facebook.react.uimanager.e.a(h.Q[1], BitmapDescriptorFactory.HUE_RED) && com.facebook.react.uimanager.e.a(h.Q[2], BitmapDescriptorFactory.HUE_RED) && com.facebook.react.uimanager.e.a(h.Q[3], BitmapDescriptorFactory.HUE_RED)) {
                super.f(bitmap, bitmap2);
                return;
            }
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap2, tileMode, tileMode));
            Canvas canvas = new Canvas(bitmap);
            float[] fArr = new float[8];
            g(bitmap2, h.Q, fArr);
            Path path = new Path();
            path.addRoundRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, bitmap2.getWidth(), bitmap2.getHeight()), fArr, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }

        void g(Bitmap bitmap, float[] fArr, float[] fArr2) {
            h.this.f12536x.a(h.R, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), bitmap.getWidth(), bitmap.getHeight(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            h.R.invert(h.T);
            fArr2[0] = h.T.mapRadius(fArr[0]);
            fArr2[1] = fArr2[0];
            fArr2[2] = h.T.mapRadius(fArr[1]);
            fArr2[3] = fArr2[2];
            fArr2[4] = h.T.mapRadius(fArr[2]);
            fArr2[5] = fArr2[4];
            fArr2[6] = h.T.mapRadius(fArr[3]);
            fArr2[7] = fArr2[6];
        }

        /* synthetic */ b(h hVar, a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class c extends sf.a {
        private c() {
        }

        @Override // sf.a, sf.b
        public qd.a<Bitmap> b(Bitmap bitmap, gf.f fVar) {
            Rect rect = new Rect(0, 0, h.this.getWidth(), h.this.getHeight());
            h.this.f12536x.a(h.f12522b1, rect, bitmap.getWidth(), bitmap.getHeight(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            BitmapShader bitmapShader = new BitmapShader(bitmap, h.this.f12537y, h.this.f12537y);
            bitmapShader.setLocalMatrix(h.f12522b1);
            paint.setShader(bitmapShader);
            qd.a<Bitmap> a11 = fVar.a(h.this.getWidth(), h.this.getHeight());
            try {
                new Canvas(a11.J()).drawRect(rect, paint);
                return a11.clone();
            } finally {
                qd.a.C(a11);
            }
        }

        /* synthetic */ c(h hVar, a aVar) {
            this();
        }
    }

    public h(Context context, ge.b bVar, com.facebook.react.views.image.a aVar, Object obj) {
        super(context, o(context));
        this.f12523g = com.facebook.react.views.image.c.AUTO;
        this.f12524h = new LinkedList();
        this.f12530n = 0;
        this.f12534t = Float.NaN;
        this.f12536x = d.b();
        this.f12537y = d.a();
        this.L = -1;
        this.A = bVar;
        this.H = aVar;
        this.K = obj;
    }

    private static ke.a o(Context context) {
        return new ke.b(context.getResources()).w(ke.d.a(BitmapDescriptorFactory.HUE_RED)).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(float[] fArr) {
        float f11 = !com.facebook.yoga.g.a(this.f12534t) ? this.f12534t : BitmapDescriptorFactory.HUE_RED;
        float[] fArr2 = this.f12535w;
        fArr[0] = (fArr2 == null || com.facebook.yoga.g.a(fArr2[0])) ? f11 : this.f12535w[0];
        float[] fArr3 = this.f12535w;
        fArr[1] = (fArr3 == null || com.facebook.yoga.g.a(fArr3[1])) ? f11 : this.f12535w[1];
        float[] fArr4 = this.f12535w;
        fArr[2] = (fArr4 == null || com.facebook.yoga.g.a(fArr4[2])) ? f11 : this.f12535w[2];
        float[] fArr5 = this.f12535w;
        if (fArr5 != null && !com.facebook.yoga.g.a(fArr5[3])) {
            f11 = this.f12535w[3];
        }
        fArr[3] = f11;
    }

    private boolean q() {
        return this.f12524h.size() > 1;
    }

    private boolean r() {
        return this.f12537y != Shader.TileMode.CLAMP;
    }

    private void u() {
        this.f12525i = null;
        if (this.f12524h.isEmpty()) {
            this.f12524h.add(new vg.a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        } else if (q()) {
            b.C1227b a11 = vg.b.a(getWidth(), getHeight(), this.f12524h);
            this.f12525i = a11.a();
            this.f12526j = a11.b();
            return;
        }
        this.f12525i = this.f12524h.get(0);
    }

    private boolean v(vg.a aVar) {
        com.facebook.react.views.image.c cVar = this.f12523g;
        return cVar == com.facebook.react.views.image.c.AUTO ? ud.d.i(aVar.getUri()) || ud.d.j(aVar.getUri()) : cVar == com.facebook.react.views.image.c.RESIZE;
    }

    private boolean w() {
        q.c cVar = this.f12536x;
        return (cVar == q.c.f33453e || cVar == q.c.f33454f || !ReactFeatureFlags.enableRoundedCornerPostprocessing) ? false : true;
    }

    private void y(String str) {
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (i11 <= 0 || i12 <= 0) {
            return;
        }
        this.f12538z = this.f12538z || q() || r();
        s();
    }

    public void s() {
        if (this.f12538z) {
            if (!q() || (getWidth() > 0 && getHeight() > 0)) {
                u();
                vg.a aVar = this.f12525i;
                if (aVar == null) {
                    return;
                }
                boolean v11 = v(aVar);
                if (!v11 || (getWidth() > 0 && getHeight() > 0)) {
                    if (!r() || (getWidth() > 0 && getHeight() > 0)) {
                        ke.a hierarchy = getHierarchy();
                        hierarchy.v(this.f12536x);
                        Drawable drawable = this.f12527k;
                        if (drawable != null) {
                            hierarchy.A(drawable, this.f12536x);
                        }
                        Drawable drawable2 = this.f12528l;
                        if (drawable2 != null) {
                            hierarchy.A(drawable2, q.c.f33451c);
                        }
                        p(Q);
                        ke.d q11 = hierarchy.q();
                        float[] fArr = Q;
                        q11.o(fArr[0], fArr[1], fArr[2], fArr[3]);
                        l lVar = this.f12529m;
                        if (lVar != null) {
                            lVar.b(this.f12531o, this.f12533q);
                            this.f12529m.s(q11.d());
                            hierarchy.w(this.f12529m);
                        }
                        if (w()) {
                            q11.p(BitmapDescriptorFactory.HUE_RED);
                        }
                        q11.l(this.f12531o, this.f12533q);
                        int i11 = this.f12532p;
                        if (i11 != 0) {
                            q11.q(i11);
                        } else {
                            q11.r(d.a.BITMAP_ONLY);
                        }
                        hierarchy.D(q11);
                        int i12 = this.L;
                        if (i12 < 0) {
                            i12 = this.f12525i.isResource() ? 0 : 300;
                        }
                        hierarchy.y(i12);
                        LinkedList linkedList = new LinkedList();
                        b bVar = this.B;
                        if (bVar != null) {
                            linkedList.add(bVar);
                        }
                        rf.a aVar2 = this.E;
                        if (aVar2 != null) {
                            linkedList.add(aVar2);
                        }
                        c cVar = this.C;
                        if (cVar != null) {
                            linkedList.add(cVar);
                        }
                        sf.b d11 = e.d(linkedList);
                        p001if.d dVar = v11 ? new p001if.d(getWidth(), getHeight()) : null;
                        ig.a y11 = ig.a.y(ImageRequestBuilder.s(this.f12525i.getUri()).A(d11).E(dVar).t(true).B(this.O), this.P);
                        com.facebook.react.views.image.a aVar3 = this.H;
                        if (aVar3 != null) {
                            aVar3.a(this.f12525i.getUri());
                        }
                        this.A.y();
                        this.A.z(true).A(this.K).b(getController()).C(y11);
                        vg.a aVar4 = this.f12526j;
                        if (aVar4 != null) {
                            this.A.D(ImageRequestBuilder.s(aVar4.getUri()).A(d11).E(dVar).t(true).B(this.O).a());
                        }
                        g gVar = this.F;
                        if (gVar != null && this.G != null) {
                            ge.f fVar = new ge.f();
                            fVar.b(this.F);
                            fVar.b(this.G);
                            this.A.B(fVar);
                        } else {
                            ge.d dVar2 = this.G;
                            if (dVar2 != null) {
                                this.A.B(dVar2);
                            } else if (gVar != null) {
                                this.A.B(gVar);
                            }
                        }
                        g gVar2 = this.F;
                        if (gVar2 != null) {
                            hierarchy.C(gVar2);
                        }
                        setController(this.A.build());
                        this.f12538z = false;
                        this.A.y();
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        if (this.f12530n != i11) {
            this.f12530n = i11;
            this.f12529m = new l(i11);
            this.f12538z = true;
        }
    }

    public void setBlurRadius(float f11) {
        int c11 = ((int) p.c(f11)) / 2;
        if (c11 == 0) {
            this.E = null;
        } else {
            this.E = new rf.a(2, c11);
        }
        this.f12538z = true;
    }

    public void setBorderColor(int i11) {
        if (this.f12531o != i11) {
            this.f12531o = i11;
            this.f12538z = true;
        }
    }

    public void setBorderRadius(float f11) {
        if (com.facebook.react.uimanager.e.a(this.f12534t, f11)) {
            return;
        }
        this.f12534t = f11;
        this.f12538z = true;
    }

    public void setBorderWidth(float f11) {
        float c11 = p.c(f11);
        if (com.facebook.react.uimanager.e.a(this.f12533q, c11)) {
            return;
        }
        this.f12533q = c11;
        this.f12538z = true;
    }

    public void setControllerListener(ge.d dVar) {
        this.G = dVar;
        this.f12538z = true;
        s();
    }

    public void setDefaultSource(String str) {
        Drawable c11 = vg.c.b().c(getContext(), str);
        if (j.a(this.f12527k, c11)) {
            return;
        }
        this.f12527k = c11;
        this.f12538z = true;
    }

    public void setFadeDuration(int i11) {
        this.L = i11;
    }

    public void setHeaders(ReadableMap readableMap) {
        this.P = readableMap;
    }

    public void setLoadingIndicatorSource(String str) {
        Drawable c11 = vg.c.b().c(getContext(), str);
        je.b bVar = c11 != null ? new je.b(c11, 1000) : null;
        if (j.a(this.f12528l, bVar)) {
            return;
        }
        this.f12528l = bVar;
        this.f12538z = true;
    }

    public void setOverlayColor(int i11) {
        if (this.f12532p != i11) {
            this.f12532p = i11;
            this.f12538z = true;
        }
    }

    public void setProgressiveRenderingEnabled(boolean z11) {
        this.O = z11;
    }

    public void setResizeMethod(com.facebook.react.views.image.c cVar) {
        if (this.f12523g != cVar) {
            this.f12523g = cVar;
            this.f12538z = true;
        }
    }

    public void setScaleType(q.c cVar) {
        if (this.f12536x != cVar) {
            this.f12536x = cVar;
            if (w()) {
                this.B = new b(this, null);
            } else {
                this.B = null;
            }
            this.f12538z = true;
        }
    }

    public void setShouldNotifyLoadEvents(boolean z11) {
        if (z11 == (this.F != null)) {
            return;
        }
        if (!z11) {
            this.F = null;
        } else {
            this.F = new a(t0.c((ReactContext) getContext(), getId()));
        }
        this.f12538z = true;
    }

    public void setSource(ReadableArray readableArray) {
        LinkedList<vg.a> linkedList = new LinkedList();
        if (readableArray != null && readableArray.size() != 0) {
            if (readableArray.size() == 1) {
                String string = readableArray.getMap(0).getString("uri");
                vg.a aVar = new vg.a(getContext(), string);
                linkedList.add(aVar);
                if (Uri.EMPTY.equals(aVar.getUri())) {
                    y(string);
                }
            } else {
                for (int i11 = 0; i11 < readableArray.size(); i11++) {
                    ReadableMap map = readableArray.getMap(i11);
                    String string2 = map.getString("uri");
                    vg.a aVar2 = new vg.a(getContext(), string2, map.getDouble(Snapshot.WIDTH), map.getDouble(Snapshot.HEIGHT));
                    linkedList.add(aVar2);
                    if (Uri.EMPTY.equals(aVar2.getUri())) {
                        y(string2);
                    }
                }
            }
        } else {
            linkedList.add(new vg.a(getContext(), "data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAEAAAABCAQAAAC1HAwCAAAAC0lEQVR42mNkYAAAAAYAAjCB0C8AAAAASUVORK5CYII="));
        }
        if (this.f12524h.equals(linkedList)) {
            return;
        }
        this.f12524h.clear();
        for (vg.a aVar3 : linkedList) {
            this.f12524h.add(aVar3);
        }
        this.f12538z = true;
    }

    public void setTileMode(Shader.TileMode tileMode) {
        if (this.f12537y != tileMode) {
            this.f12537y = tileMode;
            if (r()) {
                this.C = new c(this, null);
            } else {
                this.C = null;
            }
            this.f12538z = true;
        }
    }

    public void t(float f11, int i11) {
        if (this.f12535w == null) {
            float[] fArr = new float[4];
            this.f12535w = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (com.facebook.react.uimanager.e.a(this.f12535w[i11], f11)) {
            return;
        }
        this.f12535w[i11] = f11;
        this.f12538z = true;
    }

    public void x(Object obj) {
        if (j.a(this.K, obj)) {
            return;
        }
        this.K = obj;
        this.f12538z = true;
    }
}