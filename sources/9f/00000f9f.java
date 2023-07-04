package c4;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;

/* loaded from: classes.dex */
class b {
    public static boolean a(Context context, Uri uri) {
        return context.checkCallingOrSelfUriPermission(uri, 1) == 0 && !TextUtils.isEmpty(f(context, uri));
    }

    public static boolean b(Context context, Uri uri) {
        if (context.checkCallingOrSelfUriPermission(uri, 2) != 0) {
            return false;
        }
        String f11 = f(context, uri);
        int i11 = i(context, uri, "flags", 0);
        if (TextUtils.isEmpty(f11)) {
            return false;
        }
        if ((i11 & 4) != 0) {
            return true;
        }
        if (!"vnd.android.document/directory".equals(f11) || (i11 & 8) == 0) {
            return (TextUtils.isEmpty(f11) || (i11 & 2) == 0) ? false : true;
        }
        return true;
    }

    private static void c(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused) {
            }
        }
    }

    public static boolean d(Context context, Uri uri) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{"document_id"}, null, null, null);
            return cursor.getCount() > 0;
        } catch (Exception e11) {
            Log.w("DocumentFile", "Failed query: " + e11);
            return false;
        } finally {
            c(cursor);
        }
    }

    public static String e(Context context, Uri uri) {
        return k(context, uri, "_display_name", null);
    }

    private static String f(Context context, Uri uri) {
        return k(context, uri, "mime_type", null);
    }

    public static boolean g(Context context, Uri uri) {
        return "vnd.android.document/directory".equals(f(context, uri));
    }

    public static boolean h(Context context, Uri uri) {
        String f11 = f(context, uri);
        return ("vnd.android.document/directory".equals(f11) || TextUtils.isEmpty(f11)) ? false : true;
    }

    private static int i(Context context, Uri uri, String str, int i11) {
        return (int) j(context, uri, str, i11);
    }

    private static long j(Context context, Uri uri, String str, long j11) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? j11 : cursor.getLong(0);
        } catch (Exception e11) {
            Log.w("DocumentFile", "Failed query: " + e11);
            return j11;
        } finally {
            c(cursor);
        }
    }

    private static String k(Context context, Uri uri, String str, String str2) {
        Cursor cursor = null;
        try {
            cursor = context.getContentResolver().query(uri, new String[]{str}, null, null, null);
            return (!cursor.moveToFirst() || cursor.isNull(0)) ? str2 : cursor.getString(0);
        } catch (Exception e11) {
            Log.w("DocumentFile", "Failed query: " + e11);
            return str2;
        } finally {
            c(cursor);
        }
    }
}