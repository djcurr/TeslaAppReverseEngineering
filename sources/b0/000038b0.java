package com.google.firebase.crashlytics.internal.common;

import am.a0;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* loaded from: classes3.dex */
class e implements y {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f16485a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16486b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16487c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(String str, String str2, byte[] bArr) {
        this.f16486b = str;
        this.f16487c = str2;
        this.f16485a = bArr;
    }

    private byte[] c() {
        if (d()) {
            return null;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f16485a);
                gZIPOutputStream.finish();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                return byteArray;
            } catch (Throwable th2) {
                try {
                    gZIPOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    private boolean d() {
        byte[] bArr = this.f16485a;
        return bArr == null || bArr.length == 0;
    }

    @Override // com.google.firebase.crashlytics.internal.common.y
    public a0.d.b a() {
        byte[] c11 = c();
        if (c11 == null) {
            return null;
        }
        return a0.d.b.a().b(c11).c(this.f16486b).a();
    }

    @Override // com.google.firebase.crashlytics.internal.common.y
    public String b() {
        return this.f16487c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.y
    public InputStream f() {
        if (d()) {
            return null;
        }
        return new ByteArrayInputStream(this.f16485a);
    }
}