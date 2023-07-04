package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.c;

/* loaded from: classes.dex */
public class v extends Spinner implements androidx.core.view.y {
    private static final int[] ATTRS_ANDROID_SPINNERMODE = {16843505};
    private static final int MAX_ITEMS_MEASURED = 15;
    private static final int MODE_DIALOG = 0;
    private static final int MODE_DROPDOWN = 1;
    private static final int MODE_THEME = -1;
    private static final String TAG = "AppCompatSpinner";
    private final androidx.appcompat.widget.d mBackgroundTintHelper;
    int mDropDownWidth;
    private f0 mForwardingListener;
    private g mPopup;
    private final Context mPopupContext;
    private final boolean mPopupSet;
    private SpinnerAdapter mTempAdapter;
    final Rect mTempRect;

    /* loaded from: classes.dex */
    class a extends f0 {

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ e f1937j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, e eVar) {
            super(view);
            this.f1937j = eVar;
        }

        @Override // androidx.appcompat.widget.f0
        public m.e b() {
            return this.f1937j;
        }

        @Override // androidx.appcompat.widget.f0
        public boolean c() {
            if (v.this.getInternalPopup().b()) {
                return true;
            }
            v.this.showPopup();
            return true;
        }
    }

    /* loaded from: classes.dex */
    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!v.this.getInternalPopup().b()) {
                v.this.showPopup();
            }
            ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                if (Build.VERSION.SDK_INT >= 16) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                } else {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements g, DialogInterface.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        androidx.appcompat.app.c f1940a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f1941b;

        /* renamed from: c  reason: collision with root package name */
        private CharSequence f1942c;

        c() {
        }

        @Override // androidx.appcompat.widget.v.g
        public void a(Drawable drawable) {
            Log.e(v.TAG, "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public boolean b() {
            androidx.appcompat.app.c cVar = this.f1940a;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.v.g
        public int c() {
            return 0;
        }

        @Override // androidx.appcompat.widget.v.g
        public void dismiss() {
            androidx.appcompat.app.c cVar = this.f1940a;
            if (cVar != null) {
                cVar.dismiss();
                this.f1940a = null;
            }
        }

        @Override // androidx.appcompat.widget.v.g
        public void e(int i11) {
            Log.e(v.TAG, "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence f() {
            return this.f1942c;
        }

        @Override // androidx.appcompat.widget.v.g
        public Drawable g() {
            return null;
        }

        @Override // androidx.appcompat.widget.v.g
        public void h(CharSequence charSequence) {
            this.f1942c = charSequence;
        }

        @Override // androidx.appcompat.widget.v.g
        public void i(int i11) {
            Log.e(v.TAG, "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void j(int i11) {
            Log.e(v.TAG, "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.v.g
        public void k(int i11, int i12) {
            if (this.f1941b == null) {
                return;
            }
            c.a aVar = new c.a(v.this.getPopupContext());
            CharSequence charSequence = this.f1942c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.c create = aVar.h(this.f1941b, v.this.getSelectedItemPosition(), this).create();
            this.f1940a = create;
            ListView e11 = create.e();
            if (Build.VERSION.SDK_INT >= 17) {
                e11.setTextDirection(i11);
                e11.setTextAlignment(i12);
            }
            this.f1940a.show();
        }

        @Override // androidx.appcompat.widget.v.g
        public int l() {
            return 0;
        }

        @Override // androidx.appcompat.widget.v.g
        public void m(ListAdapter listAdapter) {
            this.f1941b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i11) {
            v.this.setSelection(i11);
            if (v.this.getOnItemClickListener() != null) {
                v.this.performItemClick(null, i11, this.f1941b.getItemId(i11));
            }
            dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d implements ListAdapter, SpinnerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private SpinnerAdapter f1944a;

        /* renamed from: b  reason: collision with root package name */
        private ListAdapter f1945b;

        public d(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1944a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1945b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (Build.VERSION.SDK_INT >= 23 && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                    ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                    if (themedSpinnerAdapter.getDropDownViewTheme() != theme) {
                        themedSpinnerAdapter.setDropDownViewTheme(theme);
                    }
                } else if (spinnerAdapter instanceof q0) {
                    q0 q0Var = (q0) spinnerAdapter;
                    if (q0Var.getDropDownViewTheme() == null) {
                        q0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1945b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1944a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i11, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1944a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i11, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i11) {
            SpinnerAdapter spinnerAdapter = this.f1944a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i11);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i11) {
            SpinnerAdapter spinnerAdapter = this.f1944a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i11);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i11) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i11, View view, ViewGroup viewGroup) {
            return getDropDownView(i11, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1944a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i11) {
            ListAdapter listAdapter = this.f1945b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i11);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1944a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1944a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* loaded from: classes.dex */
    class e extends h0 implements g {
        private CharSequence R;
        ListAdapter T;
        private final Rect Y;

        /* renamed from: b1  reason: collision with root package name */
        private int f1946b1;

        /* loaded from: classes.dex */
        class a implements AdapterView.OnItemClickListener {
            a(v vVar) {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i11, long j11) {
                v.this.setSelection(i11);
                if (v.this.getOnItemClickListener() != null) {
                    e eVar = e.this;
                    v.this.performItemClick(view, i11, eVar.T.getItemId(i11));
                }
                e.this.dismiss();
            }
        }

        /* loaded from: classes.dex */
        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                e eVar = e.this;
                if (!eVar.T(v.this)) {
                    e.this.dismiss();
                    return;
                }
                e.this.R();
                e.super.show();
            }
        }

        /* loaded from: classes.dex */
        class c implements PopupWindow.OnDismissListener {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1950a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1950a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = v.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1950a);
                }
            }
        }

        public e(Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            this.Y = new Rect();
            C(v.this);
            I(true);
            N(0);
            K(new a(v.this));
        }

        void R() {
            int S;
            Drawable g11 = g();
            int i11 = 0;
            if (g11 != null) {
                g11.getPadding(v.this.mTempRect);
                i11 = a1.b(v.this) ? v.this.mTempRect.right : -v.this.mTempRect.left;
            } else {
                Rect rect = v.this.mTempRect;
                rect.right = 0;
                rect.left = 0;
            }
            int paddingLeft = v.this.getPaddingLeft();
            int paddingRight = v.this.getPaddingRight();
            int width = v.this.getWidth();
            v vVar = v.this;
            int i12 = vVar.mDropDownWidth;
            if (i12 == -2) {
                int compatMeasureContentWidth = vVar.compatMeasureContentWidth((SpinnerAdapter) this.T, g());
                int i13 = v.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = v.this.mTempRect;
                int i14 = (i13 - rect2.left) - rect2.right;
                if (compatMeasureContentWidth > i14) {
                    compatMeasureContentWidth = i14;
                }
                E(Math.max(compatMeasureContentWidth, (width - paddingLeft) - paddingRight));
            } else if (i12 == -1) {
                E((width - paddingLeft) - paddingRight);
            } else {
                E(i12);
            }
            if (a1.b(v.this)) {
                S = i11 + (((width - paddingRight) - y()) - S());
            } else {
                S = i11 + paddingLeft + S();
            }
            e(S);
        }

        public int S() {
            return this.f1946b1;
        }

        boolean T(View view) {
            return androidx.core.view.a0.Y(view) && view.getGlobalVisibleRect(this.Y);
        }

        @Override // androidx.appcompat.widget.v.g
        public CharSequence f() {
            return this.R;
        }

        @Override // androidx.appcompat.widget.v.g
        public void h(CharSequence charSequence) {
            this.R = charSequence;
        }

        @Override // androidx.appcompat.widget.v.g
        public void j(int i11) {
            this.f1946b1 = i11;
        }

        @Override // androidx.appcompat.widget.v.g
        public void k(int i11, int i12) {
            ViewTreeObserver viewTreeObserver;
            boolean b11 = b();
            R();
            H(2);
            super.show();
            ListView o11 = o();
            o11.setChoiceMode(1);
            if (Build.VERSION.SDK_INT >= 17) {
                o11.setTextDirection(i11);
                o11.setTextAlignment(i12);
            }
            O(v.this.getSelectedItemPosition());
            if (b11 || (viewTreeObserver = v.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            J(new c(bVar));
        }

        @Override // androidx.appcompat.widget.h0, androidx.appcompat.widget.v.g
        public void m(ListAdapter listAdapter) {
            super.m(listAdapter);
            this.T = listAdapter;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class f extends View.BaseSavedState {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* renamed from: a  reason: collision with root package name */
        boolean f1952a;

        /* loaded from: classes.dex */
        class a implements Parcelable.Creator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public f[] newArray(int i11) {
                return new f[i11];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            super.writeToParcel(parcel, i11);
            parcel.writeByte(this.f1952a ? (byte) 1 : (byte) 0);
        }

        f(Parcel parcel) {
            super(parcel);
            this.f1952a = parcel.readByte() != 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        void a(Drawable drawable);

        boolean b();

        int c();

        void dismiss();

        void e(int i11);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(int i11);

        void j(int i11);

        void k(int i11, int i12);

        int l();

        void m(ListAdapter listAdapter);
    }

    public v(Context context) {
        this(context, (AttributeSet) null);
    }

    int compatMeasureContentWidth(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i11 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i12 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i12 = Math.max(i12, view.getMeasuredWidth());
        }
        if (drawable != null) {
            drawable.getPadding(this.mTempRect);
            Rect rect = this.mTempRect;
            return i12 + rect.left + rect.right;
        }
        return i12;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        g gVar = this.mPopup;
        if (gVar != null) {
            return gVar.c();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownHorizontalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        g gVar = this.mPopup;
        if (gVar != null) {
            return gVar.l();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownVerticalOffset();
        }
        return 0;
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        if (this.mPopup != null) {
            return this.mDropDownWidth;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getDropDownWidth();
        }
        return 0;
    }

    final g getInternalPopup() {
        return this.mPopup;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        g gVar = this.mPopup;
        if (gVar != null) {
            return gVar.g();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return super.getPopupBackground();
        }
        return null;
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.mPopupContext;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        g gVar = this.mPopup;
        return gVar != null ? gVar.f() : super.getPrompt();
    }

    @Override // androidx.core.view.y
    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.y
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        g gVar = this.mPopup;
        if (gVar == null || !gVar.b()) {
            return;
        }
        this.mPopup.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (this.mPopup == null || View.MeasureSpec.getMode(i11) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(i11)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.getSuperState());
        if (!fVar.f1952a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        g gVar = this.mPopup;
        fVar.f1952a = gVar != null && gVar.b();
        return fVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.mForwardingListener;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        g gVar = this.mPopup;
        if (gVar != null) {
            if (gVar.b()) {
                return true;
            }
            showPopup();
            return true;
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i11) {
        super.setBackgroundResource(i11);
        androidx.appcompat.widget.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.g(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i11) {
        g gVar = this.mPopup;
        if (gVar != null) {
            gVar.j(i11);
            this.mPopup.e(i11);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownHorizontalOffset(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i11) {
        g gVar = this.mPopup;
        if (gVar != null) {
            gVar.i(i11);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownVerticalOffset(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i11) {
        if (this.mPopup != null) {
            this.mDropDownWidth = i11;
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setDropDownWidth(i11);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        g gVar = this.mPopup;
        if (gVar != null) {
            gVar.a(drawable);
        } else if (Build.VERSION.SDK_INT >= 16) {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i11) {
        setPopupBackgroundDrawable(h.a.d(getPopupContext(), i11));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        g gVar = this.mPopup;
        if (gVar != null) {
            gVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.y
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.d dVar = this.mBackgroundTintHelper;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    void showPopup() {
        if (Build.VERSION.SDK_INT >= 17) {
            this.mPopup.k(getTextDirection(), getTextAlignment());
        } else {
            this.mPopup.k(-1, -1);
        }
    }

    public v(Context context, int i11) {
        this(context, null, g.a.J, i11);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.mPopupSet) {
            this.mTempAdapter = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.mPopup != null) {
            Context context = this.mPopupContext;
            if (context == null) {
                context = getContext();
            }
            this.mPopup.m(new d(spinnerAdapter, context.getTheme()));
        }
    }

    public v(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, g.a.J);
    }

    public v(Context context, AttributeSet attributeSet, int i11) {
        this(context, attributeSet, i11, -1);
    }

    public v(Context context, AttributeSet attributeSet, int i11, int i12) {
        this(context, attributeSet, i11, i12, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 == null) goto L7;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r6v0, types: [android.view.View, androidx.appcompat.widget.v, android.widget.Spinner] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public v(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.v.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}