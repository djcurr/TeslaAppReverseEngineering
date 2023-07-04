package androidx.compose.ui.platform;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.SpannableString;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.compose.ui.platform.c;
import androidx.compose.ui.platform.h;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import h2.f0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l2.e;
import l2.h;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import w3.c;

/* loaded from: classes.dex */
public final class t extends androidx.core.view.a {

    /* renamed from: x */
    private static final int[] f3059x;

    /* renamed from: a */
    private final AndroidComposeView f3060a;

    /* renamed from: b */
    private int f3061b;

    /* renamed from: c */
    private final AccessibilityManager f3062c;

    /* renamed from: d */
    private boolean f3063d;

    /* renamed from: e */
    private final Handler f3064e;

    /* renamed from: f */
    private w3.d f3065f;

    /* renamed from: g */
    private int f3066g;

    /* renamed from: h */
    private androidx.collection.h<androidx.collection.h<CharSequence>> f3067h;

    /* renamed from: i */
    private androidx.collection.h<Map<CharSequence, Integer>> f3068i;

    /* renamed from: j */
    private int f3069j;

    /* renamed from: k */
    private Integer f3070k;

    /* renamed from: l */
    private final androidx.collection.b<h2.k> f3071l;

    /* renamed from: m */
    private final x20.e<vz.b0> f3072m;

    /* renamed from: n */
    private boolean f3073n;

    /* renamed from: o */
    private f f3074o;

    /* renamed from: p */
    private Map<Integer, l1> f3075p;

    /* renamed from: q */
    private androidx.collection.b<Integer> f3076q;

    /* renamed from: r */
    private Map<Integer, g> f3077r;

    /* renamed from: s */
    private g f3078s;

    /* renamed from: t */
    private boolean f3079t;

    /* renamed from: u */
    private final Runnable f3080u;

    /* renamed from: v */
    private final List<k1> f3081v;

    /* renamed from: w */
    private final h00.l<k1, vz.b0> f3082w;

