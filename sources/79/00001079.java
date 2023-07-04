package ch.qos.logback.classic.pattern;

import java.io.PrintStream;

/* loaded from: classes.dex */
public class TargetLengthBasedClassNameAbbreviator implements Abbreviator {
    final int targetLength;

    public TargetLengthBasedClassNameAbbreviator(int i11) {
        this.targetLength = i11;
    }

    static int computeDotIndexes(String str, int[] iArr) {
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int indexOf = str.indexOf(46, i11);
            if (indexOf == -1 || i12 >= 16) {
                break;
            }
            iArr[i12] = indexOf;
            i12++;
            i11 = indexOf + 1;
        }
        return i12;
    }

    static void printArray(String str, int[] iArr) {
        System.out.print(str);
        for (int i11 = 0; i11 < iArr.length; i11++) {
            PrintStream printStream = System.out;
            if (i11 == 0) {
                printStream.print(iArr[i11]);
            } else {
                printStream.print(", " + iArr[i11]);
            }
        }
        System.out.println();
    }

    @Override // ch.qos.logback.classic.pattern.Abbreviator
    public String abbreviate(String str) {
        String substring;
        StringBuilder sb2 = new StringBuilder(this.targetLength);
        if (str != null) {
            if (str.length() < this.targetLength) {
                return str;
            }
            int[] iArr = new int[16];
            int[] iArr2 = new int[17];
            int computeDotIndexes = computeDotIndexes(str, iArr);
            if (computeDotIndexes == 0) {
                return str;
            }
            computeLengthArray(str, iArr, iArr2, computeDotIndexes);
            for (int i11 = 0; i11 <= computeDotIndexes; i11++) {
                if (i11 == 0) {
                    substring = str.substring(0, iArr2[i11] - 1);
                } else {
                    int i12 = i11 - 1;
                    substring = str.substring(iArr[i12], iArr[i12] + iArr2[i11]);
                }
                sb2.append(substring);
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("Class name may not be null");
    }

    void computeLengthArray(String str, int[] iArr, int[] iArr2, int i11) {
        int length = str.length() - this.targetLength;
        int i12 = 0;
        while (i12 < i11) {
            int i13 = (iArr[i12] - (i12 > 0 ? iArr[i12 - 1] : -1)) - 1;
            int i14 = (length <= 0 || i13 < 1) ? i13 : 1;
            length -= i13 - i14;
            iArr2[i12] = i14 + 1;
            i12++;
        }
        iArr2[i11] = str.length() - iArr[i11 - 1];
    }
}