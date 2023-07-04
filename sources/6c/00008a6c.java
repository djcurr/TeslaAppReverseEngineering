package net.time4j;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Map;
import net.time4j.engine.j0;
import net.time4j.l;

/* loaded from: classes5.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = 1;

    /* renamed from: a  reason: collision with root package name */
    private transient Object f40788a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f40789b;

    public SPX() {
    }

    private g0 a(DataInput dataInput, byte b11) {
        int readByte;
        int i11 = b11 & 15;
        byte readByte2 = dataInput.readByte();
        int i12 = (readByte2 >> 5) & 3;
        int i13 = readByte2 & 31;
        if (i12 == 1) {
            readByte = dataInput.readByte() + 1850 + 128;
        } else if (i12 == 2) {
            readByte = dataInput.readShort();
        } else if (i12 == 3) {
            readByte = dataInput.readInt();
        } else {
            throw new StreamCorruptedException("Unknown year range.");
        }
        return g0.U0(readByte, c0.valueOf(i11), i13);
    }

    private Object b(ObjectInput objectInput, byte b11) {
        Locale locale;
        boolean z11 = (b11 & 1) == 1;
        if ((b11 & 2) == 2) {
            return new l.b(z11, l.s((Map) objectInput.readObject()));
        }
        String readUTF = objectInput.readUTF();
        String readUTF2 = objectInput.readUTF();
        int indexOf = readUTF.indexOf("-");
        if (indexOf == -1) {
            locale = new Locale(readUTF);
        } else {
            locale = new Locale(readUTF.substring(0, indexOf), readUTF.substring(indexOf + 1));
        }
        return new l.b(z11, locale, readUTF2);
    }

    private Object c(ObjectInput objectInput, byte b11) {
        boolean z11 = (b11 & 15) == 1;
        int readInt = objectInput.readInt();
        if (readInt == 0) {
            return o.i();
        }
        ArrayList arrayList = new ArrayList(readInt);
        for (int i11 = 0; i11 < readInt; i11++) {
            arrayList.add(j0.a.c(z11 ? objectInput.readLong() : objectInput.readInt(), (x) objectInput.readObject()));
        }
        return new o(arrayList, objectInput.readBoolean());
    }

    private Object d(ObjectInput objectInput, byte b11) {
        m30.f fVar = (b11 & 1) == 1 ? m30.f.UTC : m30.f.POSIX;
        long readLong = objectInput.readLong();
        int readInt = (b11 & 2) == 2 ? objectInput.readInt() : 0;
        if (fVar == m30.f.UTC) {
            return z.k(readLong, readInt);
        }
        return z.i(readLong, readInt);
    }

    private Object e(DataInput dataInput, byte b11) {
        return b0.o0(dataInput, (b11 & 1) != 0, ((b11 & 2) >>> 1) != 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    private h0 f(DataInput dataInput) {
        int readInt;
        byte readByte = dataInput.readByte();
        if (readByte < 0) {
            return h0.K0(~readByte);
        }
        int readByte2 = dataInput.readByte();
        byte b11 = 0;
        if (readByte2 < 0) {
            readByte2 = ~readByte2;
            readInt = 0;
        } else {
            byte readByte3 = dataInput.readByte();
            if (readByte3 < 0) {
                b11 = ~readByte3;
                readInt = 0;
            } else {
                readInt = dataInput.readInt();
                b11 = readByte3;
            }
        }
        return h0.N0(readByte, readByte2, b11, readInt);
    }

    private Object g(DataInput dataInput, byte b11) {
        return i0.Z(a(dataInput, b11), f(dataInput));
    }

    private Object h(DataInput dataInput, byte b11) {
        byte readByte = dataInput.readByte();
        x0 valueOf = x0.valueOf(readByte >> 4);
        int i11 = readByte & 15;
        x0 x0Var = x0.SATURDAY;
        x0 x0Var2 = x0.SUNDAY;
        if ((b11 & 15) == 1) {
            byte readByte2 = dataInput.readByte();
            x0Var = x0.valueOf(readByte2 >> 4);
            x0Var2 = x0.valueOf(readByte2 & 15);
        }
        return z0.l(valueOf, i11, x0Var, x0Var2);
    }

    private void i(DataOutput dataOutput) {
        j((g0) this.f40788a, 1, dataOutput);
    }

    private static void j(g0 g0Var, int i11, DataOutput dataOutput) {
        int i12;
        int year = g0Var.getYear();
        if (year < 1850 || year > 2100) {
            i12 = Math.abs(year) < 10000 ? 2 : 3;
        } else {
            i12 = 1;
        }
        dataOutput.writeByte((i11 << 4) | g0Var.getMonth());
        dataOutput.writeByte(g0Var.n() | (i12 << 5));
        if (i12 == 1) {
            dataOutput.writeByte((year - 1850) - 128);
        } else if (i12 == 2) {
            dataOutput.writeShort(year);
        } else {
            dataOutput.writeInt(year);
        }
    }

    private void k(ObjectOutput objectOutput) {
        l.b bVar = (l.b) l.b.class.cast(this.f40788a);
        Locale v11 = bVar.v();
        int i11 = bVar.z() ? 113 : 112;
        if (v11 == null) {
            i11 |= 2;
        }
        objectOutput.writeByte(i11);
        if (v11 == null) {
            objectOutput.writeObject(bVar.s());
            return;
        }
        String language = v11.getLanguage();
        if (!v11.getCountry().isEmpty()) {
            language = language + "-" + v11.getCountry();
        }
        objectOutput.writeUTF(language);
        objectOutput.writeUTF(bVar.p());
    }

    private void l(ObjectOutput objectOutput) {
        boolean z11;
        o oVar = (o) o.class.cast(this.f40788a);
        int size = oVar.b().size();
        int min = Math.min(size, 6);
        int i11 = 0;
        while (true) {
            if (i11 >= min) {
                z11 = false;
                break;
            } else if (((j0.a) oVar.b().get(i11)).a() >= 1000) {
                z11 = true;
                break;
            } else {
                i11++;
            }
        }
        objectOutput.writeByte(z11 ? 97 : 96);
        objectOutput.writeInt(size);
        for (int i12 = 0; i12 < size; i12++) {
            j0.a aVar = (j0.a) oVar.b().get(i12);
            if (z11) {
                objectOutput.writeLong(aVar.a());
            } else {
                objectOutput.writeInt((int) aVar.a());
            }
            objectOutput.writeObject(aVar.b());
        }
        if (size > 0) {
            objectOutput.writeBoolean(oVar.a());
        }
    }

    private void m(ObjectOutput objectOutput) {
        z zVar = (z) z.class.cast(this.f40788a);
        int i11 = zVar.g() == m30.f.UTC ? 81 : 80;
        if (zVar.f() == 0) {
            objectOutput.writeByte(i11);
            objectOutput.writeLong(zVar.h());
            return;
        }
        objectOutput.writeByte(i11 | 2);
        objectOutput.writeLong(zVar.h());
        objectOutput.writeInt(zVar.f());
    }

    private void n(DataOutput dataOutput) {
        ((b0) this.f40788a).y0(dataOutput);
    }

    private void o(DataOutput dataOutput) {
        dataOutput.writeByte(32);
        p((h0) this.f40788a, dataOutput);
    }

    private static void p(h0 h0Var, DataOutput dataOutput) {
        if (h0Var.a() == 0) {
            if (h0Var.j() == 0) {
                if (h0Var.m() == 0) {
                    dataOutput.writeByte(~h0Var.p());
                    return;
                }
                dataOutput.writeByte(h0Var.p());
                dataOutput.writeByte(~h0Var.m());
                return;
            }
            dataOutput.writeByte(h0Var.p());
            dataOutput.writeByte(h0Var.m());
            dataOutput.writeByte(~h0Var.j());
            return;
        }
        dataOutput.writeByte(h0Var.p());
        dataOutput.writeByte(h0Var.m());
        dataOutput.writeByte(h0Var.j());
        dataOutput.writeInt(h0Var.a());
    }

    private void q(DataOutput dataOutput) {
        i0 i0Var = (i0) this.f40788a;
        j(i0Var.T(), 8, dataOutput);
        p(i0Var.V(), dataOutput);
    }

    private void r(DataOutput dataOutput) {
        z0 z0Var = (z0) this.f40788a;
        boolean z11 = z0Var.h() == x0.SATURDAY && z0Var.e() == x0.SUNDAY;
        dataOutput.writeByte(z11 ? 48 : 49);
        dataOutput.writeByte((z0Var.f().getValue() << 4) | z0Var.g());
        if (z11) {
            return;
        }
        dataOutput.writeByte(z0Var.e().getValue() | (z0Var.h().getValue() << 4));
    }

    private Object readResolve() {
        return this.f40788a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        switch ((readByte & 255) >> 4) {
            case 1:
                this.f40788a = a(objectInput, readByte);
                return;
            case 2:
                this.f40788a = f(objectInput);
                return;
            case 3:
                this.f40788a = h(objectInput, readByte);
                return;
            case 4:
                this.f40788a = e(objectInput, readByte);
                return;
            case 5:
                this.f40788a = d(objectInput, readByte);
                return;
            case 6:
                this.f40788a = c(objectInput, readByte);
                return;
            case 7:
                this.f40788a = b(objectInput, readByte);
                return;
            case 8:
                this.f40788a = g(objectInput, readByte);
                return;
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        switch (this.f40789b) {
            case 1:
                i(objectOutput);
                return;
            case 2:
                o(objectOutput);
                return;
            case 3:
                r(objectOutput);
                return;
            case 4:
                n(objectOutput);
                return;
            case 5:
                m(objectOutput);
                return;
            case 6:
                l(objectOutput);
                return;
            case 7:
                k(objectOutput);
                return;
            case 8:
                q(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SPX(Object obj, int i11) {
        this.f40788a = obj;
        this.f40789b = i11;
    }
}