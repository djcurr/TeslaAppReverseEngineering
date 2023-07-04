package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ezvcard.property.Kind;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import m3.c;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class i extends androidx.vectordrawable.graphics.drawable.h {

    /* renamed from: j  reason: collision with root package name */
    static final PorterDuff.Mode f6295j = PorterDuff.Mode.SRC_IN;

    /* renamed from: b  reason: collision with root package name */
    private h f6296b;

    /* renamed from: c  reason: collision with root package name */
    private PorterDuffColorFilter f6297c;

    /* renamed from: d  reason: collision with root package name */
    private ColorFilter f6298d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f6299e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6300f;

    /* renamed from: g  reason: collision with root package name */
    private final float[] f6301g;

    /* renamed from: h  reason: collision with root package name */
    private final Matrix f6302h;

    /* renamed from: i  reason: collision with root package name */
    private final Rect f6303i;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f6330b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f6329a = m3.c.d(string2);
            }
            this.f6331c = l3.i.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (l3.i.j(xmlPullParser, "pathData")) {
                TypedArray k11 = l3.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6270d);
                f(k11, xmlPullParser);
                k11.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        int f6350a;

        /* renamed from: b  reason: collision with root package name */
        g f6351b;

        /* renamed from: c  reason: collision with root package name */
        ColorStateList f6352c;

        /* renamed from: d  reason: collision with root package name */
        PorterDuff.Mode f6353d;

        /* renamed from: e  reason: collision with root package name */
        boolean f6354e;

        /* renamed from: f  reason: collision with root package name */
        Bitmap f6355f;

        /* renamed from: g  reason: collision with root package name */
        ColorStateList f6356g;

        /* renamed from: h  reason: collision with root package name */
        PorterDuff.Mode f6357h;

        /* renamed from: i  reason: collision with root package name */
        int f6358i;

        /* renamed from: j  reason: collision with root package name */
        boolean f6359j;

        /* renamed from: k  reason: collision with root package name */
        boolean f6360k;

        /* renamed from: l  reason: collision with root package name */
        Paint f6361l;

        public h(h hVar) {
            this.f6352c = null;
            this.f6353d = i.f6295j;
            if (hVar != null) {
                this.f6350a = hVar.f6350a;
                g gVar = new g(hVar.f6351b);
                this.f6351b = gVar;
                if (hVar.f6351b.f6338e != null) {
                    gVar.f6338e = new Paint(hVar.f6351b.f6338e);
                }
                if (hVar.f6351b.f6337d != null) {
                    this.f6351b.f6337d = new Paint(hVar.f6351b.f6337d);
                }
                this.f6352c = hVar.f6352c;
                this.f6353d = hVar.f6353d;
                this.f6354e = hVar.f6354e;
            }
        }

        public boolean a(int i11, int i12) {
            return i11 == this.f6355f.getWidth() && i12 == this.f6355f.getHeight();
        }

        public boolean b() {
            return !this.f6360k && this.f6356g == this.f6352c && this.f6357h == this.f6353d && this.f6359j == this.f6354e && this.f6358i == this.f6351b.getRootAlpha();
        }

        public void c(int i11, int i12) {
            if (this.f6355f == null || !a(i11, i12)) {
                this.f6355f = Bitmap.createBitmap(i11, i12, Bitmap.Config.ARGB_8888);
                this.f6360k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f6355f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (f() || colorFilter != null) {
                if (this.f6361l == null) {
                    Paint paint = new Paint();
                    this.f6361l = paint;
                    paint.setFilterBitmap(true);
                }
                this.f6361l.setAlpha(this.f6351b.getRootAlpha());
                this.f6361l.setColorFilter(colorFilter);
                return this.f6361l;
            }
            return null;
        }

        public boolean f() {
            return this.f6351b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f6351b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6350a;
        }

        public boolean h(int[] iArr) {
            boolean g11 = this.f6351b.g(iArr);
            this.f6360k |= g11;
            return g11;
        }

        public void i() {
            this.f6356g = this.f6352c;
            this.f6357h = this.f6353d;
            this.f6358i = this.f6351b.getRootAlpha();
            this.f6359j = this.f6354e;
            this.f6360k = false;
        }

        public void j(int i11, int i12) {
            this.f6355f.eraseColor(0);
            this.f6351b.b(new Canvas(this.f6355f), i11, i12, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new i(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new i(this);
        }

        public h() {
            this.f6352c = null;
            this.f6353d = i.f6295j;
            this.f6351b = new g();
        }
    }

    i() {
        this.f6300f = true;
        this.f6301g = new float[9];
        this.f6302h = new Matrix();
        this.f6303i = new Rect();
        this.f6296b = new h();
    }

    static int a(int i11, float f11) {
        return (i11 & 16777215) | (((int) (Color.alpha(i11) * f11)) << 24);
    }

    public static i b(Resources resources, int i11, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            i iVar = new i();
            iVar.f6294a = l3.h.f(resources, i11, theme);
            new C0110i(iVar.f6294a.getConstantState());
            return iVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i11);
            AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
            while (true) {
                next = xml.next();
                if (next == 2 || next == 1) {
                    break;
                }
            }
            if (next == 2) {
                return c(resources, xml, asAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e11) {
            Log.e("VectorDrawableCompat", "parser error", e11);
            return null;
        } catch (XmlPullParserException e12) {
            Log.e("VectorDrawableCompat", "parser error", e12);
            return null;
        }
    }

    public static i c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        i iVar = new i();
        iVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return iVar;
    }

    private void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        h hVar = this.f6296b;
        g gVar = hVar.f6351b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f6341h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z11 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6317b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f6349p.put(cVar.getPathName(), cVar);
                    }
                    z11 = false;
                    hVar.f6350a = cVar.f6332d | hVar.f6350a;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6317b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f6349p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f6350a = bVar.f6332d | hVar.f6350a;
                } else if (Kind.GROUP.equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f6317b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f6349p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f6350a = dVar2.f6326k | hVar.f6350a;
                }
            } else if (eventType == 3 && Kind.GROUP.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z11) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean f() {
        return Build.VERSION.SDK_INT >= 17 && isAutoMirrored() && n3.a.f(this) == 1;
    }

    private static PorterDuff.Mode g(int i11, PorterDuff.Mode mode) {
        if (i11 != 3) {
            if (i11 != 5) {
                if (i11 != 9) {
                    switch (i11) {
                        case 14:
                            return PorterDuff.Mode.MULTIPLY;
                        case 15:
                            return PorterDuff.Mode.SCREEN;
                        case 16:
                            return PorterDuff.Mode.ADD;
                        default:
                            return mode;
                    }
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    private void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        h hVar = this.f6296b;
        g gVar = hVar.f6351b;
        hVar.f6353d = g(l3.i.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList c11 = l3.i.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (c11 != null) {
            hVar.f6352c = c11;
        }
        hVar.f6354e = l3.i.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f6354e);
        gVar.f6344k = l3.i.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f6344k);
        float f11 = l3.i.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f6345l);
        gVar.f6345l = f11;
        if (gVar.f6344k <= BitmapDescriptorFactory.HUE_RED) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        } else if (f11 > BitmapDescriptorFactory.HUE_RED) {
            gVar.f6342i = typedArray.getDimension(3, gVar.f6342i);
            float dimension = typedArray.getDimension(2, gVar.f6343j);
            gVar.f6343j = dimension;
            if (gVar.f6342i <= BitmapDescriptorFactory.HUE_RED) {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
            } else if (dimension > BitmapDescriptorFactory.HUE_RED) {
                gVar.setAlpha(l3.i.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
                String string = typedArray.getString(0);
                if (string != null) {
                    gVar.f6347n = string;
                    gVar.f6349p.put(string, gVar);
                }
            } else {
                throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
            }
        } else {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object d(String str) {
        return this.f6296b.f6351b.f6349p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f6303i);
        if (this.f6303i.width() <= 0 || this.f6303i.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f6298d;
        if (colorFilter == null) {
            colorFilter = this.f6297c;
        }
        canvas.getMatrix(this.f6302h);
        this.f6302h.getValues(this.f6301g);
        float abs = Math.abs(this.f6301g[0]);
        float abs2 = Math.abs(this.f6301g[4]);
        float abs3 = Math.abs(this.f6301g[1]);
        float abs4 = Math.abs(this.f6301g[3]);
        if (abs3 != BitmapDescriptorFactory.HUE_RED || abs4 != BitmapDescriptorFactory.HUE_RED) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int min = Math.min(2048, (int) (this.f6303i.width() * abs));
        int min2 = Math.min(2048, (int) (this.f6303i.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        Rect rect = this.f6303i;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f6303i.width(), BitmapDescriptorFactory.HUE_RED);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f6303i.offsetTo(0, 0);
        this.f6296b.c(min, min2);
        if (!this.f6300f) {
            this.f6296b.j(min, min2);
        } else if (!this.f6296b.b()) {
            this.f6296b.j(min, min2);
            this.f6296b.i();
        }
        this.f6296b.d(canvas, colorFilter, this.f6303i);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return n3.a.d(drawable);
        }
        return this.f6296b.f6351b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f6296b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return n3.a.e(drawable);
        }
        return this.f6298d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f6294a != null && Build.VERSION.SDK_INT >= 24) {
            return new C0110i(this.f6294a.getConstantState());
        }
        this.f6296b.f6350a = getChangingConfigurations();
        return this.f6296b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f6296b.f6351b.f6343j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f6296b.f6351b.f6342i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(boolean z11) {
        this.f6300f = z11;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return n3.a.h(drawable);
        }
        return this.f6296b.f6354e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return super.isStateful() || ((hVar = this.f6296b) != null && (hVar.g() || ((colorStateList = this.f6296b.f6352c) != null && colorStateList.isStateful())));
    }

    PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f6299e && super.mutate() == this) {
            this.f6296b = new h(this.f6296b);
            this.f6299e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z11 = false;
        h hVar = this.f6296b;
        ColorStateList colorStateList = hVar.f6352c;
        if (colorStateList != null && (mode = hVar.f6353d) != null) {
            this.f6297c = j(this.f6297c, colorStateList, mode);
            invalidateSelf();
            z11 = true;
        }
        if (hVar.g() && hVar.h(iArr)) {
            invalidateSelf();
            return true;
        }
        return z11;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j11) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j11);
        } else {
            super.scheduleSelf(runnable, j11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.setAlpha(i11);
        } else if (this.f6296b.f6351b.getRootAlpha() != i11) {
            this.f6296b.f6351b.setRootAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z11) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.j(drawable, z11);
        } else {
            this.f6296b.f6354e = z11;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
            return;
        }
        this.f6298d = colorFilter;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTint(int i11) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.n(drawable, i11);
        } else {
            setTintList(ColorStateList.valueOf(i11));
        }
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f6296b;
        if (hVar.f6352c != colorStateList) {
            hVar.f6352c = colorStateList;
            this.f6297c = j(this.f6297c, colorStateList, hVar.f6353d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, n3.b
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.p(drawable, mode);
            return;
        }
        h hVar = this.f6296b;
        if (hVar.f6353d != mode) {
            hVar.f6353d = mode;
            this.f6297c = j(this.f6297c, hVar.f6352c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            return drawable.setVisible(z11, z12);
        }
        return super.setVisible(z11, z12);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.i$i  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0110i extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        private final Drawable.ConstantState f6362a;

        public C0110i(Drawable.ConstantState constantState) {
            this.f6362a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f6362a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f6362a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            i iVar = new i();
            iVar.f6294a = (VectorDrawable) this.f6362a.newDrawable();
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            i iVar = new i();
            iVar.f6294a = (VectorDrawable) this.f6362a.newDrawable(resources);
            return iVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            i iVar = new i();
            iVar.f6294a = (VectorDrawable) this.f6362a.newDrawable(resources, theme);
            return iVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class f extends e {

        /* renamed from: a  reason: collision with root package name */
        protected c.b[] f6329a;

        /* renamed from: b  reason: collision with root package name */
        String f6330b;

        /* renamed from: c  reason: collision with root package name */
        int f6331c;

        /* renamed from: d  reason: collision with root package name */
        int f6332d;

        public f() {
            super();
            this.f6329a = null;
            this.f6331c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            c.b[] bVarArr = this.f6329a;
            if (bVarArr != null) {
                c.b.e(bVarArr, path);
            }
        }

        public c.b[] getPathData() {
            return this.f6329a;
        }

        public String getPathName() {
            return this.f6330b;
        }

        public void setPathData(c.b[] bVarArr) {
            if (!m3.c.b(this.f6329a, bVarArr)) {
                this.f6329a = m3.c.f(bVarArr);
            } else {
                m3.c.j(this.f6329a, bVarArr);
            }
        }

        public f(f fVar) {
            super();
            this.f6329a = null;
            this.f6331c = 0;
            this.f6330b = fVar.f6330b;
            this.f6332d = fVar.f6332d;
            this.f6329a = m3.c.f(fVar.f6329a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f6294a;
        if (drawable != null) {
            n3.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f6296b;
        hVar.f6351b = new g();
        TypedArray k11 = l3.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6267a);
        i(k11, xmlPullParser, theme);
        k11.recycle();
        hVar.f6350a = getChangingConfigurations();
        hVar.f6360k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f6297c = j(this.f6297c, hVar.f6352c, hVar.f6353d);
    }

    i(h hVar) {
        this.f6300f = true;
        this.f6301g = new float[9];
        this.f6302h = new Matrix();
        this.f6303i = new Rect();
        this.f6296b = hVar;
        this.f6297c = j(this.f6297c, hVar.f6352c, hVar.f6353d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class c extends f {

        /* renamed from: e  reason: collision with root package name */
        private int[] f6304e;

        /* renamed from: f  reason: collision with root package name */
        l3.d f6305f;

        /* renamed from: g  reason: collision with root package name */
        float f6306g;

        /* renamed from: h  reason: collision with root package name */
        l3.d f6307h;

        /* renamed from: i  reason: collision with root package name */
        float f6308i;

        /* renamed from: j  reason: collision with root package name */
        float f6309j;

        /* renamed from: k  reason: collision with root package name */
        float f6310k;

        /* renamed from: l  reason: collision with root package name */
        float f6311l;

        /* renamed from: m  reason: collision with root package name */
        float f6312m;

        /* renamed from: n  reason: collision with root package name */
        Paint.Cap f6313n;

        /* renamed from: o  reason: collision with root package name */
        Paint.Join f6314o;

        /* renamed from: p  reason: collision with root package name */
        float f6315p;

        c() {
            this.f6306g = BitmapDescriptorFactory.HUE_RED;
            this.f6308i = 1.0f;
            this.f6309j = 1.0f;
            this.f6310k = BitmapDescriptorFactory.HUE_RED;
            this.f6311l = 1.0f;
            this.f6312m = BitmapDescriptorFactory.HUE_RED;
            this.f6313n = Paint.Cap.BUTT;
            this.f6314o = Paint.Join.MITER;
            this.f6315p = 4.0f;
        }

        private Paint.Cap e(int i11, Paint.Cap cap) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return i11 != 2 ? cap : Paint.Cap.SQUARE;
                }
                return Paint.Cap.ROUND;
            }
            return Paint.Cap.BUTT;
        }

        private Paint.Join f(int i11, Paint.Join join) {
            if (i11 != 0) {
                if (i11 != 1) {
                    return i11 != 2 ? join : Paint.Join.BEVEL;
                }
                return Paint.Join.ROUND;
            }
            return Paint.Join.MITER;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f6304e = null;
            if (l3.i.j(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f6330b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f6329a = m3.c.d(string2);
                }
                this.f6307h = l3.i.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f6309j = l3.i.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f6309j);
                this.f6313n = e(l3.i.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f6313n);
                this.f6314o = f(l3.i.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f6314o);
                this.f6315p = l3.i.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f6315p);
                this.f6305f = l3.i.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f6308i = l3.i.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f6308i);
                this.f6306g = l3.i.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f6306g);
                this.f6311l = l3.i.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f6311l);
                this.f6312m = l3.i.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f6312m);
                this.f6310k = l3.i.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f6310k);
                this.f6331c = l3.i.g(typedArray, xmlPullParser, "fillType", 13, this.f6331c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            return this.f6307h.i() || this.f6305f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            return this.f6305f.j(iArr) | this.f6307h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k11 = l3.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6269c);
            h(k11, xmlPullParser, theme);
            k11.recycle();
        }

        float getFillAlpha() {
            return this.f6309j;
        }

        int getFillColor() {
            return this.f6307h.e();
        }

        float getStrokeAlpha() {
            return this.f6308i;
        }

        int getStrokeColor() {
            return this.f6305f.e();
        }

        float getStrokeWidth() {
            return this.f6306g;
        }

        float getTrimPathEnd() {
            return this.f6311l;
        }

        float getTrimPathOffset() {
            return this.f6312m;
        }

        float getTrimPathStart() {
            return this.f6310k;
        }

        void setFillAlpha(float f11) {
            this.f6309j = f11;
        }

        void setFillColor(int i11) {
            this.f6307h.k(i11);
        }

        void setStrokeAlpha(float f11) {
            this.f6308i = f11;
        }

        void setStrokeColor(int i11) {
            this.f6305f.k(i11);
        }

        void setStrokeWidth(float f11) {
            this.f6306g = f11;
        }

        void setTrimPathEnd(float f11) {
            this.f6311l = f11;
        }

        void setTrimPathOffset(float f11) {
            this.f6312m = f11;
        }

        void setTrimPathStart(float f11) {
            this.f6310k = f11;
        }

        c(c cVar) {
            super(cVar);
            this.f6306g = BitmapDescriptorFactory.HUE_RED;
            this.f6308i = 1.0f;
            this.f6309j = 1.0f;
            this.f6310k = BitmapDescriptorFactory.HUE_RED;
            this.f6311l = 1.0f;
            this.f6312m = BitmapDescriptorFactory.HUE_RED;
            this.f6313n = Paint.Cap.BUTT;
            this.f6314o = Paint.Join.MITER;
            this.f6315p = 4.0f;
            this.f6304e = cVar.f6304e;
            this.f6305f = cVar.f6305f;
            this.f6306g = cVar.f6306g;
            this.f6308i = cVar.f6308i;
            this.f6307h = cVar.f6307h;
            this.f6331c = cVar.f6331c;
            this.f6309j = cVar.f6309j;
            this.f6310k = cVar.f6310k;
            this.f6311l = cVar.f6311l;
            this.f6312m = cVar.f6312m;
            this.f6313n = cVar.f6313n;
            this.f6314o = cVar.f6314o;
            this.f6315p = cVar.f6315p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class g {

        /* renamed from: q  reason: collision with root package name */
        private static final Matrix f6333q = new Matrix();

        /* renamed from: a  reason: collision with root package name */
        private final Path f6334a;

        /* renamed from: b  reason: collision with root package name */
        private final Path f6335b;

        /* renamed from: c  reason: collision with root package name */
        private final Matrix f6336c;

        /* renamed from: d  reason: collision with root package name */
        Paint f6337d;

        /* renamed from: e  reason: collision with root package name */
        Paint f6338e;

        /* renamed from: f  reason: collision with root package name */
        private PathMeasure f6339f;

        /* renamed from: g  reason: collision with root package name */
        private int f6340g;

        /* renamed from: h  reason: collision with root package name */
        final d f6341h;

        /* renamed from: i  reason: collision with root package name */
        float f6342i;

        /* renamed from: j  reason: collision with root package name */
        float f6343j;

        /* renamed from: k  reason: collision with root package name */
        float f6344k;

        /* renamed from: l  reason: collision with root package name */
        float f6345l;

        /* renamed from: m  reason: collision with root package name */
        int f6346m;

        /* renamed from: n  reason: collision with root package name */
        String f6347n;

        /* renamed from: o  reason: collision with root package name */
        Boolean f6348o;

        /* renamed from: p  reason: collision with root package name */
        final androidx.collection.a<String, Object> f6349p;

        public g() {
            this.f6336c = new Matrix();
            this.f6342i = BitmapDescriptorFactory.HUE_RED;
            this.f6343j = BitmapDescriptorFactory.HUE_RED;
            this.f6344k = BitmapDescriptorFactory.HUE_RED;
            this.f6345l = BitmapDescriptorFactory.HUE_RED;
            this.f6346m = 255;
            this.f6347n = null;
            this.f6348o = null;
            this.f6349p = new androidx.collection.a<>();
            this.f6341h = new d();
            this.f6334a = new Path();
            this.f6335b = new Path();
        }

        private static float a(float f11, float f12, float f13, float f14) {
            return (f11 * f14) - (f12 * f13);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            dVar.f6316a.set(matrix);
            dVar.f6316a.preConcat(dVar.f6325j);
            canvas.save();
            for (int i13 = 0; i13 < dVar.f6317b.size(); i13++) {
                e eVar = dVar.f6317b.get(i13);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f6316a, canvas, i11, i12, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i11, i12, colorFilter);
                }
            }
            canvas.restore();
        }

        private void d(d dVar, f fVar, Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            float f11 = i11 / this.f6344k;
            float f12 = i12 / this.f6345l;
            float min = Math.min(f11, f12);
            Matrix matrix = dVar.f6316a;
            this.f6336c.set(matrix);
            this.f6336c.postScale(f11, f12);
            float e11 = e(matrix);
            if (e11 == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            fVar.d(this.f6334a);
            Path path = this.f6334a;
            this.f6335b.reset();
            if (fVar.c()) {
                this.f6335b.setFillType(fVar.f6331c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f6335b.addPath(path, this.f6336c);
                canvas.clipPath(this.f6335b);
                return;
            }
            c cVar = (c) fVar;
            float f13 = cVar.f6310k;
            if (f13 != BitmapDescriptorFactory.HUE_RED || cVar.f6311l != 1.0f) {
                float f14 = cVar.f6312m;
                float f15 = (f13 + f14) % 1.0f;
                float f16 = (cVar.f6311l + f14) % 1.0f;
                if (this.f6339f == null) {
                    this.f6339f = new PathMeasure();
                }
                this.f6339f.setPath(this.f6334a, false);
                float length = this.f6339f.getLength();
                float f17 = f15 * length;
                float f18 = f16 * length;
                path.reset();
                if (f17 > f18) {
                    this.f6339f.getSegment(f17, length, path, true);
                    this.f6339f.getSegment(BitmapDescriptorFactory.HUE_RED, f18, path, true);
                } else {
                    this.f6339f.getSegment(f17, f18, path, true);
                }
                path.rLineTo(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            }
            this.f6335b.addPath(path, this.f6336c);
            if (cVar.f6307h.l()) {
                l3.d dVar2 = cVar.f6307h;
                if (this.f6338e == null) {
                    Paint paint = new Paint(1);
                    this.f6338e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f6338e;
                if (dVar2.h()) {
                    Shader f19 = dVar2.f();
                    f19.setLocalMatrix(this.f6336c);
                    paint2.setShader(f19);
                    paint2.setAlpha(Math.round(cVar.f6309j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(i.a(dVar2.e(), cVar.f6309j));
                }
                paint2.setColorFilter(colorFilter);
                this.f6335b.setFillType(cVar.f6331c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f6335b, paint2);
            }
            if (cVar.f6305f.l()) {
                l3.d dVar3 = cVar.f6305f;
                if (this.f6337d == null) {
                    Paint paint3 = new Paint(1);
                    this.f6337d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f6337d;
                Paint.Join join = cVar.f6314o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f6313n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f6315p);
                if (dVar3.h()) {
                    Shader f21 = dVar3.f();
                    f21.setLocalMatrix(this.f6336c);
                    paint4.setShader(f21);
                    paint4.setAlpha(Math.round(cVar.f6308i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(i.a(dVar3.e(), cVar.f6308i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f6306g * min * e11);
                canvas.drawPath(this.f6335b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, BitmapDescriptorFactory.HUE_RED};
            matrix.mapVectors(fArr);
            float a11 = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float max = Math.max((float) Math.hypot(fArr[0], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
            return max > BitmapDescriptorFactory.HUE_RED ? Math.abs(a11) / max : BitmapDescriptorFactory.HUE_RED;
        }

        public void b(Canvas canvas, int i11, int i12, ColorFilter colorFilter) {
            c(this.f6341h, f6333q, canvas, i11, i12, colorFilter);
        }

        public boolean f() {
            if (this.f6348o == null) {
                this.f6348o = Boolean.valueOf(this.f6341h.a());
            }
            return this.f6348o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f6341h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f6346m;
        }

        public void setAlpha(float f11) {
            setRootAlpha((int) (f11 * 255.0f));
        }

        public void setRootAlpha(int i11) {
            this.f6346m = i11;
        }

        public g(g gVar) {
            this.f6336c = new Matrix();
            this.f6342i = BitmapDescriptorFactory.HUE_RED;
            this.f6343j = BitmapDescriptorFactory.HUE_RED;
            this.f6344k = BitmapDescriptorFactory.HUE_RED;
            this.f6345l = BitmapDescriptorFactory.HUE_RED;
            this.f6346m = 255;
            this.f6347n = null;
            this.f6348o = null;
            androidx.collection.a<String, Object> aVar = new androidx.collection.a<>();
            this.f6349p = aVar;
            this.f6341h = new d(gVar.f6341h, aVar);
            this.f6334a = new Path(gVar.f6334a);
            this.f6335b = new Path(gVar.f6335b);
            this.f6342i = gVar.f6342i;
            this.f6343j = gVar.f6343j;
            this.f6344k = gVar.f6344k;
            this.f6345l = gVar.f6345l;
            this.f6340g = gVar.f6340g;
            this.f6346m = gVar.f6346m;
            this.f6347n = gVar.f6347n;
            String str = gVar.f6347n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f6348o = gVar.f6348o;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends e {

        /* renamed from: a  reason: collision with root package name */
        final Matrix f6316a;

        /* renamed from: b  reason: collision with root package name */
        final ArrayList<e> f6317b;

        /* renamed from: c  reason: collision with root package name */
        float f6318c;

        /* renamed from: d  reason: collision with root package name */
        private float f6319d;

        /* renamed from: e  reason: collision with root package name */
        private float f6320e;

        /* renamed from: f  reason: collision with root package name */
        private float f6321f;

        /* renamed from: g  reason: collision with root package name */
        private float f6322g;

        /* renamed from: h  reason: collision with root package name */
        private float f6323h;

        /* renamed from: i  reason: collision with root package name */
        private float f6324i;

        /* renamed from: j  reason: collision with root package name */
        final Matrix f6325j;

        /* renamed from: k  reason: collision with root package name */
        int f6326k;

        /* renamed from: l  reason: collision with root package name */
        private int[] f6327l;

        /* renamed from: m  reason: collision with root package name */
        private String f6328m;

        public d(d dVar, androidx.collection.a<String, Object> aVar) {
            super();
            f bVar;
            this.f6316a = new Matrix();
            this.f6317b = new ArrayList<>();
            this.f6318c = BitmapDescriptorFactory.HUE_RED;
            this.f6319d = BitmapDescriptorFactory.HUE_RED;
            this.f6320e = BitmapDescriptorFactory.HUE_RED;
            this.f6321f = 1.0f;
            this.f6322g = 1.0f;
            this.f6323h = BitmapDescriptorFactory.HUE_RED;
            this.f6324i = BitmapDescriptorFactory.HUE_RED;
            Matrix matrix = new Matrix();
            this.f6325j = matrix;
            this.f6328m = null;
            this.f6318c = dVar.f6318c;
            this.f6319d = dVar.f6319d;
            this.f6320e = dVar.f6320e;
            this.f6321f = dVar.f6321f;
            this.f6322g = dVar.f6322g;
            this.f6323h = dVar.f6323h;
            this.f6324i = dVar.f6324i;
            this.f6327l = dVar.f6327l;
            String str = dVar.f6328m;
            this.f6328m = str;
            this.f6326k = dVar.f6326k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f6325j);
            ArrayList<e> arrayList = dVar.f6317b;
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                e eVar = arrayList.get(i11);
                if (eVar instanceof d) {
                    this.f6317b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else if (eVar instanceof b) {
                        bVar = new b((b) eVar);
                    } else {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    this.f6317b.add(bVar);
                    String str2 = bVar.f6330b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f6325j.reset();
            this.f6325j.postTranslate(-this.f6319d, -this.f6320e);
            this.f6325j.postScale(this.f6321f, this.f6322g);
            this.f6325j.postRotate(this.f6318c, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.f6325j.postTranslate(this.f6323h + this.f6319d, this.f6324i + this.f6320e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f6327l = null;
            this.f6318c = l3.i.f(typedArray, xmlPullParser, "rotation", 5, this.f6318c);
            this.f6319d = typedArray.getFloat(1, this.f6319d);
            this.f6320e = typedArray.getFloat(2, this.f6320e);
            this.f6321f = l3.i.f(typedArray, xmlPullParser, "scaleX", 3, this.f6321f);
            this.f6322g = l3.i.f(typedArray, xmlPullParser, "scaleY", 4, this.f6322g);
            this.f6323h = l3.i.f(typedArray, xmlPullParser, "translateX", 6, this.f6323h);
            this.f6324i = l3.i.f(typedArray, xmlPullParser, "translateY", 7, this.f6324i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f6328m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean a() {
            for (int i11 = 0; i11 < this.f6317b.size(); i11++) {
                if (this.f6317b.get(i11).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.i.e
        public boolean b(int[] iArr) {
            boolean z11 = false;
            for (int i11 = 0; i11 < this.f6317b.size(); i11++) {
                z11 |= this.f6317b.get(i11).b(iArr);
            }
            return z11;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray k11 = l3.i.k(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f6268b);
            e(k11, xmlPullParser);
            k11.recycle();
        }

        public String getGroupName() {
            return this.f6328m;
        }

        public Matrix getLocalMatrix() {
            return this.f6325j;
        }

        public float getPivotX() {
            return this.f6319d;
        }

        public float getPivotY() {
            return this.f6320e;
        }

        public float getRotation() {
            return this.f6318c;
        }

        public float getScaleX() {
            return this.f6321f;
        }

        public float getScaleY() {
            return this.f6322g;
        }

        public float getTranslateX() {
            return this.f6323h;
        }

        public float getTranslateY() {
            return this.f6324i;
        }

        public void setPivotX(float f11) {
            if (f11 != this.f6319d) {
                this.f6319d = f11;
                d();
            }
        }

        public void setPivotY(float f11) {
            if (f11 != this.f6320e) {
                this.f6320e = f11;
                d();
            }
        }

        public void setRotation(float f11) {
            if (f11 != this.f6318c) {
                this.f6318c = f11;
                d();
            }
        }

        public void setScaleX(float f11) {
            if (f11 != this.f6321f) {
                this.f6321f = f11;
                d();
            }
        }

        public void setScaleY(float f11) {
            if (f11 != this.f6322g) {
                this.f6322g = f11;
                d();
            }
        }

        public void setTranslateX(float f11) {
            if (f11 != this.f6323h) {
                this.f6323h = f11;
                d();
            }
        }

        public void setTranslateY(float f11) {
            if (f11 != this.f6324i) {
                this.f6324i = f11;
                d();
            }
        }

        public d() {
            super();
            this.f6316a = new Matrix();
            this.f6317b = new ArrayList<>();
            this.f6318c = BitmapDescriptorFactory.HUE_RED;
            this.f6319d = BitmapDescriptorFactory.HUE_RED;
            this.f6320e = BitmapDescriptorFactory.HUE_RED;
            this.f6321f = 1.0f;
            this.f6322g = 1.0f;
            this.f6323h = BitmapDescriptorFactory.HUE_RED;
            this.f6324i = BitmapDescriptorFactory.HUE_RED;
            this.f6325j = new Matrix();
            this.f6328m = null;
        }
    }
}