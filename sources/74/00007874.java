package io.realm.internal;

import io.realm.RealmFieldType;
import io.realm.f0;
import io.realm.internal.core.NativeRealmAny;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.UUID;
import org.bson.types.Decimal128;
import org.bson.types.ObjectId;

/* loaded from: classes5.dex */
public class k implements o {

    /* renamed from: a  reason: collision with root package name */
    private OsSharedRealm f31941a;

    /* renamed from: b  reason: collision with root package name */
    private OsResults f31942b;

    /* renamed from: c  reason: collision with root package name */
    private f0<k> f31943c;

    /* renamed from: d  reason: collision with root package name */
    private WeakReference<a> f31944d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f31945e;

    /* loaded from: classes5.dex */
    public interface a {
        void a(o oVar);
    }

    private void a() {
        this.f31942b.q(this, this.f31943c);
        this.f31942b = null;
        this.f31943c = null;
        this.f31941a.removePendingRow(this);
    }

    private void c() {
        WeakReference<a> weakReference = this.f31944d;
        if (weakReference != null) {
            a aVar = weakReference.get();
            if (aVar == null) {
                a();
                return;
            } else if (this.f31942b.n()) {
                UncheckedRow h11 = this.f31942b.h();
                a();
                if (h11 != null) {
                    if (this.f31945e) {
                        h11 = CheckedRow.e(h11);
                    }
                    aVar.a(h11);
                    return;
                }
                aVar.a(f.INSTANCE);
                return;
            } else {
                a();
                return;
            }
        }
        throw new IllegalStateException("The 'frontEnd' has not been set.");
    }

    public void b() {
        if (this.f31942b != null) {
            c();
            return;
        }
        throw new IllegalStateException("The query has been executed. This 'PendingRow' is not valid anymore.");
    }

    @Override // io.realm.internal.o
    public byte[] getBinaryByteArray(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public boolean getBoolean(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public long getColumnKey(String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public String[] getColumnNames() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public RealmFieldType getColumnType(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public Date getDate(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public Decimal128 getDecimal128(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public double getDouble(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public float getFloat(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public long getLong(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public OsList getModelList(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public OsMap getModelMap(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public OsSet getModelSet(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public NativeRealmAny getNativeRealmAny(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public ObjectId getObjectId(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public long getObjectKey() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public String getString(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public Table getTable() {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public UUID getUUID(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public OsList getValueList(long j11, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public OsMap getValueMap(long j11, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public OsSet getValueSet(long j11, RealmFieldType realmFieldType) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public boolean isNull(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public boolean isNullLink(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public boolean isValid() {
        return false;
    }

    @Override // io.realm.internal.o
    public void setBinaryByteArray(long j11, byte[] bArr) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public void setNull(long j11) {
        throw new IllegalStateException("The pending query has not been executed.");
    }

    @Override // io.realm.internal.o
    public void setString(long j11, String str) {
        throw new IllegalStateException("The pending query has not been executed.");
    }
}