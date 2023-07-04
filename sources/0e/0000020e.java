package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.f0;
import androidx.appcompat.widget.w0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends AppCompatTextView implements k.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: a  reason: collision with root package name */
    g f1308a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f1309b;

    /* renamed from: c  reason: collision with root package name */
    private Drawable f1310c;

    /* renamed from: d  reason: collision with root package name */
    e.b f1311d;

    /* renamed from: e  reason: collision with root package name */
    private f0 f1312e;

    /* renamed from: f  reason: collision with root package name */
    b f1313f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1314g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f1315h;

    /* renamed from: i  reason: collision with root package name */
    private int f1316i;

    /* renamed from: j  reason: collision with root package name */
    private int f1317j;

    /* renamed from: k  reason: collision with root package name */
    private int f1318k;

    /* loaded from: classes.dex */
    private class a extends f0 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.f0
        public m.e b() {
            b bVar = ActionMenuItemView.this.f1313f;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.f0
        protected boolean c() {
            m.e b11;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f1311d;
            return bVar != null && bVar.d(actionMenuItemView.f1308a) && (b11 = b()) != null && b11.b();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract m.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        return i11 >= 480 || (i11 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void g() {
        boolean z11 = true;
        boolean z12 = !TextUtils.isEmpty(this.f1309b);
        if (this.f1310c != null && (!this.f1308a.B() || (!this.f1314g && !this.f1315h))) {
            z11 = false;
        }
        boolean z13 = z12 & z11;
        setText(z13 ? this.f1309b : null);
        CharSequence contentDescription = this.f1308a.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z13 ? null : this.f1308a.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f1308a.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            w0.a(this, z13 ? null : this.f1308a.getTitle());
        } else {
            w0.a(this, tooltipText);
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return d();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return d() && this.f1308a.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void c(g gVar, int i11) {
        this.f1308a = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f1312e == null) {
            this.f1312e = new a();
        }
    }

    public boolean d() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean e() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f1308a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f1311d;
        if (bVar != null) {
            bVar.d(this.f1308a);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1314g = f();
        g();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i11, int i12) {
        int i13;
        int i14;
        boolean d11 = d();
        if (d11 && (i14 = this.f1317j) >= 0) {
            super.setPadding(i14, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i11, i12);
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int measuredWidth = getMeasuredWidth();
        if (mode == Integer.MIN_VALUE) {
            i13 = Math.min(size, this.f1316i);
        } else {
            i13 = this.f1316i;
        }
        if (mode != 1073741824 && this.f1316i > 0 && measuredWidth < i13) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i13, 1073741824), i12);
        }
        if (d11 || this.f1310c == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1310c.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var;
        if (this.f1308a.hasSubMenu() && (f0Var = this.f1312e) != null && f0Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z11) {
    }

    public void setChecked(boolean z11) {
    }

    public void setExpandedFormat(boolean z11) {
        if (this.f1315h != z11) {
            this.f1315h = z11;
            g gVar = this.f1308a;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1310c = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i11 = this.f1318k;
            if (intrinsicWidth > i11) {
                intrinsicHeight = (int) (intrinsicHeight * (i11 / intrinsicWidth));
                intrinsicWidth = i11;
            }
            if (intrinsicHeight > i11) {
                intrinsicWidth = (int) (intrinsicWidth * (i11 / intrinsicHeight));
            } else {
                i11 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i11);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(e.b bVar) {
        this.f1311d = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i11, int i12, int i13, int i14) {
        this.f1317j = i11;
        super.setPadding(i11, i12, i13, i14);
    }

    public void setPopupCallback(b bVar) {
        this.f1313f = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1309b = charSequence;
        g();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Resources resources = context.getResources();
        this.f1314g = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.j.f27284v, i11, 0);
        this.f1316i = obtainStyledAttributes.getDimensionPixelSize(g.j.f27289w, 0);
        obtainStyledAttributes.recycle();
        this.f1318k = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1317j = -1;
        setSaveEnabled(false);
    }
}