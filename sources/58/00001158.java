package ch.qos.logback.core.pattern;

/* loaded from: classes.dex */
public class SpacePadder {
    static final String[] SPACES = {" ", "  ", "    ", "        ", "                ", "                                "};

    public static final void leftPad(StringBuilder sb2, String str, int i11) {
        int length = str != null ? str.length() : 0;
        if (length < i11) {
            spacePad(sb2, i11 - length);
        }
        if (str != null) {
            sb2.append(str);
        }
    }

    public static final void rightPad(StringBuilder sb2, String str, int i11) {
        int length = str != null ? str.length() : 0;
        if (str != null) {
            sb2.append(str);
        }
        if (length < i11) {
            spacePad(sb2, i11 - length);
        }
    }

    public static final void spacePad(StringBuilder sb2, int i11) {
        while (i11 >= 32) {
            sb2.append(SPACES[5]);
            i11 -= 32;
        }
        for (int i12 = 4; i12 >= 0; i12--) {
            if (((1 << i12) & i11) != 0) {
                sb2.append(SPACES[i12]);
            }
        }
    }
}