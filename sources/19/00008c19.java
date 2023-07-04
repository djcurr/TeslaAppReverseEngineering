package net.time4j.tz;

import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes5.dex */
final class SPX implements Externalizable {
    private static final long serialVersionUID = -1000776907354520172L;

    /* renamed from: a  reason: collision with root package name */
    private transient Object f41525a;

    /* renamed from: b  reason: collision with root package name */
    private transient int f41526b;

    public SPX() {
    }

    private Object a(ObjectInput objectInput, byte b11) {
        return new a((k) objectInput.readObject(), (l) objectInput.readObject());
    }

    private Object b(ObjectInput objectInput, byte b11) {
        return p.t(objectInput.readInt(), (b11 & 15) == 1 ? objectInput.readInt() : 0);
    }

    private Object c(byte b11) {
        int i11 = b11 & 15;
        return n.d(b.values()[i11 / 2], g.values()[i11 % 2]);
    }

    private Object d(ObjectInput objectInput, byte b11) {
        k kVar = (k) objectInput.readObject();
        m mVar = (m) objectInput.readObject();
        o oVar = l.f41537c;
        if ((b11 & 15) == 1) {
            oVar = (o) objectInput.readObject();
        }
        return new c(kVar, mVar, oVar);
    }

    private void e(ObjectOutput objectOutput) {
        a aVar = (a) this.f41525a;
        objectOutput.writeByte(192);
        objectOutput.writeObject(aVar.z());
        objectOutput.writeObject(aVar.R());
    }

    private void f(ObjectOutput objectOutput) {
        p pVar = (p) this.f41525a;
        boolean z11 = pVar.i() != 0;
        objectOutput.writeByte(z11 ? 241 : 240);
        objectOutput.writeInt(pVar.k());
        if (z11) {
            objectOutput.writeInt(pVar.i());
        }
    }

    private void g(ObjectOutput objectOutput) {
        objectOutput.writeByte(((n) this.f41525a).c() | 208);
    }

    private void h(ObjectOutput objectOutput) {
        c cVar = (c) this.f41525a;
        boolean z11 = cVar.E() != l.f41537c;
        objectOutput.writeByte(z11 ? 225 : 224);
        objectOutput.writeObject(cVar.z());
        objectOutput.writeObject(cVar.y());
        if (z11) {
            objectOutput.writeObject(cVar.E());
        }
    }

    private Object readResolve() {
        return this.f41525a;
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        switch ((readByte & 255) >> 4) {
            case 12:
                this.f41525a = a(objectInput, readByte);
                return;
            case 13:
                this.f41525a = c(readByte);
                return;
            case 14:
                this.f41525a = d(objectInput, readByte);
                return;
            case 15:
                this.f41525a = b(objectInput, readByte);
                return;
            default:
                throw new StreamCorruptedException("Unknown serialized type.");
        }
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput objectOutput) {
        switch (this.f41526b) {
            case 12:
                e(objectOutput);
                return;
            case 13:
                g(objectOutput);
                return;
            case 14:
                h(objectOutput);
                return;
            case 15:
                f(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SPX(Object obj, int i11) {
        this.f41525a = obj;
        this.f41526b = i11;
    }
}