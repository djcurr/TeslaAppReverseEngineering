package com.canhub.cropper;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.canhub.cropper.CropOverlayView;
import com.canhub.cropper.a;
import com.canhub.cropper.b;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* loaded from: classes.dex */
public class CropImageView extends FrameLayout {
    private g A;
    private f B;
    private h C;
    private i E;
    private e F;
    private Uri G;
    private int H;
    private float K;
    private float L;
    private float O;
    private RectF P;
    private int Q;
    private boolean R;
    private Uri T;

    /* renamed from: a */
    private final ImageView f10879a;

    /* renamed from: b */
    private final CropOverlayView f10880b;

    /* renamed from: b1 */
    private WeakReference<com.canhub.cropper.b> f10881b1;

    /* renamed from: c */
    private final Matrix f10882c;

    /* renamed from: d */
    private final Matrix f10883d;

    /* renamed from: e */
    private final ProgressBar f10884e;

    /* renamed from: f */
    private final float[] f10885f;

    /* renamed from: g */
    private final float[] f10886g;

    /* renamed from: g1 */
    private WeakReference<com.canhub.cropper.a> f10887g1;

    /* renamed from: h */
    private db.b f10888h;

    /* renamed from: i */
    private Bitmap f10889i;

    /* renamed from: j */
    private int f10890j;

    /* renamed from: k */
    private int f10891k;

    /* renamed from: l */
    private boolean f10892l;

    /* renamed from: m */
    private boolean f10893m;

    /* renamed from: n */
    private int f10894n;

    /* renamed from: o */
    private int f10895o;

    /* renamed from: p */
    private int f10896p;

    /* renamed from: q */
    private k f10897q;

    /* renamed from: t */
    private boolean f10898t;

    /* renamed from: w */
    private boolean f10899w;

    /* renamed from: x */
    private boolean f10900x;

    /* renamed from: y */
    private boolean f10901y;

    /* renamed from: z */
    private int f10902z;

    /* loaded from: classes.dex */
    class a implements CropOverlayView.b {
        a() {
            CropImageView.this = r1;
        }

