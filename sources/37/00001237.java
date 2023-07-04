package com.RNFetchBlob;

import android.app.Activity;
import android.app.DownloadManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.util.SparseArray;
import androidx.core.content.FileProvider;
import com.RNFetchBlob.f;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import java.io.File;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import org.spongycastle.i18n.MessageBundle;

/* loaded from: classes.dex */
public class RNFetchBlob extends ReactContextBaseJavaModule {
    private static boolean ActionViewVisible;
    static ReactApplicationContext RCTContext;
    static LinkedBlockingQueue<Runnable> fsTaskQueue;
    private static ThreadPoolExecutor fsThreadPool;
    private static SparseArray<Promise> promiseTable;
    private static LinkedBlockingQueue<Runnable> taskQueue = new LinkedBlockingQueue<>();
    private static ThreadPoolExecutor threadPool;
    private final OkHttpClient mClient;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9322a;

        /* renamed from: b */
        final /* synthetic */ String f9323b;

        /* renamed from: c */
        final /* synthetic */ Promise f9324c;

        a(RNFetchBlob rNFetchBlob, String str, String str2, Promise promise) {
            this.f9322a = str;
            this.f9323b = str2;
            this.f9324c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.o(this.f9322a, this.f9323b, this.f9324c);
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReactApplicationContext f9325a;

        /* renamed from: b */
        final /* synthetic */ String f9326b;

        /* renamed from: c */
        final /* synthetic */ String f9327c;

        /* renamed from: d */
        final /* synthetic */ int f9328d;

        /* renamed from: e */
        final /* synthetic */ int f9329e;

        /* renamed from: f */
        final /* synthetic */ String f9330f;

        b(RNFetchBlob rNFetchBlob, ReactApplicationContext reactApplicationContext, String str, String str2, int i11, int i12, String str3) {
            this.f9325a = reactApplicationContext;
            this.f9326b = str;
            this.f9327c = str2;
            this.f9328d = i11;
            this.f9329e = i12;
            this.f9330f = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            new com.RNFetchBlob.d(this.f9325a).y(this.f9326b, this.f9327c, this.f9328d, this.f9329e, this.f9330f);
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Callback f9331a;

        c(RNFetchBlob rNFetchBlob, Callback callback) {
            this.f9331a = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.f(this.f9331a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements ActivityEventListener {
        d(RNFetchBlob rNFetchBlob) {
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
            Integer num = com.RNFetchBlob.c.f9385a;
            if (i11 == num.intValue() && i12 == -1) {
                ((Promise) RNFetchBlob.promiseTable.get(num.intValue())).resolve(intent.getData().toString());
                RNFetchBlob.promiseTable.remove(num.intValue());
            }
        }

        @Override // com.facebook.react.bridge.ActivityEventListener
        public void onNewIntent(Intent intent) {
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9332a;

        /* renamed from: b */
        final /* synthetic */ String f9333b;

        /* renamed from: c */
        final /* synthetic */ String f9334c;

        /* renamed from: d */
        final /* synthetic */ Promise f9335d;

        e(RNFetchBlob rNFetchBlob, String str, String str2, String str3, Promise promise) {
            this.f9332a = str;
            this.f9333b = str2;
            this.f9334c = str3;
            this.f9335d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.c(this.f9332a, this.f9333b, this.f9334c, this.f9335d);
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9336a;

        /* renamed from: b */
        final /* synthetic */ ReadableArray f9337b;

        /* renamed from: c */
        final /* synthetic */ Promise f9338c;

        f(RNFetchBlob rNFetchBlob, String str, ReadableArray readableArray, Promise promise) {
            this.f9336a = str;
            this.f9337b = readableArray;
            this.f9338c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.d(this.f9336a, this.f9337b, this.f9338c);
        }
    }

    /* loaded from: classes.dex */
    class g implements LifecycleEventListener {

        /* renamed from: a */
        final /* synthetic */ Promise f9339a;

        g(RNFetchBlob rNFetchBlob, Promise promise) {
            this.f9339a = promise;
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostDestroy() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostPause() {
        }

        @Override // com.facebook.react.bridge.LifecycleEventListener
        public void onHostResume() {
            if (RNFetchBlob.ActionViewVisible) {
                this.f9339a.resolve(null);
            }
            RNFetchBlob.RCTContext.removeLifecycleEventListener(this);
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9340a;

        /* renamed from: b */
        final /* synthetic */ String f9341b;

        /* renamed from: c */
        final /* synthetic */ Callback f9342c;

        h(RNFetchBlob rNFetchBlob, String str, String str2, Callback callback) {
            this.f9340a = str;
            this.f9341b = str2;
            this.f9342c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.b(this.f9340a, this.f9341b, this.f9342c);
        }
    }

    /* loaded from: classes.dex */
    class i implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9343a;

        /* renamed from: b */
        final /* synthetic */ String f9344b;

        /* renamed from: c */
        final /* synthetic */ Promise f9345c;

        i(RNFetchBlob rNFetchBlob, String str, String str2, Promise promise) {
            this.f9343a = str;
            this.f9344b = str2;
            this.f9345c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.x(this.f9343a, this.f9344b, this.f9345c);
        }
    }

    /* loaded from: classes.dex */
    class j implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9346a;

        /* renamed from: b */
        final /* synthetic */ ReadableArray f9347b;

        /* renamed from: c */
        final /* synthetic */ boolean f9348c;

        /* renamed from: d */
        final /* synthetic */ Promise f9349d;

        j(RNFetchBlob rNFetchBlob, String str, ReadableArray readableArray, boolean z11, Promise promise) {
            this.f9346a = str;
            this.f9347b = readableArray;
            this.f9348c = z11;
            this.f9349d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.I(this.f9346a, this.f9347b, this.f9348c, this.f9349d);
        }
    }

    /* loaded from: classes.dex */
    class k implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f9350a;

        /* renamed from: b */
        final /* synthetic */ String f9351b;

        /* renamed from: c */
        final /* synthetic */ String f9352c;

        /* renamed from: d */
        final /* synthetic */ boolean f9353d;

        /* renamed from: e */
        final /* synthetic */ Promise f9354e;

        k(RNFetchBlob rNFetchBlob, String str, String str2, String str3, boolean z11, Promise promise) {
            this.f9350a = str;
            this.f9351b = str2;
            this.f9352c = str3;
            this.f9353d = z11;
            this.f9354e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.RNFetchBlob.d.J(this.f9350a, this.f9351b, this.f9352c, this.f9353d, this.f9354e);
        }
    }

    /* loaded from: classes.dex */
    class l implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ReadableArray f9355a;

        /* renamed from: b */
        final /* synthetic */ ReactApplicationContext f9356b;

        /* renamed from: c */
        final /* synthetic */ Callback f9357c;

        l(RNFetchBlob rNFetchBlob, ReadableArray readableArray, ReactApplicationContext reactApplicationContext, Callback callback) {
            this.f9355a = readableArray;
            this.f9356b = reactApplicationContext;
            this.f9357c = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            int size = this.f9355a.size();
            String[] strArr = new String[size];
            String[] strArr2 = new String[size];
            for (int i11 = 0; i11 < size; i11++) {
                ReadableMap map = this.f9355a.getMap(i11);
                if (map.hasKey("path")) {
                    strArr[i11] = map.getString("path");
                    if (map.hasKey("mime")) {
                        strArr2[i11] = map.getString("mime");
                    } else {
                        strArr2[i11] = null;
                    }
                }
            }
            new com.RNFetchBlob.d(this.f9356b).A(strArr, strArr2, this.f9357c);
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        threadPool = new ThreadPoolExecutor(5, 10, 5000L, timeUnit, taskQueue);
        fsTaskQueue = new LinkedBlockingQueue<>();
        fsThreadPool = new ThreadPoolExecutor(2, 10, 5000L, timeUnit, taskQueue);
        ActionViewVisible = false;
        promiseTable = new SparseArray<>();
    }

    public RNFetchBlob(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        OkHttpClient f11 = com.facebook.react.modules.network.g.f();
        this.mClient = f11;
        ((com.facebook.react.modules.network.a) f11.cookieJar()).b(new JavaNetCookieJar(new com.facebook.react.modules.network.c(reactApplicationContext)));
        RCTContext = reactApplicationContext;
        reactApplicationContext.addActivityEventListener(new d(this));
    }

    @ReactMethod
    public void actionViewIntent(String str, String str2, Promise promise) {
        try {
            Activity currentActivity = getCurrentActivity();
            Uri uriForFile = FileProvider.getUriForFile(currentActivity, getReactApplicationContext().getPackageName() + ".provider", new File(str));
            if (Build.VERSION.SDK_INT >= 24) {
                Intent dataAndType = new Intent("android.intent.action.VIEW").setDataAndType(uriForFile, str2);
                dataAndType.setFlags(1);
                dataAndType.addFlags(268435456);
                if (dataAndType.resolveActivity(getCurrentActivity().getPackageManager()) != null) {
                    getReactApplicationContext().startActivity(dataAndType);
                }
            } else {
                Intent intent = new Intent("android.intent.action.VIEW");
                getReactApplicationContext().startActivity(intent.setDataAndType(Uri.parse("file://" + str), str2).setFlags(268435456));
            }
            ActionViewVisible = true;
            RCTContext.addLifecycleEventListener(new g(this, promise));
        } catch (Exception e11) {
            promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
        }
    }

    @ReactMethod
    public void addCompleteDownload(ReadableMap readableMap, Promise promise) {
        DownloadManager downloadManager = (DownloadManager) RCTContext.getSystemService("download");
        if (readableMap != null && readableMap.hasKey("path")) {
            String w11 = com.RNFetchBlob.d.w(readableMap.getString("path"));
            if (w11 == null) {
                promise.reject("EINVAL", "RNFetchblob.addCompleteDownload can not resolve URI:" + readableMap.getString("path"));
                return;
            }
            try {
                downloadManager.addCompletedDownload(readableMap.hasKey(MessageBundle.TITLE_ENTRY) ? readableMap.getString(MessageBundle.TITLE_ENTRY) : "", readableMap.hasKey("description") ? readableMap.getString("description") : "", true, readableMap.hasKey("mime") ? readableMap.getString("mime") : null, w11, Long.valueOf(com.RNFetchBlob.d.D(w11).getString("size")).longValue(), readableMap.hasKey("showNotification") && readableMap.getBoolean("showNotification"));
                promise.resolve(null);
                return;
            } catch (Exception e11) {
                promise.reject("EUNSPECIFIED", e11.getLocalizedMessage());
                return;
            }
        }
        promise.reject("EINVAL", "RNFetchblob.addCompleteDownload config or path missing.");
    }

    @ReactMethod
    public void cancelRequest(String str, Callback callback) {
        try {
            com.RNFetchBlob.g.c(str);
            callback.invoke(null, str);
        } catch (Exception e11) {
            callback.invoke(e11.getLocalizedMessage(), null);
        }
    }

    @ReactMethod
    public void closeStream(String str, Callback callback) {
        com.RNFetchBlob.d.a(str, callback);
    }

    @ReactMethod
    public void cp(String str, String str2, Callback callback) {
        threadPool.execute(new h(this, str, str2, callback));
    }

    @ReactMethod
    public void createFile(String str, String str2, String str3, Promise promise) {
        threadPool.execute(new e(this, str, str2, str3, promise));
    }

    @ReactMethod
    public void createFileASCII(String str, ReadableArray readableArray, Promise promise) {
        threadPool.execute(new f(this, str, readableArray, promise));
    }

    @ReactMethod
    public void df(Callback callback) {
        fsThreadPool.execute(new c(this, callback));
    }

    @ReactMethod
    public void enableProgressReport(String str, int i11, int i12) {
        com.RNFetchBlob.g.f9401z.put(str, new com.RNFetchBlob.f(true, i11, i12, f.a.Download));
    }

    @ReactMethod
    public void enableUploadProgressReport(String str, int i11, int i12) {
        com.RNFetchBlob.g.A.put(str, new com.RNFetchBlob.f(true, i11, i12, f.a.Upload));
    }

    @ReactMethod
    public void exists(String str, Callback callback) {
        com.RNFetchBlob.d.j(str, callback);
    }

    @ReactMethod
    public void fetchBlob(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, Callback callback) {
        new com.RNFetchBlob.g(readableMap, str, str2, str3, readableMap2, str4, null, this.mClient, callback).run();
    }

    @ReactMethod
    public void fetchBlobForm(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, ReadableArray readableArray, Callback callback) {
        new com.RNFetchBlob.g(readableMap, str, str2, str3, readableMap2, null, readableArray, this.mClient, callback).run();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        return com.RNFetchBlob.d.m(getReactApplicationContext());
    }

    @ReactMethod
    public void getContentIntent(String str, Promise promise) {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        if (str != null) {
            intent.setType(str);
        } else {
            intent.setType("*/*");
        }
        SparseArray<Promise> sparseArray = promiseTable;
        Integer num = com.RNFetchBlob.c.f9385a;
        sparseArray.put(num.intValue(), promise);
        getReactApplicationContext().startActivityForResult(intent, num.intValue(), null);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNFetchBlob";
    }

    @ReactMethod
    public void getSDCardApplicationDir(Promise promise) {
        com.RNFetchBlob.d.k(getReactApplicationContext(), promise);
    }

    @ReactMethod
    public void getSDCardDir(Promise promise) {
        com.RNFetchBlob.d.l(promise);
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        threadPool.execute(new a(this, str, str2, promise));
    }

    @ReactMethod
    public void ls(String str, Promise promise) {
        com.RNFetchBlob.d.s(str, promise);
    }

    @ReactMethod
    public void lstat(String str, Callback callback) {
        com.RNFetchBlob.d.t(str, callback);
    }

    @ReactMethod
    public void mkdir(String str, Promise promise) {
        com.RNFetchBlob.d.u(str, promise);
    }

    @ReactMethod
    public void mv(String str, String str2, Callback callback) {
        com.RNFetchBlob.d.v(str, str2, callback);
    }

    @ReactMethod
    public void readFile(String str, String str2, Promise promise) {
        threadPool.execute(new i(this, str, str2, promise));
    }

    @ReactMethod
    public void readStream(String str, String str2, int i11, int i12, String str3) {
        fsThreadPool.execute(new b(this, getReactApplicationContext(), str, str2, i11, i12, str3));
    }

    @ReactMethod
    public void removeSession(ReadableArray readableArray, Callback callback) {
        com.RNFetchBlob.d.z(readableArray, callback);
    }

    @ReactMethod
    public void scanFile(ReadableArray readableArray, Callback callback) {
        threadPool.execute(new l(this, readableArray, getReactApplicationContext(), callback));
    }

    @ReactMethod
    public void slice(String str, String str2, int i11, int i12, Promise promise) {
        com.RNFetchBlob.d.B(str, str2, i11, i12, "", promise);
    }

    @ReactMethod
    public void stat(String str, Callback callback) {
        com.RNFetchBlob.d.C(str, callback);
    }

    @ReactMethod
    public void unlink(String str, Callback callback) {
        com.RNFetchBlob.d.F(str, callback);
    }

    @ReactMethod
    public void writeArrayChunk(String str, ReadableArray readableArray, Callback callback) {
        com.RNFetchBlob.d.G(str, readableArray, callback);
    }

    @ReactMethod
    public void writeChunk(String str, String str2, Callback callback) {
        com.RNFetchBlob.d.H(str, str2, callback);
    }

    @ReactMethod
    public void writeFile(String str, String str2, String str3, boolean z11, Promise promise) {
        threadPool.execute(new k(this, str, str2, str3, z11, promise));
    }

    @ReactMethod
    public void writeFileArray(String str, ReadableArray readableArray, boolean z11, Promise promise) {
        threadPool.execute(new j(this, str, readableArray, z11, promise));
    }

    @ReactMethod
    public void writeStream(String str, String str2, boolean z11, Callback callback) {
        new com.RNFetchBlob.d(getReactApplicationContext()).K(str, str2, z11, callback);
    }
}