package com.plaid.internal;

import android.content.Context;
import java.io.File;

/* loaded from: classes2.dex */
public final class ma {

    /* renamed from: b  reason: collision with root package name */
    public static final a f19046b = new a();

    /* renamed from: c  reason: collision with root package name */
    public static volatile ma f19047c;

    /* renamed from: a  reason: collision with root package name */
    public final Context f19048a;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    public ma(Context app) {
        kotlin.jvm.internal.s.g(app, "app");
        this.f19048a = app.getApplicationContext();
    }

    public final void a(String fileName, String data) {
        kotlin.jvm.internal.s.g(fileName, "fileName");
        kotlin.jvm.internal.s.g(data, "data");
        File parentDirectory = this.f19048a.getFilesDir();
        kotlin.jvm.internal.s.f(parentDirectory, "appContext.filesDir");
        kotlin.jvm.internal.s.g(parentDirectory, "parentDirectory");
        kotlin.jvm.internal.s.g(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
        } else {
            file.delete();
            file.createNewFile();
        }
        e00.h.i(file, data, null, 2, null);
    }

    public final String b(String fileName) {
        String f11;
        kotlin.jvm.internal.s.g(fileName, "fileName");
        File parentDirectory = this.f19048a.getFilesDir();
        kotlin.jvm.internal.s.f(parentDirectory, "appContext.filesDir");
        kotlin.jvm.internal.s.g(parentDirectory, "parentDirectory");
        kotlin.jvm.internal.s.g(fileName, "fileName");
        if (!parentDirectory.exists()) {
            parentDirectory.mkdirs();
        }
        File file = new File(parentDirectory, fileName);
        if (!file.exists()) {
            file.createNewFile();
        }
        f11 = e00.h.f(file, null, 1, null);
        return f11;
    }

    public final void a(String fileName) {
        kotlin.jvm.internal.s.g(fileName, "fileName");
        File file = new File(this.f19048a.getFilesDir().toString(), fileName);
        if (file.exists()) {
            file.delete();
        }
    }
}