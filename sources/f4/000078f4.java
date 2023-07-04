package io.sentry.android.core;

import android.os.Build;
import com.adyen.checkout.components.model.payments.response.SdkAction;
import io.sentry.f3;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a */
    final io.sentry.d0 f32043a;

    public a0(io.sentry.d0 d0Var) {
        this.f32043a = (io.sentry.d0) rz.j.a(d0Var, "The ILogger object is required.");
    }

    public String a() {
        return Build.TAGS;
    }

    public String b() {
        return Build.MANUFACTURER;
    }

    public String c() {
        return Build.MODEL;
    }

    public int d() {
        return Build.VERSION.SDK_INT;
    }

    public String e() {
        return Build.VERSION.RELEASE;
    }

    public Boolean f() {
        boolean z11;
        try {
            if (!Build.BRAND.startsWith("generic") || !Build.DEVICE.startsWith("generic")) {
                String str = Build.FINGERPRINT;
                if (!str.startsWith("generic") && !str.startsWith("unknown")) {
                    String str2 = Build.HARDWARE;
                    if (!str2.contains("goldfish") && !str2.contains("ranchu")) {
                        String str3 = Build.MODEL;
                        if (!str3.contains("google_sdk") && !str3.contains("Emulator") && !str3.contains("Android SDK built for x86") && !Build.MANUFACTURER.contains("Genymotion")) {
                            String str4 = Build.PRODUCT;
                            if (!str4.contains("sdk_google") && !str4.contains("google_sdk") && !str4.contains(SdkAction.ACTION_TYPE) && !str4.contains("sdk_x86") && !str4.contains("vbox86p") && !str4.contains("emulator") && !str4.contains("simulator")) {
                                z11 = false;
                                return Boolean.valueOf(z11);
                            }
                        }
                    }
                }
            }
            z11 = true;
            return Boolean.valueOf(z11);
        } catch (Throwable th2) {
            this.f32043a.b(f3.ERROR, "Error checking whether application is running in an emulator.", th2);
            return null;
        }
    }
}