package l3;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a */
    private static final ThreadLocal<TypedValue> f36542a = new ThreadLocal<>();

    /* renamed from: b */
    private static final WeakHashMap<c, SparseArray<b>> f36543b = new WeakHashMap<>(0);

    /* renamed from: c */
    private static final Object f36544c = new Object();

    /* loaded from: classes.dex */
    public static class a {
        static ColorStateList a(Resources resources, int i11, Resources.Theme theme) {
            return resources.getColorStateList(i11, theme);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final ColorStateList f36545a;

        /* renamed from: b */
        final Configuration f36546b;

        b(ColorStateList colorStateList, Configuration configuration) {
            this.f36545a = colorStateList;
            this.f36546b = configuration;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        final Resources f36547a;

        /* renamed from: b */
        final Resources.Theme f36548b;

        c(Resources resources, Resources.Theme theme) {
            this.f36547a = resources;
            this.f36548b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || c.class != obj.getClass()) {
                return false;
            }
            c cVar = (c) obj;
            return this.f36547a.equals(cVar.f36547a) && v3.c.a(this.f36548b, cVar.f36548b);
        }

        public int hashCode() {
            return v3.c.b(this.f36547a, this.f36548b);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class d {

        /* loaded from: classes.dex */
        public class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Typeface f36549a;

            a(Typeface typeface) {
                d.this = r1;
                this.f36549a = typeface;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.e(this.f36549a);
            }
        }

        /* loaded from: classes.dex */
        public class b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f36551a;

            b(int i11) {
                d.this = r1;
                this.f36551a = i11;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.d(this.f36551a);
            }
        }

        public static Handler c(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void a(int i11, Handler handler) {
            c(handler).post(new b(i11));
        }

        public final void b(Typeface typeface, Handler handler) {
            c(handler).post(new a(typeface));
        }

        public abstract void d(int i11);

        public abstract void e(Typeface typeface);
    }

    /* loaded from: classes.dex */
    public static final class e {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class a {

            /* renamed from: a */
            private static final Object f36553a = new Object();

            /* renamed from: b */
            private static Method f36554b;

            /* renamed from: c */
            private static boolean f36555c;

            static void a(Resources.Theme theme) {
                synchronized (f36553a) {
                    if (!f36555c) {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", new Class[0]);
                            f36554b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e11) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e11);
                        }
                        f36555c = true;
                    }
                    Method method = f36554b;
                    if (method != null) {
                        try {
                            method.invoke(theme, new Object[0]);
                        } catch (IllegalAccessException | InvocationTargetException e12) {
                            Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e12);
                            f36554b = null;
                        }
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static class b {
            static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 29) {
                b.a(theme);
            } else if (i11 >= 23) {
                a.a(theme);
            }
        }
    }

    private static void a(c cVar, int i11, ColorStateList colorStateList) {
        synchronized (f36544c) {
            WeakHashMap<c, SparseArray<b>> weakHashMap = f36543b;
            SparseArray<b> sparseArray = weakHashMap.get(cVar);
            if (sparseArray == null) {
                sparseArray = new SparseArray<>();
                weakHashMap.put(cVar, sparseArray);
            }
            sparseArray.append(i11, new b(colorStateList, cVar.f36547a.getConfiguration()));
        }
    }

    private static ColorStateList b(c cVar, int i11) {
        b bVar;
        synchronized (f36544c) {
            SparseArray<b> sparseArray = f36543b.get(cVar);
            if (sparseArray != null && sparseArray.size() > 0 && (bVar = sparseArray.get(i11)) != null) {
                if (bVar.f36546b.equals(cVar.f36547a.getConfiguration())) {
                    return bVar.f36545a;
                }
                sparseArray.remove(i11);
            }
            return null;
        }
    }

    public static Typeface c(Context context, int i11) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i11, new TypedValue(), 0, null, null, false, true);
    }

    public static int d(Resources resources, int i11, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 23) {
            return resources.getColor(i11, theme);
        }
        return resources.getColor(i11);
    }

    public static ColorStateList e(Resources resources, int i11, Resources.Theme theme) {
        c cVar = new c(resources, theme);
        ColorStateList b11 = b(cVar, i11);
        if (b11 != null) {
            return b11;
        }
        ColorStateList k11 = k(resources, i11, theme);
        if (k11 != null) {
            a(cVar, i11, k11);
            return k11;
        } else if (Build.VERSION.SDK_INT >= 23) {
            return a.a(resources, i11, theme);
        } else {
            return resources.getColorStateList(i11);
        }
    }

    public static Drawable f(Resources resources, int i11, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(i11, theme);
        }
        return resources.getDrawable(i11);
    }

    public static Typeface g(Context context, int i11) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i11, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface h(Context context, int i11, TypedValue typedValue, int i12, d dVar) {
        if (context.isRestricted()) {
            return null;
        }
        return m(context, i11, typedValue, i12, dVar, null, true, false);
    }

    public static void i(Context context, int i11, d dVar, Handler handler) {
        v3.h.f(dVar);
        if (context.isRestricted()) {
            dVar.a(-4, handler);
        } else {
            m(context, i11, new TypedValue(), 0, dVar, handler, false, false);
        }
    }

    private static TypedValue j() {
        ThreadLocal<TypedValue> threadLocal = f36542a;
        TypedValue typedValue = threadLocal.get();
        if (typedValue == null) {
            TypedValue typedValue2 = new TypedValue();
            threadLocal.set(typedValue2);
            return typedValue2;
        }
        return typedValue;
    }

    private static ColorStateList k(Resources resources, int i11, Resources.Theme theme) {
        if (l(resources, i11)) {
            return null;
        }
        try {
            return l3.c.a(resources, resources.getXml(i11), theme);
        } catch (Exception e11) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e11);
            return null;
        }
    }

    private static boolean l(Resources resources, int i11) {
        TypedValue j11 = j();
        resources.getValue(i11, j11, true);
        int i12 = j11.type;
        return i12 >= 28 && i12 <= 31;
    }

    private static Typeface m(Context context, int i11, TypedValue typedValue, int i12, d dVar, Handler handler, boolean z11, boolean z12) {
        Resources resources = context.getResources();
        resources.getValue(i11, typedValue, true);
        Typeface n11 = n(context, resources, typedValue, i11, i12, dVar, handler, z11, z12);
        if (n11 == null && dVar == null && !z12) {
            throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i11) + " could not be retrieved.");
        }
        return n11;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.graphics.Typeface n(android.content.Context r15, android.content.res.Resources r16, android.util.TypedValue r17, int r18, int r19, l3.h.d r20, android.os.Handler r21, boolean r22, boolean r23) {
        /*
            r0 = r16
            r1 = r17
            r4 = r18
            r5 = r19
            r9 = r20
            r10 = r21
            java.lang.String r11 = "ResourcesCompat"
            java.lang.CharSequence r2 = r1.string
            if (r2 == 0) goto Laa
            java.lang.String r12 = r2.toString()
            java.lang.String r1 = "res/"
            boolean r1 = r12.startsWith(r1)
            r13 = -3
            r14 = 0
            if (r1 != 0) goto L26
            if (r9 == 0) goto L25
            r9.a(r13, r10)
        L25:
            return r14
        L26:
            android.graphics.Typeface r1 = m3.d.f(r0, r4, r5)
            if (r1 == 0) goto L32
            if (r9 == 0) goto L31
            r9.b(r1, r10)
        L31:
            return r1
        L32:
            if (r23 == 0) goto L35
            return r14
        L35:
            java.lang.String r1 = r12.toLowerCase()     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            java.lang.String r2 = ".xml"
            boolean r1 = r1.endsWith(r2)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r1 == 0) goto L68
            android.content.res.XmlResourceParser r1 = r0.getXml(r4)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            l3.e$a r2 = l3.e.b(r1, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r2 != 0) goto L56
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r11, r0)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L55
            r9.a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L55:
            return r14
        L56:
            r1 = r15
            r3 = r16
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r0 = m3.d.c(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            return r0
        L68:
            r1 = r15
            android.graphics.Typeface r0 = m3.d.d(r15, r0, r4, r12, r5)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            if (r9 == 0) goto L78
            if (r0 == 0) goto L75
            r9.b(r0, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
            goto L78
        L75:
            r9.a(r13, r10)     // Catch: java.io.IOException -> L79 org.xmlpull.v1.XmlPullParserException -> L8f
        L78:
            return r0
        L79:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
            goto La4
        L8f:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
            r1.append(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r11, r1, r0)
        La4:
            if (r9 == 0) goto La9
            r9.a(r13, r10)
        La9:
            return r14
        Laa:
            android.content.res.Resources$NotFoundException r2 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Resource \""
            r3.append(r5)
            java.lang.String r0 = r0.getResourceName(r4)
            r3.append(r0)
            java.lang.String r0 = "\" ("
            r3.append(r0)
            java.lang.String r0 = java.lang.Integer.toHexString(r18)
            r3.append(r0)
            java.lang.String r0 = ") is not a Font: "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: l3.h.n(android.content.Context, android.content.res.Resources, android.util.TypedValue, int, int, l3.h$d, android.os.Handler, boolean, boolean):android.graphics.Typeface");
    }
}