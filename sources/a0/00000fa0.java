package c4;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private Context f8872a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f8873b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(a aVar, Context context, Uri uri) {
        super(aVar);
        this.f8872a = context;
        this.f8873b = uri;
    }

    @Override // c4.a
    public boolean a() {
        return b.a(this.f8872a, this.f8873b);
    }

    @Override // c4.a
    public boolean b() {
        return b.b(this.f8872a, this.f8873b);
    }

    @Override // c4.a
    public a c(String str) {
        throw new UnsupportedOperationException();
    }

    @Override // c4.a
    public a d(String str, String str2) {
        throw new UnsupportedOperationException();
    }

    @Override // c4.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f8872a.getContentResolver(), this.f8873b);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // c4.a
    public boolean f() {
        return b.d(this.f8872a, this.f8873b);
    }

    @Override // c4.a
    public String i() {
        return b.e(this.f8872a, this.f8873b);
    }

    @Override // c4.a
    public Uri j() {
        return this.f8873b;
    }

    @Override // c4.a
    public boolean k() {
        return b.g(this.f8872a, this.f8873b);
    }

    @Override // c4.a
    public boolean l() {
        return b.h(this.f8872a, this.f8873b);
    }

    @Override // c4.a
    public a[] m() {
        throw new UnsupportedOperationException();
    }
}