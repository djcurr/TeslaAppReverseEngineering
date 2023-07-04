package e30;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
public abstract class j {

    /* loaded from: classes5.dex */
    public static final class a extends j {

        /* renamed from: a  reason: collision with root package name */
        public static final a f24588a = new a();

        private a() {
            super(null);
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends j {

        /* renamed from: a  reason: collision with root package name */
        public static final b f24589a = new b();

        private b() {
            super(null);
        }
    }

    private j() {
    }

    public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        String o11 = m0.b(getClass()).o();
        s.e(o11);
        return o11;
    }
}