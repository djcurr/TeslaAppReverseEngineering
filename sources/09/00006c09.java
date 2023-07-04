package ezvcard.io;

import ezvcard.a;

/* loaded from: classes5.dex */
public class CannotParseException extends RuntimeException {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f25384a;

    /* renamed from: b  reason: collision with root package name */
    private final Object[] f25385b;

    public CannotParseException() {
        this(null);
    }

    public Object[] a() {
        return this.f25385b;
    }

    public Integer b() {
        return this.f25384a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return a.INSTANCE.getParseMessage(this.f25384a.intValue(), this.f25385b);
    }

    public CannotParseException(int i11, Object... objArr) {
        this.f25384a = Integer.valueOf(i11);
        this.f25385b = objArr;
    }

    public CannotParseException(String str) {
        this(25, str);
    }
}