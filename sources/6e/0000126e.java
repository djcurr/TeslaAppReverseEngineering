package com.RNRSA;

import android.os.AsyncTask;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class RNRSAModule extends ReactContextBaseJavaModule {
    private static final String SHA256withRSA = "SHA256withRSA";
    private static final String SHA512withRSA = "SHA512withRSA";
    private final ReactApplicationContext reactContext;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9489a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9490b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9491c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f9492d;

        a(RNRSAModule rNRSAModule, String str, String str2, String str3, Promise promise) {
            this.f9489a = str;
            this.f9490b = str2;
            this.f9491c = str3;
            this.f9492d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.w(this.f9489a);
                this.f9492d.resolve(Boolean.valueOf(cVar.B(this.f9490b, this.f9491c, RNRSAModule.SHA512withRSA)));
            } catch (Exception e11) {
                this.f9492d.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9493a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9494b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9495c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f9496d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f9497e;

        b(RNRSAModule rNRSAModule, String str, String str2, String str3, String str4, Promise promise) {
            this.f9493a = str;
            this.f9494b = str2;
            this.f9495c = str3;
            this.f9496d = str4;
            this.f9497e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.w(this.f9493a);
                this.f9497e.resolve(Boolean.valueOf(cVar.B(this.f9494b, this.f9495c, this.f9496d)));
            } catch (Exception e11) {
                this.f9497e.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9498a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9499b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9500c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f9501d;

        c(RNRSAModule rNRSAModule, String str, String str2, String str3, Promise promise) {
            this.f9498a = str;
            this.f9499b = str2;
            this.f9500c = str3;
            this.f9501d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.w(this.f9498a);
                this.f9501d.resolve(Boolean.valueOf(cVar.D(this.f9499b, this.f9500c, RNRSAModule.SHA512withRSA)));
            } catch (Exception e11) {
                this.f9501d.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9502a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9503b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9504c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f9505d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f9506e;

        d(RNRSAModule rNRSAModule, String str, String str2, String str3, String str4, Promise promise) {
            this.f9502a = str;
            this.f9503b = str2;
            this.f9504c = str3;
            this.f9505d = str4;
            this.f9506e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.w(this.f9502a);
                this.f9506e.resolve(Boolean.valueOf(cVar.D(this.f9503b, this.f9504c, this.f9505d)));
            } catch (Exception e11) {
                this.f9506e.reject("Error", e11.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f9507a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f9508b;

        e(RNRSAModule rNRSAModule, int i11, Promise promise) {
            this.f9507a = i11;
            this.f9508b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                j6.c cVar = new j6.c();
                cVar.i(this.f9507a);
                writableNativeMap.putString("public", cVar.o());
                writableNativeMap.putString("private", cVar.n());
                this.f9508b.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e11) {
                this.f9508b.reject("Error", e11.getMessage());
            } catch (Exception e12) {
                this.f9508b.reject("Error", e12.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9509a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9510b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9511c;

        f(RNRSAModule rNRSAModule, String str, String str2, Promise promise) {
            this.f9509a = str;
            this.f9510b = str2;
            this.f9511c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.w(this.f9509a);
                this.f9511c.resolve(cVar.f(this.f9510b));
            } catch (Exception e11) {
                this.f9511c.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9512a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9513b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9514c;

        g(RNRSAModule rNRSAModule, String str, String str2, Promise promise) {
            this.f9512a = str;
            this.f9513b = str2;
            this.f9514c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.w(this.f9512a);
                this.f9514c.resolve(cVar.h(this.f9513b));
            } catch (Exception e11) {
                this.f9514c.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9515a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9516b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9517c;

        h(RNRSAModule rNRSAModule, String str, String str2, Promise promise) {
            this.f9515a = str;
            this.f9516b = str2;
            this.f9517c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.v(this.f9515a);
                this.f9517c.resolve(cVar.b(this.f9516b));
            } catch (Exception e11) {
                this.f9517c.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9518a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9519b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9520c;

        i(RNRSAModule rNRSAModule, String str, String str2, Promise promise) {
            this.f9518a = str;
            this.f9519b = str2;
            this.f9520c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.v(this.f9518a);
                this.f9520c.resolve(cVar.d(this.f9519b));
            } catch (Exception e11) {
                this.f9520c.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9521a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9522b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9523c;

        j(RNRSAModule rNRSAModule, String str, String str2, Promise promise) {
            this.f9521a = str;
            this.f9522b = str2;
            this.f9523c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.v(this.f9521a);
                this.f9523c.resolve(cVar.y(this.f9522b, RNRSAModule.SHA512withRSA));
            } catch (Exception e11) {
                this.f9523c.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9524a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9525b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9526c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f9527d;

        k(RNRSAModule rNRSAModule, String str, String str2, String str3, Promise promise) {
            this.f9524a = str;
            this.f9525b = str2;
            this.f9526c = str3;
            this.f9527d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.v(this.f9524a);
                this.f9527d.resolve(cVar.y(this.f9525b, this.f9526c));
            } catch (Exception e11) {
                this.f9527d.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9528a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9529b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9530c;

        l(RNRSAModule rNRSAModule, String str, String str2, Promise promise) {
            this.f9528a = str;
            this.f9529b = str2;
            this.f9530c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.v(this.f9528a);
                this.f9530c.resolve(cVar.A(this.f9529b, RNRSAModule.SHA512withRSA));
            } catch (Exception e11) {
                this.f9530c.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9531a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9532b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9533c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f9534d;

        m(RNRSAModule rNRSAModule, String str, String str2, String str3, Promise promise) {
            this.f9531a = str;
            this.f9532b = str2;
            this.f9533c = str3;
            this.f9534d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j6.c cVar = new j6.c();
                cVar.v(this.f9531a);
                this.f9534d.resolve(cVar.A(this.f9532b, this.f9533c));
            } catch (Exception e11) {
                this.f9534d.reject("Error", e11.getMessage());
            }
        }
    }

    public RNRSAModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void decrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new h(this, str2, str, promise));
    }

    @ReactMethod
    public void decrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new i(this, str2, str, promise));
    }

    @ReactMethod
    public void encrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new f(this, str2, str, promise));
    }

    @ReactMethod
    public void encrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new g(this, str2, str, promise));
    }

    @ReactMethod
    public void generate(Promise promise) {
        generateKeys(2048, promise);
    }

    @ReactMethod
    public void generateKeys(int i11, Promise promise) {
        AsyncTask.execute(new e(this, i11, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(SHA256withRSA, SHA256withRSA);
        hashMap.put(SHA512withRSA, SHA512withRSA);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNRSA";
    }

    @ReactMethod
    public void sign(String str, String str2, Promise promise) {
        AsyncTask.execute(new j(this, str2, str, promise));
    }

    @ReactMethod
    public void sign64(String str, String str2, Promise promise) {
        AsyncTask.execute(new l(this, str2, str, promise));
    }

    @ReactMethod
    public void sign64WithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new m(this, str2, str, str3, promise));
    }

    @ReactMethod
    public void signWithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new k(this, str2, str, str3, promise));
    }

    @ReactMethod
    public void verify(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new a(this, str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new c(this, str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64WithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new d(this, str3, str, str2, str4, promise));
    }

    @ReactMethod
    public void verifyWithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new b(this, str3, str, str2, str4, promise));
    }
}