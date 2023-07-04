package com.facebook.react.modules.permissions;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.util.SparseArray;
import com.facebook.fbreact.specs.NativePermissionsAndroidSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.core.e;
import com.facebook.react.modules.core.f;
import expo.modules.interfaces.permissions.PermissionsResponse;
import java.util.ArrayList;

@fg.a(name = PermissionsModule.NAME)
/* loaded from: classes3.dex */
public class PermissionsModule extends NativePermissionsAndroidSpec implements f {
    private static final String ERROR_INVALID_ACTIVITY = "E_INVALID_ACTIVITY";
    public static final String NAME = "PermissionsAndroid";
    private final String DENIED;
    private final String GRANTED;
    private final String NEVER_ASK_AGAIN;
    private final SparseArray<Callback> mCallbacks;
    private int mRequestCode;

    /* loaded from: classes3.dex */
    class a implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Promise f12070a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f12071b;

        a(PermissionsModule permissionsModule, Promise promise, String str) {
            this.f12070a = promise;
            this.f12071b = str;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            int[] iArr = (int[]) objArr[0];
            if (iArr.length > 0 && iArr[0] == 0) {
                this.f12070a.resolve(PermissionsResponse.GRANTED_KEY);
            } else if (((e) objArr[1]).shouldShowRequestPermissionRationale(this.f12071b)) {
                this.f12070a.resolve("denied");
            } else {
                this.f12070a.resolve("never_ask_again");
            }
        }
    }

    /* loaded from: classes3.dex */
    class b implements Callback {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ArrayList f12072a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ WritableMap f12073b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f12074c;

        b(PermissionsModule permissionsModule, ArrayList arrayList, WritableMap writableMap, Promise promise) {
            this.f12072a = arrayList;
            this.f12073b = writableMap;
            this.f12074c = promise;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            int[] iArr = (int[]) objArr[0];
            e eVar = (e) objArr[1];
            for (int i11 = 0; i11 < this.f12072a.size(); i11++) {
                String str = (String) this.f12072a.get(i11);
                if (iArr.length > 0 && iArr[i11] == 0) {
                    this.f12073b.putString(str, PermissionsResponse.GRANTED_KEY);
                } else if (eVar.shouldShowRequestPermissionRationale(str)) {
                    this.f12073b.putString(str, "denied");
                } else {
                    this.f12073b.putString(str, "never_ask_again");
                }
            }
            this.f12074c.resolve(this.f12073b);
        }
    }

    public PermissionsModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mRequestCode = 0;
        this.GRANTED = PermissionsResponse.GRANTED_KEY;
        this.DENIED = "denied";
        this.NEVER_ASK_AGAIN = "never_ask_again";
        this.mCallbacks = new SparseArray<>();
    }

    private e getPermissionAwareActivity() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity != null) {
            if (currentActivity instanceof e) {
                return (e) currentActivity;
            }
            throw new IllegalStateException("Tried to use permissions API but the host Activity doesn't implement PermissionAwareActivity.");
        }
        throw new IllegalStateException("Tried to use permissions API while not attached to an Activity.");
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void checkPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        if (Build.VERSION.SDK_INT < 23) {
            promise.resolve(Boolean.valueOf(baseContext.checkPermission(str, Process.myPid(), Process.myUid()) == 0));
        } else {
            promise.resolve(Boolean.valueOf(baseContext.checkSelfPermission(str) == 0));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.modules.core.f
    public boolean onRequestPermissionsResult(int i11, String[] strArr, int[] iArr) {
        this.mCallbacks.get(i11).invoke(iArr, getPermissionAwareActivity());
        this.mCallbacks.remove(i11);
        return this.mCallbacks.size() == 0;
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestMultiplePermissions(ReadableArray readableArray, Promise promise) {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        ArrayList arrayList = new ArrayList();
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i11 = 0;
        for (int i12 = 0; i12 < readableArray.size(); i12++) {
            String string = readableArray.getString(i12);
            int i13 = Build.VERSION.SDK_INT;
            String str = PermissionsResponse.GRANTED_KEY;
            if (i13 < 23) {
                if (baseContext.checkPermission(string, Process.myPid(), Process.myUid()) != 0) {
                    str = "denied";
                }
                writableNativeMap.putString(string, str);
            } else if (baseContext.checkSelfPermission(string) == 0) {
                writableNativeMap.putString(string, PermissionsResponse.GRANTED_KEY);
            } else {
                arrayList.add(string);
            }
            i11++;
        }
        if (readableArray.size() == i11) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            e permissionAwareActivity = getPermissionAwareActivity();
            this.mCallbacks.put(this.mRequestCode, new b(this, arrayList, writableNativeMap, promise));
            permissionAwareActivity.b((String[]) arrayList.toArray(new String[0]), this.mRequestCode, this);
            this.mRequestCode++;
        } catch (IllegalStateException e11) {
            promise.reject(ERROR_INVALID_ACTIVITY, e11);
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void requestPermission(String str, Promise promise) {
        Context baseContext = getReactApplicationContext().getBaseContext();
        int i11 = Build.VERSION.SDK_INT;
        String str2 = PermissionsResponse.GRANTED_KEY;
        if (i11 < 23) {
            if (baseContext.checkPermission(str, Process.myPid(), Process.myUid()) != 0) {
                str2 = "denied";
            }
            promise.resolve(str2);
        } else if (baseContext.checkSelfPermission(str) == 0) {
            promise.resolve(PermissionsResponse.GRANTED_KEY);
        } else {
            try {
                e permissionAwareActivity = getPermissionAwareActivity();
                this.mCallbacks.put(this.mRequestCode, new a(this, promise, str));
                permissionAwareActivity.b(new String[]{str}, this.mRequestCode, this);
                this.mRequestCode++;
            } catch (IllegalStateException e11) {
                promise.reject(ERROR_INVALID_ACTIVITY, e11);
            }
        }
    }

    @Override // com.facebook.fbreact.specs.NativePermissionsAndroidSpec
    public void shouldShowRequestPermissionRationale(String str, Promise promise) {
        if (Build.VERSION.SDK_INT < 23) {
            promise.resolve(Boolean.FALSE);
            return;
        }
        try {
            promise.resolve(Boolean.valueOf(getPermissionAwareActivity().shouldShowRequestPermissionRationale(str)));
        } catch (IllegalStateException e11) {
            promise.reject(ERROR_INVALID_ACTIVITY, e11);
        }
    }
}