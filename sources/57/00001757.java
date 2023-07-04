package com.facebook.imageutils;

import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.crypto.tls.CipherSuite;
import org.spongycastle.math.ec.Tnaf;

/* loaded from: classes3.dex */
public class f {
    private static boolean a(byte[] bArr, String str) {
        if (bArr.length != str.length()) {
            return false;
        }
        for (int i11 = 0; i11 < bArr.length; i11++) {
            if (str.charAt(i11) != bArr[i11]) {
                return false;
            }
        }
        return true;
    }

    public static int b(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) | (((byte) inputStream.read()) & 255);
    }

    private static byte c(InputStream inputStream) {
        return (byte) (inputStream.read() & 255);
    }

    private static String d(byte[] bArr) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b11 : bArr) {
            sb2.append((char) b11);
        }
        return sb2.toString();
    }

    private static int e(InputStream inputStream) {
        return ((((byte) inputStream.read()) << 24) & (-16777216)) | ((((byte) inputStream.read()) << Tnaf.POW_2_WIDTH) & 16711680) | ((((byte) inputStream.read()) << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) | (((byte) inputStream.read()) & 255);
    }

    private static short f(InputStream inputStream) {
        return (short) (inputStream.read() & 255);
    }

    public static Pair<Integer, Integer> g(InputStream inputStream) {
        byte[] bArr = new byte[4];
        try {
            try {
                try {
                    inputStream.read(bArr);
                } catch (IOException e11) {
                    e11.printStackTrace();
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e12) {
                e12.printStackTrace();
            }
            if (!a(bArr, "RIFF")) {
                try {
                    inputStream.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
                return null;
            }
            e(inputStream);
            inputStream.read(bArr);
            if (!a(bArr, "WEBP")) {
                try {
                    inputStream.close();
                } catch (IOException e14) {
                    e14.printStackTrace();
                }
                return null;
            }
            inputStream.read(bArr);
            String d11 = d(bArr);
            if ("VP8 ".equals(d11)) {
                Pair<Integer, Integer> h11 = h(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e15) {
                    e15.printStackTrace();
                }
                return h11;
            } else if ("VP8L".equals(d11)) {
                Pair<Integer, Integer> i11 = i(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
                return i11;
            } else if ("VP8X".equals(d11)) {
                Pair<Integer, Integer> j11 = j(inputStream);
                try {
                    inputStream.close();
                } catch (IOException e17) {
                    e17.printStackTrace();
                }
                return j11;
            } else {
                inputStream.close();
                return null;
            }
        } catch (Throwable th2) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e18) {
                    e18.printStackTrace();
                }
            }
            throw th2;
        }
    }

    private static Pair<Integer, Integer> h(InputStream inputStream) {
        inputStream.skip(7L);
        short f11 = f(inputStream);
        short f12 = f(inputStream);
        short f13 = f(inputStream);
        if (f11 == 157 && f12 == 1 && f13 == 42) {
            return new Pair<>(Integer.valueOf(b(inputStream)), Integer.valueOf(b(inputStream)));
        }
        return null;
    }

    private static Pair<Integer, Integer> i(InputStream inputStream) {
        e(inputStream);
        if (c(inputStream) != 47) {
            return null;
        }
        int read = ((byte) inputStream.read()) & 255;
        return new Pair<>(Integer.valueOf(((((byte) inputStream.read()) & 255) | ((read & 63) << 8)) + 1), Integer.valueOf(((((((byte) inputStream.read()) & 255) & 15) << 10) | ((((byte) inputStream.read()) & 255) << 2) | ((read & 192) >> 6)) + 1));
    }

    private static Pair<Integer, Integer> j(InputStream inputStream) {
        inputStream.skip(8L);
        return new Pair<>(Integer.valueOf(k(inputStream) + 1), Integer.valueOf(k(inputStream) + 1));
    }

    private static int k(InputStream inputStream) {
        byte c11 = c(inputStream);
        return ((c(inputStream) << Tnaf.POW_2_WIDTH) & 16711680) | ((c(inputStream) << 8) & CipherSuite.DRAFT_TLS_DHE_RSA_WITH_AES_128_OCB) | (c11 & 255);
    }
}