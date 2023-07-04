package kq;

import hq.g;
import hq.h;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes2.dex */
public class b implements e<Object> {
    @Override // kq.e
    public <E> void a(E e11, Appendable appendable, g gVar) {
        Field[] declaredFields;
        Object invoke;
        Class<?> type;
        try {
            gVar.n(appendable);
            boolean z11 = false;
            for (Class<?> cls = e11.getClass(); cls != Object.class; cls = cls.getSuperclass()) {
                for (Field field : cls.getDeclaredFields()) {
                    int modifiers = field.getModifiers();
                    if ((modifiers & 152) <= 0) {
                        if ((modifiers & 1) > 0) {
                            invoke = field.get(e11);
                        } else {
                            Method method = null;
                            try {
                                method = cls.getDeclaredMethod(h.a(field.getName()), new Class[0]);
                            } catch (Exception unused) {
                            }
                            if (method == null && ((type = field.getType()) == Boolean.TYPE || type == Boolean.class)) {
                                method = cls.getDeclaredMethod(h.b(field.getName()), new Class[0]);
                            }
                            if (method != null) {
                                invoke = method.invoke(e11, new Object[0]);
                            }
                        }
                        if (invoke != null || !gVar.g()) {
                            if (z11) {
                                gVar.m(appendable);
                            } else {
                                z11 = true;
                            }
                            d.g(field.getName(), invoke, appendable, gVar);
                        }
                    }
                }
            }
            gVar.o(appendable);
        } catch (Exception e12) {
            throw new RuntimeException(e12);
        }
    }
}