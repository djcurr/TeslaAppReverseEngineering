package com.squareup.moshi;

import com.adyen.checkout.components.model.payments.request.Address;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import kr.b;

/* loaded from: classes2.dex */
public final class r {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static Type a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    public static GenericArrayType b(Type type) {
        return new b.a(type);
    }

    public static Type c(Type type, Class<?> cls) {
        Type i11 = i(type, cls, Collection.class);
        if (i11 instanceof WildcardType) {
            i11 = ((WildcardType) i11).getUpperBounds()[0];
        }
        if (i11 instanceof ParameterizedType) {
            return ((ParameterizedType) i11).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    public static boolean d(Type type, Type type2) {
        Type[] actualTypeArguments;
        Type[] actualTypeArguments2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (type2 instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                ParameterizedType parameterizedType2 = (ParameterizedType) type2;
                if (parameterizedType instanceof b.C0680b) {
                    actualTypeArguments = ((b.C0680b) parameterizedType).f35697c;
                } else {
                    actualTypeArguments = parameterizedType.getActualTypeArguments();
                }
                if (parameterizedType2 instanceof b.C0680b) {
                    actualTypeArguments2 = ((b.C0680b) parameterizedType2).f35697c;
                } else {
                    actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                }
                return d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(actualTypeArguments, actualTypeArguments2);
            }
            return false;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (type2 instanceof GenericArrayType) {
                return d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        } else if (type instanceof WildcardType) {
            if (type2 instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) type;
                WildcardType wildcardType2 = (WildcardType) type2;
                return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
            }
            return false;
        } else if ((type instanceof TypeVariable) && (type2 instanceof TypeVariable)) {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        } else {
            return false;
        }
    }

    public static String e(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    public static Set<? extends Annotation> f(Class<?> cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            Annotation[] declaredAnnotations = declaredField.getDeclaredAnnotations();
            LinkedHashSet linkedHashSet = new LinkedHashSet(declaredAnnotations.length);
            for (Annotation annotation : declaredAnnotations) {
                if (annotation.annotationType().isAnnotationPresent(ir.c.class)) {
                    linkedHashSet.add(annotation);
                }
            }
            return Collections.unmodifiableSet(linkedHashSet);
        } catch (NoSuchFieldException e11) {
            throw new IllegalArgumentException("Could not access field " + str + " on class " + cls.getCanonicalName(), e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Type g(Type type) {
        Class<?> h11 = h(type);
        return kr.b.o(type, h11, h11.getGenericSuperclass());
    }

    public static Class<?> h(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(h(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return h(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? Address.ADDRESS_NULL_PLACEHOLDER : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    static Type i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return kr.b.o(type, cls, kr.b.e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Type[] j(Type type, Class<?> cls) {
        if (type == Properties.class) {
            return new Type[]{String.class, String.class};
        }
        Type i11 = i(type, cls, Map.class);
        return i11 instanceof ParameterizedType ? ((ParameterizedType) i11).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static ParameterizedType k(Type type, Type... typeArr) {
        if (typeArr.length != 0) {
            return new b.C0680b(null, type, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + type);
    }

    public static WildcardType l(Type type) {
        return new b.c(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, kr.b.f35690b);
    }

    public static WildcardType m(Type type) {
        return new b.c(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }
}