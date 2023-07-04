package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.app.g0;
import androidx.lifecycle.p;
import androidx.lifecycle.u0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a */
    private final o f4984a;

    /* renamed from: b */
    private final y f4985b;

    /* renamed from: c */
    private final Fragment f4986c;

    /* renamed from: d */
    private boolean f4987d = false;

    /* renamed from: e */
    private int f4988e = -1;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f4989a;

        a(x xVar, View view) {
            this.f4989a = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4989a.removeOnAttachStateChangeListener(this);
            androidx.core.view.a0.t0(this.f4989a);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f4990a;

        static {
            int[] iArr = new int[p.c.values().length];
            f4990a = iArr;
            try {
                iArr[p.c.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4990a[p.c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4990a[p.c.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4990a[p.c.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public x(o oVar, y yVar, Fragment fragment) {
        this.f4984a = oVar;
        this.f4985b = yVar;
        this.f4986c = fragment;
    }

    private boolean l(View view) {
        if (view == this.f4986c.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f4986c.mView) {
                return true;
            }
        }
        return false;
    }

    private Bundle q() {
        Bundle bundle = new Bundle();
        this.f4986c.performSaveInstanceState(bundle);
        this.f4984a.j(this.f4986c, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f4986c.mView != null) {
            s();
        }
        if (this.f4986c.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray("android:view_state", this.f4986c.mSavedViewState);
        }
        if (this.f4986c.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle("android:view_registry_state", this.f4986c.mSavedViewRegistryState);
        }
        if (!this.f4986c.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android:user_visible_hint", this.f4986c.mUserVisibleHint);
        }
        return bundle;
    }

    void a() {
        if (q.G0(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.f4986c);
        }
        Fragment fragment = this.f4986c;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        o oVar = this.f4984a;
        Fragment fragment2 = this.f4986c;
        oVar.a(fragment2, fragment2.mSavedFragmentState, false);
    }

    public void b() {
        int j11 = this.f4985b.j(this.f4986c);
        Fragment fragment = this.f4986c;
        fragment.mContainer.addView(fragment.mView, j11);
    }

    void c() {
        if (q.G0(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.f4986c);
        }
        Fragment fragment = this.f4986c;
        Fragment fragment2 = fragment.mTarget;
        x xVar = null;
        if (fragment2 != null) {
            x n11 = this.f4985b.n(fragment2.mWho);
            if (n11 != null) {
                Fragment fragment3 = this.f4986c;
                fragment3.mTargetWho = fragment3.mTarget.mWho;
                fragment3.mTarget = null;
                xVar = n11;
            } else {
                throw new IllegalStateException("Fragment " + this.f4986c + " declared target fragment " + this.f4986c.mTarget + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (xVar = this.f4985b.n(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f4986c + " declared target fragment " + this.f4986c.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (xVar != null) {
            xVar.m();
        }
        Fragment fragment4 = this.f4986c;
        fragment4.mHost = fragment4.mFragmentManager.t0();
        Fragment fragment5 = this.f4986c;
        fragment5.mParentFragment = fragment5.mFragmentManager.w0();
        this.f4984a.g(this.f4986c, false);
        this.f4986c.performAttach();
        this.f4984a.b(this.f4986c, false);
    }

    int d() {
        Fragment fragment = this.f4986c;
        if (fragment.mFragmentManager == null) {
            return fragment.mState;
        }
        int i11 = this.f4988e;
        int i12 = b.f4990a[fragment.mMaxState.ordinal()];
        if (i12 != 1) {
            if (i12 == 2) {
                i11 = Math.min(i11, 5);
            } else if (i12 == 3) {
                i11 = Math.min(i11, 1);
            } else if (i12 != 4) {
                i11 = Math.min(i11, -1);
            } else {
                i11 = Math.min(i11, 0);
            }
        }
        Fragment fragment2 = this.f4986c;
        if (fragment2.mFromLayout) {
            if (fragment2.mInLayout) {
                i11 = Math.max(this.f4988e, 2);
                View view = this.f4986c.mView;
                if (view != null && view.getParent() == null) {
                    i11 = Math.min(i11, 2);
                }
            } else {
                i11 = this.f4988e < 4 ? Math.min(i11, fragment2.mState) : Math.min(i11, 1);
            }
        }
        if (!this.f4986c.mAdded) {
            i11 = Math.min(i11, 1);
        }
        Fragment fragment3 = this.f4986c;
        ViewGroup viewGroup = fragment3.mContainer;
        g0.e.b l11 = viewGroup != null ? g0.n(viewGroup, fragment3.getParentFragmentManager()).l(this) : null;
        if (l11 == g0.e.b.ADDING) {
            i11 = Math.min(i11, 6);
        } else if (l11 == g0.e.b.REMOVING) {
            i11 = Math.max(i11, 3);
        } else {
            Fragment fragment4 = this.f4986c;
            if (fragment4.mRemoving) {
                if (fragment4.isInBackStack()) {
                    i11 = Math.min(i11, 1);
                } else {
                    i11 = Math.min(i11, -1);
                }
            }
        }
        Fragment fragment5 = this.f4986c;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            i11 = Math.min(i11, 4);
        }
        if (q.G0(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i11 + " for " + this.f4986c);
        }
        return i11;
    }

    void e() {
        if (q.G0(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.f4986c);
        }
        Fragment fragment = this.f4986c;
        if (!fragment.mIsCreated) {
            this.f4984a.h(fragment, fragment.mSavedFragmentState, false);
            Fragment fragment2 = this.f4986c;
            fragment2.performCreate(fragment2.mSavedFragmentState);
            o oVar = this.f4984a;
            Fragment fragment3 = this.f4986c;
            oVar.c(fragment3, fragment3.mSavedFragmentState, false);
            return;
        }
        fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
        this.f4986c.mState = 1;
    }

    void f() {
        String str;
        if (this.f4986c.mFromLayout) {
            return;
        }
        if (q.G0(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4986c);
        }
        Fragment fragment = this.f4986c;
        LayoutInflater performGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f4986c;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i11 = fragment2.mContainerId;
            if (i11 != 0) {
                if (i11 != -1) {
                    viewGroup = (ViewGroup) fragment2.mFragmentManager.p0().c(this.f4986c.mContainerId);
                    if (viewGroup == null) {
                        Fragment fragment3 = this.f4986c;
                        if (!fragment3.mRestored) {
                            try {
                                str = fragment3.getResources().getResourceName(this.f4986c.mContainerId);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f4986c.mContainerId) + " (" + str + ") for fragment " + this.f4986c);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        androidx.fragment.app.strictmode.a.p(this.f4986c, viewGroup);
                    }
                } else {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f4986c + " for a container view with no id");
                }
            }
        }
        Fragment fragment4 = this.f4986c;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(performGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f4986c.mView;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f4986c;
            fragment5.mView.setTag(g4.b.f27700a, fragment5);
            if (viewGroup != null) {
                b();
            }
            Fragment fragment6 = this.f4986c;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (androidx.core.view.a0.Y(this.f4986c.mView)) {
                androidx.core.view.a0.t0(this.f4986c.mView);
            } else {
                View view2 = this.f4986c.mView;
                view2.addOnAttachStateChangeListener(new a(this, view2));
            }
            this.f4986c.performViewCreated();
            o oVar = this.f4984a;
            Fragment fragment7 = this.f4986c;
            oVar.m(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f4986c.mView.getVisibility();
            this.f4986c.setPostOnViewCreatedAlpha(this.f4986c.mView.getAlpha());
            Fragment fragment8 = this.f4986c;
            if (fragment8.mContainer != null && visibility == 0) {
                View findFocus = fragment8.mView.findFocus();
                if (findFocus != null) {
                    this.f4986c.setFocusedView(findFocus);
                    if (q.G0(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + this.f4986c);
                    }
                }
                this.f4986c.mView.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        }
        this.f4986c.mState = 2;
    }

    void g() {
        Fragment f11;
        if (q.G0(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.f4986c);
        }
        Fragment fragment = this.f4986c;
        boolean z11 = true;
        boolean z12 = fragment.mRemoving && !fragment.isInBackStack();
        if (z12) {
            Fragment fragment2 = this.f4986c;
            if (!fragment2.mBeingSaved) {
                this.f4985b.B(fragment2.mWho, null);
            }
        }
        if (z12 || this.f4985b.p().r(this.f4986c)) {
            m<?> mVar = this.f4986c.mHost;
            if (mVar instanceof u0) {
                z11 = this.f4985b.p().o();
            } else if (mVar.f() instanceof Activity) {
                z11 = true ^ ((Activity) mVar.f()).isChangingConfigurations();
            }
            if ((z12 && !this.f4986c.mBeingSaved) || z11) {
                this.f4985b.p().g(this.f4986c);
            }
            this.f4986c.performDestroy();
            this.f4984a.d(this.f4986c, false);
            for (x xVar : this.f4985b.k()) {
                if (xVar != null) {
                    Fragment k11 = xVar.k();
                    if (this.f4986c.mWho.equals(k11.mTargetWho)) {
                        k11.mTarget = this.f4986c;
                        k11.mTargetWho = null;
                    }
                }
            }
            Fragment fragment3 = this.f4986c;
            String str = fragment3.mTargetWho;
            if (str != null) {
                fragment3.mTarget = this.f4985b.f(str);
            }
            this.f4985b.s(this);
            return;
        }
        String str2 = this.f4986c.mTargetWho;
        if (str2 != null && (f11 = this.f4985b.f(str2)) != null && f11.mRetainInstance) {
            this.f4986c.mTarget = f11;
        }
        this.f4986c.mState = 0;
    }

    void h() {
        View view;
        if (q.G0(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.f4986c);
        }
        Fragment fragment = this.f4986c;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f4986c.performDestroyView();
        this.f4984a.n(this.f4986c, false);
        Fragment fragment2 = this.f4986c;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.setValue(null);
        this.f4986c.mInLayout = false;
    }

    void i() {
        if (q.G0(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.f4986c);
        }
        this.f4986c.performDetach();
        boolean z11 = false;
        this.f4984a.e(this.f4986c, false);
        Fragment fragment = this.f4986c;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z11 = true;
        }
        if (z11 || this.f4985b.p().r(this.f4986c)) {
            if (q.G0(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.f4986c);
            }
            this.f4986c.initState();
        }
    }

    public void j() {
        Fragment fragment = this.f4986c;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (q.G0(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.f4986c);
            }
            Fragment fragment2 = this.f4986c;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f4986c.mSavedFragmentState);
            View view = this.f4986c.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f4986c;
                fragment3.mView.setTag(g4.b.f27700a, fragment3);
                Fragment fragment4 = this.f4986c;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f4986c.performViewCreated();
                o oVar = this.f4984a;
                Fragment fragment5 = this.f4986c;
                oVar.m(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f4986c.mState = 2;
            }
        }
    }

    public Fragment k() {
        return this.f4986c;
    }

    public void m() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f4987d) {
            if (q.G0(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + k());
                return;
            }
            return;
        }
        try {
            this.f4987d = true;
            boolean z11 = false;
            while (true) {
                int d11 = d();
                Fragment fragment = this.f4986c;
                int i11 = fragment.mState;
                if (d11 == i11) {
                    if (!z11 && i11 == -1 && fragment.mRemoving && !fragment.isInBackStack() && !this.f4986c.mBeingSaved) {
                        if (q.G0(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.f4986c);
                        }
                        this.f4985b.p().g(this.f4986c);
                        this.f4985b.s(this);
                        if (q.G0(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + this.f4986c);
                        }
                        this.f4986c.initState();
                    }
                    Fragment fragment2 = this.f4986c;
                    if (fragment2.mHiddenChanged) {
                        if (fragment2.mView != null && (viewGroup = fragment2.mContainer) != null) {
                            g0 n11 = g0.n(viewGroup, fragment2.getParentFragmentManager());
                            if (this.f4986c.mHidden) {
                                n11.c(this);
                            } else {
                                n11.e(this);
                            }
                        }
                        Fragment fragment3 = this.f4986c;
                        q qVar = fragment3.mFragmentManager;
                        if (qVar != null) {
                            qVar.E0(fragment3);
                        }
                        Fragment fragment4 = this.f4986c;
                        fragment4.mHiddenChanged = false;
                        fragment4.onHiddenChanged(fragment4.mHidden);
                        this.f4986c.mChildFragmentManager.H();
                    }
                    return;
                }
                if (d11 > i11) {
                    switch (i11 + 1) {
                        case 0:
                            c();
                            continue;
                        case 1:
                            e();
                            continue;
                        case 2:
                            j();
                            f();
                            continue;
                        case 3:
                            a();
                            continue;
                        case 4:
                            if (fragment.mView != null && (viewGroup3 = fragment.mContainer) != null) {
                                g0.n(viewGroup3, fragment.getParentFragmentManager()).b(g0.e.c.from(this.f4986c.mView.getVisibility()), this);
                            }
                            this.f4986c.mState = 4;
                            continue;
                        case 5:
                            u();
                            continue;
                        case 6:
                            fragment.mState = 6;
                            continue;
                        case 7:
                            p();
                            continue;
                        default:
                            continue;
                    }
                } else {
                    switch (i11 - 1) {
                        case -1:
                            i();
                            continue;
                        case 0:
                            if (fragment.mBeingSaved && this.f4985b.q(fragment.mWho) == null) {
                                r();
                            }
                            g();
                            continue;
                        case 1:
                            h();
                            this.f4986c.mState = 1;
                            continue;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            continue;
                        case 3:
                            if (q.G0(3)) {
                                Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.f4986c);
                            }
                            Fragment fragment5 = this.f4986c;
                            if (fragment5.mBeingSaved) {
                                r();
                            } else if (fragment5.mView != null && fragment5.mSavedViewState == null) {
                                s();
                            }
                            Fragment fragment6 = this.f4986c;
                            if (fragment6.mView != null && (viewGroup2 = fragment6.mContainer) != null) {
                                g0.n(viewGroup2, fragment6.getParentFragmentManager()).d(this);
                            }
                            this.f4986c.mState = 3;
                            continue;
                        case 4:
                            v();
                            continue;
                        case 5:
                            fragment.mState = 5;
                            continue;
                        case 6:
                            n();
                            continue;
                        default:
                            continue;
                    }
                }
                z11 = true;
            }
        } finally {
            this.f4987d = false;
        }
    }

    void n() {
        if (q.G0(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.f4986c);
        }
        this.f4986c.performPause();
        this.f4984a.f(this.f4986c, false);
    }

    public void o(ClassLoader classLoader) {
        Bundle bundle = this.f4986c.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f4986c;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f4986c;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle("android:view_registry_state");
        Fragment fragment3 = this.f4986c;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString("android:target_state");
        Fragment fragment4 = this.f4986c;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt("android:target_req_state", 0);
        }
        Fragment fragment5 = this.f4986c;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f4986c.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean("android:user_visible_hint", true);
        }
        Fragment fragment6 = this.f4986c;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    void p() {
        if (q.G0(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.f4986c);
        }
        View focusedView = this.f4986c.getFocusedView();
        if (focusedView != null && l(focusedView)) {
            boolean requestFocus = focusedView.requestFocus();
            if (q.G0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("requestFocus: Restoring focused view ");
                sb2.append(focusedView);
                sb2.append(" ");
                sb2.append(requestFocus ? "succeeded" : "failed");
                sb2.append(" on Fragment ");
                sb2.append(this.f4986c);
                sb2.append(" resulting in focused view ");
                sb2.append(this.f4986c.mView.findFocus());
                Log.v("FragmentManager", sb2.toString());
            }
        }
        this.f4986c.setFocusedView(null);
        this.f4986c.performResume();
        this.f4984a.i(this.f4986c, false);
        Fragment fragment = this.f4986c;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    public void r() {
        w wVar = new w(this.f4986c);
        Fragment fragment = this.f4986c;
        if (fragment.mState > -1 && wVar.f4983m == null) {
            Bundle q11 = q();
            wVar.f4983m = q11;
            if (this.f4986c.mTargetWho != null) {
                if (q11 == null) {
                    wVar.f4983m = new Bundle();
                }
                wVar.f4983m.putString("android:target_state", this.f4986c.mTargetWho);
                int i11 = this.f4986c.mTargetRequestCode;
                if (i11 != 0) {
                    wVar.f4983m.putInt("android:target_req_state", i11);
                }
            }
        } else {
            wVar.f4983m = fragment.mSavedFragmentState;
        }
        this.f4985b.B(this.f4986c.mWho, wVar);
    }

    void s() {
        if (this.f4986c.mView == null) {
            return;
        }
        if (q.G0(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + this.f4986c + " with view " + this.f4986c.mView);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f4986c.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f4986c.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f4986c.mViewLifecycleOwner.e(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f4986c.mSavedViewRegistryState = bundle;
    }

    public void t(int i11) {
        this.f4988e = i11;
    }

    void u() {
        if (q.G0(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.f4986c);
        }
        this.f4986c.performStart();
        this.f4984a.k(this.f4986c, false);
    }

    void v() {
        if (q.G0(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.f4986c);
        }
        this.f4986c.performStop();
        this.f4984a.l(this.f4986c, false);
    }

    public x(o oVar, y yVar, ClassLoader classLoader, l lVar, w wVar) {
        this.f4984a = oVar;
        this.f4985b = yVar;
        Fragment a11 = wVar.a(lVar, classLoader);
        this.f4986c = a11;
        if (q.G0(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a11);
        }
    }

    public x(o oVar, y yVar, Fragment fragment, w wVar) {
        this.f4984a = oVar;
        this.f4985b = yVar;
        this.f4986c = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = wVar.f4983m;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}