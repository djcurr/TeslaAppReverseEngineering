package z8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.text.TextUtils;
import android.util.Log;
import com.stripe.android.model.PaymentMethodOptionsParams;

/* loaded from: classes.dex */
public class f {

    /* renamed from: g  reason: collision with root package name */
    public static volatile f f60383g = null;

    /* renamed from: h  reason: collision with root package name */
    public static boolean f60384h = false;

    /* renamed from: f  reason: collision with root package name */
    public BroadcastReceiver f60390f;

    /* renamed from: a  reason: collision with root package name */
    public a f60385a = new a("udid");

    /* renamed from: b  reason: collision with root package name */
    public a f60386b = new a("oaid");

    /* renamed from: d  reason: collision with root package name */
    public a f60388d = new a("vaid");

    /* renamed from: c  reason: collision with root package name */
    public a f60387c = new a("aaid");

    /* renamed from: e  reason: collision with root package name */
    public c f60389e = new c();

    public static String b(PackageManager packageManager, String str) {
        ProviderInfo resolveContentProvider;
        if (packageManager == null || (resolveContentProvider = packageManager.resolveContentProvider(str, 0)) == null || (resolveContentProvider.applicationInfo.flags & 1) == 0) {
            return null;
        }
        return resolveContentProvider.packageName;
    }

