package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.squareup.picasso.t;
import com.squareup.picasso.y;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class o extends g {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f20729b = {"orientation"};

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum a {
        MICRO(3, 96, 96),
        MINI(1, 512, 384),
        FULL(2, -1, -1);
        
        final int androidKind;
        final int height;
        final int width;

        a(int i11, int i12, int i13) {
            this.androidKind = i11;
            this.width = i12;
            this.height = i13;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(Context context) {
        super(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        r1.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static int k(android.content.ContentResolver r8, android.net.Uri r9) {
        /*
            r0 = 0
            r1 = 0
            java.lang.String[] r4 = com.squareup.picasso.o.f20729b     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r8
            r3 = r9
            android.database.Cursor r1 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            if (r1 == 0) goto L1e
            boolean r8 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            if (r8 != 0) goto L16
            goto L1e
        L16:
            int r8 = r1.getInt(r0)     // Catch: java.lang.Throwable -> L24 java.lang.RuntimeException -> L2b
            r1.close()
            return r8
        L1e:
            if (r1 == 0) goto L23
            r1.close()
        L23:
            return r0
        L24:
            r8 = move-exception
            if (r1 == 0) goto L2a
            r1.close()
        L2a:
            throw r8
        L2b:
            if (r1 == 0) goto L30
            r1.close()
        L30:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.o.k(android.content.ContentResolver, android.net.Uri):int");
    }

    static a l(int i11, int i12) {
        a aVar = a.MICRO;
        if (i11 > aVar.width || i12 > aVar.height) {
            a aVar2 = a.MINI;
            return (i11 > aVar2.width || i12 > aVar2.height) ? a.FULL : aVar2;
        }
        return aVar;
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public boolean c(w wVar) {
        Uri uri = wVar.f20779d;
        return "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    @Override // com.squareup.picasso.g, com.squareup.picasso.y
    public y.a f(w wVar, int i11) {
        Bitmap thumbnail;
        ContentResolver contentResolver = this.f20695a.getContentResolver();
        int k11 = k(contentResolver, wVar.f20779d);
        String type = contentResolver.getType(wVar.f20779d);
        boolean z11 = type != null && type.startsWith("video/");
        if (wVar.c()) {
            a l11 = l(wVar.f20783h, wVar.f20784i);
            if (!z11 && l11 == a.FULL) {
                return new y.a(null, okio.r.k(j(wVar)), t.e.DISK, k11);
            }
            long parseId = ContentUris.parseId(wVar.f20779d);
            BitmapFactory.Options d11 = y.d(wVar);
            d11.inJustDecodeBounds = true;
            y.a(wVar.f20783h, wVar.f20784i, l11.width, l11.height, d11, wVar);
            if (z11) {
                thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, parseId, l11 == a.FULL ? 1 : l11.androidKind, d11);
            } else {
                thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver, parseId, l11.androidKind, d11);
            }
            if (thumbnail != null) {
                return new y.a(thumbnail, null, t.e.DISK, k11);
            }
        }
        return new y.a(null, okio.r.k(j(wVar)), t.e.DISK, k11);
    }
}