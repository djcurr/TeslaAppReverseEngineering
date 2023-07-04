package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.u0;
import androidx.core.view.a0;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: a  reason: collision with root package name */
    private g f1323a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f1324b;

    /* renamed from: c  reason: collision with root package name */
    private RadioButton f1325c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f1326d;

    /* renamed from: e  reason: collision with root package name */
    private CheckBox f1327e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f1328f;

    /* renamed from: g  reason: collision with root package name */
    private ImageView f1329g;

    /* renamed from: h  reason: collision with root package name */
    private ImageView f1330h;

    /* renamed from: i  reason: collision with root package name */
    private LinearLayout f1331i;

    /* renamed from: j  reason: collision with root package name */
    private Drawable f1332j;

    /* renamed from: k  reason: collision with root package name */
    private int f1333k;

    /* renamed from: l  reason: collision with root package name */
    private Context f1334l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f1335m;

    /* renamed from: n  reason: collision with root package name */
    private Drawable f1336n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f1337o;

    /* renamed from: p  reason: collision with root package name */
    private LayoutInflater f1338p;

    /* renamed from: q  reason: collision with root package name */
    private boolean f1339q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.C);
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i11) {
        LinearLayout linearLayout = this.f1331i;
        if (linearLayout != null) {
            linearLayout.addView(view, i11);
        } else {
            addView(view, i11);
        }
    }

    private void d() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(g.g.f27148h, (ViewGroup) this, false);
        this.f1327e = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(g.g.f27149i, (ViewGroup) this, false);
        this.f1324b = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(g.g.f27151k, (ViewGroup) this, false);
        this.f1325c = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f1338p == null) {
            this.f1338p = LayoutInflater.from(getContext());
        }
        return this.f1338p;
    }

    private void setSubMenuArrowVisible(boolean z11) {
        ImageView imageView = this.f1329g;
        if (imageView != null) {
            imageView.setVisibility(z11 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1330h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1330h.getLayoutParams();
        rect.top += this.f1330h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i11) {
        this.f1323a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f1323a;
    }

    public void h(boolean z11, char c11) {
        int i11 = (z11 && this.f1323a.A()) ? 0 : 8;
        if (i11 == 0) {
            this.f1328f.setText(this.f1323a.h());
        }
        if (this.f1328f.getVisibility() != i11) {
            this.f1328f.setVisibility(i11);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        a0.z0(this, this.f1332j);
        TextView textView = (TextView) findViewById(g.f.M);
        this.f1326d = textView;
        int i11 = this.f1333k;
        if (i11 != -1) {
            textView.setTextAppearance(this.f1334l, i11);
        }
        this.f1328f = (TextView) findViewById(g.f.F);
        ImageView imageView = (ImageView) findViewById(g.f.I);
        this.f1329g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1336n);
        }
        this.f1330h = (ImageView) findViewById(g.f.f27132r);
        this.f1331i = (LinearLayout) findViewById(g.f.f27126l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f1324b != null && this.f1335m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1324b.getLayoutParams();
            int i13 = layoutParams.height;
            if (i13 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i13;
            }
        }
        super.onMeasure(i11, i12);
    }

    public void setCheckable(boolean z11) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z11 && this.f1325c == null && this.f1327e == null) {
            return;
        }
        if (this.f1323a.m()) {
            if (this.f1325c == null) {
                g();
            }
            compoundButton = this.f1325c;
            compoundButton2 = this.f1327e;
        } else {
            if (this.f1327e == null) {
                d();
            }
            compoundButton = this.f1327e;
            compoundButton2 = this.f1325c;
        }
        if (z11) {
            compoundButton.setChecked(this.f1323a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (compoundButton2 == null || compoundButton2.getVisibility() == 8) {
                return;
            }
            compoundButton2.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f1327e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f1325c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z11) {
        CompoundButton compoundButton;
        if (this.f1323a.m()) {
            if (this.f1325c == null) {
                g();
            }
            compoundButton = this.f1325c;
        } else {
            if (this.f1327e == null) {
                d();
            }
            compoundButton = this.f1327e;
        }
        compoundButton.setChecked(z11);
    }

    public void setForceShowIcon(boolean z11) {
        this.f1339q = z11;
        this.f1335m = z11;
    }

    public void setGroupDividerEnabled(boolean z11) {
        ImageView imageView = this.f1330h;
        if (imageView != null) {
            imageView.setVisibility((this.f1337o || !z11) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z11 = this.f1323a.z() || this.f1339q;
        if (z11 || this.f1335m) {
            ImageView imageView = this.f1324b;
            if (imageView == null && drawable == null && !this.f1335m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f1335m) {
                this.f1324b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f1324b;
            if (!z11) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f1324b.getVisibility() != 0) {
                this.f1324b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence != null) {
            this.f1326d.setText(charSequence);
            if (this.f1326d.getVisibility() != 0) {
                this.f1326d.setVisibility(0);
            }
        } else if (this.f1326d.getVisibility() != 8) {
            this.f1326d.setVisibility(8);
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet);
        u0 v11 = u0.v(getContext(), attributeSet, g.j.I1, i11, 0);
        this.f1332j = v11.g(g.j.K1);
        this.f1333k = v11.n(g.j.J1, -1);
        this.f1335m = v11.a(g.j.L1, false);
        this.f1334l = context;
        this.f1336n = v11.g(g.j.M1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, g.a.f27064z, 0);
        this.f1337o = obtainStyledAttributes.hasValue(0);
        v11.w();
        obtainStyledAttributes.recycle();
    }
}