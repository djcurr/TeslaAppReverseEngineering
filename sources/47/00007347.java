package hh;

import com.github.mangstadt.vinnie.codec.DecoderException;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;

/* loaded from: classes3.dex */
public class a {

    /* renamed from: b  reason: collision with root package name */
    private static final BitSet f29203b = new BitSet(256);

    /* renamed from: a  reason: collision with root package name */
    private final String f29204a;

    static {
        for (int i11 = 33; i11 <= 60; i11++) {
            f29203b.set(i11);
        }
        for (int i12 = 62; i12 <= 126; i12++) {
            f29203b.set(i12);
        }
        BitSet bitSet = f29203b;
        bitSet.set(9);
        bitSet.set(32);
    }

    public a(String str) {
        this.f29204a = str;
    }

    private static int b(byte b11) {
        int digit = Character.digit((char) b11, 16);
        if (digit != -1) {
            return digit;
        }
        throw new DecoderException("Invalid URL encoding: not a valid digit (radix 16): " + ((int) b11));
    }

    public String a(String str) {
        try {
            byte[] bytes = str.getBytes("US-ASCII");
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int i11 = 0;
            while (i11 < bytes.length) {
                byte b11 = bytes[i11];
                if (b11 == 61) {
                    int i12 = i11 + 1;
                    try {
                        int b12 = b(bytes[i12]);
                        i11 = i12 + 1;
                        byteArrayOutputStream.write((char) ((b12 << 4) + b(bytes[i11])));
                    } catch (ArrayIndexOutOfBoundsException e11) {
                        throw new DecoderException("Invalid quoted-printable encoding", e11);
                    }
                } else {
                    byteArrayOutputStream.write(b11);
                }
                i11++;
            }
            try {
                return new String(byteArrayOutputStream.toByteArray(), this.f29204a);
            } catch (UnsupportedEncodingException e12) {
                throw new DecoderException(e12);
            }
        } catch (UnsupportedEncodingException e13) {
            throw new DecoderException(e13);
        }
    }
}