package expo.modules;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.ViewGroup;
import androidx.collection.a;
import com.adyen.checkout.components.status.model.StatusResponse;
import com.facebook.react.l;
import com.facebook.react.m;
import com.facebook.react.modules.core.f;
import com.facebook.react.r;
import com.facebook.react.u;
import com.facebook.react.z;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import expo.modules.core.interfaces.Package;
import expo.modules.core.interfaces.ReactActivityHandler;
import expo.modules.core.interfaces.ReactActivityLifecycleListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import u20.h;
import u20.k;
import u20.p;
import wz.b0;
import wz.e0;
import wz.x;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010@\u001a\u00020'\u0012\u0006\u0010B\u001a\u00020\u0001¢\u0006\u0004\bO\u0010PB\u0019\b\u0016\u0012\u0006\u0010>\u001a\u00020=\u0012\u0006\u0010B\u001a\u00020\u0001¢\u0006\u0004\bO\u0010QJ\u001d\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006JC\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\bH\u0002¢\u0006\u0004\b\u0005\u0010\fJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0010\u001a\u00020\u000fH\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u0014J\u0012\u0010\u001a\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u001b\u001a\u00020\u0017H\u0014J\b\u0010\u001c\u001a\u00020\u0017H\u0014J\b\u0010\u001d\u001a\u00020\u0017H\u0014J\"\u0010#\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001e2\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016J\u001a\u0010(\u001a\u00020'2\u0006\u0010$\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010)\u001a\u00020'2\u0006\u0010$\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J\u001a\u0010*\u001a\u00020'2\u0006\u0010$\u001a\u00020\u001e2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016J\b\u0010+\u001a\u00020'H\u0016J\u0012\u0010-\u001a\u00020'2\b\u0010,\u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010/\u001a\u00020\u00172\u0006\u0010.\u001a\u00020'H\u0016J3\u00103\u001a\u00020\u00172\u0010\u00100\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b3\u00104J3\u00107\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0010\u00100\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0003\u0018\u00010\b2\b\u00106\u001a\u0004\u0018\u000105H\u0016¢\u0006\u0004\b7\u00108J\b\u0010:\u001a\u000209H\u0014J\b\u0010<\u001a\u00020;H\u0014R\u0016\u0010>\u001a\u00020=8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010@\u001a\u00020'8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0016\u0010B\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR$\u0010G\u001a\u0010\u0012\f\u0012\n F*\u0004\u0018\u00010E0E0D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u0010\u0012\f\u0012\n F*\u0004\u0018\u00010I0I0D8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\"\u0010M\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020L0K8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010N¨\u0006R"}, d2 = {"Lexpo/modules/ReactActivityDelegateWrapper;", "Lcom/facebook/react/m;", "T", "", "name", "invokeDelegateMethod", "(Ljava/lang/String;)Ljava/lang/Object;", "A", "", "Ljava/lang/Class;", "argTypes", "args", "(Ljava/lang/String;[Ljava/lang/Class;[Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/os/Bundle;", "getLaunchOptions", "Lcom/facebook/react/z;", "createRootView", "Lcom/facebook/react/u;", "getReactNativeHost", "Lcom/facebook/react/r;", "getReactInstanceManager", "getMainComponentName", "appKey", "Lvz/b0;", "loadApp", "savedInstanceState", "onCreate", "onResume", "onPause", "onDestroy", "", "requestCode", StatusResponse.RESULT_CODE, "Landroid/content/Intent;", MessageExtension.FIELD_DATA, "onActivityResult", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKeyDown", "onKeyUp", "onKeyLongPress", "onBackPressed", "intent", "onNewIntent", "hasFocus", "onWindowFocusChanged", "permissions", "Lcom/facebook/react/modules/core/f;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "requestPermissions", "([Ljava/lang/String;ILcom/facebook/react/modules/core/f;)V", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroid/content/Context;", "getContext", "Landroid/app/Activity;", "getPlainActivity", "Lcom/facebook/react/l;", "activity", "Lcom/facebook/react/l;", "isNewArchitectureEnabled", "Z", "delegate", "Lcom/facebook/react/m;", "", "Lexpo/modules/core/interfaces/ReactActivityLifecycleListener;", "kotlin.jvm.PlatformType", "reactActivityLifecycleListeners", "Ljava/util/List;", "Lexpo/modules/core/interfaces/ReactActivityHandler;", "reactActivityHandlers", "Landroidx/collection/a;", "Ljava/lang/reflect/Method;", "methodMap", "Landroidx/collection/a;", "<init>", "(Lcom/facebook/react/l;ZLcom/facebook/react/m;)V", "(Lcom/facebook/react/l;Lcom/facebook/react/m;)V", "expo_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public final class ReactActivityDelegateWrapper extends m {
    private final l activity;
    private m delegate;
    private final boolean isNewArchitectureEnabled;
    private final a<String, Method> methodMap;
    private final List<ReactActivityHandler> reactActivityHandlers;
    private final List<ReactActivityLifecycleListener> reactActivityLifecycleListeners;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactActivityDelegateWrapper(l activity, boolean z11, m delegate) {
        super(activity, (String) null);
        s.g(activity, "activity");
        s.g(delegate, "delegate");
        this.activity = activity;
        this.isNewArchitectureEnabled = z11;
        this.delegate = delegate;
        List<Package> packageList = ExpoModulesPackage.Companion.getPackageList();
        ArrayList arrayList = new ArrayList();
        for (Package r42 : packageList) {
            List<? extends ReactActivityLifecycleListener> createReactActivityLifecycleListeners = r42.createReactActivityLifecycleListeners(this.activity);
            s.f(createReactActivityLifecycleListeners, "it.createReactActivityLifecycleListeners(activity)");
            b0.z(arrayList, createReactActivityLifecycleListeners);
        }
        this.reactActivityLifecycleListeners = arrayList;
        List<Package> packageList2 = ExpoModulesPackage.Companion.getPackageList();
        ArrayList arrayList2 = new ArrayList();
        for (Package r43 : packageList2) {
            List<? extends ReactActivityHandler> createReactActivityHandlers = r43.createReactActivityHandlers(this.activity);
            s.f(createReactActivityHandlers, "it.createReactActivityHandlers(activity)");
            b0.z(arrayList2, createReactActivityHandlers);
        }
        this.reactActivityHandlers = arrayList2;
        this.methodMap = new a<>();
    }

    private final <T> T invokeDelegateMethod(String str) {
        Method method = this.methodMap.get(str);
        if (method == null) {
            method = m.class.getDeclaredMethod(str, new Class[0]);
            method.setAccessible(true);
            this.methodMap.put(str, method);
        }
        s.e(method);
        return (T) method.invoke(this.delegate, new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.m
    public z createRootView() {
        h S;
        h C;
        S = e0.S(this.reactActivityHandlers);
        C = p.C(S, new ReactActivityDelegateWrapper$createRootView$rootView$1(this));
        z zVar = (z) k.u(C);
        if (zVar == null) {
            zVar = (z) invokeDelegateMethod("createRootView");
        }
        s.f(zVar, "override fun createRootV…)\n    return rootView\n  }");
        zVar.setIsFabric(this.isNewArchitectureEnabled);
        return zVar;
    }

    @Override // com.facebook.react.m
    protected Context getContext() {
        return (Context) invokeDelegateMethod("getContext");
    }

    @Override // com.facebook.react.m
    protected Bundle getLaunchOptions() {
        return (Bundle) invokeDelegateMethod("getLaunchOptions");
    }

    @Override // com.facebook.react.m
    public String getMainComponentName() {
        return this.delegate.getMainComponentName();
    }

    @Override // com.facebook.react.m
    protected Activity getPlainActivity() {
        return (Activity) invokeDelegateMethod("getPlainActivity");
    }

    @Override // com.facebook.react.m
    public r getReactInstanceManager() {
        r reactInstanceManager = this.delegate.getReactInstanceManager();
        s.f(reactInstanceManager, "delegate.reactInstanceManager");
        return reactInstanceManager;
    }

    @Override // com.facebook.react.m
    protected u getReactNativeHost() {
        return (u) invokeDelegateMethod("getReactNativeHost");
    }

    @Override // com.facebook.react.m
    protected void loadApp(String str) {
        h S;
        h C;
        S = e0.S(this.reactActivityHandlers);
        C = p.C(S, new ReactActivityDelegateWrapper$loadApp$rootViewContainer$1(this));
        ViewGroup viewGroup = (ViewGroup) k.u(C);
        if (viewGroup == null) {
            invokeDelegateMethod("loadApp", new Class[]{String.class}, new String[]{str});
            return;
        }
        Field declaredField = m.class.getDeclaredField("mReactDelegate");
        declaredField.setAccessible(true);
        Object obj = declaredField.get(this.delegate);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.facebook.react.ReactDelegate");
        com.facebook.react.p pVar = (com.facebook.react.p) obj;
        pVar.loadApp(str);
        viewGroup.addView(pVar.getReactRootView(), -1);
        this.activity.setContentView(viewGroup);
    }

    @Override // com.facebook.react.m
    public void onActivityResult(int i11, int i12, Intent intent) {
        this.delegate.onActivityResult(i11, i12, intent);
    }

    @Override // com.facebook.react.m
    public boolean onBackPressed() {
        int t11;
        boolean z11;
        List<ReactActivityLifecycleListener> list = this.reactActivityLifecycleListeners;
        t11 = x.t(list, 10);
        ArrayList<Boolean> arrayList = new ArrayList(t11);
        for (ReactActivityLifecycleListener reactActivityLifecycleListener : list) {
            arrayList.add(Boolean.valueOf(reactActivityLifecycleListener.onBackPressed()));
        }
        loop1: while (true) {
            for (Boolean bool : arrayList) {
                z11 = z11 || bool.booleanValue();
            }
        }
        return z11 || this.delegate.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.m
    public void onCreate(Bundle bundle) {
        h S;
        h C;
        S = e0.S(this.reactActivityHandlers);
        C = p.C(S, new ReactActivityDelegateWrapper$onCreate$newDelegate$1(this));
        m mVar = (m) k.u(C);
        if (mVar != null && !s.c(mVar, this)) {
            Field declaredField = l.class.getDeclaredField("a");
            declaredField.setAccessible(true);
            Field declaredField2 = Field.class.getDeclaredField("accessFlags");
            declaredField2.setAccessible(true);
            declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            declaredField.set(this.activity, mVar);
            this.delegate = mVar;
            invokeDelegateMethod("onCreate", new Class[]{Bundle.class}, new Bundle[]{bundle});
        } else {
            final Activity plainActivity = getPlainActivity();
            final u reactNativeHost = getReactNativeHost();
            final String mainComponentName = getMainComponentName();
            final Bundle launchOptions = getLaunchOptions();
            com.facebook.react.p pVar = new com.facebook.react.p(plainActivity, reactNativeHost, mainComponentName, launchOptions) { // from class: expo.modules.ReactActivityDelegateWrapper$onCreate$reactDelegate$1
                @Override // com.facebook.react.p
                protected z createRootView() {
                    return ReactActivityDelegateWrapper.this.createRootView();
                }
            };
            Field declaredField3 = m.class.getDeclaredField("mReactDelegate");
            declaredField3.setAccessible(true);
            declaredField3.set(this.delegate, pVar);
            if (getMainComponentName() != null) {
                loadApp(getMainComponentName());
            }
        }
        for (ReactActivityLifecycleListener reactActivityLifecycleListener : this.reactActivityLifecycleListeners) {
            reactActivityLifecycleListener.onCreate(this.activity, bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.m
    public void onDestroy() {
        for (ReactActivityLifecycleListener reactActivityLifecycleListener : this.reactActivityLifecycleListeners) {
            reactActivityLifecycleListener.onDestroy(this.activity);
        }
        invokeDelegateMethod("onDestroy");
    }

    @Override // com.facebook.react.m
    public boolean onKeyDown(int i11, KeyEvent keyEvent) {
        return this.delegate.onKeyDown(i11, keyEvent);
    }

    @Override // com.facebook.react.m
    public boolean onKeyLongPress(int i11, KeyEvent keyEvent) {
        return this.delegate.onKeyLongPress(i11, keyEvent);
    }

    @Override // com.facebook.react.m
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        int t11;
        boolean z11;
        List<ReactActivityHandler> list = this.reactActivityHandlers;
        t11 = x.t(list, 10);
        ArrayList<Boolean> arrayList = new ArrayList(t11);
        for (ReactActivityHandler reactActivityHandler : list) {
            arrayList.add(Boolean.valueOf(reactActivityHandler.onKeyUp(i11, keyEvent)));
        }
        loop1: while (true) {
            for (Boolean bool : arrayList) {
                z11 = z11 || bool.booleanValue();
            }
        }
        return z11 || this.delegate.onKeyUp(i11, keyEvent);
    }

    @Override // com.facebook.react.m
    public boolean onNewIntent(Intent intent) {
        int t11;
        boolean z11;
        List<ReactActivityLifecycleListener> list = this.reactActivityLifecycleListeners;
        t11 = x.t(list, 10);
        ArrayList<Boolean> arrayList = new ArrayList(t11);
        for (ReactActivityLifecycleListener reactActivityLifecycleListener : list) {
            arrayList.add(Boolean.valueOf(reactActivityLifecycleListener.onNewIntent(intent)));
        }
        loop1: while (true) {
            for (Boolean bool : arrayList) {
                z11 = z11 || bool.booleanValue();
            }
        }
        return z11 || this.delegate.onNewIntent(intent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.m
    public void onPause() {
        for (ReactActivityLifecycleListener reactActivityLifecycleListener : this.reactActivityLifecycleListeners) {
            reactActivityLifecycleListener.onPause(this.activity);
        }
        invokeDelegateMethod("onPause");
    }

    @Override // com.facebook.react.m
    public void onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        this.delegate.onRequestPermissionsResult(i11, strArr, iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.m
    public void onResume() {
        invokeDelegateMethod("onResume");
        for (ReactActivityLifecycleListener reactActivityLifecycleListener : this.reactActivityLifecycleListeners) {
            reactActivityLifecycleListener.onResume(this.activity);
        }
    }

    @Override // com.facebook.react.m
    public void onWindowFocusChanged(boolean z11) {
        this.delegate.onWindowFocusChanged(z11);
    }

    @Override // com.facebook.react.m
    public void requestPermissions(String[] strArr, int i11, f fVar) {
        this.delegate.requestPermissions(strArr, i11, fVar);
    }

    private final <T, A> T invokeDelegateMethod(String str, Class<?>[] clsArr, A[] aArr) {
        Method method = this.methodMap.get(str);
        if (method == null) {
            method = m.class.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            method.setAccessible(true);
            this.methodMap.put(str, method);
        }
        s.e(method);
        return (T) method.invoke(this.delegate, Arrays.copyOf(aArr, aArr.length));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReactActivityDelegateWrapper(l activity, m delegate) {
        this(activity, false, delegate);
        s.g(activity, "activity");
        s.g(delegate, "delegate");
    }
}