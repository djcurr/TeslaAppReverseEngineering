package com.drew.lang;

import java.io.PrintStream;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class CompoundException extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private final Throwable f11031a;

    public CompoundException(String str) {
        this(str, null);
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        if (this.f11031a != null) {
            printStream.println("--- inner exception ---");
            this.f11031a.printStackTrace(printStream);
        }
    }

    @Override // java.lang.Throwable
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        if (this.f11031a != null) {
            sb2.append("\n");
            sb2.append("--- inner exception ---");
            sb2.append("\n");
            sb2.append(this.f11031a.toString());
        }
        return sb2.toString();
    }

    public CompoundException(Throwable th2) {
        this(null, th2);
    }

    public CompoundException(String str, Throwable th2) {
        super(str);
        this.f11031a = th2;
    }

    @Override // java.lang.Throwable
    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        if (this.f11031a != null) {
            printWriter.println("--- inner exception ---");
            this.f11031a.printStackTrace(printWriter);
        }
    }

    @Override // java.lang.Throwable
    public void printStackTrace() {
        super.printStackTrace();
        if (this.f11031a != null) {
            System.err.println("--- inner exception ---");
            this.f11031a.printStackTrace();
        }
    }
}