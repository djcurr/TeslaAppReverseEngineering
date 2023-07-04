package org.bouncycastle.util.encoders;

import java.io.ByteArrayOutputStream;

/* loaded from: classes5.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final s70.b f43213a = new s70.a();

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((str.length() / 4) * 3);
        try {
            f43213a.decode(str, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            throw new DecoderException("unable to decode base64 string: " + e11.getMessage(), e11);
        }
    }

    public static byte[] b(byte[] bArr) {
        return c(bArr, 0, bArr.length);
    }

    public static byte[] c(byte[] bArr, int i11, int i12) {
        s70.b bVar = f43213a;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bVar.a(i12));
        try {
            bVar.encode(bArr, i11, i12, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (Exception e11) {
            throw new EncoderException("exception encoding base64 string: " + e11.getMessage(), e11);
        }
    }
}