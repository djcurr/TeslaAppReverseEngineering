package ta;

import android.util.Log;
import java.io.File;
import java.io.IOException;

/* loaded from: classes.dex */
public class d implements ha.g<c> {
    @Override // ha.g
    public com.bumptech.glide.load.c b(ha.e eVar) {
        return com.bumptech.glide.load.c.SOURCE;
    }

    @Override // ha.a
    /* renamed from: c */
    public boolean a(ja.c<c> cVar, File file, ha.e eVar) {
        try {
            bb.a.e(cVar.get().c(), file);
            return true;
        } catch (IOException e11) {
            if (Log.isLoggable("GifEncoder", 5)) {
                Log.w("GifEncoder", "Failed to encode GIF drawable data", e11);
            }
            return false;
        }
    }
}