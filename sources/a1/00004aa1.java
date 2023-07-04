package com.squareup.picasso;

import android.content.ContentResolver;
import android.content.Context;
import android.content.UriMatcher;
import android.net.Uri;
import android.provider.ContactsContract;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.InputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class f extends y {

    /* renamed from: b  reason: collision with root package name */
    private static final UriMatcher f20693b;

    /* renamed from: a  reason: collision with root package name */
    private final Context f20694a;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        f20693b = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "display_photo/#", 4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(Context context) {
        this.f20694a = context;
    }

    private InputStream j(w wVar) {
        ContentResolver contentResolver = this.f20694a.getContentResolver();
        Uri uri = wVar.f20779d;
        int match = f20693b.match(uri);
        if (match != 1) {
            if (match != 2) {
                if (match != 3) {
                    if (match != 4) {
                        throw new IllegalStateException("Invalid uri: " + uri);
                    }
                }
            }
            return contentResolver.openInputStream(uri);
        }
        uri = ContactsContract.Contacts.lookupContact(contentResolver, uri);
        if (uri == null) {
            return null;
        }
        return ContactsContract.Contacts.openContactPhotoInputStream(contentResolver, uri, true);
    }

    @Override // com.squareup.picasso.y
    public boolean c(w wVar) {
        Uri uri = wVar.f20779d;
        return "content".equals(uri.getScheme()) && ContactsContract.Contacts.CONTENT_URI.getHost().equals(uri.getHost()) && f20693b.match(wVar.f20779d) != -1;
    }

    @Override // com.squareup.picasso.y
    public y.a f(w wVar, int i11) {
        InputStream j11 = j(wVar);
        if (j11 == null) {
            return null;
        }
        return new y.a(okio.r.k(j11), t.e.DISK);
    }
}