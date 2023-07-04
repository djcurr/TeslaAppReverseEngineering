package na;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class c implements ha.a<ByteBuffer> {
    @Override // ha.a
    /* renamed from: c */
    public boolean a(ByteBuffer byteBuffer, File file, ha.e eVar) {
        try {
            bb.a.e(byteBuffer, file);
            return true;
        } catch (IOException e11) {
            if (Log.isLoggable("ByteBufferEncoder", 3)) {
                Log.d("ByteBufferEncoder", "Failed to write data", e11);
            }
            return false;
        }
    }
}