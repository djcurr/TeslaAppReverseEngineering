package g00;

import java.lang.annotation.Annotation;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;
import n00.d;

/* loaded from: classes5.dex */
public final class a {
    public static final <T extends Annotation> d<? extends T> a(T t11) {
        s.g(t11, "<this>");
        Class<? extends Annotation> annotationType = t11.annotationType();
        s.f(annotationType, "this as java.lang.annota…otation).annotationType()");
        return e(annotationType);
    }

    public static final <T> Class<T> b(d<T> dVar) {
        s.g(dVar, "<this>");
        return (Class<T>) ((h) dVar).d();
    }

    public static final <T> Class<T> c(d<T> dVar) {
        s.g(dVar, "<this>");
        Class<T> cls = (Class<T>) ((h) dVar).d();
        if (cls.isPrimitive()) {
            String name = cls.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    return !name.equals("double") ? cls : Double.class;
                case 104431:
                    return !name.equals("int") ? cls : Integer.class;
                case 3039496:
                    return !name.equals("byte") ? cls : Byte.class;
                case 3052374:
                    return !name.equals("char") ? cls : Character.class;
                case 3327612:
                    return !name.equals("long") ? cls : Long.class;
                case 3625364:
                    return !name.equals("void") ? cls : Void.class;
                case 64711720:
                    return !name.equals("boolean") ? cls : Boolean.class;
                case 97526364:
                    return !name.equals("float") ? cls : Float.class;
                case 109413500:
                    return !name.equals("short") ? cls : Short.class;
                default:
                    return cls;
            }
        }
        return cls;
    }

    public static final <T> Class<T> d(d<T> dVar) {
        s.g(dVar, "<this>");
        Class<T> cls = (Class<T>) ((h) dVar).d();
        if (cls.isPrimitive()) {
            return cls;
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (name.equals("java.lang.Integer")) {
                    return Integer.TYPE;
                }
                break;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                break;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                break;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                break;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                break;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                break;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                break;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                break;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                break;
        }
        return null;
    }

    public static final <T> d<T> e(Class<T> cls) {
        s.g(cls, "<this>");
        return m0.b(cls);
    }
}