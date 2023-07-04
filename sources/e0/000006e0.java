package androidx.fragment.app;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.app.a;
import androidx.lifecycle.p;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.savedstate.SavedStateRegistry;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class h extends ComponentActivity implements a.c, a.e {
    static final String LIFECYCLE_TAG = "android:support:lifecycle";
    boolean mCreated;
    final androidx.lifecycle.x mFragmentLifecycleRegistry;
    final k mFragments;
    boolean mResumed;
    boolean mStopped;

    /* loaded from: classes.dex */
    public class a extends m<h> implements u0, androidx.activity.f, androidx.activity.result.e, androidx.savedstate.c, u {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(r1);
            h.this = r1;
        }

        @Override // androidx.fragment.app.u
        public void a(q qVar, Fragment fragment) {
            h.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.m, androidx.fragment.app.j
        public View c(int i11) {
            return h.this.findViewById(i11);
        }

        @Override // androidx.fragment.app.m, androidx.fragment.app.j
        public boolean d() {
            Window window = h.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.activity.result.e
        public ActivityResultRegistry getActivityResultRegistry() {
            return h.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.v
        public androidx.lifecycle.p getLifecycle() {
            return h.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.f
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return h.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.savedstate.c
        public SavedStateRegistry getSavedStateRegistry() {
            return h.this.getSavedStateRegistry();
        }

        @Override // androidx.lifecycle.u0
        public t0 getViewModelStore() {
            return h.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.m
        public LayoutInflater i() {
            return h.this.getLayoutInflater().cloneInContext(h.this);
        }

        @Override // androidx.fragment.app.m
        public boolean l(String str) {
            return androidx.core.app.a.h(h.this, str);
        }

        @Override // androidx.fragment.app.m
        public void o() {
            h.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.m
        /* renamed from: p */
        public h h() {
            return h.this;
        }
    }

    public h() {
        this.mFragments = k.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.x(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().d(LIFECYCLE_TAG, new SavedStateRegistry.b() { // from class: androidx.fragment.app.f
            {
                h.this = this;
            }

            @Override // androidx.savedstate.SavedStateRegistry.b
            public final Bundle a() {
                Bundle lambda$init$0;
                lambda$init$0 = h.this.lambda$init$0();
                return lambda$init$0;
            }
        });
        addOnContextAvailableListener(new e.b() { // from class: androidx.fragment.app.g
            {
                h.this = this;
            }

            @Override // e.b
            public final void a(Context context) {
                h.this.lambda$init$1(context);
            }
        });
    }

    public /* synthetic */ Bundle lambda$init$0() {
        markFragmentsCreated();
        this.mFragmentLifecycleRegistry.i(p.b.ON_STOP);
        return new Bundle();
    }

    public /* synthetic */ void lambda$init$1(Context context) {
        this.mFragments.a(null);
    }

    private static boolean markState(q qVar, p.c cVar) {
        boolean z11 = false;
        for (Fragment fragment : qVar.s0()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z11 |= markState(fragment.getChildFragmentManager(), cVar);
                }
                d0 d0Var = fragment.mViewLifecycleOwner;
                if (d0Var != null && d0Var.getLifecycle().b().isAtLeast(p.c.STARTED)) {
                    fragment.mViewLifecycleOwner.f(cVar);
                    z11 = true;
                }
                if (fragment.mLifecycleRegistry.b().isAtLeast(p.c.STARTED)) {
                    fragment.mLifecycleRegistry.p(cVar);
                    z11 = true;
                }
            }
        }
        return z11;
    }

    final View dispatchFragmentsOnCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return this.mFragments.v(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            androidx.loader.app.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.t().V(str, fileDescriptor, printWriter, strArr);
    }

    public q getSupportFragmentManager() {
        return this.mFragments.t();
    }

    @Deprecated
    public androidx.loader.app.a getSupportLoaderManager() {
        return androidx.loader.app.a.b(this);
    }

    void markFragmentsCreated() {
        do {
        } while (markState(getSupportFragmentManager(), p.c.CREATED));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        this.mFragments.u();
        super.onActivityResult(i11, i12, intent);
    }

    @Deprecated
    public void onAttachFragment(Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        this.mFragments.u();
        super.onConfigurationChanged(configuration);
        this.mFragments.d(configuration);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.i(p.b.ON_CREATE);
        this.mFragments.f();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i11, Menu menu) {
        if (i11 == 0) {
            return super.onCreatePanelMenu(i11, menu) | this.mFragments.g(menu, getMenuInflater());
        }
        return super.onCreatePanelMenu(i11, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.mFragments.h();
        this.mFragmentLifecycleRegistry.i(p.b.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.i();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i11, MenuItem menuItem) {
        if (super.onMenuItemSelected(i11, menuItem)) {
            return true;
        }
        if (i11 != 0) {
            if (i11 != 6) {
                return false;
            }
            return this.mFragments.e(menuItem);
        }
        return this.mFragments.k(menuItem);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z11) {
        this.mFragments.j(z11);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        this.mFragments.u();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i11, Menu menu) {
        if (i11 == 0) {
            this.mFragments.l(menu);
        }
        super.onPanelClosed(i11, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.m();
        this.mFragmentLifecycleRegistry.i(p.b.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z11) {
        this.mFragments.n(z11);
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    protected boolean onPrepareOptionsPanel(View view, Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i11, View view, Menu menu) {
        if (i11 == 0) {
            return onPrepareOptionsPanel(view, menu) | this.mFragments.o(menu);
        }
        return super.onPreparePanel(i11, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        this.mFragments.u();
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        this.mFragments.u();
        super.onResume();
        this.mResumed = true;
        this.mFragments.s();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.i(p.b.ON_RESUME);
        this.mFragments.p();
    }

    @Override // android.app.Activity
    public void onStart() {
        this.mFragments.u();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.c();
        }
        this.mFragments.s();
        this.mFragmentLifecycleRegistry.i(p.b.ON_START);
        this.mFragments.q();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.u();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.r();
        this.mFragmentLifecycleRegistry.i(p.b.ON_STOP);
    }

    public void setEnterSharedElementCallback(androidx.core.app.p pVar) {
        androidx.core.app.a.f(this, pVar);
    }

    public void setExitSharedElementCallback(androidx.core.app.p pVar) {
        androidx.core.app.a.g(this, pVar);
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i11) {
        startActivityFromFragment(fragment, intent, i11, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(Fragment fragment, IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        if (i11 == -1) {
            androidx.core.app.a.j(this, intentSender, i11, intent, i12, i13, i14, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.a.b(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.a.c(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.a.k(this);
    }

    @Override // androidx.core.app.a.e
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i11) {
    }

    public void startActivityFromFragment(Fragment fragment, Intent intent, int i11, Bundle bundle) {
        if (i11 == -1) {
            androidx.core.app.a.i(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i11, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View dispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return dispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : dispatchFragmentsOnCreateView;
    }

    public h(int i11) {
        super(i11);
        this.mFragments = k.b(new a());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.x(this);
        this.mStopped = true;
        init();
    }
}