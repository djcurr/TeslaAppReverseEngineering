package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.motion.widget.p;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final p f3603a;

    /* renamed from: n  reason: collision with root package name */
    private MotionEvent f3616n;

    /* renamed from: q  reason: collision with root package name */
    private p.f f3619q;

    /* renamed from: r  reason: collision with root package name */
    private boolean f3620r;

    /* renamed from: s  reason: collision with root package name */
    final v f3621s;

    /* renamed from: t  reason: collision with root package name */
    float f3622t;

    /* renamed from: u  reason: collision with root package name */
    float f3623u;

    /* renamed from: b  reason: collision with root package name */
    androidx.constraintlayout.widget.k f3604b = null;

    /* renamed from: c  reason: collision with root package name */
    b f3605c = null;

    /* renamed from: d  reason: collision with root package name */
    private boolean f3606d = false;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<b> f3607e = new ArrayList<>();

    /* renamed from: f  reason: collision with root package name */
    private b f3608f = null;

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<b> f3609g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private SparseArray<androidx.constraintlayout.widget.d> f3610h = new SparseArray<>();

    /* renamed from: i  reason: collision with root package name */
    private HashMap<String, Integer> f3611i = new HashMap<>();

    /* renamed from: j  reason: collision with root package name */
    private SparseIntArray f3612j = new SparseIntArray();

    /* renamed from: k  reason: collision with root package name */
    private boolean f3613k = false;

    /* renamed from: l  reason: collision with root package name */
    private int f3614l = 400;

    /* renamed from: m  reason: collision with root package name */
    private int f3615m = 0;

    /* renamed from: o  reason: collision with root package name */
    private boolean f3617o = false;

    /* renamed from: p  reason: collision with root package name */
    private boolean f3618p = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Interpolator {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c3.c f3624a;

        a(r rVar, c3.c cVar) {
            this.f3624a = cVar;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            return (float) this.f3624a.a(f11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r(Context context, p pVar, int i11) {
        this.f3603a = pVar;
        this.f3621s = new v(pVar);
        G(context, i11);
        SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f3610h;
        int i12 = androidx.constraintlayout.widget.h.f3926a;
        sparseArray.put(i12, new androidx.constraintlayout.widget.d());
        this.f3611i.put("motion_base", Integer.valueOf(i12));
    }

    private boolean E(int i11) {
        int i12 = this.f3612j.get(i11);
        int size = this.f3612j.size();
        while (i12 > 0) {
            if (i12 == i11) {
                return true;
            }
            int i13 = size - 1;
            if (size < 0) {
                return true;
            }
            i12 = this.f3612j.get(i12);
            size = i13;
        }
        return false;
    }

    private boolean F() {
        return this.f3619q != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void G(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        b bVar = null;
        try {
            int eventType = xml.getEventType();
            while (true) {
                char c11 = 1;
                if (eventType == 1) {
                    return;
                }
                if (eventType == 0) {
                    xml.getName();
                    continue;
                } else if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    if (this.f3613k) {
                        System.out.println("parsing = " + name);
                    }
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c11 = 5;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                c11 = '\b';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case -687739768:
                            if (name.equals("Include")) {
                                c11 = 7;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                c11 = '\t';
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 269306229:
                            if (name.equals("Transition")) {
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 312750793:
                            if (name.equals("OnClick")) {
                                c11 = 3;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                c11 = 2;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                c11 = 0;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                c11 = 4;
                                break;
                            }
                            c11 = 65535;
                            break;
                        case 1942574248:
                            if (name.equals("include")) {
                                c11 = 6;
                                break;
                            }
                            c11 = 65535;
                            break;
                        default:
                            c11 = 65535;
                            break;
                    }
                    switch (c11) {
                        case 0:
                            K(context, xml);
                            continue;
                        case 1:
                            ArrayList<b> arrayList = this.f3607e;
                            b bVar2 = new b(this, context, xml);
                            arrayList.add(bVar2);
                            if (this.f3605c == null && !bVar2.f3626b) {
                                this.f3605c = bVar2;
                                if (bVar2.f3636l != null) {
                                    this.f3605c.f3636l.x(this.f3620r);
                                }
                            }
                            if (bVar2.f3626b) {
                                if (bVar2.f3627c == -1) {
                                    this.f3608f = bVar2;
                                } else {
                                    this.f3609g.add(bVar2);
                                }
                                this.f3607e.remove(bVar2);
                            }
                            bVar = bVar2;
                            continue;
                        case 2:
                            if (bVar == null) {
                                Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i11) + ".xml:" + xml.getLineNumber() + ")");
                            }
                            if (bVar != null) {
                                bVar.f3636l = new s(context, this.f3603a, xml);
                                continue;
                            } else {
                                continue;
                            }
                        case 3:
                            if (bVar != null) {
                                bVar.s(context, xml);
                                continue;
                            } else {
                                continue;
                            }
                        case 4:
                            this.f3604b = new androidx.constraintlayout.widget.k(context, xml);
                            continue;
                        case 5:
                            H(context, xml);
                            continue;
                        case 6:
                        case 7:
                            J(context, xml);
                            continue;
                        case '\b':
                            g gVar = new g(context, xml);
                            if (bVar != null) {
                                bVar.f3635k.add(gVar);
                                continue;
                            } else {
                                continue;
                            }
                        case '\t':
                            this.f3621s.a(new u(context, xml));
                            continue;
                        default:
                            continue;
                    }
                }
                eventType = xml.next();
            }
        } catch (IOException e11) {
            e11.printStackTrace();
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0053, code lost:
        if (r8.equals("constraintRotate") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int H(android.content.Context r14, org.xmlpull.v1.XmlPullParser r15) {
        /*
            r13 = this;
            androidx.constraintlayout.widget.d r0 = new androidx.constraintlayout.widget.d
            r0.<init>()
            r1 = 0
            r0.J(r1)
            int r2 = r15.getAttributeCount()
            r3 = -1
            r4 = r1
            r5 = r3
            r6 = r5
        L11:
            r7 = 1
            if (r4 >= r2) goto L8b
            java.lang.String r8 = r15.getAttributeName(r4)
            java.lang.String r9 = r15.getAttributeValue(r4)
            boolean r10 = r13.f3613k
            if (r10 == 0) goto L36
            java.io.PrintStream r10 = java.lang.System.out
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "id string = "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            r10.println(r11)
        L36:
            r8.hashCode()
            int r10 = r8.hashCode()
            switch(r10) {
                case -1496482599: goto L56;
                case -1153153640: goto L4d;
                case 3355: goto L42;
                default: goto L40;
            }
        L40:
            r7 = r3
            goto L60
        L42:
            java.lang.String r7 = "id"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L4b
            goto L40
        L4b:
            r7 = 2
            goto L60
        L4d:
            java.lang.String r10 = "constraintRotate"
            boolean r8 = r8.equals(r10)
            if (r8 != 0) goto L60
            goto L40
        L56:
            java.lang.String r7 = "deriveConstraintsFrom"
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L5f
            goto L40
        L5f:
            r7 = r1
        L60:
            switch(r7) {
                case 0: goto L84;
                case 1: goto L7c;
                case 2: goto L64;
                default: goto L63;
            }
        L63:
            goto L88
        L64:
            int r5 = r13.p(r14, r9)
            java.util.HashMap<java.lang.String, java.lang.Integer> r7 = r13.f3611i
            java.lang.String r8 = W(r9)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
            r7.put(r8, r9)
            java.lang.String r7 = androidx.constraintlayout.motion.widget.a.b(r14, r5)
            r0.f3811a = r7
            goto L88
        L7c:
            java.lang.Integer.parseInt(r9)     // Catch: java.lang.NumberFormatException -> L80
            goto L88
        L80:
            r9.hashCode()
            goto L88
        L84:
            int r6 = r13.p(r14, r9)
        L88:
            int r4 = r4 + 1
            goto L11
        L8b:
            if (r5 == r3) goto La5
            androidx.constraintlayout.motion.widget.p r1 = r13.f3603a
            int r1 = r1.A
            if (r1 == 0) goto L96
            r0.K(r7)
        L96:
            r0.w(r14, r15)
            if (r6 == r3) goto La0
            android.util.SparseIntArray r14 = r13.f3612j
            r14.put(r5, r6)
        La0:
            android.util.SparseArray<androidx.constraintlayout.widget.d> r14 = r13.f3610h
            r14.put(r5, r0)
        La5:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.r.H(android.content.Context, org.xmlpull.v1.XmlPullParser):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int I(Context context, int i11) {
        XmlResourceParser xml = context.getResources().getXml(i11);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    return H(context, xml);
                }
            }
            return -1;
        } catch (IOException e11) {
            e11.printStackTrace();
            return -1;
        } catch (XmlPullParserException e12) {
            e12.printStackTrace();
            return -1;
        }
    }

    private void J(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f3960c9);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == androidx.constraintlayout.widget.i.f3971d9) {
                I(context, obtainStyledAttributes.getResourceId(index, -1));
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void K(Context context, XmlPullParser xmlPullParser) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.f4170x7);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i11 = 0; i11 < indexCount; i11++) {
            int index = obtainStyledAttributes.getIndex(i11);
            if (index == androidx.constraintlayout.widget.i.f4180y7) {
                int i12 = obtainStyledAttributes.getInt(index, this.f3614l);
                this.f3614l = i12;
                if (i12 < 8) {
                    this.f3614l = 8;
                }
            } else if (index == androidx.constraintlayout.widget.i.f4190z7) {
                this.f3615m = obtainStyledAttributes.getInteger(index, 0);
            }
        }
        obtainStyledAttributes.recycle();
    }

    private void O(int i11, p pVar) {
        androidx.constraintlayout.widget.d dVar = this.f3610h.get(i11);
        dVar.f3812b = dVar.f3811a;
        int i12 = this.f3612j.get(i11);
        if (i12 > 0) {
            O(i12, pVar);
            androidx.constraintlayout.widget.d dVar2 = this.f3610h.get(i12);
            if (dVar2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + androidx.constraintlayout.motion.widget.a.b(this.f3603a.getContext(), i12));
                return;
            }
            dVar.f3812b += "/" + dVar2.f3812b;
            dVar.E(dVar2);
        } else {
            dVar.f3812b += "  layout";
            dVar.D(pVar);
        }
        dVar.h(dVar);
    }

    public static String W(String str) {
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf(47);
        return indexOf < 0 ? str : str.substring(indexOf + 1);
    }

    private int p(Context context, String str) {
        int i11;
        if (str.contains("/")) {
            i11 = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
            if (this.f3613k) {
                System.out.println("id getMap res = " + i11);
            }
        } else {
            i11 = -1;
        }
        if (i11 == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
            return i11;
        }
        return i11;
    }

    private int v(int i11) {
        int c11;
        androidx.constraintlayout.widget.k kVar = this.f3604b;
        return (kVar == null || (c11 = kVar.c(i11, -1, -1)) == -1) ? i11 : c11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float A() {
        b bVar = this.f3605c;
        return (bVar == null || bVar.f3636l == null) ? BitmapDescriptorFactory.HUE_RED : this.f3605c.f3636l.o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int B() {
        b bVar = this.f3605c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f3628d;
    }

    public b C(int i11) {
        Iterator<b> it2 = this.f3607e.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.f3625a == i11) {
                return next;
            }
        }
        return null;
    }

    public List<b> D(int i11) {
        int v11 = v(i11);
        ArrayList arrayList = new ArrayList();
        Iterator<b> it2 = this.f3607e.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.f3628d == v11 || next.f3627c == v11) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void L(float f11, float f12) {
        b bVar = this.f3605c;
        if (bVar == null || bVar.f3636l == null) {
            return;
        }
        this.f3605c.f3636l.u(f11, f12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void M(float f11, float f12) {
        b bVar = this.f3605c;
        if (bVar == null || bVar.f3636l == null) {
            return;
        }
        this.f3605c.f3636l.v(f11, f12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void N(MotionEvent motionEvent, int i11, p pVar) {
        p.f fVar;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        if (this.f3619q == null) {
            this.f3619q = this.f3603a.y();
        }
        this.f3619q.a(motionEvent);
        if (i11 != -1) {
            int action = motionEvent.getAction();
            boolean z11 = false;
            if (action != 0) {
                if (action == 2 && !this.f3617o) {
                    float rawY = motionEvent.getRawY() - this.f3623u;
                    float rawX = motionEvent.getRawX() - this.f3622t;
                    if ((rawX == 0.0d && rawY == 0.0d) || (motionEvent2 = this.f3616n) == null) {
                        return;
                    }
                    b h11 = h(i11, rawX, rawY, motionEvent2);
                    if (h11 != null) {
                        pVar.setTransition(h11);
                        RectF p11 = this.f3605c.f3636l.p(this.f3603a, rectF);
                        if (p11 != null && !p11.contains(this.f3616n.getX(), this.f3616n.getY())) {
                            z11 = true;
                        }
                        this.f3618p = z11;
                        this.f3605c.f3636l.y(this.f3622t, this.f3623u);
                    }
                }
            } else {
                this.f3622t = motionEvent.getRawX();
                this.f3623u = motionEvent.getRawY();
                this.f3616n = motionEvent;
                this.f3617o = false;
                if (this.f3605c.f3636l != null) {
                    RectF f11 = this.f3605c.f3636l.f(this.f3603a, rectF);
                    if (f11 == null || f11.contains(this.f3616n.getX(), this.f3616n.getY())) {
                        RectF p12 = this.f3605c.f3636l.p(this.f3603a, rectF);
                        if (p12 != null && !p12.contains(this.f3616n.getX(), this.f3616n.getY())) {
                            this.f3618p = true;
                        } else {
                            this.f3618p = false;
                        }
                        this.f3605c.f3636l.w(this.f3622t, this.f3623u);
                        return;
                    }
                    this.f3616n = null;
                    this.f3617o = true;
                    return;
                }
                return;
            }
        }
        if (this.f3617o) {
            return;
        }
        b bVar = this.f3605c;
        if (bVar != null && bVar.f3636l != null && !this.f3618p) {
            this.f3605c.f3636l.s(motionEvent, this.f3619q, i11, this);
        }
        this.f3622t = motionEvent.getRawX();
        this.f3623u = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (fVar = this.f3619q) == null) {
            return;
        }
        fVar.recycle();
        this.f3619q = null;
        int i12 = pVar.f3518f;
        if (i12 != -1) {
            g(pVar, i12);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(p pVar) {
        for (int i11 = 0; i11 < this.f3610h.size(); i11++) {
            int keyAt = this.f3610h.keyAt(i11);
            if (E(keyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            O(keyAt, pVar);
        }
    }

    public void Q(int i11, androidx.constraintlayout.widget.d dVar) {
        this.f3610h.put(i11, dVar);
    }

    public void R(int i11) {
        b bVar = this.f3605c;
        if (bVar != null) {
            bVar.C(i11);
        } else {
            this.f3614l = i11;
        }
    }

    public void S(boolean z11) {
        this.f3620r = z11;
        b bVar = this.f3605c;
        if (bVar == null || bVar.f3636l == null) {
            return;
        }
        this.f3605c.f3636l.x(this.f3620r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r2 != (-1)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void T(int r7, int r8) {
        /*
            r6 = this;
            androidx.constraintlayout.widget.k r0 = r6.f3604b
            r1 = -1
            if (r0 == 0) goto L16
            int r0 = r0.c(r7, r1, r1)
            if (r0 == r1) goto Lc
            goto Ld
        Lc:
            r0 = r7
        Ld:
            androidx.constraintlayout.widget.k r2 = r6.f3604b
            int r2 = r2.c(r8, r1, r1)
            if (r2 == r1) goto L17
            goto L18
        L16:
            r0 = r7
        L17:
            r2 = r8
        L18:
            androidx.constraintlayout.motion.widget.r$b r3 = r6.f3605c
            if (r3 == 0) goto L2b
            int r3 = androidx.constraintlayout.motion.widget.r.b.a(r3)
            if (r3 != r8) goto L2b
            androidx.constraintlayout.motion.widget.r$b r3 = r6.f3605c
            int r3 = androidx.constraintlayout.motion.widget.r.b.c(r3)
            if (r3 != r7) goto L2b
            return
        L2b:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.r$b> r3 = r6.f3607e
            java.util.Iterator r3 = r3.iterator()
        L31:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L6b
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.r$b r4 = (androidx.constraintlayout.motion.widget.r.b) r4
            int r5 = androidx.constraintlayout.motion.widget.r.b.a(r4)
            if (r5 != r2) goto L49
            int r5 = androidx.constraintlayout.motion.widget.r.b.c(r4)
            if (r5 == r0) goto L55
        L49:
            int r5 = androidx.constraintlayout.motion.widget.r.b.a(r4)
            if (r5 != r8) goto L31
            int r5 = androidx.constraintlayout.motion.widget.r.b.c(r4)
            if (r5 != r7) goto L31
        L55:
            r6.f3605c = r4
            if (r4 == 0) goto L6a
            androidx.constraintlayout.motion.widget.s r7 = androidx.constraintlayout.motion.widget.r.b.k(r4)
            if (r7 == 0) goto L6a
            androidx.constraintlayout.motion.widget.r$b r7 = r6.f3605c
            androidx.constraintlayout.motion.widget.s r7 = androidx.constraintlayout.motion.widget.r.b.k(r7)
            boolean r8 = r6.f3620r
            r7.x(r8)
        L6a:
            return
        L6b:
            androidx.constraintlayout.motion.widget.r$b r7 = r6.f3608f
            java.util.ArrayList<androidx.constraintlayout.motion.widget.r$b> r3 = r6.f3609g
            java.util.Iterator r3 = r3.iterator()
        L73:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L87
            java.lang.Object r4 = r3.next()
            androidx.constraintlayout.motion.widget.r$b r4 = (androidx.constraintlayout.motion.widget.r.b) r4
            int r5 = androidx.constraintlayout.motion.widget.r.b.a(r4)
            if (r5 != r8) goto L73
            r7 = r4
            goto L73
        L87:
            androidx.constraintlayout.motion.widget.r$b r8 = new androidx.constraintlayout.motion.widget.r$b
            r8.<init>(r6, r7)
            androidx.constraintlayout.motion.widget.r.b.d(r8, r0)
            androidx.constraintlayout.motion.widget.r.b.b(r8, r2)
            if (r0 == r1) goto L99
            java.util.ArrayList<androidx.constraintlayout.motion.widget.r$b> r7 = r6.f3607e
            r7.add(r8)
        L99:
            r6.f3605c = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.r.T(int, int):void");
    }

    public void U(b bVar) {
        this.f3605c = bVar;
        if (bVar == null || bVar.f3636l == null) {
            return;
        }
        this.f3605c.f3636l.x(this.f3620r);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void V() {
        b bVar = this.f3605c;
        if (bVar == null || bVar.f3636l == null) {
            return;
        }
        this.f3605c.f3636l.z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean X() {
        Iterator<b> it2 = this.f3607e.iterator();
        while (it2.hasNext()) {
            if (it2.next().f3636l != null) {
                return true;
            }
        }
        b bVar = this.f3605c;
        return (bVar == null || bVar.f3636l == null) ? false : true;
    }

    public void Y(int i11, View... viewArr) {
        this.f3621s.h(i11, viewArr);
    }

    public void f(p pVar, int i11) {
        Iterator<b> it2 = this.f3607e.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.f3637m.size() > 0) {
                Iterator it3 = next.f3637m.iterator();
                while (it3.hasNext()) {
                    ((b.a) it3.next()).c(pVar);
                }
            }
        }
        Iterator<b> it4 = this.f3609g.iterator();
        while (it4.hasNext()) {
            b next2 = it4.next();
            if (next2.f3637m.size() > 0) {
                Iterator it5 = next2.f3637m.iterator();
                while (it5.hasNext()) {
                    ((b.a) it5.next()).c(pVar);
                }
            }
        }
        Iterator<b> it6 = this.f3607e.iterator();
        while (it6.hasNext()) {
            b next3 = it6.next();
            if (next3.f3637m.size() > 0) {
                Iterator it7 = next3.f3637m.iterator();
                while (it7.hasNext()) {
                    ((b.a) it7.next()).a(pVar, i11, next3);
                }
            }
        }
        Iterator<b> it8 = this.f3609g.iterator();
        while (it8.hasNext()) {
            b next4 = it8.next();
            if (next4.f3637m.size() > 0) {
                Iterator it9 = next4.f3637m.iterator();
                while (it9.hasNext()) {
                    ((b.a) it9.next()).a(pVar, i11, next4);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean g(p pVar, int i11) {
        b bVar;
        if (F() || this.f3606d) {
            return false;
        }
        Iterator<b> it2 = this.f3607e.iterator();
        while (it2.hasNext()) {
            b next = it2.next();
            if (next.f3638n != 0 && ((bVar = this.f3605c) != next || !bVar.B(2))) {
                if (i11 != next.f3628d || (next.f3638n != 4 && next.f3638n != 2)) {
                    if (i11 == next.f3627c && (next.f3638n == 3 || next.f3638n == 1)) {
                        p.j jVar = p.j.FINISHED;
                        pVar.setState(jVar);
                        pVar.setTransition(next);
                        if (next.f3638n == 3) {
                            pVar.H();
                            pVar.setState(p.j.SETUP);
                            pVar.setState(p.j.MOVING);
                        } else {
                            pVar.setProgress(BitmapDescriptorFactory.HUE_RED);
                            pVar.i(true);
                            pVar.setState(p.j.SETUP);
                            pVar.setState(p.j.MOVING);
                            pVar.setState(jVar);
                            pVar.z();
                        }
                        return true;
                    }
                } else {
                    p.j jVar2 = p.j.FINISHED;
                    pVar.setState(jVar2);
                    pVar.setTransition(next);
                    if (next.f3638n == 4) {
                        pVar.F();
                        pVar.setState(p.j.SETUP);
                        pVar.setState(p.j.MOVING);
                    } else {
                        pVar.setProgress(1.0f);
                        pVar.i(true);
                        pVar.setState(p.j.SETUP);
                        pVar.setState(p.j.MOVING);
                        pVar.setState(jVar2);
                        pVar.z();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public b h(int i11, float f11, float f12, MotionEvent motionEvent) {
        if (i11 != -1) {
            List<b> D = D(i11);
            float f13 = BitmapDescriptorFactory.HUE_RED;
            b bVar = null;
            RectF rectF = new RectF();
            for (b bVar2 : D) {
                if (!bVar2.f3639o && bVar2.f3636l != null) {
                    bVar2.f3636l.x(this.f3620r);
                    RectF p11 = bVar2.f3636l.p(this.f3603a, rectF);
                    if (p11 == null || motionEvent == null || p11.contains(motionEvent.getX(), motionEvent.getY())) {
                        RectF f14 = bVar2.f3636l.f(this.f3603a, rectF);
                        if (f14 == null || motionEvent == null || f14.contains(motionEvent.getX(), motionEvent.getY())) {
                            float a11 = bVar2.f3636l.a(f11, f12);
                            if (bVar2.f3636l.f3657l && motionEvent != null) {
                                float x11 = motionEvent.getX() - bVar2.f3636l.f3654i;
                                float y11 = motionEvent.getY() - bVar2.f3636l.f3655j;
                                a11 = ((float) (Math.atan2(f12 + y11, f11 + x11) - Math.atan2(x11, y11))) * 10.0f;
                            }
                            float f15 = a11 * (bVar2.f3627c == i11 ? -1.0f : 1.1f);
                            if (f15 > f13) {
                                bVar = bVar2;
                                f13 = f15;
                            }
                        }
                    }
                }
            }
            return bVar;
        }
        return this.f3605c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int i() {
        b bVar = this.f3605c;
        if (bVar == null || bVar.f3636l == null) {
            return 0;
        }
        return this.f3605c.f3636l.d();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public androidx.constraintlayout.widget.d j(int i11) {
        return k(i11, -1, -1);
    }

    androidx.constraintlayout.widget.d k(int i11, int i12, int i13) {
        int c11;
        if (this.f3613k) {
            PrintStream printStream = System.out;
            printStream.println("id " + i11);
            PrintStream printStream2 = System.out;
            printStream2.println("size " + this.f3610h.size());
        }
        androidx.constraintlayout.widget.k kVar = this.f3604b;
        if (kVar != null && (c11 = kVar.c(i11, i12, i13)) != -1) {
            i11 = c11;
        }
        if (this.f3610h.get(i11) == null) {
            Log.e("MotionScene", "Warning could not find ConstraintSet id/" + androidx.constraintlayout.motion.widget.a.b(this.f3603a.getContext(), i11) + " In MotionScene");
            SparseArray<androidx.constraintlayout.widget.d> sparseArray = this.f3610h;
            return sparseArray.get(sparseArray.keyAt(0));
        }
        return this.f3610h.get(i11);
    }

    public int[] l() {
        int size = this.f3610h.size();
        int[] iArr = new int[size];
        for (int i11 = 0; i11 < size; i11++) {
            iArr[i11] = this.f3610h.keyAt(i11);
        }
        return iArr;
    }

    public ArrayList<b> m() {
        return this.f3607e;
    }

    public int n() {
        b bVar = this.f3605c;
        if (bVar != null) {
            return bVar.f3632h;
        }
        return this.f3614l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int o() {
        b bVar = this.f3605c;
        if (bVar == null) {
            return -1;
        }
        return bVar.f3627c;
    }

    public Interpolator q() {
        int i11 = this.f3605c.f3629e;
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
            return new a(this, c3.c.c(this.f3605c.f3630f));
        }
        return AnimationUtils.loadInterpolator(this.f3603a.getContext(), this.f3605c.f3631g);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float r() {
        b bVar = this.f3605c;
        return (bVar == null || bVar.f3636l == null) ? BitmapDescriptorFactory.HUE_RED : this.f3605c.f3636l.g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s() {
        b bVar = this.f3605c;
        return (bVar == null || bVar.f3636l == null) ? BitmapDescriptorFactory.HUE_RED : this.f3605c.f3636l.h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean t() {
        b bVar = this.f3605c;
        if (bVar == null || bVar.f3636l == null) {
            return false;
        }
        return this.f3605c.f3636l.i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float u(float f11, float f12) {
        b bVar = this.f3605c;
        return (bVar == null || bVar.f3636l == null) ? BitmapDescriptorFactory.HUE_RED : this.f3605c.f3636l.j(f11, f12);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int w() {
        b bVar = this.f3605c;
        if (bVar == null || bVar.f3636l == null) {
            return 0;
        }
        return this.f3605c.f3636l.k();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float x() {
        b bVar = this.f3605c;
        return (bVar == null || bVar.f3636l == null) ? BitmapDescriptorFactory.HUE_RED : this.f3605c.f3636l.l();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float y() {
        b bVar = this.f3605c;
        return (bVar == null || bVar.f3636l == null) ? BitmapDescriptorFactory.HUE_RED : this.f3605c.f3636l.m();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float z() {
        b bVar = this.f3605c;
        return (bVar == null || bVar.f3636l == null) ? BitmapDescriptorFactory.HUE_RED : this.f3605c.f3636l.n();
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f3625a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3626b;

        /* renamed from: c  reason: collision with root package name */
        private int f3627c;

        /* renamed from: d  reason: collision with root package name */
        private int f3628d;

        /* renamed from: e  reason: collision with root package name */
        private int f3629e;

        /* renamed from: f  reason: collision with root package name */
        private String f3630f;

        /* renamed from: g  reason: collision with root package name */
        private int f3631g;

        /* renamed from: h  reason: collision with root package name */
        private int f3632h;

        /* renamed from: i  reason: collision with root package name */
        private float f3633i;

        /* renamed from: j  reason: collision with root package name */
        private final r f3634j;

        /* renamed from: k  reason: collision with root package name */
        private ArrayList<g> f3635k;

        /* renamed from: l  reason: collision with root package name */
        private s f3636l;

        /* renamed from: m  reason: collision with root package name */
        private ArrayList<a> f3637m;

        /* renamed from: n  reason: collision with root package name */
        private int f3638n;

        /* renamed from: o  reason: collision with root package name */
        private boolean f3639o;

        /* renamed from: p  reason: collision with root package name */
        private int f3640p;

        /* renamed from: q  reason: collision with root package name */
        private int f3641q;

        /* renamed from: r  reason: collision with root package name */
        private int f3642r;

        /* loaded from: classes.dex */
        public static class a implements View.OnClickListener {

            /* renamed from: a  reason: collision with root package name */
            private final b f3643a;

            /* renamed from: b  reason: collision with root package name */
            int f3644b;

            /* renamed from: c  reason: collision with root package name */
            int f3645c;

            public a(Context context, b bVar, XmlPullParser xmlPullParser) {
                this.f3644b = -1;
                this.f3645c = 17;
                this.f3643a = bVar;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.i.A7);
                int indexCount = obtainStyledAttributes.getIndexCount();
                for (int i11 = 0; i11 < indexCount; i11++) {
                    int index = obtainStyledAttributes.getIndex(i11);
                    if (index == androidx.constraintlayout.widget.i.C7) {
                        this.f3644b = obtainStyledAttributes.getResourceId(index, this.f3644b);
                    } else if (index == androidx.constraintlayout.widget.i.B7) {
                        this.f3645c = obtainStyledAttributes.getInt(index, this.f3645c);
                    }
                }
                obtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r7v4, types: [android.view.View] */
            public void a(p pVar, int i11, b bVar) {
                int i12 = this.f3644b;
                p pVar2 = pVar;
                if (i12 != -1) {
                    pVar2 = pVar.findViewById(i12);
                }
                if (pVar2 != null) {
                    int i13 = bVar.f3628d;
                    int i14 = bVar.f3627c;
                    if (i13 == -1) {
                        pVar2.setOnClickListener(this);
                        return;
                    }
                    int i15 = this.f3645c;
                    boolean z11 = false;
                    boolean z12 = ((i15 & 1) != 0 && i11 == i13) | ((i15 & 1) != 0 && i11 == i13) | ((i15 & 256) != 0 && i11 == i13) | ((i15 & 16) != 0 && i11 == i14);
                    if ((i15 & 4096) != 0 && i11 == i14) {
                        z11 = true;
                    }
                    if (z12 || z11) {
                        pVar2.setOnClickListener(this);
                        return;
                    }
                    return;
                }
                Log.e("MotionScene", "OnClick could not find id " + this.f3644b);
            }

            boolean b(b bVar, p pVar) {
                b bVar2 = this.f3643a;
                if (bVar2 == bVar) {
                    return true;
                }
                int i11 = bVar2.f3627c;
                int i12 = this.f3643a.f3628d;
                if (i12 == -1) {
                    return pVar.f3518f != i11;
                }
                int i13 = pVar.f3518f;
                return i13 == i12 || i13 == i11;
            }

            public void c(p pVar) {
                int i11 = this.f3644b;
                if (i11 == -1) {
                    return;
                }
                View findViewById = pVar.findViewById(i11);
                if (findViewById == null) {
                    Log.e("MotionScene", " (*)  could not find id " + this.f3644b);
                    return;
                }
                findViewById.setOnClickListener(null);
            }

            /* JADX WARN: Removed duplicated region for block: B:44:0x00a3  */
            /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
            @Override // android.view.View.OnClickListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public void onClick(android.view.View r8) {
                /*
                    Method dump skipped, instructions count: 233
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.r.b.a.onClick(android.view.View):void");
            }
        }

        b(r rVar, b bVar) {
            this.f3625a = -1;
            this.f3626b = false;
            this.f3627c = -1;
            this.f3628d = -1;
            this.f3629e = 0;
            this.f3630f = null;
            this.f3631g = -1;
            this.f3632h = 400;
            this.f3633i = BitmapDescriptorFactory.HUE_RED;
            this.f3635k = new ArrayList<>();
            this.f3636l = null;
            this.f3637m = new ArrayList<>();
            this.f3638n = 0;
            this.f3639o = false;
            this.f3640p = -1;
            this.f3641q = 0;
            this.f3642r = 0;
            this.f3634j = rVar;
            this.f3632h = rVar.f3614l;
            if (bVar != null) {
                this.f3640p = bVar.f3640p;
                this.f3629e = bVar.f3629e;
                this.f3630f = bVar.f3630f;
                this.f3631g = bVar.f3631g;
                this.f3632h = bVar.f3632h;
                this.f3635k = bVar.f3635k;
                this.f3633i = bVar.f3633i;
                this.f3641q = bVar.f3641q;
            }
        }

        private void t(r rVar, Context context, TypedArray typedArray) {
            int indexCount = typedArray.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArray.getIndex(i11);
                if (index == androidx.constraintlayout.widget.i.f4171x8) {
                    this.f3627c = typedArray.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f3627c);
                    if ("layout".equals(resourceTypeName)) {
                        androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
                        dVar.v(context, this.f3627c);
                        rVar.f3610h.append(this.f3627c, dVar);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.f3627c = rVar.I(context, this.f3627c);
                    }
                } else if (index == androidx.constraintlayout.widget.i.f4181y8) {
                    this.f3628d = typedArray.getResourceId(index, this.f3628d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.f3628d);
                    if ("layout".equals(resourceTypeName2)) {
                        androidx.constraintlayout.widget.d dVar2 = new androidx.constraintlayout.widget.d();
                        dVar2.v(context, this.f3628d);
                        rVar.f3610h.append(this.f3628d, dVar2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.f3628d = rVar.I(context, this.f3628d);
                    }
                } else if (index == androidx.constraintlayout.widget.i.B8) {
                    int i12 = typedArray.peekValue(index).type;
                    if (i12 == 1) {
                        int resourceId = typedArray.getResourceId(index, -1);
                        this.f3631g = resourceId;
                        if (resourceId != -1) {
                            this.f3629e = -2;
                        }
                    } else if (i12 == 3) {
                        String string = typedArray.getString(index);
                        this.f3630f = string;
                        if (string != null) {
                            if (string.indexOf("/") > 0) {
                                this.f3631g = typedArray.getResourceId(index, -1);
                                this.f3629e = -2;
                            } else {
                                this.f3629e = -1;
                            }
                        }
                    } else {
                        this.f3629e = typedArray.getInteger(index, this.f3629e);
                    }
                } else if (index == androidx.constraintlayout.widget.i.f4191z8) {
                    int i13 = typedArray.getInt(index, this.f3632h);
                    this.f3632h = i13;
                    if (i13 < 8) {
                        this.f3632h = 8;
                    }
                } else if (index == androidx.constraintlayout.widget.i.D8) {
                    this.f3633i = typedArray.getFloat(index, this.f3633i);
                } else if (index == androidx.constraintlayout.widget.i.f4161w8) {
                    this.f3638n = typedArray.getInteger(index, this.f3638n);
                } else if (index == androidx.constraintlayout.widget.i.f4151v8) {
                    this.f3625a = typedArray.getResourceId(index, this.f3625a);
                } else if (index == androidx.constraintlayout.widget.i.E8) {
                    this.f3639o = typedArray.getBoolean(index, this.f3639o);
                } else if (index == androidx.constraintlayout.widget.i.C8) {
                    this.f3640p = typedArray.getInteger(index, -1);
                } else if (index == androidx.constraintlayout.widget.i.A8) {
                    this.f3641q = typedArray.getInteger(index, 0);
                } else if (index == androidx.constraintlayout.widget.i.F8) {
                    this.f3642r = typedArray.getInteger(index, 0);
                }
            }
            if (this.f3628d == -1) {
                this.f3626b = true;
            }
        }

        private void u(r rVar, Context context, AttributeSet attributeSet) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.i.f4141u8);
            t(rVar, context, obtainStyledAttributes);
            obtainStyledAttributes.recycle();
        }

        public boolean A() {
            return !this.f3639o;
        }

        public boolean B(int i11) {
            return (i11 & this.f3642r) != 0;
        }

        public void C(int i11) {
            this.f3632h = Math.max(i11, 8);
        }

        public void D(int i11, String str, int i12) {
            this.f3629e = i11;
            this.f3630f = str;
            this.f3631g = i12;
        }

        public void E(int i11) {
            this.f3640p = i11;
        }

        public void r(g gVar) {
            this.f3635k.add(gVar);
        }

        public void s(Context context, XmlPullParser xmlPullParser) {
            this.f3637m.add(new a(context, this, xmlPullParser));
        }

        public int v() {
            return this.f3638n;
        }

        public int w() {
            return this.f3627c;
        }

        public int x() {
            return this.f3641q;
        }

        public int y() {
            return this.f3628d;
        }

        public s z() {
            return this.f3636l;
        }

        public b(int i11, r rVar, int i12, int i13) {
            this.f3625a = -1;
            this.f3626b = false;
            this.f3627c = -1;
            this.f3628d = -1;
            this.f3629e = 0;
            this.f3630f = null;
            this.f3631g = -1;
            this.f3632h = 400;
            this.f3633i = BitmapDescriptorFactory.HUE_RED;
            this.f3635k = new ArrayList<>();
            this.f3636l = null;
            this.f3637m = new ArrayList<>();
            this.f3638n = 0;
            this.f3639o = false;
            this.f3640p = -1;
            this.f3641q = 0;
            this.f3642r = 0;
            this.f3625a = i11;
            this.f3634j = rVar;
            this.f3628d = i12;
            this.f3627c = i13;
            this.f3632h = rVar.f3614l;
            this.f3641q = rVar.f3615m;
        }

        b(r rVar, Context context, XmlPullParser xmlPullParser) {
            this.f3625a = -1;
            this.f3626b = false;
            this.f3627c = -1;
            this.f3628d = -1;
            this.f3629e = 0;
            this.f3630f = null;
            this.f3631g = -1;
            this.f3632h = 400;
            this.f3633i = BitmapDescriptorFactory.HUE_RED;
            this.f3635k = new ArrayList<>();
            this.f3636l = null;
            this.f3637m = new ArrayList<>();
            this.f3638n = 0;
            this.f3639o = false;
            this.f3640p = -1;
            this.f3641q = 0;
            this.f3642r = 0;
            this.f3632h = rVar.f3614l;
            this.f3641q = rVar.f3615m;
            this.f3634j = rVar;
            u(rVar, context, Xml.asAttributeSet(xmlPullParser));
        }
    }
}