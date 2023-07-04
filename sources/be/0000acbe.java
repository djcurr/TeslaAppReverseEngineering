package q30;

import kotlin.jvm.internal.s;
import okio.f;
import okio.i;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f47366a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final /* synthetic */ int a(byte[] bArr, int i11) {
        return c(bArr, i11);
    }

    public static final /* synthetic */ int b(char c11) {
        return e(c11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006b, code lost:
        return -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int c(byte[] r19, int r20) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: q30.b.c(byte[], int):int");
    }

    public static final void d(i commonWrite, f buffer, int i11, int i12) {
        s.g(commonWrite, "$this$commonWrite");
        s.g(buffer, "buffer");
        buffer.o(commonWrite.h(), i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(char c11) {
        if ('0' <= c11 && '9' >= c11) {
            return c11 - '0';
        }
        char c12 = 'a';
        if ('a' > c11 || 'f' < c11) {
            c12 = 'A';
            if ('A' > c11 || 'F' < c11) {
                throw new IllegalArgumentException("Unexpected hex digit: " + c11);
            }
        }
        return (c11 - c12) + 10;
    }

    public static final char[] f() {
        return f47366a;
    }
}