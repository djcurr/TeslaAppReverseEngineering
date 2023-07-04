package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a  reason: collision with root package name */
    protected int[] f3783a;

    /* renamed from: b  reason: collision with root package name */
    protected int f3784b;

    /* renamed from: c  reason: collision with root package name */
    protected Context f3785c;

    /* renamed from: d  reason: collision with root package name */
    protected f3.h f3786d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f3787e;

    /* renamed from: f  reason: collision with root package name */
    protected String f3788f;

    /* renamed from: g  reason: collision with root package name */
    protected String f3789g;

    /* renamed from: h  reason: collision with root package name */
    private View[] f3790h;

    /* renamed from: i  reason: collision with root package name */
    protected HashMap<Integer, String> f3791i;

    public b(Context context) {
        super(context);
        this.f3783a = new int[32];
        this.f3787e = false;
        this.f3790h = null;
        this.f3791i = new HashMap<>();
        this.f3785c = context;
        n(null);
    }

    private void e(String str) {
        if (str == null || str.length() == 0 || this.f3785c == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int l11 = l(trim);
        if (l11 != 0) {
            this.f3791i.put(Integer.valueOf(l11), trim);
            f(l11);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void f(int i11) {
        if (i11 == getId()) {
            return;
        }
        int i12 = this.f3784b + 1;
        int[] iArr = this.f3783a;
        if (i12 > iArr.length) {
            this.f3783a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f3783a;
        int i13 = this.f3784b;
        iArr2[i13] = i11;
        this.f3784b = i13 + 1;
    }

    private void g(String str) {
        if (str == null || str.length() == 0 || this.f3785c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    f(childAt.getId());
                }
            }
        }
    }

    private int k(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f3785c.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = constraintLayout.getChildAt(i11);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int l(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i11 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, str);
            if (designInformation instanceof Integer) {
                i11 = ((Integer) designInformation).intValue();
            }
        }
        if (i11 == 0 && constraintLayout != null) {
            i11 = k(constraintLayout, str);
        }
        if (i11 == 0) {
            try {
                i11 = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i11 == 0 ? this.f3785c.getResources().getIdentifier(str, "id", this.f3785c.getPackageName()) : i11;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f3783a, this.f3784b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void h() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        i((ConstraintLayout) parent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = Build.VERSION.SDK_INT >= 21 ? getElevation() : 0.0f;
        for (int i11 = 0; i11 < this.f3784b; i11++) {
            View viewById = constraintLayout.getViewById(this.f3783a[i11]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > BitmapDescriptorFactory.HUE_RED && Build.VERSION.SDK_INT >= 21) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void j(ConstraintLayout constraintLayout) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public View[] m(ConstraintLayout constraintLayout) {
        View[] viewArr = this.f3790h;
        if (viewArr == null || viewArr.length != this.f3784b) {
            this.f3790h = new View[this.f3784b];
        }
        for (int i11 = 0; i11 < this.f3784b; i11++) {
            this.f3790h[i11] = constraintLayout.getViewById(this.f3783a[i11]);
        }
        return this.f3790h;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void n(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.U0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = obtainStyledAttributes.getIndex(i11);
                if (index == i.f3994g1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f3788f = string;
                    setIds(string);
                } else if (index == i.f4004h1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f3789g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o(f3.e eVar, boolean z11) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f3788f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f3789g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i11, int i12) {
        if (this.f3787e) {
            super.onMeasure(i11, i12);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void s(ConstraintLayout constraintLayout) {
        String str;
        int k11;
        if (isInEditMode()) {
            setIds(this.f3788f);
        }
        f3.h hVar = this.f3786d;
        if (hVar == null) {
            return;
        }
        hVar.b();
        for (int i11 = 0; i11 < this.f3784b; i11++) {
            int i12 = this.f3783a[i11];
            View viewById = constraintLayout.getViewById(i12);
            if (viewById == null && (k11 = k(constraintLayout, (str = this.f3791i.get(Integer.valueOf(i12))))) != 0) {
                this.f3783a[i11] = k11;
                this.f3791i.put(Integer.valueOf(k11), str);
                viewById = constraintLayout.getViewById(k11);
            }
            if (viewById != null) {
                this.f3786d.a(constraintLayout.getViewWidget(viewById));
            }
        }
        this.f3786d.c(constraintLayout.mLayoutWidget);
    }

    protected void setIds(String str) {
        this.f3788f = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f3784b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i11);
            if (indexOf == -1) {
                e(str.substring(i11));
                return;
            } else {
                e(str.substring(i11, indexOf));
                i11 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f3789g = str;
        if (str == null) {
            return;
        }
        int i11 = 0;
        this.f3784b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i11);
            if (indexOf == -1) {
                g(str.substring(i11));
                return;
            } else {
                g(str.substring(i11, indexOf));
                i11 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f3788f = null;
        this.f3784b = 0;
        for (int i11 : iArr) {
            f(i11);
        }
    }

    @Override // android.view.View
    public void setTag(int i11, Object obj) {
        super.setTag(i11, obj);
        if (obj == null && this.f3788f == null) {
            f(i11);
        }
    }

    public void t() {
        if (this.f3786d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f3756r0 = (f3.e) this.f3786d;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3783a = new int[32];
        this.f3787e = false;
        this.f3790h = null;
        this.f3791i = new HashMap<>();
        this.f3785c = context;
        n(attributeSet);
    }
}