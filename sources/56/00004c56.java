package com.stripe.android.cards;

import h00.a;
import h00.q;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.flow.e;
import vz.b0;
import vz.r;
import wz.e0;
import wz.w;
import y20.i;
import zz.d;

/* loaded from: classes2.dex */
public final class DefaultCardAccountRangeRepository implements CardAccountRangeRepository {
    private final CardAccountRangeSource inMemorySource;
    private final e<Boolean> loading;
    private final CardAccountRangeSource remoteSource;
    private final CardAccountRangeSource staticSource;
    private final CardAccountRangeStore store;

    public DefaultCardAccountRangeRepository(CardAccountRangeSource inMemorySource, CardAccountRangeSource remoteSource, CardAccountRangeSource staticSource, CardAccountRangeStore store) {
        List l11;
        List O0;
        s.g(inMemorySource, "inMemorySource");
        s.g(remoteSource, "remoteSource");
        s.g(staticSource, "staticSource");
        s.g(store, "store");
        this.inMemorySource = inMemorySource;
        this.remoteSource = remoteSource;
        this.staticSource = staticSource;
        this.store = store;
        l11 = w.l(inMemorySource.getLoading(), remoteSource.getLoading(), staticSource.getLoading());
        O0 = e0.O0(l11);
        Object[] array = O0.toArray(new e[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        final e[] eVarArr = (e[]) array;
        this.loading = new e<Boolean>() { // from class: com.stripe.android.cards.DefaultCardAccountRangeRepository$special$$inlined$combine$1

            /* renamed from: com.stripe.android.cards.DefaultCardAccountRangeRepository$special$$inlined$combine$1$2  reason: invalid class name */
            /* loaded from: classes2.dex */
            static final class AnonymousClass2 extends u implements a<Boolean[]> {
                final /* synthetic */ e[] $flowArray;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(e[] eVarArr) {
                    super(0);
                    this.$flowArray = eVarArr;
                }

                @Override // h00.a
                public final Boolean[] invoke() {
                    return new Boolean[this.$flowArray.length];
                }
            }

            @f(c = "com.stripe.android.cards.DefaultCardAccountRangeRepository$special$$inlined$combine$1$3", f = "DefaultCardAccountRangeRepository.kt", l = {333}, m = "invokeSuspend")
            /* renamed from: com.stripe.android.cards.DefaultCardAccountRangeRepository$special$$inlined$combine$1$3  reason: invalid class name */
            /* loaded from: classes2.dex */
            public static final class AnonymousClass3 extends l implements q<kotlinx.coroutines.flow.f<? super Boolean>, Boolean[], d<? super b0>, Object> {
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                public AnonymousClass3(d dVar) {
                    super(3, dVar);
                }

                @Override // h00.q
                public final Object invoke(kotlinx.coroutines.flow.f<? super Boolean> fVar, Boolean[] boolArr, d<? super b0> dVar) {
                    AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
                    anonymousClass3.L$0 = fVar;
                    anonymousClass3.L$1 = boolArr;
                    return anonymousClass3.invokeSuspend(b0.f54756a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object d11;
                    d11 = a00.d.d();
                    int i11 = this.label;
                    if (i11 == 0) {
                        r.b(obj);
                        kotlinx.coroutines.flow.f fVar = (kotlinx.coroutines.flow.f) this.L$0;
                        Boolean[] boolArr = (Boolean[]) ((Object[]) this.L$1);
                        int length = boolArr.length;
                        boolean z11 = false;
                        int i12 = 0;
                        while (true) {
                            if (i12 >= length) {
                                break;
                            } else if (boolArr[i12].booleanValue()) {
                                z11 = true;
                                break;
                            } else {
                                i12++;
                            }
                        }
                        Boolean a11 = b.a(z11);
                        this.label = 1;
                        if (fVar.emit(a11, this) == d11) {
                            return d11;
                        }
                    } else if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        r.b(obj);
                    }
                    return b0.f54756a;
                }
            }

            @Override // kotlinx.coroutines.flow.e
            public Object collect(kotlinx.coroutines.flow.f<? super Boolean> fVar, d dVar) {
                Object d11;
                e[] eVarArr2 = eVarArr;
                Object a11 = i.a(fVar, eVarArr2, new AnonymousClass2(eVarArr2), new AnonymousClass3(null), dVar);
                d11 = a00.d.d();
                return a11 == d11 ? a11 : b0.f54756a;
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    @Override // com.stripe.android.cards.CardAccountRangeRepository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getAccountRange(com.stripe.android.cards.CardNumber.Unvalidated r9, zz.d<? super com.stripe.android.model.AccountRange> r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRange$1
            if (r0 == 0) goto L13
            r0 = r10
            com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRange$1 r0 = (com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRange$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRange$1 r0 = new com.stripe.android.cards.DefaultCardAccountRangeRepository$getAccountRange$1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            java.lang.Object r1 = a00.b.d()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L60
            if (r2 == r6) goto L54
            if (r2 == r5) goto L48
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            vz.r.b(r10)
            goto Lb6
        L34:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3c:
            java.lang.Object r9 = r0.L$1
            com.stripe.android.cards.CardNumber$Unvalidated r9 = (com.stripe.android.cards.CardNumber.Unvalidated) r9
            java.lang.Object r2 = r0.L$0
            com.stripe.android.cards.DefaultCardAccountRangeRepository r2 = (com.stripe.android.cards.DefaultCardAccountRangeRepository) r2
            vz.r.b(r10)
            goto La3
        L48:
            java.lang.Object r9 = r0.L$1
            com.stripe.android.cards.CardNumber$Unvalidated r9 = (com.stripe.android.cards.CardNumber.Unvalidated) r9
            java.lang.Object r2 = r0.L$0
            com.stripe.android.cards.DefaultCardAccountRangeRepository r2 = (com.stripe.android.cards.DefaultCardAccountRangeRepository) r2
            vz.r.b(r10)
            goto L91
        L54:
            java.lang.Object r9 = r0.L$1
            com.stripe.android.cards.CardNumber$Unvalidated r9 = (com.stripe.android.cards.CardNumber.Unvalidated) r9
            java.lang.Object r2 = r0.L$0
            com.stripe.android.cards.DefaultCardAccountRangeRepository r2 = (com.stripe.android.cards.DefaultCardAccountRangeRepository) r2
            vz.r.b(r10)
            goto L7a
        L60:
            vz.r.b(r10)
            com.stripe.android.cards.Bin r10 = r9.getBin()
            if (r10 != 0) goto L6a
            goto Lb9
        L6a:
            com.stripe.android.cards.CardAccountRangeStore r2 = r8.store
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r6
            java.lang.Object r10 = r2.contains(r10, r0)
            if (r10 != r1) goto L79
            return r1
        L79:
            r2 = r8
        L7a:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L94
            com.stripe.android.cards.CardAccountRangeSource r10 = r2.inMemorySource
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r5
            java.lang.Object r10 = r10.getAccountRange(r9, r0)
            if (r10 != r1) goto L91
            return r1
        L91:
            com.stripe.android.model.AccountRange r10 = (com.stripe.android.model.AccountRange) r10
            goto La5
        L94:
            com.stripe.android.cards.CardAccountRangeSource r10 = r2.remoteSource
            r0.L$0 = r2
            r0.L$1 = r9
            r0.label = r4
            java.lang.Object r10 = r10.getAccountRange(r9, r0)
            if (r10 != r1) goto La3
            return r1
        La3:
            com.stripe.android.model.AccountRange r10 = (com.stripe.android.model.AccountRange) r10
        La5:
            if (r10 != 0) goto Lb8
            com.stripe.android.cards.CardAccountRangeSource r10 = r2.staticSource
            r0.L$0 = r7
            r0.L$1 = r7
            r0.label = r3
            java.lang.Object r10 = r10.getAccountRange(r9, r0)
            if (r10 != r1) goto Lb6
            return r1
        Lb6:
            com.stripe.android.model.AccountRange r10 = (com.stripe.android.model.AccountRange) r10
        Lb8:
            r7 = r10
        Lb9:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.cards.DefaultCardAccountRangeRepository.getAccountRange(com.stripe.android.cards.CardNumber$Unvalidated, zz.d):java.lang.Object");
    }

    @Override // com.stripe.android.cards.CardAccountRangeRepository
    public e<Boolean> getLoading() {
        return this.loading;
    }
}