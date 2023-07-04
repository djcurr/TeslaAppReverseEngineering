package com.facebook.soloader;

import android.content.Context;
import com.facebook.soloader.s;
import java.io.File;
import java.io.FileInputStream;

/* loaded from: classes3.dex */
public final class i extends s {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public final class b extends s.g {

        /* renamed from: a  reason: collision with root package name */
        private final c[] f12907a;

        /* loaded from: classes3.dex */
        private final class a extends s.e {

            /* renamed from: a  reason: collision with root package name */
            private int f12908a;

            private a() {
            }

            @Override // com.facebook.soloader.s.e
            public boolean a() {
                return this.f12908a < b.this.f12907a.length;
            }

            @Override // com.facebook.soloader.s.e
            public s.d g() {
                c[] cVarArr = b.this.f12907a;
                int i11 = this.f12908a;
                this.f12908a = i11 + 1;
                c cVar = cVarArr[i11];
                FileInputStream fileInputStream = new FileInputStream(cVar.f12910c);
                try {
                    return new s.f(cVar, fileInputStream);
                } catch (Throwable th2) {
                    fileInputStream.close();
                    throw th2;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x00dc, code lost:
            throw new java.lang.RuntimeException("illegal line in exopackage metadata: [" + r10 + "]");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        b(com.facebook.soloader.i r17, com.facebook.soloader.s r18) {
            /*
                Method dump skipped, instructions count: 289
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.i.b.<init>(com.facebook.soloader.i, com.facebook.soloader.s):void");
        }

        @Override // com.facebook.soloader.s.g
        public s.c a() {
            return new s.c(this.f12907a);
        }

        @Override // com.facebook.soloader.s.g
        public s.e g() {
            return new a();
        }
    }

    /* loaded from: classes3.dex */
    private static final class c extends s.b {

        /* renamed from: c  reason: collision with root package name */
        final File f12910c;

        c(String str, String str2, File file) {
            super(str, str2);
            this.f12910c = file;
        }
    }

    public i(Context context, String str) {
        super(context, str);
    }

    @Override // com.facebook.soloader.s
    protected s.g s(byte b11) {
        return new b(this, this);
    }
}