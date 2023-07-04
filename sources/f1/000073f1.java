package i;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.k0;
import androidx.collection.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import i.b;
import i.d;
import l3.i;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class a extends i.d implements n3.b {

    /* renamed from: o  reason: collision with root package name */
    private c f29500o;

    /* renamed from: p  reason: collision with root package name */
    private g f29501p;

    /* renamed from: q  reason: collision with root package name */
    private int f29502q;

    /* renamed from: t  reason: collision with root package name */
    private int f29503t;

    /* renamed from: w  reason: collision with root package name */
    private boolean f29504w;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b extends g {

        /* renamed from: a  reason: collision with root package name */
        private final Animatable f29505a;

        b(Animatable animatable) {
            super();
            this.f29505a = animatable;
        }

        @Override // i.a.g
        public void c() {
            this.f29505a.start();
        }

        @Override // i.a.g
        public void d() {
            this.f29505a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends d.a {
        androidx.collection.d<Long> K;
        h<Integer> L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
                return;
            }
            this.K = new androidx.collection.d<>();
            this.L = new h<>();
        }

        private static long D(int i11, int i12) {
            return i12 | (i11 << 32);
        }

        int B(int[] iArr, Drawable drawable, int i11) {
            int z11 = super.z(iArr, drawable);
            this.L.l(z11, Integer.valueOf(i11));
            return z11;
        }

        int C(int i11, int i12, Drawable drawable, boolean z11) {
            int a11 = super.a(drawable);
            long D = D(i11, i12);
            long j11 = z11 ? 8589934592L : 0L;
            long j12 = a11;
            this.K.a(D, Long.valueOf(j12 | j11));
            if (z11) {
                this.K.a(D(i12, i11), Long.valueOf(4294967296L | j12 | j11));
            }
            return a11;
        }

        int E(int i11) {
            if (i11 < 0) {
                return 0;
            }
            return this.L.h(i11, 0).intValue();
        }

        int F(int[] iArr) {
            int A = super.A(iArr);
            return A >= 0 ? A : super.A(StateSet.WILD_CARD);
        }

        int G(int i11, int i12) {
            return (int) this.K.g(D(i11, i12), -1L).longValue();
        }

        boolean H(int i11, int i12) {
            return (this.K.g(D(i11, i12), -1L).longValue() & 4294967296L) != 0;
        }

        boolean I(int i11, int i12) {
            return (this.K.g(D(i11, i12), -1L).longValue() & 8589934592L) != 0;
        }

        @Override // i.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // i.d.a, i.b.d
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // i.d.a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends g {

        /* renamed from: a  reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f29506a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f29506a = cVar;
        }

        @Override // i.a.g
        public void c() {
            this.f29506a.start();
        }

        @Override // i.a.g
        public void d() {
            this.f29506a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends g {

        /* renamed from: a  reason: collision with root package name */
        private final ObjectAnimator f29507a;

        /* renamed from: b  reason: collision with root package name */
        private final boolean f29508b;

        e(AnimationDrawable animationDrawable, boolean z11, boolean z12) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i11 = z11 ? numberOfFrames - 1 : 0;
            int i12 = z11 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z11);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i11, i12);
            if (Build.VERSION.SDK_INT >= 18) {
                ofInt.setAutoCancel(true);
            }
            ofInt.setDuration(fVar.a());
            ofInt.setInterpolator(fVar);
            this.f29508b = z12;
            this.f29507a = ofInt;
        }

        @Override // i.a.g
        public boolean a() {
            return this.f29508b;
        }

        @Override // i.a.g
        public void b() {
            this.f29507a.reverse();
        }

        @Override // i.a.g
        public void c() {
            this.f29507a.start();
        }

        @Override // i.a.g
        public void d() {
            this.f29507a.cancel();
        }
    }

    /* loaded from: classes.dex */
    private static class f implements TimeInterpolator {

        /* renamed from: a  reason: collision with root package name */
        private int[] f29509a;

        /* renamed from: b  reason: collision with root package name */
        private int f29510b;

        /* renamed from: c  reason: collision with root package name */
        private int f29511c;

        f(AnimationDrawable animationDrawable, boolean z11) {
            b(animationDrawable, z11);
        }

        int a() {
            return this.f29511c;
        }

        int b(AnimationDrawable animationDrawable, boolean z11) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f29510b = numberOfFrames;
            int[] iArr = this.f29509a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f29509a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f29509a;
            int i11 = 0;
            for (int i12 = 0; i12 < numberOfFrames; i12++) {
                int duration = animationDrawable.getDuration(z11 ? (numberOfFrames - i12) - 1 : i12);
                iArr2[i12] = duration;
                i11 += duration;
            }
            this.f29511c = i11;
            return i11;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f11) {
            int i11 = (int) ((f11 * this.f29511c) + 0.5f);
            int i12 = this.f29510b;
            int[] iArr = this.f29509a;
            int i13 = 0;
            while (i13 < i12 && i11 >= iArr[i13]) {
                i11 -= iArr[i13];
                i13++;
            }
            return (i13 / i12) + (i13 < i12 ? i11 / this.f29511c : BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public static a m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.n(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    r(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void p() {
        onStateChange(getState());
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k11 = i.k(resources, theme, attributeSet, j.b.f32999h);
        int resourceId = k11.getResourceId(j.b.f33000i, 0);
        int resourceId2 = k11.getResourceId(j.b.f33001j, -1);
        Drawable j11 = resourceId2 > 0 ? k0.h().j(context, resourceId2) : null;
        k11.recycle();
        int[] k12 = k(attributeSet);
        if (j11 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    j11 = androidx.vectordrawable.graphics.drawable.i.c(resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    j11 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                } else {
                    j11 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j11 != null) {
            return this.f29500o.B(k12, j11, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int next;
        TypedArray k11 = i.k(resources, theme, attributeSet, j.b.f33002k);
        int resourceId = k11.getResourceId(j.b.f33005n, -1);
        int resourceId2 = k11.getResourceId(j.b.f33004m, -1);
        int resourceId3 = k11.getResourceId(j.b.f33003l, -1);
        Drawable j11 = resourceId3 > 0 ? k0.h().j(context, resourceId3) : null;
        boolean z11 = k11.getBoolean(j.b.f33006o, false);
        k11.recycle();
        if (j11 == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    j11 = androidx.vectordrawable.graphics.drawable.c.a(context, resources, xmlPullParser, attributeSet, theme);
                } else if (Build.VERSION.SDK_INT >= 21) {
                    j11 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                } else {
                    j11 = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (j11 == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        } else if (resourceId != -1 && resourceId2 != -1) {
            return this.f29500o.C(resourceId, resourceId2, j11, z11);
        } else {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
    }

    private boolean s(int i11) {
        int c11;
        int G;
        g bVar;
        g gVar = this.f29501p;
        if (gVar != null) {
            if (i11 == this.f29502q) {
                return true;
            }
            if (i11 == this.f29503t && gVar.a()) {
                gVar.b();
                this.f29502q = this.f29503t;
                this.f29503t = i11;
                return true;
            }
            c11 = this.f29502q;
            gVar.d();
        } else {
            c11 = c();
        }
        this.f29501p = null;
        this.f29503t = -1;
        this.f29502q = -1;
        c cVar = this.f29500o;
        int E = cVar.E(c11);
        int E2 = cVar.E(i11);
        if (E2 == 0 || E == 0 || (G = cVar.G(E, E2)) < 0) {
            return false;
        }
        boolean I = cVar.I(E, E2);
        g(G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(E, E2), I);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.c) {
            bVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        } else {
            if (current instanceof Animatable) {
                bVar = new b((Animatable) current);
            }
            return false;
        }
        bVar.c();
        this.f29501p = bVar;
        this.f29503t = c11;
        this.f29502q = i11;
        return true;
    }

    private void t(TypedArray typedArray) {
        c cVar = this.f29500o;
        if (Build.VERSION.SDK_INT >= 21) {
            cVar.f29529d |= typedArray.getChangingConfigurations();
        }
        cVar.x(typedArray.getBoolean(j.b.f32995d, cVar.f29534i));
        cVar.t(typedArray.getBoolean(j.b.f32996e, cVar.f29537l));
        cVar.u(typedArray.getInt(j.b.f32997f, cVar.A));
        cVar.v(typedArray.getInt(j.b.f32998g, cVar.B));
        setDither(typedArray.getBoolean(j.b.f32993b, cVar.f29549x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i.d, i.b
    public void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f29500o = (c) dVar;
        }
    }

    @Override // i.d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f29501p;
        if (gVar != null) {
            gVar.d();
            this.f29501p = null;
            g(this.f29502q);
            this.f29502q = -1;
            this.f29503t = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // i.d
    /* renamed from: l */
    public c j() {
        return new c(this.f29500o, this, null);
    }

    @Override // i.d, i.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f29504w && super.mutate() == this) {
            this.f29500o.r();
            this.f29504w = true;
        }
        return this;
    }

    public void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray k11 = i.k(resources, theme, attributeSet, j.b.f32992a);
        setVisible(k11.getBoolean(j.b.f32994c, true), true);
        t(k11);
        i(resources);
        k11.recycle();
        o(context, resources, xmlPullParser, attributeSet, theme);
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // i.d, i.b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        int F = this.f29500o.F(iArr);
        boolean z11 = F != c() && (s(F) || g(F));
        Drawable current = getCurrent();
        return current != null ? z11 | current.setState(iArr) : z11;
    }

    @Override // i.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        g gVar = this.f29501p;
        if (gVar != null && (visible || z12)) {
            if (z11) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    a(c cVar, Resources resources) {
        super(null);
        this.f29502q = -1;
        this.f29503t = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}