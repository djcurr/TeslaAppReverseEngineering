package okhttp3.internal.http2;

import androidx.recyclerview.widget.l;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.model.Stripe3ds2AuthParams;
import kotlin.Metadata;
import kotlin.jvm.internal.s;
import okhttp3.internal.Util;
import okio.g;
import okio.h;
import okio.i;
import wz.o;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u001eB\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\bJ\u001e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nR\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00198\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lokhttp3/internal/http2/Huffman;", "", "", "symbol", PaymentMethodOptionsParams.Blik.PARAM_CODE, "codeBitCount", "Lvz/b0;", "addCode", "Lokio/i;", Stripe3ds2AuthParams.FIELD_SOURCE, "Lokio/g;", "sink", "encode", "bytes", "encodedLength", "Lokio/h;", "", "byteCount", "decode", "", "CODES", "[I", "", "CODE_BIT_COUNTS", "[B", "Lokhttp3/internal/http2/Huffman$Node;", "root", "Lokhttp3/internal/http2/Huffman$Node;", "<init>", "()V", "Node", "okhttp"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class Huffman {
    private static final int[] CODES;
    private static final byte[] CODE_BIT_COUNTS;
    public static final Huffman INSTANCE;
    private static final Node root;

    static {
        Huffman huffman = new Huffman();
        INSTANCE = huffman;
        CODES = new int[]{8184, 8388568, 268435426, 268435427, 268435428, 268435429, 268435430, 268435431, 268435432, 16777194, 1073741820, 268435433, 268435434, 1073741821, 268435435, 268435436, 268435437, 268435438, 268435439, 268435440, 268435441, 268435442, 1073741822, 268435443, 268435444, 268435445, 268435446, 268435447, 268435448, 268435449, 268435450, 268435451, 20, 1016, 1017, 4090, 8185, 21, 248, 2042, 1018, 1019, 249, 2043, l.f.DEFAULT_SWIPE_ANIMATION_DURATION, 22, 23, 24, 0, 1, 2, 25, 26, 27, 28, 29, 30, 31, 92, 251, 32764, 32, 4091, 1020, 8186, 33, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 252, 115, 253, 8187, 524272, 8188, 16380, 34, 32765, 3, 35, 4, 36, 5, 37, 38, 39, 6, 116, 117, 40, 41, 42, 7, 43, 118, 44, 8, 9, 45, 119, 120, 121, 122, 123, 32766, 2044, 16381, 8189, 268435452, 1048550, 4194258, 1048551, 1048552, 4194259, 4194260, 4194261, 8388569, 4194262, 8388570, 8388571, 8388572, 8388573, 8388574, 16777195, 8388575, 16777196, 16777197, 4194263, 8388576, 16777198, 8388577, 8388578, 8388579, 8388580, 2097116, 4194264, 8388581, 4194265, 8388582, 8388583, 16777199, 4194266, 2097117, 1048553, 4194267, 4194268, 8388584, 8388585, 2097118, 8388586, 4194269, 4194270, 16777200, 2097119, 4194271, 8388587, 8388588, 2097120, 2097121, 4194272, 2097122, 8388589, 4194273, 8388590, 8388591, 1048554, 4194274, 4194275, 4194276, 8388592, 4194277, 4194278, 8388593, 67108832, 67108833, 1048555, 524273, 4194279, 8388594, 4194280, 33554412, 67108834, 67108835, 67108836, 134217694, 134217695, 67108837, 16777201, 33554413, 524274, 2097123, 67108838, 134217696, 134217697, 67108839, 134217698, 16777202, 2097124, 2097125, 67108840, 67108841, 268435453, 134217699, 134217700, 134217701, 1048556, 16777203, 1048557, 2097126, 4194281, 2097127, 2097128, 8388595, 4194282, 4194283, 33554414, 33554415, 16777204, 16777205, 67108842, 8388596, 67108843, 134217702, 67108844, 67108845, 134217703, 134217704, 134217705, 134217706, 134217707, 268435454, 134217708, 134217709, 134217710, 134217711, 134217712, 67108846};
        byte[] bArr = {13, 23, 28, 28, 28, 28, 28, 28, 28, 24, 30, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 30, 28, 28, 28, 28, 28, 28, 28, 28, 28, 6, 10, 10, 12, 13, 6, 8, 11, 10, 10, 8, 11, 8, 6, 6, 6, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 7, 8, 15, 6, 12, 10, 13, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 7, 8, 13, 19, 13, 14, 6, 15, 5, 6, 5, 6, 5, 6, 6, 6, 5, 7, 7, 6, 6, 6, 5, 6, 7, 6, 5, 5, 6, 7, 7, 7, 7, 7, 15, 11, 14, 13, 28, 20, 22, 20, 20, 22, 22, 22, 23, 22, 23, 23, 23, 23, 23, 24, 23, 24, 24, 22, 23, 24, 23, 23, 23, 23, 21, 22, 23, 22, 23, 23, 24, 22, 21, 20, 22, 22, 23, 23, 21, 23, 22, 22, 24, 21, 22, 23, 23, 21, 21, 22, 21, 23, 22, 23, 23, 20, 22, 22, 22, 23, 22, 22, 23, 26, 26, 20, 19, 22, 23, 22, 25, 26, 26, 26, 27, 27, 26, 24, 25, 19, 21, 26, 27, 27, 26, 27, 24, 21, 21, 26, 26, 28, 27, 27, 27, 20, 24, 20, 21, 22, 21, 21, 23, 22, 22, 25, 25, 24, 24, 26, 23, 26, 27, 26, 26, 27, 27, 27, 27, 27, 28, 27, 27, 27, 27, 27, 26};
        CODE_BIT_COUNTS = bArr;
        root = new Node();
        int length = bArr.length;
        for (int i11 = 0; i11 < length; i11++) {
            huffman.addCode(i11, CODES[i11], CODE_BIT_COUNTS[i11]);
        }
    }

    private Huffman() {
    }

    private final void addCode(int i11, int i12, int i13) {
        Node node = new Node(i11, i13);
        Node node2 = root;
        while (i13 > 8) {
            i13 -= 8;
            int i14 = (i12 >>> i13) & 255;
            Node[] children = node2.getChildren();
            s.e(children);
            Node node3 = children[i14];
            if (node3 == null) {
                node3 = new Node();
                children[i14] = node3;
            }
            node2 = node3;
        }
        int i15 = 8 - i13;
        int i16 = (i12 << i15) & 255;
        Node[] children2 = node2.getChildren();
        s.e(children2);
        o.t(children2, node, i16, (1 << i15) + i16);
    }

    public final void decode(h source, long j11, g sink) {
        s.g(source, "source");
        s.g(sink, "sink");
        Node node = root;
        int i11 = 0;
        int i12 = 0;
        for (long j12 = 0; j12 < j11; j12++) {
            i11 = (i11 << 8) | Util.and(source.readByte(), 255);
            i12 += 8;
            while (i12 >= 8) {
                int i13 = i12 - 8;
                Node[] children = node.getChildren();
                s.e(children);
                node = children[(i11 >>> i13) & 255];
                s.e(node);
                if (node.getChildren() == null) {
                    sink.O0(node.getSymbol());
                    i12 -= node.getTerminalBitCount();
                    node = root;
                } else {
                    i12 = i13;
                }
            }
        }
        while (i12 > 0) {
            Node[] children2 = node.getChildren();
            s.e(children2);
            Node node2 = children2[(i11 << (8 - i12)) & 255];
            s.e(node2);
            if (node2.getChildren() != null || node2.getTerminalBitCount() > i12) {
                return;
            }
            sink.O0(node2.getSymbol());
            i12 -= node2.getTerminalBitCount();
            node = root;
        }
    }

    public final void encode(i source, g sink) {
        s.g(source, "source");
        s.g(sink, "sink");
        int z11 = source.z();
        long j11 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < z11; i12++) {
            int and = Util.and(source.g(i12), 255);
            int i13 = CODES[and];
            byte b11 = CODE_BIT_COUNTS[and];
            j11 = (j11 << b11) | i13;
            i11 += b11;
            while (i11 >= 8) {
                i11 = (i11 == true ? 1 : 0) - 8;
                sink.O0((int) (j11 >> i11));
            }
        }
        if (i11 > 0) {
            sink.O0((int) ((j11 << (8 - i11)) | (255 >>> i11)));
        }
    }

    public final int encodedLength(i bytes) {
        s.g(bytes, "bytes");
        int z11 = bytes.z();
        long j11 = 0;
        for (int i11 = 0; i11 < z11; i11++) {
            j11 += CODE_BIT_COUNTS[Util.and(bytes.g(i11), 255)];
        }
        return (int) ((j11 + 7) >> 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u000e\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0011R#\u0010\u0003\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\f\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000b¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/http2/Huffman$Node;", "", "", "children", "[Lokhttp3/internal/http2/Huffman$Node;", "getChildren", "()[Lokhttp3/internal/http2/Huffman$Node;", "", "symbol", "I", "getSymbol", "()I", "terminalBitCount", "getTerminalBitCount", "<init>", "()V", "bits", "(II)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    /* loaded from: classes5.dex */
    public static final class Node {
        private final Node[] children;
        private final int symbol;
        private final int terminalBitCount;

        public Node() {
            this.children = new Node[256];
            this.symbol = 0;
            this.terminalBitCount = 0;
        }

        public final Node[] getChildren() {
            return this.children;
        }

        public final int getSymbol() {
            return this.symbol;
        }

        public final int getTerminalBitCount() {
            return this.terminalBitCount;
        }

        public Node(int i11, int i12) {
            this.children = null;
            this.symbol = i11;
            int i13 = i12 & 7;
            this.terminalBitCount = i13 == 0 ? 8 : i13;
        }
    }
}