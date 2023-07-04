package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@VisibleForTesting
@KeepForSdk
/* loaded from: classes3.dex */
public final class ArrayUtils {
    private ArrayUtils() {
    }

    @KeepForSdk
    public static <T> T[] concat(T[]... tArr) {
        if (tArr.length != 0) {
            int i11 = 0;
            for (T[] tArr2 : tArr) {
                i11 += tArr2.length;
            }
            T[] tArr3 = (T[]) Arrays.copyOf(tArr[0], i11);
            int length = tArr[0].length;
            for (int i12 = 1; i12 < tArr.length; i12++) {
                T[] tArr4 = tArr[i12];
                int length2 = tArr4.length;
                System.arraycopy(tArr4, 0, tArr3, length, length2);
                length += length2;
            }
            return tArr3;
        }
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass(), 0));
    }

    @KeepForSdk
    public static byte[] concatByteArrays(byte[]... bArr) {
        if (bArr.length != 0) {
            int i11 = 0;
            for (byte[] bArr2 : bArr) {
                i11 += bArr2.length;
            }
            byte[] copyOf = Arrays.copyOf(bArr[0], i11);
            int length = bArr[0].length;
            for (int i12 = 1; i12 < bArr.length; i12++) {
                byte[] bArr3 = bArr[i12];
                int length2 = bArr3.length;
                System.arraycopy(bArr3, 0, copyOf, length, length2);
                length += length2;
            }
            return copyOf;
        }
        return new byte[0];
    }

    @KeepForSdk
    public static boolean contains(int[] iArr, int i11) {
        if (iArr == null) {
            return false;
        }
        for (int i12 : iArr) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public static <T> ArrayList<T> newArrayList() {
        return new ArrayList<>();
    }

    @KeepForSdk
    public static <T> T[] removeAll(T[] tArr, T... tArr2) {
        int length;
        int i11;
        if (tArr == null) {
            return null;
        }
        if (tArr2 != null && (length = tArr2.length) != 0) {
            T[] tArr3 = (T[]) ((Object[]) Array.newInstance(tArr2.getClass().getComponentType(), tArr.length));
            if (length == 1) {
                i11 = 0;
                for (T t11 : tArr) {
                    if (!Objects.equal(tArr2[0], t11)) {
                        tArr3[i11] = t11;
                        i11++;
                    }
                }
            } else {
                int i12 = 0;
                for (T t12 : tArr) {
                    if (!contains(tArr2, t12)) {
                        tArr3[i12] = t12;
                        i12++;
                    }
                }
                i11 = i12;
            }
            if (tArr3 == null) {
                return null;
            }
            return i11 == tArr3.length ? tArr3 : (T[]) Arrays.copyOf(tArr3, i11);
        }
        return (T[]) Arrays.copyOf(tArr, tArr.length);
    }

    @KeepForSdk
    public static <T> ArrayList<T> toArrayList(T[] tArr) {
        ArrayList<T> arrayList = new ArrayList<>(tArr.length);
        for (T t11 : tArr) {
            arrayList.add(t11);
        }
        return arrayList;
    }

    @KeepForSdk
    public static int[] toPrimitiveArray(Collection<Integer> collection) {
        int i11 = 0;
        if (collection == null || collection.isEmpty()) {
            return new int[0];
        }
        int[] iArr = new int[collection.size()];
        for (Integer num : collection) {
            iArr[i11] = num.intValue();
            i11++;
        }
        return iArr;
    }

    @KeepForSdk
    public static Integer[] toWrapperArray(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i11 = 0; i11 < length; i11++) {
            numArr[i11] = Integer.valueOf(iArr[i11]);
        }
        return numArr;
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb2, double[] dArr) {
        int length = dArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(Double.toString(dArr[i11]));
        }
    }

    @KeepForSdk
    public static void writeStringArray(StringBuilder sb2, String[] strArr) {
        int length = strArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append("\"");
            sb2.append(strArr[i11]);
            sb2.append("\"");
        }
    }

    @KeepForSdk
    public static <T> boolean contains(T[] tArr, T t11) {
        int length = tArr != null ? tArr.length : 0;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            } else if (!Objects.equal(tArr[i11], t11)) {
                i11++;
            } else if (i11 >= 0) {
                return true;
            }
        }
        return false;
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb2, float[] fArr) {
        int length = fArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(Float.toString(fArr[i11]));
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb2, int[] iArr) {
        int length = iArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(Integer.toString(iArr[i11]));
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb2, long[] jArr) {
        int length = jArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(Long.toString(jArr[i11]));
        }
    }

    @KeepForSdk
    public static <T> void writeArray(StringBuilder sb2, T[] tArr) {
        int length = tArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(tArr[i11]);
        }
    }

    @KeepForSdk
    public static void writeArray(StringBuilder sb2, boolean[] zArr) {
        int length = zArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (i11 != 0) {
                sb2.append(",");
            }
            sb2.append(Boolean.toString(zArr[i11]));
        }
    }
}