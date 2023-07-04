package xw;

import ezvcard.VCard;
import java.io.File;
import java.io.InputStream;
import java.io.Reader;
import java.util.List;
import ww.c;
import xw.a;
import yw.s0;

/* loaded from: classes5.dex */
public abstract class a<T extends a<?>> {

    /* renamed from: a */
    final String f57754a;

    /* renamed from: b */
    final InputStream f57755b;

    /* renamed from: c */
    final Reader f57756c;

    /* renamed from: d */
    final File f57757d;

    /* renamed from: e */
    s0 f57758e;

    /* renamed from: f */
    List<List<ww.b>> f57759f;

    public a(InputStream inputStream) {
        this(null, inputStream, null, null);
    }

    private boolean a() {
        return this.f57755b == null && this.f57756c == null;
    }

    abstract c b();

    public VCard c() {
        c b11 = b();
        s0 s0Var = this.f57758e;
        if (s0Var != null) {
            b11.m(s0Var);
        }
        try {
            VCard l11 = b11.l();
            List<List<ww.b>> list = this.f57759f;
            if (list != null) {
                list.add(b11.j());
            }
            return l11;
        } finally {
            if (a()) {
                b11.close();
            }
        }
    }

    private a(String str, InputStream inputStream, Reader reader, File file) {
        this.f57754a = str;
        this.f57755b = inputStream;
        this.f57756c = reader;
        this.f57757d = file;
    }
}