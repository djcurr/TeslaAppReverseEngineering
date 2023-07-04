package w3;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.adyen.checkout.components.model.payments.request.Address;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import w3.f;

/* loaded from: classes.dex */
public class c {

    /* renamed from: d  reason: collision with root package name */
    private static int f55447d;

    /* renamed from: a  reason: collision with root package name */
    private final AccessibilityNodeInfo f55448a;

    /* renamed from: b  reason: collision with root package name */
    public int f55449b = -1;

    /* renamed from: c  reason: collision with root package name */
    private int f55450c = -1;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: e  reason: collision with root package name */
        public static final a f55451e = new a(1, null);

        /* renamed from: f  reason: collision with root package name */
        public static final a f55452f = new a(2, null);

        /* renamed from: g  reason: collision with root package name */
        public static final a f55453g;

        /* renamed from: h  reason: collision with root package name */
        public static final a f55454h;

        /* renamed from: i  reason: collision with root package name */
        public static final a f55455i;

        /* renamed from: j  reason: collision with root package name */
        public static final a f55456j;

        /* renamed from: k  reason: collision with root package name */
        public static final a f55457k;

        /* renamed from: l  reason: collision with root package name */
        public static final a f55458l;

        /* renamed from: m  reason: collision with root package name */
        public static final a f55459m;

        /* renamed from: n  reason: collision with root package name */
        public static final a f55460n;

        /* renamed from: o  reason: collision with root package name */
        public static final a f55461o;

        /* renamed from: p  reason: collision with root package name */
        public static final a f55462p;

        /* renamed from: q  reason: collision with root package name */
        public static final a f55463q;

        /* renamed from: r  reason: collision with root package name */
        public static final a f55464r;

        /* renamed from: s  reason: collision with root package name */
        public static final a f55465s;

        /* renamed from: t  reason: collision with root package name */
        public static final a f55466t;

        /* renamed from: a  reason: collision with root package name */
        final Object f55467a;

        /* renamed from: b  reason: collision with root package name */
        private final int f55468b;

        /* renamed from: c  reason: collision with root package name */
        private final Class<? extends f.a> f55469c;

        /* renamed from: d  reason: collision with root package name */
        protected final f f55470d;