        @Override // com.canhub.cropper.CropOverlayView.b
        public void a(boolean z11) {
            CropImageView.this.k(z11, true);
            g gVar = CropImageView.this.A;
            if (gVar != null && !z11) {
                gVar.a(CropImageView.this.getCropRect());
            }
            f fVar = CropImageView.this.B;
            if (fVar == null || !z11) {
                return;
            }
            fVar.a(CropImageView.this.getCropRect());
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final Uri f10904a;

        /* renamed from: b */
        private final Uri f10905b;

        /* renamed from: c */
        private final Exception f10906c;

        /* renamed from: d */
        private final float[] f10907d;

        /* renamed from: e */
        private final Rect f10908e;

        /* renamed from: f */
        private final Rect f10909f;

        /* renamed from: g */
        private final int f10910g;

        /* renamed from: h */
        private final int f10911h;

        public b(Bitmap bitmap, Uri uri, Bitmap bitmap2, Uri uri2, Exception exc, float[] fArr, Rect rect, Rect rect2, int i11, int i12) {
            this.f10904a = uri;
            this.f10905b = uri2;
            this.f10906c = exc;
            this.f10907d = fArr;
            this.f10908e = rect;
            this.f10909f = rect2;
            this.f10910g = i11;
            this.f10911h = i12;
        }

        public float[] a() {
            return this.f10907d;
        }

        public Rect b() {
            return this.f10908e;
        }

        public Exception c() {
            return this.f10906c;
        }

        public Uri d() {
            return this.f10904a;
        }

        public int e() {
            return this.f10910g;
        }

        public int f() {
            return this.f10911h;
        }

        public Uri g() {
            return this.f10905b;
        }

        public Rect h() {
            return this.f10909f;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        RECTANGLE,
        OVAL
    }

    /* loaded from: classes.dex */
    public enum d {
        OFF,
        ON_TOUCH,
        ON
    }

    /* loaded from: classes.dex */
    public interface e {
        void a(CropImageView cropImageView, b bVar);
    }

    /* loaded from: classes.dex */
    public interface f {
        void a(Rect rect);
    }

    /* loaded from: classes.dex */
    public interface g {
        void a(Rect rect);
    }

    /* loaded from: classes.dex */
    public interface h {
        void a();
    }

    /* loaded from: classes.dex */
    public interface i {
        void c(CropImageView cropImageView, Uri uri, Exception exc);
    }

    /* loaded from: classes.dex */
    public enum j {
        NONE,
        SAMPLING,
        RESIZE_INSIDE,
        RESIZE_FIT,
        RESIZE_EXACT
    }

    /* loaded from: classes.dex */
    public enum k {
        FIT_CENTER,
        CENTER,
        CENTER_CROP,
        CENTER_INSIDE
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Bundle bundleExtra;
        this.f10882c = new Matrix();
        this.f10883d = new Matrix();
        this.f10885f = new float[8];
        this.f10886g = new float[8];
        this.f10898t = false;
        this.f10899w = true;
        this.f10900x = true;
        this.f10901y = true;
        this.H = 1;
        this.K = 1.0f;
        com.canhub.cropper.e eVar = null;
        Intent intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
        if (intent != null && (bundleExtra = intent.getBundleExtra("CROP_IMAGE_EXTRA_BUNDLE")) != null) {
            eVar = (com.canhub.cropper.e) bundleExtra.getParcelable("CROP_IMAGE_EXTRA_OPTIONS");
        }
        if (eVar == null) {
            eVar = new com.canhub.cropper.e();
            if (attributeSet != null) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, db.g.f23887a, 0, 0);
                try {
                    int i11 = db.g.f23898l;
                    eVar.f10996l = obtainStyledAttributes.getBoolean(i11, eVar.f10996l);
                    int i12 = db.g.f23888b;
                    eVar.f10997m = obtainStyledAttributes.getInteger(i12, eVar.f10997m);
                    eVar.f10998n = obtainStyledAttributes.getInteger(db.g.f23889c, eVar.f10998n);
                    eVar.f10987e = k.values()[obtainStyledAttributes.getInt(db.g.A, eVar.f10987e.ordinal())];
                    eVar.f10992h = obtainStyledAttributes.getBoolean(db.g.f23890d, eVar.f10992h);
                    eVar.f10993i = obtainStyledAttributes.getBoolean(db.g.f23911y, eVar.f10993i);
                    eVar.f10994j = obtainStyledAttributes.getInteger(db.g.f23906t, eVar.f10994j);
                    eVar.f10981a = c.values()[obtainStyledAttributes.getInt(db.g.B, eVar.f10981a.ordinal())];
                    eVar.f10986d = d.values()[obtainStyledAttributes.getInt(db.g.f23900n, eVar.f10986d.ordinal())];
                    eVar.f10982b = obtainStyledAttributes.getDimension(db.g.E, eVar.f10982b);
                    eVar.f10985c = obtainStyledAttributes.getDimension(db.g.F, eVar.f10985c);
                    eVar.f10995k = obtainStyledAttributes.getFloat(db.g.f23903q, eVar.f10995k);
                    eVar.f10999o = obtainStyledAttributes.getDimension(db.g.f23897k, eVar.f10999o);
                    eVar.f11000p = obtainStyledAttributes.getInteger(db.g.f23896j, eVar.f11000p);
                    int i13 = db.g.f23895i;
                    eVar.f11003q = obtainStyledAttributes.getDimension(i13, eVar.f11003q);
                    eVar.f11004t = obtainStyledAttributes.getDimension(db.g.f23894h, eVar.f11004t);
                    eVar.f11005w = obtainStyledAttributes.getDimension(db.g.f23893g, eVar.f11005w);
                    eVar.f11006x = obtainStyledAttributes.getInteger(db.g.f23892f, eVar.f11006x);
                    eVar.f11009y = obtainStyledAttributes.getDimension(db.g.f23902p, eVar.f11009y);
                    eVar.f11011z = obtainStyledAttributes.getInteger(db.g.f23901o, eVar.f11011z);
                    eVar.A = obtainStyledAttributes.getInteger(db.g.f23891e, eVar.A);
                    eVar.f10988f = obtainStyledAttributes.getBoolean(db.g.C, this.f10899w);
                    eVar.f10989g = obtainStyledAttributes.getBoolean(db.g.D, this.f10900x);
                    eVar.f11003q = obtainStyledAttributes.getDimension(i13, eVar.f11003q);
                    eVar.B = (int) obtainStyledAttributes.getDimension(db.g.f23910x, eVar.B);
                    eVar.C = (int) obtainStyledAttributes.getDimension(db.g.f23909w, eVar.C);
                    eVar.E = (int) obtainStyledAttributes.getFloat(db.g.f23908v, eVar.E);
                    eVar.F = (int) obtainStyledAttributes.getFloat(db.g.f23907u, eVar.F);
                    eVar.G = (int) obtainStyledAttributes.getFloat(db.g.f23905s, eVar.G);
                    eVar.H = (int) obtainStyledAttributes.getFloat(db.g.f23904r, eVar.H);
                    int i14 = db.g.f23899m;
                    eVar.f10984b2 = obtainStyledAttributes.getBoolean(i14, eVar.f10984b2);
                    eVar.f10991g2 = obtainStyledAttributes.getBoolean(i14, eVar.f10991g2);
                    this.f10898t = obtainStyledAttributes.getBoolean(db.g.f23912z, this.f10898t);
                    if (obtainStyledAttributes.hasValue(i12) && obtainStyledAttributes.hasValue(i12) && !obtainStyledAttributes.hasValue(i11)) {
                        eVar.f10996l = true;
                    }
                } finally {
                    obtainStyledAttributes.recycle();
                }
            }
        }
        eVar.a();
        this.f10897q = eVar.f10987e;
        this.f10901y = eVar.f10992h;
        this.f10902z = eVar.f10994j;
        this.f10899w = eVar.f10988f;
        this.f10900x = eVar.f10989g;
        this.f10892l = eVar.f10984b2;
        this.f10893m = eVar.f10991g2;
        View inflate = LayoutInflater.from(context).inflate(db.d.f23882b, (ViewGroup) this, true);
        ImageView imageView = (ImageView) inflate.findViewById(db.c.f23874c);
        this.f10879a = imageView;
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
        CropOverlayView cropOverlayView = (CropOverlayView) inflate.findViewById(db.c.f23872a);
        this.f10880b = cropOverlayView;
        cropOverlayView.setCropWindowChangeListener(new a());
        cropOverlayView.setInitialAttributeValues(eVar);
        this.f10884e = (ProgressBar) inflate.findViewById(db.c.f23873b);
        s();
    }

