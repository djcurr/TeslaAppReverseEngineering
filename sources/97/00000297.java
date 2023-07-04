package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: i */
    private static k0 f1839i;

    /* renamed from: a */
    private WeakHashMap<Context, androidx.collection.h<ColorStateList>> f1841a;

    /* renamed from: b */
    private androidx.collection.g<String, e> f1842b;

    /* renamed from: c */
    private androidx.collection.h<String> f1843c;

    /* renamed from: d */
    private final WeakHashMap<Context, androidx.collection.d<WeakReference<Drawable.ConstantState>>> f1844d = new WeakHashMap<>(0);

    /* renamed from: e */
    private TypedValue f1845e;

    /* renamed from: f */
    private boolean f1846f;

    /* renamed from: g */
    private f f1847g;

    /* renamed from: h */
    private static final PorterDuff.Mode f1838h = PorterDuff.Mode.SRC_IN;

    /* renamed from: j */
    private static final c f1840j = new c(6);

    /* loaded from: classes.dex */
    public static class a implements e {
        a() {
        }

        @Override // androidx.appcompat.widget.k0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return i.a.m(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e11) {
                Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e11);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b implements e {
        b() {
        }

        @Override // androidx.appcompat.widget.k0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.c.a(context, context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e11) {
                Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e11);
                return null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends androidx.collection.e<Integer, PorterDuffColorFilter> {
        public c(int i11) {
            super(i11);
        }

        private static int a(int i11, PorterDuff.Mode mode) {
            return ((i11 + 31) * 31) + mode.hashCode();
        }

        PorterDuffColorFilter b(int i11, PorterDuff.Mode mode) {
            return get(Integer.valueOf(a(i11, mode)));
        }

        PorterDuffColorFilter c(int i11, PorterDuff.Mode mode, PorterDuffColorFilter porterDuffColorFilter) {
            return put(Integer.valueOf(a(i11, mode)), porterDuffColorFilter);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements e {
        d() {
        }

        @Override // androidx.appcompat.widget.k0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            String classAttribute = attributeSet.getClassAttribute();
            if (classAttribute != null) {
                try {
                    Drawable drawable = (Drawable) d.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    if (Build.VERSION.SDK_INT >= 21) {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet, theme);
                    } else {
                        drawable.inflate(context.getResources(), xmlPullParser, attributeSet);
                    }
                    return drawable;
                } catch (Exception e11) {
                    Log.e("DrawableDelegate", "Exception while inflating <drawable>", e11);
                }
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    public interface e {
        Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme);
    }

    /* loaded from: classes.dex */
    public interface f {
        Drawable a(k0 k0Var, Context context, int i11);

        ColorStateList b(Context context, int i11);

        boolean c(Context context, int i11, Drawable drawable);

        PorterDuff.Mode d(int i11);

        boolean e(Context context, int i11, Drawable drawable);
    }

    /* loaded from: classes.dex */
    public static class g implements e {
        g() {
        }

        @Override // androidx.appcompat.widget.k0.e
        public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
            try {
                return androidx.vectordrawable.graphics.drawable.i.c(context.getResources(), xmlPullParser, attributeSet, theme);
            } catch (Exception e11) {
                Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e11);
                return null;
            }
        }
    }

    private void a(String str, e eVar) {
        if (this.f1842b == null) {
            this.f1842b = new androidx.collection.g<>();
        }
        this.f1842b.put(str, eVar);
    }

    private synchronized boolean b(Context context, long j11, Drawable drawable) {
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            androidx.collection.d<WeakReference<Drawable.ConstantState>> dVar = this.f1844d.get(context);
            if (dVar == null) {
                dVar = new androidx.collection.d<>();
                this.f1844d.put(context, dVar);
            }
            dVar.j(j11, new WeakReference<>(constantState));
            return true;
        }
        return false;
    }

    private void c(Context context, int i11, ColorStateList colorStateList) {
        if (this.f1841a == null) {
            this.f1841a = new WeakHashMap<>();
        }
        androidx.collection.h<ColorStateList> hVar = this.f1841a.get(context);
        if (hVar == null) {
            hVar = new androidx.collection.h<>();
            this.f1841a.put(context, hVar);
        }
        hVar.a(i11, colorStateList);
    }

    private void d(Context context) {
        if (this.f1846f) {
            return;
        }
        this.f1846f = true;
        Drawable j11 = j(context, j.a.f32991a);
        if (j11 == null || !q(j11)) {
            this.f1846f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
    }

    private static long e(TypedValue typedValue) {
        return (typedValue.assetCookie << 32) | typedValue.data;
    }

    private Drawable f(Context context, int i11) {
        if (this.f1845e == null) {
            this.f1845e = new TypedValue();
        }
        TypedValue typedValue = this.f1845e;
        context.getResources().getValue(i11, typedValue, true);
        long e11 = e(typedValue);
        Drawable i12 = i(context, e11);
        if (i12 != null) {
            return i12;
        }
        f fVar = this.f1847g;
        Drawable a11 = fVar == null ? null : fVar.a(this, context, i11);
        if (a11 != null) {
            a11.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, e11, a11);
        }
        return a11;
    }

    private static PorterDuffColorFilter g(ColorStateList colorStateList, PorterDuff.Mode mode, int[] iArr) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return l(colorStateList.getColorForState(iArr, 0), mode);
    }

    public static synchronized k0 h() {
        k0 k0Var;
        synchronized (k0.class) {
            if (f1839i == null) {
                k0 k0Var2 = new k0();
                f1839i = k0Var2;
                p(k0Var2);
            }
            k0Var = f1839i;
        }
        return k0Var;
    }

    private synchronized Drawable i(Context context, long j11) {
        androidx.collection.d<WeakReference<Drawable.ConstantState>> dVar = this.f1844d.get(context);
        if (dVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> f11 = dVar.f(j11);
        if (f11 != null) {
            Drawable.ConstantState constantState = f11.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            dVar.k(j11);
        }
        return null;
    }

    public static synchronized PorterDuffColorFilter l(int i11, PorterDuff.Mode mode) {
        PorterDuffColorFilter b11;
        synchronized (k0.class) {
            c cVar = f1840j;
            b11 = cVar.b(i11, mode);
            if (b11 == null) {
                b11 = new PorterDuffColorFilter(i11, mode);
                cVar.c(i11, mode, b11);
            }
        }
        return b11;
    }

    private ColorStateList n(Context context, int i11) {
        androidx.collection.h<ColorStateList> hVar;
        WeakHashMap<Context, androidx.collection.h<ColorStateList>> weakHashMap = this.f1841a;
        if (weakHashMap == null || (hVar = weakHashMap.get(context)) == null) {
            return null;
        }
        return hVar.g(i11);
    }

    private static void p(k0 k0Var) {
        if (Build.VERSION.SDK_INT < 24) {
            k0Var.a("vector", new g());
            k0Var.a("animated-vector", new b());
            k0Var.a("animated-selector", new a());
            k0Var.a("drawable", new d());
        }
    }

    private static boolean q(Drawable drawable) {
        return (drawable instanceof androidx.vectordrawable.graphics.drawable.i) || "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName());
    }

    private Drawable r(Context context, int i11) {
        int next;
        androidx.collection.g<String, e> gVar = this.f1842b;
        if (gVar == null || gVar.isEmpty()) {
            return null;
        }
        androidx.collection.h<String> hVar = this.f1843c;
        if (hVar != null) {
            String g11 = hVar.g(i11);
            if ("appcompat_skip_skip".equals(g11) || (g11 != null && this.f1842b.get(g11) == null)) {
                return null;
            }
        } else {
            this.f1843c = new androidx.collection.h<>();
        }
        if (this.f1845e == null) {
            this.f1845e = new TypedValue();
        }
        TypedValue typedValue = this.f1845e;
        Resources resources = context.getResources();
        resources.getValue(i11, typedValue, true);
        long e11 = e(typedValue);
        Drawable i12 = i(context, e11);
        if (i12 != null) {
            return i12;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
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
                    String name = xml.getName();
                    this.f1843c.a(i11, name);
                    e eVar = this.f1842b.get(name);
                    if (eVar != null) {
                        i12 = eVar.a(context, xml, asAttributeSet, context.getTheme());
                    }
                    if (i12 != null) {
                        i12.setChangingConfigurations(typedValue.changingConfigurations);
                        b(context, e11, i12);
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (Exception e12) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e12);
            }
        }
        if (i12 == null) {
            this.f1843c.a(i11, "appcompat_skip_skip");
        }
        return i12;
    }

    private Drawable v(Context context, int i11, boolean z11, Drawable drawable) {
        ColorStateList m11 = m(context, i11);
        if (m11 != null) {
            if (c0.a(drawable)) {
                drawable = drawable.mutate();
            }
            Drawable r11 = n3.a.r(drawable);
            n3.a.o(r11, m11);
            PorterDuff.Mode o11 = o(i11);
            if (o11 != null) {
                n3.a.p(r11, o11);
                return r11;
            }
            return r11;
        }
        f fVar = this.f1847g;
        if ((fVar == null || !fVar.e(context, i11, drawable)) && !x(context, i11, drawable) && z11) {
            return null;
        }
        return drawable;
    }

    public static void w(Drawable drawable, s0 s0Var, int[] iArr) {
        if (c0.a(drawable) && drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        boolean z11 = s0Var.f1925d;
        if (!z11 && !s0Var.f1924c) {
            drawable.clearColorFilter();
        } else {
            drawable.setColorFilter(g(z11 ? s0Var.f1922a : null, s0Var.f1924c ? s0Var.f1923b : f1838h, iArr));
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public synchronized Drawable j(Context context, int i11) {
        return k(context, i11, false);
    }

    public synchronized Drawable k(Context context, int i11, boolean z11) {
        Drawable r11;
        d(context);
        r11 = r(context, i11);
        if (r11 == null) {
            r11 = f(context, i11);
        }
        if (r11 == null) {
            r11 = androidx.core.content.b.getDrawable(context, i11);
        }
        if (r11 != null) {
            r11 = v(context, i11, z11, r11);
        }
        if (r11 != null) {
            c0.b(r11);
        }
        return r11;
    }

    public synchronized ColorStateList m(Context context, int i11) {
        ColorStateList n11;
        n11 = n(context, i11);
        if (n11 == null) {
            f fVar = this.f1847g;
            n11 = fVar == null ? null : fVar.b(context, i11);
            if (n11 != null) {
                c(context, i11, n11);
            }
        }
        return n11;
    }

    PorterDuff.Mode o(int i11) {
        f fVar = this.f1847g;
        if (fVar == null) {
            return null;
        }
        return fVar.d(i11);
    }

    public synchronized void s(Context context) {
        androidx.collection.d<WeakReference<Drawable.ConstantState>> dVar = this.f1844d.get(context);
        if (dVar != null) {
            dVar.b();
        }
    }

    public synchronized Drawable t(Context context, z0 z0Var, int i11) {
        Drawable r11 = r(context, i11);
        if (r11 == null) {
            r11 = z0Var.c(i11);
        }
        if (r11 != null) {
            return v(context, i11, false, r11);
        }
        return null;
    }

    public synchronized void u(f fVar) {
        this.f1847g = fVar;
    }

    public boolean x(Context context, int i11, Drawable drawable) {
        f fVar = this.f1847g;
        return fVar != null && fVar.c(context, i11, drawable);
    }
}