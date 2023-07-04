package org.apache.commons.lang3.exception;

import y30.a;
import y30.b;

/* loaded from: classes5.dex */
public class ContextedRuntimeException extends RuntimeException implements b {

    /* renamed from: a  reason: collision with root package name */
    private final b f43006a = new a();

    @Override // y30.b
    public String a(String str) {
        return this.f43006a.a(str);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return a(super.getMessage());
    }
}