package com.reactnativestripesdk.pushprovisioning;

import android.app.Activity;
import android.nfc.NfcAdapter;
import android.util.Log;
import com.facebook.react.bridge.BaseActivityEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import h00.q;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes2.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f20353a = new f();

    /* renamed from: b  reason: collision with root package name */
    private static String f20354b = "Added by Stripe";

    /* renamed from: c  reason: collision with root package name */
    private static ReadableMap f20355c;

    /* loaded from: classes2.dex */
    public static final class a extends BaseActivityEventListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f20356a;

        a(b bVar) {
            this.f20356a = bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
        @Override // com.facebook.react.bridge.BaseActivityEventListener, com.facebook.react.bridge.ActivityEventListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void onActivityResult(android.app.Activity r10, int r11, int r12, android.content.Intent r13) {
            /*
                r9 = this;
                java.lang.String r0 = "activity"
                kotlin.jvm.internal.s.g(r10, r0)
                super.onActivityResult(r10, r11, r12, r13)
                r0 = 8000(0x1f40, float:1.121E-41)
                r1 = -1
                r2 = 0
                if (r11 == r0) goto L2b
                r10 = 90909(0x1631d, float:1.2739E-40)
                if (r11 == r10) goto L15
                goto L94
            L15:
                com.reactnativestripesdk.pushprovisioning.b r10 = r9.f20356a
                if (r12 != r1) goto L1a
                goto L26
            L1a:
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                java.lang.String r3 = "Failed"
                java.lang.String r4 = "Failed to verify identity."
                com.facebook.react.bridge.WritableMap r2 = hr.a.h(r3, r4, r5, r6, r7, r8)
            L26:
                r10.f(r2)
                goto L94
            L2b:
                if (r12 == r1) goto L54
                r10 = 500(0x1f4, float:7.0E-43)
                if (r12 == r10) goto L32
                goto L94
            L32:
                if (r13 != 0) goto L35
                goto L94
            L35:
                com.reactnativestripesdk.pushprovisioning.b r10 = r9.f20356a
                com.stripe.android.pushProvisioning.PushProvisioningActivityStarter$Error r11 = com.stripe.android.pushProvisioning.PushProvisioningActivityStarter.Error.fromIntent(r13)
                java.lang.String r12 = "fromIntent(data)"
                kotlin.jvm.internal.s.f(r11, r12)
                com.stripe.android.pushProvisioning.PushProvisioningActivity$g r12 = r11.code
                java.lang.String r0 = r12.toString()
                java.lang.String r1 = r11.message
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 0
                com.facebook.react.bridge.WritableMap r11 = hr.a.h(r0, r1, r2, r3, r4, r5)
                r10.f(r11)
                goto L94
            L54:
                com.facebook.react.bridge.ReadableMap r11 = com.reactnativestripesdk.pushprovisioning.f.b()
                if (r11 != 0) goto L5c
                r10 = r2
                goto L8d
            L5c:
                com.reactnativestripesdk.pushprovisioning.b r12 = r9.f20356a
                java.lang.String r13 = "id"
                java.lang.String r13 = r11.getString(r13)
                if (r13 == 0) goto L6f
                boolean r0 = kotlin.text.m.w(r13)
                if (r0 == 0) goto L6d
                goto L6f
            L6d:
                r0 = 0
                goto L70
            L6f:
                r0 = 1
            L70:
                if (r0 == 0) goto L82
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                java.lang.String r3 = "Failed"
                java.lang.String r4 = "Token object passed to `<AddToWalletButton />` is missing the `id` field."
                com.facebook.react.bridge.WritableMap r10 = hr.a.h(r3, r4, r5, r6, r7, r8)
                r12.f(r10)
                goto L8b
            L82:
                com.reactnativestripesdk.pushprovisioning.h r12 = com.reactnativestripesdk.pushprovisioning.h.f20359a
                java.lang.String r0 = com.reactnativestripesdk.pushprovisioning.f.a()
                r12.h(r10, r13, r11, r0)
            L8b:
                vz.b0 r10 = vz.b0.f54756a
            L8d:
                if (r10 != 0) goto L94
                com.reactnativestripesdk.pushprovisioning.b r10 = r9.f20356a
                r10.f(r2)
            L94:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.reactnativestripesdk.pushprovisioning.f.a.onActivityResult(android.app.Activity, int, int, android.content.Intent):void");
        }
    }

    private f() {
    }

    private final void c(ReactApplicationContext reactApplicationContext, b bVar) {
        reactApplicationContext.addActivityEventListener(new a(bVar));
    }

    public final String d() {
        try {
            Class.forName("com.stripe.android.pushProvisioning.PushProvisioningActivity");
            return "2019-09-09";
        } catch (Exception unused) {
            Log.e("StripePushProvisioning", "PushProvisioning dependency not found");
            return "";
        }
    }

    public final void e(ReactApplicationContext context, b view, String cardDescription, String ephemeralKey, ReadableMap readableMap) {
        b0 b0Var;
        s.g(context, "context");
        s.g(view, "view");
        s.g(cardDescription, "cardDescription");
        s.g(ephemeralKey, "ephemeralKey");
        try {
            Class.forName("com.stripe.android.pushProvisioning.PushProvisioningActivityStarter");
            f20354b = cardDescription;
            f20355c = readableMap;
            c(context, view);
            Activity currentActivity = context.getCurrentActivity();
            if (currentActivity == null) {
                b0Var = null;
            } else {
                new d().a(currentActivity, f20354b, new e(ephemeralKey));
                b0Var = b0.f54756a;
            }
            if (b0Var == null) {
                view.f(hr.a.d("Failed", "Activity doesn't exist yet. You can safely retry."));
            }
        } catch (Exception unused) {
            Log.e("StripePushProvisioning", "PushProvisioning dependency not found");
        }
    }

    public final void f(Activity activity, String cardLastFour, q<? super Boolean, ? super WritableMap, ? super WritableMap, b0> callback) {
        s.g(activity, "activity");
        s.g(cardLastFour, "cardLastFour");
        s.g(callback, "callback");
        h.f20359a.b(activity, cardLastFour, callback);
    }

    public final boolean g(ReactApplicationContext context) {
        s.g(context, "context");
        if (context.getPackageManager().hasSystemFeature("android.hardware.nfc")) {
            return NfcAdapter.getDefaultAdapter(context).isEnabled();
        }
        return false;
    }
}