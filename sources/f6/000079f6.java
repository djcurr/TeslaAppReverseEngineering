package io.sentry;

import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.TimeZone;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a */
    public final w0 f32628a;

    public u0(int i11) {
        this.f32628a = new w0(i11);
    }

    private void b(v0 v0Var, d0 d0Var, Collection<?> collection) {
        v0Var.j();
        Iterator<?> it2 = collection.iterator();
        while (it2.hasNext()) {
            a(v0Var, d0Var, it2.next());
        }
        v0Var.p();
    }

    private void c(v0 v0Var, d0 d0Var, Date date) {
        try {
            v0Var.G0(g.f(date));
        } catch (Exception e11) {
            d0Var.b(f3.ERROR, "Error when serializing Date", e11);
            v0Var.L();
        }
    }

    private void d(v0 v0Var, d0 d0Var, Map<?, ?> map) {
        v0Var.l();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                v0Var.P0((String) obj);
                a(v0Var, d0Var, map.get(obj));
            }
        }
        v0Var.C();
    }

    private void e(v0 v0Var, d0 d0Var, TimeZone timeZone) {
        try {
            v0Var.G0(timeZone.getID());
        } catch (Exception e11) {
            d0Var.b(f3.ERROR, "Error when serializing TimeZone", e11);
            v0Var.L();
        }
    }

    public void a(v0 v0Var, d0 d0Var, Object obj) {
        if (obj == null) {
            v0Var.L();
        } else if (obj instanceof Character) {
            v0Var.G0(Character.toString(((Character) obj).charValue()));
        } else if (obj instanceof String) {
            v0Var.G0((String) obj);
        } else if (obj instanceof Boolean) {
            v0Var.I0(((Boolean) obj).booleanValue());
        } else if (obj instanceof Number) {
            v0Var.F0((Number) obj);
        } else if (obj instanceof Date) {
            c(v0Var, d0Var, (Date) obj);
        } else if (obj instanceof TimeZone) {
            e(v0Var, d0Var, (TimeZone) obj);
        } else if (obj instanceof x0) {
            ((x0) obj).serialize(v0Var, d0Var);
        } else if (obj instanceof Collection) {
            b(v0Var, d0Var, (Collection) obj);
        } else if (obj.getClass().isArray()) {
            b(v0Var, d0Var, Arrays.asList((Object[]) obj));
        } else if (obj instanceof Map) {
            d(v0Var, d0Var, (Map) obj);
        } else {
            try {
                a(v0Var, d0Var, this.f32628a.d(obj, d0Var));
            } catch (Exception e11) {
                d0Var.b(f3.ERROR, "Failed serializing unknown object.", e11);
                v0Var.G0("[OBJECT]");
            }
        }
    }
}