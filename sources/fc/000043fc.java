package com.plaid.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.plaid.internal.wa;
import f.a;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class gc extends f.a<vz.b0, Uri> {

    /* renamed from: a  reason: collision with root package name */
    public final e9 f18677a;

    /* renamed from: b  reason: collision with root package name */
    public final f.g f18678b;

    /* renamed from: c  reason: collision with root package name */
    public AtomicReference<Uri> f18679c;

    public gc(e9 internalPictureStorage) {
        kotlin.jvm.internal.s.g(internalPictureStorage, "internalPictureStorage");
        this.f18677a = internalPictureStorage;
        this.f18678b = new f.g();
        this.f18679c = new AtomicReference<>();
    }

    @Override // f.a
    public Intent createIntent(Context context, vz.b0 b0Var) {
        Uri uri;
        Object b11;
        vz.b0 input = b0Var;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(input, "input");
        try {
            b11 = v20.j.b(null, new fc(this, null), 1, null);
            uri = FileProvider.getUriForFile(context, kotlin.jvm.internal.s.p(context.getPackageName(), ".com.plaid.link.internal.PlaidFileProvider"), (File) b11);
            kotlin.jvm.internal.s.f(uri, "private fun Context.crea…      Uri.EMPTY\n    }\n  }");
        } catch (IOException e11) {
            wa.a.a(wa.f19678a, (Throwable) e11, "Unable to create file", false, 4);
            uri = Uri.EMPTY;
            kotlin.jvm.internal.s.f(uri, "{\n      Plog.e(e, \"Unabl…e\")\n      Uri.EMPTY\n    }");
        }
        if (this.f18679c.compareAndSet(null, uri)) {
            wa.a.b(wa.f19678a, "Result URI was already set", false, 2);
        }
        Intent createIntent = this.f18678b.createIntent(context, uri);
        kotlin.jvm.internal.s.f(createIntent, "cameraContract.createIntent(context, fileUri)");
        createIntent.addFlags(2);
        return createIntent;
    }

    @Override // f.a
    public a.C0496a<Uri> getSynchronousResult(Context context, vz.b0 b0Var) {
        vz.b0 input = b0Var;
        kotlin.jvm.internal.s.g(context, "context");
        kotlin.jvm.internal.s.g(input, "input");
        return null;
    }

    @Override // f.a
    public Uri parseResult(int i11, Intent intent) {
        if (i11 != -1) {
            Uri EMPTY = Uri.EMPTY;
            kotlin.jvm.internal.s.f(EMPTY, "EMPTY");
            return EMPTY;
        }
        Uri andSet = this.f18679c.getAndSet(null);
        if (andSet != null) {
            return andSet;
        }
        wa.a.b(wa.f19678a, "Result URI should not be null", false, 2);
        Uri uri = Uri.EMPTY;
        kotlin.jvm.internal.s.f(uri, "{\n      Plog.e(\"Result U…l\")\n      Uri.EMPTY\n    }");
        return uri;
    }
}