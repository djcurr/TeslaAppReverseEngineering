package com.plaid.internal;

import ch.qos.logback.core.CoreConstants;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes2.dex */
public abstract class f7<T, U> {

    /* loaded from: classes2.dex */
    public static final class a<U> extends f7 {

        /* renamed from: a  reason: collision with root package name */
        public final U f18584a;

        /* renamed from: b  reason: collision with root package name */
        public final int f18585b;

        public a(U u11, int i11) {
            super(null);
            this.f18584a = u11;
            this.f18585b = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return kotlin.jvm.internal.s.c(this.f18584a, aVar.f18584a) && this.f18585b == aVar.f18585b;
            }
            return false;
        }

        public int hashCode() {
            U u11 = this.f18584a;
            return Integer.hashCode(this.f18585b) + ((u11 == null ? 0 : u11.hashCode()) * 31);
        }

        public String toString() {
            StringBuilder a11 = g4.a("HttpError(body=");
            a11.append(this.f18584a);
            a11.append(", code=");
            a11.append(this.f18585b);
            a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return a11.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends f7 {

        /* renamed from: a  reason: collision with root package name */
        public final IOException f18586a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IOException error) {
            super(null);
            kotlin.jvm.internal.s.g(error, "error");
            this.f18586a = error;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.s.c(this.f18586a, ((b) obj).f18586a);
        }

        public int hashCode() {
            return this.f18586a.hashCode();
        }

        public String toString() {
            StringBuilder a11 = g4.a("NetworkError(error=");
            a11.append(this.f18586a);
            a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return a11.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class c<T> extends f7 {

        /* renamed from: a  reason: collision with root package name */
        public final T f18587a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(T body) {
            super(null);
            kotlin.jvm.internal.s.g(body, "body");
            this.f18587a = body;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.s.c(this.f18587a, ((c) obj).f18587a);
        }

        public int hashCode() {
            return this.f18587a.hashCode();
        }

        public String toString() {
            StringBuilder a11 = g4.a("Success(body=");
            a11.append(this.f18587a);
            a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return a11.toString();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends f7 {

        /* renamed from: a  reason: collision with root package name */
        public final Throwable f18588a;

        public d(Throwable th2) {
            super(null);
            this.f18588a = th2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.s.c(this.f18588a, ((d) obj).f18588a);
        }

        public int hashCode() {
            Throwable th2 = this.f18588a;
            if (th2 == null) {
                return 0;
            }
            return th2.hashCode();
        }

        public String toString() {
            StringBuilder a11 = g4.a("UnknownError(error=");
            a11.append(this.f18588a);
            a11.append(CoreConstants.RIGHT_PARENTHESIS_CHAR);
            return a11.toString();
        }
    }

    public f7() {
    }

    public /* synthetic */ f7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a() {
        return !(this instanceof c);
    }
}