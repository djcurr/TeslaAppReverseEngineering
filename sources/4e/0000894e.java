package n2;

import java.util.List;

/* loaded from: classes.dex */
public final class g {
    public static final int a(List<i> paragraphInfoList, int i11) {
        char c11;
        kotlin.jvm.internal.s.g(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            i iVar = paragraphInfoList.get(i13);
            if (iVar.f() > i11) {
                c11 = 1;
            } else {
                c11 = iVar.b() <= i11 ? (char) 65535 : (char) 0;
            }
            if (c11 < 0) {
                i12 = i13 + 1;
            } else if (c11 <= 0) {
                return i13;
            } else {
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int b(List<i> paragraphInfoList, int i11) {
        char c11;
        kotlin.jvm.internal.s.g(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            i iVar = paragraphInfoList.get(i13);
            if (iVar.g() > i11) {
                c11 = 1;
            } else {
                c11 = iVar.c() <= i11 ? (char) 65535 : (char) 0;
            }
            if (c11 < 0) {
                i12 = i13 + 1;
            } else if (c11 <= 0) {
                return i13;
            } else {
                size = i13 - 1;
            }
        }
        return -(i12 + 1);
    }

    public static final int c(List<i> paragraphInfoList, float f11) {
        char c11;
        kotlin.jvm.internal.s.g(paragraphInfoList, "paragraphInfoList");
        int size = paragraphInfoList.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            i iVar = paragraphInfoList.get(i12);
            if (iVar.h() > f11) {
                c11 = 1;
            } else {
                c11 = iVar.a() <= f11 ? (char) 65535 : (char) 0;
            }
            if (c11 < 0) {
                i11 = i12 + 1;
            } else if (c11 <= 0) {
                return i12;
            } else {
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }
}