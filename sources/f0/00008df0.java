package od;

import android.webkit.MimeTypeMap;
import java.util.Map;
import md.g;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final MimeTypeMap f42351a = MimeTypeMap.getSingleton();

    /* renamed from: b  reason: collision with root package name */
    private static final Map<String, String> f42352b = g.of("image/heif", "heif", "image/heic", "heic");

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, String> f42353c = g.of("heif", "image/heif", "heic", "image/heic");

    public static String a(String str) {
        String str2 = f42353c.get(str);
        return str2 != null ? str2 : f42351a.getMimeTypeFromExtension(str);
    }
}