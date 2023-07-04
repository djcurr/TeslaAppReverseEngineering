package com.facebook.react.modules.network;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public class c extends CookieHandler {
    private static final String COOKIE_HEADER = "Cookie";
    private static final String VERSION_ONE_HEADER = "Set-cookie2";
    private static final String VERSION_ZERO_HEADER = "Set-cookie";
    private final ReactContext mContext;
    private CookieManager mCookieManager;
    private final C0233c mCookieSaver = new C0233c();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements ValueCallback<Boolean> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Callback f12047a;

        a(Callback callback) {
            this.f12047a = callback;
        }

        @Override // android.webkit.ValueCallback
        /* renamed from: a */
        public void onReceiveValue(Boolean bool) {
            c.this.mCookieSaver.c();
            this.f12047a.invoke(bool);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b extends GuardedAsyncTask<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Runnable f12049a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c cVar, ReactContext reactContext, Runnable runnable) {
            super(reactContext);
            this.f12049a = runnable;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.facebook.react.bridge.GuardedAsyncTask
        /* renamed from: a */
        public void doInBackgroundGuarded(Void... voidArr) {
            this.f12049a.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.facebook.react.modules.network.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public class C0233c {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f12050a;

        /* renamed from: com.facebook.react.modules.network.c$c$a */
        /* loaded from: classes3.dex */
        class a implements Handler.Callback {
            a(c cVar) {
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what == 1) {
                    C0233c.this.d();
                    return true;
                }
                return false;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.facebook.react.modules.network.c$c$b */
        /* loaded from: classes3.dex */
        public class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C0233c.this.b();
            }
        }

        public C0233c() {
            this.f12050a = new Handler(Looper.getMainLooper(), new a(c.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            CookieManager cookieManager = c.this.getCookieManager();
            if (cookieManager != null) {
                cookieManager.flush();
            }
        }

        public void c() {
        }

        public void d() {
            this.f12050a.removeMessages(1);
            c.this.runInBackground(new b());
        }
    }

    public c(ReactContext reactContext) {
        this.mContext = reactContext;
    }

    private void addCookieAsync(String str, String str2) {
        CookieManager cookieManager = getCookieManager();
        if (cookieManager != null) {
            cookieManager.setCookie(str, str2, null);
        }
    }

    private void clearCookiesAsync(Callback callback) {
        CookieManager cookieManager = getCookieManager();
        if (cookieManager != null) {
            cookieManager.removeAllCookies(new a(callback));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CookieManager getCookieManager() {
        if (this.mCookieManager == null) {
            possiblyWorkaroundSyncManager(this.mContext);
            try {
                this.mCookieManager = CookieManager.getInstance();
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e11) {
                if (e11.getMessage() == null || !e11.getClass().getCanonicalName().contains("MissingWebViewPackageException")) {
                    throw e11;
                }
                return null;
            }
        }
        return this.mCookieManager;
    }

    private static boolean isCookieHeader(String str) {
        return str.equalsIgnoreCase(VERSION_ZERO_HEADER) || str.equalsIgnoreCase(VERSION_ONE_HEADER);
    }

    private static void possiblyWorkaroundSyncManager(Context context) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runInBackground(Runnable runnable) {
        new b(this, this.mContext, runnable).execute(new Void[0]);
    }

    public void addCookies(String str, List<String> list) {
        CookieManager cookieManager = getCookieManager();
        if (cookieManager == null) {
            return;
        }
        for (String str2 : list) {
            addCookieAsync(str, str2);
        }
        cookieManager.flush();
        this.mCookieSaver.c();
    }

    public void clearCookies(Callback callback) {
        clearCookiesAsync(callback);
    }

    public void destroy() {
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) {
        CookieManager cookieManager = getCookieManager();
        if (cookieManager == null) {
            return Collections.emptyMap();
        }
        String cookie = cookieManager.getCookie(uri.toString());
        if (TextUtils.isEmpty(cookie)) {
            return Collections.emptyMap();
        }
        return Collections.singletonMap("Cookie", Collections.singletonList(cookie));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) {
        String uri2 = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && isCookieHeader(key)) {
                addCookies(uri2, entry.getValue());
            }
        }
    }
}