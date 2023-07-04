package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

/* loaded from: classes.dex */
final class f0 extends Writer {

    /* renamed from: a  reason: collision with root package name */
    private final String f4860a;

    /* renamed from: b  reason: collision with root package name */
    private StringBuilder f4861b = new StringBuilder(128);

    /* JADX INFO: Access modifiers changed from: package-private */
    public f0(String str) {
        this.f4860a = str;
    }

    private void a() {
        if (this.f4861b.length() > 0) {
            Log.d(this.f4860a, this.f4861b.toString());
            StringBuilder sb2 = this.f4861b;
            sb2.delete(0, sb2.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            char c11 = cArr[i11 + i13];
            if (c11 == '\n') {
                a();
            } else {
                this.f4861b.append(c11);
            }
        }
    }
}