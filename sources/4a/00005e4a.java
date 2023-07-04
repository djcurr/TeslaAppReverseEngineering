package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import androidx.fragment.app.z;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.swmansion.rnscreens.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.r0;
import wz.e0;

/* loaded from: classes6.dex */
public final class k extends f<m> {

    /* renamed from: t  reason: collision with root package name */
    public static final a f21259t = new a(null);

    /* renamed from: h  reason: collision with root package name */
    private final ArrayList<m> f21260h;

    /* renamed from: i  reason: collision with root package name */
    private final Set<m> f21261i;

    /* renamed from: j  reason: collision with root package name */
    private final List<b> f21262j;

    /* renamed from: k  reason: collision with root package name */
    private final List<b> f21263k;

    /* renamed from: l  reason: collision with root package name */
    private m f21264l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f21265m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f21266n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f21267o;

    /* renamed from: p  reason: collision with root package name */
    private int f21268p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f21269q;

    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(d.e eVar) {
            return eVar == d.e.DEFAULT || eVar == d.e.FADE || eVar == d.e.NONE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean e(m mVar) {
            return mVar.m().getStackPresentation() == d.f.TRANSPARENT_MODAL;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean f(m mVar) {
            return mVar.m().getStackAnimation() == d.e.SLIDE_FROM_BOTTOM || mVar.m().getStackAnimation() == d.e.FADE_FROM_BOTTOM;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes6.dex */
    public final class b {

        /* renamed from: a  reason: collision with root package name */
        private Canvas f21270a;

        /* renamed from: b  reason: collision with root package name */
        private View f21271b;

        /* renamed from: c  reason: collision with root package name */
        private long f21272c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ k f21273d;

        public b(k this$0) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            this.f21273d = this$0;
        }

        public final void a() {
            this.f21273d.F(this);
            this.f21270a = null;
            this.f21271b = null;
            this.f21272c = 0L;
        }

        public final Canvas b() {
            return this.f21270a;
        }

        public final View c() {
            return this.f21271b;
        }

        public final long d() {
            return this.f21272c;
        }

        public final b e(Canvas canvas, View view, long j11) {
            this.f21270a = canvas;
            this.f21271b = view;
            this.f21272c = j11;
            return this;
        }
    }

    /* loaded from: classes6.dex */
    public /* synthetic */ class c {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f21274a;

        static {
            int[] iArr = new int[d.e.values().length];
            iArr[d.e.SLIDE_FROM_RIGHT.ordinal()] = 1;
            iArr[d.e.SLIDE_FROM_LEFT.ordinal()] = 2;
            iArr[d.e.SLIDE_FROM_BOTTOM.ordinal()] = 3;
            iArr[d.e.FADE_FROM_BOTTOM.ordinal()] = 4;
            f21274a = iArr;
        }
    }

    public k(Context context) {
        super(context);
        this.f21260h = new ArrayList<>();
        this.f21261i = new HashSet();
        this.f21262j = new ArrayList();
        this.f21263k = new ArrayList();
    }

    private final void A() {
        com.facebook.react.uimanager.events.d eventDispatcher;
        Context context = getContext();
        Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
        UIManagerModule uIManagerModule = (UIManagerModule) ((ReactContext) context).getNativeModule(UIManagerModule.class);
        if (uIManagerModule == null || (eventDispatcher = uIManagerModule.getEventDispatcher()) == null) {
            return;
        }
        eventDispatcher.g(new yr.h(getId()));
    }

    private final void B() {
        int size = this.f21263k.size() - 1;
        if (size >= 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                b bVar = this.f21263k.get(i11);
                bVar.a();
                this.f21262j.add(bVar);
                if (i12 > size) {
                    break;
                }
                i11 = i12;
            }
        }
        this.f21263k.clear();
    }

    private final b C() {
        if (this.f21262j.isEmpty()) {
            return new b(this);
        }
        List<b> list = this.f21262j;
        return list.remove(list.size() - 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(m mVar) {
        d m11;
        if (mVar == null || (m11 = mVar.m()) == null) {
            return;
        }
        m11.bringToFront();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(b bVar) {
        super.drawChild(bVar.b(), bVar.c(), bVar.d());
    }

    public final void E() {
        if (this.f21265m) {
            return;
        }
        A();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.f21263k.size() < this.f21268p) {
            this.f21267o = false;
        }
        this.f21268p = this.f21263k.size();
        if (this.f21267o && this.f21263k.size() >= 2) {
            List<b> list = this.f21263k;
            Collections.swap(list, list.size() - 1, this.f21263k.size() - 2);
        }
        B();
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j11) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        kotlin.jvm.internal.s.g(child, "child");
        this.f21263k.add(C().e(canvas, child, j11));
        return true;
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        super.endViewTransition(view);
        if (this.f21265m) {
            this.f21265m = false;
            A();
        }
    }

    public final boolean getGoingForward() {
        return this.f21269q;
    }

    public final d getRootScreen() {
        boolean T;
        int screenCount = getScreenCount();
        for (int i11 = 0; i11 < screenCount; i11++) {
            d i12 = i(i11);
            T = e0.T(this.f21261i, i12.getFragment());
            if (!T) {
                return i12;
            }
        }
        throw new IllegalStateException("Stack has no root screen set");
    }

    @Override // com.swmansion.rnscreens.f
    public d getTopScreen() {
        m mVar = this.f21264l;
        if (mVar == null) {
            return null;
        }
        return mVar.m();
    }

    @Override // com.swmansion.rnscreens.f
    public boolean j(i iVar) {
        boolean T;
        if (super.j(iVar)) {
            T = e0.T(this.f21261i, iVar);
            if (!T) {
                return true;
            }
        }
        return false;
    }

    @Override // com.swmansion.rnscreens.f
    protected void m() {
        Iterator<m> it2 = this.f21260h.iterator();
        while (it2.hasNext()) {
            it2.next().n();
        }
    }

    @Override // com.swmansion.rnscreens.f
    public void p() {
        boolean T;
        boolean z11;
        d m11;
        m mVar;
        this.f21266n = false;
        int size = this.f21242a.size() - 1;
        d.e eVar = null;
        final m mVar2 = null;
        m mVar3 = null;
        if (size >= 0) {
            while (true) {
                int i11 = size - 1;
                Object obj = this.f21242a.get(size);
                kotlin.jvm.internal.s.f(obj, "mScreenFragments[i]");
                m mVar4 = (m) obj;
                if (!this.f21261i.contains(mVar4)) {
                    if (mVar2 == null) {
                        mVar2 = mVar4;
                    } else {
                        mVar3 = mVar4;
                    }
                    if (!f21259t.e(mVar4)) {
                        break;
                    }
                }
                if (i11 < 0) {
                    break;
                }
                size = i11;
            }
        }
        T = e0.T(this.f21260h, mVar2);
        boolean z12 = true;
        if (!T) {
            m mVar5 = this.f21264l;
            if (mVar5 != null && mVar2 != null) {
                z11 = (mVar5 != null && this.f21242a.contains(mVar5)) || mVar2.m().getReplaceAnimation() != d.EnumC0387d.POP;
                eVar = mVar2.m().getStackAnimation();
            } else {
                if (mVar5 == null && mVar2 != null && mVar2.m().getStackAnimation() != (eVar = d.e.NONE) && !k()) {
                    this.f21269q = true;
                    mVar2.h();
                    mVar2.f();
                }
                z11 = true;
            }
        } else {
            m mVar6 = this.f21264l;
            if (mVar6 != null && !kotlin.jvm.internal.s.c(mVar6, mVar2)) {
                m mVar7 = this.f21264l;
                if (mVar7 != null && (m11 = mVar7.m()) != null) {
                    eVar = m11.getStackAnimation();
                }
                z11 = false;
            }
            z11 = true;
        }
        z f11 = f();
        int i12 = 4097;
        if (eVar != null) {
            if (z11) {
                int i13 = c.f21274a[eVar.ordinal()];
                if (i13 == 1) {
                    f11.u(com.swmansion.rnscreens.a.rns_slide_in_from_right, com.swmansion.rnscreens.a.rns_slide_out_to_left);
                } else if (i13 == 2) {
                    f11.u(com.swmansion.rnscreens.a.rns_slide_in_from_left, com.swmansion.rnscreens.a.rns_slide_out_to_right);
                } else if (i13 == 3) {
                    f11.u(com.swmansion.rnscreens.a.rns_slide_in_from_bottom, com.swmansion.rnscreens.a.rns_no_animation_medium);
                } else if (i13 == 4) {
                    f11.u(com.swmansion.rnscreens.a.rns_fade_from_bottom, com.swmansion.rnscreens.a.rns_no_animation_350);
                }
            } else {
                i12 = 8194;
                int i14 = c.f21274a[eVar.ordinal()];
                if (i14 == 1) {
                    f11.u(com.swmansion.rnscreens.a.rns_slide_in_from_left, com.swmansion.rnscreens.a.rns_slide_out_to_right);
                } else if (i14 == 2) {
                    f11.u(com.swmansion.rnscreens.a.rns_slide_in_from_right, com.swmansion.rnscreens.a.rns_slide_out_to_left);
                } else if (i14 == 3) {
                    f11.u(com.swmansion.rnscreens.a.rns_no_animation_medium, com.swmansion.rnscreens.a.rns_slide_out_to_bottom);
                } else if (i14 == 4) {
                    f11.u(com.swmansion.rnscreens.a.rns_no_animation_250, com.swmansion.rnscreens.a.rns_fade_to_bottom);
                }
            }
        }
        if (eVar == d.e.NONE) {
            i12 = 0;
        }
        if (eVar == d.e.FADE) {
            i12 = 4099;
        }
        if (eVar != null && f21259t.d(eVar)) {
            f11.y(i12);
        }
        setGoingForward(z11);
        if (z11 && mVar2 != null && f21259t.f(mVar2) && mVar3 == null) {
            this.f21266n = true;
        }
        Iterator<m> it2 = this.f21260h.iterator();
        while (it2.hasNext()) {
            m next = it2.next();
            if (!this.f21242a.contains(next) || this.f21261i.contains(next)) {
                f11.o(next);
            }
        }
        Iterator it3 = this.f21242a.iterator();
        while (it3.hasNext() && (mVar = (m) it3.next()) != mVar3) {
            if (mVar != mVar2 && !this.f21261i.contains(mVar)) {
                f11.o(mVar);
            }
        }
        if (mVar3 != null && !mVar3.isAdded()) {
            Iterator it4 = this.f21242a.iterator();
            while (it4.hasNext()) {
                m mVar8 = (m) it4.next();
                if (z12) {
                    if (mVar8 == mVar3) {
                        z12 = false;
                    }
                }
                f11.b(getId(), mVar8).t(new Runnable() { // from class: com.swmansion.rnscreens.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.D(m.this);
                    }
                });
            }
        } else if (mVar2 != null && !mVar2.isAdded()) {
            f11.b(getId(), mVar2);
        }
        this.f21264l = mVar2;
        this.f21260h.clear();
        this.f21260h.addAll(this.f21242a);
        f11.k();
    }

    @Override // com.swmansion.rnscreens.f, android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        if (this.f21266n) {
            this.f21266n = false;
            this.f21267o = true;
        }
        super.removeView(view);
    }

    @Override // com.swmansion.rnscreens.f
    public void s() {
        this.f21261i.clear();
        super.s();
    }

    public final void setGoingForward(boolean z11) {
        this.f21269q = z11;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        super.startViewTransition(view);
        this.f21265m = true;
    }

    @Override // com.swmansion.rnscreens.f
    public void u(int i11) {
        d i12 = i(i11);
        Set<m> set = this.f21261i;
        i fragment = i12.getFragment();
        Objects.requireNonNull(set, "null cannot be cast to non-null type kotlin.collections.MutableCollection<T>");
        r0.a(set).remove(fragment);
        super.u(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.swmansion.rnscreens.f
    /* renamed from: y */
    public m c(d screen) {
        kotlin.jvm.internal.s.g(screen, "screen");
        return new m(screen);
    }

    public final void z(m screenFragment) {
        kotlin.jvm.internal.s.g(screenFragment, "screenFragment");
        this.f21261i.add(screenFragment);
        r();
    }
}