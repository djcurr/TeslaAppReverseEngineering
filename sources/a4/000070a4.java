package gu;

import ch.qos.logback.core.spi.AbstractComponentTracker;
import j$.time.Instant;
import kotlin.text.v;
import okio.i;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f28094a = new b();

    private b() {
    }

    private final Instant b() {
        Instant EPOCH = Instant.EPOCH;
        kotlin.jvm.internal.s.f(EPOCH, "EPOCH");
        return EPOCH;
    }

    public final qt.c a(k params, yt.f routableMessage, String vehicleToken) {
        byte[] r11;
        kotlin.jvm.internal.s.g(params, "params");
        kotlin.jvm.internal.s.g(routableMessage, "routableMessage");
        kotlin.jvm.internal.s.g(vehicleToken, "vehicleToken");
        Instant b11 = b();
        i.a aVar = okio.i.f42657e;
        okio.i e11 = aVar.e(params.c().C());
        okio.i encodeByteString = routableMessage.encodeByteString();
        String f11 = params.f();
        r11 = v.r("vehicle_device." + f11 + ".cmds");
        return new qt.c(e11, i.a.h(aVar, r11, 0, 0, 3, null), b11, null, 0, null, 0, null, b11.plusMillis(AbstractComponentTracker.LINGERING_TIMEOUT), encodeByteString, d.f28095a.a(vehicleToken), null, null, 6392, null);
    }
}