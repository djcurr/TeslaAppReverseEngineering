package na;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public class t implements ha.a<InputStream> {

    /* renamed from: a  reason: collision with root package name */
    private final ka.b f40764a;

    public t(ka.b bVar) {
        this.f40764a = bVar;
    }

    @Override // ha.a
    /* renamed from: c */
    public boolean a(InputStream inputStream, File file, ha.e eVar) {
        byte[] bArr = (byte[]) this.f40764a.f(65536, byte[].class);
        boolean z11 = false;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                try {
                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read == -1) {
                                break;
                            }
                            fileOutputStream2.write(bArr, 0, read);
                        } catch (IOException e11) {
                            e = e11;
                            fileOutputStream = fileOutputStream2;
                            if (Log.isLoggable("StreamEncoder", 3)) {
                                Log.d("StreamEncoder", "Failed to encode data onto the OutputStream", e);
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            this.f40764a.e(bArr);
                            return z11;
                        } catch (Throwable th2) {
                            th = th2;
                            fileOutputStream = fileOutputStream2;
                            if (fileOutputStream != null) {
                                try {
                                    fileOutputStream.close();
                                } catch (IOException unused) {
                                }
                            }
                            this.f40764a.e(bArr);
                            throw th;
                        }
                    }
                    fileOutputStream2.close();
                    z11 = true;
                    fileOutputStream2.close();
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (IOException unused2) {
        }
        this.f40764a.e(bArr);
        return z11;
    }
}