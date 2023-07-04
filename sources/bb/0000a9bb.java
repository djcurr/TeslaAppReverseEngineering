package p20;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import p20.b;

/* loaded from: classes5.dex */
public abstract class l implements p20.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f45957a;

    /* loaded from: classes5.dex */
    public static final class a extends l {

        /* renamed from: b  reason: collision with root package name */
        private final int f45958b;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public a(int r3) {
            /*
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "must have at least "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r1 = " value parameter"
                r0.append(r1)
                r1 = 1
                if (r3 <= r1) goto L18
                java.lang.String r1 = "s"
                goto L1a
            L18:
                java.lang.String r1 = ""
            L1a:
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r1 = 0
                r2.<init>(r0, r1)
                r2.f45958b = r3
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p20.l.a.<init>(int):void");
        }

        @Override // p20.b
        public boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            s.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.h().size() >= this.f45958b;
        }
    }

    /* loaded from: classes5.dex */
    public static final class b extends l {

        /* renamed from: b  reason: collision with root package name */
        private final int f45959b;

        public b(int i11) {
            super("must have exactly " + i11 + " value parameters", null);
            this.f45959b = i11;
        }

        @Override // p20.b
        public boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            s.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.h().size() == this.f45959b;
        }
    }

    /* loaded from: classes5.dex */
    public static final class c extends l {

        /* renamed from: b  reason: collision with root package name */
        public static final c f45960b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // p20.b
        public boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            s.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.h().isEmpty();
        }
    }

    /* loaded from: classes5.dex */
    public static final class d extends l {

        /* renamed from: b  reason: collision with root package name */
        public static final d f45961b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // p20.b
        public boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
            s.g(functionDescriptor, "functionDescriptor");
            return functionDescriptor.h().size() == 1;
        }
    }

    private l(String str) {
        this.f45957a = str;
    }

    public /* synthetic */ l(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Override // p20.b
    public String a(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
        return b.a.a(this, eVar);
    }

    @Override // p20.b
    public String getDescription() {
        return this.f45957a;
    }
}