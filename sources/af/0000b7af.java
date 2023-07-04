package ud;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import android.provider.MediaStore;
import ch.qos.logback.core.joran.action.Action;
import com.stripe.android.stripe3ds2.transactions.MessageExtension;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private static final Uri f53412a = Uri.withAppendedPath((Uri) wf.a.f(ContactsContract.AUTHORITY_URI), "display_photo");

    public static AssetFileDescriptor a(ContentResolver contentResolver, Uri uri) {
        if (i(uri)) {
            try {
                return contentResolver.openAssetFileDescriptor(uri, "r");
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public static String b(ContentResolver contentResolver, Uri uri) {
        int columnIndex;
        Cursor cursor = null;
        r1 = null;
        r1 = null;
        String string = null;
        if (i(uri)) {
            try {
                Cursor query = contentResolver.query(uri, null, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst() && (columnIndex = query.getColumnIndex("_data")) != -1) {
                            string = query.getString(columnIndex);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                if (query != null) {
                    query.close();
                    return string;
                }
                return string;
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (j(uri)) {
            return uri.getPath();
        } else {
            return null;
        }
    }

    public static String c(Uri uri) {
        if (uri == null) {
            return null;
        }
        return uri.getScheme();
    }

    public static Uri d(int i11) {
        return new Uri.Builder().scheme("res").path(String.valueOf(i11)).build();
    }

    public static boolean e(Uri uri) {
        return MessageExtension.FIELD_DATA.equals(c(uri));
    }

    public static boolean f(Uri uri) {
        return "asset".equals(c(uri));
    }

    public static boolean g(Uri uri) {
        String uri2 = uri.toString();
        return uri2.startsWith(MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString()) || uri2.startsWith(MediaStore.Images.Media.INTERNAL_CONTENT_URI.toString());
    }

    public static boolean h(Uri uri) {
        return uri.getPath() != null && i(uri) && "com.android.contacts".equals(uri.getAuthority()) && !uri.getPath().startsWith((String) wf.a.f(f53412a.getPath()));
    }

    public static boolean i(Uri uri) {
        return "content".equals(c(uri));
    }

    public static boolean j(Uri uri) {
        return Action.FILE_ATTRIBUTE.equals(c(uri));
    }

    public static boolean k(Uri uri) {
        return "res".equals(c(uri));
    }

    public static boolean l(Uri uri) {
        String c11 = c(uri);
        return "https".equals(c11) || "http".equals(c11);
    }

    public static boolean m(Uri uri) {
        return "android.resource".equals(c(uri));
    }

    public static URL n(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            return new URL(uri.toString());
        } catch (MalformedURLException e11) {
            throw new RuntimeException(e11);
        }
    }
}