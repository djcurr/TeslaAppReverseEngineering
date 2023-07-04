package com.nimbusds.jose.shaded.json.parser;

/* loaded from: classes2.dex */
public class ParseException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private Object f17958a;

    public ParseException(int i11, int i12, Object obj) {
        super(a(i11, i12, obj));
        this.f17958a = obj;
    }

    private static String a(int i11, int i12, Object obj) {
        StringBuilder sb2 = new StringBuilder();
        if (i12 == 0) {
            sb2.append("Unexpected character (");
            sb2.append(obj);
            sb2.append(") at position ");
            sb2.append(i11);
            sb2.append(".");
        } else if (i12 == 1) {
            sb2.append("Unexpected token ");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i11);
            sb2.append(".");
        } else if (i12 == 2) {
            sb2.append("Unexpected exception ");
            sb2.append(obj);
            sb2.append(" occur at position ");
            sb2.append(i11);
            sb2.append(".");
        } else if (i12 == 3) {
            sb2.append("Unexpected End Of File position ");
            sb2.append(i11);
            sb2.append(": ");
            sb2.append(obj);
        } else if (i12 == 4) {
            sb2.append("Unexpected unicode escape sequence ");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i11);
            sb2.append(".");
        } else if (i12 == 5) {
            sb2.append("Unexpected duplicate key:");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i11);
            sb2.append(".");
        } else if (i12 == 6) {
            sb2.append("Unexpected leading 0 in digit for token:");
            sb2.append(obj);
            sb2.append(" at position ");
            sb2.append(i11);
            sb2.append(".");
        } else {
            sb2.append("Unkown error at position ");
            sb2.append(i11);
            sb2.append(".");
        }
        return sb2.toString();
    }

    public ParseException(int i11, Throwable th2) {
        super(a(i11, 2, th2), th2);
    }
}