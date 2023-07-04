package com.plaid.internal.core.crashreporting.internal.models;

import ch.qos.logback.core.CoreConstants;
import com.plaid.BuildConfig;
import com.plaid.internal.g4;
import com.plaid.internal.wa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.w;

/* loaded from: classes2.dex */
public final class StackTraceElement {
    public static final Companion Companion = new Companion(null);
    private final String filename;
    private final String function;
    private final Boolean in_app;
    private final int lineno;
    private final String module;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final StackTraceElement fromStackTraceElement(java.lang.StackTraceElement stackTraceElement) {
            boolean M;
            String className = stackTraceElement.getClassName();
            s.f(className, "stackTraceElement.className");
            String methodName = stackTraceElement.getMethodName();
            s.f(methodName, "stackTraceElement.methodName");
            String fileName = stackTraceElement.getFileName();
            int lineNumber = stackTraceElement.getLineNumber();
            String className2 = stackTraceElement.getClassName();
            s.f(className2, "stackTraceElement.className");
            M = w.M(className2, BuildConfig.LIBRARY_PACKAGE_NAME, false, 2, null);
            return new StackTraceElement(className, methodName, fileName, lineNumber, Boolean.valueOf(M));
        }

        public final StackTraceElement[] fromStackTraceElements(java.lang.StackTraceElement[] stackTraceElements) {
            s.g(stackTraceElements, "stackTraceElements");
            ArrayList arrayList = new ArrayList(stackTraceElements.length);
            wa.a aVar = wa.f19678a;
            wa.f19679b.c(s.p("Sentry stack trace elements size:  ", Integer.valueOf(arrayList.size())), Arrays.copyOf(new Object[0], 0), true);
            int length = stackTraceElements.length;
            int i11 = 0;
            while (i11 < length) {
                int i12 = i11 + 1;
                java.lang.StackTraceElement stackTraceElement = stackTraceElements[i11];
                if (stackTraceElement != null) {
                    arrayList.add(fromStackTraceElement(stackTraceElement));
                }
                i11 = i12;
            }
            Object[] array = arrayList.toArray(new StackTraceElement[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return (StackTraceElement[]) array;
        }
    }

    public StackTraceElement(String module, String function, String str, int i11, Boolean bool) {
        s.g(module, "module");
        s.g(function, "function");
        this.module = module;
        this.function = function;
        this.filename = str;
        this.lineno = i11;
        this.in_app = bool;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !s.c(StackTraceElement.class, obj.getClass())) {
            return false;
        }
        StackTraceElement stackTraceElement = (StackTraceElement) obj;
        return this.lineno == stackTraceElement.lineno && s.c(this.module, stackTraceElement.module) && s.c(this.function, stackTraceElement.function) && s.c(this.filename, stackTraceElement.filename) && s.c(this.in_app, stackTraceElement.in_app);
    }

    public int hashCode() {
        return Objects.hash(this.module, this.function, this.filename, Integer.valueOf(this.lineno));
    }

    public String toString() {
        StringBuilder a11 = g4.a("SentryStackTraceElement{module='");
        a11.append(this.module);
        a11.append("', function='");
        a11.append(this.function);
        a11.append("', filename='");
        a11.append((Object) this.filename);
        a11.append("', lineno=");
        a11.append(this.lineno);
        a11.append(", in_app=");
        a11.append(this.in_app);
        a11.append(CoreConstants.CURLY_RIGHT);
        return a11.toString();
    }

    public /* synthetic */ StackTraceElement(String str, String str2, String str3, int i11, Boolean bool, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, i11, (i12 & 16) != 0 ? Boolean.FALSE : bool);
    }
}