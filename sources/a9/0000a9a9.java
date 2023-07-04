package p20;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import p20.b;

/* loaded from: classes5.dex */
public abstract class f implements p20.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f45911a;

    /* loaded from: classes5.dex */
    public static final class a extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final a f45912b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // p20.b
        public boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            s.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.J() != null;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends f {

        /* renamed from: b  reason: collision with root package name */
        public static final b f45913b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // p20.b
        public boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            s.g(functionDescriptor, "functionDescriptor");
            return (functionDescriptor.J() == null && functionDescriptor.N() == null) ? false : true;
        }
    }

    private f(String str) {
        this.f45911a = str;
    }

    public /* synthetic */ f(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // p20.b
    public String a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return b.a.a(this, eVar);
    }

    @Override // p20.b
    public String getDescription() {
        return this.f45911a;
    }
}