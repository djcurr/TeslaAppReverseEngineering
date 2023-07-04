package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class d1 implements o0 {

    /* renamed from: a  reason: collision with root package name */
    private final q0 f16248a;

    /* renamed from: b  reason: collision with root package name */
    private final String f16249b;

    /* renamed from: c  reason: collision with root package name */
    private final Object[] f16250c;

    /* renamed from: d  reason: collision with root package name */
    private final int f16251d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d1(q0 q0Var, String str, Object[] objArr) {
        this.f16248a = q0Var;
        this.f16249b = str;
        this.f16250c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f16251d = charAt;
            return;
        }
        int i11 = charAt & 8191;
        int i12 = 13;
        int i13 = 1;
        while (true) {
            int i14 = i13 + 1;
            char charAt2 = str.charAt(i13);
            if (charAt2 < 55296) {
                this.f16251d = i11 | (charAt2 << i12);
                return;
            }
            i11 |= (charAt2 & 8191) << i12;
            i12 += 13;
            i13 = i14;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] a() {
        return this.f16250c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String b() {
        return this.f16249b;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public q0 getDefaultInstance() {
        return this.f16248a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public a1 getSyntax() {
        return (this.f16251d & 1) == 1 ? a1.PROTO2 : a1.PROTO3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.o0
    public boolean isMessageSetWireFormat() {
        return (this.f16251d & 2) == 2;
    }
}