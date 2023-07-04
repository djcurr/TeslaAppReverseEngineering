package p20;

import java.util.Arrays;
import java.util.Collection;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.util.Check;
import p20.c;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    private final u10.f f45901a;

    /* renamed from: b  reason: collision with root package name */
    private final kotlin.text.i f45902b;

    /* renamed from: c  reason: collision with root package name */
    private final Collection<u10.f> f45903c;

    /* renamed from: d  reason: collision with root package name */
    private final h00.l<kotlin.reflect.jvm.internal.impl.descriptors.e, String> f45904d;

    /* renamed from: e  reason: collision with root package name */
    private final p20.b[] f45905e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends u implements h00.l {

        /* renamed from: a  reason: collision with root package name */
        public static final a f45906a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Void invoke(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            s.g(eVar, "$this$null");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends u implements h00.l {

        /* renamed from: a  reason: collision with root package name */
        public static final b f45907a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Void invoke(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            s.g(eVar, "$this$null");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends u implements h00.l {

        /* renamed from: a  reason: collision with root package name */
        public static final c f45908a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final Void invoke(kotlin.reflect.jvm.internal.impl.descriptors.e eVar) {
            s.g(eVar, "$this$null");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(u10.f fVar, kotlin.text.i iVar, Collection<u10.f> collection, h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String> lVar, Check... checkArr) {
        this.f45901a = fVar;
        this.f45902b = iVar;
        this.f45903c = collection;
        this.f45904d = lVar;
        this.f45905e = checkArr;
    }

    public final p20.c a(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        s.g(functionDescriptor, "functionDescriptor");
        p20.b[] bVarArr = this.f45905e;
        int length = bVarArr.length;
        int i11 = 0;
        while (i11 < length) {
            p20.b bVar = bVarArr[i11];
            i11++;
            String a11 = bVar.a(functionDescriptor);
            if (a11 != null) {
                return new c.b(a11);
            }
        }
        String invoke = this.f45904d.invoke(functionDescriptor);
        if (invoke != null) {
            return new c.b(invoke);
        }
        return c.C0977c.f45900b;
    }

    public final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.e functionDescriptor) {
        s.g(functionDescriptor, "functionDescriptor");
        if (this.f45901a == null || s.c(functionDescriptor.getName(), this.f45901a)) {
            if (this.f45902b != null) {
                String b11 = functionDescriptor.getName().b();
                s.f(b11, "functionDescriptor.name.asString()");
                if (!this.f45902b.g(b11)) {
                    return false;
                }
            }
            Collection<u10.f> collection = this.f45903c;
            return collection == null || collection.contains(functionDescriptor.getName());
        }
        return false;
    }

    public /* synthetic */ d(u10.f fVar, p20.b[] bVarArr, h00.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar, (Check[]) bVarArr, (h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String>) ((i11 & 4) != 0 ? a.f45906a : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(u10.f name, Check[] checks, h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String> additionalChecks) {
        this(name, (kotlin.text.i) null, (Collection<u10.f>) null, additionalChecks, (Check[]) ((p20.b[]) Arrays.copyOf(checks, checks.length)));
        s.g(name, "name");
        s.g(checks, "checks");
        s.g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ d(kotlin.text.i iVar, p20.b[] bVarArr, h00.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, (Check[]) bVarArr, (h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String>) ((i11 & 4) != 0 ? b.f45907a : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(kotlin.text.i regex, Check[] checks, h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String> additionalChecks) {
        this((u10.f) null, regex, (Collection<u10.f>) null, additionalChecks, (Check[]) ((p20.b[]) Arrays.copyOf(checks, checks.length)));
        s.g(regex, "regex");
        s.g(checks, "checks");
        s.g(additionalChecks, "additionalChecks");
    }

    public /* synthetic */ d(Collection collection, p20.b[] bVarArr, h00.l lVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((Collection<u10.f>) collection, (Check[]) bVarArr, (h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String>) ((i11 & 4) != 0 ? c.f45908a : lVar));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(Collection<u10.f> nameList, Check[] checks, h00.l<? super kotlin.reflect.jvm.internal.impl.descriptors.e, String> additionalChecks) {
        this((u10.f) null, (kotlin.text.i) null, nameList, additionalChecks, (Check[]) ((p20.b[]) Arrays.copyOf(checks, checks.length)));
        s.g(nameList, "nameList");
        s.g(checks, "checks");
        s.g(additionalChecks, "additionalChecks");
    }
}