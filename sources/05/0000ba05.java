package vd;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.FileDescriptor;

/* loaded from: classes.dex */
public interface b {

    /* loaded from: classes.dex */
    public interface a {
    }

    void a(a aVar);

    Bitmap b(FileDescriptor fileDescriptor, Rect rect, BitmapFactory.Options options);

    void c(vd.a aVar);
}