    public static d c(Cursor cursor) {
        String str;
        d dVar = new d(null, 0);
        if (cursor == null) {
            str = "parseValue fail, cursor is null.";
        } else if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("value");
            if (columnIndex >= 0) {
                dVar.f60380a = cursor.getString(columnIndex);
            } else {
                e("parseValue fail, index < 0.");
            }
            int columnIndex2 = cursor.getColumnIndex(PaymentMethodOptionsParams.Blik.PARAM_CODE);
            if (columnIndex2 >= 0) {
                dVar.f60381b = cursor.getInt(columnIndex2);
            } else {
                e("parseCode fail, index < 0.");
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                dVar.f60382c = cursor.getLong(columnIndex3);
            } else {
                e("parseExpired fail, index < 0.");
            }
            return dVar;
        } else {
            str = "parseValue fail, cursor is closed.";
        }
        e(str);
        return dVar;
    }

    public static final f d() {
        if (f60383g == null) {
            synchronized (f.class) {
                if (f60383g == null) {
                    f60383g = new f();
                }
            }
        }
        return f60383g;
    }

    public static void e(String str) {
        if (f60384h) {
            Log.d("OpenIdManager", str);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        if (r7 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        if (r7 == null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
        r7.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0032, code lost:
        if ("0".equals(r8.f60380a) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean f(android.content.Context r8) {
        /*
            java.lang.String r0 = "querySupport version : 1.0.8"
            e(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            r7 = 0
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r3 = 0
            r4 = 0
            java.lang.String r8 = "supported"
            java.lang.String[] r5 = new java.lang.String[]{r8}     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r6 = 0
            android.database.Cursor r7 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            if (r7 == 0) goto L39
            z8.d r8 = c(r7)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r8.f60381b     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            if (r1 != r2) goto L34
            java.lang.String r1 = "0"
            java.lang.String r8 = r8.f60380a     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            boolean r8 = r1.equals(r8)     // Catch: java.lang.Throwable -> L3c java.lang.Exception -> L3e
            if (r8 == 0) goto L35
        L34:
            r0 = 1
        L35:
            r7.close()
            return r0
        L39:
            if (r7 == 0) goto L59
            goto L56
        L3c:
            r8 = move-exception
            goto L5a
        L3e:
            r8 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3c
            java.lang.String r2 = "querySupport, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L3c
            r1.append(r8)     // Catch: java.lang.Throwable -> L3c
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L3c
            e(r8)     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L59
        L56:
            r7.close()
        L59:
            return r0
        L5a:
            if (r7 == 0) goto L5f
            r7.close()
        L5f:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.f.f(android.content.Context):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String h(android.content.Context r10, z8.a r11) {
        /*
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "queryId : "
            r0.<init>(r1)
            java.lang.String r1 = r11.f60375c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            e(r0)
            java.lang.String r0 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r2 = android.net.Uri.parse(r0)
            r0 = 0
            android.content.ContentResolver r1 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9b
            r3 = 0
            r4 = 0
            r7 = 1
            java.lang.String[] r5 = new java.lang.String[r7]     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9b
            java.lang.String r6 = r11.f60375c     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9b
            r8 = 0
            r5[r8] = r6     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9b
            r6 = 0
            android.database.Cursor r1 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L99 java.lang.Exception -> L9b
            if (r1 == 0) goto L7b
            z8.d r2 = c(r1)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r0 = r2.f60380a     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r11.c(r0)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            long r3 = r2.f60382c     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r11.b(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            int r3 = r2.f60381b     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r11.a(r3)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r3.<init>()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r4 = r11.f60375c     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r3.append(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r4 = " errorCode : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            int r11 = r11.f60376d     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r3.append(r11)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            e(r11)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            int r11 = r2.f60381b     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r11 == r2) goto L8f
            r9.j(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            boolean r11 = r9.g(r10, r8)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r11 != 0) goto L8f
            boolean r10 = r9.g(r10, r7)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r11 = "not support, forceQuery isSupported: "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
        L76:
            java.lang.String r10 = r11.concat(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            goto L8c
        L7b:
            boolean r11 = r9.g(r10, r8)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            if (r11 == 0) goto L8f
            boolean r10 = r9.g(r10, r7)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            java.lang.String r11 = "forceQuery isSupported : "
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
            goto L76
        L8c:
            e(r10)     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
        L8f:
            if (r1 == 0) goto Lbb
            goto Lb6
        L92:
            r10 = move-exception
            r0 = r1
            goto Lbc
        L95:
            r10 = move-exception
            r11 = r0
            r0 = r1
            goto L9d
        L99:
            r10 = move-exception
            goto Lbc
        L9b:
            r10 = move-exception
            r11 = r0
        L9d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L99
            java.lang.String r2 = "queryId, Exception : "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L99
            java.lang.String r10 = r10.getMessage()     // Catch: java.lang.Throwable -> L99
            r1.append(r10)     // Catch: java.lang.Throwable -> L99
            java.lang.String r10 = r1.toString()     // Catch: java.lang.Throwable -> L99
            e(r10)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto Lba
            r1 = r0
            r0 = r11
        Lb6:
            r1.close()
            goto Lbb
        Lba:
            r0 = r11
        Lbb:
            return r0
        Lbc:
            if (r0 == 0) goto Lc1
            r0.close()
        Lc1:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z8.f.h(android.content.Context, z8.a):java.lang.String");
    }

    public static String i(PackageManager packageManager, String str) {
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo != null) {
                return packageInfo.versionName;
            }
            return null;
        } catch (Exception e11) {
            e11.printStackTrace();
            e("getAppVersion, Exception : " + e11.getMessage());
            return null;
        }
    }

    private synchronized void j(Context context) {
        if (this.f60390f != null) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
        e eVar = new e();
        this.f60390f = eVar;
        context.registerReceiver(eVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
    }

    public final String a(Context context, a aVar) {
        String str;
        if (aVar == null) {
            str = "getId, openId = null.";
        } else if (aVar.d()) {
            return aVar.f60374b;
        } else {
            if (g(context, true)) {
                return h(context, aVar);
            }
            str = "getId, isSupported = false.";
        }
        e(str);
        return null;
    }

    public final boolean g(Context context, boolean z11) {
        if (!this.f60389e.b() || z11) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return false;
            }
            String b11 = b(packageManager, "com.meizu.flyme.openidsdk");
            if (TextUtils.isEmpty(b11)) {
                return false;
            }
            String i11 = i(packageManager, b11);
            if (this.f60389e.b() && this.f60389e.c(i11)) {
                e("use same version cache, safeVersion : ".concat(String.valueOf(i11)));
                return this.f60389e.e();
            }
            this.f60389e.d(i11);
            boolean f11 = f(context);
            e("query support, result : ".concat(String.valueOf(f11)));
            this.f60389e.a(f11);
            return f11;
        }
        return this.f60389e.e();
    }
}