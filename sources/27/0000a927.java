package p00;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.s;
import n00.h;
import n00.i;
import n00.m;
import q00.f;
import q00.l0;

/* loaded from: classes5.dex */
public final class a {
    public static final void a(n00.c<?> isAccessible, boolean z11) {
        r00.d<?> x11;
        s.g(isAccessible, "$this$isAccessible");
        if (isAccessible instanceof i) {
            m mVar = (m) isAccessible;
            Field b11 = c.b(mVar);
            if (b11 != null) {
                b11.setAccessible(z11);
            }
            Method c11 = c.c(mVar);
            if (c11 != null) {
                c11.setAccessible(z11);
            }
            Method e11 = c.e((i) isAccessible);
            if (e11 != null) {
                e11.setAccessible(z11);
            }
        } else if (isAccessible instanceof m) {
            m mVar2 = (m) isAccessible;
            Field b12 = c.b(mVar2);
            if (b12 != null) {
                b12.setAccessible(z11);
            }
            Method c12 = c.c(mVar2);
            if (c12 != null) {
                c12.setAccessible(z11);
            }
        } else if (isAccessible instanceof m.b) {
            Field b13 = c.b(((m.b) isAccessible).d());
            if (b13 != null) {
                b13.setAccessible(z11);
            }
            Method d11 = c.d((h) isAccessible);
            if (d11 != null) {
                d11.setAccessible(z11);
            }
        } else if (isAccessible instanceof i.a) {
            Field b14 = c.b(((i.a) isAccessible).d());
            if (b14 != null) {
                b14.setAccessible(z11);
            }
            Method d12 = c.d((h) isAccessible);
            if (d12 != null) {
                d12.setAccessible(z11);
            }
        } else if (isAccessible instanceof h) {
            h hVar = (h) isAccessible;
            Method d13 = c.d(hVar);
            if (d13 != null) {
                d13.setAccessible(z11);
            }
            f<?> b15 = l0.b(isAccessible);
            Object b16 = (b15 == null || (x11 = b15.x()) == null) ? null : x11.b();
            AccessibleObject accessibleObject = b16 instanceof AccessibleObject ? b16 : null;
            if (accessibleObject != null) {
                accessibleObject.setAccessible(true);
            }
            Constructor a11 = c.a(hVar);
            if (a11 != null) {
                a11.setAccessible(z11);
            }
        } else {
            throw new UnsupportedOperationException("Unknown callable: " + isAccessible + " (" + isAccessible.getClass() + CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }
}