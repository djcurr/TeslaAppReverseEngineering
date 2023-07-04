package s3;

import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import ch.qos.logback.core.joran.action.Action;
import expo.modules.contacts.EXColumns;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import s3.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static final Comparator<byte[]> f50199a = new a();

    /* loaded from: classes.dex */
    class a implements Comparator<byte[]> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(byte[] bArr, byte[] bArr2) {
            int i11;
            int i12;
            if (bArr.length != bArr2.length) {
                i11 = bArr.length;
                i12 = bArr2.length;
            } else {
                for (int i13 = 0; i13 < bArr.length; i13++) {
                    if (bArr[i13] != bArr2[i13]) {
                        i11 = bArr[i13];
                        i12 = bArr2[i13];
                    }
                }
                return 0;
            }
            return i11 - i12;
        }
    }

    private static List<byte[]> a(Signature[] signatureArr) {
        ArrayList arrayList = new ArrayList();
        for (Signature signature : signatureArr) {
            arrayList.add(signature.toByteArray());
        }
        return arrayList;
    }

    private static boolean b(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            if (!Arrays.equals(list.get(i11), list2.get(i11))) {
                return false;
            }
        }
        return true;
    }

    private static List<List<byte[]>> c(d dVar, Resources resources) {
        if (dVar.b() != null) {
            return dVar.b();
        }
        return l3.e.c(resources, dVar.c());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static f.a d(Context context, d dVar, CancellationSignal cancellationSignal) {
        ProviderInfo e11 = e(context.getPackageManager(), dVar, context.getResources());
        if (e11 == null) {
            return f.a.a(1, null);
        }
        return f.a.a(0, f(context, dVar, e11.authority, cancellationSignal));
    }

    static ProviderInfo e(PackageManager packageManager, d dVar, Resources resources) {
        String e11 = dVar.e();
        ProviderInfo resolveContentProvider = packageManager.resolveContentProvider(e11, 0);
        if (resolveContentProvider != null) {
            if (resolveContentProvider.packageName.equals(dVar.f())) {
                List<byte[]> a11 = a(packageManager.getPackageInfo(resolveContentProvider.packageName, 64).signatures);
                Collections.sort(a11, f50199a);
                List<List<byte[]>> c11 = c(dVar, resources);
                for (int i11 = 0; i11 < c11.size(); i11++) {
                    ArrayList arrayList = new ArrayList(c11.get(i11));
                    Collections.sort(arrayList, f50199a);
                    if (b(a11, arrayList)) {
                        return resolveContentProvider;
                    }
                }
                return null;
            }
            throw new PackageManager.NameNotFoundException("Found content provider " + e11 + ", but package was not " + dVar.f());
        }
        throw new PackageManager.NameNotFoundException("No package found for authority: " + e11);
    }

    static f.b[] f(Context context, d dVar, String str, CancellationSignal cancellationSignal) {
        int i11;
        Uri withAppendedId;
        boolean z11;
        int i12;
        ArrayList arrayList = new ArrayList();
        Uri build = new Uri.Builder().scheme("content").authority(str).build();
        Uri build2 = new Uri.Builder().scheme("content").authority(str).appendPath(Action.FILE_ATTRIBUTE).build();
        Cursor cursor = null;
        try {
            String[] strArr = {EXColumns.ID, "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
            int i13 = 0;
            if (Build.VERSION.SDK_INT > 16) {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.g()}, null, cancellationSignal);
            } else {
                cursor = context.getContentResolver().query(build, strArr, "query = ?", new String[]{dVar.g()}, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int columnIndex = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int columnIndex2 = cursor.getColumnIndex(EXColumns.ID);
                int columnIndex3 = cursor.getColumnIndex("file_id");
                int columnIndex4 = cursor.getColumnIndex("font_ttc_index");
                int columnIndex5 = cursor.getColumnIndex("font_weight");
                int columnIndex6 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int i14 = columnIndex != -1 ? cursor.getInt(columnIndex) : i13;
                    int i15 = columnIndex4 != -1 ? cursor.getInt(columnIndex4) : i13;
                    if (columnIndex3 == -1) {
                        i11 = i14;
                        withAppendedId = ContentUris.withAppendedId(build, cursor.getLong(columnIndex2));
                    } else {
                        i11 = i14;
                        withAppendedId = ContentUris.withAppendedId(build2, cursor.getLong(columnIndex3));
                    }
                    int i16 = columnIndex5 != -1 ? cursor.getInt(columnIndex5) : 400;
                    if (columnIndex6 == -1 || cursor.getInt(columnIndex6) != 1) {
                        z11 = false;
                        i12 = i11;
                    } else {
                        i12 = i11;
                        z11 = true;
                    }
                    arrayList2.add(f.b.a(withAppendedId, i15, i16, z11, i12));
                    i13 = 0;
                }
                arrayList = arrayList2;
            }
            return (f.b[]) arrayList.toArray(new f.b[0]);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}