        static {
            new a(4, null);
            new a(8, null);
            f55453g = new a(16, null);
            f55454h = new a(32, null);
            f55455i = new a(64, null);
            f55456j = new a(128, null);
            new a(256, (CharSequence) null, f.b.class);
            new a(512, (CharSequence) null, f.b.class);
            new a(1024, (CharSequence) null, f.c.class);
            new a(2048, (CharSequence) null, f.c.class);
            f55457k = new a(4096, null);
            f55458l = new a(PKIFailureInfo.certRevoked, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, (CharSequence) null, f.g.class);
            f55459m = new a(262144, null);
            f55460n = new a(PKIFailureInfo.signerNotTrusted, null);
            f55461o = new a(PKIFailureInfo.badCertTemplate, null);
            new a((int) PKIFailureInfo.badSenderNonce, (CharSequence) null, f.h.class);
            int i11 = Build.VERSION.SDK_INT;
            new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, 16908342, null, null, null);
            new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, 16908343, null, null, f.e.class);
            f55462p = new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, 16908344, null, null, null);
            f55463q = new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, 16908345, null, null, null);
            f55464r = new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, 16908346, null, null, null);
            f55465s = new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, 16908347, null, null, null);
            new a(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, 16908358, null, null, null);
            new a(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, 16908359, null, null, null);
            new a(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, 16908360, null, null, null);
            new a(i11 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, 16908361, null, null, null);
            new a(i11 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, 16908348, null, null, null);
            f55466t = new a(i11 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, 16908349, null, null, f.C1264f.class);
            new a(i11 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, 16908354, null, null, f.d.class);
            new a(i11 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, 16908356, null, null, null);
            new a(i11 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, 16908357, null, null, null);
            new a(i11 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, 16908362, null, null, null);
            new a(i11 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, 16908372, null, null, null);
        }

        public a(int i11, CharSequence charSequence) {
            this(null, i11, charSequence, null, null);
        }

        public a a(CharSequence charSequence, f fVar) {
            return new a(null, this.f55468b, charSequence, fVar, this.f55469c);
        }

        public int b() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f55467a).getId();
            }
            return 0;
        }

        public CharSequence c() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction) this.f55467a).getLabel();
            }
            return null;
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f55470d != null) {
                f.a aVar = null;
                Class<? extends f.a> cls = this.f55469c;
                if (cls != null) {
                    try {
                        f.a newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        try {
                            newInstance.a(bundle);
                            aVar = newInstance;
                        } catch (Exception e11) {
                            e = e11;
                            aVar = newInstance;
                            Class<? extends f.a> cls2 = this.f55469c;
                            String name = cls2 == null ? Address.ADDRESS_NULL_PLACEHOLDER : cls2.getName();
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e);
                            return this.f55470d.a(view, aVar);
                        }
                    } catch (Exception e12) {
                        e = e12;
                    }
                }
                return this.f55470d.a(view, aVar);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof a)) {
                a aVar = (a) obj;
                Object obj2 = this.f55467a;
                return obj2 == null ? aVar.f55467a == null : obj2.equals(aVar.f55467a);
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f55467a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(int i11, CharSequence charSequence, f fVar) {
            this(null, i11, charSequence, fVar, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i11, CharSequence charSequence, Class<? extends f.a> cls) {
            this(null, i11, charSequence, null, cls);
        }

        a(Object obj, int i11, CharSequence charSequence, f fVar, Class<? extends f.a> cls) {
            this.f55468b = i11;
            this.f55470d = fVar;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.f55467a = new AccessibilityNodeInfo.AccessibilityAction(i11, charSequence);
            } else {
                this.f55467a = obj;
            }
            this.f55469c = cls;
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        final Object f55471a;

        b(Object obj) {
            this.f55471a = obj;
        }

        public static b a(int i11, int i12, boolean z11, int i13) {
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 21) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i11, i12, z11, i13));
            }
            if (i14 >= 19) {
                return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i11, i12, z11));
            }
            return new b(null);
        }
    }

    /* renamed from: w3.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C1263c {

        /* renamed from: a  reason: collision with root package name */
        final Object f55472a;

        C1263c(Object obj) {
            this.f55472a = obj;
        }

        public static C1263c a(int i11, int i12, int i13, int i14, boolean z11) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new C1263c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, i12, i13, i14, z11));
            }
            return new C1263c(null);
        }

        public static C1263c b(int i11, int i12, int i13, int i14, boolean z11, boolean z12) {
            int i15 = Build.VERSION.SDK_INT;
            if (i15 >= 21) {
                return new C1263c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, i12, i13, i14, z11, z12));
            }
            if (i15 >= 19) {
                return new C1263c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i11, i12, i13, i14, z11));
            }
            return new C1263c(null);
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        final Object f55473a;

        d(Object obj) {
            this.f55473a = obj;
        }

        public static d a(int i11, float f11, float f12, float f13) {
            if (Build.VERSION.SDK_INT >= 19) {
                return new d(AccessibilityNodeInfo.RangeInfo.obtain(i11, f11, f12, f13));
            }
            return new d(null);
        }
    }

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f55448a = accessibilityNodeInfo;
    }

    private boolean A() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int B(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                if (clickableSpan.equals(sparseArray.valueAt(i11).get())) {
                    return sparseArray.keyAt(i11);
                }
            }
        }
        int i12 = f55447d;
        f55447d = i12 + 1;
        return i12;
    }

    public static c P() {
        return P0(AccessibilityNodeInfo.obtain());
    }

    public static c P0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    public static c Q(View view) {
        return P0(AccessibilityNodeInfo.obtain(view));
    }

    public static c R(c cVar) {
        return P0(AccessibilityNodeInfo.obtain(cVar.f55448a));
    }

    private void V(View view) {
        SparseArray<WeakReference<ClickableSpan>> w11 = w(view);
        if (w11 != null) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < w11.size(); i11++) {
                if (w11.valueAt(i11).get() == null) {
                    arrayList.add(Integer.valueOf(i11));
                }
            }
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                w11.remove(((Integer) arrayList.get(i12)).intValue());
            }
        }
    }

    private void X(int i11, boolean z11) {
        Bundle s11 = s();
        if (s11 != null) {
            int i12 = s11.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i11);
            if (!z11) {
                i11 = 0;
            }
            s11.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i11 | i12);
        }
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i11) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i11));
    }

    private void g() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f55448a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.f55448a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.f55448a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.f55448a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private List<Integer> h(String str) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList<Integer> integerArrayList = this.f55448a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f55448a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    private static String j(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                switch (i11) {
                    case 4:
                        return "ACTION_SELECT";
                    case 8:
                        return "ACTION_CLEAR_SELECTION";
                    case 16:
                        return "ACTION_CLICK";
                    case 32:
                        return "ACTION_LONG_CLICK";
                    case 64:
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    case 128:
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    case 256:
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    case 512:
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    case 1024:
                        return "ACTION_NEXT_HTML_ELEMENT";
                    case 2048:
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    case 4096:
                        return "ACTION_SCROLL_FORWARD";
                    case PKIFailureInfo.certRevoked /* 8192 */:
                        return "ACTION_SCROLL_BACKWARD";
                    case 16384:
                        return "ACTION_COPY";
                    case 32768:
                        return "ACTION_PASTE";
                    case 65536:
                        return "ACTION_CUT";
                    case 131072:
                        return "ACTION_SET_SELECTION";
                    case 262144:
                        return "ACTION_EXPAND";
                    case PKIFailureInfo.signerNotTrusted /* 524288 */:
                        return "ACTION_COLLAPSE";
                    case PKIFailureInfo.badSenderNonce /* 2097152 */:
                        return "ACTION_SET_TEXT";
                    case 16908354:
                        return "ACTION_MOVE_WINDOW";
                    case 16908372:
                        return "ACTION_IME_ENTER";
                    default:
                        switch (i11) {
                            case 16908342:
                                return "ACTION_SHOW_ON_SCREEN";
                            case 16908343:
                                return "ACTION_SCROLL_TO_POSITION";
                            case 16908344:
                                return "ACTION_SCROLL_UP";
                            case 16908345:
                                return "ACTION_SCROLL_LEFT";
                            case 16908346:
                                return "ACTION_SCROLL_DOWN";
                            case 16908347:
                                return "ACTION_SCROLL_RIGHT";
                            case 16908348:
                                return "ACTION_CONTEXT_CLICK";
                            case 16908349:
                                return "ACTION_SET_PROGRESS";
                            default:
                                switch (i11) {
                                    case 16908356:
                                        return "ACTION_SHOW_TOOLTIP";
                                    case 16908357:
                                        return "ACTION_HIDE_TOOLTIP";
                                    case 16908358:
                                        return "ACTION_PAGE_UP";
                                    case 16908359:
                                        return "ACTION_PAGE_DOWN";
                                    case 16908360:
                                        return "ACTION_PAGE_LEFT";
                                    case 16908361:
                                        return "ACTION_PAGE_RIGHT";
                                    case 16908362:
                                        return "ACTION_PRESS_AND_HOLD";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    private boolean l(int i11) {
        Bundle s11 = s();
        return s11 != null && (s11.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i11) == i11;
    }

    public static ClickableSpan[] q(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private SparseArray<WeakReference<ClickableSpan>> u(View view) {
        SparseArray<WeakReference<ClickableSpan>> w11 = w(view);
        if (w11 == null) {
            SparseArray<WeakReference<ClickableSpan>> sparseArray = new SparseArray<>();
            view.setTag(j3.c.I, sparseArray);
            return sparseArray;
        }
        return w11;
    }

    private SparseArray<WeakReference<ClickableSpan>> w(View view) {
        return (SparseArray) view.getTag(j3.c.I);
    }

    public void A0(d dVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f55448a.setRangeInfo((AccessibilityNodeInfo.RangeInfo) dVar.f55473a);
        }
    }

    public void B0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f55448a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
        }
    }

    public boolean C() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f55448a.isAccessibilityFocused();
        }
        return false;
    }

    public void C0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f55448a.setScreenReaderFocusable(z11);
        } else {
            X(1, z11);
        }
    }

    public boolean D() {
        return this.f55448a.isCheckable();
    }

    public void D0(boolean z11) {
        this.f55448a.setScrollable(z11);
    }

    public boolean E() {
        return this.f55448a.isChecked();
    }

    public void E0(boolean z11) {
        this.f55448a.setSelected(z11);
    }

    public boolean F() {
        return this.f55448a.isClickable();
    }

    public void F0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f55448a.setShowingHintText(z11);
        } else {
            X(4, z11);
        }
    }

    public boolean G() {
        return this.f55448a.isEnabled();
    }

    public void G0(View view) {
        this.f55450c = -1;
        this.f55448a.setSource(view);
    }

    public boolean H() {
        return this.f55448a.isFocusable();
    }

    public void H0(View view, int i11) {
        this.f55450c = i11;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f55448a.setSource(view, i11);
        }
    }

    public boolean I() {
        return this.f55448a.isFocused();
    }

    public void I0(CharSequence charSequence) {
        if (r3.a.b()) {
            this.f55448a.setStateDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 19) {
            this.f55448a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean J() {
        return this.f55448a.isLongClickable();
    }

    public void J0(CharSequence charSequence) {
        this.f55448a.setText(charSequence);
    }

    public boolean K() {
        return this.f55448a.isPassword();
    }

    public void K0(int i11, int i12) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f55448a.setTextSelection(i11, i12);
        }
    }

    public boolean L() {
        return this.f55448a.isScrollable();
    }

    public void L0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f55448a.setTraversalAfter(view);
        }
    }

    public boolean M() {
        return this.f55448a.isSelected();
    }

    public void M0(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f55448a.setViewIdResourceName(str);
        }
    }

    public boolean N() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.f55448a.isShowingHintText();
        }
        return l(4);
    }

    public void N0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f55448a.setVisibleToUser(z11);
        }
    }

    public boolean O() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f55448a.isVisibleToUser();
        }
        return false;
    }

    public AccessibilityNodeInfo O0() {
        return this.f55448a;
    }

    public boolean S(int i11, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f55448a.performAction(i11, bundle);
        }
        return false;
    }

    public void T() {
        this.f55448a.recycle();
    }

    public boolean U(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            return this.f55448a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f55467a);
        }
        return false;
    }

    public void W(boolean z11) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f55448a.setAccessibilityFocused(z11);
        }
    }

    @Deprecated
    public void Y(Rect rect) {
        this.f55448a.setBoundsInParent(rect);
    }

    public void Z(Rect rect) {
        this.f55448a.setBoundsInScreen(rect);
    }

    public void a(int i11) {
        this.f55448a.addAction(i11);
    }

    public void a0(boolean z11) {
        this.f55448a.setCheckable(z11);
    }

    public void b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f55448a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f55467a);
        }
    }

    public void b0(boolean z11) {
        this.f55448a.setChecked(z11);
    }

    public void c(View view) {
        this.f55448a.addChild(view);
    }

    public void c0(CharSequence charSequence) {
        this.f55448a.setClassName(charSequence);
    }

    public void d(View view, int i11) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f55448a.addChild(view, i11);
        }
    }

    public void d0(boolean z11) {
        this.f55448a.setClickable(z11);
    }

    public void e0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f55448a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f55471a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof c)) {
            c cVar = (c) obj;
            AccessibilityNodeInfo accessibilityNodeInfo = this.f55448a;
            if (accessibilityNodeInfo == null) {
                if (cVar.f55448a != null) {
                    return false;
                }
            } else if (!accessibilityNodeInfo.equals(cVar.f55448a)) {
                return false;
            }
            return this.f55450c == cVar.f55450c && this.f55449b == cVar.f55449b;
        }
        return false;
    }

    public void f(CharSequence charSequence, View view) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 < 19 || i11 >= 26) {
            return;
        }
        g();
        V(view);
        ClickableSpan[] q11 = q(charSequence);
        if (q11 == null || q11.length <= 0) {
            return;
        }
        s().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", j3.c.f33152a);
        SparseArray<WeakReference<ClickableSpan>> u11 = u(view);
        for (int i12 = 0; i12 < q11.length; i12++) {
            int B = B(q11[i12], u11);
            u11.put(B, new WeakReference<>(q11[i12]));
            e(q11[i12], (Spanned) charSequence, B);
        }
    }

    public void f0(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f55448a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((C1263c) obj).f55472a);
        }
    }

    public void g0(CharSequence charSequence) {
        this.f55448a.setContentDescription(charSequence);
    }

    public void h0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f55448a.setContentInvalid(z11);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f55448a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List<a> i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = Build.VERSION.SDK_INT >= 21 ? this.f55448a.getActionList() : null;
        if (actionList != null) {
            ArrayList arrayList = new ArrayList();
            int size = actionList.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(new a(actionList.get(i11)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    public void i0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f55448a.setDismissable(z11);
        }
    }

    public void j0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 18) {
            this.f55448a.setEditable(z11);
        }
    }

    public int k() {
        return this.f55448a.getActions();
    }

    public void k0(boolean z11) {
        this.f55448a.setEnabled(z11);
    }

    public void l0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f55448a.setError(charSequence);
        }
    }

    @Deprecated
    public void m(Rect rect) {
        this.f55448a.getBoundsInParent(rect);
    }

    public void m0(boolean z11) {
        this.f55448a.setFocusable(z11);
    }

    public void n(Rect rect) {
        this.f55448a.getBoundsInScreen(rect);
    }

    public void n0(boolean z11) {
        this.f55448a.setFocused(z11);
    }

    public int o() {
        return this.f55448a.getChildCount();
    }

    public void o0(boolean z11) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f55448a.setHeading(z11);
        } else {
            X(2, z11);
        }
    }

    public CharSequence p() {
        return this.f55448a.getClassName();
    }

    public void p0(CharSequence charSequence) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 26) {
            this.f55448a.setHintText(charSequence);
        } else if (i11 >= 19) {
            this.f55448a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public void q0(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            this.f55448a.setLabeledBy(view);
        }
    }

    public CharSequence r() {
        return this.f55448a.getContentDescription();
    }

    public void r0(int i11) {
        if (Build.VERSION.SDK_INT >= 19) {
            this.f55448a.setLiveRegion(i11);
        }
    }

    public Bundle s() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f55448a.getExtras();
        }
        return new Bundle();
    }

    public void s0(boolean z11) {
        this.f55448a.setLongClickable(z11);
    }

    public int t() {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.f55448a.getMovementGranularities();
        }
        return 0;
    }

    public void t0(int i11) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f55448a.setMaxTextLength(i11);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(v());
        sb2.append("; className: ");
        sb2.append(p());
        sb2.append("; text: ");
        sb2.append(y());
        sb2.append("; contentDescription: ");
        sb2.append(r());
        sb2.append("; viewId: ");
        sb2.append(z());
        sb2.append("; checkable: ");
        sb2.append(D());
        sb2.append("; checked: ");
        sb2.append(E());
        sb2.append("; focusable: ");
        sb2.append(H());
        sb2.append("; focused: ");
        sb2.append(I());
        sb2.append("; selected: ");
        sb2.append(M());
        sb2.append("; clickable: ");
        sb2.append(F());
        sb2.append("; longClickable: ");
        sb2.append(J());
        sb2.append("; enabled: ");
        sb2.append(G());
        sb2.append("; password: ");
        sb2.append(K());
        sb2.append("; scrollable: " + L());
        sb2.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List<a> i11 = i();
            for (int i12 = 0; i12 < i11.size(); i12++) {
                a aVar = i11.get(i12);
                String j11 = j(aVar.b());
                if (j11.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                    j11 = aVar.c().toString();
                }
                sb2.append(j11);
                if (i12 != i11.size() - 1) {
                    sb2.append(", ");
                }
            }
        } else {
            int k11 = k();
            while (k11 != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(k11);
                k11 &= ~numberOfTrailingZeros;
                sb2.append(j(numberOfTrailingZeros));
                if (k11 != 0) {
                    sb2.append(", ");
                }
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public void u0(int i11) {
        if (Build.VERSION.SDK_INT >= 16) {
            this.f55448a.setMovementGranularities(i11);
        }
    }

    public CharSequence v() {
        return this.f55448a.getPackageName();
    }

    public void v0(CharSequence charSequence) {
        this.f55448a.setPackageName(charSequence);
    }

    public void w0(CharSequence charSequence) {
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 28) {
            this.f55448a.setPaneTitle(charSequence);
        } else if (i11 >= 19) {
            this.f55448a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public CharSequence x() {
        if (r3.a.b()) {
            return this.f55448a.getStateDescription();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            return this.f55448a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
        }
        return null;
    }

    public void x0(View view) {
        this.f55449b = -1;
        this.f55448a.setParent(view);
    }

    public CharSequence y() {
        if (A()) {
            List<Integer> h11 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> h12 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> h13 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> h14 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f55448a.getText(), 0, this.f55448a.getText().length()));
            for (int i11 = 0; i11 < h11.size(); i11++) {
                spannableString.setSpan(new w3.a(h14.get(i11).intValue(), this, s().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), h11.get(i11).intValue(), h12.get(i11).intValue(), h13.get(i11).intValue());
            }
            return spannableString;
        }
        return this.f55448a.getText();
    }

    public void y0(View view, int i11) {
        this.f55449b = i11;
        if (Build.VERSION.SDK_INT >= 16) {
            this.f55448a.setParent(view, i11);
        }
    }

    public String z() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.f55448a.getViewIdResourceName();
        }
        return null;
    }

    public void z0(boolean z11) {
        this.f55448a.setPassword(z11);
    }
}