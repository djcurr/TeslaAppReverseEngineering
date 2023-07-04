package com.airbnb.android.react.maps;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.util.Log;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Tile;
import com.google.android.gms.maps.model.TileOverlay;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.TileProvider;
import java.io.ByteArrayOutputStream;
import java.util.List;

/* loaded from: classes.dex */
public class d extends c {

    /* renamed from: a  reason: collision with root package name */
    private List<LatLng> f9770a;

    /* renamed from: b  reason: collision with root package name */
    private int[] f9771b;

    /* renamed from: c  reason: collision with root package name */
    private float f9772c;

    /* renamed from: d  reason: collision with root package name */
    private float f9773d;

    /* renamed from: e  reason: collision with root package name */
    private GoogleMap f9774e;

    /* renamed from: f  reason: collision with root package name */
    private TileOverlay f9775f;

    /* renamed from: g  reason: collision with root package name */
    private a f9776g;

    /* renamed from: h  reason: collision with root package name */
    protected final Context f9777h;

    /* loaded from: classes.dex */
    public class a implements TileProvider {

        /* renamed from: a  reason: collision with root package name */
        protected final List<LatLng> f9778a;

        /* renamed from: b  reason: collision with root package name */
        protected final int[] f9779b;

        /* renamed from: c  reason: collision with root package name */
        protected final float f9780c;

        /* renamed from: d  reason: collision with root package name */
        protected final float f9781d;

        /* renamed from: e  reason: collision with root package name */
        protected final int f9782e;

        /* renamed from: f  reason: collision with root package name */
        protected final ao.b f9783f;

        /* renamed from: g  reason: collision with root package name */
        protected LatLng[] f9784g;

        /* renamed from: h  reason: collision with root package name */
        protected yn.b[] f9785h;

        /* renamed from: i  reason: collision with root package name */
        protected yn.b[] f9786i;

        public a(d dVar, Context context, List<LatLng> list, int[] iArr, float f11) {
            this.f9778a = list;
            this.f9779b = iArr;
            this.f9780c = f11;
            float f12 = context.getResources().getDisplayMetrics().density;
            this.f9781d = f12;
            this.f9782e = (int) (f12 * 256.0f);
            this.f9783f = new ao.b(256.0d);
            a();
        }

        public void a() {
            this.f9784g = new LatLng[this.f9778a.size()];
            this.f9785h = new yn.b[this.f9778a.size()];
            this.f9786i = new yn.b[Math.max(this.f9778a.size() - 1, 0)];
            for (int i11 = 0; i11 < this.f9778a.size(); i11++) {
                LatLng latLng = this.f9778a.get(i11);
                this.f9784g[i11] = latLng;
                this.f9785h[i11] = this.f9783f.a(latLng);
                if (i11 > 0) {
                    int i12 = i11 - 1;
                    this.f9786i[i12] = this.f9783f.a(un.d.c(this.f9778a.get(i12), latLng, 0.5d));
                }
            }
        }

        public void b(Canvas canvas, Matrix matrix, Paint paint, Paint paint2, b bVar, b bVar2, float f11, float f12) {
            if (f11 == f12) {
                c(canvas, paint2, bVar, bVar2, f11);
                return;
            }
            matrix.reset();
            matrix.preRotate((float) Math.toDegrees(Math.atan2(bVar2.f9788b - bVar.f9788b, bVar2.f9787a - bVar.f9787a)), (float) bVar.f9787a, (float) bVar.f9788b);
            matrix.preTranslate((float) bVar.f9787a, (float) bVar.f9788b);
            float sqrt = (float) Math.sqrt(Math.pow(bVar2.f9787a - bVar.f9787a, 2.0d) + Math.pow(bVar2.f9788b - bVar.f9788b, 2.0d));
            matrix.preScale(sqrt, sqrt);
            float f13 = 1.0f / (f12 - f11);
            matrix.preScale(f13, f13);
            matrix.preTranslate(-f11, BitmapDescriptorFactory.HUE_RED);
            paint.getShader().setLocalMatrix(matrix);
            canvas.drawLine((float) bVar.f9787a, (float) bVar.f9788b, (float) bVar2.f9787a, (float) bVar2.f9788b, paint);
        }

