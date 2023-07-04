package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.reanimated.layoutReanimation.Snapshot;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class m extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f17646a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f17647b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f17648c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f17649d;

    /* renamed from: e  reason: collision with root package name */
    private String f17650e;

    /* renamed from: f  reason: collision with root package name */
    private int f17651f;

    /* renamed from: g  reason: collision with root package name */
    private int f17652g;

    /* renamed from: h  reason: collision with root package name */
    private String f17653h;

    /* renamed from: i  reason: collision with root package name */
    private int f17654i;

    /* renamed from: j  reason: collision with root package name */
    private final AtomicBoolean f17655j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public class a extends com.facebook.imagepipeline.datasource.b {
        a() {
        }

        @Override // com.facebook.datasource.b
        public void onFailureImpl(com.facebook.datasource.c<qd.a<nf.c>> cVar) {
            m.this.f17655j.set(false);
            nd.a.J("ReactNative", cVar.c(), "RNSVG: fetchDecodedImage failed!", new Object[0]);
        }

        @Override // com.facebook.imagepipeline.datasource.b
        public void onNewResultImpl(Bitmap bitmap) {
            m.this.f17655j.set(false);
            SvgView svgView = m.this.getSvgView();
            if (svgView != null) {
                svgView.invalidate();
            }
        }
    }

    public m(ReactContext reactContext) {
        super(reactContext);
        this.f17655j = new AtomicBoolean(false);
    }

    private void d(Canvas canvas, Paint paint, Bitmap bitmap, float f11) {
        if (this.f17651f == 0 || this.f17652g == 0) {
            this.f17651f = bitmap.getWidth();
            this.f17652g = bitmap.getHeight();
        }
        RectF f12 = f();
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f17651f, this.f17652g);
        t0.a(rectF, f12, this.f17653h, this.f17654i).mapRect(rectF);
        canvas.clipPath(getPath(canvas, paint));
        Path clipPath = getClipPath(canvas, paint);
        if (clipPath != null) {
            canvas.clipPath(clipPath);
        }
        Paint paint2 = new Paint();
        paint2.setAlpha((int) (f11 * 255.0f));
        canvas.drawBitmap(bitmap, (Rect) null, rectF, paint2);
        this.mCTM.mapRect(rectF);
        setClientRect(rectF);
    }

    private RectF f() {
        double relativeOnWidth = relativeOnWidth(this.f17646a);
        double relativeOnHeight = relativeOnHeight(this.f17647b);
        double relativeOnWidth2 = relativeOnWidth(this.f17648c);
        double relativeOnHeight2 = relativeOnHeight(this.f17649d);
        if (relativeOnWidth2 == 0.0d) {
            relativeOnWidth2 = this.f17651f * this.mScale;
        }
        if (relativeOnHeight2 == 0.0d) {
            relativeOnHeight2 = this.f17652g * this.mScale;
        }
        return new RectF((float) relativeOnWidth, (float) relativeOnHeight, (float) (relativeOnWidth + relativeOnWidth2), (float) (relativeOnHeight + relativeOnHeight2));
    }

    private void g(jf.h hVar, com.facebook.imagepipeline.request.a aVar) {
        this.f17655j.set(true);
        hVar.d(aVar, this.mContext).d(new a(), kd.h.g());
    }

    private void h(jf.h hVar, com.facebook.imagepipeline.request.a aVar, Canvas canvas, Paint paint, float f11) {
        com.facebook.datasource.c<qd.a<nf.c>> h11 = hVar.h(aVar, this.mContext);
        try {
            try {
                qd.a<nf.c> g11 = h11.g();
                if (g11 == null) {
                    return;
                }
                try {
                    try {
                        nf.c J = g11.J();
                        if (J instanceof nf.b) {
                            Bitmap p11 = ((nf.b) J).p();
                            if (p11 == null) {
                                return;
                            }
                            d(canvas, paint, p11, f11);
                        }
                    } finally {
                        qd.a.C(g11);
                    }
                } catch (Exception e11) {
                    throw new IllegalStateException(e11);
                }
            } catch (Exception e12) {
                throw new IllegalStateException(e12);
            }
        } finally {
            h11.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public void draw(Canvas canvas, Paint paint, float f11) {
        if (this.f17655j.get()) {
            return;
        }
        jf.h a11 = be.c.a();
        com.facebook.imagepipeline.request.a a12 = com.facebook.imagepipeline.request.a.a(new vg.a(this.mContext, this.f17650e).getUri());
        if (a11.n(a12)) {
            h(a11, a12, canvas, paint, f11 * this.mOpacity);
        } else {
            g(a11, a12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    public Path getPath(Canvas canvas, Paint paint) {
        Path path = new Path();
        ((VirtualView) this).mPath = path;
        path.addRect(f(), Path.Direction.CW);
        return ((VirtualView) this).mPath;
    }

    @ng.a(name = "align")
    public void setAlign(String str) {
        this.f17653h = str;
        invalidate();
    }

    @ng.a(name = Snapshot.HEIGHT)
    public void setHeight(Dynamic dynamic) {
        this.f17649d = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "meetOrSlice")
    public void setMeetOrSlice(int i11) {
        this.f17654i = i11;
        invalidate();
    }

    @ng.a(name = "src")
    public void setSrc(ReadableMap readableMap) {
        if (readableMap != null) {
            String string = readableMap.getString("uri");
            this.f17650e = string;
            if (string == null || string.isEmpty()) {
                return;
            }
            if (readableMap.hasKey(Snapshot.WIDTH) && readableMap.hasKey(Snapshot.HEIGHT)) {
                this.f17651f = readableMap.getInt(Snapshot.WIDTH);
                this.f17652g = readableMap.getInt(Snapshot.HEIGHT);
            } else {
                this.f17651f = 0;
                this.f17652g = 0;
            }
            if (Uri.parse(this.f17650e).getScheme() == null) {
                vg.c.b().e(this.mContext, this.f17650e);
            }
        }
    }

    @ng.a(name = Snapshot.WIDTH)
    public void setWidth(Dynamic dynamic) {
        this.f17648c = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f17646a = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f17647b = SVGLength.b(dynamic);
        invalidate();
    }
}