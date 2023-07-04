package h30;

import com.adyen.checkout.components.model.payments.request.Address;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private final h30.a f28792a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f28793b;

    /* renamed from: c  reason: collision with root package name */
    private int f28794c;

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.serialization.json.internal.JsonTreeReader$readDeepRecursive$1", f = "JsonTreeReader.kt", l = {112}, m = "invokeSuspend")
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.k implements h00.q<vz.c<vz.b0, JsonElement>, vz.b0, zz.d<? super JsonElement>, Object> {

        /* renamed from: b  reason: collision with root package name */
        int f28795b;

        /* renamed from: c  reason: collision with root package name */
        private /* synthetic */ Object f28796c;

        a(zz.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // h00.q
        /* renamed from: e */
        public final Object invoke(vz.c<vz.b0, JsonElement> cVar, vz.b0 b0Var, zz.d<? super JsonElement> dVar) {
            a aVar = new a(dVar);
            aVar.f28796c = cVar;
            return aVar.invokeSuspend(vz.b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object d11;
            d11 = a00.d.d();
            int i11 = this.f28795b;
            if (i11 == 0) {
                vz.r.b(obj);
                vz.c cVar = (vz.c) this.f28796c;
                byte D = a0.this.f28792a.D();
                if (D == 1) {
                    return a0.this.j(true);
                }
                if (D == 0) {
                    return a0.this.j(false);
                }
                if (D != 6) {
                    if (D == 8) {
                        return a0.this.f();
                    }
                    h30.a.x(a0.this.f28792a, "Can't begin reading element, unexpected token", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                a0 a0Var = a0.this;
                this.f28795b = 1;
                obj = a0Var.h(cVar, this);
                if (obj == d11) {
                    return d11;
                }
            } else if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                vz.r.b(obj);
            }
            return (JsonElement) obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @kotlin.coroutines.jvm.internal.f(c = "kotlinx.serialization.json.internal.JsonTreeReader", f = "JsonTreeReader.kt", l = {23}, m = "readObject")
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* renamed from: a  reason: collision with root package name */
        Object f28798a;

        /* renamed from: b  reason: collision with root package name */
        Object f28799b;

        /* renamed from: c  reason: collision with root package name */
        Object f28800c;

        /* renamed from: d  reason: collision with root package name */
        Object f28801d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f28802e;

        /* renamed from: g  reason: collision with root package name */
        int f28804g;

        b(zz.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f28802e = obj;
            this.f28804g |= Integer.MIN_VALUE;
            return a0.this.h(null, this);
        }
    }

    public a0(kotlinx.serialization.json.e configuration, h30.a lexer) {
        kotlin.jvm.internal.s.g(configuration, "configuration");
        kotlin.jvm.internal.s.g(lexer, "lexer");
        this.f28792a = lexer;
        this.f28793b = configuration.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonElement f() {
        int i11;
        byte l11 = this.f28792a.l();
        if (this.f28792a.D() != 4) {
            ArrayList arrayList = new ArrayList();
            while (this.f28792a.f()) {
                arrayList.add(e());
                l11 = this.f28792a.l();
                if (l11 != 4) {
                    h30.a aVar = this.f28792a;
                    boolean z11 = l11 == 9;
                    i11 = aVar.f28788a;
                    if (!z11) {
                        h30.a.x(aVar, "Expected end of the array or comma", i11, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (l11 == 8) {
                this.f28792a.m((byte) 9);
            } else if (l11 == 4) {
                h30.a.x(this.f28792a, "Unexpected trailing comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return new JsonArray(arrayList);
        }
        h30.a.x(this.f28792a, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final JsonElement g() {
        return (JsonElement) vz.b.b(new vz.a(new a(null)), vz.b0.f54756a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x009c -> B:27:0x00a6). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(vz.c<vz.b0, kotlinx.serialization.json.JsonElement> r21, zz.d<? super kotlinx.serialization.json.JsonElement> r22) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: h30.a0.h(vz.c, zz.d):java.lang.Object");
    }

    private final JsonElement i() {
        byte m11 = this.f28792a.m((byte) 6);
        if (this.f28792a.D() != 4) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (true) {
                if (!this.f28792a.f()) {
                    break;
                }
                String r11 = this.f28793b ? this.f28792a.r() : this.f28792a.p();
                this.f28792a.m((byte) 5);
                linkedHashMap.put(r11, e());
                m11 = this.f28792a.l();
                if (m11 != 4) {
                    if (m11 != 7) {
                        h30.a.x(this.f28792a, "Expected end of the object or comma", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
            }
            if (m11 == 6) {
                this.f28792a.m((byte) 7);
            } else if (m11 == 4) {
                h30.a.x(this.f28792a, "Unexpected trailing comma", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            return new JsonObject(linkedHashMap);
        }
        h30.a.x(this.f28792a, "Unexpected leading comma", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonPrimitive j(boolean z11) {
        String r11;
        if (!this.f28793b && z11) {
            r11 = this.f28792a.p();
        } else {
            r11 = this.f28792a.r();
        }
        return (z11 || !kotlin.jvm.internal.s.c(r11, Address.ADDRESS_NULL_PLACEHOLDER)) ? new kotlinx.serialization.json.n(r11, z11) : JsonNull.f35610a;
    }

    public final JsonElement e() {
        JsonElement i11;
        byte D = this.f28792a.D();
        if (D == 1) {
            return j(true);
        }
        if (D == 0) {
            return j(false);
        }
        if (D == 6) {
            int i12 = this.f28794c + 1;
            this.f28794c = i12;
            if (i12 == 200) {
                i11 = g();
            } else {
                i11 = i();
            }
            this.f28794c--;
            return i11;
        } else if (D == 8) {
            return f();
        } else {
            h30.a.x(this.f28792a, "Cannot begin reading element, unexpected token: " + ((int) D), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
    }
}