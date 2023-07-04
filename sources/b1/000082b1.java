package l6;

import java.io.PushbackReader;
import java.io.Reader;

/* loaded from: classes.dex */
public class b extends PushbackReader {

    /* renamed from: a  reason: collision with root package name */
    private int f36998a;

    /* renamed from: b  reason: collision with root package name */
    private int f36999b;

    /* renamed from: c  reason: collision with root package name */
    private int f37000c;

    public b(Reader reader) {
        super(reader, 8);
        this.f36998a = 0;
        this.f36999b = 0;
        this.f37000c = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
        if (l6.h.c((char) r10.f36999b) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0082, code lost:
        if (l6.h.c((char) r10.f36999b) != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private char a(char r11) {
        /*
            r10 = this;
            int r0 = r10.f36998a
            r1 = 1
            if (r0 == 0) goto Lad
            r2 = 2
            r3 = 5
            if (r0 == r1) goto La3
            r4 = 10
            r5 = 57
            r6 = 48
            r7 = 3
            r8 = 4
            r9 = 0
            if (r0 == r2) goto L86
            r2 = 59
            if (r0 == r7) goto L4c
            if (r0 == r8) goto L20
            if (r0 == r3) goto L1d
            return r11
        L1d:
            r10.f36998a = r9
            return r11
        L20:
            if (r6 > r11) goto L38
            if (r11 > r5) goto L38
            int r0 = r10.f36999b
            int r0 = r0 * r4
            int r2 = java.lang.Character.digit(r11, r4)
            int r0 = r0 + r2
            r10.f36999b = r0
            int r0 = r10.f37000c
            int r0 = r0 + r1
            r10.f37000c = r0
            if (r0 > r3) goto L49
            r10.f36998a = r8
            goto L4b
        L38:
            if (r11 != r2) goto L49
            int r0 = r10.f36999b
            char r0 = (char) r0
            boolean r0 = l6.h.c(r0)
            if (r0 == 0) goto L49
        L43:
            r10.f36998a = r9
            int r11 = r10.f36999b
            char r11 = (char) r11
            return r11
        L49:
            r10.f36998a = r3
        L4b:
            return r11
        L4c:
            if (r6 > r11) goto L50
            if (r11 <= r5) goto L60
        L50:
            r0 = 97
            if (r0 > r11) goto L58
            r0 = 102(0x66, float:1.43E-43)
            if (r11 <= r0) goto L60
        L58:
            r0 = 65
            if (r0 > r11) goto L79
            r0 = 70
            if (r11 > r0) goto L79
        L60:
            int r0 = r10.f36999b
            r2 = 16
            int r0 = r0 * r2
            int r2 = java.lang.Character.digit(r11, r2)
            int r0 = r0 + r2
            r10.f36999b = r0
            int r0 = r10.f37000c
            int r0 = r0 + r1
            r10.f37000c = r0
            if (r0 > r8) goto L76
            r10.f36998a = r7
            goto L85
        L76:
            r10.f36998a = r3
            goto L85
        L79:
            if (r11 != r2) goto L76
            int r0 = r10.f36999b
            char r0 = (char) r0
            boolean r0 = l6.h.c(r0)
            if (r0 == 0) goto L76
            goto L43
        L85:
            return r11
        L86:
            r0 = 120(0x78, float:1.68E-43)
            if (r11 != r0) goto L91
            r10.f36999b = r9
            r10.f37000c = r9
            r10.f36998a = r7
            goto La2
        L91:
            if (r6 > r11) goto La0
            if (r11 > r5) goto La0
            int r0 = java.lang.Character.digit(r11, r4)
            r10.f36999b = r0
            r10.f37000c = r1
            r10.f36998a = r8
            goto La2
        La0:
            r10.f36998a = r3
        La2:
            return r11
        La3:
            r0 = 35
            if (r11 != r0) goto Laa
            r10.f36998a = r2
            goto Lac
        Laa:
            r10.f36998a = r3
        Lac:
            return r11
        Lad:
            r0 = 38
            if (r11 != r0) goto Lb3
            r10.f36998a = r1
        Lb3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: l6.b.a(char):char");
    }

    @Override // java.io.PushbackReader, java.io.FilterReader, java.io.Reader
    public int read(char[] cArr, int i11, int i12) {
        boolean z11;
        char[] cArr2 = new char[8];
        int i13 = 0;
        int i14 = 0;
        loop0: while (true) {
            z11 = true;
            while (z11 && i13 < i12) {
                z11 = super.read(cArr2, i14, 1) == 1;
                if (z11) {
                    char a11 = a(cArr2[i14]);
                    int i15 = this.f36998a;
                    if (i15 == 0) {
                        if (h.c(a11)) {
                            a11 = ' ';
                        }
                        cArr[i11] = a11;
                        i13++;
                        i11++;
                    } else {
                        i14++;
                        if (i15 == 5) {
                            unread(cArr2, 0, i14);
                        }
                    }
                    i14 = 0;
                } else if (i14 > 0) {
                    break;
                }
            }
            unread(cArr2, 0, i14);
            this.f36998a = 5;
            i14 = 0;
        }
        if (i13 > 0 || z11) {
            return i13;
        }
        return -1;
    }
}