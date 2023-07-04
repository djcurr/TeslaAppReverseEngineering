package androidx.activity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.result.ActivityResultRegistry;
import androidx.core.view.k;
import androidx.core.view.m;
import androidx.lifecycle.k0;
import androidx.lifecycle.m0;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import androidx.lifecycle.v;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x;
import androidx.savedstate.SavedStateRegistry;
import f.a;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public class ComponentActivity extends androidx.core.app.f implements u0, o, androidx.savedstate.c, f, androidx.activity.result.e, androidx.activity.result.c {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;
    private int mContentLayoutId;
    final e.a mContextAwareHelper;
    private s0.b mDefaultFactory;
    private final x mLifecycleRegistry;
    private final k mMenuHostHelper;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final androidx.savedstate.b mSavedStateRegistryController;
    private t0 mViewModelStore;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {
        a() {
            ComponentActivity.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e11) {
                if (!TextUtils.equals(e11.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e11;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends ActivityResultRegistry {

        /* loaded from: classes.dex */
        class a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f1007a;

            /* renamed from: b */
            final /* synthetic */ a.C0496a f1008b;

            a(int i11, a.C0496a c0496a) {
                b.this = r1;
                this.f1007a = i11;
                this.f1008b = c0496a;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c(this.f1007a, this.f1008b.a());
            }
        }

        /* renamed from: androidx.activity.ComponentActivity$b$b */
        /* loaded from: classes.dex */
        class RunnableC0033b implements Runnable {

            /* renamed from: a */
            final /* synthetic */ int f1010a;

            /* renamed from: b */
            final /* synthetic */ IntentSender.SendIntentException f1011b;

            RunnableC0033b(int i11, IntentSender.SendIntentException sendIntentException) {
                b.this = r1;
                this.f1010a = i11;
                this.f1011b = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b(this.f1010a, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f1011b));
            }
        }

        b() {
            ComponentActivity.this = r1;
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        public <I, O> void f(int i11, f.a<I, O> aVar, I i12, androidx.core.app.b bVar) {
            ComponentActivity componentActivity = ComponentActivity.this;
            a.C0496a<O> synchronousResult = aVar.getSynchronousResult(componentActivity, i12);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new a(i11, synchronousResult));
                return;
            }
            Intent createIntent = aVar.createIntent(componentActivity, i12);
            Bundle bundle = null;
            if (createIntent.getExtras() != null && createIntent.getExtras().getClassLoader() == null) {
                createIntent.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (createIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundle = createIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                createIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else if (bVar != null) {
                bundle = bVar.b();
            }
            Bundle bundle2 = bundle;
            if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(createIntent.getAction())) {
                String[] stringArrayExtra = createIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.a.e(componentActivity, stringArrayExtra, i11);
            } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(createIntent.getAction())) {
                androidx.activity.result.f fVar = (androidx.activity.result.f) createIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    androidx.core.app.a.j(componentActivity, fVar.d(), i11, fVar.a(), fVar.b(), fVar.c(), 0, bundle2);
                } catch (IntentSender.SendIntentException e11) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0033b(i11, e11));
                }
            } else {
                androidx.core.app.a.i(componentActivity, createIntent, i11, bundle2);
            }
        }
    }

    /* loaded from: classes.dex */
    static class c {
        static void a(View view) {
            view.cancelPendingInputEvents();
        }
    }

    /* loaded from: classes.dex */
    public static final class d {

        /* renamed from: a */
        Object f1013a;

        /* renamed from: b */
        t0 f1014b;

        d() {
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new e.a();
        this.mMenuHostHelper = new k(new Runnable() { // from class: androidx.activity.d
            {
                ComponentActivity.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.this.invalidateMenu();
            }
        });
        this.mLifecycleRegistry = new x(this);
        this.mSavedStateRegistryController = androidx.savedstate.b.a(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new a());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new b();
        if (getLifecycle() != null) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 19) {
                getLifecycle().a(new s() { // from class: androidx.activity.ComponentActivity.3
                    {
                        ComponentActivity.this = this;
                    }

                    @Override // androidx.lifecycle.s
                    public void g(v vVar, p.b bVar) {
                        if (bVar == p.b.ON_STOP) {
                            Window window = ComponentActivity.this.getWindow();
                            View peekDecorView = window != null ? window.peekDecorView() : null;
                            if (peekDecorView != null) {
                                c.a(peekDecorView);
                            }
                        }
                    }
                });
            }
            getLifecycle().a(new s() { // from class: androidx.activity.ComponentActivity.4
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.s
                public void g(v vVar, p.b bVar) {
                    if (bVar == p.b.ON_DESTROY) {
                        ComponentActivity.this.mContextAwareHelper.b();
                        if (ComponentActivity.this.isChangingConfigurations()) {
                            return;
                        }
                        ComponentActivity.this.getViewModelStore().a();
                    }
                }
            });
            getLifecycle().a(new s() { // from class: androidx.activity.ComponentActivity.5
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.lifecycle.s
                public void g(v vVar, p.b bVar) {
                    ComponentActivity.this.ensureViewModelStore();
                    ComponentActivity.this.getLifecycle().c(this);
                }
            });
            if (19 <= i11 && i11 <= 23) {
                getLifecycle().a(new ImmLeaksCleaner(this));
            }
            getSavedStateRegistry().d(ACTIVITY_RESULT_TAG, new SavedStateRegistry.b() { // from class: androidx.activity.b
                {
                    ComponentActivity.this = this;
                }

                @Override // androidx.savedstate.SavedStateRegistry.b
                public final Bundle a() {
                    return ComponentActivity.e(ComponentActivity.this);
                }
            });
            addOnContextAvailableListener(new e.b() { // from class: androidx.activity.c
                {
                    ComponentActivity.this = this;
                }

                @Override // e.b
                public final void a(Context context) {
                    ComponentActivity.d(ComponentActivity.this, context);
                }
            });
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    public static /* synthetic */ void d(ComponentActivity componentActivity, Context context) {
        componentActivity.lambda$new$1(context);
    }

    public static /* synthetic */ Bundle e(ComponentActivity componentActivity) {
        return componentActivity.lambda$new$0();
    }

    private void initViewTreeOwners() {
        v0.b(getWindow().getDecorView(), this);
        w0.b(getWindow().getDecorView(), this);
        androidx.savedstate.d.b(getWindow().getDecorView(), this);
    }

    public /* synthetic */ Bundle lambda$new$0() {
        Bundle bundle = new Bundle();
        this.mActivityResultRegistry.h(bundle);
        return bundle;
    }

    public /* synthetic */ void lambda$new$1(Context context) {
        Bundle a11 = getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (a11 != null) {
            this.mActivityResultRegistry.g(a11);
        }
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    public void addMenuProvider(m mVar) {
        this.mMenuHostHelper.c(mVar);
    }

    public final void addOnContextAvailableListener(e.b bVar) {
        this.mContextAwareHelper.a(bVar);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            d dVar = (d) getLastNonConfigurationInstance();
            if (dVar != null) {
                this.mViewModelStore = dVar.f1014b;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new t0();
            }
        }
    }

    @Override // androidx.activity.result.e
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.o
    public s0.b getDefaultViewModelProviderFactory() {
        if (getApplication() != null) {
            if (this.mDefaultFactory == null) {
                this.mDefaultFactory = new m0(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    @Deprecated
    public Object getLastCustomNonConfigurationInstance() {
        d dVar = (d) getLastNonConfigurationInstance();
        if (dVar != null) {
            return dVar.f1013a;
        }
        return null;
    }

    @Override // androidx.core.app.f, androidx.lifecycle.v
    public p getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.f
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.c
    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.b();
    }

    @Override // androidx.lifecycle.u0
    public t0 getViewModelStore() {
        if (getApplication() != null) {
            ensureViewModelStore();
            return this.mViewModelStore;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @Deprecated
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (this.mActivityResultRegistry.b(i11, i12, intent)) {
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.d();
    }

    @Override // androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.mSavedStateRegistryController.c(bundle);
        this.mContextAwareHelper.c(this);
        super.onCreate(bundle);
        k0.g(this);
        int i11 = this.mContentLayoutId;
        if (i11 != 0) {
            setContentView(i11);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        this.mMenuHostHelper.h(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (super.onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mMenuHostHelper.i(menuItem);
    }

    @Override // android.app.Activity
    @Deprecated
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        if (this.mActivityResultRegistry.b(i11, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr)) || Build.VERSION.SDK_INT < 23) {
            return;
        }
        super.onRequestPermissionsResult(i11, strArr, iArr);
    }

    @Deprecated
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        d dVar;
        Object onRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        t0 t0Var = this.mViewModelStore;
        if (t0Var == null && (dVar = (d) getLastNonConfigurationInstance()) != null) {
            t0Var = dVar.f1014b;
        }
        if (t0Var == null && onRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        d dVar2 = new d();
        dVar2.f1013a = onRetainCustomNonConfigurationInstance;
        dVar2.f1014b = t0Var;
        return dVar2;
    }

    @Override // androidx.core.app.f, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        p lifecycle = getLifecycle();
        if (lifecycle instanceof x) {
            ((x) lifecycle).p(p.c.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.d(bundle);
    }

    public Context peekAvailableContext() {
        return this.mContextAwareHelper.d();
    }

    public final <I, O> androidx.activity.result.d<I> registerForActivityResult(f.a<I, O> aVar, ActivityResultRegistry activityResultRegistry, androidx.activity.result.b<O> bVar) {
        return activityResultRegistry.i("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, aVar, bVar);
    }

    public void removeMenuProvider(m mVar) {
        this.mMenuHostHelper.j(mVar);
    }

    public final void removeOnContextAvailableListener(e.b bVar) {
        this.mContextAwareHelper.e(bVar);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (z4.a.d()) {
                z4.a.a("reportFullyDrawn() for ComponentActivity");
            }
            int i11 = Build.VERSION.SDK_INT;
            if (i11 > 19) {
                super.reportFullyDrawn();
            } else if (i11 == 19 && androidx.core.content.b.checkSelfPermission(this, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                super.reportFullyDrawn();
            }
        } finally {
            z4.a.b();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i11) {
        initViewTreeOwners();
        super.setContentView(i11);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i11) {
        super.startActivityForResult(intent, i11);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14) {
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14);
    }

    public void addMenuProvider(m mVar, v vVar) {
        this.mMenuHostHelper.d(mVar, vVar);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(Intent intent, int i11, Bundle bundle) {
        super.startActivityForResult(intent, i11, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(IntentSender intentSender, int i11, Intent intent, int i12, int i13, int i14, Bundle bundle) {
        super.startIntentSenderForResult(intentSender, i11, intent, i12, i13, i14, bundle);
    }

    public void addMenuProvider(m mVar, v vVar, p.c cVar) {
        this.mMenuHostHelper.e(mVar, vVar, cVar);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // androidx.activity.result.c
    public final <I, O> androidx.activity.result.d<I> registerForActivityResult(f.a<I, O> aVar, androidx.activity.result.b<O> bVar) {
        return registerForActivityResult(aVar, this.mActivityResultRegistry, bVar);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    public ComponentActivity(int i11) {
        this();
        this.mContentLayoutId = i11;
    }
}