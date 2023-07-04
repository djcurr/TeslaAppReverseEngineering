package u9;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.ConditionVariable;
import android.text.TextUtils;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import u9.a;

/* loaded from: classes.dex */
public class b {

    /* loaded from: classes.dex */
    public static class a implements a.InterfaceC1197a<Object, Boolean> {
        @Override // u9.a.InterfaceC1197a
        /* renamed from: b */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* renamed from: u9.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class CallableC1198b implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f53386a;

        public CallableC1198b(Context context) {
            this.f53386a = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            return m8.b.a(this.f53386a);
        }
    }

    /* loaded from: classes.dex */
    public static class c implements a.InterfaceC1197a<Object, Boolean> {
        @Override // u9.a.InterfaceC1197a
        /* renamed from: b */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof NetworkInfo) || obj == null);
        }
    }

    /* loaded from: classes.dex */
    public static class d implements Callable<NetworkInfo> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f53387a;

        public d(Context context) {
            this.f53387a = context;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public NetworkInfo call() {
            return ((ConnectivityManager) this.f53387a.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
        }
    }

    /* loaded from: classes.dex */
    public static class e implements a.InterfaceC1197a<Object, Boolean> {
        @Override // u9.a.InterfaceC1197a
        /* renamed from: b */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* loaded from: classes.dex */
    public static class f implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f53388a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ r9.a f53389b;

        public f(Context context, r9.a aVar) {
            this.f53388a = context;
            this.f53389b = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            try {
                return j9.a.b(this.f53388a);
            } catch (Throwable th2) {
                c9.a.h(this.f53389b, "third", "GetUtdidEx", th2.getClass().getName());
                return "";
            }
        }
    }

    /* loaded from: classes.dex */
    public static class g implements a.InterfaceC1197a<Object, Boolean> {
        @Override // u9.a.InterfaceC1197a
        /* renamed from: b */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    /* loaded from: classes.dex */
    public static class h implements Callable<String> {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f53390a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ String f53391b;

        /* renamed from: c  reason: collision with root package name */
        public final /* synthetic */ Context f53392c;

        /* renamed from: d  reason: collision with root package name */
        public final /* synthetic */ r9.a f53393d;

        /* loaded from: classes.dex */
        public class a implements APSecuritySdk.InitResultListener {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String[] f53394a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ ConditionVariable f53395b;

            public a(h hVar, String[] strArr, ConditionVariable conditionVariable) {
                this.f53394a = strArr;
                this.f53395b = conditionVariable;
            }

            @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
            public void onResult(APSecuritySdk.TokenResult tokenResult) {
                if (tokenResult != null) {
                    this.f53394a[0] = tokenResult.apdidToken;
                }
                this.f53395b.open();
            }
        }

        public h(String str, String str2, Context context, r9.a aVar) {
            this.f53390a = str;
            this.f53391b = str2;
            this.f53392c = context;
            this.f53393d = aVar;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a */
        public String call() {
            HashMap hashMap = new HashMap();
            hashMap.put("tid", this.f53390a);
            hashMap.put("utdid", this.f53391b);
            String[] strArr = {""};
            try {
                APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.f53392c);
                ConditionVariable conditionVariable = new ConditionVariable();
                aPSecuritySdk.initToken(0, hashMap, new a(this, strArr, conditionVariable));
                conditionVariable.block(3000L);
            } catch (Throwable th2) {
                t9.e.d(th2);
                c9.a.h(this.f53393d, "third", "GetApdidEx", th2.getClass().getName());
            }
            if (TextUtils.isEmpty(strArr[0])) {
                c9.a.h(this.f53393d, "third", "GetApdidNull", "missing token");
            }
            return strArr[0];
        }
    }

    public static NetworkInfo a(r9.a aVar, Context context) {
        Context a11 = u9.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (NetworkInfo) u9.a.c(2, 10L, timeUnit, new c(), new d(a11), false, 10L, timeUnit, aVar, false);
    }

    public static String b(r9.a aVar, Context context, String str, String str2) {
        Context a11 = u9.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (String) u9.a.c(4, 10L, timeUnit, new g(), new h(str, str2, a11, aVar), true, 3L, timeUnit, aVar, true);
    }

    public static String c(r9.a aVar, Context context) {
        if (g9.a.d().K()) {
            return (String) u9.a.c(1, 1L, TimeUnit.DAYS, new a(), new CallableC1198b(u9.a.a(context)), true, 200L, TimeUnit.MILLISECONDS, aVar, true);
        }
        return "";
    }

    public static String d(r9.a aVar, Context context) {
        return (String) u9.a.c(3, 1L, TimeUnit.DAYS, new e(), new f(u9.a.a(context), aVar), true, 3L, TimeUnit.SECONDS, aVar, false);
    }
}