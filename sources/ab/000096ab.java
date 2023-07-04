package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;
import r70.m;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final c f43214a = new c();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f43214a.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            throw new DecoderException("exception decoding Hex string: " + e11.getMessage(), e11);
        }
    }

    public static byte[] b(String str) {
        try {
            return f43214a.b(str, 0, str.length());
        } catch (Exception e11) {
            throw new DecoderException("exception decoding Hex string: " + e11.getMessage(), e11);
        }
    }

    public static byte[] c(String str, int i11, int i12) {
        try {
            return f43214a.b(str, i11, i12);
        } catch (Exception e11) {
            throw new DecoderException("exception decoding Hex string: " + e11.getMessage(), e11);
        }
    }

    public static byte[] d(byte[] bArr) {
        return e(bArr, 0, bArr.length);
    }

    public static byte[] e(byte[] bArr, int i11, int i12) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            f43214a.encode(bArr, i11, i12, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            throw new EncoderException("exception encoding Hex string: " + e11.getMessage(), e11);
        }
    }

    public static String f(byte[] bArr) {
        return g(bArr, 0, bArr.length);
    }

    public static String g(byte[] bArr, int i11, int i12) {
        return m.b(e(bArr, i11, i12));
    }
}