    private void d(float f11, float f12, boolean z11, boolean z12) {
        if (this.f10889i != null) {
            float f13 = BitmapDescriptorFactory.HUE_RED;
            if (f11 <= BitmapDescriptorFactory.HUE_RED || f12 <= BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            this.f10882c.invert(this.f10883d);
            RectF cropWindowRect = this.f10880b.getCropWindowRect();
            this.f10883d.mapRect(cropWindowRect);
            this.f10882c.reset();
            this.f10882c.postTranslate((f11 - this.f10889i.getWidth()) / 2.0f, (f12 - this.f10889i.getHeight()) / 2.0f);
            l();
            int i11 = this.f10891k;
            if (i11 > 0) {
                this.f10882c.postRotate(i11, com.canhub.cropper.c.q(this.f10885f), com.canhub.cropper.c.r(this.f10885f));
                l();
            }
            float min = Math.min(f11 / com.canhub.cropper.c.x(this.f10885f), f12 / com.canhub.cropper.c.t(this.f10885f));
            k kVar = this.f10897q;
            if (kVar == k.FIT_CENTER || ((kVar == k.CENTER_INSIDE && min < 1.0f) || (min > 1.0f && this.f10901y))) {
                this.f10882c.postScale(min, min, com.canhub.cropper.c.q(this.f10885f), com.canhub.cropper.c.r(this.f10885f));
                l();
            }
            float f14 = this.f10892l ? -this.K : this.K;
            float f15 = this.f10893m ? -this.K : this.K;
            this.f10882c.postScale(f14, f15, com.canhub.cropper.c.q(this.f10885f), com.canhub.cropper.c.r(this.f10885f));
            l();
            this.f10882c.mapRect(cropWindowRect);
            if (z11) {
                this.L = f11 > com.canhub.cropper.c.x(this.f10885f) ? 0.0f : Math.max(Math.min((f11 / 2.0f) - cropWindowRect.centerX(), -com.canhub.cropper.c.u(this.f10885f)), getWidth() - com.canhub.cropper.c.v(this.f10885f)) / f14;
                if (f12 <= com.canhub.cropper.c.t(this.f10885f)) {
                    f13 = Math.max(Math.min((f12 / 2.0f) - cropWindowRect.centerY(), -com.canhub.cropper.c.w(this.f10885f)), getHeight() - com.canhub.cropper.c.p(this.f10885f)) / f15;
                }
                this.O = f13;
            } else {
                this.L = Math.min(Math.max(this.L * f14, -cropWindowRect.left), (-cropWindowRect.right) + f11) / f14;
                this.O = Math.min(Math.max(this.O * f15, -cropWindowRect.top), (-cropWindowRect.bottom) + f12) / f15;
            }
            this.f10882c.postTranslate(this.L * f14, this.O * f15);
            cropWindowRect.offset(this.L * f14, this.O * f15);
            this.f10880b.setCropWindowRect(cropWindowRect);
            l();
            this.f10880b.invalidate();
            if (z12) {
                this.f10888h.a(this.f10885f, this.f10882c);
                this.f10879a.startAnimation(this.f10888h);
            } else {
                this.f10879a.setImageMatrix(this.f10882c);
            }
            u(false);
        }
    }

    private void e() {
        Bitmap bitmap = this.f10889i;
        if (bitmap != null && (this.f10896p > 0 || this.G != null)) {
            bitmap.recycle();
        }
        this.f10889i = null;
        this.f10896p = 0;
        this.G = null;
        this.H = 1;
        this.f10891k = 0;
        this.K = 1.0f;
        this.L = BitmapDescriptorFactory.HUE_RED;
        this.O = BitmapDescriptorFactory.HUE_RED;
        this.f10882c.reset();
        this.T = null;
        this.f10879a.setImageBitmap(null);
        r();
    }

    private static int j(int i11, int i12, int i13) {
        return i11 == 1073741824 ? i12 : i11 == Integer.MIN_VALUE ? Math.min(i13, i12) : i13;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void k(boolean r12, boolean r13) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.canhub.cropper.CropImageView.k(boolean, boolean):void");
    }

    private void l() {
        float[] fArr = this.f10885f;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = this.f10889i.getWidth();
        float[] fArr2 = this.f10885f;
        fArr2[3] = 0.0f;
        fArr2[4] = this.f10889i.getWidth();
        this.f10885f[5] = this.f10889i.getHeight();
        float[] fArr3 = this.f10885f;
        fArr3[6] = 0.0f;
        fArr3[7] = this.f10889i.getHeight();
        this.f10882c.mapPoints(this.f10885f);
        float[] fArr4 = this.f10886g;
        fArr4[0] = 0.0f;
        fArr4[1] = 0.0f;
        fArr4[2] = 100.0f;
        fArr4[3] = 0.0f;
        fArr4[4] = 100.0f;
        fArr4[5] = 100.0f;
        fArr4[6] = 0.0f;
        fArr4[7] = 100.0f;
        this.f10882c.mapPoints(fArr4);
    }

    private void q(Bitmap bitmap, int i11, Uri uri, int i12, int i13) {
        Bitmap bitmap2 = this.f10889i;
        if (bitmap2 == null || !bitmap2.equals(bitmap)) {
            this.f10879a.clearAnimation();
            e();
            this.f10889i = bitmap;
            this.f10879a.setImageBitmap(bitmap);
            this.G = uri;
            this.f10896p = i11;
            this.H = i12;
            this.f10891k = i13;
            d(getWidth(), getHeight(), true, false);
            CropOverlayView cropOverlayView = this.f10880b;
            if (cropOverlayView != null) {
                cropOverlayView.r();
                r();
            }
        }
    }

    private void r() {
        CropOverlayView cropOverlayView = this.f10880b;
        if (cropOverlayView != null) {
            cropOverlayView.setVisibility((!this.f10899w || this.f10889i == null) ? 4 : 0);
        }
    }

    private void s() {
        this.f10884e.setVisibility(this.f10900x && ((this.f10889i == null && this.f10881b1 != null) || this.f10887g1 != null) ? 0 : 4);
    }

    private void u(boolean z11) {
        if (this.f10889i != null && !z11) {
            this.f10880b.t(getWidth(), getHeight(), (this.H * 100.0f) / com.canhub.cropper.c.x(this.f10886g), (this.H * 100.0f) / com.canhub.cropper.c.t(this.f10886g));
        }
        this.f10880b.s(z11 ? null : this.f10885f, getWidth(), getHeight());
    }

    public void f() {
        this.f10892l = !this.f10892l;
        d(getWidth(), getHeight(), true, false);
    }

    public void g() {
        this.f10893m = !this.f10893m;
        d(getWidth(), getHeight(), true, false);
    }

    public Pair<Integer, Integer> getAspectRatio() {
        return new Pair<>(Integer.valueOf(this.f10880b.getAspectRatioX()), Integer.valueOf(this.f10880b.getAspectRatioY()));
    }

    public float[] getCropPoints() {
        RectF cropWindowRect = this.f10880b.getCropWindowRect();
        float[] fArr = new float[8];
        float f11 = cropWindowRect.left;
        fArr[0] = f11;
        float f12 = cropWindowRect.top;
        fArr[1] = f12;
        float f13 = cropWindowRect.right;
        fArr[2] = f13;
        fArr[3] = f12;
        fArr[4] = f13;
        float f14 = cropWindowRect.bottom;
        fArr[5] = f14;
        fArr[6] = f11;
        fArr[7] = f14;
        this.f10882c.invert(this.f10883d);
        this.f10883d.mapPoints(fArr);
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = fArr[i11] * this.H;
        }
        return fArr;
    }

