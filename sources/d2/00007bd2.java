package ji;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.Extractor;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface l {
    default Extractor[] a(Uri uri, Map<String, List<String>> map) {
        return b();
    }

    h[] b();
}