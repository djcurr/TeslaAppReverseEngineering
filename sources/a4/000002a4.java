package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.g0;

/* loaded from: classes.dex */
public class n0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: a */
    Runnable f1866a;

    /* renamed from: b */
    private c f1867b;

    /* renamed from: c */
    g0 f1868c;

    /* renamed from: d */
    private Spinner f1869d;

    /* renamed from: e */
    private boolean f1870e;

    /* renamed from: f */
    int f1871f;

    /* renamed from: g */
    int f1872g;

    /* renamed from: h */
    private int f1873h;

    /* renamed from: i */
    private int f1874i;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f1875a;

        a(View view) {
            n0.this = r1;
            this.f1875a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            n0.this.smoothScrollTo(this.f1875a.getLeft() - ((n0.this.getWidth() - this.f1875a.getWidth()) / 2), 0);
            n0.this.f1866a = null;
        }
    }

    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
            n0.this = r1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return n0.this.f1868c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i11) {
            return ((d) n0.this.f1868c.getChildAt(i11)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            return i11;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            if (view == null) {
                return n0.this.c((a.c) getItem(i11), true);
            }
            ((d) view).a((a.c) getItem(i11));
            return view;
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
            n0.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = n0.this.f1868c.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = n0.this.f1868c.getChildAt(i11);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: a */
        private final int[] f1879a;

        /* renamed from: b */
        private a.c f1880b;

        /* renamed from: c */
        private TextView f1881c;

        /* renamed from: d */
        private ImageView f1882d;

        /* renamed from: e */
        private View f1883e;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public d(android.content.Context r6, androidx.appcompat.app.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.n0.this = r5
                int r5 = g.a.f27042d
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1879a = r1
                r4.f1880b = r7
                androidx.appcompat.widget.u0 r5 = androidx.appcompat.widget.u0.v(r6, r0, r1, r5, r3)
                boolean r6 = r5.s(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.g(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.w()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.n0.d.<init>(androidx.appcompat.widget.n0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f1880b = cVar;
            c();
        }

        public a.c b() {
            return this.f1880b;
        }

        public void c() {
            a.c cVar = this.f1880b;
            View b11 = cVar.b();
            if (b11 != null) {
                ViewParent parent = b11.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b11);
                    }
                    addView(b11);
                }
                this.f1883e = b11;
                TextView textView = this.f1881c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1882d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f1882d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f1883e;
            if (view != null) {
                removeView(view);
                this.f1883e = null;
            }
            Drawable c11 = cVar.c();
            CharSequence d11 = cVar.d();
            if (c11 != null) {
                if (this.f1882d == null) {
                    AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    appCompatImageView.setLayoutParams(layoutParams);
                    addView(appCompatImageView, 0);
                    this.f1882d = appCompatImageView;
                }
                this.f1882d.setImageDrawable(c11);
                this.f1882d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1882d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1882d.setImageDrawable(null);
                }
            }
            boolean z11 = !TextUtils.isEmpty(d11);
            if (z11) {
                if (this.f1881c == null) {
                    AppCompatTextView appCompatTextView = new AppCompatTextView(getContext(), null, g.a.f27043e);
                    appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    appCompatTextView.setLayoutParams(layoutParams2);
                    addView(appCompatTextView);
                    this.f1881c = appCompatTextView;
                }
                this.f1881c.setText(d11);
                this.f1881c.setVisibility(0);
            } else {
                TextView textView2 = this.f1881c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1881c.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1882d;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            w0.a(this, z11 ? null : cVar.a());
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i11, int i12) {
            super.onMeasure(i11, i12);
            if (n0.this.f1871f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i13 = n0.this.f1871f;
                if (measuredWidth > i13) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z11) {
            boolean z12 = isSelected() != z11;
            super.setSelected(z11);
            if (z12 && z11) {
                sendAccessibilityEvent(4);
            }
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner b() {
        v vVar = new v(getContext(), null, g.a.f27046h);
        vVar.setLayoutParams(new g0.a(-2, -1));
        vVar.setOnItemSelectedListener(this);
        return vVar;
    }

    private boolean d() {
        Spinner spinner = this.f1869d;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1869d == null) {
            this.f1869d = b();
        }
        removeView(this.f1868c);
        addView(this.f1869d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1869d.getAdapter() == null) {
            this.f1869d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1866a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1866a = null;
        }
        this.f1869d.setSelection(this.f1874i);
    }

    private boolean f() {
        if (d()) {
            removeView(this.f1869d);
            addView(this.f1868c, new ViewGroup.LayoutParams(-2, -1));
            setTabSelected(this.f1869d.getSelectedItemPosition());
            return false;
        }
        return false;
    }

    public void a(int i11) {
        View childAt = this.f1868c.getChildAt(i11);
        Runnable runnable = this.f1866a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1866a = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z11) {
        d dVar = new d(getContext(), cVar, z11);
        if (z11) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f1873h));
        } else {
            dVar.setFocusable(true);
            if (this.f1867b == null) {
                this.f1867b = new c();
            }
            dVar.setOnClickListener(this.f1867b);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1866a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        l.a b11 = l.a.b(getContext());
        setContentHeight(b11.f());
        this.f1872g = b11.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1866a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i11, int i12) {
        int mode = View.MeasureSpec.getMode(i11);
        boolean z11 = true;
        boolean z12 = mode == 1073741824;
        setFillViewport(z12);
        int childCount = this.f1868c.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                this.f1871f = (int) (View.MeasureSpec.getSize(i11) * 0.4f);
            } else {
                this.f1871f = View.MeasureSpec.getSize(i11) / 2;
            }
            this.f1871f = Math.min(this.f1871f, this.f1872g);
        } else {
            this.f1871f = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f1873h, 1073741824);
        if (z12 || !this.f1870e) {
            z11 = false;
        }
        if (z11) {
            this.f1868c.measure(0, makeMeasureSpec);
            if (this.f1868c.getMeasuredWidth() > View.MeasureSpec.getSize(i11)) {
                e();
            } else {
                f();
            }
        } else {
            f();
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i11, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z12 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f1874i);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z11) {
        this.f1870e = z11;
    }

    public void setContentHeight(int i11) {
        this.f1873h = i11;
        requestLayout();
    }

    public void setTabSelected(int i11) {
        this.f1874i = i11;
        int childCount = this.f1868c.getChildCount();
        int i12 = 0;
        while (i12 < childCount) {
            View childAt = this.f1868c.getChildAt(i12);
            boolean z11 = i12 == i11;
            childAt.setSelected(z11);
            if (z11) {
                a(i11);
            }
            i12++;
        }
        Spinner spinner = this.f1869d;
        if (spinner == null || i11 < 0) {
            return;
        }
        spinner.setSelection(i11);
    }
}