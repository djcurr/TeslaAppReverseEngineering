package kotlin.jvm.internal;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    private static final Object[] f34911a = new Object[0];

    public static final Object[] a(Collection<?> collection) {
        s.g(collection, "collection");
        int size = collection.size();
        if (size != 0) {
            Iterator<?> it2 = collection.iterator();
            if (it2.hasNext()) {
                Object[] objArr = new Object[size];
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    objArr[i11] = it2.next();
                    if (i12 >= objArr.length) {
                        if (!it2.hasNext()) {
                            return objArr;
                        }
                        int i13 = ((i12 * 3) + 1) >>> 1;
                        if (i13 <= i12) {
                            if (i12 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                            i13 = 2147483645;
                        }
                        objArr = Arrays.copyOf(objArr, i13);
                        s.f(objArr, "copyOf(result, newSize)");
                    } else if (!it2.hasNext()) {
                        Object[] copyOf = Arrays.copyOf(objArr, i12);
                        s.f(copyOf, "copyOf(result, size)");
                        return copyOf;
                    }
                    i11 = i12;
                }
            }
        }
        return f34911a;
    }

    public static final Object[] b(Collection<?> collection, Object[] objArr) {
        Object[] objArr2;
        s.g(collection, "collection");
        Objects.requireNonNull(objArr);
        int size = collection.size();
        int i11 = 0;
        if (size == 0) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        Iterator<?> it2 = collection.iterator();
        if (!it2.hasNext()) {
            if (objArr.length > 0) {
                objArr[0] = null;
                return objArr;
            }
            return objArr;
        }
        if (size <= objArr.length) {
            objArr2 = objArr;
        } else {
            Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
            Objects.requireNonNull(newInstance, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr2 = (Object[]) newInstance;
        }
        while (true) {
            int i12 = i11 + 1;
            objArr2[i11] = it2.next();
            if (i12 >= objArr2.length) {
                if (!it2.hasNext()) {
                    return objArr2;
                }
                int i13 = ((i12 * 3) + 1) >>> 1;
                if (i13 <= i12) {
                    if (i12 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                    i13 = 2147483645;
                }
                objArr2 = Arrays.copyOf(objArr2, i13);
                s.f(objArr2, "copyOf(result, newSize)");
            } else if (!it2.hasNext()) {
                if (objArr2 == objArr) {
                    objArr[i12] = null;
                    return objArr;
                }
                Object[] copyOf = Arrays.copyOf(objArr2, i12);
                s.f(copyOf, "copyOf(result, size)");
                return copyOf;
            }
            i11 = i12;
        }
    }
}