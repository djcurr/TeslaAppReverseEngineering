package com.plaid.internal.core.crashreporting.internal.models;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.core.crashreporting.internal.models.StackTraceElement;
import com.plaid.internal.g4;
import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.text.v;
import kotlin.text.w;
import wz.p;

/* loaded from: classes2.dex */
public final class ExceptionModel implements Serializable {
    public static final Companion Companion = new Companion(null);
    public static final String DEFAULT_PACKAGE_NAME = "(default)";
    private final String module;
    private final StackTraceInterface stacktrace;
    private final String type;
    private final String value;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Queue<ExceptionModel> extractExceptionQueue(Throwable th2) {
            LinkedList linkedList = new LinkedList();
            HashSet hashSet = new HashSet();
            Throwable th3 = th2;
            while (th3 != null && hashSet.add(th3)) {
                linkedList.add(new ExceptionModel(th3));
                th3 = th2 == null ? null : th2.getCause();
            }
            return linkedList;
        }
    }

    public ExceptionModel(Throwable throwable) {
        java.lang.StackTraceElement[] stackTraceArray;
        s.g(throwable, "throwable");
        Package r02 = throwable.getClass().getPackage();
        String fullClassName = throwable.getClass().getName();
        this.value = throwable.getMessage();
        if (r02 != null) {
            s.f(fullClassName, "fullClassName");
            fullClassName = v.D(fullClassName, s.p(r02.getName(), "."), "", false, 4, null);
        } else {
            s.f(fullClassName, "fullClassName");
        }
        this.type = fullClassName;
        String canonicalName = throwable.getClass().getCanonicalName();
        this.module = canonicalName == null ? null : w.v0(canonicalName, s.p(".", throwable.getClass().getSimpleName()));
        try {
            stackTraceArray = throwable.getStackTrace();
            s.f(stackTraceArray, "");
            p.d0(stackTraceArray);
        } catch (NullPointerException e11) {
            stackTraceArray = e11.getStackTrace();
        }
        StackTraceElement.Companion companion = StackTraceElement.Companion;
        s.f(stackTraceArray, "stackTraceArray");
        this.stacktrace = new StackTraceInterface(companion.fromStackTraceElements(stackTraceArray));
    }

    public boolean equals(Object obj) {
        boolean z11 = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || !s.c(ExceptionModel.class, obj.getClass())) {
            return false;
        }
        ExceptionModel exceptionModel = (ExceptionModel) obj;
        if (s.c(this.type, exceptionModel.type)) {
            String str = this.value;
            if (str == null ? exceptionModel.value != null : !s.c(str, exceptionModel.value)) {
                return false;
            }
            String str2 = this.module;
            if (str2 == null ? exceptionModel.module == null : s.c(str2, exceptionModel.module)) {
                z11 = false;
            }
            if (z11) {
                return false;
            }
            return s.c(this.stacktrace, exceptionModel.stacktrace);
        }
        return false;
    }

    public int hashCode() {
        String str = this.value;
        int hashCode = (this.type.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        String str2 = this.module;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder a11 = g4.a("SentryException{value='");
        a11.append((Object) this.value);
        a11.append("', type='");
        a11.append(this.type);
        a11.append("', module='");
        a11.append((Object) this.module);
        a11.append("', stackTraceInterface=");
        a11.append(this.stacktrace);
        a11.append(CoreConstants.CURLY_RIGHT);
        return a11.toString();
    }
}