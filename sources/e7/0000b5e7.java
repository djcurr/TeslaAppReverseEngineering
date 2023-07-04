package tu;

import android.net.Uri;
import com.tesla.logging.g;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.s;

/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f52552a = new b();

    /* renamed from: b  reason: collision with root package name */
    private static final g f52553b = g.f21878b.a("ZipUtil");

    private b() {
    }

    public final void a(List<? extends Uri> uris, File zipFile) {
        s.g(uris, "uris");
        s.g(zipFile, "zipFile");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(zipFile);
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(fileOutputStream));
            byte[] bArr = new byte[512];
            int size = uris.size() - 1;
            if (size >= 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    File a11 = q3.b.a(uris.get(i11));
                    String name = a11.getName();
                    f52553b.i("Compressing: " + name + " and writing to " + zipFile);
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(a11), 512);
                    zipOutputStream.putNextEntry(new ZipEntry(i11 + "." + name));
                    while (true) {
                        int read = bufferedInputStream.read(bArr, 0, 512);
                        if (read == -1) {
                            break;
                        }
                        zipOutputStream.write(bArr, 0, read);
                    }
                    bufferedInputStream.close();
                    if (i12 > size) {
                        break;
                    }
                    i11 = i12;
                }
            }
            zipOutputStream.close();
            fileOutputStream.close();
            f52553b.i("Finished zipping to file: " + zipFile);
        } catch (Exception e11) {
            f52553b.f("Error zipping", e11);
        }
    }
}