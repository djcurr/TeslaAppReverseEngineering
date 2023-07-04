package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import androidx.core.view.l0;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import ezvcard.property.Gender;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001bB%\b\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017B!\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0001J\u0019\u0010\u000e\u001a\u00028\u0000\"\n\b\u0000\u0010\r*\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Landroidx/fragment/app/FragmentContainerView;", "Landroid/widget/FrameLayout;", "Landroid/animation/LayoutTransition;", "transition", "Lvz/b0;", "setLayoutTransition", "Landroid/view/View$OnApplyWindowInsetsListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setOnApplyWindowInsetsListener", "", "drawDisappearingViewsFirst", "setDrawDisappearingViewsLast", "Landroidx/fragment/app/Fragment;", Gender.FEMALE, "getFragment", "()Landroidx/fragment/app/Fragment;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroidx/fragment/app/q;", "fm", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroidx/fragment/app/q;)V", "a", "fragment_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    private final List<View> f4761a;

    /* renamed from: b  reason: collision with root package name */
    private final List<View> f4762b;

    /* renamed from: c  reason: collision with root package name */
    private View.OnApplyWindowInsetsListener f4763c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4764d;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f4765a = new a();

        private a() {
        }

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View v11, WindowInsets insets) {
            kotlin.jvm.internal.s.g(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            kotlin.jvm.internal.s.g(v11, "v");
            kotlin.jvm.internal.s.g(insets, "insets");
            WindowInsets onApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v11, insets);
            kotlin.jvm.internal.s.f(onApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return onApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.s.g(context, "context");
    }

    public /* synthetic */ FragmentContainerView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void a(View view) {
        if (this.f4762b.contains(view)) {
            this.f4761a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int i11, ViewGroup.LayoutParams layoutParams) {
        kotlin.jvm.internal.s.g(child, "child");
        if (q.A0(child) != null) {
            super.addView(child, i11, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + child + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        l0 i02;
        kotlin.jvm.internal.s.g(insets, "insets");
        l0 w11 = l0.w(insets);
        kotlin.jvm.internal.s.f(w11, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f4763c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f4765a;
            kotlin.jvm.internal.s.e(onApplyWindowInsetsListener);
            i02 = l0.w(aVar.a(onApplyWindowInsetsListener, this, insets));
        } else {
            i02 = androidx.core.view.a0.i0(this, w11);
        }
        if (!i02.p()) {
            int i11 = 0;
            int childCount = getChildCount();
            if (childCount > 0) {
                while (true) {
                    int i12 = i11 + 1;
                    androidx.core.view.a0.i(getChildAt(i11), i02);
                    if (i12 >= childCount) {
                        break;
                    }
                    i11 = i12;
                }
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        if (this.f4764d) {
            for (View view : this.f4761a) {
                super.drawChild(canvas, view, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View child, long j11) {
        kotlin.jvm.internal.s.g(canvas, "canvas");
        kotlin.jvm.internal.s.g(child, "child");
        if (this.f4764d && (!this.f4761a.isEmpty()) && this.f4761a.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j11);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        this.f4762b.remove(view);
        if (this.f4761a.remove(view)) {
            this.f4764d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends Fragment> F getFragment() {
        return (F) q.j0(this).g0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        kotlin.jvm.internal.s.g(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount() - 1;
        if (childCount >= 0) {
            while (true) {
                int i11 = childCount - 1;
                View view = getChildAt(childCount);
                kotlin.jvm.internal.s.f(view, "view");
                a(view);
                if (i11 < 0) {
                    break;
                }
                childCount = i11;
            }
        }
        super.removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i11) {
        View view = getChildAt(i11);
        kotlin.jvm.internal.s.f(view, "view");
        a(view);
        super.removeViewAt(i11);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i11, int i12) {
        int i13 = i11 + i12;
        if (i11 < i13) {
            int i14 = i11;
            while (true) {
                int i15 = i14 + 1;
                View view = getChildAt(i14);
                kotlin.jvm.internal.s.f(view, "view");
                a(view);
                if (i15 >= i13) {
                    break;
                }
                i14 = i15;
            }
        }
        super.removeViews(i11, i12);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i11, int i12) {
        int i13 = i11 + i12;
        if (i11 < i13) {
            int i14 = i11;
            while (true) {
                int i15 = i14 + 1;
                View view = getChildAt(i14);
                kotlin.jvm.internal.s.f(view, "view");
                a(view);
                if (i15 >= i13) {
                    break;
                }
                i14 = i15;
            }
        }
        super.removeViewsInLayout(i11, i12);
    }

    public final void setDrawDisappearingViewsLast(boolean z11) {
        this.f4764d = z11;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (Build.VERSION.SDK_INT < 18) {
            super.setLayoutTransition(layoutTransition);
            return;
        }
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        kotlin.jvm.internal.s.g(listener, "listener");
        this.f4763c = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        kotlin.jvm.internal.s.g(view, "view");
        if (view.getParent() == this) {
            this.f4762b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        String str;
        kotlin.jvm.internal.s.g(context, "context");
        this.f4761a = new ArrayList();
        this.f4762b = new ArrayList();
        this.f4764d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = g4.c.f27707e;
            kotlin.jvm.internal.s.f(FragmentContainerView, "FragmentContainerView");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(g4.c.f27708f);
                str = "android:name";
            } else {
                str = Action.CLASS_ATTRIBUTE;
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + ((Object) classAttribute) + CoreConstants.DOUBLE_QUOTE_CHAR);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attrs, q fm2) {
        super(context, attrs);
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(attrs, "attrs");
        kotlin.jvm.internal.s.g(fm2, "fm");
        this.f4761a = new ArrayList();
        this.f4762b = new ArrayList();
        this.f4764d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = g4.c.f27707e;
        kotlin.jvm.internal.s.f(FragmentContainerView, "FragmentContainerView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(g4.c.f27708f) : classAttribute;
        String string = obtainStyledAttributes.getString(g4.c.f27709g);
        obtainStyledAttributes.recycle();
        int id2 = getId();
        Fragment g02 = fm2.g0(id2);
        if (classAttribute != null && g02 == null) {
            if (id2 == -1) {
                String p11 = string != null ? kotlin.jvm.internal.s.p(" with tag ", string) : "";
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + ((Object) classAttribute) + p11);
            }
            Fragment instantiate = fm2.r0().instantiate(context.getClassLoader(), classAttribute);
            kotlin.jvm.internal.s.f(instantiate, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            instantiate.onInflate(context, attrs, (Bundle) null);
            fm2.m().x(true).d(this, instantiate, string).k();
        }
        fm2.T0(this);
    }
}