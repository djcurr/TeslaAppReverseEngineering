package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.provider.Settings;
import com.stripe.android.stripe3ds2.utils.Supplier;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class HardwareIdSupplier implements Supplier<HardwareId> {
    private final Context context;

    public HardwareIdSupplier(Context context) {
        s.g(context, "context");
        Context applicationContext = context.getApplicationContext();
        s.f(applicationContext, "context.applicationContext");
        this.context = applicationContext;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.stripe.android.stripe3ds2.utils.Supplier
    public HardwareId get() {
        String string = Settings.Secure.getString(this.context.getContentResolver(), "android_id");
        if (string == null) {
            string = "";
        }
        return new HardwareId(string);
    }
}