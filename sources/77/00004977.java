package com.reactnativecommunity.picker;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import androidx.appcompat.widget.v;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;

/* loaded from: classes2.dex */
public class h extends v {

    /* renamed from: a  reason: collision with root package name */
    private int f20121a;

    /* renamed from: b  reason: collision with root package name */
    private Integer f20122b;

    /* renamed from: c  reason: collision with root package name */
    private d f20123c;

    /* renamed from: d  reason: collision with root package name */
    private c f20124d;

    /* renamed from: e  reason: collision with root package name */
    private Integer f20125e;

    /* renamed from: f  reason: collision with root package name */
    private int f20126f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f20127g;

    /* renamed from: h  reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f20128h;

    /* renamed from: i  reason: collision with root package name */
    private final Runnable f20129i;

    /* loaded from: classes2.dex */
    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i11, long j11) {
            if (h.this.f20123c != null) {
                h.this.f20123c.a(i11);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
            if (h.this.f20123c != null) {
                h.this.f20123c.a(-1);
            }
        }
    }

    /* loaded from: classes2.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.measure(View.MeasureSpec.makeMeasureSpec(hVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(h.this.getHeight(), 1073741824));
            h hVar2 = h.this;
            hVar2.layout(hVar2.getLeft(), h.this.getTop(), h.this.getRight(), h.this.getBottom());
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void b();

        void c();
    }

    /* loaded from: classes2.dex */
    public interface d {
        void a(int i11);
    }

    public h(Context context, int i11) {
        super(context, i11);
        this.f20121a = 0;
        this.f20126f = Integer.MIN_VALUE;
        this.f20127g = false;
        this.f20128h = new a();
        this.f20129i = new b();
        this.f20121a = i11;
        b(context);
        c();
    }

    private void b(Context context) {
        if (jg.a.d().g(context)) {
            setLayoutDirection(1);
            setTextDirection(4);
            return;
        }
        setLayoutDirection(0);
        setTextDirection(3);
    }

    private void c() {
        setBackgroundResource(com.reactnativecommunity.picker.d.spinner_dropdown_background);
        setBackgroundColor(0);
    }

    private ReactContext getReactContext() {
        Context context = getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    private void setSelectionWithSuppressEvent(int i11) {
        if (i11 != getSelectedItemPosition()) {
            setOnItemSelectedListener(null);
            setSelection(i11, false);
            setOnItemSelectedListener(this.f20128h);
        }
    }

    public void d() {
        Integer num = this.f20125e;
        if (num != null) {
            setSelectionWithSuppressEvent(num.intValue());
            this.f20125e = null;
        }
    }

    public int getMode() {
        return this.f20121a;
    }

    public c getOnFocusListener() {
        return this.f20124d;
    }

    public d getOnSelectListener() {
        return this.f20123c;
    }

    public Integer getPrimaryColor() {
        return this.f20122b;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        if (getOnItemSelectedListener() == null) {
            setOnItemSelectedListener(this.f20128h);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.v, android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i11, int i12) {
        int applyDimension;
        super.onMeasure(i11, i12);
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition >= 0 && getAdapter() != null && selectedItemPosition < getAdapter().getCount()) {
            View view = getAdapter().getView(selectedItemPosition, null, this);
            measureChild(view, View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            applyDimension = view.getMeasuredHeight();
        } else {
            applyDimension = (int) TypedValue.applyDimension(1, 50.0f, Resources.getSystem().getDisplayMetrics());
        }
        if (applyDimension != this.f20126f) {
            UIManagerModule uIManagerModule = (UIManagerModule) getReactContext().getNativeModule(UIManagerModule.class);
            if (uIManagerModule != null) {
                uIManagerModule.setViewLocalData(getId(), new i(applyDimension));
            }
            this.f20126f = applyDimension;
        }
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z11) {
        if (this.f20127g && z11) {
            this.f20127g = false;
            c cVar = this.f20124d;
            if (cVar != null) {
                cVar.b();
            }
        }
    }

    @Override // androidx.appcompat.widget.v, android.widget.Spinner, android.view.View
    public boolean performClick() {
        this.f20127g = true;
        c cVar = this.f20124d;
        if (cVar != null) {
            cVar.c();
        }
        return super.performClick();
    }

    @Override // android.widget.AbsSpinner, android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        post(this.f20129i);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i11) {
        ((GradientDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(e.dropdown_background)).setColor(i11);
    }

    public void setDropdownIconColor(int i11) {
        ((RippleDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(e.dropdown_icon)).setColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
    }

    public void setDropdownIconRippleColor(int i11) {
        ((RippleDrawable) ((LayerDrawable) getBackground()).findDrawableByLayerId(e.dropdown_icon)).setColor(ColorStateList.valueOf(i11));
    }

    public void setOnFocusListener(c cVar) {
        this.f20124d = cVar;
    }

    public void setOnSelectListener(d dVar) {
        this.f20123c = dVar;
    }

    public void setPrimaryColor(Integer num) {
        this.f20122b = num;
    }

    public void setStagedSelection(int i11) {
        this.f20125e = Integer.valueOf(i11);
    }
}