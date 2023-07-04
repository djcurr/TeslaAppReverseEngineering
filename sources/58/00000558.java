package androidx.constraintlayout.core.parser;

/* loaded from: classes.dex */
public class CLParsingException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final String f3356a;

    /* renamed from: b  reason: collision with root package name */
    private final int f3357b;

    /* renamed from: c  reason: collision with root package name */
    private final String f3358c;

    public String a() {
        return this.f3356a + " (" + this.f3358c + " at line " + this.f3357b + ")";
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + a();
    }
}