package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import ch.qos.logback.core.joran.action.Action;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n implements LayoutInflater.Factory2 {

    /* renamed from: a  reason: collision with root package name */
    final q f4896a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ x f4897a;

        a(x xVar) {
            this.f4897a = xVar;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment k11 = this.f4897a.k();
            this.f4897a.m();
            g0.n((ViewGroup) k11.mView.getParent(), n.this.f4896a).j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public n(q qVar) {
        this.f4896a = qVar;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        x u11;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f4896a);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, Action.CLASS_ATTRIBUTE);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g4.c.f27703a);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(g4.c.f27704b);
            }
            int resourceId = obtainStyledAttributes.getResourceId(g4.c.f27705c, -1);
            String string = obtainStyledAttributes.getString(g4.c.f27706d);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !l.isFragmentClass(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id2 = view != null ? view.getId() : 0;
            if (id2 == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment g02 = resourceId != -1 ? this.f4896a.g0(resourceId) : null;
            if (g02 == null && string != null) {
                g02 = this.f4896a.h0(string);
            }
            if (g02 == null && id2 != -1) {
                g02 = this.f4896a.g0(id2);
            }
            if (g02 == null) {
                g02 = this.f4896a.r0().instantiate(context.getClassLoader(), attributeValue);
                g02.mFromLayout = true;
                g02.mFragmentId = resourceId != 0 ? resourceId : id2;
                g02.mContainerId = id2;
                g02.mTag = string;
                g02.mInLayout = true;
                q qVar = this.f4896a;
                g02.mFragmentManager = qVar;
                g02.mHost = qVar.t0();
                g02.onInflate(this.f4896a.t0().f(), attributeSet, g02.mSavedFragmentState);
                u11 = this.f4896a.f(g02);
                if (q.G0(2)) {
                    Log.v("FragmentManager", "Fragment " + g02 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else if (!g02.mInLayout) {
                g02.mInLayout = true;
                q qVar2 = this.f4896a;
                g02.mFragmentManager = qVar2;
                g02.mHost = qVar2.t0();
                g02.onInflate(this.f4896a.t0().f(), attributeSet, g02.mSavedFragmentState);
                u11 = this.f4896a.u(g02);
                if (q.G0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + g02 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            ViewGroup viewGroup = (ViewGroup) view;
            androidx.fragment.app.strictmode.a.i(g02, viewGroup);
            g02.mContainer = viewGroup;
            u11.m();
            u11.j();
            View view2 = g02.mView;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (g02.mView.getTag() == null) {
                    g02.mView.setTag(string);
                }
                g02.mView.addOnAttachStateChangeListener(new a(u11));
                return g02.mView;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }
}