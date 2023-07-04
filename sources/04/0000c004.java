package xw;

import java.io.InputStream;
import java.io.Reader;
import ww.c;
import xw.b;

/* loaded from: classes5.dex */
public class b<T extends b<?>> extends a<T> {

    /* renamed from: g  reason: collision with root package name */
    private boolean f57760g;

    public b(InputStream inputStream) {
        super(inputStream);
        this.f57760g = true;
    }

    private zw.a d() {
        String str = this.f57754a;
        if (str != null) {
            return new zw.a(str);
        }
        InputStream inputStream = this.f57755b;
        if (inputStream != null) {
            return new zw.a(inputStream);
        }
        Reader reader = this.f57756c;
        if (reader != null) {
            return new zw.a(reader);
        }
        return new zw.a(this.f57757d);
    }

    @Override // xw.a
    c b() {
        zw.a d11 = d();
        d11.S0(this.f57760g);
        return d11;
    }
}