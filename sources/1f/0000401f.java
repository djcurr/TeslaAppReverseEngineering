package com.plaid.internal.core.crashreporting.internal.models;

import ch.qos.logback.core.CoreConstants;
import com.plaid.internal.g4;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import wz.e0;

/* loaded from: classes2.dex */
public final class ExceptionInterface {
    public static final Companion Companion = new Companion(null);
    public static final String EXCEPTION_INTERFACE = "sentry.interfaces.Exception";
    private final Queue<ExceptionModel> values;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ExceptionInterface(Throwable throwable) {
        this(ExceptionModel.Companion.extractExceptionQueue(throwable));
        s.g(throwable, "throwable");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !s.c(ExceptionInterface.class, obj.getClass())) {
            return false;
        }
        return s.c(this.values, ((ExceptionInterface) obj).values);
    }

    public final String getInterfaceName() {
        return EXCEPTION_INTERFACE;
    }

    public int hashCode() {
        return this.values.hashCode();
    }

    public String toString() {
        StringBuilder a11 = g4.a("ExceptionInterface{exceptions=");
        a11.append(this.values);
        a11.append(CoreConstants.CURLY_RIGHT);
        return a11.toString();
    }

    private ExceptionInterface(Queue<ExceptionModel> queue) {
        List<ExceptionModel> A0;
        A0 = e0.A0(queue);
        LinkedList linkedList = new LinkedList();
        for (ExceptionModel exceptionModel : A0) {
            linkedList.add(exceptionModel);
        }
        this.values = linkedList;
    }
}