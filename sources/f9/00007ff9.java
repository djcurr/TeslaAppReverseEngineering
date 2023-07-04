package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import v20.r0;
import vz.q;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a */
    private static final String f35456a;

    /* renamed from: b */
    private static final String f35457b;

    static {
        Object b11;
        Object b12;
        try {
            q.a aVar = vz.q.f54772b;
            b11 = vz.q.b(Class.forName("kotlin.coroutines.jvm.internal.a").getCanonicalName());
        } catch (Throwable th2) {
            q.a aVar2 = vz.q.f54772b;
            b11 = vz.q.b(vz.r.a(th2));
        }
        if (vz.q.e(b11) != null) {
            b11 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f35456a = (String) b11;
        try {
            q.a aVar3 = vz.q.f54772b;
            b12 = vz.q.b(e0.class.getCanonicalName());
        } catch (Throwable th3) {
            q.a aVar4 = vz.q.f54772b;
            b12 = vz.q.b(vz.r.a(th3));
        }
        if (vz.q.e(b12) != null) {
            b12 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f35457b = (String) b12;
    }

    public static final StackTraceElement b(String str) {
        return new StackTraceElement(kotlin.jvm.internal.s.p("\b\b\b(", str), "\b", "\b", -1);
    }

    private static final <E extends Throwable> vz.p<E, StackTraceElement[]> c(E e11) {
        boolean z11;
        Throwable cause = e11.getCause();
        if (cause != null && kotlin.jvm.internal.s.c(cause.getClass(), e11.getClass())) {
            StackTraceElement[] stackTrace = e11.getStackTrace();
            int length = stackTrace.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i11];
                i11++;
                if (h(stackTraceElement)) {
                    z11 = true;
                    break;
                }
            }
            if (z11) {
                return vz.v.a(cause, stackTrace);
            }
            return vz.v.a(e11, new StackTraceElement[0]);
        }
        return vz.v.a(e11, new StackTraceElement[0]);
    }

    private static final <E extends Throwable> E d(E e11, E e12, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e11.getStackTrace();
        int g11 = g(stackTrace, f35456a);
        int i11 = 0;
        if (g11 == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            e12.setStackTrace((StackTraceElement[]) array);
            return e12;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + g11];
        for (int i12 = 0; i12 < g11; i12++) {
            stackTraceElementArr[i12] = stackTrace[i12];
        }
        Iterator<StackTraceElement> it2 = arrayDeque.iterator();
        while (it2.hasNext()) {
            stackTraceElementArr[i11 + g11] = it2.next();
            i11++;
        }
        e12.setStackTrace(stackTraceElementArr);
        return e12;
    }

    private static final ArrayDeque<StackTraceElement> e(kotlin.coroutines.jvm.internal.e eVar) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = eVar.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (true) {
            eVar = eVar.getCallerFrame();
            if (eVar == null) {
                return arrayDeque;
            }
            StackTraceElement stackTraceElement2 = eVar.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
    }

    private static final boolean f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && kotlin.jvm.internal.s.c(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && kotlin.jvm.internal.s.c(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && kotlin.jvm.internal.s.c(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    private static final int g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i11 + 1;
            if (kotlin.jvm.internal.s.c(str, stackTraceElementArr[i11].getClassName())) {
                return i11;
            }
            i11 = i12;
        }
        return -1;
    }

    public static final boolean h(StackTraceElement stackTraceElement) {
        boolean H;
        H = kotlin.text.v.H(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
        return H;
    }

    private static final void i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                i11 = -1;
                break;
            }
            int i12 = i11 + 1;
            if (h(stackTraceElementArr[i11])) {
                break;
            }
            i11 = i12;
        }
        int i13 = i11 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i13 > length2) {
            return;
        }
        while (true) {
            int i14 = length2 - 1;
            if (f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i13) {
                return;
            }
            length2 = i14;
        }
    }

    public static final <E extends Throwable> E j(E e11, kotlin.coroutines.jvm.internal.e eVar) {
        vz.p c11 = c(e11);
        Throwable th2 = (Throwable) c11.a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) c11.b();
        Throwable m11 = m(th2);
        if (m11 == null) {
            return e11;
        }
        ArrayDeque<StackTraceElement> e12 = e(eVar);
        if (e12.isEmpty()) {
            return e11;
        }
        if (th2 != e11) {
            i(stackTraceElementArr, e12);
        }
        return (E) d(th2, m11, e12);
    }

    public static final <E extends Throwable> E k(E e11) {
        Throwable m11;
        return (r0.d() && (m11 = m(e11)) != null) ? (E) l(m11) : e11;
    }

    private static final <E extends Throwable> E l(E e11) {
        StackTraceElement stackTraceElement;
        StackTraceElement[] stackTrace = e11.getStackTrace();
        int length = stackTrace.length;
        int g11 = g(stackTrace, f35457b);
        int i11 = g11 + 1;
        int g12 = g(stackTrace, f35456a);
        int i12 = (length - g11) - (g12 == -1 ? 0 : length - g12);
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i12];
        for (int i13 = 0; i13 < i12; i13++) {
            if (i13 == 0) {
                stackTraceElement = b("Coroutine boundary");
            } else {
                stackTraceElement = stackTrace[(i11 + i13) - 1];
            }
            stackTraceElementArr[i13] = stackTraceElement;
        }
        e11.setStackTrace(stackTraceElementArr);
        return e11;
    }

    private static final <E extends Throwable> E m(E e11) {
        E e12 = (E) k.g(e11);
        if (e12 == null) {
            return null;
        }
        if ((e11 instanceof v20.h0) || kotlin.jvm.internal.s.c(e12.getMessage(), e11.getMessage())) {
            return e12;
        }
        return null;
    }

    public static final <E extends Throwable> E n(E e11) {
        E e12 = (E) e11.getCause();
        if (e12 != null && kotlin.jvm.internal.s.c(e12.getClass(), e11.getClass())) {
            StackTraceElement[] stackTrace = e11.getStackTrace();
            int length = stackTrace.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i11];
                i11++;
                if (h(stackTraceElement)) {
                    z11 = true;
                    break;
                }
            }
            if (z11) {
                return e12;
            }
        }
        return e11;
    }
}