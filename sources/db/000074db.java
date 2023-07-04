package i7;

import h00.p;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import v20.o0;
import vz.b0;
import vz.r;

/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    @f(c = "com.adyen.checkout.components.repository.PublicKeyRepository", f = "PublicKeyRepository.kt", l = {39}, m = "fetchPublicKey")
    /* renamed from: i7.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0580a extends d {

        /* renamed from: a  reason: collision with root package name */
        Object f30173a;

        /* renamed from: b  reason: collision with root package name */
        Object f30174b;

        /* renamed from: c  reason: collision with root package name */
        int f30175c;

        /* renamed from: d  reason: collision with root package name */
        int f30176d;

        /* renamed from: e  reason: collision with root package name */
        /* synthetic */ Object f30177e;

        /* renamed from: g  reason: collision with root package name */
        int f30179g;

        C0580a(zz.d<? super C0580a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f30177e = obj;
            this.f30179g |= Integer.MIN_VALUE;
            return a.this.a(null, null, this);
        }
    }

    @f(c = "com.adyen.checkout.components.api.ConnectionExtKt$suspendedCall$2", f = "ConnectionExt.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends l implements p<o0, zz.d<? super String>, Object> {

        /* renamed from: a  reason: collision with root package name */
        int f30180a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ com.adyen.checkout.core.api.b f30181b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.adyen.checkout.core.api.b bVar, zz.d dVar) {
            super(2, dVar);
            this.f30181b = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final zz.d<b0> create(Object obj, zz.d<?> dVar) {
            return new b(this.f30181b, dVar);
        }

        @Override // h00.p
        public final Object invoke(o0 o0Var, zz.d<? super String> dVar) {
            return ((b) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a00.d.d();
            if (this.f30180a == 0) {
                r.b(obj);
                return this.f30181b.call();
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0083 -> B:33:0x009c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x008e -> B:32:0x0093). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.adyen.checkout.core.api.d r10, java.lang.String r11, zz.d<? super java.lang.String> r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof i7.a.C0580a
            if (r0 == 0) goto L13
            r0 = r12
            i7.a$a r0 = (i7.a.C0580a) r0
            int r1 = r0.f30179g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f30179g = r1
            goto L18
        L13:
            i7.a$a r0 = new i7.a$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f30177e
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.f30179g
            r3 = 1
            if (r2 == 0) goto L41
            if (r2 != r3) goto L39
            int r10 = r0.f30176d
            int r11 = r0.f30175c
            java.lang.Object r2 = r0.f30174b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r0.f30173a
            com.adyen.checkout.core.api.d r4 = (com.adyen.checkout.core.api.d) r4
            vz.r.b(r12)     // Catch: org.json.JSONException -> L35 java.io.IOException -> L37
            goto L7c
        L35:
            r12 = move-exception
            goto L83
        L37:
            r12 = move-exception
            goto L93
        L39:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L41:
            vz.r.b(r12)
            java.lang.String r12 = i7.b.a()
            java.lang.String r2 = "fetching publicKey from API"
            o7.b.a(r12, r2)
            r12 = 3
            r2 = 0
            r8 = r11
            r11 = r10
            r10 = r12
            r12 = r8
        L53:
            if (r2 >= r10) goto La1
            java.lang.Integer r4 = kotlin.coroutines.jvm.internal.b.c(r2)
            r4.intValue()
            d7.h r4 = new d7.h     // Catch: org.json.JSONException -> L7d java.io.IOException -> L8d
            r4.<init>(r11, r12)     // Catch: org.json.JSONException -> L7d java.io.IOException -> L8d
            v20.j0 r5 = v20.e1.b()     // Catch: org.json.JSONException -> L7d java.io.IOException -> L8d
            i7.a$b r6 = new i7.a$b     // Catch: org.json.JSONException -> L7d java.io.IOException -> L8d
            r7 = 0
            r6.<init>(r4, r7)     // Catch: org.json.JSONException -> L7d java.io.IOException -> L8d
            r0.f30173a = r11     // Catch: org.json.JSONException -> L7d java.io.IOException -> L8d
            r0.f30174b = r12     // Catch: org.json.JSONException -> L7d java.io.IOException -> L8d
            r0.f30175c = r2     // Catch: org.json.JSONException -> L7d java.io.IOException -> L8d
            r0.f30176d = r10     // Catch: org.json.JSONException -> L7d java.io.IOException -> L8d
            r0.f30179g = r3     // Catch: org.json.JSONException -> L7d java.io.IOException -> L8d
            java.lang.Object r12 = v20.i.g(r5, r6, r0)     // Catch: org.json.JSONException -> L7d java.io.IOException -> L8d
            if (r12 != r1) goto L7c
            return r1
        L7c:
            return r12
        L7d:
            r4 = move-exception
            r8 = r4
            r4 = r11
            r11 = r2
            r2 = r12
            r12 = r8
        L83:
            java.lang.String r5 = i7.b.a()
            java.lang.String r6 = "PublicKeyConnection unexpected result"
            o7.b.d(r5, r6, r12)
            goto L9c
        L8d:
            r4 = move-exception
            r8 = r4
            r4 = r11
            r11 = r2
            r2 = r12
            r12 = r8
        L93:
            java.lang.String r5 = i7.b.a()
            java.lang.String r6 = "PublicKeyConnection Failed"
            o7.b.d(r5, r6, r12)
        L9c:
            r12 = r2
            int r2 = r11 + 1
            r11 = r4
            goto L53
        La1:
            com.adyen.checkout.core.exception.CheckoutException r10 = new com.adyen.checkout.core.exception.CheckoutException
            java.lang.String r11 = "Unable to fetch public key"
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i7.a.a(com.adyen.checkout.core.api.d, java.lang.String, zz.d):java.lang.Object");
    }
}