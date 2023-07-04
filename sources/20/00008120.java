package l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.u0;
import androidx.core.view.l;
import g.j;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import okhttp3.internal.http2.Settings;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class g extends MenuInflater {

    /* renamed from: e  reason: collision with root package name */
    static final Class<?>[] f35953e;

    /* renamed from: f  reason: collision with root package name */
    static final Class<?>[] f35954f;

    /* renamed from: a  reason: collision with root package name */
    final Object[] f35955a;

    /* renamed from: b  reason: collision with root package name */
    final Object[] f35956b;

    /* renamed from: c  reason: collision with root package name */
    Context f35957c;

    /* renamed from: d  reason: collision with root package name */
    private Object f35958d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class a implements MenuItem.OnMenuItemClickListener {

        /* renamed from: c  reason: collision with root package name */
        private static final Class<?>[] f35959c = {MenuItem.class};

        /* renamed from: a  reason: collision with root package name */
        private Object f35960a;

        /* renamed from: b  reason: collision with root package name */
        private Method f35961b;

        public a(Object obj, String str) {
            this.f35960a = obj;
            Class<?> cls = obj.getClass();
            try {
                this.f35961b = cls.getMethod(str, f35959c);
            } catch (Exception e11) {
                InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
                inflateException.initCause(e11);
                throw inflateException;
            }
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.f35961b.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.f35961b.invoke(this.f35960a, menuItem)).booleanValue();
                }
                this.f35961b.invoke(this.f35960a, menuItem);
                return true;
            } catch (Exception e11) {
                throw new RuntimeException(e11);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b {
        androidx.core.view.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;

        /* renamed from: a  reason: collision with root package name */
        private Menu f35962a;

        /* renamed from: b  reason: collision with root package name */
        private int f35963b;

        /* renamed from: c  reason: collision with root package name */
        private int f35964c;

        /* renamed from: d  reason: collision with root package name */
        private int f35965d;

        /* renamed from: e  reason: collision with root package name */
        private int f35966e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f35967f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f35968g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f35969h;

        /* renamed from: i  reason: collision with root package name */
        private int f35970i;

        /* renamed from: j  reason: collision with root package name */
        private int f35971j;

        /* renamed from: k  reason: collision with root package name */
        private CharSequence f35972k;

        /* renamed from: l  reason: collision with root package name */
        private CharSequence f35973l;

        /* renamed from: m  reason: collision with root package name */
        private int f35974m;

        /* renamed from: n  reason: collision with root package name */
        private char f35975n;

        /* renamed from: o  reason: collision with root package name */
        private int f35976o;

        /* renamed from: p  reason: collision with root package name */
        private char f35977p;

        /* renamed from: q  reason: collision with root package name */
        private int f35978q;

        /* renamed from: r  reason: collision with root package name */
        private int f35979r;

        /* renamed from: s  reason: collision with root package name */
        private boolean f35980s;

        /* renamed from: t  reason: collision with root package name */
        private boolean f35981t;

        /* renamed from: u  reason: collision with root package name */
        private boolean f35982u;

        /* renamed from: v  reason: collision with root package name */
        private int f35983v;

        /* renamed from: w  reason: collision with root package name */
        private int f35984w;

        /* renamed from: x  reason: collision with root package name */
        private String f35985x;

        /* renamed from: y  reason: collision with root package name */
        private String f35986y;

        /* renamed from: z  reason: collision with root package name */
        private String f35987z;

        public b(Menu menu) {
            this.f35962a = menu;
            h();
        }

        private char c(String str) {
            if (str == null) {
                return (char) 0;
            }
            return str.charAt(0);
        }

        private <T> T e(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, g.this.f35957c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e11) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e11);
                return null;
            }
        }

        private void i(MenuItem menuItem) {
            boolean z11 = false;
            menuItem.setChecked(this.f35980s).setVisible(this.f35981t).setEnabled(this.f35982u).setCheckable(this.f35979r >= 1).setTitleCondensed(this.f35973l).setIcon(this.f35974m);
            int i11 = this.f35983v;
            if (i11 >= 0) {
                menuItem.setShowAsAction(i11);
            }
            if (this.f35987z != null) {
                if (!g.this.f35957c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener(new a(g.this.b(), this.f35987z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.f35979r >= 2) {
                if (menuItem instanceof androidx.appcompat.view.menu.g) {
                    ((androidx.appcompat.view.menu.g) menuItem).t(true);
                } else if (menuItem instanceof m.c) {
                    ((m.c) menuItem).h(true);
                }
            }
            String str = this.f35985x;
            if (str != null) {
                menuItem.setActionView((View) e(str, g.f35953e, g.this.f35955a));
                z11 = true;
            }
            int i12 = this.f35984w;
            if (i12 > 0) {
                if (!z11) {
                    menuItem.setActionView(i12);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            androidx.core.view.b bVar = this.A;
            if (bVar != null) {
                l.a(menuItem, bVar);
            }
            l.c(menuItem, this.B);
            l.g(menuItem, this.C);
            l.b(menuItem, this.f35975n, this.f35976o);
            l.f(menuItem, this.f35977p, this.f35978q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                l.e(menuItem, mode);
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList != null) {
                l.d(menuItem, colorStateList);
            }
        }

        public void a() {
            this.f35969h = true;
            i(this.f35962a.add(this.f35963b, this.f35970i, this.f35971j, this.f35972k));
        }

        public SubMenu b() {
            this.f35969h = true;
            SubMenu addSubMenu = this.f35962a.addSubMenu(this.f35963b, this.f35970i, this.f35971j, this.f35972k);
            i(addSubMenu.getItem());
            return addSubMenu;
        }

        public boolean d() {
            return this.f35969h;
        }

        public void f(AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = g.this.f35957c.obtainStyledAttributes(attributeSet, j.f27196d1);
            this.f35963b = obtainStyledAttributes.getResourceId(j.f27206f1, 0);
            this.f35964c = obtainStyledAttributes.getInt(j.f27216h1, 0);
            this.f35965d = obtainStyledAttributes.getInt(j.f27221i1, 0);
            this.f35966e = obtainStyledAttributes.getInt(j.f27226j1, 0);
            this.f35967f = obtainStyledAttributes.getBoolean(j.f27211g1, true);
            this.f35968g = obtainStyledAttributes.getBoolean(j.f27201e1, true);
            obtainStyledAttributes.recycle();
        }

        public void g(AttributeSet attributeSet) {
            u0 u11 = u0.u(g.this.f35957c, attributeSet, j.f27231k1);
            this.f35970i = u11.n(j.f27246n1, 0);
            this.f35971j = (u11.k(j.f27261q1, this.f35964c) & (-65536)) | (u11.k(j.f27266r1, this.f35965d) & Settings.DEFAULT_INITIAL_WINDOW_SIZE);
            this.f35972k = u11.p(j.f27271s1);
            this.f35973l = u11.p(j.f27276t1);
            this.f35974m = u11.n(j.f27236l1, 0);
            this.f35975n = c(u11.o(j.f27281u1));
            this.f35976o = u11.k(j.B1, 4096);
            this.f35977p = c(u11.o(j.f27286v1));
            this.f35978q = u11.k(j.F1, 4096);
            int i11 = j.f27291w1;
            if (u11.s(i11)) {
                this.f35979r = u11.a(i11, false) ? 1 : 0;
            } else {
                this.f35979r = this.f35966e;
            }
            this.f35980s = u11.a(j.f27251o1, false);
            this.f35981t = u11.a(j.f27256p1, this.f35967f);
            this.f35982u = u11.a(j.f27241m1, this.f35968g);
            this.f35983v = u11.k(j.G1, -1);
            this.f35987z = u11.o(j.f27296x1);
            this.f35984w = u11.n(j.f27301y1, 0);
            this.f35985x = u11.o(j.A1);
            String o11 = u11.o(j.f27306z1);
            this.f35986y = o11;
            boolean z11 = o11 != null;
            if (z11 && this.f35984w == 0 && this.f35985x == null) {
                this.A = (androidx.core.view.b) e(o11, g.f35954f, g.this.f35956b);
            } else {
                if (z11) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = u11.p(j.C1);
            this.C = u11.p(j.H1);
            int i12 = j.E1;
            if (u11.s(i12)) {
                this.E = c0.e(u11.k(i12, -1), this.E);
            } else {
                this.E = null;
            }
            int i13 = j.D1;
            if (u11.s(i13)) {
                this.D = u11.c(i13);
            } else {
                this.D = null;
            }
            u11.w();
            this.f35969h = false;
        }

        public void h() {
            this.f35963b = 0;
            this.f35964c = 0;
            this.f35965d = 0;
            this.f35966e = 0;
            this.f35967f = true;
            this.f35968g = true;
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        f35953e = clsArr;
        f35954f = clsArr;
    }

    public g(Context context) {
        super(context);
        this.f35957c = context;
        Object[] objArr = {context};
        this.f35955a = objArr;
        this.f35956b = objArr;
    }

    private Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003b, code lost:
        r8 = null;
        r6 = false;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0040, code lost:
        if (r6 != false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r15 == 1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r15 == 2) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        if (r15 == 3) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
        if (r7 == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0059, code lost:
        if (r15.equals(r8) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005b, code lost:
        r8 = null;
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        if (r15.equals(ezvcard.property.Kind.GROUP) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
        r0.h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
        if (r15.equals("item") == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0072, code lost:
        if (r0.d() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        r15 = r0.A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        if (r15 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
        if (r15.a() == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007e, code lost:
        r0.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0082, code lost:
        r0.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x008a, code lost:
        if (r15.equals("menu") == false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x008e, code lost:
        if (r7 == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0091, code lost:
        r15 = r13.getName();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0099, code lost:
        if (r15.equals(ezvcard.property.Kind.GROUP) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009b, code lost:
        r0.f(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
        if (r15.equals("item") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
        r0.g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ad, code lost:
        if (r15.equals("menu") == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00af, code lost:
        c(r13, r14, r0.b());
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b7, code lost:
        r8 = r15;
        r7 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00b9, code lost:
        r15 = r13.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c5, code lost:
        throw new java.lang.RuntimeException("Unexpected end of document");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c6, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void c(org.xmlpull.v1.XmlPullParser r13, android.util.AttributeSet r14, android.view.Menu r15) {
        /*
            r12 = this;
            l.g$b r0 = new l.g$b
            r0.<init>(r15)
            int r15 = r13.getEventType()
        L9:
            r1 = 2
            java.lang.String r2 = "menu"
            r3 = 1
            if (r15 != r1) goto L35
            java.lang.String r15 = r13.getName()
            boolean r4 = r15.equals(r2)
            if (r4 == 0) goto L1e
            int r15 = r13.next()
            goto L3b
        L1e:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "Expecting menu, got "
            r14.append(r0)
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            r13.<init>(r14)
            throw r13
        L35:
            int r15 = r13.next()
            if (r15 != r3) goto L9
        L3b:
            r4 = 0
            r5 = 0
            r8 = r4
            r6 = r5
            r7 = r6
        L40:
            if (r6 != 0) goto Lc6
            if (r15 == r3) goto Lbe
            java.lang.String r9 = "item"
            java.lang.String r10 = "group"
            if (r15 == r1) goto L8e
            r11 = 3
            if (r15 == r11) goto L4f
            goto Lb9
        L4f:
            java.lang.String r15 = r13.getName()
            if (r7 == 0) goto L5e
            boolean r11 = r15.equals(r8)
            if (r11 == 0) goto L5e
            r8 = r4
            r7 = r5
            goto Lb9
        L5e:
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L68
            r0.h()
            goto Lb9
        L68:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L86
            boolean r15 = r0.d()
            if (r15 != 0) goto Lb9
            androidx.core.view.b r15 = r0.A
            if (r15 == 0) goto L82
            boolean r15 = r15.a()
            if (r15 == 0) goto L82
            r0.b()
            goto Lb9
        L82:
            r0.a()
            goto Lb9
        L86:
            boolean r15 = r15.equals(r2)
            if (r15 == 0) goto Lb9
            r6 = r3
            goto Lb9
        L8e:
            if (r7 == 0) goto L91
            goto Lb9
        L91:
            java.lang.String r15 = r13.getName()
            boolean r10 = r15.equals(r10)
            if (r10 == 0) goto L9f
            r0.f(r14)
            goto Lb9
        L9f:
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto La9
            r0.g(r14)
            goto Lb9
        La9:
            boolean r9 = r15.equals(r2)
            if (r9 == 0) goto Lb7
            android.view.SubMenu r15 = r0.b()
            r12.c(r13, r14, r15)
            goto Lb9
        Lb7:
            r8 = r15
            r7 = r3
        Lb9:
            int r15 = r13.next()
            goto L40
        Lbe:
            java.lang.RuntimeException r13 = new java.lang.RuntimeException
            java.lang.String r14 = "Unexpected end of document"
            r13.<init>(r14)
            throw r13
        Lc6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: l.g.c(org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.view.Menu):void");
    }

    Object b() {
        if (this.f35958d == null) {
            this.f35958d = a(this.f35957c);
        }
        return this.f35958d;
    }

    @Override // android.view.MenuInflater
    public void inflate(int i11, Menu menu) {
        if (!(menu instanceof o3.a)) {
            super.inflate(i11, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f35957c.getResources().getLayout(i11);
                    c(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                } catch (IOException e11) {
                    throw new InflateException("Error inflating menu XML", e11);
                }
            } catch (XmlPullParserException e12) {
                throw new InflateException("Error inflating menu XML", e12);
            }
        } finally {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
        }
    }
}