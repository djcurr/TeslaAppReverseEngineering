package com.plaid.internal.core.crashreporting.internal.models;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class StackTraceInterface {
    public static final Companion Companion = new Companion(null);
    public static final String STACKTRACE_INTERFACE = "sentry.interfaces.Stacktrace";
    private final StackTraceElement[] frames;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public StackTraceInterface(StackTraceElement[] stackTrace) {
        s.g(stackTrace, "stackTrace");
        Object[] copyOf = Arrays.copyOf(stackTrace, stackTrace.length);
        s.f(copyOf, "copyOf(this, size)");
        this.frames = (StackTraceElement[]) copyOf;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !s.c(StackTraceInterface.class, obj.getClass())) {
            return false;
        }
        return Arrays.equals(this.frames, ((StackTraceInterface) obj).frames);
    }

    public int hashCode() {
        return Arrays.hashCode(this.frames);
    }

    public String toString() {
        StringBuilder a11 = g4.a("StackTraceInterface{frames=");
        a11.append((Object) Arrays.toString(this.frames));
        a11.append(CoreConstants.CURLY_RIGHT);
        return a11.toString();
    }
}