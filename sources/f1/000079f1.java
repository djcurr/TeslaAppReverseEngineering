package io.sentry;

import j$.util.DesugarTimeZone;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class t0 extends io.sentry.vendor.gson.stream.a {
    public t0(Reader reader) {
        super(reader);
    }

    public Integer D1() {
        if (G0() == io.sentry.vendor.gson.stream.b.NULL) {
            u0();
            return null;
        }
        return Integer.valueOf(e0());
    }

    public <T> List<T> F1(d0 d0Var, n0<T> n0Var) {
        if (G0() == io.sentry.vendor.gson.stream.b.NULL) {
            u0();
            return null;
        }
        a();
        ArrayList arrayList = new ArrayList();
        do {
            try {
                arrayList.add(n0Var.a(this, d0Var));
            } catch (Exception e11) {
                d0Var.b(f3.ERROR, "Failed to deserialize object in list.", e11);
            }
        } while (G0() == io.sentry.vendor.gson.stream.b.BEGIN_OBJECT);
        p();
        return arrayList;
    }

    public Long K1() {
        if (G0() == io.sentry.vendor.gson.stream.b.NULL) {
            u0();
            return null;
        }
        return Long.valueOf(n0());
    }

    public Object L1() {
        return new s0().c(this);
    }

    public <T> T M1(d0 d0Var, n0<T> n0Var) {
        if (G0() == io.sentry.vendor.gson.stream.b.NULL) {
            u0();
            return null;
        }
        return n0Var.a(this, d0Var);
    }

    public String N1() {
        if (G0() == io.sentry.vendor.gson.stream.b.NULL) {
            u0();
            return null;
        }
        return D0();
    }

    public TimeZone O1(d0 d0Var) {
        if (G0() == io.sentry.vendor.gson.stream.b.NULL) {
            u0();
            return null;
        }
        try {
            return DesugarTimeZone.getTimeZone(D0());
        } catch (Exception e11) {
            d0Var.b(f3.ERROR, "Error when deserializing TimeZone", e11);
            return null;
        }
    }

    public void P1(d0 d0Var, Map<String, Object> map, String str) {
        try {
            map.put(str, L1());
        } catch (Exception e11) {
            d0Var.a(f3.ERROR, e11, "Error deserializing unknown key: %s", str);
        }
    }

    public Boolean p1() {
        if (G0() == io.sentry.vendor.gson.stream.b.NULL) {
            u0();
            return null;
        }
        return Boolean.valueOf(R());
    }

    public Date t1(d0 d0Var) {
        if (G0() == io.sentry.vendor.gson.stream.b.NULL) {
            u0();
            return null;
        }
        String D0 = D0();
        try {
            return g.d(D0);
        } catch (Exception e11) {
            d0Var.b(f3.DEBUG, "Error when deserializing UTC timestamp format, it might be millis timestamp format.", e11);
            try {
                return g.e(D0);
            } catch (Exception e12) {
                d0Var.b(f3.ERROR, "Error when deserializing millis timestamp format.", e12);
                return null;
            }
        }
    }

    public Double v1() {
        if (G0() == io.sentry.vendor.gson.stream.b.NULL) {
            u0();
            return null;
        }
        return Double.valueOf(a0());
    }

    public Float y1() {
        return Float.valueOf((float) a0());
    }

    public Float z1() {
        if (G0() == io.sentry.vendor.gson.stream.b.NULL) {
            u0();
            return null;
        }
        return y1();
    }
}