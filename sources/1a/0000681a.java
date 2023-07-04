package er;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import cr.b;
import java.io.File;

/* loaded from: classes2.dex */
public class a {
    public static void a(String str, com.reactnativecompressor.Video.a aVar, Promise promise, ReactApplicationContext reactApplicationContext) {
        float f11 = aVar.f20192d;
        float f12 = aVar.f20193e;
        try {
            String path = Uri.parse(str).getPath();
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(path);
            if (((float) new File(path).length()) / 1048576.0f > f12) {
                String d11 = b.d("mp4", reactApplicationContext);
                int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
                int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
                int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(20));
                float f13 = f11 / (parseInt2 > parseInt ? parseInt2 : parseInt);
                int round = Math.round((parseInt2 * f13) / 2.0f) * 2;
                int round2 = Math.round((parseInt * f13) / 2.0f) * 2;
                b.c(path, d11, round, round2, c(parseInt, parseInt2, parseInt3, round2, round), aVar.f20191c, promise, reactApplicationContext);
                return;
            }
            promise.resolve(str);
        } catch (Exception e11) {
            promise.reject(e11);
        }
    }

    private static int b(float f11) {
        return (int) (f11 * 2000.0f * 1000.0f * 1.13f);
    }

    public static int c(int i11, int i12, int i13, int i14, int i15) {
        int min = (int) (((int) (i13 / Math.min(i11 / i14, i12 / i15))) * 0.8f);
        int b11 = (int) (b(0.8f) / (921600.0f / (i15 * i14)));
        if (i13 < b11) {
            return min;
        }
        if (min > 1669000) {
            return 1669000;
        }
        return Math.max(min, b11);
    }
}