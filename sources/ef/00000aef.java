package atd.q;

import android.content.Context;
import atd.i.b;

/* loaded from: classes.dex */
public abstract class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final String f6912a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6913b;

    /* renamed from: c  reason: collision with root package name */
    private EnumC0126a f6914c;

    /* renamed from: atd.q.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    protected enum EnumC0126a {
        STRING,
        FLOAT,
        INTEGER,
        LONG
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public a(String str, String str2) {
        this(str, str2, EnumC0126a.STRING);
    }

    @Override // atd.i.b
    public String a() {
        return this.f6912a;
    }

    public a b() {
        this.f6914c = EnumC0126a.FLOAT;
        return this;
    }

    protected abstract Object b(Context context);

    public a c() {
        this.f6914c = EnumC0126a.INTEGER;
        return this;
    }

    public a d() {
        this.f6914c = EnumC0126a.LONG;
        return this;
    }

    public String e() {
        return this.f6913b;
    }

    public EnumC0126a f() {
        return this.f6914c;
    }

    private a(String str, String str2, EnumC0126a enumC0126a) {
        this.f6912a = str;
        this.f6913b = str2;
        this.f6914c = enumC0126a;
    }

    @Override // atd.i.b
    public Object a(Context context) {
        return b(context);
    }
}