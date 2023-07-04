package androidx.browser.customtabs;

import a.a;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final a.b f2045a;

    /* renamed from: b  reason: collision with root package name */
    private final ComponentName f2046b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends a.AbstractBinderC0001a {

        /* renamed from: a  reason: collision with root package name */
        private Handler f2047a = new Handler(Looper.getMainLooper());

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.browser.customtabs.b f2048b;

        /* renamed from: androidx.browser.customtabs.c$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0041a implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f2049a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f2050b;

            RunnableC0041a(int i11, Bundle bundle) {
                this.f2049a = i11;
                this.f2050b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2048b.d(this.f2049a, this.f2050b);
            }
        }

        /* loaded from: classes.dex */
        class b implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f2052a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f2053b;

            b(String str, Bundle bundle) {
                this.f2052a = str;
                this.f2053b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2048b.a(this.f2052a, this.f2053b);
            }
        }

        /* renamed from: androidx.browser.customtabs.c$a$c  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        class RunnableC0042c implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ Bundle f2055a;

            RunnableC0042c(Bundle bundle) {
                this.f2055a = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2048b.c(this.f2055a);
            }
        }

        /* loaded from: classes.dex */
        class d implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ String f2057a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Bundle f2058b;

            d(String str, Bundle bundle) {
                this.f2057a = str;
                this.f2058b = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2048b.e(this.f2057a, this.f2058b);
            }
        }

        /* loaded from: classes.dex */
        class e implements Runnable {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ int f2060a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ Uri f2061b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ boolean f2062c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ Bundle f2063d;

            e(int i11, Uri uri, boolean z11, Bundle bundle) {
                this.f2060a = i11;
                this.f2061b = uri;
                this.f2062c = z11;
                this.f2063d = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.f2048b.f(this.f2060a, this.f2061b, this.f2062c, this.f2063d);
            }
        }

        a(c cVar, androidx.browser.customtabs.b bVar) {
            this.f2048b = bVar;
        }

        @Override // a.a
        public void C(int i11, Bundle bundle) {
            if (this.f2048b == null) {
                return;
            }
            this.f2047a.post(new RunnableC0041a(i11, bundle));
        }

        @Override // a.a
        public void D(String str, Bundle bundle) {
            if (this.f2048b == null) {
                return;
            }
            this.f2047a.post(new d(str, bundle));
        }

        @Override // a.a
        public void E(Bundle bundle) {
            if (this.f2048b == null) {
                return;
            }
            this.f2047a.post(new RunnableC0042c(bundle));
        }

        @Override // a.a
        public void G(int i11, Uri uri, boolean z11, Bundle bundle) {
            if (this.f2048b == null) {
                return;
            }
            this.f2047a.post(new e(i11, uri, z11, bundle));
        }

        @Override // a.a
        public Bundle c(String str, Bundle bundle) {
            androidx.browser.customtabs.b bVar = this.f2048b;
            if (bVar == null) {
                return null;
            }
            return bVar.b(str, bundle);
        }

        @Override // a.a
        public void e(String str, Bundle bundle) {
            if (this.f2048b == null) {
                return;
            }
            this.f2047a.post(new b(str, bundle));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a.b bVar, ComponentName componentName, Context context) {
        this.f2045a = bVar;
        this.f2046b = componentName;
    }

    public static boolean a(Context context, String str, e eVar) {
        eVar.setApplicationContext(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty(str)) {
            intent.setPackage(str);
        }
        return context.bindService(intent, eVar, 33);
    }

    private a.AbstractBinderC0001a b(b bVar) {
        return new a(this, bVar);
    }

    public static String c(Context context, List<String> list) {
        return d(context, list, false);
    }

    public static String d(Context context, List<String> list, boolean z11) {
        ResolveInfo resolveActivity;
        PackageManager packageManager = context.getPackageManager();
        ArrayList arrayList = list == null ? new ArrayList() : list;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://"));
        if (!z11 && (resolveActivity = packageManager.resolveActivity(intent, 0)) != null) {
            String str = resolveActivity.activityInfo.packageName;
            ArrayList arrayList2 = new ArrayList(arrayList.size() + 1);
            arrayList2.add(str);
            if (list != null) {
                arrayList2.addAll(list);
            }
            arrayList = arrayList2;
        }
        Intent intent2 = new Intent("android.support.customtabs.action.CustomTabsService");
        for (String str2 : arrayList) {
            intent2.setPackage(str2);
            if (packageManager.resolveService(intent2, 0) != null) {
                return str2;
            }
        }
        if (Build.VERSION.SDK_INT >= 30) {
            Log.w("CustomTabsClient", "Unable to find any Custom Tabs packages, you may need to add a <queries> element to your manifest. See the docs for CustomTabsClient#getPackageName.");
            return null;
        }
        return null;
    }

    private f f(b bVar, PendingIntent pendingIntent) {
        boolean v11;
        a.AbstractBinderC0001a b11 = b(bVar);
        try {
            if (pendingIntent != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
                v11 = this.f2045a.y(b11, bundle);
            } else {
                v11 = this.f2045a.v(b11);
            }
            if (v11) {
                return new f(this.f2045a, b11, this.f2046b, pendingIntent);
            }
            return null;
        } catch (RemoteException unused) {
            return null;
        }
    }

    public f e(b bVar) {
        return f(bVar, null);
    }

    public boolean g(long j11) {
        try {
            return this.f2045a.x(j11);
        } catch (RemoteException unused) {
            return false;
        }
    }
}