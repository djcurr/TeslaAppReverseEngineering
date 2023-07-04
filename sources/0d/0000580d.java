package com.stripe.android.stripe3ds2.init;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import com.stripe.android.stripe3ds2.utils.Supplier;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.q0;
import kotlin.jvm.internal.s;
import r3.g;
import vz.v;
import wz.r0;
import wz.s0;

/* loaded from: classes6.dex */
public final class DeviceDataFactoryImpl implements DeviceDataFactory {
    private final DisplayMetrics displayMetrics;
    private final Supplier<HardwareId> hardwareIdSupplier;

    public DeviceDataFactoryImpl(Context context, Supplier<HardwareId> hardwareIdSupplier) {
        s.g(context, "context");
        s.g(hardwareIdSupplier, "hardwareIdSupplier");
        this.hardwareIdSupplier = hardwareIdSupplier;
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        s.f(displayMetrics, "context.resources.displayMetrics");
        this.displayMetrics = displayMetrics;
    }

    @Override // com.stripe.android.stripe3ds2.init.DeviceDataFactory
    public Map<String, Object> create() {
        Map l11;
        Map i11;
        Map<String, Object> p11;
        String value = this.hardwareIdSupplier.get().getValue();
        String deviceParam = DeviceParam.PARAM_LOCALE.toString();
        Locale[] localeArr = {Locale.getDefault()};
        String deviceParam2 = DeviceParam.PARAM_SCREEN_RESOLUTION.toString();
        q0 q0Var = q0.f34921a;
        String format = String.format(Locale.ROOT, "%sx%s", Arrays.copyOf(new Object[]{Integer.valueOf(this.displayMetrics.heightPixels), Integer.valueOf(this.displayMetrics.widthPixels)}, 2));
        s.f(format, "format(locale, format, *args)");
        l11 = s0.l(v.a(DeviceParam.PARAM_PLATFORM.toString(), "Android"), v.a(DeviceParam.PARAM_DEVICE_MODEL.toString(), Build.MODEL), v.a(DeviceParam.PARAM_OS_NAME.toString(), Build.VERSION.CODENAME), v.a(DeviceParam.PARAM_OS_VERSION.toString(), Build.VERSION.RELEASE), v.a(deviceParam, g.a(localeArr).g()), v.a(DeviceParam.PARAM_TIME_ZONE.toString(), TimeZone.getDefault().getDisplayName()), v.a(deviceParam2, format));
        if (value.length() > 0) {
            i11 = r0.f(v.a(DeviceParam.PARAM_HARDWARE_ID.toString(), value));
        } else {
            i11 = s0.i();
        }
        p11 = s0.p(l11, i11);
        return p11;
    }
}