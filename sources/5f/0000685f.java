package expo.modules.adapters.react.permissions;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import ch.qos.logback.core.CoreConstants;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import expo.modules.core.ModuleRegistry;
import expo.modules.core.Promise;
import expo.modules.core.interfaces.ActivityProvider;
import expo.modules.core.interfaces.InternalModule;
import expo.modules.core.interfaces.LifecycleEventListener;
import expo.modules.core.interfaces.services.UIManager;
import expo.modules.interfaces.permissions.Permissions;
import expo.modules.interfaces.permissions.PermissionsResponse;
import expo.modules.interfaces.permissions.PermissionsResponseListener;
import expo.modules.interfaces.permissions.PermissionsStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import vz.b0;
import vz.p;
import vz.v;
import wz.e0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\bQ\u0010RJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u001f\u0010\u000b\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J3\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00150\u00142\u000e\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000eH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0003J\b\u0010\u001d\u001a\u00020\u0006H\u0002J\b\u0010\u001e\u001a\u00020\u0006H\u0002J\u0016\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020!0 0\u001fH\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016J+\u0010(\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004H\u0016¢\u0006\u0004\b(\u0010)J+\u0010*\u001a\u00020\n2\u0006\u0010'\u001a\u00020&2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004H\u0016¢\u0006\u0004\b*\u0010)J+\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004H\u0016¢\u0006\u0004\b-\u0010.J+\u0010/\u001a\u00020\n2\u0006\u0010,\u001a\u00020+2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004H\u0016¢\u0006\u0004\b/\u0010.J#\u00100\u001a\u00020\u00062\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\"\u00020\u0004H\u0016¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u00103\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J'\u00105\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b2\u0006\u00104\u001a\u00020+H\u0014¢\u0006\u0004\b5\u00106J'\u00107\u001a\u00020\n2\u000e\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b2\u0006\u00104\u001a\u00020+H\u0004¢\u0006\u0004\b7\u00106J\b\u00108\u001a\u00020\nH\u0016J\b\u00109\u001a\u00020\nH\u0016J\b\u0010:\u001a\u00020\nH\u0016R\u0019\u0010<\u001a\u00020;8\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u0018\u0010A\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010E\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR \u0010G\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR0\u0010K\u001a\u001c\u0012\u0018\u0012\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00040\b\u0012\u0004\u0012\u00020+0J0I8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010M\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010FR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bO\u0010P¨\u0006S"}, d2 = {"Lexpo/modules/adapters/react/permissions/PermissionsService;", "Lexpo/modules/core/interfaces/InternalModule;", "Lexpo/modules/interfaces/permissions/Permissions;", "Lexpo/modules/core/interfaces/LifecycleEventListener;", "", "permission", "", "didAsk", "", "permissions", "Lvz/b0;", "addToAskedPermissionsCache", "([Ljava/lang/String;)V", "isPermissionGranted", "", "getManifestPermission", PermissionsResponse.CAN_ASK_AGAIN_KEY, "permissionsString", "", "grantResults", "", "Lexpo/modules/interfaces/permissions/PermissionsResponse;", "parseNativeResult", "([Ljava/lang/String;[I)Ljava/util/Map;", "result", "getPermissionResponseFromNativeResponse", "Lcom/facebook/react/modules/core/f;", "createListenerWithPendingPermissionsRequest", "askForWriteSettingsPermissionFirst", "hasWriteSettingsPermission", "isRuntimePermissionsAvailable", "", "Ljava/lang/Class;", "", "getExportedInterfaces", "Lexpo/modules/core/ModuleRegistry;", "moduleRegistry", "onCreate", "Lexpo/modules/core/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "getPermissionsWithPromise", "(Lexpo/modules/core/Promise;[Ljava/lang/String;)V", "askForPermissionsWithPromise", "Lexpo/modules/interfaces/permissions/PermissionsResponseListener;", "responseListener", "getPermissions", "(Lexpo/modules/interfaces/permissions/PermissionsResponseListener;[Ljava/lang/String;)V", "askForPermissions", "hasGrantedPermissions", "([Ljava/lang/String;)Z", "isPermissionPresentInManifest", "getManifestPermissionFromContext", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "askForManifestPermissions", "([Ljava/lang/String;Lexpo/modules/interfaces/permissions/PermissionsResponseListener;)V", "delegateRequestToActivity", "onHostResume", "onHostPause", "onHostDestroy", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lexpo/modules/core/interfaces/ActivityProvider;", "mActivityProvider", "Lexpo/modules/core/interfaces/ActivityProvider;", "mWriteSettingsPermissionBeingAsked", "Z", "mAskAsyncListener", "Lexpo/modules/interfaces/permissions/PermissionsResponseListener;", "mAskAsyncRequestedPermissions", "[Ljava/lang/String;", "Ljava/util/Queue;", "Lvz/p;", "mPendingPermissionCalls", "Ljava/util/Queue;", "mCurrentPermissionListener", "Landroid/content/SharedPreferences;", "mAskedPermissionsCache", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/Context;)V", "expo-modules-core_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes6.dex */
public class PermissionsService implements InternalModule, Permissions, LifecycleEventListener {
    private final Context context;
    private ActivityProvider mActivityProvider;
    private PermissionsResponseListener mAskAsyncListener;
    private String[] mAskAsyncRequestedPermissions;
    private SharedPreferences mAskedPermissionsCache;
    private PermissionsResponseListener mCurrentPermissionListener;
    private final Queue<p<String[], PermissionsResponseListener>> mPendingPermissionCalls;
    private boolean mWriteSettingsPermissionBeingAsked;

    public PermissionsService(Context context) {
        s.g(context, "context");
        this.context = context;
        this.mPendingPermissionCalls = new LinkedList();
    }

    public static /* synthetic */ void a(Promise promise, Map map) {
        m596getPermissionsWithPromise$lambda6(promise, map);
    }

    private final void addToAskedPermissionsCache(String[] strArr) {
        SharedPreferences sharedPreferences = this.mAskedPermissionsCache;
        if (sharedPreferences == null) {
            s.x("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        int i11 = 0;
        int length = strArr.length;
        while (i11 < length) {
            String str = strArr[i11];
            i11++;
            edit.putBoolean(str, true);
        }
        edit.apply();
    }

    /* renamed from: askForPermissions$lambda-10 */
    public static final void m593askForPermissions$lambda10(PermissionsService this$0, PermissionsResponseListener responseListener, Map it2) {
        s.g(this$0, "this$0");
        s.g(responseListener, "$responseListener");
        int i11 = this$0.hasWriteSettingsPermission() ? 0 : -1;
        s.f(it2, "it");
        it2.put("android.permission.WRITE_SETTINGS", this$0.getPermissionResponseFromNativeResponse("android.permission.WRITE_SETTINGS", i11));
        responseListener.onResult(it2);
    }

    /* renamed from: askForPermissionsWithPromise$lambda-7 */
    public static final void m594askForPermissionsWithPromise$lambda7(PermissionsService this$0, Promise promise, String[] permissions, Map map) {
        s.g(this$0, "this$0");
        s.g(promise, "$promise");
        s.g(permissions, "$permissions");
        this$0.getPermissionsWithPromise(promise, (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    private final void askForWriteSettingsPermissionFirst() {
        Intent intent = new Intent("android.settings.action.MANAGE_WRITE_SETTINGS");
        String packageName = getContext().getPackageName();
        intent.setData(Uri.parse("package:" + packageName));
        intent.addFlags(268435456);
        this.mWriteSettingsPermissionBeingAsked = true;
        getContext().startActivity(intent);
    }

    public static /* synthetic */ boolean b(PermissionsService permissionsService, int i11, String[] strArr, int[] iArr) {
        return m595createListenerWithPendingPermissionsRequest$lambda22(permissionsService, i11, strArr, iArr);
    }

    public static /* synthetic */ void c(PermissionsService permissionsService, PermissionsResponseListener permissionsResponseListener, Map map) {
        m593askForPermissions$lambda10(permissionsService, permissionsResponseListener, map);
    }

    private final boolean canAskAgain(String str) {
        Activity currentActivity;
        ActivityProvider activityProvider = this.mActivityProvider;
        if (activityProvider == null || (currentActivity = activityProvider.getCurrentActivity()) == null) {
            return false;
        }
        return androidx.core.app.a.h(currentActivity, str);
    }

    private final f createListenerWithPendingPermissionsRequest() {
        return new f() { // from class: expo.modules.adapters.react.permissions.a
            {
                PermissionsService.this = this;
            }

            @Override // com.facebook.react.modules.core.f
            public final boolean onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
                return PermissionsService.b(PermissionsService.this, i11, strArr, iArr);
            }
        };
    }

    /* renamed from: createListenerWithPendingPermissionsRequest$lambda-22 */
    public static final boolean m595createListenerWithPendingPermissionsRequest$lambda22(PermissionsService this$0, int i11, String[] receivePermissions, int[] grantResults) {
        s.g(this$0, "this$0");
        if (i11 == 13) {
            synchronized (this$0) {
                PermissionsResponseListener permissionsResponseListener = this$0.mCurrentPermissionListener;
                if (permissionsResponseListener != null) {
                    s.f(receivePermissions, "receivePermissions");
                    s.f(grantResults, "grantResults");
                    permissionsResponseListener.onResult(this$0.parseNativeResult(receivePermissions, grantResults));
                    this$0.mCurrentPermissionListener = null;
                    p<String[], PermissionsResponseListener> poll = this$0.mPendingPermissionCalls.poll();
                    if (poll != null) {
                        ActivityProvider activityProvider = this$0.mActivityProvider;
                        Activity currentActivity = activityProvider == null ? null : activityProvider.getCurrentActivity();
                        e eVar = currentActivity instanceof e ? (e) currentActivity : null;
                        if (eVar == null) {
                            PermissionsResponseListener d11 = poll.d();
                            String[] c11 = poll.c();
                            int length = poll.c().length;
                            int[] iArr = new int[length];
                            for (int i12 = 0; i12 < length; i12++) {
                                iArr[i12] = -1;
                            }
                            d11.onResult(this$0.parseNativeResult(c11, iArr));
                            Iterator<T> it2 = this$0.mPendingPermissionCalls.iterator();
                            while (it2.hasNext()) {
                                p pVar = (p) it2.next();
                                PermissionsResponseListener permissionsResponseListener2 = (PermissionsResponseListener) pVar.d();
                                String[] strArr = (String[]) pVar.c();
                                int length2 = ((Object[]) pVar.c()).length;
                                int[] iArr2 = new int[length2];
                                for (int i13 = 0; i13 < length2; i13++) {
                                    iArr2[i13] = -1;
                                }
                                permissionsResponseListener2.onResult(this$0.parseNativeResult(strArr, iArr2));
                            }
                            this$0.mPendingPermissionCalls.clear();
                        } else {
                            this$0.mCurrentPermissionListener = poll.d();
                            eVar.b(poll.c(), 13, this$0.createListenerWithPendingPermissionsRequest());
                            return false;
                        }
                    }
                    return true;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }
        }
        return false;
    }

    public static /* synthetic */ void d(PermissionsService permissionsService, Promise promise, String[] strArr, Map map) {
        m594askForPermissionsWithPromise$lambda7(permissionsService, promise, strArr, map);
    }

    private final boolean didAsk(String str) {
        SharedPreferences sharedPreferences = this.mAskedPermissionsCache;
        if (sharedPreferences == null) {
            s.x("mAskedPermissionsCache");
            sharedPreferences = null;
        }
        return sharedPreferences.getBoolean(str, false);
    }

    private final int getManifestPermission(String str) {
        Activity currentActivity;
        ActivityProvider activityProvider = this.mActivityProvider;
        if (activityProvider != null && (currentActivity = activityProvider.getCurrentActivity()) != null && (currentActivity instanceof e)) {
            return androidx.core.content.b.checkSelfPermission(currentActivity, str);
        }
        return getManifestPermissionFromContext(str);
    }

    private final PermissionsResponse getPermissionResponseFromNativeResponse(String str, int i11) {
        PermissionsStatus permissionsStatus;
        if (i11 == 0) {
            permissionsStatus = PermissionsStatus.GRANTED;
        } else {
            permissionsStatus = didAsk(str) ? PermissionsStatus.DENIED : PermissionsStatus.UNDETERMINED;
        }
        return new PermissionsResponse(permissionsStatus, permissionsStatus == PermissionsStatus.DENIED ? canAskAgain(str) : true);
    }

    /* renamed from: getPermissionsWithPromise$lambda-6 */
    public static final void m596getPermissionsWithPromise$lambda6(Promise promise, Map permissionsMap) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        String status;
        s.g(promise, "$promise");
        s.g(permissionsMap, "permissionsMap");
        boolean z15 = false;
        if (!permissionsMap.isEmpty()) {
            for (Map.Entry entry : permissionsMap.entrySet()) {
                if (((PermissionsResponse) entry.getValue()).getStatus() == PermissionsStatus.GRANTED) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (!z11) {
                    z12 = false;
                    break;
                }
            }
        }
        z12 = true;
        if (!permissionsMap.isEmpty()) {
            for (Map.Entry entry2 : permissionsMap.entrySet()) {
                if (((PermissionsResponse) entry2.getValue()).getStatus() == PermissionsStatus.DENIED) {
                    z13 = true;
                    continue;
                } else {
                    z13 = false;
                    continue;
                }
                if (!z13) {
                    z14 = false;
                    break;
                }
            }
        }
        z14 = true;
        if (!permissionsMap.isEmpty()) {
            for (Map.Entry entry3 : permissionsMap.entrySet()) {
                if (!((PermissionsResponse) entry3.getValue()).getCanAskAgain()) {
                    break;
                }
            }
        }
        z15 = true;
        Bundle bundle = new Bundle();
        bundle.putString(PermissionsResponse.EXPIRES_KEY, PermissionsResponse.PERMISSION_EXPIRES_NEVER);
        if (z12) {
            status = PermissionsStatus.GRANTED.getStatus();
        } else if (z14) {
            status = PermissionsStatus.DENIED.getStatus();
        } else {
            status = PermissionsStatus.UNDETERMINED.getStatus();
        }
        bundle.putString(PermissionsResponse.STATUS_KEY, status);
        bundle.putBoolean(PermissionsResponse.CAN_ASK_AGAIN_KEY, z15);
        bundle.putBoolean(PermissionsResponse.GRANTED_KEY, z12);
        b0 b0Var = b0.f54756a;
        promise.resolve(bundle);
    }

    private final boolean hasWriteSettingsPermission() {
        if (isRuntimePermissionsAvailable()) {
            return Settings.System.canWrite(this.context.getApplicationContext());
        }
        return true;
    }

    private final boolean isPermissionGranted(String str) {
        return s.c(str, "android.permission.WRITE_SETTINGS") ? hasWriteSettingsPermission() : getManifestPermission(str) == 0;
    }

    private final boolean isRuntimePermissionsAvailable() {
        return Build.VERSION.SDK_INT >= 23;
    }

    private final Map<String, PermissionsResponse> parseNativeResult(String[] strArr, int[] iArr) {
        List<p> G0;
        HashMap hashMap = new HashMap();
        G0 = wz.p.G0(iArr, strArr);
        for (p pVar : G0) {
            int intValue = ((Number) pVar.a()).intValue();
            String str = (String) pVar.b();
            hashMap.put(str, getPermissionResponseFromNativeResponse(str, intValue));
        }
        return hashMap;
    }

    protected void askForManifestPermissions(String[] permissions, PermissionsResponseListener listener) {
        int[] N0;
        s.g(permissions, "permissions");
        s.g(listener, "listener");
        if (!isRuntimePermissionsAvailable()) {
            addToAskedPermissionsCache(permissions);
            ArrayList arrayList = new ArrayList(permissions.length);
            int i11 = 0;
            int length = permissions.length;
            while (i11 < length) {
                String str = permissions[i11];
                i11++;
                arrayList.add(Integer.valueOf(getManifestPermission(str)));
            }
            N0 = e0.N0(arrayList);
            listener.onResult(parseNativeResult(permissions, N0));
            return;
        }
        delegateRequestToActivity(permissions, listener);
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void askForPermissions(final PermissionsResponseListener responseListener, String... permissions) {
        boolean D;
        List B0;
        s.g(responseListener, "responseListener");
        s.g(permissions, "permissions");
        D = wz.p.D(permissions, "android.permission.WRITE_SETTINGS");
        if (D && isRuntimePermissionsAvailable()) {
            B0 = wz.p.B0(permissions);
            B0.remove("android.permission.WRITE_SETTINGS");
            Object[] array = B0.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            String[] strArr = (String[]) array;
            PermissionsResponseListener permissionsResponseListener = new PermissionsResponseListener() { // from class: expo.modules.adapters.react.permissions.c
                {
                    PermissionsService.this = this;
                }

                @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
                public final void onResult(Map map) {
                    PermissionsService.c(PermissionsService.this, responseListener, map);
                }
            };
            if (!hasWriteSettingsPermission()) {
                if (this.mAskAsyncListener == null) {
                    this.mAskAsyncListener = permissionsResponseListener;
                    this.mAskAsyncRequestedPermissions = strArr;
                    addToAskedPermissionsCache(new String[]{"android.permission.WRITE_SETTINGS"});
                    askForWriteSettingsPermissionFirst();
                    return;
                }
                throw new IllegalStateException("Another permissions request is in progress. Await the old request and then try again.");
            }
            askForManifestPermissions(strArr, permissionsResponseListener);
            return;
        }
        askForManifestPermissions(permissions, responseListener);
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void askForPermissionsWithPromise(final Promise promise, final String... permissions) {
        s.g(promise, "promise");
        s.g(permissions, "permissions");
        askForPermissions(new PermissionsResponseListener() { // from class: expo.modules.adapters.react.permissions.b
            {
                PermissionsService.this = this;
            }

            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                PermissionsService.d(PermissionsService.this, promise, permissions, map);
            }
        }, (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    protected final void delegateRequestToActivity(String[] permissions, PermissionsResponseListener listener) {
        s.g(permissions, "permissions");
        s.g(listener, "listener");
        addToAskedPermissionsCache(permissions);
        ActivityProvider activityProvider = this.mActivityProvider;
        Activity currentActivity = activityProvider == null ? null : activityProvider.getCurrentActivity();
        if (currentActivity instanceof e) {
            synchronized (this) {
                if (this.mCurrentPermissionListener != null) {
                    this.mPendingPermissionCalls.add(v.a(permissions, listener));
                } else {
                    this.mCurrentPermissionListener = listener;
                    ((e) currentActivity).b(permissions, 13, createListenerWithPendingPermissionsRequest());
                    b0 b0Var = b0.f54756a;
                }
            }
            return;
        }
        int length = permissions.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = -1;
        }
        listener.onResult(parseNativeResult(permissions, iArr));
    }

    public final Context getContext() {
        return this.context;
    }

    @Override // expo.modules.core.interfaces.InternalModule
    public List<Class<? extends Object>> getExportedInterfaces() {
        List<Class<? extends Object>> d11;
        d11 = wz.v.d(Permissions.class);
        return d11;
    }

    protected int getManifestPermissionFromContext(String permission) {
        s.g(permission, "permission");
        return androidx.core.content.b.checkSelfPermission(this.context, permission);
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void getPermissions(PermissionsResponseListener responseListener, String... permissions) {
        int[] N0;
        s.g(responseListener, "responseListener");
        s.g(permissions, "permissions");
        ArrayList arrayList = new ArrayList(permissions.length);
        int length = permissions.length;
        int i11 = 0;
        while (i11 < length) {
            String str = permissions[i11];
            i11++;
            arrayList.add(Integer.valueOf(isPermissionGranted(str) ? 0 : -1));
        }
        N0 = e0.N0(arrayList);
        responseListener.onResult(parseNativeResult(permissions, N0));
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public void getPermissionsWithPromise(final Promise promise, String... permissions) {
        s.g(promise, "promise");
        s.g(permissions, "permissions");
        getPermissions(new PermissionsResponseListener() { // from class: expo.modules.adapters.react.permissions.d
            @Override // expo.modules.interfaces.permissions.PermissionsResponseListener
            public final void onResult(Map map) {
                PermissionsService.a(promise, map);
            }
        }, (String[]) Arrays.copyOf(permissions, permissions.length));
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public boolean hasGrantedPermissions(String... permissions) {
        s.g(permissions, "permissions");
        int length = permissions.length;
        int i11 = 0;
        while (i11 < length) {
            String str = permissions[i11];
            i11++;
            if (!isPermissionGranted(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // expo.modules.interfaces.permissions.Permissions
    public boolean isPermissionPresentInManifest(String permission) {
        boolean D;
        s.g(permission, "permission");
        try {
            PackageInfo packageInfo = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 4096);
            if (packageInfo == null) {
                return false;
            }
            String[] requestedPermissions = packageInfo.requestedPermissions;
            s.f(requestedPermissions, "requestedPermissions");
            D = wz.p.D(requestedPermissions, permission);
            return D;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    @Override // expo.modules.core.interfaces.RegistryLifecycleListener
    public void onCreate(ModuleRegistry moduleRegistry) {
        s.g(moduleRegistry, "moduleRegistry");
        ActivityProvider activityProvider = (ActivityProvider) moduleRegistry.getModule(ActivityProvider.class);
        if (activityProvider != null) {
            this.mActivityProvider = activityProvider;
            ((UIManager) moduleRegistry.getModule(UIManager.class)).registerLifecycleEventListener(this);
            SharedPreferences sharedPreferences = this.context.getApplicationContext().getSharedPreferences("expo.modules.permissions.asked", 0);
            s.f(sharedPreferences, "context.applicationConte…ME, Context.MODE_PRIVATE)");
            this.mAskedPermissionsCache = sharedPreferences;
            return;
        }
        throw new IllegalStateException("Couldn't find implementation for ActivityProvider.");
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // expo.modules.core.interfaces.LifecycleEventListener
    public void onHostResume() {
        if (this.mWriteSettingsPermissionBeingAsked) {
            this.mWriteSettingsPermissionBeingAsked = false;
            PermissionsResponseListener permissionsResponseListener = this.mAskAsyncListener;
            s.e(permissionsResponseListener);
            String[] strArr = this.mAskAsyncRequestedPermissions;
            s.e(strArr);
            this.mAskAsyncListener = null;
            this.mAskAsyncRequestedPermissions = null;
            if (!(strArr.length == 0)) {
                askForManifestPermissions(strArr, permissionsResponseListener);
            } else {
                permissionsResponseListener.onResult(new LinkedHashMap());
            }
        }
    }
}