        public void c(Canvas canvas, Paint paint, b bVar, b bVar2, float f11) {
            paint.setColor(d.g(this.f9779b, f11));
            canvas.drawLine((float) bVar.f9787a, (float) bVar.f9788b, (float) bVar2.f9787a, (float) bVar2.f9788b, paint);
        }

        public void d(Canvas canvas, Matrix matrix, Paint paint, Paint paint2, float f11, int i11, int i12) {
            Canvas canvas2 = canvas;
            b bVar = new b();
            b bVar2 = new b();
            b bVar3 = new b();
            b bVar4 = new b();
            b bVar5 = new b();
            float f12 = 1.0f;
            boolean z11 = true;
            if (this.f9778a.size() == 1) {
                bVar.a(this.f9785h[0], f11, i11, i12, this.f9782e);
                paint2.setStyle(Paint.Style.FILL);
                paint2.setColor(d.g(this.f9779b, 1.0f));
                canvas2.drawCircle((float) bVar.f9787a, (float) bVar.f9788b, paint2.getStrokeWidth() / 2.0f, paint2);
                paint2.setStyle(Paint.Style.STROKE);
            } else if (this.f9778a.size() == 2) {
                bVar.a(this.f9785h[0], f11, i11, i12, this.f9782e);
                bVar2.a(this.f9785h[1], f11, i11, i12, this.f9782e);
                c(canvas, paint2, bVar, bVar2, BitmapDescriptorFactory.HUE_RED);
            } else {
                int i13 = 2;
                while (i13 < this.f9778a.size()) {
                    int i14 = i13 - 2;
                    bVar.a(this.f9785h[i14], f11, i11, i12, this.f9782e);
                    int i15 = i13 - 1;
                    bVar2.a(this.f9785h[i15], f11, i11, i12, this.f9782e);
                    bVar3.a(this.f9785h[i13], f11, i11, i12, this.f9782e);
                    bVar4.a(this.f9786i[i14], f11, i11, i12, this.f9782e);
                    bVar5.a(this.f9786i[i15], f11, i11, i12, this.f9782e);
                    float f13 = i13;
                    float size = (f13 - 2.0f) / this.f9778a.size();
                    float size2 = (f13 - f12) / this.f9778a.size();
                    float f14 = (size + size2) / 2.0f;
                    Log.d("AirMapGradientPolyline", String.valueOf(f14));
                    paint2.setStyle(Paint.Style.FILL);
                    paint2.setColor(d.g(this.f9779b, f14));
                    canvas2.drawCircle((float) bVar2.f9787a, (float) bVar2.f9788b, paint2.getStrokeWidth() / 2.0f, paint2);
                    paint2.setStyle(Paint.Style.STROKE);
                    b bVar6 = i14 == 0 ? bVar : bVar4;
                    int i16 = i13;
                    boolean z12 = z11;
                    float f15 = f12;
                    b(canvas, matrix, paint, paint2, bVar6, bVar2, size, f14);
                    b(canvas, matrix, paint, paint2, bVar2, i16 == this.f9778a.size() + (-1) ? bVar3 : bVar5, f14, size2);
                    i13 = i16 + 1;
                    canvas2 = canvas;
                    z11 = z12;
                    f12 = f15;
                }
            }
        }

