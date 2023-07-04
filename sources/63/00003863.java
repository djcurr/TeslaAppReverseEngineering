package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.r1;
import com.google.crypto.tink.shaded.protobuf.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class r extends q<y.d> {

    /* loaded from: classes3.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f16376a;

        static {
            int[] iArr = new int[r1.b.values().length];
            f16376a = iArr;
            try {
                iArr[r1.b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16376a[r1.b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16376a[r1.b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16376a[r1.b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16376a[r1.b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16376a[r1.b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16376a[r1.b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16376a[r1.b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16376a[r1.b.UINT32.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16376a[r1.b.SFIXED32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16376a[r1.b.SFIXED64.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16376a[r1.b.SINT32.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16376a[r1.b.SINT64.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f16376a[r1.b.ENUM.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f16376a[r1.b.BYTES.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f16376a[r1.b.STRING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f16376a[r1.b.GROUP.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f16376a[r1.b.MESSAGE.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.q
    public int a(Map.Entry<?, ?> entry) {
        return ((y.d) entry.getKey()).getNumber();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.q
    public Object b(p pVar, q0 q0Var, int i11) {
        return pVar.a(q0Var, i11);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.q
    public u<y.d> c(Object obj) {
        return ((y.c) obj).extensions;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.q
    public u<y.d> d(Object obj) {
        return ((y.c) obj).C();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.q
    public boolean e(q0 q0Var) {
        return q0Var instanceof y.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void f(Object obj) {
        c(obj).s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.q
    public <UT, UB> UB g(e1 e1Var, Object obj, p pVar, u<y.d> uVar, UB ub2, l1<UT, UB> l1Var) {
        Object i11;
        ArrayList arrayList;
        y.e eVar = (y.e) obj;
        int c11 = eVar.c();
        if (eVar.f16431b.isRepeated() && eVar.f16431b.isPacked()) {
            switch (a.f16376a[eVar.a().ordinal()]) {
                case 1:
                    arrayList = new ArrayList();
                    e1Var.readDoubleList(arrayList);
                    break;
                case 2:
                    arrayList = new ArrayList();
                    e1Var.readFloatList(arrayList);
                    break;
                case 3:
                    arrayList = new ArrayList();
                    e1Var.readInt64List(arrayList);
                    break;
                case 4:
                    arrayList = new ArrayList();
                    e1Var.readUInt64List(arrayList);
                    break;
                case 5:
                    arrayList = new ArrayList();
                    e1Var.readInt32List(arrayList);
                    break;
                case 6:
                    arrayList = new ArrayList();
                    e1Var.readFixed64List(arrayList);
                    break;
                case 7:
                    arrayList = new ArrayList();
                    e1Var.readFixed32List(arrayList);
                    break;
                case 8:
                    arrayList = new ArrayList();
                    e1Var.readBoolList(arrayList);
                    break;
                case 9:
                    arrayList = new ArrayList();
                    e1Var.readUInt32List(arrayList);
                    break;
                case 10:
                    arrayList = new ArrayList();
                    e1Var.readSFixed32List(arrayList);
                    break;
                case 11:
                    arrayList = new ArrayList();
                    e1Var.readSFixed64List(arrayList);
                    break;
                case 12:
                    arrayList = new ArrayList();
                    e1Var.readSInt32List(arrayList);
                    break;
                case 13:
                    arrayList = new ArrayList();
                    e1Var.readSInt64List(arrayList);
                    break;
                case 14:
                    arrayList = new ArrayList();
                    e1Var.readEnumList(arrayList);
                    ub2 = (UB) h1.z(c11, arrayList, eVar.f16431b.b(), ub2, l1Var);
                    break;
                default:
                    throw new IllegalStateException("Type cannot be packed: " + eVar.f16431b.getLiteType());
            }
            uVar.w(eVar.f16431b, arrayList);
        } else {
            Object obj2 = null;
            if (eVar.a() == r1.b.ENUM) {
                int readInt32 = e1Var.readInt32();
                if (eVar.f16431b.b().findValueByNumber(readInt32) == null) {
                    return (UB) h1.L(c11, readInt32, ub2, l1Var);
                }
                obj2 = Integer.valueOf(readInt32);
            } else {
                switch (a.f16376a[eVar.a().ordinal()]) {
                    case 1:
                        obj2 = Double.valueOf(e1Var.readDouble());
                        break;
                    case 2:
                        obj2 = Float.valueOf(e1Var.readFloat());
                        break;
                    case 3:
                        obj2 = Long.valueOf(e1Var.readInt64());
                        break;
                    case 4:
                        obj2 = Long.valueOf(e1Var.readUInt64());
                        break;
                    case 5:
                        obj2 = Integer.valueOf(e1Var.readInt32());
                        break;
                    case 6:
                        obj2 = Long.valueOf(e1Var.readFixed64());
                        break;
                    case 7:
                        obj2 = Integer.valueOf(e1Var.readFixed32());
                        break;
                    case 8:
                        obj2 = Boolean.valueOf(e1Var.readBool());
                        break;
                    case 9:
                        obj2 = Integer.valueOf(e1Var.readUInt32());
                        break;
                    case 10:
                        obj2 = Integer.valueOf(e1Var.readSFixed32());
                        break;
                    case 11:
                        obj2 = Long.valueOf(e1Var.readSFixed64());
                        break;
                    case 12:
                        obj2 = Integer.valueOf(e1Var.readSInt32());
                        break;
                    case 13:
                        obj2 = Long.valueOf(e1Var.readSInt64());
                        break;
                    case 14:
                        throw new IllegalStateException("Shouldn't reach here.");
                    case 15:
                        obj2 = e1Var.readBytes();
                        break;
                    case 16:
                        obj2 = e1Var.readString();
                        break;
                    case 17:
                        obj2 = e1Var.b(eVar.b().getClass(), pVar);
                        break;
                    case 18:
                        obj2 = e1Var.f(eVar.b().getClass(), pVar);
                        break;
                }
            }
            if (eVar.d()) {
                uVar.a(eVar.f16431b, obj2);
            } else {
                int i12 = a.f16376a[eVar.a().ordinal()];
                if ((i12 == 17 || i12 == 18) && (i11 = uVar.i(eVar.f16431b)) != null) {
                    obj2 = a0.h(i11, obj2);
                }
                uVar.w(eVar.f16431b, obj2);
            }
        }
        return ub2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void h(e1 e1Var, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        uVar.w(eVar.f16431b, e1Var.f(eVar.b().getClass(), pVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void i(i iVar, Object obj, p pVar, u<y.d> uVar) {
        y.e eVar = (y.e) obj;
        q0 buildPartial = eVar.b().newBuilderForType().buildPartial();
        f h11 = f.h(ByteBuffer.wrap(iVar.t()), true);
        b1.a().b(buildPartial, h11, pVar);
        uVar.w(eVar.f16431b, buildPartial);
        if (h11.getFieldNumber() != Integer.MAX_VALUE) {
            throw InvalidProtocolBufferException.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.crypto.tink.shaded.protobuf.q
    public void j(s1 s1Var, Map.Entry<?, ?> entry) {
        y.d dVar = (y.d) entry.getKey();
        if (dVar.isRepeated()) {
            switch (a.f16376a[dVar.getLiteType().ordinal()]) {
                case 1:
                    h1.P(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 2:
                    h1.T(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 3:
                    h1.W(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 4:
                    h1.e0(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 5:
                    h1.V(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 6:
                    h1.S(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 7:
                    h1.R(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 8:
                    h1.N(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 9:
                    h1.d0(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 10:
                    h1.Y(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 11:
                    h1.Z(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 12:
                    h1.a0(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 13:
                    h1.b0(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 14:
                    h1.V(dVar.getNumber(), (List) entry.getValue(), s1Var, dVar.isPacked());
                    return;
                case 15:
                    h1.O(dVar.getNumber(), (List) entry.getValue(), s1Var);
                    return;
                case 16:
                    h1.c0(dVar.getNumber(), (List) entry.getValue(), s1Var);
                    return;
                case 17:
                    List list = (List) entry.getValue();
                    if (list == null || list.isEmpty()) {
                        return;
                    }
                    h1.U(dVar.getNumber(), (List) entry.getValue(), s1Var, b1.a().d(list.get(0).getClass()));
                    return;
                case 18:
                    List list2 = (List) entry.getValue();
                    if (list2 == null || list2.isEmpty()) {
                        return;
                    }
                    h1.X(dVar.getNumber(), (List) entry.getValue(), s1Var, b1.a().d(list2.get(0).getClass()));
                    return;
                default:
                    return;
            }
        }
        switch (a.f16376a[dVar.getLiteType().ordinal()]) {
            case 1:
                s1Var.writeDouble(dVar.getNumber(), ((Double) entry.getValue()).doubleValue());
                return;
            case 2:
                s1Var.writeFloat(dVar.getNumber(), ((Float) entry.getValue()).floatValue());
                return;
            case 3:
                s1Var.writeInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 4:
                s1Var.writeUInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 5:
                s1Var.writeInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 6:
                s1Var.writeFixed64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 7:
                s1Var.writeFixed32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 8:
                s1Var.writeBool(dVar.getNumber(), ((Boolean) entry.getValue()).booleanValue());
                return;
            case 9:
                s1Var.writeUInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 10:
                s1Var.writeSFixed32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 11:
                s1Var.writeSFixed64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 12:
                s1Var.writeSInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 13:
                s1Var.writeSInt64(dVar.getNumber(), ((Long) entry.getValue()).longValue());
                return;
            case 14:
                s1Var.writeInt32(dVar.getNumber(), ((Integer) entry.getValue()).intValue());
                return;
            case 15:
                s1Var.d(dVar.getNumber(), (i) entry.getValue());
                return;
            case 16:
                s1Var.writeString(dVar.getNumber(), (String) entry.getValue());
                return;
            case 17:
                s1Var.b(dVar.getNumber(), entry.getValue(), b1.a().d(entry.getValue().getClass()));
                return;
            case 18:
                s1Var.e(dVar.getNumber(), entry.getValue(), b1.a().d(entry.getValue().getClass()));
                return;
            default:
                return;
        }
    }
}