    public Rect getCropRect() {
        int i11 = this.H;
        Bitmap bitmap = this.f10889i;
        if (bitmap == null) {
            return null;
        }
        return com.canhub.cropper.c.s(getCropPoints(), bitmap.getWidth() * i11, i11 * bitmap.getHeight(), this.f10880b.m(), this.f10880b.getAspectRatioX(), this.f10880b.getAspectRatioY());
    }

    public c getCropShape() {
        return this.f10880b.getCropShape();
    }

    public RectF getCropWindowRect() {
        CropOverlayView cropOverlayView = this.f10880b;
        if (cropOverlayView == null) {
            return null;
        }
        return cropOverlayView.getCropWindowRect();
    }

    public Bitmap getCroppedImage() {
        return h(0, 0, j.NONE);
    }

    public void getCroppedImageAsync() {
        i(0, 0, j.NONE);
    }

    public d getGuidelines() {
        return this.f10880b.getGuidelines();
    }

    public int getImageResource() {
        return this.f10896p;
    }

    public Uri getImageUri() {
        return this.G;
    }

    public int getMaxZoom() {
        return this.f10902z;
    }

    public int getRotatedDegrees() {
        return this.f10891k;
    }

    public k getScaleType() {
        return this.f10897q;
    }

    public Rect getWholeImageRect() {
        int i11 = this.H;
        Bitmap bitmap = this.f10889i;
        if (bitmap == null) {
            return null;
        }
        return new Rect(0, 0, bitmap.getWidth() * i11, bitmap.getHeight() * i11);
    }

