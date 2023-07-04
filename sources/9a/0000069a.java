package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.m0;
import androidx.lifecycle.p;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.v, u0, androidx.lifecycle.o, androidx.savedstate.c, androidx.activity.result.c {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    i mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    q mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    s0.b mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    q mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    m<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.x mLifecycleRegistry;
    p.c mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<k> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    androidx.savedstate.b mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    d0 mViewLifecycleOwner;
    androidx.lifecycle.f0<androidx.lifecycle.v> mViewLifecycleOwnerLiveData;
    String mWho;

    /* loaded from: classes.dex */
    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String str, Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            Fragment.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            Fragment.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ g0 f4727a;

        c(Fragment fragment, g0 g0Var) {
            this.f4727a = g0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4727a.g();
        }
    }

    /* loaded from: classes.dex */
    public class d extends androidx.fragment.app.j {
        d() {
            Fragment.this = r1;
        }

        @Override // androidx.fragment.app.j
        public View c(int i11) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i11);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }

        @Override // androidx.fragment.app.j
        public boolean d() {
            return Fragment.this.mView != null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements p.a<Void, ActivityResultRegistry> {
        e() {
            Fragment.this = r1;
        }

        @Override // p.a
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r32) {
            Fragment fragment = Fragment.this;
            m<?> mVar = fragment.mHost;
            if (mVar instanceof androidx.activity.result.e) {
                return ((androidx.activity.result.e) mVar).getActivityResultRegistry();
            }
            return fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class f implements p.a<Void, ActivityResultRegistry> {

        /* renamed from: a */
        final /* synthetic */ ActivityResultRegistry f4730a;

        f(Fragment fragment, ActivityResultRegistry activityResultRegistry) {
            this.f4730a = activityResultRegistry;
        }

        @Override // p.a
        /* renamed from: a */
        public ActivityResultRegistry apply(Void r12) {
            return this.f4730a;
        }
    }

    /* loaded from: classes.dex */
    public class g extends k {

        /* renamed from: a */
        final /* synthetic */ p.a f4731a;

        /* renamed from: b */
        final /* synthetic */ AtomicReference f4732b;

        /* renamed from: c */
        final /* synthetic */ f.a f4733c;

        /* renamed from: d */
        final /* synthetic */ androidx.activity.result.b f4734d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(p.a aVar, AtomicReference atomicReference, f.a aVar2, androidx.activity.result.b bVar) {
            super(null);
            Fragment.this = r1;
            this.f4731a = aVar;
            this.f4732b = atomicReference;
            this.f4733c = aVar2;
            this.f4734d = bVar;
        }

        @Override // androidx.fragment.app.Fragment.k
        void a() {
            this.f4732b.set(((ActivityResultRegistry) this.f4731a.apply(null)).i(Fragment.this.generateActivityResultKey(), Fragment.this, this.f4733c, this.f4734d));
        }
    }

    /* loaded from: classes.dex */
    public class h<I> extends androidx.activity.result.d<I> {

        /* renamed from: a */
        final /* synthetic */ AtomicReference f4736a;

        /* renamed from: b */
        final /* synthetic */ f.a f4737b;

        h(Fragment fragment, AtomicReference atomicReference, f.a aVar) {
            this.f4736a = atomicReference;
            this.f4737b = aVar;
        }

        @Override // androidx.activity.result.d
        public f.a<I, ?> a() {
            return this.f4737b;
        }

        @Override // androidx.activity.result.d
        public void c(I i11, androidx.core.app.b bVar) {
            androidx.activity.result.d dVar = (androidx.activity.result.d) this.f4736a.get();
            if (dVar != null) {
                dVar.c(i11, bVar);
                return;
            }
            throw new IllegalStateException("Operation cannot be started before fragment is in created state");
        }

        @Override // androidx.activity.result.d
        public void d() {
            androidx.activity.result.d dVar = (androidx.activity.result.d) this.f4736a.getAndSet(null);
            if (dVar != null) {
                dVar.d();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class i {

        /* renamed from: a */
        View f4738a;

        /* renamed from: b */
        boolean f4739b;

        /* renamed from: c */
        int f4740c;

        /* renamed from: d */
        int f4741d;

        /* renamed from: e */
        int f4742e;

        /* renamed from: f */
        int f4743f;

        /* renamed from: g */
        int f4744g;

        /* renamed from: h */
        ArrayList<String> f4745h;

        /* renamed from: i */
        ArrayList<String> f4746i;

        /* renamed from: j */
        Object f4747j = null;

        /* renamed from: k */
        Object f4748k;

        /* renamed from: l */
        Object f4749l;

        /* renamed from: m */
        Object f4750m;

        /* renamed from: n */
        Object f4751n;

        /* renamed from: o */
        Object f4752o;

        /* renamed from: p */
        Boolean f4753p;

        /* renamed from: q */
        Boolean f4754q;

        /* renamed from: r */
        androidx.core.app.p f4755r;

        /* renamed from: s */
        androidx.core.app.p f4756s;

        /* renamed from: t */
        float f4757t;

        /* renamed from: u */
        View f4758u;

        /* renamed from: v */
        boolean f4759v;

        i() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f4748k = obj;
            this.f4749l = null;
            this.f4750m = obj;
            this.f4751n = null;
            this.f4752o = obj;
            this.f4757t = 1.0f;
            this.f4758u = null;
        }
    }

    /* loaded from: classes.dex */
    static class j {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class k {
        private k() {
        }

        abstract void a();

        /* synthetic */ k(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static class l implements Parcelable {
        public static final Parcelable.Creator<l> CREATOR = new a();

        /* renamed from: a */
        final Bundle f4760a;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<l> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public l createFromParcel(Parcel parcel) {
                return new l(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public l createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new l(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public l[] newArray(int i11) {
                return new l[i11];
            }
        }

        l(Parcel parcel, ClassLoader classLoader) {
            Bundle readBundle = parcel.readBundle();
            this.f4760a = readBundle;
            if (classLoader == null || readBundle == null) {
                return;
            }
            readBundle.setClassLoader(classLoader);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i11) {
            parcel.writeBundle(this.f4760a);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new r();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new a();
        this.mMaxState = p.c.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.f0<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private i ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new i();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        p.c cVar = this.mMaxState;
        if (cVar != p.c.INITIALIZED && this.mParentFragment != null) {
            return Math.min(cVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
        }
        return cVar.ordinal();
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.x(this);
        this.mSavedStateRegistryController = androidx.savedstate.b.a(this);
        this.mDefaultFactory = null;
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str) {
        return instantiate(context, str, null);
    }

    private <I, O> androidx.activity.result.d<I> prepareCallInternal(f.a<I, O> aVar, p.a<Void, ActivityResultRegistry> aVar2, androidx.activity.result.b<O> bVar) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new g(aVar2, atomicReference, aVar, bVar));
            return new h(this, atomicReference, aVar);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(k kVar) {
        if (this.mState >= 0) {
            kVar.a();
        } else {
            this.mOnPreAttachedListeners.add(kVar);
        }
    }

    void callStartTransitionListener(boolean z11) {
        ViewGroup viewGroup;
        q qVar;
        i iVar = this.mAnimationInfo;
        if (iVar != null) {
            iVar.f4759v = false;
        }
        if (this.mView == null || (viewGroup = this.mContainer) == null || (qVar = this.mFragmentManager) == null) {
            return;
        }
        g0 n11 = g0.n(viewGroup, qVar);
        n11.p();
        if (z11) {
            this.mHost.g().post(new c(this, n11));
        } else {
            n11.g();
        }
    }

    public androidx.fragment.app.j createFragmentContainer() {
        return new d();
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment(false);
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            androidx.loader.app.a.b(this).a(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        q qVar = this.mChildFragmentManager;
        qVar.V(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Fragment findFragmentByWho(String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.i0(str);
    }

    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    public final androidx.fragment.app.h getActivity() {
        m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return (androidx.fragment.app.h) mVar.e();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f4754q) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        i iVar = this.mAnimationInfo;
        if (iVar == null || (bool = iVar.f4753p) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f4738a;
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final q getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public Context getContext() {
        m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.f();
    }

    @Override // androidx.lifecycle.o
    public s0.b getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context applicationContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(applicationContext instanceof ContextWrapper)) {
                        break;
                    } else if (applicationContext instanceof Application) {
                        application = (Application) applicationContext;
                        break;
                    } else {
                        applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                    }
                }
                if (application == null && q.G0(3)) {
                    Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new m0(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public int getEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f4740c;
    }

    public Object getEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f4747j;
    }

    public androidx.core.app.p getEnterTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f4755r;
    }

    public int getExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f4741d;
    }

    public Object getExitTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f4749l;
    }

    public androidx.core.app.p getExitTransitionCallback() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f4756s;
    }

    public View getFocusedView() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f4758u;
    }

    @Deprecated
    public final q getFragmentManager() {
        return this.mFragmentManager;
    }

    public final Object getHost() {
        m<?> mVar = this.mHost;
        if (mVar == null) {
            return null;
        }
        return mVar.h();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.v
    public androidx.lifecycle.p getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Deprecated
    public androidx.loader.app.a getLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    public int getNextTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f4744g;
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final q getParentFragmentManager() {
        q qVar = this.mFragmentManager;
        if (qVar != null) {
            return qVar;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    public boolean getPopDirection() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f4739b;
    }

    public int getPopEnterAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f4742e;
    }

    public int getPopExitAnim() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 0;
        }
        return iVar.f4743f;
    }

    public float getPostOnViewCreatedAlpha() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return 1.0f;
        }
        return iVar.f4757t;
    }

    public Object getReenterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f4750m;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        androidx.fragment.app.strictmode.a.j(this);
        return this.mRetainInstance;
    }

    public Object getReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f4748k;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    public Object getSharedElementEnterTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        return iVar.f4751n;
    }

    public Object getSharedElementReturnTransition() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return null;
        }
        Object obj = iVar.f4752o;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    public ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        return (iVar == null || (arrayList = iVar.f4745h) == null) ? new ArrayList<>() : arrayList;
    }

    public ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        i iVar = this.mAnimationInfo;
        return (iVar == null || (arrayList = iVar.f4746i) == null) ? new ArrayList<>() : arrayList;
    }

    public final String getString(int i11) {
        return getResources().getString(i11);
    }

    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        androidx.fragment.app.strictmode.a.k(this);
        return this.mTargetRequestCode;
    }

    public final CharSequence getText(int i11) {
        return getResources().getText(i11);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    public View getView() {
        return this.mView;
    }

    public androidx.lifecycle.v getViewLifecycleOwner() {
        d0 d0Var = this.mViewLifecycleOwner;
        if (d0Var != null) {
            return d0Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<androidx.lifecycle.v> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.u0
    public t0 getViewModelStore() {
        if (this.mFragmentManager != null) {
            if (getMinimumMaxLifecycleState() != p.c.INITIALIZED.ordinal()) {
                return this.mFragmentManager.B0(this);
            }
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new r();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        q qVar;
        return this.mHidden || ((qVar = this.mFragmentManager) != null && qVar.I0(this.mParentFragment));
    }

    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isMenuVisible() {
        q qVar;
        return this.mMenuVisible && ((qVar = this.mFragmentManager) == null || qVar.J0(this.mParentFragment));
    }

    public boolean isPostponed() {
        i iVar = this.mAnimationInfo;
        if (iVar == null) {
            return false;
        }
        return iVar.f4759v;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        q qVar = this.mFragmentManager;
        if (qVar == null) {
            return false;
        }
        return qVar.M0();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    public void noteStateNotSaved() {
        this.mChildFragmentManager.S0();
    }

    @Deprecated
    public void onActivityCreated(Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (q.G0(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i11 + " resultCode: " + i12 + " data: " + intent);
        }
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        m<?> mVar = this.mHost;
        Activity e11 = mVar == null ? null : mVar.e();
        if (e11 != null) {
            this.mCalled = false;
            onAttach(e11);
        }
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mCalled = true;
    }

    public boolean onContextItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onCreate(Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.L0(1)) {
            return;
        }
        this.mChildFragmentManager.A();
    }

    public Animation onCreateAnimation(int i11, boolean z11, int i12) {
        return null;
    }

    public Animator onCreateAnimator(int i11, boolean z11, int i12) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            return layoutInflater.inflate(i11, viewGroup, false);
        }
        return null;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    public void onDestroyOptionsMenu() {
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    public LayoutInflater onGetLayoutInflater(Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    public void onHiddenChanged(boolean z11) {
    }

    public void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
        m<?> mVar = this.mHost;
        Activity e11 = mVar == null ? null : mVar.e();
        if (e11 != null) {
            this.mCalled = false;
            onInflate(e11, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z11) {
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z11) {
    }

    public void onPrepareOptionsMenu(Menu menu) {
    }

    public void onPrimaryNavigationFragmentChanged(boolean z11) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onViewCreated(View view, Bundle bundle) {
    }

    public void onViewStateRestored(Bundle bundle) {
        this.mCalled = true;
    }

    public void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.S0();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.w();
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    public void performAttach() {
        Iterator<k> it2 = this.mOnPreAttachedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.k(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.f());
        if (this.mCalled) {
            this.mFragmentManager.G(this);
            this.mChildFragmentManager.x();
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onAttach()");
    }

    public void performConfigurationChanged(Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.y(configuration);
    }

    public boolean performContextItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.z(menuItem);
    }

    public void performCreate(Bundle bundle) {
        this.mChildFragmentManager.S0();
        this.mState = 1;
        this.mCalled = false;
        if (Build.VERSION.SDK_INT >= 19) {
            this.mLifecycleRegistry.a(new androidx.lifecycle.s() { // from class: androidx.fragment.app.Fragment.5
                {
                    Fragment.this = this;
                }

                @Override // androidx.lifecycle.s
                public void g(androidx.lifecycle.v vVar, p.b bVar) {
                    View view;
                    if (bVar != p.b.ON_STOP || (view = Fragment.this.mView) == null) {
                        return;
                    }
                    j.a(view);
                }
            });
        }
        this.mSavedStateRegistryController.c(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.i(p.b.ON_CREATE);
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onCreate()");
    }

    public boolean performCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        boolean z11 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z11 = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z11 | this.mChildFragmentManager.B(menu, menuInflater);
    }

    public void performCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.mChildFragmentManager.S0();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new d0(this, getViewModelStore());
        View onCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = onCreateView;
        if (onCreateView != null) {
            this.mViewLifecycleOwner.b();
            v0.b(this.mView, this.mViewLifecycleOwner);
            w0.b(this.mView, this.mViewLifecycleOwner);
            androidx.savedstate.d.b(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.c()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    public void performDestroy() {
        this.mChildFragmentManager.C();
        this.mLifecycleRegistry.i(p.b.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onDestroy()");
    }

    public void performDestroyView() {
        this.mChildFragmentManager.D();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().b().isAtLeast(p.c.CREATED)) {
            this.mViewLifecycleOwner.a(p.b.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            androidx.loader.app.a.b(this).c();
            this.mPerformedCreateView = false;
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.F0()) {
                return;
            }
            this.mChildFragmentManager.C();
            this.mChildFragmentManager = new r();
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onDetach()");
    }

    public LayoutInflater performGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = onGetLayoutInflater;
        return onGetLayoutInflater;
    }

    public void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.E();
    }

    public void performMultiWindowModeChanged(boolean z11) {
        onMultiWindowModeChanged(z11);
        this.mChildFragmentManager.F(z11);
    }

    public boolean performOptionsItemSelected(MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.I(menuItem);
    }

    public void performOptionsMenuClosed(Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.J(menu);
    }

    public void performPause() {
        this.mChildFragmentManager.L();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(p.b.ON_PAUSE);
        }
        this.mLifecycleRegistry.i(p.b.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onPause()");
    }

    public void performPictureInPictureModeChanged(boolean z11) {
        onPictureInPictureModeChanged(z11);
        this.mChildFragmentManager.M(z11);
    }

    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean z11 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z11 = true;
            onPrepareOptionsMenu(menu);
        }
        return z11 | this.mChildFragmentManager.N(menu);
    }

    public void performPrimaryNavigationFragmentChanged() {
        boolean K0 = this.mFragmentManager.K0(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != K0) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(K0);
            onPrimaryNavigationFragmentChanged(K0);
            this.mChildFragmentManager.O();
        }
    }

    public void performResume() {
        this.mChildFragmentManager.S0();
        this.mChildFragmentManager.Z(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            androidx.lifecycle.x xVar = this.mLifecycleRegistry;
            p.b bVar = p.b.ON_RESUME;
            xVar.i(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(bVar);
            }
            this.mChildFragmentManager.P();
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onResume()");
    }

    public void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.d(bundle);
        Parcelable g12 = this.mChildFragmentManager.g1();
        if (g12 != null) {
            bundle.putParcelable("android:support:fragments", g12);
        }
    }

    public void performStart() {
        this.mChildFragmentManager.S0();
        this.mChildFragmentManager.Z(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            androidx.lifecycle.x xVar = this.mLifecycleRegistry;
            p.b bVar = p.b.ON_START;
            xVar.i(bVar);
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(bVar);
            }
            this.mChildFragmentManager.Q();
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onStart()");
    }

    public void performStop() {
        this.mChildFragmentManager.S();
        if (this.mView != null) {
            this.mViewLifecycleOwner.a(p.b.ON_STOP);
        }
        this.mLifecycleRegistry.i(p.b.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onStop()");
    }

    public void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.T();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f4759v = true;
    }

    @Override // androidx.activity.result.c
    public final <I, O> androidx.activity.result.d<I> registerForActivityResult(f.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return prepareCallInternal(aVar, new e(), bVar);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(String[] strArr, int i11) {
        if (this.mHost != null) {
            getParentFragmentManager().O0(this, strArr, i11);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public final androidx.fragment.app.h requireActivity() {
        androidx.fragment.app.h activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @Deprecated
    public final q requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            if (getContext() == null) {
                throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
            }
            throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
        }
        return parentFragment;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public void restoreChildFragmentState(Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.e1(parcelable);
        this.mChildFragmentManager.A();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.d(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.a(p.b.ON_CREATE);
                return;
            }
            return;
        }
        throw new i0("Fragment " + this + " did not call through to super.onViewStateRestored()");
    }

    public void setAllowEnterTransitionOverlap(boolean z11) {
        ensureAnimationInfo().f4754q = Boolean.valueOf(z11);
    }

    public void setAllowReturnTransitionOverlap(boolean z11) {
        ensureAnimationInfo().f4753p = Boolean.valueOf(z11);
    }

    public void setAnimations(int i11, int i12, int i13, int i14) {
        if (this.mAnimationInfo == null && i11 == 0 && i12 == 0 && i13 == 0 && i14 == 0) {
            return;
        }
        ensureAnimationInfo().f4740c = i11;
        ensureAnimationInfo().f4741d = i12;
        ensureAnimationInfo().f4742e = i13;
        ensureAnimationInfo().f4743f = i14;
    }

    public void setArguments(Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(androidx.core.app.p pVar) {
        ensureAnimationInfo().f4755r = pVar;
    }

    public void setEnterTransition(Object obj) {
        ensureAnimationInfo().f4747j = obj;
    }

    public void setExitSharedElementCallback(androidx.core.app.p pVar) {
        ensureAnimationInfo().f4756s = pVar;
    }

    public void setExitTransition(Object obj) {
        ensureAnimationInfo().f4749l = obj;
    }

    public void setFocusedView(View view) {
        ensureAnimationInfo().f4758u = view;
    }

    public void setHasOptionsMenu(boolean z11) {
        if (this.mHasMenu != z11) {
            this.mHasMenu = z11;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.o();
        }
    }

    public void setInitialSavedState(l lVar) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (lVar == null || (r2 = lVar.f4760a) == null) ? null : null;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    public void setMenuVisibility(boolean z11) {
        if (this.mMenuVisible != z11) {
            this.mMenuVisible = z11;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.o();
            }
        }
    }

    public void setNextTransition(int i11) {
        if (this.mAnimationInfo == null && i11 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f4744g = i11;
    }

    public void setPopDirection(boolean z11) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f4739b = z11;
    }

    public void setPostOnViewCreatedAlpha(float f11) {
        ensureAnimationInfo().f4757t = f11;
    }

    public void setReenterTransition(Object obj) {
        ensureAnimationInfo().f4750m = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z11) {
        androidx.fragment.app.strictmode.a.m(this);
        this.mRetainInstance = z11;
        q qVar = this.mFragmentManager;
        if (qVar == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z11) {
            qVar.i(this);
        } else {
            qVar.c1(this);
        }
    }

    public void setReturnTransition(Object obj) {
        ensureAnimationInfo().f4748k = obj;
    }

    public void setSharedElementEnterTransition(Object obj) {
        ensureAnimationInfo().f4751n = obj;
    }

    public void setSharedElementNames(ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        i iVar = this.mAnimationInfo;
        iVar.f4745h = arrayList;
        iVar.f4746i = arrayList2;
    }

    public void setSharedElementReturnTransition(Object obj) {
        ensureAnimationInfo().f4752o = obj;
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int i11) {
        if (fragment != null) {
            androidx.fragment.app.strictmode.a.n(this, fragment, i11);
        }
        q qVar = this.mFragmentManager;
        q qVar2 = fragment != null ? fragment.mFragmentManager : null;
        if (qVar != null && qVar2 != null && qVar != qVar2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getTargetFragment(false)) {
            if (fragment2.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager != null && fragment.mFragmentManager != null) {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        } else {
            this.mTargetWho = null;
            this.mTarget = fragment;
        }
        this.mTargetRequestCode = i11;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z11) {
        androidx.fragment.app.strictmode.a.o(this, z11);
        if (!this.mUserVisibleHint && z11 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            q qVar = this.mFragmentManager;
            qVar.U0(qVar.u(this));
        }
        this.mUserVisibleHint = z11;
        this.mDeferStart = this.mState < 5 && !z11;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z11);
        }
    }

    public boolean shouldShowRequestPermissionRationale(String str) {
        m<?> mVar = this.mHost;
        if (mVar != null) {
            return mVar.l(str);
        }
        return false;
    }

    public void startActivity(Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i11) {
        startActivityForResult(intent, i11, null);
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        if (this.mHost != null) {
            if (q.G0(2)) {
                Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i11 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
            }
            getParentFragmentManager().Q0(this, intentSender, i11, intent, i12, i13, i14, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f4759v) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f4759v = false;
        } else if (Looper.myLooper() != this.mHost.g().getLooper()) {
            this.mHost.g().postAtFrontOfQueue(new b());
        } else {
            callStartTransitionListener(true);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("}");
        sb2.append(" (");
        sb2.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb2.append(" tag=");
            sb2.append(this.mTag);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener(null);
    }

    private Fragment getTargetFragment(boolean z11) {
        String str;
        if (z11) {
            androidx.fragment.app.strictmode.a.l(this);
        }
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        q qVar = this.mFragmentManager;
        if (qVar == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return qVar.e0(str);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String str, Bundle bundle) {
        try {
            Fragment newInstance = androidx.fragment.app.l.loadFragmentClass(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(newInstance.getClass().getClassLoader());
                newInstance.setArguments(bundle);
            }
            return newInstance;
        } catch (IllegalAccessException e11) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e11);
        } catch (java.lang.InstantiationException e12) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e12);
        } catch (NoSuchMethodException e13) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e13);
        } catch (InvocationTargetException e14) {
            throw new InstantiationException("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e14);
        }
    }

    public final String getString(int i11, Object... objArr) {
        return getResources().getString(i11, objArr);
    }

    public final void postponeEnterTransition(long j11, TimeUnit timeUnit) {
        Handler handler;
        ensureAnimationInfo().f4759v = true;
        q qVar = this.mFragmentManager;
        if (qVar != null) {
            handler = qVar.t0().g();
        } else {
            handler = new Handler(Looper.getMainLooper());
        }
        handler.removeCallbacks(this.mPostponedDurationRunnable);
        handler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j11));
    }

    public final <I, O> androidx.activity.result.d<I> registerForActivityResult(f.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b<O> bVar) {
        return prepareCallInternal(aVar, new f(this, activityResultRegistry), bVar);
    }

    public void startActivity(Intent intent, Bundle bundle) {
        m<?> mVar = this.mHost;
        if (mVar != null) {
            mVar.m(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int i11, Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().P0(this, intent, i11, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle bundle) {
        m<?> mVar = this.mHost;
        if (mVar != null) {
            LayoutInflater i11 = mVar.i();
            androidx.core.view.g.b(i11, this.mChildFragmentManager.u0());
            return i11;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (q.G0(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    public Fragment(int i11) {
        this();
        this.mContentLayoutId = i11;
    }
}