        @Override // com.google.android.gms.maps.model.TileProvider
        public Tile getTile(int i11, int i12, int i13) {
            int i14 = this.f9782e;
            Bitmap createBitmap = Bitmap.createBitmap(i14, i14, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            Matrix matrix = new Matrix();
            Paint paint = new Paint();
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(this.f9780c);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setStrokeJoin(Paint.Join.ROUND);
            paint.setFlags(1);
            paint.setShader(new LinearGradient((float) BitmapDescriptorFactory.HUE_RED, (float) BitmapDescriptorFactory.HUE_RED, 1.0f, (float) BitmapDescriptorFactory.HUE_RED, this.f9779b, (float[]) null, Shader.TileMode.CLAMP));
            paint.getShader().setLocalMatrix(matrix);
            Paint paint2 = new Paint();
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(this.f9780c);
            paint2.setStrokeCap(Paint.Cap.BUTT);
            paint2.setStrokeJoin(Paint.Join.ROUND);
            paint2.setFlags(1);
            d(canvas, matrix, paint, paint2, (float) (Math.pow(2.0d, i13) * this.f9781d), i11, i12);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            int i15 = this.f9782e;
            return new Tile(i15, i15, byteArrayOutputStream.toByteArray());
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public double f9787a;

        /* renamed from: b  reason: collision with root package name */
        public double f9788b;

        public b a(yn.b bVar, float f11, int i11, int i12, int i13) {
            double d11 = f11;
            this.f9787a = (bVar.f59645a * d11) - (i11 * i13);
            this.f9788b = (bVar.f59646b * d11) - (i12 * i13);
            return this;
        }
    }

    public d(Context context) {
        super(context);
        this.f9777h = context;
    }

    private TileOverlayOptions f() {
        TileOverlayOptions tileOverlayOptions = new TileOverlayOptions();
        tileOverlayOptions.zIndex(this.f9772c);
        a aVar = new a(this, this.f9777h, this.f9770a, this.f9771b, this.f9773d);
        this.f9776g = aVar;
        tileOverlayOptions.tileProvider(aVar);
        return tileOverlayOptions;
    }

    public static int g(int[] iArr, float f11) {
        float length = f11 * (iArr.length - 1);
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            float max = Math.max(1.0f - Math.abs(length - i14), (float) BitmapDescriptorFactory.HUE_RED);
            i11 += (int) (Color.red(iArr[i14]) * max);
            i12 += (int) (Color.green(iArr[i14]) * max);
            i13 += (int) (Color.blue(iArr[i14]) * max);
        }
        return Color.rgb(i11, i12, i13);
    }

    @Override // com.airbnb.android.react.maps.c
    public void c(GoogleMap googleMap) {
        this.f9775f.remove();
    }

    public void d(GoogleMap googleMap) {
        Log.d("AirMapGradientPolyline", "ADDTOMAP");
        this.f9774e = googleMap;
        this.f9775f = googleMap.addTileOverlay(f());
    }

    @Override // com.airbnb.android.react.maps.c
    public Object getFeature() {
        return this.f9775f;
    }

    public void setCoordinates(List<LatLng> list) {
        this.f9770a = list;
        TileOverlay tileOverlay = this.f9775f;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.f9774e;
        if (googleMap != null) {
            this.f9775f = googleMap.addTileOverlay(f());
        }
    }

    public void setStrokeColors(int[] iArr) {
        this.f9771b = iArr;
        TileOverlay tileOverlay = this.f9775f;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.f9774e;
        if (googleMap != null) {
            this.f9775f = googleMap.addTileOverlay(f());
        }
    }

    public void setWidth(float f11) {
        this.f9773d = f11;
        TileOverlay tileOverlay = this.f9775f;
        if (tileOverlay != null) {
            tileOverlay.remove();
        }
        GoogleMap googleMap = this.f9774e;
        if (googleMap != null) {
            this.f9775f = googleMap.addTileOverlay(f());
        }
    }

    public void setZIndex(float f11) {
        this.f9772c = f11;
        TileOverlay tileOverlay = this.f9775f;
        if (tileOverlay != null) {
            tileOverlay.setZIndex(f11);
        }
    }
}