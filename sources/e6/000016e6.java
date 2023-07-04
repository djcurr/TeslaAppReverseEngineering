package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import expo.modules.contacts.EXColumns;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class d0 extends e0 implements d1<nf.e> {

    /* renamed from: d  reason: collision with root package name */
    private static final Class<?> f11368d = d0.class;

    /* renamed from: e  reason: collision with root package name */
    private static final String[] f11369e = {EXColumns.ID, "_data"};

    /* renamed from: f  reason: collision with root package name */
    private static final String[] f11370f = {"_data"};

    /* renamed from: g  reason: collision with root package name */
    private static final Rect f11371g = new Rect(0, 0, 512, 384);

    /* renamed from: h  reason: collision with root package name */
    private static final Rect f11372h = new Rect(0, 0, 96, 96);

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f11373c;

    public d0(Executor executor, pd.g gVar, ContentResolver contentResolver) {
        super(executor, gVar);
        this.f11373c = contentResolver;
    }

    private nf.e g(Uri uri, p001if.d dVar) {
        Cursor query;
        nf.e j11;
        if (dVar == null || (query = this.f11373c.query(uri, f11369e, null, null, null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (j11 = j(dVar, query.getLong(query.getColumnIndex(EXColumns.ID)))) == null) {
                return null;
            }
            j11.b1(i(query.getString(query.getColumnIndex("_data"))));
            return j11;
        } finally {
            query.close();
        }
    }

    private static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    private static int i(String str) {
        if (str != null) {
            try {
                return com.facebook.imageutils.c.a(new ExifInterface(str).getAttributeInt("Orientation", 1));
            } catch (IOException e11) {
                nd.a.i(f11368d, e11, "Unable to retrieve thumbnail rotation for %s", str);
            }
        }
        return 0;
    }

    private nf.e j(p001if.d dVar, long j11) {
        Cursor queryMiniThumbnail;
        int k11 = k(dVar);
        if (k11 == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f11373c, j11, k11, f11370f)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst()) {
                String str = (String) md.k.g(queryMiniThumbnail.getString(queryMiniThumbnail.getColumnIndex("_data")));
                if (new File(str).exists()) {
                    return e(new FileInputStream(str), h(str));
                }
            }
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }

    private static int k(p001if.d dVar) {
        Rect rect = f11372h;
        if (e1.b(rect.width(), rect.height(), dVar)) {
            return 3;
        }
        Rect rect2 = f11371g;
        return e1.b(rect2.width(), rect2.height(), dVar) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.d1
    public boolean a(p001if.d dVar) {
        Rect rect = f11371g;
        return e1.b(rect.width(), rect.height(), dVar);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected nf.e d(com.facebook.imagepipeline.request.a aVar) {
        Uri s11 = aVar.s();
        if (ud.d.g(s11)) {
            return g(s11, aVar.o());
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "LocalContentUriThumbnailFetchProducer";
    }
}