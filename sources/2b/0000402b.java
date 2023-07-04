package com.plaid.internal.core.networking.models;

import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class NetworkException extends Throwable {

    /* renamed from: c  reason: collision with root package name */
    public static final a f18276c = new a();

    /* renamed from: a  reason: collision with root package name */
    public final String f18277a;

    /* renamed from: b  reason: collision with root package name */
    public final String f18278b;

    /* loaded from: classes2.dex */
    public static final class a {
    }

    public NetworkException(String title, String message) {
        s.g(title, "title");
        s.g(message, "message");
        this.f18277a = title;
        this.f18278b = message;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f18278b;
    }
}