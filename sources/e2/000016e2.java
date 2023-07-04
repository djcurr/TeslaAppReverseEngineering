package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.provider.ContactsContract;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public class c0 extends e0 {

    /* renamed from: c  reason: collision with root package name */
    private final ContentResolver f11348c;

    public c0(Executor executor, pd.g gVar, ContentResolver contentResolver) {
        super(executor, gVar);
        this.f11348c = contentResolver;
    }

    private nf.e g(Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = this.f11348c.openFileDescriptor(uri, "r");
            return e(new FileInputStream(openFileDescriptor.getFileDescriptor()), (int) openFileDescriptor.getStatSize());
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected nf.e d(com.facebook.imagepipeline.request.a aVar) {
        nf.e g11;
        InputStream createInputStream;
        Uri s11 = aVar.s();
        if (!ud.d.h(s11)) {
            return (!ud.d.g(s11) || (g11 = g(s11)) == null) ? e(this.f11348c.openInputStream(s11), -1) : g11;
        }
        if (s11.toString().endsWith("/photo")) {
            createInputStream = this.f11348c.openInputStream(s11);
        } else if (s11.toString().endsWith("/display_photo")) {
            try {
                createInputStream = this.f11348c.openAssetFileDescriptor(s11, "r").createInputStream();
            } catch (IOException unused) {
                throw new IOException("Contact photo does not exist: " + s11);
            }
        } else {
            InputStream openContactPhotoInputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f11348c, s11);
            if (openContactPhotoInputStream == null) {
                throw new IOException("Contact photo does not exist: " + s11);
            }
            createInputStream = openContactPhotoInputStream;
        }
        return e(createInputStream, -1);
    }

    @Override // com.facebook.imagepipeline.producers.e0
    protected String f() {
        return "LocalContentUriFetchProducer";
    }
}