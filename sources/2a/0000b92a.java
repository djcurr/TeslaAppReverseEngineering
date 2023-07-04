package v30;

import java.io.Serializable;
import java.io.Writer;

/* loaded from: classes5.dex */
public class a extends Writer implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    private final StringBuilder f54032a;

    public a() {
        this.f54032a = new StringBuilder();
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
    }

    public String toString() {
        return this.f54032a.toString();
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str != null) {
            this.f54032a.append(str);
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i11, int i12) {
        if (cArr != null) {
            this.f54032a.append(cArr, i11, i12);
        }
    }

    public a(int i11) {
        this.f54032a = new StringBuilder(i11);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c11) {
        this.f54032a.append(c11);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence) {
        this.f54032a.append(charSequence);
        return this;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(CharSequence charSequence, int i11, int i12) {
        this.f54032a.append(charSequence, i11, i12);
        return this;
    }
}