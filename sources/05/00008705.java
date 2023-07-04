package mq;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.Method;
import org.spongycastle.pqc.math.linearalgebra.Matrix;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: e  reason: collision with root package name */
    public static final b0 f38706e = new b0(0, "VZCBSIFJD", 0, 1);

    /* renamed from: f  reason: collision with root package name */
    public static final b0 f38707f = new b0(1, "VZCBSIFJD", 1, 2);

    /* renamed from: g  reason: collision with root package name */
    public static final b0 f38708g = new b0(2, "VZCBSIFJD", 2, 3);

    /* renamed from: h  reason: collision with root package name */
    public static final b0 f38709h = new b0(3, "VZCBSIFJD", 3, 4);

    /* renamed from: i  reason: collision with root package name */
    public static final b0 f38710i = new b0(4, "VZCBSIFJD", 4, 5);

    /* renamed from: j  reason: collision with root package name */
    public static final b0 f38711j = new b0(5, "VZCBSIFJD", 5, 6);

    /* renamed from: k  reason: collision with root package name */
    public static final b0 f38712k = new b0(6, "VZCBSIFJD", 6, 7);

    /* renamed from: l  reason: collision with root package name */
    public static final b0 f38713l = new b0(7, "VZCBSIFJD", 7, 8);

    /* renamed from: m  reason: collision with root package name */
    public static final b0 f38714m = new b0(8, "VZCBSIFJD", 8, 9);

    /* renamed from: a  reason: collision with root package name */
    private final int f38715a;

    /* renamed from: b  reason: collision with root package name */
    private final String f38716b;

    /* renamed from: c  reason: collision with root package name */
    private final int f38717c;

    /* renamed from: d  reason: collision with root package name */
    private final int f38718d;

    private b0(int i11, String str, int i12, int i13) {
        this.f38715a = i11;
        this.f38716b = str;
        this.f38717c = i12;
        this.f38718d = i13;
    }

    private static void a(Class<?> cls, StringBuilder sb2) {
        char c11;
        while (cls.isArray()) {
            sb2.append('[');
            cls = cls.getComponentType();
        }
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                c11 = 'I';
            } else if (cls == Void.TYPE) {
                c11 = 'V';
            } else if (cls == Boolean.TYPE) {
                c11 = Matrix.MATRIX_TYPE_ZERO;
            } else if (cls == Byte.TYPE) {
                c11 = 'B';
            } else if (cls == Character.TYPE) {
                c11 = 'C';
            } else if (cls == Short.TYPE) {
                c11 = 'S';
            } else if (cls == Double.TYPE) {
                c11 = 'D';
            } else if (cls == Float.TYPE) {
                c11 = 'F';
            } else if (cls != Long.TYPE) {
                throw new AssertionError();
            } else {
                c11 = 'J';
            }
            sb2.append(c11);
            return;
        }
        sb2.append(Matrix.MATRIX_TYPE_RANDOM_LT);
        sb2.append(g(cls));
        sb2.append(';');
    }

    public static b0[] b(String str) {
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (str.charAt(i13) != ')') {
            while (str.charAt(i13) == '[') {
                i13++;
            }
            int i14 = i13 + 1;
            i13 = str.charAt(i13) == 'L' ? Math.max(i14, str.indexOf(59, i14) + 1) : i14;
            i12++;
        }
        b0[] b0VarArr = new b0[i12];
        int i15 = 1;
        while (str.charAt(i15) != ')') {
            int i16 = i15;
            while (str.charAt(i16) == '[') {
                i16++;
            }
            int i17 = i16 + 1;
            if (str.charAt(i16) == 'L') {
                i17 = Math.max(i17, str.indexOf(59, i17) + 1);
            }
            b0VarArr[i11] = o(str, i15, i17);
            i11++;
            i15 = i17;
        }
        return b0VarArr;
    }

    public static int c(String str) {
        int i11 = 1;
        char charAt = str.charAt(1);
        int i12 = 1;
        int i13 = 1;
        while (charAt != ')') {
            if (charAt == 'J' || charAt == 'D') {
                i12++;
                i13 += 2;
            } else {
                while (str.charAt(i12) == '[') {
                    i12++;
                }
                int i14 = i12 + 1;
                if (str.charAt(i12) == 'L') {
                    i14 = Math.max(i14, str.indexOf(59, i14) + 1);
                }
                i13++;
                i12 = i14;
            }
            charAt = str.charAt(i12);
        }
        char charAt2 = str.charAt(i12 + 1);
        if (charAt2 == 'V') {
            return i13 << 2;
        }
        if (charAt2 == 'J' || charAt2 == 'D') {
            i11 = 2;
        }
        return (i13 << 2) | i11;
    }

    public static String e(Class<?> cls) {
        StringBuilder sb2 = new StringBuilder();
        a(cls, sb2);
        return sb2.toString();
    }

    public static String g(Class<?> cls) {
        return cls.getName().replace(CoreConstants.DOT, '/');
    }

    public static String h(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.LEFT_PARENTHESIS_CHAR);
        for (Class<?> cls : method.getParameterTypes()) {
            a(cls, sb2);
        }
        sb2.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
        a(method.getReturnType(), sb2);
        return sb2.toString();
    }

    public static b0 i(String str) {
        return new b0(11, str, 0, str.length());
    }

    public static b0 j(String str) {
        return new b0(str.charAt(0) == '[' ? 9 : 12, str, 0, str.length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int k(String str) {
        int i11 = 1;
        while (str.charAt(i11) != ')') {
            while (str.charAt(i11) == '[') {
                i11++;
            }
            int i12 = i11 + 1;
            i11 = str.charAt(i11) == 'L' ? Math.max(i12, str.indexOf(59, i12) + 1) : i12;
        }
        return i11 + 1;
    }

    public static b0 m(Class<?> cls) {
        if (cls.isPrimitive()) {
            if (cls == Integer.TYPE) {
                return f38711j;
            }
            if (cls == Void.TYPE) {
                return f38706e;
            }
            if (cls == Boolean.TYPE) {
                return f38707f;
            }
            if (cls == Byte.TYPE) {
                return f38709h;
            }
            if (cls == Character.TYPE) {
                return f38708g;
            }
            if (cls == Short.TYPE) {
                return f38710i;
            }
            if (cls == Double.TYPE) {
                return f38714m;
            }
            if (cls == Float.TYPE) {
                return f38712k;
            }
            if (cls == Long.TYPE) {
                return f38713l;
            }
            throw new AssertionError();
        }
        return n(e(cls));
    }

    public static b0 n(String str) {
        return o(str, 0, str.length());
    }

    private static b0 o(String str, int i11, int i12) {
        char charAt = str.charAt(i11);
        if (charAt != '(') {
            if (charAt != 'F') {
                if (charAt != 'L') {
                    if (charAt != 'S') {
                        if (charAt != 'V') {
                            if (charAt != 'I') {
                                if (charAt != 'J') {
                                    if (charAt != 'Z') {
                                        if (charAt != '[') {
                                            switch (charAt) {
                                                case 'B':
                                                    return f38709h;
                                                case 'C':
                                                    return f38708g;
                                                case 'D':
                                                    return f38714m;
                                                default:
                                                    throw new IllegalArgumentException();
                                            }
                                        }
                                        return new b0(9, str, i11, i12);
                                    }
                                    return f38707f;
                                }
                                return f38713l;
                            }
                            return f38711j;
                        }
                        return f38706e;
                    }
                    return f38710i;
                }
                return new b0(10, str, i11 + 1, i12 - 1);
            }
            return f38712k;
        }
        return new b0(11, str, i11, i12);
    }

    public String d() {
        int i11 = this.f38715a;
        if (i11 == 10) {
            return this.f38716b.substring(this.f38717c - 1, this.f38718d + 1);
        }
        if (i11 == 12) {
            return Matrix.MATRIX_TYPE_RANDOM_LT + this.f38716b.substring(this.f38717c, this.f38718d) + ';';
        }
        return this.f38716b.substring(this.f38717c, this.f38718d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            int i11 = this.f38715a;
            if (i11 == 12) {
                i11 = 10;
            }
            int i12 = b0Var.f38715a;
            if (i11 != (i12 != 12 ? i12 : 10)) {
                return false;
            }
            int i13 = this.f38717c;
            int i14 = this.f38718d;
            int i15 = b0Var.f38717c;
            if (i14 - i13 != b0Var.f38718d - i15) {
                return false;
            }
            while (i13 < i14) {
                if (this.f38716b.charAt(i13) != b0Var.f38716b.charAt(i15)) {
                    return false;
                }
                i13++;
                i15++;
            }
            return true;
        }
        return false;
    }

    public String f() {
        return this.f38716b.substring(this.f38717c, this.f38718d);
    }

    public int hashCode() {
        int i11 = this.f38715a;
        int i12 = (i11 == 12 ? 10 : i11) * 13;
        if (i11 >= 9) {
            int i13 = this.f38718d;
            for (int i14 = this.f38717c; i14 < i13; i14++) {
                i12 = (i12 + this.f38716b.charAt(i14)) * 17;
            }
        }
        return i12;
    }

    public int l() {
        int i11 = this.f38715a;
        if (i11 == 12) {
            return 10;
        }
        return i11;
    }

    public String toString() {
        return d();
    }
}