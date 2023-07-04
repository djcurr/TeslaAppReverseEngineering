package com.plaid.internal;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class fb {

    /* loaded from: classes2.dex */
    public static final class a extends fb {

        /* renamed from: a  reason: collision with root package name */
        public final String f18592a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String receivedRedirectUri) {
            super(null);
            kotlin.jvm.internal.s.g(receivedRedirectUri, "receivedRedirectUri");
            this.f18592a = receivedRedirectUri;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends fb {

        /* renamed from: a  reason: collision with root package name */
        public final Exception f18593a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exception) {
            super(null);
            kotlin.jvm.internal.s.g(exception, "exception");
            this.f18593a = exception;
        }
    }

    public fb() {
    }

    public /* synthetic */ fb(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}