    /* loaded from: classes.dex */
    public static final class a implements View.OnAttachStateChangeListener {
        a() {
            t.this = r1;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            kotlin.jvm.internal.s.g(view, "view");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            kotlin.jvm.internal.s.g(view, "view");
            t.this.f3064e.removeCallbacks(t.this.f3080u);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        public static final a f3084a = new a(null);

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void a(w3.c info, l2.p semanticsNode) {
                boolean k11;
                l2.a aVar;
                kotlin.jvm.internal.s.g(info, "info");
                kotlin.jvm.internal.s.g(semanticsNode, "semanticsNode");
                k11 = u.k(semanticsNode);
                if (!k11 || (aVar = (l2.a) l2.l.a(semanticsNode.t(), l2.j.f36419a.m())) == null) {
                    return;
                }
                info.b(new c.a(16908349, aVar.b()));
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a */
        public static final a f3085a = new a(null);

        /* loaded from: classes.dex */
        public static final class a {
            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final void a(AccessibilityEvent event, int i11, int i12) {
                kotlin.jvm.internal.s.g(event, "event");
                event.setScrollDeltaX(i11);
                event.setScrollDeltaY(i12);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class d {
        private d() {
        }

        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public final class e extends AccessibilityNodeProvider {

        /* renamed from: a */
        final /* synthetic */ t f3086a;

        public e(t this$0) {
            kotlin.jvm.internal.s.g(this$0, "this$0");
            this.f3086a = this$0;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i11, AccessibilityNodeInfo info, String extraDataKey, Bundle bundle) {
            kotlin.jvm.internal.s.g(info, "info");
            kotlin.jvm.internal.s.g(extraDataKey, "extraDataKey");
            this.f3086a.j(i11, info, extraDataKey, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i11) {
            return this.f3086a.q(i11);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i11, int i12, Bundle bundle) {
            return this.f3086a.I(i11, i12, bundle);
        }
    }

    /* loaded from: classes.dex */
    public static final class f {

        /* renamed from: a */
        private final l2.p f3087a;

        /* renamed from: b */
        private final int f3088b;

        /* renamed from: c */
        private final int f3089c;

        /* renamed from: d */
        private final int f3090d;

        /* renamed from: e */
        private final int f3091e;

        /* renamed from: f */
        private final long f3092f;

        public f(l2.p node, int i11, int i12, int i13, int i14, long j11) {
            kotlin.jvm.internal.s.g(node, "node");
            this.f3087a = node;
            this.f3088b = i11;
            this.f3089c = i12;
            this.f3090d = i13;
            this.f3091e = i14;
            this.f3092f = j11;
        }

        public final int a() {
            return this.f3088b;
        }

        public final int b() {
            return this.f3090d;
        }

        public final int c() {
            return this.f3089c;
        }

        public final l2.p d() {
            return this.f3087a;
        }

        public final int e() {
            return this.f3091e;
        }

        public final long f() {
            return this.f3092f;
        }
    }

    /* loaded from: classes.dex */
    public static final class g {

        /* renamed from: a */
        private final l2.k f3093a;

        /* renamed from: b */
        private final Set<Integer> f3094b;

        public g(l2.p semanticsNode, Map<Integer, l1> currentSemanticsNodes) {
            kotlin.jvm.internal.s.g(semanticsNode, "semanticsNode");
            kotlin.jvm.internal.s.g(currentSemanticsNodes, "currentSemanticsNodes");
            this.f3093a = semanticsNode.t();
            this.f3094b = new LinkedHashSet();
            List<l2.p> p11 = semanticsNode.p();
            int size = p11.size();
            int i11 = 0;
            while (i11 < size) {
                int i12 = i11 + 1;
                l2.p pVar = p11.get(i11);
                if (currentSemanticsNodes.containsKey(Integer.valueOf(pVar.i()))) {
                    a().add(Integer.valueOf(pVar.i()));
                }
                i11 = i12;
            }
        }

        public final Set<Integer> a() {
            return this.f3094b;
        }

        public final l2.k b() {
            return this.f3093a;
        }

        public final boolean c() {
            return this.f3093a.e(l2.s.f36459a.p());
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class h {

        /* renamed from: a */
        public static final /* synthetic */ int[] f3095a;

        static {
            int[] iArr = new int[m2.a.values().length];
            iArr[m2.a.On.ordinal()] = 1;
            iArr[m2.a.Off.ordinal()] = 2;
            iArr[m2.a.Indeterminate.ordinal()] = 3;
            f3095a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat", f = "AndroidComposeViewAccessibilityDelegateCompat.android.kt", l = {1604, 1633}, m = "boundsUpdatesEventLoop")
    /* loaded from: classes.dex */
    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a */
        Object f3096a;

        /* renamed from: b */
        Object f3097b;

        /* renamed from: c */
        Object f3098c;

        /* renamed from: d */
        /* synthetic */ Object f3099d;

        /* renamed from: f */
        int f3101f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(zz.d<? super i> dVar) {
            super(dVar);
            t.this = r1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f3099d = obj;
            this.f3101f |= Integer.MIN_VALUE;
            return t.this.k(this);
        }
    }

    /* loaded from: classes.dex */
    public static final class j extends kotlin.jvm.internal.u implements h00.l<h2.k, Boolean> {

        /* renamed from: a */
        public static final j f3102a = new j();

        j() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(h2.k parent) {
            l2.k j22;
            kotlin.jvm.internal.s.g(parent, "parent");
            l2.x j11 = l2.q.j(parent);
            return Boolean.valueOf((j11 == null || (j22 = j11.j2()) == null || !j22.m()) ? false : true);
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends kotlin.jvm.internal.u implements h00.a<vz.b0> {

        /* renamed from: a */
        final /* synthetic */ k1 f3103a;

        /* renamed from: b */
        final /* synthetic */ t f3104b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(k1 k1Var, t tVar) {
            super(0);
            this.f3103a = k1Var;
            this.f3104b = tVar;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo11invoke() {
            invoke2();
            return vz.b0.f54756a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x005b, code lost:
            if ((r2 == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) == false) goto L23;
         */
        /* renamed from: invoke */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void invoke2() {
            /*
                Method dump skipped, instructions count: 258
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.t.k.invoke2():void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class l extends kotlin.jvm.internal.u implements h00.l<k1, vz.b0> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l() {
            super(1);
            t.this = r1;
        }

        public final void a(k1 it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            t.this.X(it2);
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(k1 k1Var) {
            a(k1Var);
            return vz.b0.f54756a;
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends kotlin.jvm.internal.u implements h00.l<h2.k, Boolean> {

        /* renamed from: a */
        public static final m f3106a = new m();

        m() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(h2.k it2) {
            l2.k j22;
            kotlin.jvm.internal.s.g(it2, "it");
            l2.x j11 = l2.q.j(it2);
            return Boolean.valueOf((j11 == null || (j22 = j11.j2()) == null || !j22.m()) ? false : true);
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends kotlin.jvm.internal.u implements h00.l<h2.k, Boolean> {

        /* renamed from: a */
        public static final n f3107a = new n();

        n() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Boolean mo12invoke(h2.k it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Boolean.valueOf(l2.q.j(it2) != null);
        }
    }

    static {
        new d(null);
        f3059x = new int[]{o1.g.f42064a, o1.g.f42065b, o1.g.f42076m, o1.g.f42087x, o1.g.A, o1.g.B, o1.g.C, o1.g.D, o1.g.E, o1.g.F, o1.g.f42066c, o1.g.f42067d, o1.g.f42068e, o1.g.f42069f, o1.g.f42070g, o1.g.f42071h, o1.g.f42072i, o1.g.f42073j, o1.g.f42074k, o1.g.f42075l, o1.g.f42077n, o1.g.f42078o, o1.g.f42079p, o1.g.f42080q, o1.g.f42081r, o1.g.f42082s, o1.g.f42083t, o1.g.f42084u, o1.g.f42085v, o1.g.f42086w, o1.g.f42088y, o1.g.f42089z};
    }

    public t(AndroidComposeView view) {
        Map<Integer, l1> i11;
        Map i12;
        kotlin.jvm.internal.s.g(view, "view");
        this.f3060a = view;
        this.f3061b = Integer.MIN_VALUE;
        Object systemService = view.getContext().getSystemService("accessibility");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.f3062c = (AccessibilityManager) systemService;
        this.f3064e = new Handler(Looper.getMainLooper());
        this.f3065f = new w3.d(new e(this));
        this.f3066g = Integer.MIN_VALUE;
        this.f3067h = new androidx.collection.h<>();
        this.f3068i = new androidx.collection.h<>();
        this.f3069j = -1;
        this.f3071l = new androidx.collection.b<>();
        this.f3072m = x20.h.b(-1, null, null, 6, null);
        this.f3073n = true;
        i11 = wz.s0.i();
        this.f3075p = i11;
        this.f3076q = new androidx.collection.b<>();
        this.f3077r = new LinkedHashMap();
        l2.p a11 = view.getSemanticsOwner().a();
        i12 = wz.s0.i();
        this.f3078s = new g(a11, i12);
        view.addOnAttachStateChangeListener(new a());
        this.f3080u = new Runnable() { // from class: androidx.compose.ui.platform.s
            {
                t.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                t.a(t.this);
            }
        };
        this.f3081v = new ArrayList();
        this.f3082w = new l();
    }

    private final boolean C() {
        return this.f3063d || (this.f3062c.isEnabled() && this.f3062c.isTouchExplorationEnabled());
    }

    private final boolean D(int i11) {
        return this.f3066g == i11;
    }

    private final boolean E(l2.p pVar) {
        l2.k t11 = pVar.t();
        l2.s sVar = l2.s.f36459a;
        return !t11.e(sVar.c()) && pVar.t().e(sVar.e());
    }

    private final void F(h2.k kVar) {
        if (this.f3071l.add(kVar)) {
            this.f3072m.d(vz.b0.f54756a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:482:0x00f3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0113 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:493:0x0114  */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v60 */
    /* JADX WARN: Type inference failed for: r14v22 */
    /* JADX WARN: Type inference failed for: r14v23 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:485:0x00fa -> B:476:0x00dc). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:488:0x0101 -> B:476:0x00dc). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean I(int r13, int r14, android.os.Bundle r15) {
        /*
            Method dump skipped, instructions count: 1538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.t.I(int, int, android.os.Bundle):boolean");
    }

    private static final boolean J(l2.i iVar, float f11) {
        return (f11 < BitmapDescriptorFactory.HUE_RED && iVar.c().mo11invoke().floatValue() > BitmapDescriptorFactory.HUE_RED) || (f11 > BitmapDescriptorFactory.HUE_RED && iVar.c().mo11invoke().floatValue() < iVar.a().mo11invoke().floatValue());
    }

    private static final float K(float f11, float f12) {
        return (Math.signum(f11) > Math.signum(f12) ? 1 : (Math.signum(f11) == Math.signum(f12) ? 0 : -1)) == 0 ? Math.abs(f11) < Math.abs(f12) ? f11 : f12 : BitmapDescriptorFactory.HUE_RED;
    }

    private static final boolean M(l2.i iVar) {
        return (iVar.c().mo11invoke().floatValue() > BitmapDescriptorFactory.HUE_RED && !iVar.b()) || (iVar.c().mo11invoke().floatValue() < iVar.a().mo11invoke().floatValue() && iVar.b());
    }

    private static final boolean N(l2.i iVar) {
        return (iVar.c().mo11invoke().floatValue() < iVar.a().mo11invoke().floatValue() && !iVar.b()) || (iVar.c().mo11invoke().floatValue() > BitmapDescriptorFactory.HUE_RED && iVar.b());
    }

    private final boolean O(int i11, List<k1> list) {
        boolean z11;
        k1 m11 = u.m(list, i11);
        if (m11 != null) {
            z11 = false;
        } else {
            k1 k1Var = new k1(i11, this.f3081v, null, null, null, null);
            z11 = true;
            m11 = k1Var;
        }
        this.f3081v.add(m11);
        return z11;
    }

    private final boolean P(int i11) {
        if (C() && !D(i11)) {
            int i12 = this.f3066g;
            if (i12 != Integer.MIN_VALUE) {
                U(this, i12, 65536, null, null, 12, null);
            }
            this.f3066g = i11;
            this.f3060a.invalidate();
            U(this, i11, 32768, null, null, 12, null);
            return true;
        }
        return false;
    }

    public static final void Q(t this$0) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        this$0.n();
        this$0.f3079t = false;
    }

    public final int R(int i11) {
        if (i11 == this.f3060a.getSemanticsOwner().a().i()) {
            return -1;
        }
        return i11;
    }

    public final boolean S(AccessibilityEvent accessibilityEvent) {
        if (C()) {
            return this.f3060a.getParent().requestSendAccessibilityEvent(this.f3060a, accessibilityEvent);
        }
        return false;
    }

    private final boolean T(int i11, int i12, Integer num, List<String> list) {
        if (i11 == Integer.MIN_VALUE || !C()) {
            return false;
        }
        AccessibilityEvent p11 = p(i11, i12);
        if (num != null) {
            p11.setContentChangeTypes(num.intValue());
        }
        if (list != null) {
            p11.setContentDescription(o1.j.d(list, ",", null, null, 0, null, null, 62, null));
        }
        return S(p11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean U(t tVar, int i11, int i12, Integer num, List list, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            num = null;
        }
        if ((i13 & 8) != 0) {
            list = null;
        }
        return tVar.T(i11, i12, num, list);
    }

    private final void V(int i11, int i12, String str) {
        AccessibilityEvent p11 = p(R(i11), 32);
        p11.setContentChangeTypes(i12);
        if (str != null) {
            p11.getText().add(str);
        }
        S(p11);
    }

    private final void W(int i11) {
        f fVar = this.f3074o;
        if (fVar != null) {
            if (i11 != fVar.d().i()) {
                return;
            }
            if (SystemClock.uptimeMillis() - fVar.f() <= 1000) {
                AccessibilityEvent p11 = p(R(fVar.d().i()), 131072);
                p11.setFromIndex(fVar.b());
                p11.setToIndex(fVar.e());
                p11.setAction(fVar.a());
                p11.setMovementGranularity(fVar.c());
                p11.getText().add(w(fVar.d()));
                S(p11);
            }
        }
        this.f3074o = null;
    }

    public final void X(k1 k1Var) {
        if (k1Var.isValid()) {
            this.f3060a.getSnapshotObserver().e(k1Var, this.f3082w, new k(k1Var, this));
        }
    }

    private final void Z(l2.p pVar, g gVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<l2.p> p11 = pVar.p();
        int size = p11.size();
        int i11 = 0;
        int i12 = 0;
        while (i12 < size) {
            int i13 = i12 + 1;
            l2.p pVar2 = p11.get(i12);
            if (v().containsKey(Integer.valueOf(pVar2.i()))) {
                if (!gVar.a().contains(Integer.valueOf(pVar2.i()))) {
                    F(pVar.k());
                    return;
                }
                linkedHashSet.add(Integer.valueOf(pVar2.i()));
            }
            i12 = i13;
        }
        for (Integer num : gVar.a()) {
            if (!linkedHashSet.contains(Integer.valueOf(num.intValue()))) {
                F(pVar.k());
                return;
            }
        }
        List<l2.p> p12 = pVar.p();
        int size2 = p12.size();
        while (i11 < size2) {
            int i14 = i11 + 1;
            l2.p pVar3 = p12.get(i11);
            if (v().containsKey(Integer.valueOf(pVar3.i()))) {
                g gVar2 = y().get(Integer.valueOf(pVar3.i()));
                kotlin.jvm.internal.s.e(gVar2);
                Z(pVar3, gVar2);
            }
            i11 = i14;
        }
    }

    public static /* synthetic */ void a(t tVar) {
        Q(tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0039, code lost:
        r8 = androidx.compose.ui.platform.u.n(r8, androidx.compose.ui.platform.t.m.f3106a);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a0(h2.k r8, androidx.collection.b<java.lang.Integer> r9) {
        /*
            r7 = this;
            boolean r0 = r8.u0()
            if (r0 != 0) goto L7
            return
        L7:
            androidx.compose.ui.platform.AndroidComposeView r0 = r7.f3060a
            androidx.compose.ui.platform.i0 r0 = r0.getAndroidViewsHandler$ui_release()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r8)
            if (r0 == 0) goto L18
            return
        L18:
            l2.x r0 = l2.q.j(r8)
            if (r0 != 0) goto L2f
            androidx.compose.ui.platform.t$n r0 = androidx.compose.ui.platform.t.n.f3107a
            h2.k r0 = androidx.compose.ui.platform.u.d(r8, r0)
            if (r0 != 0) goto L28
            r0 = 0
            goto L2c
        L28:
            l2.x r0 = l2.q.j(r0)
        L2c:
            if (r0 != 0) goto L2f
            return
        L2f:
            l2.k r1 = r0.j2()
            boolean r1 = r1.m()
            if (r1 != 0) goto L4a
            androidx.compose.ui.platform.t$m r1 = androidx.compose.ui.platform.t.m.f3106a
            h2.k r8 = androidx.compose.ui.platform.u.d(r8, r1)
            if (r8 != 0) goto L42
            goto L4a
        L42:
            l2.x r8 = l2.q.j(r8)
            if (r8 != 0) goto L49
            goto L4a
        L49:
            r0 = r8
        L4a:
            o1.f$c r8 = r0.a2()
            l2.m r8 = (l2.m) r8
            int r8 = r8.getId()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            boolean r9 = r9.add(r0)
            if (r9 != 0) goto L5f
            return
        L5f:
            int r1 = r7.R(r8)
            r2 = 2048(0x800, float:2.87E-42)
            r8 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r8)
            r4 = 0
            r5 = 8
            r6 = 0
            r0 = r7
            U(r0, r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.t.a0(h2.k, androidx.collection.b):void");
    }

    private final boolean b0(l2.p pVar, int i11, int i12, boolean z11) {
        String w11;
        boolean k11;
        Boolean bool;
        l2.k t11 = pVar.t();
        l2.j jVar = l2.j.f36419a;
        if (t11.e(jVar.n())) {
            k11 = u.k(pVar);
            if (k11) {
                h00.q qVar = (h00.q) ((l2.a) pVar.t().h(jVar.n())).a();
                if (qVar == null || (bool = (Boolean) qVar.invoke(Integer.valueOf(i11), Integer.valueOf(i12), Boolean.valueOf(z11))) == null) {
                    return false;
                }
                return bool.booleanValue();
            }
        }
        if ((i11 == i12 && i12 == this.f3069j) || (w11 = w(pVar)) == null) {
            return false;
        }
        this.f3069j = (i11 < 0 || i11 != i12 || i12 > w11.length()) ? -1 : -1;
        boolean z12 = w11.length() > 0;
        S(r(R(pVar.i()), z12 ? Integer.valueOf(this.f3069j) : null, z12 ? Integer.valueOf(this.f3069j) : null, z12 ? Integer.valueOf(w11.length()) : null, w11));
        W(pVar.i());
        return true;
    }

    private final void c0(l2.p pVar, w3.c cVar) {
        l2.k t11 = pVar.t();
        l2.s sVar = l2.s.f36459a;
        if (t11.e(sVar.f())) {
            cVar.h0(true);
            cVar.l0((CharSequence) l2.l.a(pVar.t(), sVar.f()));
        }
    }

    private final void d0(l2.p pVar, w3.c cVar) {
        n2.a aVar;
        n2.a z11 = z(pVar.t());
        SpannableString spannableString = null;
        SpannableString spannableString2 = (SpannableString) g0(z11 == null ? null : u2.a.b(z11, this.f3060a.getDensity(), this.f3060a.getFontLoader()), 100000);
        List list = (List) l2.l.a(pVar.t(), l2.s.f36459a.x());
        if (list != null && (aVar = (n2.a) wz.u.d0(list)) != null) {
            spannableString = u2.a.b(aVar, this.f3060a.getDensity(), this.f3060a.getFontLoader());
        }
        SpannableString spannableString3 = (SpannableString) g0(spannableString, 100000);
        if (spannableString2 == null) {
            spannableString2 = spannableString3;
        }
        cVar.J0(spannableString2);
    }

    private final RectF e0(l2.p pVar, s1.h hVar) {
        if (pVar == null) {
            return null;
        }
        s1.h r11 = hVar.r(pVar.o());
        s1.h f11 = pVar.f();
        s1.h o11 = r11.p(f11) ? r11.o(f11) : null;
        if (o11 != null) {
            long m11 = this.f3060a.m(s1.g.a(o11.i(), o11.l()));
            long m12 = this.f3060a.m(s1.g.a(o11.j(), o11.e()));
            return new RectF(s1.f.l(m11), s1.f.m(m11), s1.f.l(m12), s1.f.m(m12));
        }
        return null;
    }

    private final boolean f0(l2.p pVar, int i11, boolean z11, boolean z12) {
        androidx.compose.ui.platform.g x11;
        int i12;
        int i13;
        int i14 = pVar.i();
        Integer num = this.f3070k;
        if (num == null || i14 != num.intValue()) {
            this.f3069j = -1;
            this.f3070k = Integer.valueOf(pVar.i());
        }
        String w11 = w(pVar);
        if ((w11 == null || w11.length() == 0) || (x11 = x(pVar, i11)) == null) {
            return false;
        }
        int t11 = t(pVar);
        if (t11 == -1) {
            t11 = z11 ? 0 : w11.length();
        }
        int[] a11 = z11 ? x11.a(t11) : x11.b(t11);
        if (a11 == null) {
            return false;
        }
        int i15 = a11[0];
        int i16 = a11[1];
        if (z12 && E(pVar)) {
            i12 = u(pVar);
            if (i12 == -1) {
                i12 = z11 ? i15 : i16;
            }
            i13 = z11 ? i16 : i15;
        } else {
            i12 = z11 ? i16 : i15;
            i13 = i12;
        }
        this.f3074o = new f(pVar, z11 ? 256 : 512, i11, i15, i16, SystemClock.uptimeMillis());
        b0(pVar, i12, i13, true);
        return true;
    }

    private final <T extends CharSequence> T g0(T t11, int i11) {
        boolean z11 = true;
        if (i11 > 0) {
            if (t11 != null && t11.length() != 0) {
                z11 = false;
            }
            if (z11 || t11.length() <= i11) {
                return t11;
            }
            int i12 = i11 - 1;
            if (Character.isHighSurrogate(t11.charAt(i12)) && Character.isLowSurrogate(t11.charAt(i11))) {
                i11 = i12;
            }
            return (T) t11.subSequence(0, i11);
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    private final void h0(int i11) {
        int i12 = this.f3061b;
        if (i12 == i11) {
            return;
        }
        this.f3061b = i11;
        U(this, i11, 128, null, null, 12, null);
        U(this, i12, 256, null, null, 12, null);
    }

    private final void i0() {
        boolean q11;
        l2.k b11;
        boolean q12;
        Iterator<Integer> it2 = this.f3076q.iterator();
        while (it2.hasNext()) {
            Integer id2 = it2.next();
            l1 l1Var = v().get(id2);
            String str = null;
            l2.p b12 = l1Var == null ? null : l1Var.b();
            if (b12 != null) {
                q12 = u.q(b12);
                if (!q12) {
                }
            }
            this.f3076q.remove(id2);
            kotlin.jvm.internal.s.f(id2, "id");
            int intValue = id2.intValue();
            g gVar = this.f3077r.get(id2);
            if (gVar != null && (b11 = gVar.b()) != null) {
                str = (String) l2.l.a(b11, l2.s.f36459a.p());
            }
            V(intValue, 32, str);
        }
        this.f3077r.clear();
        for (Map.Entry<Integer, l1> entry : v().entrySet()) {
            q11 = u.q(entry.getValue().b());
            if (q11 && this.f3076q.add(entry.getKey())) {
                V(entry.getKey().intValue(), 16, (String) entry.getValue().b().t().h(l2.s.f36459a.p()));
            }
            this.f3077r.put(entry.getKey(), new g(entry.getValue().b(), v()));
        }
        this.f3078s = new g(this.f3060a.getSemanticsOwner().a(), v());
    }

    public final void j(int i11, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
        String str2;
        l1 l1Var = v().get(Integer.valueOf(i11));
        l2.p b11 = l1Var == null ? null : l1Var.b();
        if (b11 == null) {
            return;
        }
        String w11 = w(b11);
        l2.k t11 = b11.t();
        l2.j jVar = l2.j.f36419a;
        if (t11.e(jVar.g()) && bundle != null && kotlin.jvm.internal.s.c(str, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i12 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i13 = bundle.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i13 > 0 && i12 >= 0) {
                if (i12 < (w11 == null ? Integer.MAX_VALUE : w11.length())) {
                    ArrayList arrayList = new ArrayList();
                    h00.l lVar = (h00.l) ((l2.a) b11.t().h(jVar.g())).a();
                    if (kotlin.jvm.internal.s.c(lVar == null ? null : (Boolean) lVar.mo12invoke(arrayList), Boolean.TRUE)) {
                        n2.w wVar = (n2.w) arrayList.get(0);
                        ArrayList arrayList2 = new ArrayList();
                        int i14 = 0;
                        while (i14 < i13) {
                            int i15 = i14 + 1;
                            int i16 = i14 + i12;
                            if (i16 >= wVar.k().l().length()) {
                                arrayList2.add(null);
                            } else {
                                arrayList2.add(e0(b11, wVar.c(i16)));
                            }
                            i14 = i15;
                        }
                        Bundle extras = accessibilityNodeInfo.getExtras();
                        Object[] array = arrayList2.toArray(new RectF[0]);
                        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                        extras.putParcelableArray(str, (Parcelable[]) array);
                        return;
                    }
                    return;
                }
            }
            Log.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        l2.k t12 = b11.t();
        l2.s sVar = l2.s.f36459a;
        if (!t12.e(sVar.w()) || bundle == null || !kotlin.jvm.internal.s.c(str, "androidx.compose.ui.semantics.testTag") || (str2 = (String) l2.l.a(b11.t(), sVar.w())) == null) {
            return;
        }
        accessibilityNodeInfo.getExtras().putCharSequence(str, str2);
    }

    private final void n() {
        Z(this.f3060a.getSemanticsOwner().a(), this.f3078s);
        Y(v());
        i0();
    }

    private final boolean o(int i11) {
        if (D(i11)) {
            this.f3066g = Integer.MIN_VALUE;
            this.f3060a.invalidate();
            U(this, i11, 65536, null, null, 12, null);
            return true;
        }
        return false;
    }

    public final AccessibilityNodeInfo q(int i11) {
        w3.c P = w3.c.P();
        kotlin.jvm.internal.s.f(P, "obtain()");
        l1 l1Var = v().get(Integer.valueOf(i11));
        if (l1Var == null) {
            P.T();
            return null;
        }
        l2.p b11 = l1Var.b();
        if (i11 == -1) {
            ViewParent L = androidx.core.view.a0.L(this.f3060a);
            P.x0(L instanceof View ? (View) L : null);
        } else if (b11.n() != null) {
            l2.p n11 = b11.n();
            kotlin.jvm.internal.s.e(n11);
            int i12 = n11.i();
            P.y0(this.f3060a, i12 != this.f3060a.getSemanticsOwner().a().i() ? i12 : -1);
        } else {
            throw new IllegalStateException("semanticsNode " + i11 + " has null parent");
        }
        P.H0(this.f3060a, i11);
        Rect a11 = l1Var.a();
        long m11 = this.f3060a.m(s1.g.a(a11.left, a11.top));
        long m12 = this.f3060a.m(s1.g.a(a11.right, a11.bottom));
        P.Z(new Rect((int) Math.floor(s1.f.l(m11)), (int) Math.floor(s1.f.m(m11)), (int) Math.ceil(s1.f.l(m12)), (int) Math.ceil(s1.f.m(m12))));
        L(i11, P, b11);
        return P.O0();
    }

    private final AccessibilityEvent r(int i11, Integer num, Integer num2, Integer num3, String str) {
        AccessibilityEvent p11 = p(i11, PKIFailureInfo.certRevoked);
        if (num != null) {
            p11.setFromIndex(num.intValue());
        }
        if (num2 != null) {
            p11.setToIndex(num2.intValue());
        }
        if (num3 != null) {
            p11.setItemCount(num3.intValue());
        }
        if (str != null) {
            p11.getText().add(str);
        }
        return p11;
    }

    private final int t(l2.p pVar) {
        l2.k t11 = pVar.t();
        l2.s sVar = l2.s.f36459a;
        if (!t11.e(sVar.c()) && pVar.t().e(sVar.y())) {
            return n2.y.i(((n2.y) pVar.t().h(sVar.y())).r());
        }
        return this.f3069j;
    }

    private final int u(l2.p pVar) {
        l2.k t11 = pVar.t();
        l2.s sVar = l2.s.f36459a;
        if (!t11.e(sVar.c()) && pVar.t().e(sVar.y())) {
            return n2.y.n(((n2.y) pVar.t().h(sVar.y())).r());
        }
        return this.f3069j;
    }

    private final Map<Integer, l1> v() {
        if (this.f3073n) {
            this.f3075p = u.o(this.f3060a.getSemanticsOwner());
            this.f3073n = false;
        }
        return this.f3075p;
    }

    private final String w(l2.p pVar) {
        boolean t11;
        n2.a aVar;
        if (pVar == null) {
            return null;
        }
        l2.k t12 = pVar.t();
        l2.s sVar = l2.s.f36459a;
        if (!t12.e(sVar.c())) {
            t11 = u.t(pVar);
            if (t11) {
                n2.a z11 = z(pVar.t());
                if (z11 == null) {
                    return null;
                }
                return z11.g();
            }
            List list = (List) l2.l.a(pVar.t(), sVar.x());
            if (list == null || (aVar = (n2.a) wz.u.d0(list)) == null) {
                return null;
            }
            return aVar.g();
        }
        return o1.j.d((List) pVar.t().h(sVar.c()), ",", null, null, 0, null, null, 62, null);
    }

    private final androidx.compose.ui.platform.g x(l2.p pVar, int i11) {
        if (pVar == null) {
            return null;
        }
        String w11 = w(pVar);
        if (w11 == null || w11.length() == 0) {
            return null;
        }
        if (i11 == 1) {
            c.a aVar = androidx.compose.ui.platform.c.f2852d;
            Locale locale = this.f3060a.getContext().getResources().getConfiguration().locale;
            kotlin.jvm.internal.s.f(locale, "view.context.resources.configuration.locale");
            androidx.compose.ui.platform.c a11 = aVar.a(locale);
            a11.e(w11);
            return a11;
        } else if (i11 != 2) {
            if (i11 != 4) {
                if (i11 == 8) {
                    androidx.compose.ui.platform.f a12 = androidx.compose.ui.platform.f.f2916c.a();
                    a12.e(w11);
                    return a12;
                } else if (i11 != 16) {
                    return null;
                }
            }
            l2.k t11 = pVar.t();
            l2.j jVar = l2.j.f36419a;
            if (t11.e(jVar.g())) {
                ArrayList arrayList = new ArrayList();
                h00.l lVar = (h00.l) ((l2.a) pVar.t().h(jVar.g())).a();
                if (kotlin.jvm.internal.s.c(lVar == null ? null : (Boolean) lVar.mo12invoke(arrayList), Boolean.TRUE)) {
                    n2.w wVar = (n2.w) arrayList.get(0);
                    if (i11 == 4) {
                        androidx.compose.ui.platform.d a13 = androidx.compose.ui.platform.d.f2867d.a();
                        a13.j(w11, wVar);
                        return a13;
                    }
                    androidx.compose.ui.platform.e a14 = androidx.compose.ui.platform.e.f2894e.a();
                    a14.j(w11, wVar, pVar);
                    return a14;
                }
                return null;
            }
            return null;
        } else {
            h.a aVar2 = androidx.compose.ui.platform.h.f2956d;
            Locale locale2 = this.f3060a.getContext().getResources().getConfiguration().locale;
            kotlin.jvm.internal.s.f(locale2, "view.context.resources.configuration.locale");
            androidx.compose.ui.platform.h a15 = aVar2.a(locale2);
            a15.e(w11);
            return a15;
        }
    }

    private final n2.a z(l2.k kVar) {
        return (n2.a) l2.l.a(kVar, l2.s.f36459a.e());
    }

    public final AndroidComposeView A() {
        return this.f3060a;
    }

    public final int B(float f11, float f12) {
        h2.k n12;
        l2.x xVar = null;
        f0.b.a(this.f3060a, false, 1, null);
        h2.f fVar = new h2.f();
        this.f3060a.getRoot().o0(s1.g.a(f11, f12), fVar, (r13 & 4) != 0, (r13 & 8) != 0);
        l2.x xVar2 = (l2.x) wz.u.p0(fVar);
        if (xVar2 != null && (n12 = xVar2.n1()) != null) {
            xVar = l2.q.j(n12);
        }
        if (xVar != null) {
            l2.p pVar = new l2.p(xVar, false);
            l2.x e11 = pVar.e();
            if (pVar.t().e(l2.s.f36459a.l()) || e11.E1() || this.f3060a.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(xVar.n1()) != null) {
                return Integer.MIN_VALUE;
            }
            return R(xVar.a2().getId());
        }
        return Integer.MIN_VALUE;
    }

    public final void G(h2.k layoutNode) {
        kotlin.jvm.internal.s.g(layoutNode, "layoutNode");
        this.f3073n = true;
        if (C()) {
            F(layoutNode);
        }
    }

    public final void H() {
        this.f3073n = true;
        if (!C() || this.f3079t) {
            return;
        }
        this.f3079t = true;
        this.f3064e.post(this.f3080u);
    }

    public final void L(int i11, w3.c info, l2.p semanticsNode) {
        boolean t11;
        boolean r11;
        boolean t12;
        boolean k11;
        l2.x e11;
        boolean k12;
        boolean k13;
        List<Integer> z02;
        boolean k14;
        boolean k15;
        boolean s11;
        c.a aVar;
        boolean s12;
        c.a aVar2;
        boolean k16;
        float c11;
        float h11;
        float l11;
        int c12;
        boolean l12;
        boolean k17;
        boolean k18;
        String string;
        String str;
        h2.k n11;
        kotlin.jvm.internal.s.g(info, "info");
        kotlin.jvm.internal.s.g(semanticsNode, "semanticsNode");
        info.c0("android.view.View");
        l2.h hVar = (l2.h) l2.l.a(semanticsNode.t(), l2.s.f36459a.s());
        if (hVar != null) {
            int m11 = hVar.m();
            if (semanticsNode.u() || semanticsNode.p().isEmpty()) {
                h.a aVar3 = l2.h.f36408b;
                if (l2.h.j(hVar.m(), aVar3.f())) {
                    info.B0(A().getContext().getResources().getString(o1.h.f42102m));
                } else {
                    if (l2.h.j(m11, aVar3.a())) {
                        str = "android.widget.Button";
                    } else if (l2.h.j(m11, aVar3.b())) {
                        str = "android.widget.CheckBox";
                    } else if (l2.h.j(m11, aVar3.e())) {
                        str = "android.widget.Switch";
                    } else if (l2.h.j(m11, aVar3.d())) {
                        str = "android.widget.RadioButton";
                    } else {
                        str = l2.h.j(m11, aVar3.c()) ? "android.widget.ImageView" : null;
                    }
                    if (l2.h.j(hVar.m(), aVar3.c())) {
                        n11 = u.n(semanticsNode.k(), j.f3102a);
                        if (n11 == null || semanticsNode.t().m()) {
                            info.c0(str);
                        }
                    } else {
                        info.c0(str);
                    }
                }
            }
            vz.b0 b0Var = vz.b0.f54756a;
        }
        t11 = u.t(semanticsNode);
        if (t11) {
            info.c0("android.widget.EditText");
        }
        info.v0(this.f3060a.getContext().getPackageName());
        List<l2.p> q11 = semanticsNode.q();
        int size = q11.size();
        int i12 = 0;
        int i13 = 0;
        while (i13 < size) {
            int i14 = i13 + 1;
            l2.p pVar = q11.get(i13);
            if (v().containsKey(Integer.valueOf(pVar.i()))) {
                androidx.compose.ui.viewinterop.a aVar4 = A().getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(pVar.k());
                if (aVar4 != null) {
                    info.c(aVar4);
                } else {
                    info.d(A(), pVar.i());
                }
            }
            i13 = i14;
        }
        if (this.f3066g == i11) {
            info.W(true);
            info.b(c.a.f55456j);
        } else {
            info.W(false);
            info.b(c.a.f55455i);
        }
        d0(semanticsNode, info);
        c0(semanticsNode, info);
        l2.k t13 = semanticsNode.t();
        l2.s sVar = l2.s.f36459a;
        info.I0((CharSequence) l2.l.a(t13, sVar.v()));
        m2.a aVar5 = (m2.a) l2.l.a(semanticsNode.t(), sVar.z());
        if (aVar5 != null) {
            info.a0(true);
            int i15 = h.f3095a[aVar5.ordinal()];
            if (i15 == 1) {
                info.b0(true);
                if ((hVar == null ? false : l2.h.j(hVar.m(), l2.h.f36408b.e())) && info.x() == null) {
                    info.I0(A().getContext().getResources().getString(o1.h.f42100k));
                }
            } else if (i15 != 2) {
                if (i15 == 3 && info.x() == null) {
                    info.I0(A().getContext().getResources().getString(o1.h.f42096g));
                }
            } else {
                info.b0(false);
                if ((hVar == null ? false : l2.h.j(hVar.m(), l2.h.f36408b.e())) && info.x() == null) {
                    info.I0(A().getContext().getResources().getString(o1.h.f42099j));
                }
            }
            vz.b0 b0Var2 = vz.b0.f54756a;
        }
        Boolean bool = (Boolean) l2.l.a(semanticsNode.t(), sVar.u());
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (hVar == null ? false : l2.h.j(hVar.m(), l2.h.f36408b.f())) {
                info.E0(booleanValue);
            } else {
                info.a0(true);
                info.b0(booleanValue);
                if (info.x() == null) {
                    if (booleanValue) {
                        string = A().getContext().getResources().getString(o1.h.f42101l);
                    } else {
                        string = A().getContext().getResources().getString(o1.h.f42098i);
                    }
                    info.I0(string);
                }
            }
            vz.b0 b0Var3 = vz.b0.f54756a;
        }
        if (!semanticsNode.t().m() || semanticsNode.p().isEmpty()) {
            List list = (List) l2.l.a(semanticsNode.t(), sVar.c());
            info.g0(list == null ? null : (String) wz.u.d0(list));
        }
        if (semanticsNode.t().m()) {
            info.C0(true);
        }
        if (((vz.b0) l2.l.a(semanticsNode.t(), sVar.h())) != null) {
            info.o0(true);
            vz.b0 b0Var4 = vz.b0.f54756a;
        }
        r11 = u.r(semanticsNode);
        info.z0(r11);
        t12 = u.t(semanticsNode);
        info.j0(t12);
        k11 = u.k(semanticsNode);
        info.k0(k11);
        info.m0(semanticsNode.t().e(sVar.g()));
        if (info.H()) {
            info.n0(((Boolean) semanticsNode.t().h(sVar.g())).booleanValue());
            if (info.I()) {
                info.a(2);
            } else {
                info.a(1);
            }
        }
        if (semanticsNode.u()) {
            l2.p n12 = semanticsNode.n();
            e11 = n12 == null ? null : n12.e();
        } else {
            e11 = semanticsNode.e();
        }
        info.N0(!(e11 == null ? false : e11.E1()) && l2.l.a(semanticsNode.t(), sVar.l()) == null);
        l2.e eVar = (l2.e) l2.l.a(semanticsNode.t(), sVar.o());
        if (eVar != null) {
            int h12 = eVar.h();
            e.a aVar6 = l2.e.f36391b;
            info.r0((l2.e.e(h12, aVar6.b()) || !l2.e.e(h12, aVar6.a())) ? 1 : 2);
            vz.b0 b0Var5 = vz.b0.f54756a;
        }
        info.d0(false);
        l2.k t14 = semanticsNode.t();
        l2.j jVar = l2.j.f36419a;
        l2.a aVar7 = (l2.a) l2.l.a(t14, jVar.h());
        if (aVar7 != null) {
            boolean c13 = kotlin.jvm.internal.s.c(l2.l.a(semanticsNode.t(), sVar.u()), Boolean.TRUE);
            info.d0(!c13);
            k18 = u.k(semanticsNode);
            if (k18 && !c13) {
                info.b(new c.a(16, aVar7.b()));
            }
            vz.b0 b0Var6 = vz.b0.f54756a;
        }
        info.s0(false);
        l2.a aVar8 = (l2.a) l2.l.a(semanticsNode.t(), jVar.i());
        if (aVar8 != null) {
            info.s0(true);
            k17 = u.k(semanticsNode);
            if (k17) {
                info.b(new c.a(32, aVar8.b()));
            }
            vz.b0 b0Var7 = vz.b0.f54756a;
        }
        l2.a aVar9 = (l2.a) l2.l.a(semanticsNode.t(), jVar.b());
        if (aVar9 != null) {
            info.b(new c.a(16384, aVar9.b()));
            vz.b0 b0Var8 = vz.b0.f54756a;
        }
        k12 = u.k(semanticsNode);
        if (k12) {
            l2.a aVar10 = (l2.a) l2.l.a(semanticsNode.t(), jVar.o());
            if (aVar10 != null) {
                info.b(new c.a(PKIFailureInfo.badSenderNonce, aVar10.b()));
                vz.b0 b0Var9 = vz.b0.f54756a;
            }
            l2.a aVar11 = (l2.a) l2.l.a(semanticsNode.t(), jVar.d());
            if (aVar11 != null) {
                info.b(new c.a(65536, aVar11.b()));
                vz.b0 b0Var10 = vz.b0.f54756a;
            }
            l2.a aVar12 = (l2.a) l2.l.a(semanticsNode.t(), jVar.j());
            if (aVar12 != null) {
                if (info.I() && A().getClipboardManager().b()) {
                    info.b(new c.a(32768, aVar12.b()));
                }
                vz.b0 b0Var11 = vz.b0.f54756a;
            }
        }
        String w11 = w(semanticsNode);
        if (!(w11 == null || w11.length() == 0)) {
            info.K0(u(semanticsNode), t(semanticsNode));
            l2.a aVar13 = (l2.a) l2.l.a(semanticsNode.t(), jVar.n());
            info.b(new c.a(131072, aVar13 != null ? aVar13.b() : null));
            info.a(256);
            info.a(512);
            info.u0(11);
            List list2 = (List) l2.l.a(semanticsNode.t(), sVar.c());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.t().e(jVar.g())) {
                l12 = u.l(semanticsNode);
                if (!l12) {
                    info.u0(info.t() | 4 | 16);
                }
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        if (i16 >= 26) {
            ArrayList arrayList = new ArrayList();
            CharSequence y11 = info.y();
            if (!(y11 == null || y11.length() == 0) && semanticsNode.t().e(jVar.g())) {
                arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
            }
            if (semanticsNode.t().e(sVar.w())) {
                arrayList.add("androidx.compose.ui.semantics.testTag");
            }
            if (!arrayList.isEmpty()) {
                androidx.compose.ui.platform.j jVar2 = androidx.compose.ui.platform.j.f2974a;
                AccessibilityNodeInfo O0 = info.O0();
                kotlin.jvm.internal.s.f(O0, "info.unwrap()");
                jVar2.a(O0, arrayList);
            }
        }
        l2.g gVar = (l2.g) l2.l.a(semanticsNode.t(), sVar.r());
        if (gVar != null) {
            if (semanticsNode.t().e(jVar.m())) {
                info.c0("android.widget.SeekBar");
            } else {
                info.c0("android.widget.ProgressBar");
            }
            if (gVar != l2.g.f36403d.a()) {
                info.A0(c.d.a(1, gVar.c().mo166getStart().floatValue(), gVar.c().mo165b().floatValue(), gVar.b()));
                if (info.x() == null) {
                    m00.e<Float> c14 = gVar.c();
                    l11 = m00.l.l(((c14.mo165b().floatValue() - c14.mo166getStart().floatValue()) > BitmapDescriptorFactory.HUE_RED ? 1 : ((c14.mo165b().floatValue() - c14.mo166getStart().floatValue()) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) == 0 ? 0.0f : (gVar.b() - c14.mo166getStart().floatValue()) / (c14.mo165b().floatValue() - c14.mo166getStart().floatValue()), BitmapDescriptorFactory.HUE_RED, 1.0f);
                    int i17 = 100;
                    if (l11 == BitmapDescriptorFactory.HUE_RED) {
                        i17 = 0;
                    } else {
                        if (!(l11 == 1.0f)) {
                            c12 = j00.c.c(l11 * 100);
                            i17 = m00.l.m(c12, 1, 99);
                        }
                    }
                    info.I0(this.f3060a.getContext().getResources().getString(o1.h.f42103n, Integer.valueOf(i17)));
                }
            } else if (info.x() == null) {
                info.I0(this.f3060a.getContext().getResources().getString(o1.h.f42095f));
            }
            if (semanticsNode.t().e(jVar.m())) {
                k16 = u.k(semanticsNode);
                if (k16) {
                    float b11 = gVar.b();
                    c11 = m00.l.c(gVar.c().mo165b().floatValue(), gVar.c().mo166getStart().floatValue());
                    if (b11 < c11) {
                        info.b(c.a.f55457k);
                    }
                    float b12 = gVar.b();
                    h11 = m00.l.h(gVar.c().mo166getStart().floatValue(), gVar.c().mo165b().floatValue());
                    if (b12 > h11) {
                        info.b(c.a.f55458l);
                    }
                }
            }
        }
        if (i16 >= 24) {
            b.f3084a.a(info, semanticsNode);
        }
        i2.a.d(semanticsNode, info);
        i2.a.e(semanticsNode, info);
        l2.i iVar = (l2.i) l2.l.a(semanticsNode.t(), sVar.i());
        l2.a aVar14 = (l2.a) l2.l.a(semanticsNode.t(), jVar.k());
        if (iVar != null && aVar14 != null) {
            if (!i2.a.b(semanticsNode)) {
                info.c0("android.widget.HorizontalScrollView");
            }
            if (iVar.a().mo11invoke().floatValue() > BitmapDescriptorFactory.HUE_RED) {
                info.D0(true);
            }
            k15 = u.k(semanticsNode);
            if (k15) {
                if (N(iVar)) {
                    info.b(c.a.f55457k);
                    s12 = u.s(semanticsNode);
                    if (!s12) {
                        aVar2 = c.a.f55465s;
                    } else {
                        aVar2 = c.a.f55463q;
                    }
                    info.b(aVar2);
                }
                if (M(iVar)) {
                    info.b(c.a.f55458l);
                    s11 = u.s(semanticsNode);
                    if (!s11) {
                        aVar = c.a.f55463q;
                    } else {
                        aVar = c.a.f55465s;
                    }
                    info.b(aVar);
                }
            }
        }
        l2.i iVar2 = (l2.i) l2.l.a(semanticsNode.t(), sVar.A());
        if (iVar2 != null && aVar14 != null) {
            if (!i2.a.b(semanticsNode)) {
                info.c0("android.widget.ScrollView");
            }
            if (iVar2.a().mo11invoke().floatValue() > BitmapDescriptorFactory.HUE_RED) {
                info.D0(true);
            }
            k14 = u.k(semanticsNode);
            if (k14) {
                if (N(iVar2)) {
                    info.b(c.a.f55457k);
                    info.b(c.a.f55464r);
                }
                if (M(iVar2)) {
                    info.b(c.a.f55458l);
                    info.b(c.a.f55462p);
                }
            }
        }
        info.w0((CharSequence) l2.l.a(semanticsNode.t(), sVar.p()));
        k13 = u.k(semanticsNode);
        if (k13) {
            l2.a aVar15 = (l2.a) l2.l.a(semanticsNode.t(), jVar.f());
            if (aVar15 != null) {
                info.b(new c.a(262144, aVar15.b()));
                vz.b0 b0Var12 = vz.b0.f54756a;
            }
            l2.a aVar16 = (l2.a) l2.l.a(semanticsNode.t(), jVar.a());
            if (aVar16 != null) {
                info.b(new c.a(PKIFailureInfo.signerNotTrusted, aVar16.b()));
                vz.b0 b0Var13 = vz.b0.f54756a;
            }
            l2.a aVar17 = (l2.a) l2.l.a(semanticsNode.t(), jVar.e());
            if (aVar17 != null) {
                info.b(new c.a(PKIFailureInfo.badCertTemplate, aVar17.b()));
                vz.b0 b0Var14 = vz.b0.f54756a;
            }
            if (semanticsNode.t().e(jVar.c())) {
                List list3 = (List) semanticsNode.t().h(jVar.c());
                int size2 = list3.size();
                int[] iArr = f3059x;
                if (size2 < iArr.length) {
                    androidx.collection.h<CharSequence> hVar2 = new androidx.collection.h<>();
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    if (this.f3068i.d(i11)) {
                        Map<CharSequence, Integer> g11 = this.f3068i.g(i11);
                        z02 = wz.p.z0(iArr);
                        ArrayList arrayList2 = new ArrayList();
                        int size3 = list3.size();
                        int i18 = 0;
                        while (i18 < size3) {
                            int i19 = i18 + 1;
                            l2.d dVar = (l2.d) list3.get(i18);
                            kotlin.jvm.internal.s.e(g11);
                            if (g11.containsKey(dVar.b())) {
                                Integer num = g11.get(dVar.b());
                                kotlin.jvm.internal.s.e(num);
                                hVar2.l(num.intValue(), dVar.b());
                                linkedHashMap.put(dVar.b(), num);
                                z02.remove(num);
                                info.b(new c.a(num.intValue(), dVar.b()));
                            } else {
                                arrayList2.add(dVar);
                            }
                            i18 = i19;
                        }
                        int size4 = arrayList2.size();
                        while (i12 < size4) {
                            int i21 = i12 + 1;
                            l2.d dVar2 = (l2.d) arrayList2.get(i12);
                            int intValue = z02.get(i12).intValue();
                            hVar2.l(intValue, dVar2.b());
                            linkedHashMap.put(dVar2.b(), Integer.valueOf(intValue));
                            info.b(new c.a(intValue, dVar2.b()));
                            i12 = i21;
                        }
                    } else {
                        int size5 = list3.size();
                        while (i12 < size5) {
                            int i22 = i12 + 1;
                            l2.d dVar3 = (l2.d) list3.get(i12);
                            int i23 = f3059x[i12];
                            hVar2.l(i23, dVar3.b());
                            linkedHashMap.put(dVar3.b(), Integer.valueOf(i23));
                            info.b(new c.a(i23, dVar3.b()));
                            i12 = i22;
                        }
                    }
                    this.f3067h.l(i11, hVar2);
                    this.f3068i.l(i11, linkedHashMap);
                    return;
                }
                throw new IllegalStateException("Can't have more than " + iArr.length + " custom actions for one widget");
            }
        }
    }

    public final void Y(Map<Integer, l1> newSemanticsNodes) {
        String str;
        boolean t11;
        int i11;
        String g11;
        boolean j11;
        kotlin.jvm.internal.s.g(newSemanticsNodes, "newSemanticsNodes");
        ArrayList arrayList = new ArrayList(this.f3081v);
        this.f3081v.clear();
        for (Integer num : newSemanticsNodes.keySet()) {
            int intValue = num.intValue();
            g gVar = this.f3077r.get(Integer.valueOf(intValue));
            if (gVar != null) {
                l1 l1Var = newSemanticsNodes.get(Integer.valueOf(intValue));
                l2.p b11 = l1Var == null ? null : l1Var.b();
                kotlin.jvm.internal.s.e(b11);
                Iterator<Map.Entry<? extends l2.u<?>, ? extends Object>> it2 = b11.t().iterator();
                boolean z11 = true;
                boolean z12 = false;
                while (it2.hasNext()) {
                    Map.Entry<? extends l2.u<?>, ? extends Object> next = it2.next();
                    l2.u<?> key = next.getKey();
                    l2.s sVar = l2.s.f36459a;
                    if (((kotlin.jvm.internal.s.c(key, sVar.i()) || kotlin.jvm.internal.s.c(next.getKey(), sVar.A())) ? O(intValue, arrayList) : false) || !kotlin.jvm.internal.s.c(next.getValue(), l2.l.a(gVar.b(), next.getKey()))) {
                        l2.u<?> key2 = next.getKey();
                        if (kotlin.jvm.internal.s.c(key2, sVar.p())) {
                            Object value = next.getValue();
                            Objects.requireNonNull(value, "null cannot be cast to non-null type kotlin.String");
                            String str2 = (String) value;
                            if (gVar.c()) {
                                V(intValue, 8, str2);
                            }
                        } else if (kotlin.jvm.internal.s.c(key2, sVar.v()) ? z11 : kotlin.jvm.internal.s.c(key2, sVar.z())) {
                            U(this, R(intValue), 2048, 64, null, 8, null);
                            U(this, R(intValue), 2048, 0, null, 8, null);
                        } else {
                            boolean z13 = z11;
                            if (kotlin.jvm.internal.s.c(key2, sVar.r())) {
                                U(this, R(intValue), 2048, 64, null, 8, null);
                                U(this, R(intValue), 2048, 0, null, 8, null);
                            } else if (kotlin.jvm.internal.s.c(key2, sVar.u())) {
                                l2.h hVar = (l2.h) l2.l.a(b11.h(), sVar.s());
                                if (hVar == null ? false : l2.h.j(hVar.m(), l2.h.f36408b.f())) {
                                    if (kotlin.jvm.internal.s.c(l2.l.a(b11.h(), sVar.u()), Boolean.TRUE)) {
                                        AccessibilityEvent p11 = p(R(intValue), 4);
                                        l2.p pVar = new l2.p(b11.m(), z13);
                                        List list = (List) l2.l.a(pVar.h(), sVar.c());
                                        String d11 = list == null ? null : o1.j.d(list, ",", null, null, 0, null, null, 62, null);
                                        List list2 = (List) l2.l.a(pVar.h(), sVar.x());
                                        String d12 = list2 == null ? null : o1.j.d(list2, ",", null, null, 0, null, null, 62, null);
                                        if (d11 != null) {
                                            p11.setContentDescription(d11);
                                            vz.b0 b0Var = vz.b0.f54756a;
                                        }
                                        if (d12 != null) {
                                            p11.getText().add(d12);
                                        }
                                        S(p11);
                                    } else {
                                        U(this, R(intValue), 2048, 0, null, 8, null);
                                    }
                                } else {
                                    U(this, R(intValue), 2048, 64, null, 8, null);
                                    U(this, R(intValue), 2048, 0, null, 8, null);
                                }
                            } else if (kotlin.jvm.internal.s.c(key2, sVar.c())) {
                                int R = R(intValue);
                                Object value2 = next.getValue();
                                Objects.requireNonNull(value2, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                                T(R, 2048, 4, (List) value2);
                            } else {
                                str = "";
                                if (kotlin.jvm.internal.s.c(key2, sVar.e())) {
                                    t11 = u.t(b11);
                                    if (t11) {
                                        n2.a z14 = z(gVar.b());
                                        if (z14 == null) {
                                            z14 = "";
                                        }
                                        n2.a z15 = z(b11.t());
                                        str = z15 != null ? z15 : "";
                                        int length = z14.length();
                                        int length2 = str.length();
                                        i11 = m00.l.i(length, length2);
                                        int i12 = 0;
                                        while (i12 < i11 && z14.charAt(i12) == str.charAt(i12)) {
                                            i12++;
                                        }
                                        int i13 = 0;
                                        while (i13 < i11 - i12) {
                                            int i14 = i11;
                                            if (z14.charAt((length - 1) - i13) != str.charAt((length2 - 1) - i13)) {
                                                break;
                                            }
                                            i13++;
                                            i11 = i14;
                                        }
                                        AccessibilityEvent p12 = p(R(intValue), 16);
                                        p12.setFromIndex(i12);
                                        p12.setRemovedCount((length - i13) - i12);
                                        p12.setAddedCount((length2 - i13) - i12);
                                        p12.setBeforeText(z14);
                                        p12.getText().add(g0(str, 100000));
                                        S(p12);
                                    } else {
                                        U(this, R(intValue), 2048, 2, null, 8, null);
                                    }
                                } else if (kotlin.jvm.internal.s.c(key2, sVar.y())) {
                                    n2.a z16 = z(b11.t());
                                    if (z16 != null && (g11 = z16.g()) != null) {
                                        str = g11;
                                    }
                                    long r11 = ((n2.y) b11.t().h(sVar.y())).r();
                                    S(r(R(intValue), Integer.valueOf(n2.y.n(r11)), Integer.valueOf(n2.y.i(r11)), Integer.valueOf(str.length()), (String) g0(str, 100000)));
                                    W(b11.i());
                                } else if (kotlin.jvm.internal.s.c(key2, sVar.i()) ? true : kotlin.jvm.internal.s.c(key2, sVar.A())) {
                                    F(b11.k());
                                    k1 m11 = u.m(this.f3081v, intValue);
                                    kotlin.jvm.internal.s.e(m11);
                                    m11.f((l2.i) l2.l.a(b11.t(), sVar.i()));
                                    m11.i((l2.i) l2.l.a(b11.t(), sVar.A()));
                                    X(m11);
                                } else if (kotlin.jvm.internal.s.c(key2, sVar.g())) {
                                    Object value3 = next.getValue();
                                    Objects.requireNonNull(value3, "null cannot be cast to non-null type kotlin.Boolean");
                                    if (((Boolean) value3).booleanValue()) {
                                        S(p(R(b11.i()), 8));
                                    }
                                    U(this, R(b11.i()), 2048, 0, null, 8, null);
                                } else {
                                    l2.j jVar = l2.j.f36419a;
                                    if (kotlin.jvm.internal.s.c(key2, jVar.c())) {
                                        List list3 = (List) b11.t().h(jVar.c());
                                        List list4 = (List) l2.l.a(gVar.b(), jVar.c());
                                        if (list4 != null) {
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            int size = list3.size();
                                            for (int i15 = 0; i15 < size; i15++) {
                                                linkedHashSet.add(((l2.d) list3.get(i15)).b());
                                            }
                                            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                                            int size2 = list4.size();
                                            for (int i16 = 0; i16 < size2; i16++) {
                                                linkedHashSet2.add(((l2.d) list4.get(i16)).b());
                                            }
                                            z12 = (linkedHashSet.containsAll(linkedHashSet2) && linkedHashSet2.containsAll(linkedHashSet)) ? false : true;
                                        } else if (!list3.isEmpty()) {
                                            z11 = true;
                                            z12 = true;
                                        }
                                    } else if (next.getValue() instanceof l2.a) {
                                        Object value4 = next.getValue();
                                        Objects.requireNonNull(value4, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                                        j11 = u.j((l2.a) value4, l2.l.a(gVar.b(), next.getKey()));
                                        z11 = true;
                                        z12 = !j11;
                                    } else {
                                        z12 = true;
                                        z11 = true;
                                    }
                                }
                            }
                        }
                    }
                    z11 = true;
                }
                if (!z12) {
                    z12 = u.u(b11, gVar);
                }
                if (z12) {
                    U(this, R(intValue), 2048, 0, null, 8, null);
                }
            }
        }
    }

    @Override // androidx.core.view.a
    public w3.d getAccessibilityNodeProvider(View host) {
        kotlin.jvm.internal.s.g(host, "host");
        return this.f3065f;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x007d A[Catch: all -> 0x0051, TryCatch #0 {all -> 0x0051, blocks: (B:66:0x0034, B:78:0x0063, B:82:0x0075, B:84:0x007d, B:86:0x0086, B:88:0x008f, B:89:0x00a6, B:91:0x00ad, B:92:0x00b6, B:71:0x004d), top: B:101:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00cc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:93:0x00c9 -> B:67:0x0037). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(zz.d<? super vz.b0> r12) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.t.k(zz.d):java.lang.Object");
    }

    public final boolean l(boolean z11, int i11, long j11) {
        return m(v().values(), z11, i11, j11);
    }

    /* JADX WARN: Removed duplicated region for block: B:96:0x00b0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean m(java.util.Collection<androidx.compose.ui.platform.l1> r6, boolean r7, int r8, long r9) {
        /*
            r5 = this;
            java.lang.String r0 = "currentSemanticsNodes"
            kotlin.jvm.internal.s.g(r6, r0)
            s1.f$a r0 = s1.f.f49950b
            long r0 = r0.b()
            boolean r0 = s1.f.j(r9, r0)
            r1 = 0
            if (r0 != 0) goto Lb8
            boolean r0 = s1.f.o(r9)
            if (r0 != 0) goto L1a
            goto Lb8
        L1a:
            r0 = 1
            if (r7 != r0) goto L24
            l2.s r7 = l2.s.f36459a
            l2.u r7 = r7.A()
            goto L2c
        L24:
            if (r7 != 0) goto Lb2
            l2.s r7 = l2.s.f36459a
            l2.u r7 = r7.i()
        L2c:
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L34
            goto Lb1
        L34:
            java.util.Iterator r6 = r6.iterator()
        L38:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r6.next()
            androidx.compose.ui.platform.l1 r2 = (androidx.compose.ui.platform.l1) r2
            android.graphics.Rect r3 = r2.a()
            s1.h r3 = t1.v0.c(r3)
            boolean r3 = r3.b(r9)
            if (r3 != 0) goto L54
        L52:
            r2 = r1
            goto Lae
        L54:
            l2.p r2 = r2.b()
            l2.k r2 = r2.h()
            java.lang.Object r2 = l2.l.a(r2, r7)
            l2.i r2 = (l2.i) r2
            if (r2 != 0) goto L65
            goto L52
        L65:
            boolean r3 = r2.b()
            if (r3 == 0) goto L6d
            int r3 = -r8
            goto L6e
        L6d:
            r3 = r8
        L6e:
            if (r8 != 0) goto L77
            boolean r4 = r2.b()
            if (r4 == 0) goto L77
            r3 = -1
        L77:
            if (r3 >= 0) goto L8d
            h00.a r2 = r2.c()
            java.lang.Object r2 = r2.mo11invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            r3 = 0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L52
            goto Lad
        L8d:
            h00.a r3 = r2.c()
            java.lang.Object r3 = r3.mo11invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            h00.a r2 = r2.a()
            java.lang.Object r2 = r2.mo11invoke()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 >= 0) goto L52
        Lad:
            r2 = r0
        Lae:
            if (r2 == 0) goto L38
            r1 = r0
        Lb1:
            return r1
        Lb2:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        Lb8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.t.m(java.util.Collection, boolean, int, long):boolean");
    }

    public final AccessibilityEvent p(int i11, int i12) {
        boolean r11;
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i12);
        kotlin.jvm.internal.s.f(obtain, "obtain(eventType)");
        obtain.setEnabled(true);
        obtain.setClassName("android.view.View");
        obtain.setPackageName(this.f3060a.getContext().getPackageName());
        obtain.setSource(this.f3060a, i11);
        l1 l1Var = v().get(Integer.valueOf(i11));
        if (l1Var != null) {
            r11 = u.r(l1Var.b());
            obtain.setPassword(r11);
        }
        return obtain;
    }

    public final boolean s(MotionEvent event) {
        kotlin.jvm.internal.s.g(event, "event");
        if (C()) {
            int action = event.getAction();
            if (action == 7 || action == 9) {
                int B = B(event.getX(), event.getY());
                boolean dispatchGenericMotionEvent = this.f3060a.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
                h0(B);
                if (B == Integer.MIN_VALUE) {
                    return dispatchGenericMotionEvent;
                }
                return true;
            } else if (action != 10) {
                return false;
            } else {
                if (this.f3061b != Integer.MIN_VALUE) {
                    h0(Integer.MIN_VALUE);
                    return true;
                }
                return this.f3060a.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(event);
            }
        }
        return false;
    }

    public final Map<Integer, g> y() {
        return this.f3077r;
    }
}