    public Bitmap h(int i11, int i12, j jVar) {
        int i13;
        Bitmap bitmap;
        if (this.f10889i != null) {
            this.f10879a.clearAnimation();
            j jVar2 = j.NONE;
            int i14 = jVar != jVar2 ? i11 : 0;
            int i15 = jVar != jVar2 ? i12 : 0;
            if (this.G != null && (this.H > 1 || jVar == j.SAMPLING)) {
                i13 = i14;
                bitmap = com.canhub.cropper.c.d(getContext(), this.G, getCropPoints(), this.f10891k, this.f10889i.getWidth() * this.H, this.f10889i.getHeight() * this.H, this.f10880b.m(), this.f10880b.getAspectRatioX(), this.f10880b.getAspectRatioY(), i14, i15, this.f10892l, this.f10893m).f10975a;
            } else {
                i13 = i14;
                bitmap = com.canhub.cropper.c.g(this.f10889i, getCropPoints(), this.f10891k, this.f10880b.m(), this.f10880b.getAspectRatioX(), this.f10880b.getAspectRatioY(), this.f10892l, this.f10893m).f10975a;
            }
            return com.canhub.cropper.c.y(bitmap, i13, i15, jVar);
        }
        return null;
    }

    public void i(int i11, int i12, j jVar) {
        if (this.F != null) {
            t(i11, i12, jVar, null, null, 0);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    public void m(a.C0205a c0205a) {
        this.f10887g1 = null;
        s();
        e eVar = this.F;
        if (eVar != null) {
            eVar.a(this, new b(this.f10889i, this.G, c0205a.f10954a, c0205a.f10955b, c0205a.f10956c, getCropPoints(), getCropRect(), getWholeImageRect(), getRotatedDegrees(), c0205a.f10957d));
        }
    }

    public void n(b.a aVar) {
        this.f10881b1 = null;
        s();
        if (aVar.f10967e == null) {
            int i11 = aVar.f10966d;
            this.f10890j = i11;
            q(aVar.f10964b, 0, aVar.f10963a, aVar.f10965c, i11);
        }
        i iVar = this.E;
        if (iVar != null) {
            iVar.c(this, aVar.f10963a, aVar.f10967e);
        }
    }

    public void o(int i11) {
        int i12;
        if (this.f10889i != null) {
            if (i11 < 0) {
                i12 = (i11 % 360) + 360;
            } else {
                i12 = i11 % 360;
            }
            boolean z11 = !this.f10880b.m() && ((i12 > 45 && i12 < 135) || (i12 > 215 && i12 < 305));
            RectF rectF = com.canhub.cropper.c.f10970c;
            rectF.set(this.f10880b.getCropWindowRect());
            float height = (z11 ? rectF.height() : rectF.width()) / 2.0f;
            float width = (z11 ? rectF.width() : rectF.height()) / 2.0f;
            if (z11) {
                boolean z12 = this.f10892l;
                this.f10892l = this.f10893m;
                this.f10893m = z12;
            }
            this.f10882c.invert(this.f10883d);
            float[] fArr = com.canhub.cropper.c.f10971d;
            fArr[0] = rectF.centerX();
            fArr[1] = rectF.centerY();
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 1.0f;
            fArr[5] = 0.0f;
            this.f10883d.mapPoints(fArr);
            this.f10891k = (this.f10891k + i12) % 360;
            d(getWidth(), getHeight(), true, false);
            Matrix matrix = this.f10882c;
            float[] fArr2 = com.canhub.cropper.c.f10972e;
            matrix.mapPoints(fArr2, fArr);
            float sqrt = (float) (this.K / Math.sqrt(Math.pow(fArr2[4] - fArr2[2], 2.0d) + Math.pow(fArr2[5] - fArr2[3], 2.0d)));
            this.K = sqrt;
            this.K = Math.max(sqrt, 1.0f);
            d(getWidth(), getHeight(), true, false);
            this.f10882c.mapPoints(fArr2, fArr);
            double sqrt2 = Math.sqrt(Math.pow(fArr2[4] - fArr2[2], 2.0d) + Math.pow(fArr2[5] - fArr2[3], 2.0d));
            float f11 = (float) (height * sqrt2);
            float f12 = (float) (width * sqrt2);
            rectF.set(fArr2[0] - f11, fArr2[1] - f12, fArr2[0] + f11, fArr2[1] + f12);
            this.f10880b.r();
            this.f10880b.setCropWindowRect(rectF);
            d(getWidth(), getHeight(), true, false);
            k(false, false);
            this.f10880b.i();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (this.f10894n > 0 && this.f10895o > 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.width = this.f10894n;
            layoutParams.height = this.f10895o;
            setLayoutParams(layoutParams);
            if (this.f10889i != null) {
                float f11 = i13 - i11;
                float f12 = i14 - i12;
                d(f11, f12, true, false);
                if (this.P != null) {
                    int i15 = this.Q;
                    if (i15 != this.f10890j) {
                        this.f10891k = i15;
                        d(f11, f12, true, false);
                    }
                    this.f10882c.mapRect(this.P);
                    this.f10880b.setCropWindowRect(this.P);
                    k(false, false);
                    this.f10880b.i();
                    this.P = null;
                    return;
                } else if (this.R) {
                    this.R = false;
                    k(false, false);
                    return;
                } else {
                    return;
                }
            }
            u(true);
            return;
        }
        u(true);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        int width;
        int i13;
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        Bitmap bitmap = this.f10889i;
        if (bitmap != null) {
            if (size2 == 0) {
                size2 = bitmap.getHeight();
            }
            double width2 = size < this.f10889i.getWidth() ? size / this.f10889i.getWidth() : Double.POSITIVE_INFINITY;
            double height = size2 < this.f10889i.getHeight() ? size2 / this.f10889i.getHeight() : Double.POSITIVE_INFINITY;
            if (width2 == Double.POSITIVE_INFINITY && height == Double.POSITIVE_INFINITY) {
                width = this.f10889i.getWidth();
                i13 = this.f10889i.getHeight();
            } else if (width2 <= height) {
                i13 = (int) (this.f10889i.getHeight() * width2);
                width = size;
            } else {
                width = (int) (this.f10889i.getWidth() * height);
                i13 = size2;
            }
            int j11 = j(mode, size, width);
            int j12 = j(mode2, size2, i13);
            this.f10894n = j11;
            this.f10895o = j12;
            setMeasuredDimension(j11, j12);
            return;
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (this.f10881b1 == null && this.G == null && this.f10889i == null && this.f10896p == 0) {
                Uri uri = (Uri) bundle.getParcelable("LOADED_IMAGE_URI");
                if (uri != null) {
                    String string = bundle.getString("LOADED_IMAGE_STATE_BITMAP_KEY");
                    if (string != null) {
                        Pair<String, WeakReference<Bitmap>> pair = com.canhub.cropper.c.f10974g;
                        Bitmap bitmap = (pair == null || !((String) pair.first).equals(string)) ? null : (Bitmap) ((WeakReference) com.canhub.cropper.c.f10974g.second).get();
                        com.canhub.cropper.c.f10974g = null;
                        if (bitmap != null && !bitmap.isRecycled()) {
                            q(bitmap, 0, uri, bundle.getInt("LOADED_SAMPLE_SIZE"), 0);
                        }
                    }
                    if (this.G == null) {
                        setImageUriAsync(uri);
                    }
                } else {
                    int i11 = bundle.getInt("LOADED_IMAGE_RESOURCE");
                    if (i11 > 0) {
                        setImageResource(i11);
                    } else {
                        Uri uri2 = (Uri) bundle.getParcelable("LOADING_IMAGE_URI");
                        if (uri2 != null) {
                            setImageUriAsync(uri2);
                        }
                    }
                }
                int i12 = bundle.getInt("DEGREES_ROTATED");
                this.Q = i12;
                this.f10891k = i12;
                Rect rect = (Rect) bundle.getParcelable("INITIAL_CROP_RECT");
                if (rect != null && (rect.width() > 0 || rect.height() > 0)) {
                    this.f10880b.setInitialCropWindowRect(rect);
                }
                RectF rectF = (RectF) bundle.getParcelable("CROP_WINDOW_RECT");
                if (rectF != null && (rectF.width() > BitmapDescriptorFactory.HUE_RED || rectF.height() > BitmapDescriptorFactory.HUE_RED)) {
                    this.P = rectF;
                }
                this.f10880b.setCropShape(c.valueOf(bundle.getString("CROP_SHAPE")));
                this.f10901y = bundle.getBoolean("CROP_AUTO_ZOOM_ENABLED");
                this.f10902z = bundle.getInt("CROP_MAX_ZOOM");
                this.f10892l = bundle.getBoolean("CROP_FLIP_HORIZONTALLY");
                this.f10893m = bundle.getBoolean("CROP_FLIP_VERTICALLY");
            }
            super.onRestoreInstanceState(bundle.getParcelable("instanceState"));
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        com.canhub.cropper.b bVar;
        if (this.G == null && this.f10889i == null && this.f10896p < 1) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        Uri uri = this.G;
        if (this.f10898t && uri == null && this.f10896p < 1) {
            uri = com.canhub.cropper.c.D(getContext(), this.f10889i, this.T);
            this.T = uri;
        }
        if (uri != null && this.f10889i != null) {
            String uuid = UUID.randomUUID().toString();
            com.canhub.cropper.c.f10974g = new Pair<>(uuid, new WeakReference(this.f10889i));
            bundle.putString("LOADED_IMAGE_STATE_BITMAP_KEY", uuid);
        }
        WeakReference<com.canhub.cropper.b> weakReference = this.f10881b1;
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            bundle.putParcelable("LOADING_IMAGE_URI", bVar.b());
        }
        bundle.putParcelable("instanceState", super.onSaveInstanceState());
        bundle.putParcelable("LOADED_IMAGE_URI", uri);
        bundle.putInt("LOADED_IMAGE_RESOURCE", this.f10896p);
        bundle.putInt("LOADED_SAMPLE_SIZE", this.H);
        bundle.putInt("DEGREES_ROTATED", this.f10891k);
        bundle.putParcelable("INITIAL_CROP_RECT", this.f10880b.getInitialCropWindowRect());
        RectF rectF = com.canhub.cropper.c.f10970c;
        rectF.set(this.f10880b.getCropWindowRect());
        this.f10882c.invert(this.f10883d);
        this.f10883d.mapRect(rectF);
        bundle.putParcelable("CROP_WINDOW_RECT", rectF);
        bundle.putString("CROP_SHAPE", this.f10880b.getCropShape().name());
        bundle.putBoolean("CROP_AUTO_ZOOM_ENABLED", this.f10901y);
        bundle.putInt("CROP_MAX_ZOOM", this.f10902z);
        bundle.putBoolean("CROP_FLIP_HORIZONTALLY", this.f10892l);
        bundle.putBoolean("CROP_FLIP_VERTICALLY", this.f10893m);
        return bundle;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        this.R = i13 > 0 && i14 > 0;
    }

    public void p(Uri uri, Bitmap.CompressFormat compressFormat, int i11, int i12, int i13, j jVar) {
        if (this.F != null) {
            t(i12, i13, jVar, uri, compressFormat, i11);
            return;
        }
        throw new IllegalArgumentException("mOnCropImageCompleteListener is not set");
    }

    public void setAutoZoomEnabled(boolean z11) {
        if (this.f10901y != z11) {
            this.f10901y = z11;
            k(false, false);
            this.f10880b.invalidate();
        }
    }

    public void setCropRect(Rect rect) {
        this.f10880b.setInitialCropWindowRect(rect);
    }

    public void setCropShape(c cVar) {
        this.f10880b.setCropShape(cVar);
    }

    public void setFixedAspectRatio(boolean z11) {
        this.f10880b.setFixedAspectRatio(z11);
    }

    public void setFlippedHorizontally(boolean z11) {
        if (this.f10892l != z11) {
            this.f10892l = z11;
            d(getWidth(), getHeight(), true, false);
        }
    }

    public void setFlippedVertically(boolean z11) {
        if (this.f10893m != z11) {
            this.f10893m = z11;
            d(getWidth(), getHeight(), true, false);
        }
    }

    public void setGuidelines(d dVar) {
        this.f10880b.setGuidelines(dVar);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f10880b.setInitialCropWindowRect(null);
        q(bitmap, 0, null, 1, 0);
    }

    public void setImageResource(int i11) {
        if (i11 != 0) {
            this.f10880b.setInitialCropWindowRect(null);
            q(BitmapFactory.decodeResource(getResources(), i11), i11, null, 1, 0);
        }
    }

    public void setImageUriAsync(Uri uri) {
        if (uri != null) {
            WeakReference<com.canhub.cropper.b> weakReference = this.f10881b1;
            com.canhub.cropper.b bVar = weakReference != null ? weakReference.get() : null;
            if (bVar != null) {
                bVar.cancel(true);
            }
            e();
            this.P = null;
            this.Q = 0;
            this.f10880b.setInitialCropWindowRect(null);
            WeakReference<com.canhub.cropper.b> weakReference2 = new WeakReference<>(new com.canhub.cropper.b(this, uri));
            this.f10881b1 = weakReference2;
            weakReference2.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            s();
        }
    }

    public void setMaxZoom(int i11) {
        if (this.f10902z == i11 || i11 <= 0) {
            return;
        }
        this.f10902z = i11;
        k(false, false);
        this.f10880b.invalidate();
    }

    public void setMultiTouchEnabled(boolean z11) {
        if (this.f10880b.u(z11)) {
            k(false, false);
            this.f10880b.invalidate();
        }
    }

    public void setOnCropImageCompleteListener(e eVar) {
        this.F = eVar;
    }

    public void setOnCropWindowChangedListener(h hVar) {
        this.C = hVar;
    }

    public void setOnSetCropOverlayMovedListener(f fVar) {
        this.B = fVar;
    }

    public void setOnSetCropOverlayReleasedListener(g gVar) {
        this.A = gVar;
    }

    public void setOnSetImageUriCompleteListener(i iVar) {
        this.E = iVar;
    }

    public void setRotatedDegrees(int i11) {
        int i12 = this.f10891k;
        if (i12 != i11) {
            o(i11 - i12);
        }
    }

    public void setSaveBitmapToInstanceState(boolean z11) {
        this.f10898t = z11;
    }

    public void setScaleType(k kVar) {
        if (kVar != this.f10897q) {
            this.f10897q = kVar;
            this.K = 1.0f;
            this.O = BitmapDescriptorFactory.HUE_RED;
            this.L = BitmapDescriptorFactory.HUE_RED;
            this.f10880b.r();
            requestLayout();
        }
    }

    public void setShowCropOverlay(boolean z11) {
        if (this.f10899w != z11) {
            this.f10899w = z11;
            r();
        }
    }

    public void setShowProgressBar(boolean z11) {
        if (this.f10900x != z11) {
            this.f10900x = z11;
            s();
        }
    }

    public void setSnapRadius(float f11) {
        if (f11 >= BitmapDescriptorFactory.HUE_RED) {
            this.f10880b.setSnapRadius(f11);
        }
    }

    public void t(int i11, int i12, j jVar, Uri uri, Bitmap.CompressFormat compressFormat, int i13) {
        CropImageView cropImageView;
        Bitmap bitmap = this.f10889i;
        if (bitmap != null) {
            this.f10879a.clearAnimation();
            WeakReference<com.canhub.cropper.a> weakReference = this.f10887g1;
            com.canhub.cropper.a aVar = weakReference != null ? weakReference.get() : null;
            if (aVar != null) {
                aVar.cancel(true);
            }
            j jVar2 = j.NONE;
            int i14 = jVar != jVar2 ? i11 : 0;
            int i15 = jVar != jVar2 ? i12 : 0;
            int width = bitmap.getWidth() * this.H;
            int height = bitmap.getHeight();
            int i16 = this.H;
            int i17 = height * i16;
            if (this.G != null && (i16 > 1 || jVar == j.SAMPLING)) {
                this.f10887g1 = new WeakReference<>(new com.canhub.cropper.a(this, this.G, getCropPoints(), this.f10891k, width, i17, this.f10880b.m(), this.f10880b.getAspectRatioX(), this.f10880b.getAspectRatioY(), i14, i15, this.f10892l, this.f10893m, jVar, uri, compressFormat, i13));
                cropImageView = this;
            } else {
                cropImageView = this;
                cropImageView.f10887g1 = new WeakReference<>(new com.canhub.cropper.a(this, bitmap, getCropPoints(), this.f10891k, this.f10880b.m(), this.f10880b.getAspectRatioX(), this.f10880b.getAspectRatioY(), i14, i15, this.f10892l, this.f10893m, jVar, uri, compressFormat, i13));
            }
            cropImageView.f10887g1.get().executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            s();
        }
    }
}