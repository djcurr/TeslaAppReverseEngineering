package io.grpc.internal;

import com.google.common.io.BaseEncoding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class l2 {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f31063a = Logger.getLogger(l2.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f31064b = "-bin".getBytes(com.google.common.base.f.f15918a);

    private l2() {
    }

    private static boolean a(byte[] bArr, byte[] bArr2) {
        int length = bArr.length - bArr2.length;
        if (length < 0) {
            return false;
        }
        for (int i11 = length; i11 < bArr.length; i11++) {
            if (bArr[i11] != bArr2[i11 - length]) {
                return false;
            }
        }
        return true;
    }

    private static boolean b(byte[] bArr) {
        for (byte b11 : bArr) {
            if (b11 < 32 || b11 > 126) {
                return false;
            }
        }
        return true;
    }

    private static byte[][] c(byte[][] bArr, int i11) {
        ArrayList arrayList = new ArrayList(bArr.length + 10);
        for (int i12 = 0; i12 < i11; i12++) {
            arrayList.add(bArr[i12]);
        }
        while (i11 < bArr.length) {
            byte[] bArr2 = bArr[i11];
            byte[] bArr3 = bArr[i11 + 1];
            if (!a(bArr2, f31064b)) {
                arrayList.add(bArr2);
                arrayList.add(bArr3);
            } else {
                int i13 = 0;
                for (int i14 = 0; i14 <= bArr3.length; i14++) {
                    if (i14 == bArr3.length || bArr3[i14] == 44) {
                        byte[] c11 = BaseEncoding.a().c(new String(bArr3, i13, i14 - i13, com.google.common.base.f.f15918a));
                        arrayList.add(bArr2);
                        arrayList.add(c11);
                        i13 = i14 + 1;
                    }
                }
            }
            i11 += 2;
        }
        return (byte[][]) arrayList.toArray(new byte[0]);
    }

    public static byte[][] d(io.grpc.r0 r0Var) {
        byte[][] d11 = io.grpc.h0.d(r0Var);
        if (d11 == null) {
            return new byte[0];
        }
        int i11 = 0;
        for (int i12 = 0; i12 < d11.length; i12 += 2) {
            byte[] bArr = d11[i12];
            byte[] bArr2 = d11[i12 + 1];
            if (a(bArr, f31064b)) {
                d11[i11] = bArr;
                d11[i11 + 1] = io.grpc.h0.f30584b.f(bArr2).getBytes(com.google.common.base.f.f15918a);
            } else if (b(bArr2)) {
                d11[i11] = bArr;
                d11[i11 + 1] = bArr2;
            } else {
                String str = new String(bArr, com.google.common.base.f.f15918a);
                f31063a.warning("Metadata key=" + str + ", value=" + Arrays.toString(bArr2) + " contains invalid ASCII characters");
            }
            i11 += 2;
        }
        return i11 == d11.length ? d11 : (byte[][]) Arrays.copyOfRange(d11, 0, i11);
    }

    public static byte[][] e(byte[][] bArr) {
        for (int i11 = 0; i11 < bArr.length; i11 += 2) {
            byte[] bArr2 = bArr[i11];
            int i12 = i11 + 1;
            byte[] bArr3 = bArr[i12];
            if (a(bArr2, f31064b)) {
                for (byte b11 : bArr3) {
                    if (b11 == 44) {
                        return c(bArr, i11);
                    }
                }
                bArr[i12] = BaseEncoding.a().c(new String(bArr3, com.google.common.base.f.f15918a));
            }
        }
        return bArr;
    }
}