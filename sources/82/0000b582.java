package tq;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import androidx.browser.customtabs.e;
import androidx.browser.customtabs.f;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.proyecto26.inappbrowser.ChromeTabsManagerActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public class c {

    /* renamed from: e  reason: collision with root package name */
    private static final Pattern f52390e = Pattern.compile("^.+:.+/");

    /* renamed from: f  reason: collision with root package name */
    private static c f52391f;

    /* renamed from: a  reason: collision with root package name */
    private Promise f52392a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f52393b;

    /* renamed from: c  reason: collision with root package name */
    private Activity f52394c;

    /* renamed from: d  reason: collision with root package name */
    private androidx.browser.customtabs.c f52395d;

    /* loaded from: classes2.dex */
    class a extends e {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f52396a;

        a(Context context) {
            this.f52396a = context;
        }

        @Override // androidx.browser.customtabs.e
        public void onCustomTabsServiceConnected(ComponentName componentName, androidx.browser.customtabs.c cVar) {
            c.this.f52395d = cVar;
            if (!c.this.f52395d.g(0L)) {
                System.err.println("Couldn't warmup custom tabs client");
            }
            this.f52396a.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            c.this.f52395d = null;
        }
    }

    /* loaded from: classes2.dex */
    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f52398a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f52398a = iArr;
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    private String e(Context context) {
        List<ResolveInfo> g11 = g(context);
        String c11 = androidx.browser.customtabs.c.c(context, Arrays.asList("com.android.chrome", "com.chrome.beta", "com.chrome.dev", "com.google.android.apps.chrome"));
        return (c11 != null || g11 == null || g11.size() <= 0) ? c11 : g11.get(0).serviceInfo.packageName;
    }

    public static c f() {
        if (f52391f == null) {
            f52391f = new c();
        }
        return f52391f;
    }

    private List<ResolveInfo> g(Context context) {
        return context.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
    }

    private void l() {
        if (y70.c.c().j(this)) {
            return;
        }
        y70.c.c().p(this);
    }

    private int m(Context context, String str) {
        if (f52390e.matcher(str).find()) {
            return context.getResources().getIdentifier(str, null, null);
        }
        return context.getResources().getIdentifier(str, "anim", context.getPackageName());
    }

    private Boolean o(int i11) {
        return Boolean.valueOf(m3.a.d(i11) > 0.5d);
    }

    private void p() {
        if (y70.c.c().j(this)) {
            y70.c.c().r(this);
        }
    }

    void c(Context context, d.a aVar, ReadableMap readableMap) {
        int m11 = readableMap.hasKey("startEnter") ? m(context, readableMap.getString("startEnter")) : -1;
        int m12 = readableMap.hasKey("startExit") ? m(context, readableMap.getString("startExit")) : -1;
        int m13 = readableMap.hasKey("endEnter") ? m(context, readableMap.getString("endEnter")) : -1;
        int m14 = readableMap.hasKey("endExit") ? m(context, readableMap.getString("endExit")) : -1;
        if (m11 != -1 && m12 != -1) {
            aVar.j(context, m11, m12);
        }
        if (m13 == -1 || m14 == -1) {
            return;
        }
        aVar.e(context, m13, m14);
    }

    public void d() {
        Promise promise = this.f52392a;
        if (promise == null) {
            return;
        }
        if (this.f52394c == null) {
            promise.reject("InAppBrowser", "No activity");
            this.f52392a = null;
            return;
        }
        p();
        WritableMap createMap = Arguments.createMap();
        createMap.putString("type", "dismiss");
        this.f52392a.resolve(createMap);
        this.f52392a = null;
        Activity activity = this.f52394c;
        activity.startActivity(ChromeTabsManagerActivity.b(activity));
    }

    public void h(Context context, Promise promise) {
        List<ResolveInfo> g11 = g(context);
        promise.resolve(Boolean.valueOf((g11 == null || g11.isEmpty()) ? false : true));
    }

    public void i(String str, ReadableArray readableArray) {
        f e11;
        androidx.browser.customtabs.c cVar = this.f52395d;
        if (cVar == null || (e11 = cVar.e(new androidx.browser.customtabs.b())) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList(readableArray.size());
        for (int i11 = 0; i11 < readableArray.size(); i11++) {
            String string = readableArray.getString(i11);
            if (string != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.otherurls.URL", Uri.parse(string));
                arrayList.add(bundle);
            }
        }
        e11.c(Uri.parse(str), null, arrayList);
    }

    public void j(Activity activity) {
        Context applicationContext = activity.getApplicationContext();
        a aVar = new a(applicationContext);
        String e11 = e(applicationContext);
        if (e11 != null) {
            androidx.browser.customtabs.c.a(applicationContext, e11, aVar);
        } else {
            System.err.println("No browser supported to bind custom tab service");
        }
    }

    public void k(Context context, ReadableMap readableMap, Promise promise, Activity activity) {
        ReadableMap map;
        String string = readableMap.getString("url");
        this.f52394c = activity;
        if (this.f52392a != null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", "cancel");
            this.f52392a.resolve(createMap);
            this.f52392a = null;
            return;
        }
        this.f52392a = promise;
        if (activity == null) {
            promise.reject("InAppBrowser", "No activity");
            this.f52392a = null;
            return;
        }
        d.a aVar = new d.a();
        this.f52393b = Boolean.FALSE;
        Integer n11 = n(aVar, readableMap, "toolbarColor", "setToolbarColor", "toolbar");
        if (n11 != null) {
            this.f52393b = o(n11.intValue());
        }
        n(aVar, readableMap, "secondaryToolbarColor", "setSecondaryToolbarColor", "secondary toolbar");
        n(aVar, readableMap, "navigationBarColor", "setNavigationBarColor", "navigation bar");
        n(aVar, readableMap, "navigationBarDividerColor", "setNavigationBarDividerColor", "navigation bar divider");
        if (readableMap.hasKey("enableDefaultShare") && readableMap.getBoolean("enableDefaultShare")) {
            aVar.a();
        }
        if (readableMap.hasKey("animations")) {
            c(context, aVar, readableMap.getMap("animations"));
        }
        if (readableMap.hasKey("hasBackButton") && readableMap.getBoolean("hasBackButton")) {
            aVar.c(BitmapFactory.decodeResource(context.getResources(), this.f52393b.booleanValue() ? tq.b.ic_arrow_back_black : tq.b.ic_arrow_back_white));
        }
        androidx.browser.customtabs.d b11 = aVar.b();
        Intent intent = b11.f2065a;
        boolean z11 = true;
        if (readableMap.hasKey("headers") && (map = readableMap.getMap("headers")) != null) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            if (keySetIterator.hasNextKey()) {
                Bundle bundle = new Bundle();
                while (keySetIterator.hasNextKey()) {
                    String nextKey = keySetIterator.nextKey();
                    if (b.f52398a[map.getType(nextKey).ordinal()] == 1) {
                        bundle.putString(nextKey, map.getString(nextKey));
                    }
                }
                intent.putExtra("com.android.browser.headers", bundle);
            }
        }
        if (readableMap.hasKey("forceCloseOnRedirection") && readableMap.getBoolean("forceCloseOnRedirection")) {
            intent.addFlags(268435456);
        }
        if (!readableMap.hasKey("showInRecents") || !readableMap.getBoolean("showInRecents")) {
            intent.addFlags(8388608);
            intent.addFlags(1073741824);
        }
        if (!readableMap.hasKey("enableUrlBarHiding") || !readableMap.getBoolean("enableUrlBarHiding")) {
            z11 = false;
        }
        intent.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", z11);
        try {
            if (readableMap.hasKey("browserPackage")) {
                String string2 = readableMap.getString("browserPackage");
                if (!TextUtils.isEmpty(string2)) {
                    intent.setPackage(string2);
                }
            } else {
                intent.setPackage(e(this.f52394c));
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        l();
        intent.setData(Uri.parse(string));
        if (readableMap.hasKey("showTitle")) {
            aVar.i(readableMap.getBoolean("showTitle"));
        } else {
            intent.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", 0);
        }
        if (Build.VERSION.SDK_INT >= 17 && readableMap.hasKey("includeReferrer") && readableMap.getBoolean("includeReferrer")) {
            intent.putExtra("android.intent.extra.REFERRER", Uri.parse("android-app://" + context.getApplicationContext().getPackageName()));
        }
        Activity activity2 = this.f52394c;
        activity2.startActivity(ChromeTabsManagerActivity.c(activity2, intent), b11.f2066b);
    }

    public Integer n(d.a aVar, ReadableMap readableMap, String str, String str2, String str3) {
        String str4;
        Integer num = null;
        try {
            try {
                if (readableMap.hasKey(str)) {
                    str4 = readableMap.getString(str);
                    try {
                        num = Integer.valueOf(Color.parseColor(str4));
                        aVar.getClass().getDeclaredMethod(str2, Integer.TYPE).invoke(aVar, num);
                        return num;
                    } catch (Exception e11) {
                        e = e11;
                        if (e instanceof IllegalArgumentException) {
                            throw new JSApplicationIllegalArgumentException("Invalid " + str3 + " color '" + str4 + "': " + e.getMessage());
                        }
                        return num;
                    }
                }
                return null;
            } catch (Exception e12) {
                e = e12;
                str4 = null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    @org.greenrobot.eventbus.a
    public void onEvent(tq.a aVar) {
        p();
        if (this.f52392a == null) {
            return;
        }
        if (aVar.f52389c.booleanValue()) {
            this.f52392a.reject("InAppBrowser", aVar.f52387a);
        } else {
            WritableMap createMap = Arguments.createMap();
            createMap.putString("type", aVar.f52388b);
            createMap.putString("message", aVar.f52387a);
            this.f52392a.resolve(createMap);
        }
        this.f52392a = null;
    }

    public void q(Promise promise) {
        androidx.browser.customtabs.c cVar = this.f52395d;
        if (cVar != null) {
            promise.resolve(Boolean.valueOf(cVar.g(0L)));
        }
        promise.resolve(Boolean.FALSE);
    }
}