package cl.json;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p5.c;
import p5.d;
import p5.e;
import p5.f;
import p5.g;
import p5.h;
import p5.i;
import p5.j;
import p5.k;
import p5.l;
import p5.m;
import p5.o;
import p5.p;
import p5.q;
import p5.r;
import p5.s;
import p5.t;
import p5.u;

/* loaded from: classes.dex */
public class RNShareModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final int SHARE_REQUEST_CODE = 16845;
    private final ReactApplicationContext reactContext;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9276a;

        static {
            int[] iArr = new int[b.values().length];
            f9276a = iArr;
            try {
                iArr[b.generic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9276a[b.facebook.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9276a[b.facebookstories.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9276a[b.pagesmanager.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9276a[b.twitter.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9276a[b.whatsapp.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9276a[b.whatsappbusiness.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9276a[b.instagram.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9276a[b.instagramstories.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9276a[b.googleplus.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9276a[b.email.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9276a[b.pinterest.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9276a[b.sms.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9276a[b.snapchat.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9276a[b.messenger.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9276a[b.linkedin.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9276a[b.telegram.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9276a[b.viber.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* loaded from: classes.dex */
    private enum b {
        facebook,
        facebookstories,
        generic,
        pagesmanager,
        twitter,
        whatsapp,
        whatsappbusiness,
        instagram,
        instagramstories,
        googleplus,
        email,
        pinterest,
        messenger,
        snapchat,
        sms,
        linkedin,
        telegram,
        viber;

        public static m getShareClass(String str, ReactApplicationContext reactApplicationContext) {
            switch (a.f9276a[valueOf(str).ordinal()]) {
                case 1:
                    return new e(reactApplicationContext);
                case 2:
                    return new c(reactApplicationContext);
                case 3:
                    return new d(reactApplicationContext);
                case 4:
                    return new p5.b(reactApplicationContext);
                case 5:
                    return new r(reactApplicationContext);
                case 6:
                    return new u(reactApplicationContext);
                case 7:
                    return new t(reactApplicationContext);
                case 8:
                    return new g(reactApplicationContext);
                case 9:
                    return new h(reactApplicationContext);
                case 10:
                    return new f(reactApplicationContext);
                case 11:
                    return new p5.a(reactApplicationContext);
                case 12:
                    return new k(reactApplicationContext);
                case 13:
                    return new l(reactApplicationContext);
                case 14:
                    return new o(reactApplicationContext);
                case 15:
                    return new j(reactApplicationContext);
                case 16:
                    return new i(reactApplicationContext);
                case 17:
                    return new q(reactApplicationContext);
                case 18:
                    return new s(reactApplicationContext);
                default:
                    return null;
            }
        }
    }

    public RNShareModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        reactApplicationContext.addActivityEventListener(this);
        this.reactContext = reactApplicationContext;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        b[] values;
        HashMap hashMap = new HashMap();
        for (b bVar : b.values()) {
            hashMap.put(bVar.toString().toUpperCase(Locale.ROOT), bVar.toString());
        }
        return hashMap;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNShare";
    }

    @ReactMethod
    public void isBase64File(String str, Callback callback, Callback callback2) {
        try {
            String scheme = Uri.parse(str).getScheme();
            if (scheme == null || !scheme.equals(MessageExtension.FIELD_DATA)) {
                callback2.invoke(Boolean.FALSE);
            } else {
                callback2.invoke(Boolean.TRUE);
            }
        } catch (Exception e11) {
            PrintStream printStream = System.out;
            printStream.println("ERROR " + e11.getMessage());
            e11.printStackTrace(System.out);
            callback.invoke(e11.getMessage());
        }
    }

    @ReactMethod
    public void isPackageInstalled(String str, Callback callback, Callback callback2) {
        try {
            callback2.invoke(Boolean.valueOf(m.l(str, this.reactContext)));
        } catch (Exception e11) {
            PrintStream printStream = System.out;
            printStream.println("Error: " + e11.getMessage());
            callback.invoke(e11.getMessage());
        }
    }

    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == 16845) {
            if (i12 == 0) {
                p.d(true, Boolean.FALSE, "CANCELED");
            } else if (i12 == -1) {
                p.d(true, Boolean.TRUE);
            }
        }
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    @ReactMethod
    public void open(ReadableMap readableMap, Callback callback, Callback callback2) {
        p.c(callback2, callback);
        try {
            new e(this.reactContext).m(readableMap);
        } catch (ActivityNotFoundException e11) {
            PrintStream printStream = System.out;
            printStream.println("ERROR " + e11.getMessage());
            e11.printStackTrace(System.out);
            p.d(false, "not_available");
        } catch (Exception e12) {
            PrintStream printStream2 = System.out;
            printStream2.println("ERROR " + e12.getMessage());
            e12.printStackTrace(System.out);
            p.d(false, e12.getMessage());
        }
    }

    @ReactMethod
    public void shareSingle(ReadableMap readableMap, Callback callback, Callback callback2) {
        System.out.println("SHARE SINGLE METHOD");
        p.c(callback2, callback);
        if (m.k("social", readableMap)) {
            try {
                m shareClass = b.getShareClass(readableMap.getString("social"), this.reactContext);
                if (shareClass != null) {
                    shareClass.m(readableMap);
                    return;
                }
                throw new ActivityNotFoundException("Invalid share activity");
            } catch (ActivityNotFoundException e11) {
                PrintStream printStream = System.out;
                printStream.println("ERROR " + e11.getMessage());
                e11.printStackTrace(System.out);
                p.d(false, e11.getMessage());
                return;
            } catch (Exception e12) {
                PrintStream printStream2 = System.out;
                printStream2.println("ERROR " + e12.getMessage());
                e12.printStackTrace(System.out);
                p.d(false, e12.getMessage());
                return;
            }
        }
        p.d(false, "key 'social' missing in options");
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i11, int i12, Intent intent) {
        onActivityResult(i11, i12, intent);
    }
}