package com.google.firebase.crashlytics.internal.common;

import am.a0;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;
import org.spongycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes3.dex */
class u implements y {

    /* renamed from: a  reason: collision with root package name */
    private final File f16600a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16601b;

    /* renamed from: c  reason: collision with root package name */
    private final String f16602c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u(String str, String str2, File file) {
        this.f16601b = str;
        this.f16602c = str2;
        this.f16600a = file;
    }

    private byte[] c() {
        byte[] bArr = new byte[PKIFailureInfo.certRevoked];
        try {
            InputStream f11 = f();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            if (f11 == null) {
                gZIPOutputStream.close();
                byteArrayOutputStream.close();
                if (f11 != null) {
                    f11.close();
                }
                return null;
            }
            while (true) {
                try {
                    int read = f11.read(bArr);
                    if (read > 0) {
                        gZIPOutputStream.write(bArr, 0, read);
                    } else {
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        f11.close();
                        return byteArray;
                    }
                } catch (Throwable th2) {
                    try {
                        gZIPOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.common.y
    public a0.d.b a() {
        byte[] c11 = c();
        if (c11 != null) {
            return a0.d.b.a().b(c11).c(this.f16601b).a();
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.y
    public String b() {
        return this.f16602c;
    }

    @Override // com.google.firebase.crashlytics.internal.common.y
    public InputStream f() {
        if (this.f16600a.exists() && this.f16600a.isFile()) {
            try {
                return new FileInputStream(this.f16600a);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }
}