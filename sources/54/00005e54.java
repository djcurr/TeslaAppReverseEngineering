package com.swmansion.rnscreens;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.swmansion.rnscreens.p;
import java.util.ArrayList;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class o extends ViewGroup {

    /* renamed from: a */
    private final ArrayList<p> f21283a;

    /* renamed from: b */
    private final Toolbar f21284b;

    /* renamed from: c */
    private String f21285c;

    /* renamed from: d */
    private int f21286d;

    /* renamed from: e */
    private String f21287e;

    /* renamed from: f */
    private String f21288f;

    /* renamed from: g */
    private float f21289g;

    /* renamed from: h */
    private int f21290h;

    /* renamed from: i */
    private Integer f21291i;

    /* renamed from: j */
    private boolean f21292j;

    /* renamed from: k */
    private boolean f21293k;

    /* renamed from: l */
    private boolean f21294l;

    /* renamed from: m */
    private boolean f21295m;

    /* renamed from: n */
    private boolean f21296n;

    /* renamed from: o */
    private boolean f21297o;

    /* renamed from: p */
    private boolean f21298p;

    /* renamed from: q */
    private int f21299q;

    /* renamed from: t */
    private boolean f21300t;

    /* renamed from: w */
    private final int f21301w;

    /* renamed from: x */
    private final int f21302x;

    /* renamed from: y */
    private final View.OnClickListener f21303y;

    /* loaded from: classes6.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f21304a;

        static {
            int[] iArr = new int[p.a.values().length];
            iArr[p.a.LEFT.ordinal()] = 1;
            iArr[p.a.RIGHT.ordinal()] = 2;
            iArr[p.a.CENTER.ordinal()] = 3;
            f21304a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(Context context) {
        super(context);
        kotlin.jvm.internal.s.g(context, "context");
        this.f21283a = new ArrayList<>(3);
        this.f21297o = true;
        this.f21303y = new View.OnClickListener() { // from class: com.swmansion.rnscreens.n
            {
                o.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                o.a(o.this, view);
            }
        };
        setVisibility(8);
        Toolbar toolbar = new Toolbar(context);
        this.f21284b = toolbar;
        this.f21301w = toolbar.getContentInsetStart();
        this.f21302x = toolbar.getContentInsetStartWithNavigation();
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(b.f21221a, typedValue, true)) {
            toolbar.setBackgroundColor(typedValue.data);
        }
        toolbar.setClipChildren(false);
    }

    public static /* synthetic */ void a(o oVar, View view) {
        e(oVar, view);
    }

    public static final void e(o this$0, View view) {
        kotlin.jvm.internal.s.g(this$0, "this$0");
        m screenFragment = this$0.getScreenFragment();
        if (screenFragment == null) {
            return;
        }
        k screenStack = this$0.getScreenStack();
        if (screenStack != null && kotlin.jvm.internal.s.c(screenStack.getRootScreen(), screenFragment.m())) {
            Fragment parentFragment = screenFragment.getParentFragment();
            if (parentFragment instanceof m) {
                m mVar = (m) parentFragment;
                if (mVar.m().getNativeBackButtonDismissalEnabled()) {
                    mVar.dismiss();
                } else {
                    mVar.e();
                }
            }
        } else if (screenFragment.m().getNativeBackButtonDismissalEnabled()) {
            screenFragment.dismiss();
        } else {
            screenFragment.e();
        }
    }

    private final void f() {
        if (getParent() == null || this.f21295m) {
            return;
        }
        g();
    }

    private final d getScreen() {
        ViewParent parent = getParent();
        if (parent instanceof d) {
            return (d) parent;
        }
        return null;
    }

    private final m getScreenFragment() {
        ViewParent parent = getParent();
        if (parent instanceof d) {
            i fragment = ((d) parent).getFragment();
            if (fragment instanceof m) {
                return (m) fragment;
            }
            return null;
        }
        return null;
    }

    private final k getScreenStack() {
        d screen = getScreen();
        if (screen != null) {
            f<?> container = screen.getContainer();
            if (container instanceof k) {
                return (k) container;
            }
            return null;
        }
        return null;
    }

    private final TextView getTitleTextView() {
        int childCount = this.f21284b.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = this.f21284b.getChildAt(i11);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (kotlin.jvm.internal.s.c(textView.getText(), this.f21284b.getTitle())) {
                    return textView;
                }
            }
        }
        return null;
    }

    public final void b(p child, int i11) {
        kotlin.jvm.internal.s.g(child, "child");
        this.f21283a.add(i11, child);
        f();
    }

    public final void c() {
        this.f21295m = true;
    }

    public final p d(int i11) {
        p pVar = this.f21283a.get(i11);
        kotlin.jvm.internal.s.f(pVar, "mConfigSubviews[index]");
        return pVar;
    }

    public final void g() {
        Drawable navigationIcon;
        m screenFragment;
        m screenFragment2;
        ReactContext w11;
        String str;
        k screenStack = getScreenStack();
        boolean z11 = screenStack == null || kotlin.jvm.internal.s.c(screenStack.getTopScreen(), getParent());
        if (this.f21300t && z11 && !this.f21295m) {
            m screenFragment3 = getScreenFragment();
            androidx.appcompat.app.d dVar = (androidx.appcompat.app.d) (screenFragment3 == null ? null : screenFragment3.getActivity());
            if (dVar == null) {
                return;
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 17 && (str = this.f21288f) != null) {
                if (kotlin.jvm.internal.s.c(str, "rtl")) {
                    this.f21284b.setLayoutDirection(1);
                } else if (kotlin.jvm.internal.s.c(this.f21288f, "ltr")) {
                    this.f21284b.setLayoutDirection(0);
                }
            }
            d screen = getScreen();
            if (screen != null) {
                if (getContext() instanceof ReactContext) {
                    Context context = getContext();
                    Objects.requireNonNull(context, "null cannot be cast to non-null type com.facebook.react.bridge.ReactContext");
                    w11 = (ReactContext) context;
                } else {
                    i fragment = screen.getFragment();
                    w11 = fragment == null ? null : fragment.w();
                }
                s.f21312a.p(screen, dVar, w11);
            }
            if (this.f21292j) {
                if (this.f21284b.getParent() == null || (screenFragment2 = getScreenFragment()) == null) {
                    return;
                }
                screenFragment2.D();
                return;
            }
            if (this.f21284b.getParent() == null && (screenFragment = getScreenFragment()) != null) {
                screenFragment.E(this.f21284b);
            }
            if (this.f21297o) {
                if (i11 >= 23) {
                    this.f21284b.setPadding(0, getRootWindowInsets().getSystemWindowInsetTop(), 0, 0);
                } else {
                    this.f21284b.setPadding(0, (int) (25 * getResources().getDisplayMetrics().density), 0, 0);
                }
            } else if (this.f21284b.getPaddingTop() > 0) {
                this.f21284b.setPadding(0, 0, 0, 0);
            }
            dVar.setSupportActionBar(this.f21284b);
            androidx.appcompat.app.a supportActionBar = dVar.getSupportActionBar();
            if (supportActionBar != null) {
                this.f21284b.setContentInsetStartWithNavigation(this.f21302x);
                Toolbar toolbar = this.f21284b;
                int i12 = this.f21301w;
                toolbar.H(i12, i12);
                m screenFragment4 = getScreenFragment();
                supportActionBar.v((screenFragment4 != null && screenFragment4.A()) && !this.f21293k);
                this.f21284b.setNavigationOnClickListener(this.f21303y);
                m screenFragment5 = getScreenFragment();
                if (screenFragment5 != null) {
                    screenFragment5.F(this.f21294l);
                }
                m screenFragment6 = getScreenFragment();
                if (screenFragment6 != null) {
                    screenFragment6.G(this.f21298p);
                }
                supportActionBar.C(this.f21285c);
                if (TextUtils.isEmpty(this.f21285c)) {
                    this.f21284b.setContentInsetStartWithNavigation(0);
                }
                TextView titleTextView = getTitleTextView();
                int i13 = this.f21286d;
                if (i13 != 0) {
                    this.f21284b.setTitleTextColor(i13);
                }
                if (titleTextView != null) {
                    String str2 = this.f21287e;
                    if (str2 != null || this.f21290h > 0) {
                        Typeface a11 = com.facebook.react.views.text.u.a(null, 0, this.f21290h, str2, getContext().getAssets());
                        kotlin.jvm.internal.s.f(a11, "applyStyles(\n           ….assets\n                )");
                        titleTextView.setTypeface(a11);
                    }
                    float f11 = this.f21289g;
                    if (f11 > BitmapDescriptorFactory.HUE_RED) {
                        titleTextView.setTextSize(f11);
                    }
                }
                Integer num = this.f21291i;
                if (num != null) {
                    getToolbar().setBackgroundColor(num.intValue());
                }
                if (this.f21299q != 0 && (navigationIcon = this.f21284b.getNavigationIcon()) != null) {
                    navigationIcon.setColorFilter(this.f21299q, PorterDuff.Mode.SRC_ATOP);
                }
                int childCount = this.f21284b.getChildCount() - 1;
                if (childCount >= 0) {
                    while (true) {
                        int i14 = childCount - 1;
                        if (this.f21284b.getChildAt(childCount) instanceof p) {
                            this.f21284b.removeViewAt(childCount);
                        }
                        if (i14 < 0) {
                            break;
                        }
                        childCount = i14;
                    }
                }
                int size = this.f21283a.size();
                for (int i15 = 0; i15 < size; i15++) {
                    p pVar = this.f21283a.get(i15);
                    kotlin.jvm.internal.s.f(pVar, "mConfigSubviews[i]");
                    p pVar2 = pVar;
                    p.a type = pVar2.getType();
                    if (type == p.a.BACK) {
                        View childAt = pVar2.getChildAt(0);
                        ImageView imageView = childAt instanceof ImageView ? (ImageView) childAt : null;
                        if (imageView != null) {
                            supportActionBar.z(imageView.getDrawable());
                        } else {
                            throw new JSApplicationIllegalArgumentException("Back button header config view should have Image as first child");
                        }
                    } else {
                        Toolbar.e eVar = new Toolbar.e(-2, -1);
                        int i16 = a.f21304a[type.ordinal()];
                        if (i16 == 1) {
                            if (!this.f21296n) {
                                this.f21284b.setNavigationIcon((Drawable) null);
                            }
                            this.f21284b.setTitle((CharSequence) null);
                            eVar.f1141a = 8388611;
                        } else if (i16 == 2) {
                            eVar.f1141a = 8388613;
                        } else if (i16 == 3) {
                            ((ViewGroup.MarginLayoutParams) eVar).width = -1;
                            eVar.f1141a = 1;
                            this.f21284b.setTitle((CharSequence) null);
                        }
                        pVar2.setLayoutParams(eVar);
                        this.f21284b.addView(pVar2);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    public final int getConfigSubviewsCount() {
        return this.f21283a.size();
    }

    public final Toolbar getToolbar() {
        return this.f21284b;
    }

    public final void h() {
        this.f21283a.clear();
        f();
    }

    public final void i(int i11) {
        this.f21283a.remove(i11);
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f21300t = true;
        g();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f21300t = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
    }

    public final void setBackButtonInCustomView(boolean z11) {
        this.f21296n = z11;
    }

    public final void setBackgroundColor(Integer num) {
        this.f21291i = num;
    }

    public final void setDirection(String str) {
        this.f21288f = str;
    }

    public final void setHidden(boolean z11) {
        this.f21292j = z11;
    }

    public final void setHideBackButton(boolean z11) {
        this.f21293k = z11;
    }

    public final void setHideShadow(boolean z11) {
        this.f21294l = z11;
    }

    public final void setTintColor(int i11) {
        this.f21299q = i11;
    }

    public final void setTitle(String str) {
        this.f21285c = str;
    }

    public final void setTitleColor(int i11) {
        this.f21286d = i11;
    }

    public final void setTitleFontFamily(String str) {
        this.f21287e = str;
    }

    public final void setTitleFontSize(float f11) {
        this.f21289g = f11;
    }

    public final void setTitleFontWeight(String str) {
        this.f21290h = com.facebook.react.views.text.u.d(str);
    }

    public final void setTopInsetEnabled(boolean z11) {
        this.f21297o = z11;
    }

    public final void setTranslucent(boolean z11) {
        this.f21298p = z11;
    }
}