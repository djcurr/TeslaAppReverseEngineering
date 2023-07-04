package freemarker.core;

import freemarker.template.Template;

/* loaded from: classes5.dex */
public abstract class l {

    /* renamed from: a  reason: collision with root package name */
    private Template f26885a;

    /* renamed from: b  reason: collision with root package name */
    int f26886b;

    /* renamed from: c  reason: collision with root package name */
    int f26887c;

    public abstract String a();

    public final String b() {
        return a();
    }

    public Template c() {
        return this.f26885a;
    }

    public String toString() {
        String str;
        try {
            str = b();
        } catch (Exception unused) {
            str = null;
        }
        return str != null ? str : a();
    }
}