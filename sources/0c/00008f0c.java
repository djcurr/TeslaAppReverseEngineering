package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import okhttp3.internal.Util;
import okio.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0011\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b+\u0010,J.\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004J\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004R\u0016\u0010\u0010\u001a\u00020\u000f8\u0006@\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0013R\u0016\u0010\u0019\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013R\u0016\u0010\u001a\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0013R\u0016\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0013R\u0016\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0013R\u0016\u0010\u001d\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0013R\u0016\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0013R\u0016\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0013R\u0016\u0010 \u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0013R\u0016\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0013R\u0016\u0010\"\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0013R\u0016\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u0013R\u0016\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0013R\u0016\u0010%\u001a\u00020\u00048\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0013R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u001e\u0010)\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u001c\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006-"}, d2 = {"Lokhttp3/internal/http2/Http2;", "", "", "inbound", "", "streamId", "length", "type", "flags", "", "frameLog", "formattedType$okhttp", "(I)Ljava/lang/String;", "formattedType", "formatFlags", "Lokio/i;", "CONNECTION_PREFACE", "Lokio/i;", "INITIAL_MAX_FRAME_SIZE", "I", "TYPE_DATA", "TYPE_HEADERS", "TYPE_PRIORITY", "TYPE_RST_STREAM", "TYPE_SETTINGS", "TYPE_PUSH_PROMISE", "TYPE_PING", "TYPE_GOAWAY", "TYPE_WINDOW_UPDATE", "TYPE_CONTINUATION", "FLAG_NONE", "FLAG_ACK", "FLAG_END_STREAM", "FLAG_END_HEADERS", "FLAG_END_PUSH_PROMISE", "FLAG_PADDED", "FLAG_PRIORITY", "FLAG_COMPRESSED", "", "FRAME_NAMES", "[Ljava/lang/String;", "FLAGS", "BINARY", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Http2 {
    private static final String[] BINARY;
    public static final int FLAG_ACK = 1;
    public static final int FLAG_COMPRESSED = 32;
    public static final int FLAG_END_HEADERS = 4;
    public static final int FLAG_END_PUSH_PROMISE = 4;
    public static final int FLAG_END_STREAM = 1;
    public static final int FLAG_NONE = 0;
    public static final int FLAG_PADDED = 8;
    public static final int FLAG_PRIORITY = 32;
    public static final int INITIAL_MAX_FRAME_SIZE = 16384;
    public static final int TYPE_CONTINUATION = 9;
    public static final int TYPE_DATA = 0;
    public static final int TYPE_GOAWAY = 7;
    public static final int TYPE_HEADERS = 1;
    public static final int TYPE_PING = 6;
    public static final int TYPE_PRIORITY = 2;
    public static final int TYPE_PUSH_PROMISE = 5;
    public static final int TYPE_RST_STREAM = 3;
    public static final int TYPE_SETTINGS = 4;
    public static final int TYPE_WINDOW_UPDATE = 8;
    public static final Http2 INSTANCE = new Http2();
    public static final i CONNECTION_PREFACE = i.f42657e.e("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    private static final String[] FRAME_NAMES = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final String[] FLAGS = new String[64];

    static {
        String C;
        String[] strArr = new String[256];
        for (int i11 = 0; i11 < 256; i11++) {
            String binaryString = Integer.toBinaryString(i11);
            s.f(binaryString, "Integer.toBinaryString(it)");
            C = v.C(Util.format("%8s", binaryString), ' ', '0', false, 4, null);
            strArr[i11] = C;
        }
        BINARY = strArr;
        String[] strArr2 = FLAGS;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i12 = 0; i12 < 1; i12++) {
            int i13 = iArr[i12];
            String[] strArr3 = FLAGS;
            strArr3[i13 | 8] = s.p(strArr3[i13], "|PADDED");
        }
        String[] strArr4 = FLAGS;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i14 = 0; i14 < 3; i14++) {
            int i15 = iArr2[i14];
            for (int i16 = 0; i16 < 1; i16++) {
                int i17 = iArr[i16];
                String[] strArr5 = FLAGS;
                int i18 = i17 | i15;
                strArr5[i18] = strArr5[i17] + "|" + strArr5[i15];
                strArr5[i18 | 8] = strArr5[i17] + "|" + strArr5[i15] + "|PADDED";
            }
        }
        int length = FLAGS.length;
        for (int i19 = 0; i19 < length; i19++) {
            String[] strArr6 = FLAGS;
            if (strArr6[i19] == null) {
                strArr6[i19] = BINARY[i19];
            }
        }
    }

    private Http2() {
    }

    public final String formatFlags(int i11, int i12) {
        String str;
        String D;
        String D2;
        if (i12 == 0) {
            return "";
        }
        if (i11 != 2 && i11 != 3) {
            if (i11 == 4 || i11 == 6) {
                return i12 == 1 ? "ACK" : BINARY[i12];
            } else if (i11 != 7 && i11 != 8) {
                String[] strArr = FLAGS;
                if (i12 < strArr.length) {
                    str = strArr[i12];
                    s.e(str);
                } else {
                    str = BINARY[i12];
                }
                String str2 = str;
                if (i11 == 5 && (i12 & 4) != 0) {
                    D2 = v.D(str2, "HEADERS", "PUSH_PROMISE", false, 4, null);
                    return D2;
                } else if (i11 != 0 || (i12 & 32) == 0) {
                    return str2;
                } else {
                    D = v.D(str2, "PRIORITY", "COMPRESSED", false, 4, null);
                    return D;
                }
            }
        }
        return BINARY[i12];
    }

    public final String formattedType$okhttp(int i11) {
        String[] strArr = FRAME_NAMES;
        return i11 < strArr.length ? strArr[i11] : Util.format("0x%02x", Integer.valueOf(i11));
    }

    public final String frameLog(boolean z11, int i11, int i12, int i13, int i14) {
        return Util.format("%s 0x%08x %5d %-13s %s", z11 ? "<<" : ">>", Integer.valueOf(i11), Integer.valueOf(i12), formattedType$okhttp(i13), formatFlags(i13, i14));
    }
}