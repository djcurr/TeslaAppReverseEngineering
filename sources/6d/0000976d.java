package org.slf4j.helpers;

import com.adyen.checkout.components.model.payments.request.Address;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class MessageFormatter {
    static final char DELIM_START = '{';
    static final char DELIM_STOP = '}';
    static final String DELIM_STR = "{}";
    private static final char ESCAPE_CHAR = '\\';

    public static final FormattingTuple arrayFormat(String str, Object[] objArr) {
        Throwable throwableCandidate = getThrowableCandidate(objArr);
        if (throwableCandidate != null) {
            objArr = trimmedCopy(objArr);
        }
        return arrayFormat(str, objArr, throwableCandidate);
    }

    private static void booleanArrayAppend(StringBuilder sb2, boolean[] zArr) {
        sb2.append('[');
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(zArr[i11]);
            if (i11 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void byteArrayAppend(StringBuilder sb2, byte[] bArr) {
        sb2.append('[');
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append((int) bArr[i11]);
            if (i11 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void charArrayAppend(StringBuilder sb2, char[] cArr) {
        sb2.append('[');
        int length = cArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(cArr[i11]);
            if (i11 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void deeplyAppendParameter(StringBuilder sb2, Object obj, Map<Object[], Object> map) {
        if (obj == null) {
            sb2.append(Address.ADDRESS_NULL_PLACEHOLDER);
        } else if (!obj.getClass().isArray()) {
            safeObjectAppend(sb2, obj);
        } else if (obj instanceof boolean[]) {
            booleanArrayAppend(sb2, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            byteArrayAppend(sb2, (byte[]) obj);
        } else if (obj instanceof char[]) {
            charArrayAppend(sb2, (char[]) obj);
        } else if (obj instanceof short[]) {
            shortArrayAppend(sb2, (short[]) obj);
        } else if (obj instanceof int[]) {
            intArrayAppend(sb2, (int[]) obj);
        } else if (obj instanceof long[]) {
            longArrayAppend(sb2, (long[]) obj);
        } else if (obj instanceof float[]) {
            floatArrayAppend(sb2, (float[]) obj);
        } else if (obj instanceof double[]) {
            doubleArrayAppend(sb2, (double[]) obj);
        } else {
            objectArrayAppend(sb2, (Object[]) obj, map);
        }
    }

    private static void doubleArrayAppend(StringBuilder sb2, double[] dArr) {
        sb2.append('[');
        int length = dArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(dArr[i11]);
            if (i11 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void floatArrayAppend(StringBuilder sb2, float[] fArr) {
        sb2.append('[');
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(fArr[i11]);
            if (i11 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    public static final FormattingTuple format(String str, Object obj) {
        return arrayFormat(str, new Object[]{obj});
    }

    public static Throwable getThrowableCandidate(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                return (Throwable) obj;
            }
        }
        return null;
    }

    private static void intArrayAppend(StringBuilder sb2, int[] iArr) {
        sb2.append('[');
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(iArr[i11]);
            if (i11 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    static final boolean isDoubleEscaped(String str, int i11) {
        return i11 >= 2 && str.charAt(i11 - 2) == '\\';
    }

    static final boolean isEscapedDelimeter(String str, int i11) {
        return i11 != 0 && str.charAt(i11 - 1) == '\\';
    }

    private static void longArrayAppend(StringBuilder sb2, long[] jArr) {
        sb2.append('[');
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append(jArr[i11]);
            if (i11 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    private static void objectArrayAppend(StringBuilder sb2, Object[] objArr, Map<Object[], Object> map) {
        sb2.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, null);
            int length = objArr.length;
            for (int i11 = 0; i11 < length; i11++) {
                deeplyAppendParameter(sb2, objArr[i11], map);
                if (i11 != length - 1) {
                    sb2.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            sb2.append("...");
        }
        sb2.append(']');
    }

    private static void safeObjectAppend(StringBuilder sb2, Object obj) {
        try {
            sb2.append(obj.toString());
        } catch (Throwable th2) {
            Util.report("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]", th2);
            sb2.append("[FAILED toString()]");
        }
    }

    private static void shortArrayAppend(StringBuilder sb2, short[] sArr) {
        sb2.append('[');
        int length = sArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            sb2.append((int) sArr[i11]);
            if (i11 != length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append(']');
    }

    public static Object[] trimmedCopy(Object[] objArr) {
        if (objArr != null && objArr.length != 0) {
            int length = objArr.length - 1;
            Object[] objArr2 = new Object[length];
            if (length > 0) {
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return objArr2;
        }
        throw new IllegalStateException("non-sensical empty or null argument array");
    }

    public static final FormattingTuple format(String str, Object obj, Object obj2) {
        return arrayFormat(str, new Object[]{obj, obj2});
    }

    public static final FormattingTuple arrayFormat(String str, Object[] objArr, Throwable th2) {
        int i11;
        if (str == null) {
            return new FormattingTuple(null, objArr, th2);
        }
        if (objArr == null) {
            return new FormattingTuple(str);
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 50);
        int i12 = 0;
        int i13 = 0;
        while (i12 < objArr.length) {
            int indexOf = str.indexOf(DELIM_STR, i13);
            if (indexOf == -1) {
                if (i13 == 0) {
                    return new FormattingTuple(str, objArr, th2);
                }
                sb2.append((CharSequence) str, i13, str.length());
                return new FormattingTuple(sb2.toString(), objArr, th2);
            }
            if (isEscapedDelimeter(str, indexOf)) {
                if (!isDoubleEscaped(str, indexOf)) {
                    i12--;
                    sb2.append((CharSequence) str, i13, indexOf - 1);
                    sb2.append('{');
                    i11 = indexOf + 1;
                    i13 = i11;
                    i12++;
                } else {
                    sb2.append((CharSequence) str, i13, indexOf - 1);
                    deeplyAppendParameter(sb2, objArr[i12], new HashMap());
                }
            } else {
                sb2.append((CharSequence) str, i13, indexOf);
                deeplyAppendParameter(sb2, objArr[i12], new HashMap());
            }
            i11 = indexOf + 2;
            i13 = i11;
            i12++;
        }
        sb2.append((CharSequence) str, i13, str.length());
        return new FormattingTuple(sb2.toString(), objArr, th2);
    }
}