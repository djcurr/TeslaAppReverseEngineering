package org.spongycastle.pqc.math.ntru.util;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import org.spongycastle.pqc.math.ntru.euclid.IntEuclidean;
import org.spongycastle.pqc.math.ntru.polynomial.DenseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.SparseTernaryPolynomial;
import org.spongycastle.pqc.math.ntru.polynomial.TernaryPolynomial;
import org.spongycastle.util.Integers;

/* loaded from: classes4.dex */
public class Util {
    private static volatile boolean IS_64_BITNESS_KNOWN;
    private static volatile boolean IS_64_BIT_JVM;

    public static TernaryPolynomial generateRandomTernary(int i11, int i12, int i13, boolean z11, SecureRandom secureRandom) {
        if (z11) {
            return SparseTernaryPolynomial.generateRandom(i11, i12, i13, secureRandom);
        }
        return DenseTernaryPolynomial.generateRandom(i11, i12, i13, secureRandom);
    }

    public static int invert(int i11, int i12) {
        int i13 = i11 % i12;
        if (i13 < 0) {
            i13 += i12;
        }
        return IntEuclidean.calculate(i13, i12).f43882x;
    }

    public static boolean is64BitJVM() {
        if (!IS_64_BITNESS_KNOWN) {
            String property = System.getProperty("os.arch");
            IS_64_BIT_JVM = "amd64".equals(property) || "x86_64".equals(property) || "ppc64".equals(property) || "64".equals(System.getProperty("sun.arch.data.model"));
            IS_64_BITNESS_KNOWN = true;
        }
        return IS_64_BIT_JVM;
    }

    public static int pow(int i11, int i12, int i13) {
        int i14 = 1;
        for (int i15 = 0; i15 < i12; i15++) {
            i14 = (i14 * i11) % i13;
        }
        return i14;
    }

    public static byte[] readFullLength(InputStream inputStream, int i11) {
        byte[] bArr = new byte[i11];
        if (inputStream.read(bArr) == i11) {
            return bArr;
        }
        throw new IOException("Not enough bytes to read.");
    }

    public static long pow(long j11, int i11, long j12) {
        long j13 = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            j13 = (j13 * j11) % j12;
        }
        return j13;
    }

    public static int[] generateRandomTernary(int i11, int i12, int i13, SecureRandom secureRandom) {
        Integer valueOf = Integers.valueOf(1);
        Integer valueOf2 = Integers.valueOf(-1);
        Integer valueOf3 = Integers.valueOf(0);
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < i12; i14++) {
            arrayList.add(valueOf);
        }
        for (int i15 = 0; i15 < i13; i15++) {
            arrayList.add(valueOf2);
        }
        while (arrayList.size() < i11) {
            arrayList.add(valueOf3);
        }
        Collections.shuffle(arrayList, secureRandom);
        int[] iArr = new int[i11];
        for (int i16 = 0; i16 < i11; i16++) {
            iArr[i16] = ((Integer) arrayList.get(i16)).intValue();
        }
        return iArr;
    }
}