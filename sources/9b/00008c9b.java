package nq;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;

/* loaded from: classes2.dex */
public class g {
    public static byte[] a(byte[] bArr) {
        Deflater deflater;
        DeflaterOutputStream deflaterOutputStream;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DeflaterOutputStream deflaterOutputStream2 = null;
        try {
            deflater = new Deflater(8, true);
            try {
                deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            deflater = null;
        }
        try {
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th4) {
            th = th4;
            deflaterOutputStream2 = deflaterOutputStream;
            if (deflaterOutputStream2 != null) {
                deflaterOutputStream2.close();
            }
            if (deflater != null) {
                deflater.end();
            }
            throw th;
        }
    }

    public static byte[] b(byte[] bArr) {
        Inflater inflater;
        InflaterInputStream inflaterInputStream;
        InflaterInputStream inflaterInputStream2 = null;
        try {
            inflater = new Inflater(true);
            try {
                inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr), inflater);
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            inflater = null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr2 = new byte[1024];
            while (true) {
                int read = inflaterInputStream.read(bArr2);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr2, 0, read);
                } else {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    inflaterInputStream.close();
                    inflater.end();
                    return byteArray;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            inflaterInputStream2 = inflaterInputStream;
            if (inflaterInputStream2 != null) {
                inflaterInputStream2.close();
            }
            if (inflater != null) {
                inflater.end();
            }
            throw th;
        }
    }
}