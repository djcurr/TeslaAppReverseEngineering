package com.reactnativestripesdk.pushprovisioning;

import android.app.Activity;
import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import expo.modules.interfaces.permissions.PermissionsResponse;
import h00.q;
import java.util.List;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a */
    public static final h f20359a = new h();

    /* renamed from: b */
    private static Object f20360b;

    private h() {
    }

    public static /* synthetic */ void a(String str, q qVar, Task task) {
        c(str, qVar, task);
    }

    public static final void c(String newCardLastFour, q callback, Task task) {
        s.g(newCardLastFour, "$newCardLastFour");
        s.g(callback, "$callback");
        s.g(task, "task");
        if (task.isSuccessful()) {
            for (Object obj : (List) task.getResult()) {
                h hVar = f20359a;
                if (hVar.e(obj, newCardLastFour)) {
                    callback.invoke(Boolean.TRUE, hVar.f(obj), null);
                    return;
                }
            }
        } else {
            Log.e("StripeTapAndPay", "Unable to fetch existing tokens from Google TapAndPay.");
        }
        callback.invoke(Boolean.FALSE, null, null);
    }

    private final Task<List<Object>> d(Activity activity) {
        try {
            Object invoke = Class.forName("com.google.android.gms.tapandpay.TapAndPayClient").getMethod("listTokens", new Class[0]).invoke(Class.forName("com.google.android.gms.tapandpay.TapAndPay").getMethod("getClient", Activity.class).invoke(null, activity), new Object[0]);
            if (invoke != null) {
                return (Task) invoke;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.google.android.gms.tasks.Task<kotlin.collections.List<kotlin.Any>>");
        } catch (Exception unused) {
            Log.e("StripeTapAndPay", "Google TapAndPay dependency not found");
            return null;
        }
    }

    private final WritableMap f(Object obj) {
        Class<?> cls;
        Object invoke;
        if (obj == null) {
            return null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        try {
            cls = Class.forName("com.google.android.gms.tapandpay.issuer.TokenInfo");
            invoke = cls.getMethod("getIssuerTokenId", new Class[0]).invoke(obj, new Object[0]);
        } catch (Exception unused) {
            Log.e("StripeTapAndPay", "There was a problem finding the class com.google.android.gms.tapandpay.issuer.TokenInfo. Make sure you've included Google's TapAndPay dependency.");
        }
        if (invoke != null) {
            writableNativeMap.putString("id", (String) invoke);
            Object invoke2 = cls.getMethod("getFpanLastFour", new Class[0]).invoke(obj, new Object[0]);
            if (invoke2 != null) {
                writableNativeMap.putString("cardLastFour", (String) invoke2);
                Object invoke3 = cls.getMethod("getIssuerName", new Class[0]).invoke(obj, new Object[0]);
                if (invoke3 != null) {
                    writableNativeMap.putString("issuer", (String) invoke3);
                    Object invoke4 = cls.getMethod("getTokenState", new Class[0]).invoke(obj, new Object[0]);
                    if (invoke4 != null) {
                        writableNativeMap.putString(PermissionsResponse.STATUS_KEY, g(((Integer) invoke4).intValue()));
                        Object invoke5 = cls.getMethod("getNetwork", new Class[0]).invoke(obj, new Object[0]);
                        if (invoke5 != null) {
                            writableNativeMap.putInt("network", ((Integer) invoke5).intValue());
                            Object invoke6 = cls.getMethod("getTokenServiceProvider", new Class[0]).invoke(obj, new Object[0]);
                            if (invoke6 != null) {
                                writableNativeMap.putInt("serviceProvider", ((Integer) invoke6).intValue());
                                return writableNativeMap;
                            }
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
    }

    private final String g(int i11) {
        try {
            Class<?> cls = Class.forName("com.google.android.gms.tapandpay.TapAndPay");
            Object obj = cls.getField("TOKEN_STATE_NEEDS_IDENTITY_VERIFICATION").get(cls);
            if ((obj instanceof Integer) && i11 == ((Number) obj).intValue()) {
                return "TOKEN_STATE_NEEDS_IDENTITY_VERIFICATION";
            }
            Object obj2 = cls.getField("TOKEN_STATE_PENDING").get(cls);
            if ((obj2 instanceof Integer) && i11 == ((Number) obj2).intValue()) {
                return "TOKEN_STATE_PENDING";
            }
            Object obj3 = cls.getField("TOKEN_STATE_SUSPENDED").get(cls);
            if ((obj3 instanceof Integer) && i11 == ((Number) obj3).intValue()) {
                return "TOKEN_STATE_SUSPENDED";
            }
            Object obj4 = cls.getField("TOKEN_STATE_ACTIVE").get(cls);
            if ((obj4 instanceof Integer) && i11 == ((Number) obj4).intValue()) {
                return "TOKEN_STATE_ACTIVE";
            }
            Object obj5 = cls.getField("TOKEN_STATE_FELICA_PENDING_PROVISIONING").get(cls);
            if ((obj5 instanceof Integer) && i11 == ((Number) obj5).intValue()) {
                return "TOKEN_STATE_FELICA_PENDING_PROVISIONING";
            }
            Object obj6 = cls.getField("TOKEN_STATE_UNTOKENIZED").get(cls);
            if (obj6 instanceof Integer) {
                if (i11 == ((Number) obj6).intValue()) {
                    return "TOKEN_STATE_UNTOKENIZED";
                }
            }
            return "UNKNOWN";
        } catch (Exception unused) {
            Log.e("StripeTapAndPay", "There was a problem finding Google's TapAndPay dependency.");
            return "UNKNOWN";
        }
    }

    public final void b(Activity activity, final String newCardLastFour, final q<? super Boolean, ? super WritableMap, ? super WritableMap, b0> callback) {
        s.g(activity, "activity");
        s.g(newCardLastFour, "newCardLastFour");
        s.g(callback, "callback");
        Task<List<Object>> d11 = d(activity);
        if (d11 == null) {
            callback.invoke(Boolean.FALSE, null, hr.a.d("Failed", "Google TapAndPay dependency not found."));
        } else {
            d11.addOnCompleteListener(new OnCompleteListener() { // from class: com.reactnativestripesdk.pushprovisioning.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    h.a(newCardLastFour, callback, task);
                }
            });
        }
    }

    public final boolean e(Object token, String newLastFour) {
        s.g(token, "token");
        s.g(newLastFour, "newLastFour");
        try {
            Object invoke = Class.forName("com.google.android.gms.tapandpay.issuer.TokenInfo").getMethod("getFpanLastFour", new Class[0]).invoke(token, new Object[0]);
            if (invoke != null) {
                return s.c((String) invoke, newLastFour);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        } catch (Exception unused) {
            Log.e("StripeTapAndPay", "There was a problem finding the class com.google.android.gms.tapandpay.issuer.TokenInfo. Make sure you've included Google's TapAndPay dependency.");
            return false;
        }
    }

    public final void h(Activity activity, String tokenReferenceId, ReadableMap token, String cardDescription) {
        s.g(activity, "activity");
        s.g(tokenReferenceId, "tokenReferenceId");
        s.g(token, "token");
        s.g(cardDescription, "cardDescription");
        try {
            Class<?> cls = Class.forName("com.google.android.gms.tapandpay.TapAndPayClient").getClass();
            Class<?> cls2 = Integer.TYPE;
            cls.getMethod("tokenize", Activity.class, String.class, cls2, String.class, cls2, cls2).invoke(f20360b, activity, tokenReferenceId, Integer.valueOf(token.getInt("serviceProvider")), cardDescription, Integer.valueOf(token.getInt("network")), 90909);
        } catch (Exception unused) {
            Log.e("StripeTapAndPay", "Google TapAndPay dependency not found.");
        }
    }
}