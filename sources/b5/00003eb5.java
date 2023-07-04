package com.ijzerenhein.sharedelement;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import expo.modules.interfaces.permissions.PermissionsResponse;
import je.q;
import ke.d;

/* loaded from: classes2.dex */
class d extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private c f17751a = null;

    /* renamed from: b  reason: collision with root package name */
    private j f17752b = null;

    /* renamed from: c  reason: collision with root package name */
    private b f17753c = b.NONE;

    /* renamed from: d  reason: collision with root package name */
    private int f17754d = 255;

    /* renamed from: e  reason: collision with root package name */
    private Path f17755e = null;

    /* renamed from: f  reason: collision with root package name */
    private com.facebook.react.views.view.e f17756f = null;

    /* loaded from: classes2.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f17757a;

        static {
            int[] iArr = new int[b.values().length];
            f17757a = iArr;
            try {
                iArr[b.REACTIMAGEVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17757a[b.IMAGEVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17757a[b.PLAIN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17757a[b.GENERIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum b {
        NONE(PermissionsResponse.SCOPE_NONE),
        REACTIMAGEVIEW("image"),
        IMAGEVIEW("image"),
        PLAIN("view"),
        GENERIC("generic");
        
        private final String value;

        b(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    private void a(Canvas canvas) {
        this.f17751a.f17749a.draw(canvas);
    }

    private void b(Canvas canvas) {
        j jVar = this.f17752b;
        Drawable drawable = ((ImageView) this.f17751a.f17749a).getDrawable();
        Rect rect = new Rect(drawable.getBounds());
        RectF rectF = this.f17751a.f17750b;
        int i11 = (int) rectF.right;
        int i12 = (int) rectF.bottom;
        drawable.setBounds(0, 0, i11, i12);
        Matrix matrix = new Matrix();
        jVar.f17797e.a(matrix, getBounds(), i11, i12, 0.5f, 0.5f);
        int save = canvas.save();
        canvas.concat(matrix);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
        drawable.setBounds(rect);
    }

    private void c(Canvas canvas) {
        j jVar = this.f17752b;
        com.facebook.react.views.view.e eVar = this.f17756f;
        if (eVar == null) {
            eVar = new com.facebook.react.views.view.e(this.f17751a.f17749a.getContext());
            this.f17756f = eVar;
        }
        eVar.setBounds(getBounds());
        eVar.x(jVar.f17798f);
        int i11 = jVar.f17805m;
        float f11 = 16777215 & i11;
        float f12 = i11 >>> 24;
        eVar.v(jVar.f17806n);
        for (int i12 = 0; i12 < 4; i12++) {
            eVar.t(i12, f11, f12);
            eVar.w(i12, jVar.f17804l);
        }
        eVar.z(jVar.f17800h, 0);
        eVar.z(jVar.f17801i, 1);
        eVar.z(jVar.f17803k, 2);
        eVar.z(jVar.f17802j, 3);
        eVar.draw(canvas);
    }

    private void d(Canvas canvas) {
        j jVar = this.f17752b;
        ke.a hierarchy = ((com.facebook.react.views.image.h) this.f17751a.f17749a).getHierarchy();
        Drawable d11 = hierarchy.d();
        Rect rect = new Rect(d11.getBounds());
        q.c n11 = hierarchy.n();
        ke.d q11 = hierarchy.q();
        int o11 = hierarchy.o();
        d11.setBounds(getBounds());
        hierarchy.v(jVar.f17797e);
        ke.d dVar = new ke.d();
        dVar.m(jVar.f17805m);
        dVar.n(jVar.f17804l);
        dVar.r(d.a.BITMAP_ONLY);
        dVar.o(jVar.f17800h, jVar.f17801i, jVar.f17803k, jVar.f17802j);
        hierarchy.D(dVar);
        hierarchy.w(null);
        hierarchy.y(0);
        d11.draw(canvas);
        hierarchy.y(o11);
        hierarchy.w(null);
        hierarchy.D(q11);
        hierarchy.v(n11);
        d11.setBounds(rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b e(View view, j jVar) {
        if (view == null) {
            return b.NONE;
        }
        if (view instanceof com.facebook.react.views.image.h) {
            return b.REACTIMAGEVIEW;
        }
        if (view instanceof ImageView) {
            return b.IMAGEVIEW;
        }
        if ((view instanceof com.facebook.react.views.view.g) && ((com.facebook.react.views.view.g) view).getChildCount() == 0) {
            if (jVar.j()) {
                return b.PLAIN;
            }
            return b.NONE;
        }
        return b.GENERIC;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i11 = a.f17757a[this.f17753c.ordinal()];
        if (i11 == 1) {
            d(canvas);
        } else if (i11 == 2) {
            b(canvas);
        } else if (i11 == 3) {
            c(canvas);
        } else if (i11 != 4) {
        } else {
            a(canvas);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0044, code lost:
        if ((r4.f17752b.a(r6) & (com.ijzerenhein.sharedelement.j.B | com.ijzerenhein.sharedelement.j.f17786t)) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
        if ((r4.f17752b.a(r6) & ((com.ijzerenhein.sharedelement.j.B | com.ijzerenhein.sharedelement.j.f17786t) | com.ijzerenhein.sharedelement.j.C)) != 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0059, code lost:
        r5 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.ijzerenhein.sharedelement.d.b f(com.ijzerenhein.sharedelement.c r5, com.ijzerenhein.sharedelement.j r6, float r7) {
        /*
            r4 = this;
            com.ijzerenhein.sharedelement.c r7 = r4.f17751a
            r0 = 0
            r1 = 1
            if (r7 == r5) goto La
            r4.f17751a = r5
            r5 = r1
            goto Lb
        La:
            r5 = r0
        Lb:
            com.ijzerenhein.sharedelement.c r7 = r4.f17751a
            if (r7 == 0) goto L16
            android.view.View r7 = r7.f17749a
            com.ijzerenhein.sharedelement.d$b r7 = e(r7, r6)
            goto L18
        L16:
            com.ijzerenhein.sharedelement.d$b r7 = com.ijzerenhein.sharedelement.d.b.NONE
        L18:
            com.ijzerenhein.sharedelement.d$b r2 = r4.f17753c
            if (r2 == r7) goto L1f
            r4.f17753c = r7
            r5 = r1
        L1f:
            com.ijzerenhein.sharedelement.j r2 = r4.f17752b
            if (r2 == 0) goto L5a
            if (r6 == 0) goto L5a
            if (r5 != 0) goto L5a
            int[] r2 = com.ijzerenhein.sharedelement.d.a.f17757a
            int r3 = r7.ordinal()
            r2 = r2[r3]
            if (r2 == r1) goto L47
            r3 = 2
            if (r2 == r3) goto L47
            r3 = 3
            if (r2 == r3) goto L38
            goto L5a
        L38:
            com.ijzerenhein.sharedelement.j r5 = r4.f17752b
            int r5 = r5.a(r6)
            int r2 = com.ijzerenhein.sharedelement.j.B
            int r3 = com.ijzerenhein.sharedelement.j.f17786t
            r2 = r2 | r3
            r5 = r5 & r2
            if (r5 == 0) goto L59
            goto L58
        L47:
            com.ijzerenhein.sharedelement.j r5 = r4.f17752b
            int r5 = r5.a(r6)
            int r2 = com.ijzerenhein.sharedelement.j.B
            int r3 = com.ijzerenhein.sharedelement.j.f17786t
            r2 = r2 | r3
            int r3 = com.ijzerenhein.sharedelement.j.C
            r2 = r2 | r3
            r5 = r5 & r2
            if (r5 == 0) goto L59
        L58:
            r0 = r1
        L59:
            r5 = r0
        L5a:
            r4.f17752b = r6
            if (r5 == 0) goto L61
            r4.invalidateSelf()
        L61:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ijzerenhein.sharedelement.d.f(com.ijzerenhein.sharedelement.c, com.ijzerenhein.sharedelement.j, float):com.ijzerenhein.sharedelement.d$b");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f17754d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 21) {
            super.getOutline(outline);
            return;
        }
        j jVar = this.f17752b;
        if (jVar == null) {
            outline.setRect(getBounds());
        } else if (jVar.f17800h == BitmapDescriptorFactory.HUE_RED && jVar.f17801i == BitmapDescriptorFactory.HUE_RED && jVar.f17802j == BitmapDescriptorFactory.HUE_RED && jVar.f17803k == BitmapDescriptorFactory.HUE_RED) {
            outline.setRect(getBounds());
        } else {
            Path path = this.f17755e;
            if (path == null) {
                this.f17755e = new Path();
            } else {
                path.reset();
            }
            float f11 = this.f17752b.f17804l / 2.0f;
            Path path2 = this.f17755e;
            RectF rectF = new RectF(getBounds());
            j jVar2 = this.f17752b;
            float f12 = jVar2.f17800h;
            float f13 = jVar2.f17801i;
            float f14 = jVar2.f17803k;
            float f15 = jVar2.f17802j;
            path2.addRoundRect(rectF, new float[]{f12 + f11, f12 + f11, f13 + f11, f13 + f11, f14 + f11, f14 + f11, f15 + f11, f15 + f11}, Path.Direction.CW);
            outline.setConvexPath(this.f17755e);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.f17754d) {
            this.f17754d = i11;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}