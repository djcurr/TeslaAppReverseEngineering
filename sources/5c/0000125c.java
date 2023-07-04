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
public class RNRSAKeychainModule extends ReactContextBaseJavaModule {
    private static final String SHA1withRSA = "SHA1withRSA";
    private static final String SHA256withRSA = "SHA256withRSA";
    private static final String SHA512withRSA = "SHA512withRSA";
    private final ReactApplicationContext reactContext;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9427a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9428b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9429c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f9430d;

        a(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, String str3, Promise promise) {
            this.f9427a = str;
            this.f9428b = str2;
            this.f9429c = str3;
            this.f9430d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9430d.resolve(new j6.c(this.f9427a).y(this.f9428b, this.f9429c));
            } catch (Exception e11) {
                this.f9430d.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9431a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9432b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9433c;

        b(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, Promise promise) {
            this.f9431a = str;
            this.f9432b = str2;
            this.f9433c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9433c.resolve(new j6.c(this.f9431a).A(this.f9432b, RNRSAKeychainModule.SHA512withRSA));
            } catch (Exception e11) {
                this.f9433c.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9434a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9435b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9436c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f9437d;

        c(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, String str3, Promise promise) {
            this.f9434a = str;
            this.f9435b = str2;
            this.f9436c = str3;
            this.f9437d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9437d.resolve(new j6.c(this.f9434a).A(this.f9435b, this.f9436c));
            } catch (Exception e11) {
                this.f9437d.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9438a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9439b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9440c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f9441d;

        d(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, String str3, Promise promise) {
            this.f9438a = str;
            this.f9439b = str2;
            this.f9440c = str3;
            this.f9441d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9441d.resolve(Boolean.valueOf(new j6.c(this.f9438a).B(this.f9439b, this.f9440c, RNRSAKeychainModule.SHA512withRSA)));
            } catch (Exception e11) {
                this.f9441d.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class e implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9442a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9443b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9444c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f9445d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f9446e;

        e(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, String str3, String str4, Promise promise) {
            this.f9442a = str;
            this.f9443b = str2;
            this.f9444c = str3;
            this.f9445d = str4;
            this.f9446e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9446e.resolve(Boolean.valueOf(new j6.c(this.f9442a).B(this.f9443b, this.f9444c, this.f9445d)));
            } catch (Exception e11) {
                this.f9446e.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class f implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9447a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9448b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9449c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f9450d;

        f(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, String str3, Promise promise) {
            this.f9447a = str;
            this.f9448b = str2;
            this.f9449c = str3;
            this.f9450d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9450d.resolve(Boolean.valueOf(new j6.c(this.f9447a).D(this.f9448b, this.f9449c, RNRSAKeychainModule.SHA512withRSA)));
            } catch (Exception e11) {
                this.f9450d.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class g implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9451a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9452b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9453c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f9454d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f9455e;

        g(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, String str3, String str4, Promise promise) {
            this.f9451a = str;
            this.f9452b = str2;
            this.f9453c = str3;
            this.f9454d = str4;
            this.f9455e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9455e.resolve(Boolean.valueOf(new j6.c(this.f9451a).D(this.f9452b, this.f9453c, this.f9454d)));
            } catch (Exception e11) {
                this.f9455e.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class h implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9456a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f9457b;

        h(RNRSAKeychainModule rNRSAKeychainModule, String str, Promise promise) {
            this.f9456a = str;
            this.f9457b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            new WritableNativeMap();
            try {
                String o11 = new j6.c(this.f9456a).o();
                if (o11 != null) {
                    this.f9457b.resolve(o11);
                } else {
                    this.f9457b.reject("Error", "Missing public key for that keyTag");
                }
            } catch (Exception e11) {
                this.f9457b.reject("Error", e11.getMessage());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class i implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9458a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f9459b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f9460c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Promise f9461d;

        i(RNRSAKeychainModule rNRSAKeychainModule, String str, int i11, ReactApplicationContext reactApplicationContext, Promise promise) {
            this.f9458a = str;
            this.f9459b = i11;
            this.f9460c = reactApplicationContext;
            this.f9461d = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                j6.c cVar = new j6.c();
                cVar.j(this.f9458a, this.f9459b, this.f9460c);
                writableNativeMap.putString("public", cVar.o());
                this.f9461d.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e11) {
                this.f9461d.reject("Error", e11.getMessage());
            } catch (Exception e12) {
                this.f9461d.reject("Error", e12.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class j implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9462a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9463b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ String f9464c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f9465d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f9466e;

        j(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, String str3, ReactApplicationContext reactApplicationContext, Promise promise) {
            this.f9462a = str;
            this.f9463b = str2;
            this.f9464c = str3;
            this.f9465d = reactApplicationContext;
            this.f9466e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                j6.c cVar = new j6.c(this.f9462a);
                cVar.k(this.f9463b, this.f9464c, this.f9465d);
                writableNativeMap.putString("csr", cVar.m());
                this.f9466e.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e11) {
                this.f9466e.reject("Error", e11.getMessage());
            } catch (Exception e12) {
                this.f9466e.reject("Error", e12.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class k implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9467a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9468b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f9469c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ ReactApplicationContext f9470d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ Promise f9471e;

        k(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, int i11, ReactApplicationContext reactApplicationContext, Promise promise) {
            this.f9467a = str;
            this.f9468b = str2;
            this.f9469c = i11;
            this.f9470d = reactApplicationContext;
            this.f9471e = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            try {
                j6.c cVar = new j6.c();
                cVar.l(this.f9467a, this.f9468b, this.f9469c, this.f9470d);
                writableNativeMap.putString("csr", cVar.m());
                this.f9471e.resolve(writableNativeMap);
            } catch (NoSuchAlgorithmException e11) {
                this.f9471e.reject("Error", e11.getMessage());
            } catch (Exception e12) {
                this.f9471e.reject("Error", e12.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class l implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9472a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Promise f9473b;

        l(RNRSAKeychainModule rNRSAKeychainModule, String str, Promise promise) {
            this.f9472a = str;
            this.f9473b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                new j6.c(this.f9472a).e();
                this.f9473b.resolve(1);
            } catch (NoSuchAlgorithmException e11) {
                this.f9473b.reject("Error", e11.getMessage());
            } catch (Exception e12) {
                this.f9473b.reject("Error", e12.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class m implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9474a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9475b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9476c;

        m(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, Promise promise) {
            this.f9474a = str;
            this.f9475b = str2;
            this.f9476c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9476c.resolve(new j6.c(this.f9474a).f(this.f9475b));
            } catch (Exception e11) {
                this.f9476c.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class n implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9477a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9478b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9479c;

        n(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, Promise promise) {
            this.f9477a = str;
            this.f9478b = str2;
            this.f9479c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9479c.resolve(new j6.c(this.f9477a).h(this.f9478b));
            } catch (Exception e11) {
                this.f9479c.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class o implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9480a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9481b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9482c;

        o(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, Promise promise) {
            this.f9480a = str;
            this.f9481b = str2;
            this.f9482c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9482c.resolve(new j6.c(this.f9480a).b(this.f9481b));
            } catch (Exception e11) {
                this.f9482c.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class p implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9483a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9484b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9485c;

        p(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, Promise promise) {
            this.f9483a = str;
            this.f9484b = str2;
            this.f9485c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9485c.resolve(new j6.c(this.f9483a).d(this.f9484b));
            } catch (Exception e11) {
                this.f9485c.reject("Error", e11.getMessage());
            }
        }
    }

    /* loaded from: classes.dex */
    class q implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f9486a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f9487b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Promise f9488c;

        q(RNRSAKeychainModule rNRSAKeychainModule, String str, String str2, Promise promise) {
            this.f9486a = str;
            this.f9487b = str2;
            this.f9488c = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f9488c.resolve(new j6.c(this.f9486a).y(this.f9487b, RNRSAKeychainModule.SHA512withRSA));
            } catch (Exception e11) {
                this.f9488c.reject("Error", e11.getMessage());
            }
        }
    }

    public RNRSAKeychainModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.reactContext = reactApplicationContext;
    }

    @ReactMethod
    public void decrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new o(this, str2, str, promise));
    }

    @ReactMethod
    public void decrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new p(this, str2, str, promise));
    }

    @ReactMethod
    public void deletePrivateKey(String str, Promise promise) {
        AsyncTask.execute(new l(this, str, promise));
    }

    @ReactMethod
    public void encrypt(String str, String str2, Promise promise) {
        AsyncTask.execute(new m(this, str2, str, promise));
    }

    @ReactMethod
    public void encrypt64(String str, String str2, Promise promise) {
        AsyncTask.execute(new n(this, str2, str, promise));
    }

    @ReactMethod
    public void generate(String str, Promise promise) {
        generateKeys(str, 2048, promise);
    }

    @ReactMethod
    public void generateCSR(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new j(this, str, str2, str3, this.reactContext, promise));
    }

    @ReactMethod
    public void generateCSRWithEC(String str, String str2, int i11, Promise promise) {
        AsyncTask.execute(new k(this, str, str2, i11, this.reactContext, promise));
    }

    @ReactMethod
    public void generateKeys(String str, int i11, Promise promise) {
        AsyncTask.execute(new i(this, str, i11, this.reactContext, promise));
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(SHA256withRSA, SHA256withRSA);
        hashMap.put(SHA512withRSA, SHA512withRSA);
        hashMap.put(SHA1withRSA, SHA1withRSA);
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNRSAKeychain";
    }

    @ReactMethod
    public void getPublicKey(String str, Promise promise) {
        AsyncTask.execute(new h(this, str, promise));
    }

    @ReactMethod
    public void sign(String str, String str2, Promise promise) {
        AsyncTask.execute(new q(this, str2, str, promise));
    }

    @ReactMethod
    public void sign64(String str, String str2, Promise promise) {
        AsyncTask.execute(new b(this, str2, str, promise));
    }

    @ReactMethod
    public void sign64WithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new c(this, str2, str, str3, promise));
    }

    @ReactMethod
    public void signWithAlgorithm(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new a(this, str2, str, str3, promise));
    }

    @ReactMethod
    public void verify(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new d(this, str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64(String str, String str2, String str3, Promise promise) {
        AsyncTask.execute(new f(this, str3, str, str2, promise));
    }

    @ReactMethod
    public void verify64WithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new g(this, str3, str, str2, str4, promise));
    }

    @ReactMethod
    public void verifyWithAlgorithm(String str, String str2, String str3, String str4, Promise promise) {
        AsyncTask.execute(new e(this, str3, str, str2, str4, promise));
    }
}