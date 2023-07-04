package t00;

import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import wz.x0;

/* loaded from: classes5.dex */
public enum i {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");
    
    public static final a Companion = new a(null);
    public static final Set<i> NUMBER_TYPES;
    private final vz.k arrayTypeFqName$delegate;
    private final u10.f arrayTypeName;
    private final vz.k typeFqName$delegate;
    private final u10.f typeName;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends u implements h00.a<u10.c> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final u10.c invoke() {
            u10.c c11 = k.f51317l.c(i.this.getArrayTypeName());
            s.f(c11, "BUILT_INS_PACKAGE_FQ_NAME.child(arrayTypeName)");
            return c11;
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends u implements h00.a<u10.c> {
        c() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final u10.c invoke() {
            u10.c c11 = k.f51317l.c(i.this.getTypeName());
            s.f(c11, "BUILT_INS_PACKAGE_FQ_NAME.child(this.typeName)");
            return c11;
        }
    }

    static {
        i iVar;
        i iVar2;
        i iVar3;
        i iVar4;
        i iVar5;
        i iVar6;
        Set<i> i11;
        i11 = x0.i(r0, iVar, iVar2, iVar3, iVar4, iVar5, iVar6);
        NUMBER_TYPES = i11;
    }

    i(String str) {
        vz.k b11;
        vz.k b12;
        u10.f f11 = u10.f.f(str);
        s.f(f11, "identifier(typeName)");
        this.typeName = f11;
        u10.f f12 = u10.f.f(s.p(str, "Array"));
        s.f(f12, "identifier(\"${typeName}Array\")");
        this.arrayTypeName = f12;
        kotlin.b bVar = kotlin.b.PUBLICATION;
        b11 = vz.m.b(bVar, new c());
        this.typeFqName$delegate = b11;
        b12 = vz.m.b(bVar, new b());
        this.arrayTypeFqName$delegate = b12;
    }

    public final u10.c getArrayTypeFqName() {
        return (u10.c) this.arrayTypeFqName$delegate.getValue();
    }

    public final u10.f getArrayTypeName() {
        return this.arrayTypeName;
    }

    public final u10.c getTypeFqName() {
        return (u10.c) this.typeFqName$delegate.getValue();
    }

    public final u10.f getTypeName() {
        return this.typeName;
    }
}