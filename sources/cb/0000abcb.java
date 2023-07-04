package pv;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.File;
import java.io.FileOutputStream;

/* loaded from: classes2.dex */
public final class u {
    private static final int a(BitmapFactory.Options options, int i11, int i12) {
        int c11;
        int c12;
        int i13 = options.outHeight;
        int i14 = options.outWidth;
        if (i13 > i12 || i14 > i11) {
            c11 = j00.c.c(i13 / i12);
            c12 = j00.c.c(i14 / i11);
            return Math.min(c11, c12);
        }
        return 1;
    }

    public static final void b(File file) {
        kotlin.jvm.internal.s.g(file, "file");
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getAbsolutePath(), options);
        String absolutePath = file.getAbsolutePath();
        BitmapFactory.Options options2 = new BitmapFactory.Options();
        options2.inSampleSize = a(options, 2000, 2000);
        vz.b0 b0Var = vz.b0.f54756a;
        Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options2);
        decodeFile.compress(Bitmap.CompressFormat.JPEG, 80, new FileOutputStream(file));
        decodeFile.recycle();
    }
}