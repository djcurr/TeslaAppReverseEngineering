package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.r;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class u {

    /* renamed from: v */
    private static String f3674v = "ViewTransition";

    /* renamed from: a */
    private int f3675a;

    /* renamed from: e */
    int f3679e;

    /* renamed from: f */
    g f3680f;

    /* renamed from: g */
    d.a f3681g;

    /* renamed from: j */
    private int f3684j;

    /* renamed from: k */
    private String f3685k;

    /* renamed from: o */
    Context f3689o;

    /* renamed from: b */
    private int f3676b = -1;

    /* renamed from: c */
    private boolean f3677c = false;

    /* renamed from: d */
    private int f3678d = 0;

    /* renamed from: h */
    private int f3682h = -1;

    /* renamed from: i */
    private int f3683i = -1;

    /* renamed from: l */
    private int f3686l = 0;

    /* renamed from: m */
    private String f3687m = null;

    /* renamed from: n */
    private int f3688n = -1;

    /* renamed from: p */
    private int f3690p = -1;

    /* renamed from: q */
    private int f3691q = -1;

    /* renamed from: r */
    private int f3692r = -1;

    /* renamed from: s */
    private int f3693s = -1;

    /* renamed from: t */
    private int f3694t = -1;

    /* renamed from: u */
    private int f3695u = -1;

    /* loaded from: classes.dex */
    public class a implements Interpolator {

        /* renamed from: a */
        final /* synthetic */ c3.c f3696a;

        a(u uVar, c3.c cVar) {
            this.f3696a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (float) this.f3696a.a(f11);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        private final int f3697a;

        /* renamed from: b */
        private final int f3698b;

        /* renamed from: c */
        long f3699c;

        /* renamed from: d */
        m f3700d;

        /* renamed from: e */
        int f3701e;

        /* renamed from: g */
        v f3703g;

        /* renamed from: h */
        Interpolator f3704h;

        /* renamed from: j */
        float f3706j;

        /* renamed from: k */
        float f3707k;

        /* renamed from: l */
        long f3708l;

        /* renamed from: n */
        boolean f3710n;

        /* renamed from: f */
        c3.d f3702f = new c3.d();

        /* renamed from: i */
        boolean f3705i = false;

        /* renamed from: m */
        Rect f3709m = new Rect();

        b(v vVar, m mVar, int i11, int i12, int i13, Interpolator interpolator, int i14, int i15) {
            this.f3710n = false;
            this.f3703g = vVar;
            this.f3700d = mVar;
            this.f3701e = i12;
            long nanoTime = System.nanoTime();
            this.f3699c = nanoTime;
            this.f3708l = nanoTime;
            this.f3703g.b(this);
            this.f3704h = interpolator;
            this.f3697a = i14;
            this.f3698b = i15;
            if (i13 == 3) {
                this.f3710n = true;
            }
            this.f3707k = i11 == 0 ? Float.MAX_VALUE : 1.0f / i11;
            a();
        }

        public void a() {
            if (this.f3705i) {
                c();
            } else {
                b();
            }
        }

        void b() {
            long nanoTime = System.nanoTime();
            this.f3708l = nanoTime;
            float f11 = this.f3706j + (((float) ((nanoTime - this.f3708l) * 1.0E-6d)) * this.f3707k);
            this.f3706j = f11;
            if (f11 >= 1.0f) {
                this.f3706j = 1.0f;
            }
            Interpolator interpolator = this.f3704h;
            float interpolation = interpolator == null ? this.f3706j : interpolator.getInterpolation(this.f3706j);
            m mVar = this.f3700d;
            boolean q11 = mVar.q(mVar.f3480a, interpolation, nanoTime, this.f3702f);
            if (this.f3706j >= 1.0f) {
                if (this.f3697a != -1) {
                    this.f3700d.o().setTag(this.f3697a, Long.valueOf(System.nanoTime()));
                }
                if (this.f3698b != -1) {
                    this.f3700d.o().setTag(this.f3698b, null);
                }
                if (!this.f3710n) {
                    this.f3703g.f(this);
                }
            }
            if (this.f3706j < 1.0f || q11) {
                this.f3703g.d();
            }
        }

        void c() {
            long nanoTime = System.nanoTime();
            this.f3708l = nanoTime;
            float f11 = this.f3706j - (((float) ((nanoTime - this.f3708l) * 1.0E-6d)) * this.f3707k);
            this.f3706j = f11;
            if (f11 < BitmapDescriptorFactory.HUE_RED) {
                this.f3706j = BitmapDescriptorFactory.HUE_RED;
            }
            Interpolator interpolator = this.f3704h;
            float interpolation = interpolator == null ? this.f3706j : interpolator.getInterpolation(this.f3706j);
            m mVar = this.f3700d;
            boolean q11 = mVar.q(mVar.f3480a, interpolation, nanoTime, this.f3702f);
            if (this.f3706j <= BitmapDescriptorFactory.HUE_RED) {
                if (this.f3697a != -1) {
                    this.f3700d.o().setTag(this.f3697a, Long.valueOf(System.nanoTime()));
                }
                if (this.f3698b != -1) {
                    this.f3700d.o().setTag(this.f3698b, null);
                }
                this.f3703g.f(this);
            }
            if (this.f3706j > BitmapDescriptorFactory.HUE_RED || q11) {
                this.f3703g.d();
            }
        }

        public void d(int i11, float f11, float f12) {
            if (i11 == 1) {
                if (this.f3705i) {
                    return;
                }
                e(true);
            } else if (i11 != 2) {
            } else {
                this.f3700d.o().getHitRect(this.f3709m);
                if (this.f3709m.contains((int) f11, (int) f12) || this.f3705i) {
                    return;
                }
                e(true);
            }
        }

        void e(boolean z11) {
            int i11;
            this.f3705i = z11;
            if (z11 && (i11 = this.f3701e) != -1) {
                this.f3707k = i11 == 0 ? Float.MAX_VALUE : 1.0f / i11;
            }
            this.f3703g.d();
            this.f3708l = System.nanoTime();
        }
    }

    public u(Context context, XmlPullParser xmlPullParser) {
        boolean z11;
        this.f3689o = context;
        try {
            int eventType = xmlPullParser.getEventType();
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    switch (name.hashCode()) {
                        case -1962203927:
                            if (name.equals("ConstraintOverride")) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                z11 = false;
                                break;
                            }
                            z11 = true;
                            break;
                        case 366511058:
                            if (name.equals("CustomMethod")) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            break;
                        case 1791837707:
                            if (name.equals("CustomAttribute")) {
                                z11 = true;
                                break;
                            }
                            z11 = true;
                            break;
                        default:
                            z11 = true;
                            break;
                    }
                    if (!z11) {
                        l(context, xmlPullParser);
                    } else if (z11) {
                        this.f3680f = new g(context, xmlPullParser);
                    } else if (z11) {
                        this.f3681g = androidx.constraintlayout.widget.d.k(context, xmlPullParser);
                    } else if (!z11 && !z11) {
                        Log.e(f3674v, androidx.constraintlayout.motion.widget.a.a() + " unknown tag " + name);
                        Log.e(f3674v, ".xml:" + xmlPullParser.getLineNumber());
                    } else {
                        androidx.constraintlayout.widget.a.h(context, xmlPullParser, this.f3681g.f3822g);
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("ViewTransition".equals(xmlPullParser.getName())) {
                    return;
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    public static /* synthetic */ void a(u uVar, View[] viewArr) {
        uVar.j(viewArr);
    }

    public /* synthetic */ void j(View[] viewArr) {
        if (this.f3690p != -1) {
            for (View view : viewArr) {
                view.setTag(this.f3690p, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.f3691q != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.f3691q, null);
            }
        }
    }

    private void l(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.M8);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == androidx.constraintlayout.widget.i.N8) {
                this.f3675a = obtainStyledAttributes.getResourceId(index, this.f3675a);
            } else if (index == androidx.constraintlayout.widget.i.V8) {
                if (p.f3510y3) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, this.f3684j);
                    this.f3684j = resourceId;
                    if (resourceId == -1) {
                        this.f3685k = obtainStyledAttributes.getString(index);
                    }
                } else if (obtainStyledAttributes.peekValue(index).type == 3) {
                    this.f3685k = obtainStyledAttributes.getString(index);
                } else {
                    this.f3684j = obtainStyledAttributes.getResourceId(index, this.f3684j);
                }
            } else if (index == androidx.constraintlayout.widget.i.W8) {
                this.f3676b = obtainStyledAttributes.getInt(index, this.f3676b);
            } else if (index == androidx.constraintlayout.widget.i.Z8) {
                this.f3677c = obtainStyledAttributes.getBoolean(index, this.f3677c);
            } else if (index == androidx.constraintlayout.widget.i.X8) {
                this.f3678d = obtainStyledAttributes.getInt(index, this.f3678d);
            } else if (index == androidx.constraintlayout.widget.i.R8) {
                this.f3682h = obtainStyledAttributes.getInt(index, this.f3682h);
            } else if (index == androidx.constraintlayout.widget.i.f3938a9) {
                this.f3683i = obtainStyledAttributes.getInt(index, this.f3683i);
            } else if (index == androidx.constraintlayout.widget.i.f3949b9) {
                this.f3679e = obtainStyledAttributes.getInt(index, this.f3679e);
            } else if (index == androidx.constraintlayout.widget.i.U8) {
                int i12 = obtainStyledAttributes.peekValue(index).type;
                if (i12 == 1) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, -1);
                    this.f3688n = resourceId2;
                    if (resourceId2 != -1) {
                        this.f3686l = -2;
                    }
                } else if (i12 == 3) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3687m = string;
                    if (string != null && string.indexOf("/") > 0) {
                        this.f3688n = obtainStyledAttributes.getResourceId(index, -1);
                        this.f3686l = -2;
                    } else {
                        this.f3686l = -1;
                    }
                } else {
                    this.f3686l = obtainStyledAttributes.getInteger(index, this.f3686l);
                }
            } else if (index == androidx.constraintlayout.widget.i.Y8) {
                this.f3690p = obtainStyledAttributes.getResourceId(index, this.f3690p);
            } else if (index == androidx.constraintlayout.widget.i.Q8) {
                this.f3691q = obtainStyledAttributes.getResourceId(index, this.f3691q);
            } else if (index == androidx.constraintlayout.widget.i.T8) {
                this.f3692r = obtainStyledAttributes.getResourceId(index, this.f3692r);
            } else if (index == androidx.constraintlayout.widget.i.S8) {
                this.f3693s = obtainStyledAttributes.getResourceId(index, this.f3693s);
            } else if (index == androidx.constraintlayout.widget.i.P8) {
                this.f3695u = obtainStyledAttributes.getResourceId(index, this.f3695u);
            } else if (index == androidx.constraintlayout.widget.i.O8) {
                this.f3694t = obtainStyledAttributes.getInteger(index, this.f3694t);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void n(r.b bVar, View view) {
        int i11 = this.f3682h;
        if (i11 != -1) {
            bVar.C(i11);
        }
        bVar.E(this.f3678d);
        bVar.D(this.f3686l, this.f3687m, this.f3688n);
        int id2 = view.getId();
        g gVar = this.f3680f;
        if (gVar != null) {
            ArrayList<d> c11 = gVar.c(-1);
            g gVar2 = new g();
            Iterator<d> it2 = c11.iterator();
            while (it2.hasNext()) {
                gVar2.b(it2.next().clone().g(id2));
            }
            bVar.r(gVar2);
        }
    }

    void b(v vVar, p pVar, View view) {
        m mVar = new m(view);
        mVar.s(view);
        this.f3680f.a(mVar);
        mVar.u(pVar.getWidth(), pVar.getHeight(), this.f3682h, System.nanoTime());
        new b(vVar, mVar, this.f3682h, this.f3683i, this.f3676b, f(pVar.getContext()), this.f3690p, this.f3691q);
    }

    public void c(v vVar, p pVar, int i11, androidx.constraintlayout.widget.d dVar, final View... viewArr) {
        int[] constraintSetIds;
        if (this.f3677c) {
            return;
        }
        int i12 = this.f3679e;
        if (i12 == 2) {
            b(vVar, pVar, viewArr[0]);
            return;
        }
        if (i12 == 1) {
            for (int i13 : pVar.getConstraintSetIds()) {
                if (i13 != i11) {
                    androidx.constraintlayout.widget.d t11 = pVar.t(i13);
                    for (View view : viewArr) {
                        d.a u11 = t11.u(view.getId());
                        d.a aVar = this.f3681g;
                        if (aVar != null) {
                            aVar.d(u11);
                            u11.f3822g.putAll(this.f3681g.f3822g);
                        }
                    }
                }
            }
        }
        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
        dVar2.o(dVar);
        for (View view2 : viewArr) {
            d.a u12 = dVar2.u(view2.getId());
            d.a aVar2 = this.f3681g;
            if (aVar2 != null) {
                aVar2.d(u12);
                u12.f3822g.putAll(this.f3681g.f3822g);
            }
        }
        pVar.M(i11, dVar2);
        int i14 = androidx.constraintlayout.widget.h.f3927b;
        pVar.M(i14, dVar);
        pVar.setState(i14, -1, -1);
        r.b bVar = new r.b(-1, pVar.f3511a, i14, i11);
        for (View view3 : viewArr) {
            n(bVar, view3);
        }
        pVar.setTransition(bVar);
        pVar.G(new Runnable() { // from class: androidx.constraintlayout.motion.widget.t
            {
                u.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                u.a(u.this, viewArr);
            }
        });
    }

    public boolean d(View view) {
        int i11 = this.f3692r;
        boolean z11 = i11 == -1 || view.getTag(i11) != null;
        int i12 = this.f3693s;
        return z11 && (i12 == -1 || view.getTag(i12) == null);
    }

    public int e() {
        return this.f3675a;
    }

    Interpolator f(Context context) {
        int i11 = this.f3686l;
        if (i11 != -2) {
            if (i11 != -1) {
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    if (i11 != 6) {
                                        return null;
                                    }
                                    return new AnticipateInterpolator();
                                }
                                return new OvershootInterpolator();
                            }
                            return new BounceInterpolator();
                        }
                        return new DecelerateInterpolator();
                    }
                    return new AccelerateInterpolator();
                }
                return new AccelerateDecelerateInterpolator();
            }
            return new a(this, c3.c.c(this.f3687m));
        }
        return AnimationUtils.loadInterpolator(context, this.f3688n);
    }

    public int g() {
        return this.f3694t;
    }

    public int h() {
        return this.f3695u;
    }

    public int i() {
        return this.f3676b;
    }

    public boolean k(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if (!(this.f3684j == -1 && this.f3685k == null) && d(view)) {
            if (view.getId() == this.f3684j) {
                return true;
            }
            return this.f3685k != null && (view.getLayoutParams() instanceof ConstraintLayout.b) && (str = ((ConstraintLayout.b) view.getLayoutParams()).Y) != null && str.matches(this.f3685k);
        }
        return false;
    }

    public boolean m(int i11) {
        int i12 = this.f3676b;
        return i12 == 1 ? i11 == 0 : i12 == 2 ? i11 == 1 : i12 == 3 && i11 == 0;
    }

    public String toString() {
        return "ViewTransition(" + androidx.constraintlayout.motion.widget.a.b(this.f3689o, this.f3675a) + ")";
    }
}